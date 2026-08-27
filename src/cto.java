import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cto extends cwo {
   public static final dgd a = cwo.aC;
   @Nullable
   private dfo b;
   @Nullable
   private dfo c;
   @Nullable
   private dfo d;
   @Nullable
   private dfo e;
   private static final Predicate<dfj> f = $$0 -> $$0 != null && ($$0.a(csw.ef) || $$0.a(csw.eg));

   protected cto(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cpy $$0, gw $$1) {
      return this.a().a($$0, $$1) != null || this.u().a($$0, $$1) != null;
   }

   private void a(cpv $$0, gw $$1) {
      dfo.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bvp $$3 = biu.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dfo.b $$4 = this.v().a($$0, $$1);
         if ($$4 != null) {
            bvd $$5 = biu.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cpv $$0, dfo.b $$1, biq $$2, gw $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aks $$4 : $$0.a(aks.class, $$2.cG().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cpv $$0, dfo.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfn $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), csw.a.n(), 2);
            $$0.c(2001, $$4.d(), csv.i($$4.a()));
         }
      }
   }

   public static void b(cpv $$0, dfo.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfn $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), csw.a);
         }
      }
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   private dfo a() {
      if (this.b == null) {
         this.b = dfp.a().a(" ", "#", "#").a('#', dfn.a(dfs.a(csw.dP))).b();
      }

      return this.b;
   }

   private dfo g() {
      if (this.c == null) {
         this.c = dfp.a().a("^", "#", "#").a('^', dfn.a(f)).a('#', dfn.a(dfs.a(csw.dP))).b();
      }

      return this.c;
   }

   private dfo u() {
      if (this.d == null) {
         this.d = dfp.a().a("~ ~", "###", "~#~").a('#', dfn.a(dfs.a(csw.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.d;
   }

   private dfo v() {
      if (this.e == null) {
         this.e = dfp.a().a("~^~", "###", "~#~").a('^', dfn.a(f)).a('#', dfn.a(dfs.a(csw.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }
}
