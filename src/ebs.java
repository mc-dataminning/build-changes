import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebs extends dzg {
   public static final Codec<ebs> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               ebs.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebs::new)
   );
   public final ebs.a e;
   public final float f;
   public final float g;

   public ebs(dzg.c $$0, ebs.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      return a($$0, doq.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dzy $$0, dzg.a $$1) {
      hx $$2 = new hx($$1.h().d(), 90, $$1.h().e());
      ddc $$3 = ddc.a($$1.f());
      ebr.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dzp<?> e() {
      return dzp.k;
   }

   public static enum a implements avk {
      a("warm"),
      b("cold");

      public static final Codec<ebs.a> c = avk.a(ebs.a::values);
      private final String d;

      private a(String $$0) {
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
