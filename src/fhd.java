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

public record fhd(ajv c, float d, float e, fhd.a f, String g) implements fha {
   private static final Codec<String> h = awu.a(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fhd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajv.a.fieldOf("file").forGetter(fhd::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fhd::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fhd::e),
               fhd.a.b.optionalFieldOf("shift", fhd.a.a).forGetter(fhd::f),
               h.optionalFieldOf("skip", "").forGetter(fhd::g)
            )
            .apply($$0, fhd::new)
   );

   @Override
   public fhb a() {
      return fhb.b;
   }

   @Override
   public Either<fha.b, fha.c> b() {
      return Either.left(this::a);
   }

   private euu a(ate $$0) throws IOException {
      FT_Face $$1 = null;
      ByteBuffer $$2 = null;

      try {
         eux var14;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            MemoryStack $$4 = MemoryStack.stackPush();

            try {
               PointerBuffer $$5 = $$4.mallocPointer(1);
               fgz.a(FreeType.FT_New_Memory_Face(fgz.a(), $$2, 0L, $$5), "Initializing font face");
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

            fgz.a(FreeType.FT_Select_Charmap($$1, FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
            var14 = new eux($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
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
      public static final fhd.a a = new fhd.a(0.0F, 0.0F);
      public static final Codec<fhd.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new fhd.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
