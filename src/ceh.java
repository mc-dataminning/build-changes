import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class ceh extends cef {
   private static final int f = 600;
   private static final int g = -1;
   private static final afs<Integer> h = afv.a(ceh.class, afu.b);
   private static final byte i = 0;
   private static final clo j = new clo(clr.os);
   private cnl k = cno.b;
   private final Set<bki> l = Sets.newHashSet();
   private boolean m;

   public ceh(bkz<? extends ceh> $$0, csf $$1) {
      super($$0, $$1, j);
   }

   public ceh(csf $$0, double $$1, double $$2, double $$3, clo $$4) {
      super(bkz.e, $$1, $$2, $$3, $$0, $$4);
   }

   public ceh(csf $$0, bll $$1, clo $$2) {
      super(bkz.e, $$1, $$0, $$2);
   }

   public void a(clo $$0) {
      if ($$0.a(clr.vi)) {
         this.k = cnn.d($$0);
         Collection<bki> $$1 = cnn.b($$0);
         if (!$$1.isEmpty()) {
            for (bki $$2 : $$1) {
               this.l.add(new bki($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.K();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(clr.os)) {
         this.k = cno.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(clo $$0) {
      sd $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void K() {
      this.m = false;
      if (this.k == cno.b && this.l.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, cnn.a(cnn.a(this.k, this.l)));
      }
   }

   public void a(bki $$0) {
      this.l.add($$0);
      this.an().b(h, cnn.a(cnn.a(this.k, this.l)));
   }

   @Override
   protected void c_() {
      super.c_();
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
         this.k = cno.b;
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
            this.dN().a(jw.v, this.d(0.5), this.dv(), this.g(0.5), $$2, $$3, $$4);
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
   public void b(sd $$0) {
      super.b($$0);
      if (this.k != cno.b) {
         $$0.a("Potion", kc.j.b(this.k).toString());
      }

      if (this.m) {
         $$0.a("Color", this.H());
      }

      if (!this.l.isEmpty()) {
         sj $$1 = new sj();

         for (bki $$2 : this.l) {
            $$1.add($$2.a(new sd()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.k = cnn.c($$0);
      }

      for (bki $$1 : cnn.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.K();
      }
   }

   @Override
   protected void a(bll $$0) {
      super.a($$0);
      bkv $$1 = this.I();

      for (bki $$2 : this.k.a()) {
         $$0.b(new bki($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.l.isEmpty()) {
         for (bki $$3 : this.l) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected clo x() {
      clo $$0 = super.x();
      if (this.l.isEmpty() && this.k == cno.b) {
         return $$0;
      } else {
         cnn.a($$0, this.k);
         cnn.a($$0, this.l);
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
               this.dN().a(jw.v, this.d(0.5), this.dv(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
