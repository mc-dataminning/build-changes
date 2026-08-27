import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryUtil;

public record fah(ahg c, float d, float e, fah.a f, String g) implements fae {
   private static final Codec<String> h = atv.a(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahg.a.fieldOf("file").forGetter(fah::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fah::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fah::e),
               fah.a.b.optionalFieldOf("shift", fah.a.a).forGetter(fah::f),
               h.optionalFieldOf("skip", "").forGetter(fah::g)
            )
            .apply($$0, fah::new)
   );

   @Override
   public faf a() {
      return faf.b;
   }

   @Override
   public Either<fae.a, fae.b> b() {
      return Either.left(this::a);
   }

   private eod a(aqh $$0) throws IOException {
      STBTTFontinfo $$1 = null;
      ByteBuffer $$2 = null;

      try {
         eog var5;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$1 = STBTTFontinfo.malloc();
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            if (!STBTruetype.stbtt_InitFont($$1, $$2)) {
               throw new IOException("Invalid ttf");
            }

            var5 = new eog($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
         }

         return var5;
      } catch (Exception var9) {
         if ($$1 != null) {
            $$1.free();
         }

         MemoryUtil.memFree($$2);
         throw var9;
      }
   }

   public static record a(float c, float d) {
      public static final fah.a a = new fah.a(0.0F, 0.0F);
      public static final Codec<fah.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new fah.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
