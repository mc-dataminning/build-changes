import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crl(int c, float d, boolean e) implements cyi {
   public static final Codec<crl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.l.fieldOf("nutrition").forGetter(crl::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(crl::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(crl::c)
            )
            .apply($$0, crl::new)
   );
   public static final zg<wt, crl> b = zg.a(ze.h, crl::a, ze.j, crl::b, ze.b, crl::c, crl::new);

   @Override
   public void a(dfb $$0, bva $$1, cwb $$2, cyh $$3) {
      azs $$4 = $$1.ea();
      $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), $$3.e().a(), awm.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof com $$5) {
         $$5.gu().a(this);
         $$0.a(null, $$5.dC(), $$5.dE(), $$5.dI(), awl.ui, awm.h, 0.5F, azk.b($$4, 0.9F, 1.0F));
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

      public crl.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public crl.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public crl.a a() {
         this.c = true;
         return this;
      }

      public crl b() {
         float $$0 = crj.a(this.a, this.b);
         return new crl(this.a, $$0, this.c);
      }
   }
}
