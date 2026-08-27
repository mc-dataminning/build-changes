import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public class cjc extends cja {
   private static final int g = 600;
   private static final int h = -1;
   private static final aim<Integer> i = aiq.a(cjc.class, aio.b);
   private static final byte j = 0;
   private static final cqm k = new cqm(cqp.ou);
   private il<csj> l = csm.b;
   private final Set<bok> m = Sets.newHashSet();
   private boolean n;

   public cjc(bpd<? extends cjc> $$0, cxb $$1) {
      super($$0, $$1, k);
   }

   public cjc(cxb $$0, double $$1, double $$2, double $$3, cqm $$4) {
      super(bpd.f, $$1, $$2, $$3, $$0, $$4);
   }

   public cjc(cxb $$0, bpp $$1, cqm $$2) {
      super(bpd.f, $$1, $$0, $$2);
   }

   public void a(cqm $$0) {
      if ($$0.a(cqp.vo)) {
         this.l = csl.d($$0);
         Collection<bok> $$1 = csl.b($$0);
         if (!$$1.isEmpty()) {
            for (bok $$2 : $$1) {
               this.m.add(new bok($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.J();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cqp.ou)) {
         this.l = csm.b;
         this.m.clear();
         this.an.a(i, -1);
      }
   }

   public static int c(cqm $$0) {
      ta $$1 = $$0.w();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void J() {
      this.n = false;
      if (this.l.a(csm.b) && this.m.isEmpty()) {
         this.an.a(i, -1);
      } else {
         this.an.a(i, csl.a(csl.a(this.l, this.m)));
      }
   }

   public void a(bok $$0) {
      this.m.add($$0);
      this.an().a(i, csl.a(csl.a(this.l, this.m)));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(i, -1);
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
         this.l = csm.b;
         this.m.clear();
         this.an.a(i, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.G();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dM().a(kc.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int G() {
      return this.an.a(i);
   }

   private void d(int $$0) {
      this.n = true;
      this.an.a(i, $$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      Optional<ajg<csj>> $$1 = this.l.e();
      if ($$1.isPresent() && !this.l.a(csm.b)) {
         $$0.a("Potion", $$1.get().a().toString());
      }

      if (this.n) {
         $$0.a("Color", this.G());
      }

      if (!this.m.isEmpty()) {
         tg $$2 = new tg();

         for (bok $$3 : this.m) {
            $$2.add($$3.i());
         }

         $$0.a("custom_potion_effects", $$2);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.l = csl.c($$0);
      }

      for (bok $$1 : csl.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.J();
      }
   }

   @Override
   protected void a(bpp $$0) {
      super.a($$0);
      box $$1 = this.H();

      for (bok $$2 : this.l.a().a()) {
         $$0.b(new bok($$2.b(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.d(), $$2.e(), $$2.f()), $$1);
      }

      if (!this.m.isEmpty()) {
         for (bok $$3 : this.m) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cqm w() {
      cqm $$0 = super.w();
      if (this.m.isEmpty() && this.l.a(csm.b)) {
         return $$0;
      } else {
         csl.a($$0, this.l);
         csl.a($$0, this.m);
         if (this.n) {
            $$0.x().a("CustomPotionColor", this.G());
         }

         return $$0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.G();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dM().a(kc.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
