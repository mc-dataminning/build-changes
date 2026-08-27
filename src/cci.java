import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cci extends ccg {
   private static final int f = 600;
   private static final int g = -1;
   private static final aef<Integer> h = aei.a(cci.class, aeh.b);
   private static final byte i = 0;
   private cli j = cll.b;
   private final Set<bij> k = Sets.newHashSet();
   private boolean l;

   public cci(bja<? extends cci> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cci(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.e, $$1, $$2, $$3, $$0);
   }

   public cci(cqb $$0, bjm $$1) {
      super(bja.e, $$1, $$0);
   }

   public void a(cjl $$0) {
      if ($$0.a(cjo.uw)) {
         this.j = clk.d($$0);
         Collection<bij> $$1 = clk.b($$0);
         if (!$$1.isEmpty()) {
            for (bij $$2 : $$1) {
               this.k.add(new bij($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.I();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cjo.nH)) {
         this.j = cll.b;
         this.k.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(cjl $$0) {
      qw $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void I() {
      this.l = false;
      if (this.j == cll.b && this.k.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, clk.a(clk.a(this.j, this.k)));
      }
   }

   public void a(bij $$0) {
      this.k.add($$0);
      this.al().b(h, clk.a(clk.a(this.j, this.k)));
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
         this.j = cll.b;
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
            this.dL().a(iv.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
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
   public void b(qw $$0) {
      super.b($$0);
      if (this.j != cll.b) {
         $$0.a("Potion", jb.j.b(this.j).toString());
      }

      if (this.l) {
         $$0.a("Color", this.F());
      }

      if (!this.k.isEmpty()) {
         rc $$1 = new rc();

         for (bij $$2 : this.k) {
            $$1.add($$2.a(new qw()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.j = clk.c($$0);
      }

      for (bij $$1 : clk.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.I();
      }
   }

   @Override
   protected void a(bjm $$0) {
      super.a($$0);
      biw $$1 = this.G();

      for (bij $$2 : this.j.a()) {
         $$0.b(new bij($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.k.isEmpty()) {
         for (bij $$3 : this.k) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cjl w() {
      if (this.k.isEmpty() && this.j == cll.b) {
         return new cjl(cjo.nH);
      } else {
         cjl $$0 = new cjl(cjo.uw);
         clk.a($$0, this.j);
         clk.a($$0, this.k);
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
               this.dL().a(iv.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
