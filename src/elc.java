import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elc extends eiq {
   public static final MapCodec<elc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               elc.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elc::new)
   );
   public final elc.a e;
   public final float f;
   public final float g;

   public elc(eiq.c $$0, elc.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      return a($$0, dxz.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(eji $$0, eiq.a $$1) {
      ja $$2 = new ja($$1.h().d(), 90, $$1.h().e());
      dls $$3 = dls.a($$1.f());
      elb.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public eiz<?> e() {
      return eiz.k;
   }

   public static enum a implements ayz {
      a("warm"),
      b("cold");

      public static final Codec<elc.a> c = ayz.a(elc.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
