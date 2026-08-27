import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public class chp extends chn {
   private static final int f = 600;
   private static final int g = -1;
   private static final aie<Integer> h = aih.a(chp.class, aig.b);
   private static final byte i = 0;
   private static final coz j = new coz(cpc.ou);
   private ij<cqv> k = cqy.b;
   private final Set<bnb> l = Sets.newHashSet();
   private boolean m;

   public chp(bnu<? extends chp> $$0, cvn $$1) {
      super($$0, $$1, j);
   }

   public chp(cvn $$0, double $$1, double $$2, double $$3, coz $$4) {
      super(bnu.f, $$1, $$2, $$3, $$0, $$4);
   }

   public chp(cvn $$0, bog $$1, coz $$2) {
      super(bnu.f, $$1, $$0, $$2);
   }

   public void a(coz $$0) {
      if ($$0.a(cpc.vm)) {
         this.k = cqx.d($$0);
         Collection<bnb> $$1 = cqx.b($$0);
         if (!$$1.isEmpty()) {
            for (bnb $$2 : $$1) {
               this.l.add(new bnb($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.K();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cpc.ou)) {
         this.k = cqy.b;
         this.l.clear();
         this.am.b(h, -1);
      }
   }

   public static int c(coz $$0) {
      sw $$1 = $$0.w();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void K() {
      this.m = false;
      if (this.k.a(cqy.b) && this.l.isEmpty()) {
         this.am.b(h, -1);
      } else {
         this.am.b(h, cqx.a(cqx.a(this.k, this.l)));
      }
   }

   public void a(bnb $$0) {
      this.l.add($$0);
      this.an().b(h, cqx.a(cqx.a(this.k, this.l)));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(h, -1);
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
         this.k = cqy.b;
         this.l.clear();
         this.am.b(h, -1);
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
      return this.am.b(h);
   }

   private void d(int $$0) {
      this.m = true;
      this.am.b(h, $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      Optional<aix<cqv>> $$1 = this.k.e();
      if ($$1.isPresent() && !this.k.a(cqy.b)) {
         $$0.a("Potion", $$1.get().a().toString());
      }

      if (this.m) {
         $$0.a("Color", this.H());
      }

      if (!this.l.isEmpty()) {
         tc $$2 = new tc();

         for (bnb $$3 : this.l) {
            $$2.add($$3.a(new sw()));
         }

         $$0.a("custom_potion_effects", $$2);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.k = cqx.c($$0);
      }

      for (bnb $$1 : cqx.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.K();
      }
   }

   @Override
   protected void a(bog $$0) {
      super.a($$0);
      bno $$1 = this.I();

      for (bnb $$2 : this.k.a().a()) {
         $$0.b(new bnb($$2.b(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.d(), $$2.e(), $$2.f()), $$1);
      }

      if (!this.l.isEmpty()) {
         for (bnb $$3 : this.l) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected coz x() {
      coz $$0 = super.x();
      if (this.l.isEmpty() && this.k.a(cqy.b)) {
         return $$0;
      } else {
         cqx.a($$0, this.k);
         cqx.a($$0, this.l);
         if (this.m) {
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
