import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cfp extends cfn {
   private static final int f = 600;
   private static final int g = -1;
   private static final agm<Integer> h = agp.a(cfp.class, ago.b);
   private static final byte i = 0;
   private static final cmx j = new cmx(cna.os);
   private cov k = coy.b;
   private final Set<blh> l = Sets.newHashSet();
   private boolean m;

   public cfp(bly<? extends cfp> $$0, cto $$1) {
      super($$0, $$1, j);
   }

   public cfp(cto $$0, double $$1, double $$2, double $$3, cmx $$4) {
      super(bly.e, $$1, $$2, $$3, $$0, $$4);
   }

   public cfp(cto $$0, bmk $$1, cmx $$2) {
      super(bly.e, $$1, $$0, $$2);
   }

   public void a(cmx $$0) {
      if ($$0.a(cna.vj)) {
         this.k = cox.d($$0);
         Collection<blh> $$1 = cox.b($$0);
         if (!$$1.isEmpty()) {
            for (blh $$2 : $$1) {
               this.l.add(new blh($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.M();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cna.os)) {
         this.k = coy.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(cmx $$0) {
      sn $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void M() {
      this.m = false;
      if (this.k == coy.b && this.l.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, cox.a(cox.a(this.k, this.l)));
      }
   }

   public void a(blh $$0) {
      this.l.add($$0);
      this.an().b(h, cox.a(cox.a(this.k, this.l)));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.l.isEmpty() && this.c >= 600) {
         this.dM().a(this, (byte)0);
         this.k = coy.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.I();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dM().a(jx.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int I() {
      return this.an.b(h);
   }

   private void d(int $$0) {
      this.m = true;
      this.an.b(h, $$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.k != coy.b) {
         $$0.a("Potion", kd.i.b(this.k).toString());
      }

      if (this.m) {
         $$0.a("Color", this.I());
      }

      if (!this.l.isEmpty()) {
         st $$1 = new st();

         for (blh $$2 : this.l) {
            $$1.add($$2.a(new sn()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.k = cox.c($$0);
      }

      for (blh $$1 : cox.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.M();
      }
   }

   @Override
   protected void a(bmk $$0) {
      super.a($$0);
      blu $$1 = this.J();

      for (blh $$2 : this.k.a()) {
         $$0.b(new blh($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.l.isEmpty()) {
         for (blh $$3 : this.l) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cmx y() {
      cmx $$0 = super.y();
      if (this.l.isEmpty() && this.k == coy.b) {
         return $$0;
      } else {
         cox.a($$0, this.k);
         cox.a($$0, this.l);
         if (this.m) {
            $$0.w().a("CustomPotionColor", this.I());
         }

         return $$0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.I();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dM().a(jx.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
