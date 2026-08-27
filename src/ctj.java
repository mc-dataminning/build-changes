import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ctj extends cwj {
   public static final dfy a = cwj.aC;
   @Nullable
   private dfj b;
   @Nullable
   private dfj c;
   @Nullable
   private dfj d;
   @Nullable
   private dfj e;
   private static final Predicate<dfe> f = $$0 -> $$0 != null && ($$0.a(csr.ef) || $$0.a(csr.eg));

   protected ctj(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cpt $$0, gw $$1) {
      return this.a().a($$0, $$1) != null || this.u().a($$0, $$1) != null;
   }

   private void a(cpq $$0, gw $$1) {
      dfj.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bvk $$3 = bip.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dfj.b $$4 = this.v().a($$0, $$1);
         if ($$4 != null) {
            buy $$5 = bip.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cpq $$0, dfj.b $$1, bil $$2, gw $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ako $$4 : $$0.a(ako.class, $$2.cG().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cpq $$0, dfj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfi $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), csr.a.n(), 2);
            $$0.c(2001, $$4.d(), csq.i($$4.a()));
         }
      }
   }

   public static void b(cpq $$0, dfj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfi $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), csr.a);
         }
      }
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   private dfj a() {
      if (this.b == null) {
         this.b = dfk.a().a(" ", "#", "#").a('#', dfi.a(dfn.a(csr.dP))).b();
      }

      return this.b;
   }

   private dfj g() {
      if (this.c == null) {
         this.c = dfk.a().a("^", "#", "#").a('^', dfi.a(f)).a('#', dfi.a(dfn.a(csr.dP))).b();
      }

      return this.c;
   }

   private dfj u() {
      if (this.d == null) {
         this.d = dfk.a().a("~ ~", "###", "~#~").a('#', dfi.a(dfn.a(csr.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.d;
   }

   private dfj v() {
      if (this.e == null) {
         this.e = dfk.a().a("~^~", "###", "~#~").a('^', dfi.a(f)).a('#', dfi.a(dfn.a(csr.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }
}
