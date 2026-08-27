import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cdf extends cdd {
   private static final int f = 600;
   private static final int g = -1;
   private static final afc<Integer> h = aff.a(cdf.class, afe.b);
   private static final byte i = 0;
   private cmg j = cmj.b;
   private final Set<bjg> k = Sets.newHashSet();
   private boolean l;

   public cdf(bjx<? extends cdf> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdf(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.e, $$1, $$2, $$3, $$0);
   }

   public cdf(cqz $$0, bkj $$1) {
      super(bjx.e, $$1, $$0);
   }

   public void a(ckj $$0) {
      if ($$0.a(ckm.uw)) {
         this.j = cmi.d($$0);
         Collection<bjg> $$1 = cmi.b($$0);
         if (!$$1.isEmpty()) {
            for (bjg $$2 : $$1) {
               this.k.add(new bjg($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.I();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(ckm.nH)) {
         this.j = cmj.b;
         this.k.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(ckj $$0) {
      rt $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void I() {
      this.l = false;
      if (this.j == cmj.b && this.k.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, cmi.a(cmi.a(this.j, this.k)));
      }
   }

   public void a(bjg $$0) {
      this.k.add($$0);
      this.al().b(h, cmi.a(cmi.a(this.j, this.k)));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.k.isEmpty() && this.c >= 600) {
         this.dL().a(this, (byte)0);
         this.j = cmj.b;
         this.k.clear();
         this.an.b(h, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.F();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dL().a(js.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int F() {
      return this.an.b(h);
   }

   private void d(int $$0) {
      this.l = true;
      this.an.b(h, $$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      if (this.j != cmj.b) {
         $$0.a("Potion", jy.j.b(this.j).toString());
      }

      if (this.l) {
         $$0.a("Color", this.F());
      }

      if (!this.k.isEmpty()) {
         rz $$1 = new rz();

         for (bjg $$2 : this.k) {
            $$1.add($$2.a(new rt()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.j = cmi.c($$0);
      }

      for (bjg $$1 : cmi.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.I();
      }
   }

   @Override
   protected void a(bkj $$0) {
      super.a($$0);
      bjt $$1 = this.G();

      for (bjg $$2 : this.j.a()) {
         $$0.b(new bjg($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.k.isEmpty()) {
         for (bjg $$3 : this.k) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected ckj w() {
      if (this.k.isEmpty() && this.j == cmj.b) {
         return new ckj(ckm.nH);
      } else {
         ckj $$0 = new ckj(ckm.uw);
         cmi.a($$0, this.j);
         cmi.a($$0, this.k);
         if (this.l) {
            $$0.w().a("CustomPotionColor", this.F());
         }

         return $$0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.F();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dL().a(js.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
