import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csl extends crt {
   private static final int p = 3;
   private static final int q = 3;
   public static final int o = 0;
   private static final int r = 1;
   private static final int s = 9;
   private static final int t = 10;
   private static final int u = 10;
   private static final int v = 37;
   private static final int w = 37;
   private static final int x = 46;
   private final csf y;
   private final cor z;
   private boolean A;

   public csl(int $$0, coq $$1) {
      this($$0, $$1, csf.a);
   }

   public csl(int $$0, coq $$1, csf $$2) {
      super(ctb.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(crs $$0, dff $$1, cor $$2, csk $$3, ctk $$4, @Nullable dav<daj> $$5) {
      if (!$$1.C) {
         dai $$6 = $$3.aC_();
         arr $$7 = (arr)$$2;
         cwf $$8 = cwf.k;
         Optional<dav<daj>> $$9 = $$1.o().aI().a(daz.a, $$6, $$1, $$5);
         if ($$9.isPresent()) {
            dav<daj> $$10 = $$9.get();
            daj $$11 = $$10.b();
            if ($$4.a($$1, $$7, $$10)) {
               cwf $$12 = $$11.a($$6, $$1.H_());
               if ($$12.a($$1.J())) {
                  $$8 = $$12;
               }
            }
         }

         $$4.a(0, $$8);
         $$0.a(0, $$8);
         $$7.g.b(new ade($$0.l, $$0.k(), 0, $$8));
      }
   }

   @Override
   public void a(bsa $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> a(this, $$0x, this.z, this.m, this.n, null));
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(dav<daj> $$0) {
      this.A = false;
      this.y.a(($$1, $$2) -> a(this, $$1, this.z, this.m, this.n, $$0));
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cor $$0) {
      return a(this.y, $$0, dil.cA);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cwf.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cwf.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwf $$0, ctp $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctp m() {
      return this.k.get(0);
   }

   @Override
   public List<ctp> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cti ao_() {
      return cti.a;
   }

   @Override
   protected cor q() {
      return this.z;
   }
}
