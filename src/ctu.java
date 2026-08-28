import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctu extends ctc {
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
   private final cto y;
   private final cpw z;
   private boolean A;

   public ctu(int $$0, cpv $$1) {
      this($$0, $$1, cto.a);
   }

   public ctu(int $$0, cpv $$1, cto $$2) {
      super(cuk.m, $$0, 3, 3);
      this.y = $$2;
      this.z = $$1.k;
      this.a(this.z, 124, 35);
      this.d(30, 17);
      this.c($$1, 8, 84);
   }

   protected static void a(ctb $$0, ash $$1, cpw $$2, ctt $$3, cut $$4, @Nullable dci<dbs> $$5) {
      dbr $$6 = $$3.aC_();
      asi $$7 = (asi)$$2;
      cxo $$8 = cxo.k;
      Optional<dci<dbs>> $$9 = $$1.p().aI().a(dco.a, $$6, $$1, $$5);
      if ($$9.isPresent()) {
         dci<dbs> $$10 = $$9.get();
         dbs $$11 = $$10.b();
         if ($$4.a($$7, $$10)) {
            cxo $$12 = $$11.a($$6, $$1.K_());
            if ($$12.a($$1.J())) {
               $$8 = $$12;
            }
         }
      }

      $$4.a(0, $$8);
      $$0.a(0, $$8);
      $$7.f.b(new ado($$0.l, $$0.k(), 0, $$8));
   }

   @Override
   public void a(btb $$0) {
      if (!this.A) {
         this.y.a(($$0x, $$1) -> {
            if ($$0x instanceof ash $$2) {
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
   public void a(ash $$0, dci<dbs> $$1) {
      this.A = false;
      a(this, $$0, this.z, this.m, this.n, $$1);
   }

   @Override
   public void a(cpw $$0) {
      super.a($$0);
      this.y.a(($$1, $$2) -> this.a($$0, this.m));
   }

   @Override
   public boolean b(cpw $$0) {
      return a(this.y, $$0, dkn.cI);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.k;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            this.y.a(($$2x, $$3x) -> $$4.h().a($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cxo.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cxo.k;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cxo.k;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cxo.k;
         }

         if ($$4.f()) {
            $$3.e(cxo.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxo.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxo $$0, cuy $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cuy m() {
      return this.k.get(0);
   }

   @Override
   public List<cuy> n() {
      return this.k.subList(1, 10);
   }

   @Override
   public cur an_() {
      return cur.a;
   }

   @Override
   protected cpw q() {
      return this.z;
   }
}
