import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class cfj extends cfh {
   private static final int f = 600;
   private static final int g = -1;
   private static final agj<Integer> h = agm.a(cfj.class, agl.b);
   private static final byte i = 0;
   private static final cmr j = new cmr(cmu.os);
   private cop k = cos.b;
   private final Set<blc> l = Sets.newHashSet();
   private boolean m;

   public cfj(blt<? extends cfj> $$0, cti $$1) {
      super($$0, $$1, j);
   }

   public cfj(cti $$0, double $$1, double $$2, double $$3, cmr $$4) {
      super(blt.e, $$1, $$2, $$3, $$0, $$4);
   }

   public cfj(cti $$0, bmf $$1, cmr $$2) {
      super(blt.e, $$1, $$0, $$2);
   }

   public void a(cmr $$0) {
      if ($$0.a(cmu.vj)) {
         this.k = cor.d($$0);
         Collection<blc> $$1 = cor.b($$0);
         if (!$$1.isEmpty()) {
            for (blc $$2 : $$1) {
               this.l.add(new blc($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.M();
         } else {
            this.d($$3);
         }
      } else if ($$0.a(cmu.os)) {
         this.k = cos.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   public static int c(cmr $$0) {
      sl $$1 = $$0.v();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void M() {
      this.m = false;
      if (this.k == cos.b && this.l.isEmpty()) {
         this.an.b(h, -1);
      } else {
         this.an.b(h, cor.a(cor.a(this.k, this.l)));
      }
   }

   public void a(blc $$0) {
      this.l.add($$0);
      this.an().b(h, cor.a(cor.a(this.k, this.l)));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(h, -1);
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
         this.k = cos.b;
         this.l.clear();
         this.an.b(h, -1);
      }
   }

   private void c(int $$0) {
      int $$1 = this.I();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            this.dM().a(jx.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
         }
      }
   }

   public int I() {
      return this.an.b(h);
   }

   private void d(int $$0) {
      this.m = true;
      this.an.b(h, $$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      if (this.k != cos.b) {
         $$0.a("Potion", kd.i.b(this.k).toString());
      }

      if (this.m) {
         $$0.a("Color", this.I());
      }

      if (!this.l.isEmpty()) {
         sr $$1 = new sr();

         for (blc $$2 : this.l) {
            $$1.add($$2.a(new sl()));
         }

         $$0.a("custom_potion_effects", $$1);
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.k = cor.c($$0);
      }

      for (blc $$1 : cor.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.d($$0.h("Color"));
      } else {
         this.M();
      }
   }

   @Override
   protected void a(bmf $$0) {
      super.a($$0);
      blp $$1 = this.J();

      for (blc $$2 : this.k.a()) {
         $$0.b(new blc($$2.c(), Math.max($$2.a($$0x -> $$0x / 8), 1), $$2.e(), $$2.f(), $$2.g()), $$1);
      }

      if (!this.l.isEmpty()) {
         for (blc $$3 : this.l) {
            $$0.b($$3, $$1);
         }
      }
   }

   @Override
   protected cmr y() {
      cmr $$0 = super.y();
      if (this.l.isEmpty() && this.k == cos.b) {
         return $$0;
      } else {
         cor.a($$0, this.k);
         cor.a($$0, this.l);
         if (this.m) {
            $$0.w().a("CustomPotionColor", this.I());
         }

         return $$0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.I();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.dM().a(jx.v, this.d(0.5), this.du(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
