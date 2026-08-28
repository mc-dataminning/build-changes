import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crx(int c, float d, boolean e) implements cyu {
   public static final Codec<crx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.l.fieldOf("nutrition").forGetter(crx::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(crx::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(crx::c)
            )
            .apply($$0, crx::new)
   );
   public static final ym<vz, crx> b = ym.a(yk.h, crx::a, yk.l, crx::b, yk.b, crx::c, crx::new);

   @Override
   public void a(dgg $$0, bvf $$1, cwn $$2, cyt $$3) {
      azg $$4 = $$1.dZ();
      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), $$3.e().a(), awa.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cov $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dB(), $$5.dD(), $$5.dH(), avz.uJ, awa.h, 0.5F, ayy.b($$4, 0.9F, 1.0F));
      }
   }

   public int a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;

      public crx.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public crx.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public crx.a a() {
         this.c = true;
         return this;
      }

      public crx b() {
         float $$0 = crv.a(this.a, this.b);
         return new crx(this.a, $$0, this.c);
      }
   }
}
