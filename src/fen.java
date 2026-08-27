import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;

public record fen(ajh c, float d, float e, fen.a f, String g) implements fek {
   private static final Codec<String> h = awe.a(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fen> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajh.a.fieldOf("file").forGetter(fen::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fen::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fen::e),
               fen.a.b.optionalFieldOf("shift", fen.a.a).forGetter(fen::f),
               h.optionalFieldOf("skip", "").forGetter(fen::g)
            )
            .apply($$0, fen::new)
   );

   @Override
   public fel a() {
      return fel.b;
   }

   @Override
   public Either<fek.b, fek.c> b() {
      return Either.left(this::a);
   }

   private ese a(aso $$0) throws IOException {
      FT_Face $$1 = null;
      ByteBuffer $$2 = null;

      try {
         esh var14;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            MemoryStack $$4 = MemoryStack.stackPush();

            try {
               PointerBuffer $$5 = $$4.mallocPointer(1);
               fej.a(FreeType.FT_New_Memory_Face(fej.a(), $$2, 0L, $$5), "Initializing font face");
               $$1 = FT_Face.create($$5.get());
            } catch (Throwable var10) {
               if ($$4 != null) {
                  try {
                     $$4.close();
                  } catch (Throwable var9) {
                     var10.addSuppressed(var9);
                  }
               }

               throw var10;
            }

            if ($$4 != null) {
               $$4.close();
            }

            String $$6 = FreeType.FT_Get_Font_Format($$1);
            if (!"TrueType".equals($$6)) {
               throw new IOException("Font is not in TTF format, was " + $$6);
            }

            fej.a(FreeType.FT_Select_Charmap($$1, FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
            var14 = new esh($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
         }

         return var14;
      } catch (Exception var12) {
         if ($$1 != null) {
            FreeType.FT_Done_Face($$1);
         }

         MemoryUtil.memFree($$2);
         throw var12;
      }
   }

   public static record a(float c, float d) {
      public static final fen.a a = new fen.a(0.0F, 0.0F);
      public static final Codec<fen.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new fen.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
