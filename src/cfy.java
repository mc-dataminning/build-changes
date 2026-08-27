import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public class cfy extends cfw {
   private static final int f = 600;
   private static final int g = -1;
   private static final agn<Integer> h = agq.a(cfy.class, agp.b);
   private static final byte i = 0;
   private static final cng j = new cng(cnj.ou);
   private ih<cpe> k = cph.b;
   private final Set<blj> l = Sets.newHashSet();
   private boolean m;

   public cfy(bmc<? extends cfy> $$0, ctx $$1) {
      super($$0, $$1, j);
   }

   public cfy(ctx $$0, double $$1, double $$2, double $$3, cng $$4) {
      super(bmc.f, $$1, $$2, $$3, $$0, $$4);
   }

   public cfy(ctx $$0, bmo $$1, cng $$2) {
      super(bmc.f, $$1, $$0, $$2);
   }

   public void a(cng $$0) {
      if ($$0.a(cnj.vm)) {
         this.k = cpg.d($$0);
         Collection<blj> $$1 = cpg.b($$0);
         if (!$$1.isEmpty()) {
            for (blj $$2 : $$1) {
               this.l.add(new blj($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.K();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cnj.ou)) {
         this.k = cph.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(cng $$0) {
      so $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void K() {
      this.m = false;
      if (this.k.a(cph.b) && this.l.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, cpg.a(cpg.a(this.k, this.l)));
      }
   }

   public void a(blj $$0) {
      this.l.add($$0);
      this.an().b(h, cpg.a(cpg.a(this.k, this.l)));
   }

   @Override
   protected void c_() {
      super.c_();
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
      } else if (this.b && this.c != 0 && !this.l.isEmpty() && this.c >= 600) {
         this.dL().a(this, (byte)0);
         this.k = cph.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.H();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dL().a(jx.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int H() {
      return this.an.b(h);
   }

   private void d(int $$0) {
      this.m = true;
      this.an.b(h, $$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      Optional<ahg<cpe>> $$1 = this.k.e();
      if ($$1.isPresent() && !this.k.a(cph.b)) {
         $$0.a("Potion", $$1.get().a().toString());
      }

      if (this.m) {
         $$0.a("Color", this.H());
      }

      if (!this.l.isEmpty()) {
         su $$2 = new su();

         for (blj $$3 : this.l) {
            $$2.add($$3.a(new so()));
         }

         $$0.a("custom_potion_effects", $$2);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.k = cpg.c($$0);
      }

      for (blj $$1 : cpg.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.K();
      }
   }

   @Override
   protected void a(bmo $$0) {
      super.a($$0);
      blw $$1 = this.I();

      for (blj $$2 : this.k.a().a()) {
         $$0.b(new blj($$2.b(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.d(), $$2.e(), $$2.f()), $$1);
      }

      if (!this.l.isEmpty()) {
         for (blj $$3 : this.l) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cng x() {
      cng $$0 = super.x();
      if (this.l.isEmpty() && this.k.a(cph.b)) {
         return $$0;
      } else {
         cpg.a($$0, this.k);
         cpg.a($$0, this.l);
         if (this.m) {
            $$0.w().a("CustomPotionColor", this.H());
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
               this.dL().a(jx.v, this.d(0.5), this.dt(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
