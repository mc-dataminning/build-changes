import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class byw extends byu {
   private static final int f = 600;
   private static final int g = -1;
   private static final aby<Integer> h = acb.a(byw.class, aca.b);
   private static final byte i = 0;
   private chw j = chz.b;
   private final Set<bfa> k = Sets.newHashSet();
   private boolean l;

   public byw(bfn<? extends byw> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public byw(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.e, $$1, $$2, $$3, $$0);
   }

   public byw(cmm $$0, bfz $$1) {
      super(bfn.e, $$1, $$0);
   }

   public void a(cfz $$0) {
      if ($$0.a(cgc.uw)) {
         this.j = chy.d($$0);
         Collection<bfa> $$1 = chy.b($$0);
         if (!$$1.isEmpty()) {
            for (bfa $$2 : $$1) {
               this.k.add(new bfa($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.D();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cgc.nH)) {
         this.j = chz.b;
         this.k.clear();
         this.am.b(h, -1);
      }
   }

   public static int c(cfz $$0) {
      qr $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void D() {
      this.l = false;
      if (this.j == chz.b && this.k.isEmpty()) {
         this.am.b(h, -1);
      } else {
         this.am.b(h, chy.a(chy.a(this.j, this.k)));
      }
   }

   public void a(bfa $$0) {
      this.k.add($$0);
      this.aj().b(h, chy.a(chy.a(this.j, this.k)));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(h, -1);
   }

   @Override
   public void l() {
      super.l();
      if (this.dI().B) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.c(1);
            }
         } else {
            this.c(2);
         }
      } else if (this.b && this.c != 0 && !this.k.isEmpty() && this.c >= 600) {
         this.dI().a(this, (byte)0);
         this.j = chz.b;
         this.k.clear();
         this.am.b(h, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.z();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dI().a(iv.v, this.d(0.5), this.dq(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int z() {
      return this.am.b(h);
   }

   private void d(int $$0) {
      this.l = true;
      this.am.b(h, $$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.j != chz.b) {
         $$0.a("Potion", jb.j.b(this.j).toString());
      }

      if (this.l) {
         $$0.a("Color", this.z());
      }

      if (!this.k.isEmpty()) {
         qx $$1 = new qx();

         for (bfa $$2 : this.k) {
            $$1.add($$2.a(new qr()));
         }

         $$0.a("CustomPotionEffects", $$1);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.j = chy.c($$0);
      }

      for (bfa $$1 : chy.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.D();
      }
   }

   @Override
   protected void a(bfz $$0) {
      super.a($$0);
      bfj $$1 = this.A();

      for (bfa $$2 : this.j.a()) {
         $$0.b(new bfa($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.k.isEmpty()) {
         for (bfa $$3 : this.k) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cfz p() {
      if (this.k.isEmpty() && this.j == chz.b) {
         return new cfz(cgc.nH);
      } else {
         cfz $$0 = new cfz(cgc.uw);
         chy.a($$0, this.j);
         chy.a($$0, this.k);
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
               this.dI().a(iv.v, this.d(0.5), this.dq(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
