import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cug extends cto {
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
   private final cua y;
   private final cqi z;
   private boolean A;

   public cug(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public cug(int $$0, cqh $$1, cua $$2) {
      super(cuw.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(ctn $$0, arn $$1, cqi $$2, cuf $$3, cvf $$4, @Nullable dcq<dca> $$5) {
      dbz $$6 = $$3.ax_();
      aro $$7 = (aro)$$2;
      cxy $$8 = cxy.k;
      Optional<dcq<dca>> $$9 = $$1.p().aI().a(dcw.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dcq<dca> $$10 = $$9.get();
         dca $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cxy $$12 = $$11.a($$6, $$1.F_());
            if ($$12.a($$1.K())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new acn($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(btj $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof arn $$2) {
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
   public void a(arn $$0, dcq<dca> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cqi $$0) {
      return a(this.y, $$0, dkw.cI);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cxy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cxy.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cxy.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cxy.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxy $$0, cvk $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cvk m() {
      return this.k.get(0);
   }

   @Override
   public List<cvk> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cvd ai_() {
      return cvd.a;
   }

   @Override
   protected cqi q() {
      return this.z;
   }
}
