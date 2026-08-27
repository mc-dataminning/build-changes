import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public class cht extends chr {
   private static final int g = 600;
   private static final int h = -1;
   private static final aie<Integer> i = aih.a(cht.class, aig.b);
   private static final byte j = 0;
   private static final cpd k = new cpd(cpg.ou);
   private ij<cqz> l = crc.b;
   private final Set<bnd> m = Sets.newHashSet();
   private boolean n;

   public cht(bnw<? extends cht> $$0, cvr $$1) {
      super($$0, $$1, k);
   }

   public cht(cvr $$0, double $$1, double $$2, double $$3, cpd $$4) {
      super(bnw.f, $$1, $$2, $$3, $$0, $$4);
   }

   public cht(cvr $$0, boi $$1, cpd $$2) {
      super(bnw.f, $$1, $$0, $$2);
   }

   public void a(cpd $$0) {
      if ($$0.a(cpg.vm)) {
         this.l = crb.d($$0);
         Collection<bnd> $$1 = crb.b($$0);
         if (!$$1.isEmpty()) {
            for (bnd $$2 : $$1) {
               this.m.add(new bnd($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.K();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cpg.ou)) {
         this.l = crc.b;
         this.m.clear();
         this.am.b(i, -1);
      }
   }

   public static int c(cpd $$0) {
      sw $$1 = $$0.w();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void K() {
      this.n = false;
      if (this.l.a(crc.b) && this.m.isEmpty()) {
         this.am.b(i, -1);
      } else {
         this.am.b(i, crb.a(crb.a(this.l, this.m)));
      }
   }

   public void a(bnd $$0) {
      this.m.add($$0);
      this.an().b(i, crb.a(crb.a(this.l, this.m)));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(i, -1);
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
      } else if (this.b && this.c != 0 && !this.m.isEmpty() && this.c >= 600) {
         this.dM().a(this, (byte)0);
         this.l = crc.b;
         this.m.clear();
         this.am.b(i, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dM().a(jz.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int H() {
      return this.am.b(i);
   }

   private void d(int $$0) {
      this.n = true;
      this.am.b(i, $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      Optional<aix<cqz>> $$1 = this.l.e();
      if ($$1.isPresent() && !this.l.a(crc.b)) {
         $$0.a("Potion", $$1.get().a().toString());
      }

      if (this.n) {
         $$0.a("Color", this.H());
      }

      if (!this.m.isEmpty()) {
         tc $$2 = new tc();

         for (bnd $$3 : this.m) {
            $$2.add($$3.a(new sw()));
         }

         $$0.a("custom_potion_effects", $$2);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.l = crb.c($$0);
      }

      for (bnd $$1 : crb.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.K();
      }
   }

   @Override
   protected void a(boi $$0) {
      super.a($$0);
      bnq $$1 = this.I();

      for (bnd $$2 : this.l.a().a()) {
         $$0.b(new bnd($$2.b(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.d(), $$2.e(), $$2.f()), $$1);
      }

      if (!this.m.isEmpty()) {
         for (bnd $$3 : this.m) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cpd x() {
      cpd $$0 = super.x();
      if (this.m.isEmpty() && this.l.a(crc.b)) {
         return $$0;
      } else {
         crb.a($$0, this.l);
         crb.a($$0, this.m);
         if (this.n) {
            $$0.x().a("CustomPotionColor", this.H());
         }

         return $$0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.H();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dM().a(jz.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
