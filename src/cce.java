import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cce extends ccc {
   private static final int f = 600;
   private static final int g = -1;
   private static final aeg<Integer> h = aej.a(cce.class, aei.b);
   private static final byte i = 0;
   private cle j = clh.b;
   private final Set<bif> k = Sets.newHashSet();
   private boolean l;

   public cce(biw<? extends cce> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cce(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.e, $$1, $$2, $$3, $$0);
   }

   public cce(cpx $$0, bji $$1) {
      super(biw.e, $$1, $$0);
   }

   public void a(cjh $$0) {
      if ($$0.a(cjk.uw)) {
         this.j = clg.d($$0);
         Collection<bif> $$1 = clg.b($$0);
         if (!$$1.isEmpty()) {
            for (bif $$2 : $$1) {
               this.k.add(new bif($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.I();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cjk.nH)) {
         this.j = clh.b;
         this.k.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(cjh $$0) {
      qy $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void I() {
      this.l = false;
      if (this.j == clh.b && this.k.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, clg.a(clg.a(this.j, this.k)));
      }
   }

   public void a(bif $$0) {
      this.k.add($$0);
      this.al().b(h, clg.a(clg.a(this.j, this.k)));
   }

   @Override
   protected void a_() {
      super.a_();
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
         this.j = clh.b;
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
            this.dL().a(ix.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
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
   public void b(qy $$0) {
      super.b($$0);
      if (this.j != clh.b) {
         $$0.a("Potion", jd.j.b(this.j).toString());
      }

      if (this.l) {
         $$0.a("Color", this.F());
      }

      if (!this.k.isEmpty()) {
         re $$1 = new re();

         for (bif $$2 : this.k) {
            $$1.add($$2.a(new qy()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.j = clg.c($$0);
      }

      for (bif $$1 : clg.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.I();
      }
   }

   @Override
   protected void a(bji $$0) {
      super.a($$0);
      bis $$1 = this.G();

      for (bif $$2 : this.j.a()) {
         $$0.b(new bif($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.k.isEmpty()) {
         for (bif $$3 : this.k) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cjh w() {
      if (this.k.isEmpty() && this.j == clh.b) {
         return new cjh(cjk.nH);
      } else {
         cjh $$0 = new cjh(cjk.uw);
         clg.a($$0, this.j);
         clg.a($$0, this.k);
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
               this.dL().a(ix.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
