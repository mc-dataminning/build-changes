import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cbt extends cbr {
   private static final int f = 600;
   private static final int g = -1;
   private static final adx<Integer> h = aea.a(cbt.class, adz.b);
   private static final byte i = 0;
   private ckt j = ckw.b;
   private final Set<bht> k = Sets.newHashSet();
   private boolean l;

   public cbt(bik<? extends cbt> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cbt(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.e, $$1, $$2, $$3, $$0);
   }

   public cbt(cpk $$0, biw $$1) {
      super(bik.e, $$1, $$0);
   }

   public void a(ciw $$0) {
      if ($$0.a(ciz.uw)) {
         this.j = ckv.d($$0);
         Collection<bht> $$1 = ckv.b($$0);
         if (!$$1.isEmpty()) {
            for (bht $$2 : $$1) {
               this.k.add(new bht($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.D();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(ciz.nH)) {
         this.j = ckw.b;
         this.k.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(ciw $$0) {
      qs $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void D() {
      this.l = false;
      if (this.j == ckw.b && this.k.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, ckv.a(ckv.a(this.j, this.k)));
      }
   }

   public void a(bht $$0) {
      this.k.add($$0);
      this.al().b(h, ckv.a(ckv.a(this.j, this.k)));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.k.isEmpty() && this.c >= 600) {
         this.dK().a(this, (byte)0);
         this.j = ckw.b;
         this.k.clear();
         this.an.b(h, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.z();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dK().a(iw.v, this.d(0.5), this.ds(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int z() {
      return this.an.b(h);
   }

   private void d(int $$0) {
      this.l = true;
      this.an.b(h, $$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.j != ckw.b) {
         $$0.a("Potion", jc.j.b(this.j).toString());
      }

      if (this.l) {
         $$0.a("Color", this.z());
      }

      if (!this.k.isEmpty()) {
         qy $$1 = new qy();

         for (bht $$2 : this.k) {
            $$1.add($$2.a(new qs()));
         }

         $$0.a("CustomPotionEffects", $$1);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.j = ckv.c($$0);
      }

      for (bht $$1 : ckv.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.D();
      }
   }

   @Override
   protected void a(biw $$0) {
      super.a($$0);
      big $$1 = this.A();

      for (bht $$2 : this.j.a()) {
         $$0.b(new bht($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.k.isEmpty()) {
         for (bht $$3 : this.k) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected ciw p() {
      if (this.k.isEmpty() && this.j == ckw.b) {
         return new ciw(ciz.nH);
      } else {
         ciw $$0 = new ciw(ciz.uw);
         ckv.a($$0, this.j);
         ckv.a($$0, this.k);
         if (this.l) {
            $$0.w().a("CustomPotionColor", this.z());
         }

         return $$0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.z();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dK().a(iw.v, this.d(0.5), this.ds(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
