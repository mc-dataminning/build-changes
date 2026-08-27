import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cbu extends cbs {
   private static final int f = 600;
   private static final int g = -1;
   private static final adz<Integer> h = aec.a(cbu.class, aeb.b);
   private static final byte i = 0;
   private cku j = ckx.b;
   private final Set<bhv> k = Sets.newHashSet();
   private boolean l;

   public cbu(bim<? extends cbu> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cbu(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.e, $$1, $$2, $$3, $$0);
   }

   public cbu(cpl $$0, biy $$1) {
      super(bim.e, $$1, $$0);
   }

   public void a(cix $$0) {
      if ($$0.a(cja.uw)) {
         this.j = ckw.d($$0);
         Collection<bhv> $$1 = ckw.b($$0);
         if (!$$1.isEmpty()) {
            for (bhv $$2 : $$1) {
               this.k.add(new bhv($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.D();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cja.nH)) {
         this.j = ckx.b;
         this.k.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(cix $$0) {
      qr $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void D() {
      this.l = false;
      if (this.j == ckx.b && this.k.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, ckw.a(ckw.a(this.j, this.k)));
      }
   }

   public void a(bhv $$0) {
      this.k.add($$0);
      this.al().b(h, ckw.a(ckw.a(this.j, this.k)));
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
         this.j = ckx.b;
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
            this.dK().a(iv.v, this.d(0.5), this.ds(), this.g(0.5), $$2, $$3, $$4);
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
   public void b(qr $$0) {
      super.b($$0);
      if (this.j != ckx.b) {
         $$0.a("Potion", jb.j.b(this.j).toString());
      }

      if (this.l) {
         $$0.a("Color", this.z());
      }

      if (!this.k.isEmpty()) {
         qx $$1 = new qx();

         for (bhv $$2 : this.k) {
            $$1.add($$2.a(new qr()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.j = ckw.c($$0);
      }

      for (bhv $$1 : ckw.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.D();
      }
   }

   @Override
   protected void a(biy $$0) {
      super.a($$0);
      bii $$1 = this.A();

      for (bhv $$2 : this.j.a()) {
         $$0.b(new bhv($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.k.isEmpty()) {
         for (bhv $$3 : this.k) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cix p() {
      if (this.k.isEmpty() && this.j == ckx.b) {
         return new cix(cja.nH);
      } else {
         cix $$0 = new cix(cja.uw);
         ckw.a($$0, this.j);
         ckw.a($$0, this.k);
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
               this.dK().a(iv.v, this.d(0.5), this.ds(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
