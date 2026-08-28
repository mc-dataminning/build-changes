import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwu extends cwc {
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
   private final cwo y;
   private final csi z;
   private boolean A;

   public cwu(int $$0, csh $$1) {
      this($$0, $$1, cwo.a);
   }

   public cwu(int $$0, csh $$1, cwo $$2) {
      super(cxk.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.h;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(cwb $$0, asb $$1, csi $$2, cwt $$3, cxu $$4, @Nullable dfg<deq> $$5) {
      dep $$6 = $$3.aD_();
      asc $$7 = (asc)$$2;
      dak $$8 = dak.l;
      Optional<dfg<deq>> $$9 = $$1.p().aI().a(dfm.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dfg<deq> $$10 = $$9.get();
         deq $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            dak $$12 = $$11.a($$6, $$1.J_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new adb($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(buv $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof asb $$2) {
               a(this, $$2, this.z, this.m, this.n, null);
            }
         });
      }
   }

   @Override
   public void l() {
      this.A = true;
   }

   @Override
   public void a(asb $$0, dfg<deq> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(csi $$0) {
      return a(this.y, $$0, dnq.cL);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return dak.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return dak.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(dak $$0, cxz $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cxz m() {
      return this.k.get(0);
   }

   @Override
   public List<cxz> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cxr ao_() {
      return cxr.a;
   }

   @Override
   protected csi q() {
      return this.z;
   }
}
