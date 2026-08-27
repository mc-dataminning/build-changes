import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cec extends cea {
   private static final int f = 600;
   private static final int g = -1;
   private static final afo<Integer> h = afr.a(cec.class, afq.b);
   private static final byte i = 0;
   private static final clj j = new clj(clm.os);
   private cng k = cnj.b;
   private final Set<bkd> l = Sets.newHashSet();
   private boolean m;

   public cec(bku<? extends cec> $$0, csa $$1) {
      super($$0, $$1, j);
   }

   public cec(csa $$0, double $$1, double $$2, double $$3, clj $$4) {
      super(bku.e, $$1, $$2, $$3, $$0, $$4);
   }

   public cec(csa $$0, blg $$1, clj $$2) {
      super(bku.e, $$1, $$0, $$2);
   }

   public void a(clj $$0) {
      if ($$0.a(clm.vi)) {
         this.k = cni.d($$0);
         Collection<bkd> $$1 = cni.b($$0);
         if (!$$1.isEmpty()) {
            for (bkd $$2 : $$1) {
               this.l.add(new bkd($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.K();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(clm.os)) {
         this.k = cnj.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(clj $$0) {
      rz $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void K() {
      this.m = false;
      if (this.k == cnj.b && this.l.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, cni.a(cni.a(this.k, this.l)));
      }
   }

   public void a(bkd $$0) {
      this.l.add($$0);
      this.an().b(h, cni.a(cni.a(this.k, this.l)));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.l.isEmpty() && this.c >= 600) {
         this.dN().a(this, (byte)0);
         this.k = cnj.b;
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
            this.dN().a(js.v, this.d(0.5), this.dv(), this.g(0.5), $$2, $$3, $$4);
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
   public void b(rz $$0) {
      super.b($$0);
      if (this.k != cnj.b) {
         $$0.a("Potion", jy.j.b(this.k).toString());
      }

      if (this.m) {
         $$0.a("Color", this.H());
      }

      if (!this.l.isEmpty()) {
         sf $$1 = new sf();

         for (bkd $$2 : this.l) {
            $$1.add($$2.a(new rz()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.k = cni.c($$0);
      }

      for (bkd $$1 : cni.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.K();
      }
   }

   @Override
   protected void a(blg $$0) {
      super.a($$0);
      bkq $$1 = this.I();

      for (bkd $$2 : this.k.a()) {
         $$0.b(new bkd($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.l.isEmpty()) {
         for (bkd $$3 : this.l) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected clj x() {
      clj $$0 = super.x();
      if (this.l.isEmpty() && this.k == cnj.b) {
         return $$0;
      } else {
         cni.a($$0, this.k);
         cni.a($$0, this.l);
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
               this.dN().a(js.v, this.d(0.5), this.dv(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
