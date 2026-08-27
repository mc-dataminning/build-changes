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

public record fij(akh c, float d, float e, fij.a f, String g) implements fig {
   private static final Codec<String> h = axh.a(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fij> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akh.a.fieldOf("file").forGetter(fij::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fij::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fij::e),
               fij.a.b.optionalFieldOf("shift", fij.a.a).forGetter(fij::f),
               h.optionalFieldOf("skip", "").forGetter(fij::g)
            )
            .apply($$0, fij::new)
   );

   @Override
   public fih a() {
      return fih.b;
   }

   @Override
   public Either<fig.b, fig.c> b() {
      return Either.left(this::a);
   }

   private ewa a(atr $$0) throws IOException {
      FT_Face $$1 = null;
      ByteBuffer $$2 = null;

      try {
         ewd var14;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            MemoryStack $$4 = MemoryStack.stackPush();

            try {
               PointerBuffer $$5 = $$4.mallocPointer(1);
               fif.a(FreeType.FT_New_Memory_Face(fif.a(), $$2, 0L, $$5), "Initializing font face");
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

            fif.a(FreeType.FT_Select_Charmap($$1, FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
            var14 = new ewd($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
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
      public static final fij.a a = new fij.a(0.0F, 0.0F);
      public static final Codec<fij.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new fij.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
