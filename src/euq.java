import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class euq extends esd {
   public static final MapCodec<euq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               euq.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, euq::new)
   );
   public final euq.a e;
   public final float f;
   public final float g;

   public euq(esd.c $$0, euq.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      return a($$0, ehf.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(esv $$0, esd.a $$1) {
      iw $$2 = new iw($$1.h().d(), 90, $$1.h().e());
      dty $$3 = dty.a($$1.f());
      eup.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public esm<?> e() {
      return esm.k;
   }

   public static enum a implements bao {
      a("warm"),
      b("cold");

      public static final Codec<euq.a> c = bao.a(euq.a::values);
      @Deprecated
      public static final Codec<euq.a> d = ayy.c(euq.a::valueOf);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
