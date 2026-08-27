import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ctd extends cwd {
   public static final dfs a = cwd.aC;
   @Nullable
   private dfd b;
   @Nullable
   private dfd c;
   @Nullable
   private dfd d;
   @Nullable
   private dfd e;
   private static final Predicate<dey> f = $$0 -> $$0 != null && ($$0.a(csl.ef) || $$0.a(csl.eg));

   protected ctd(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c));
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cpn $$0, gv $$1) {
      return this.a().a($$0, $$1) != null || this.u().a($$0, $$1) != null;
   }

   private void a(cpk $$0, gv $$1) {
      dfd.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bvg $$3 = bik.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dfd.b $$4 = this.v().a($$0, $$1);
         if ($$4 != null) {
            buu $$5 = bik.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cpk $$0, dfd.b $$1, big $$2, gv $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (akj $$4 : $$0.a(akj.class, $$2.cG().g(5.0))) {
         ai.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cpk $$0, dfd.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfc $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), csl.a.n(), 2);
            $$0.c(2001, $$4.d(), csk.i($$4.a()));
         }
      }
   }

   public static void b(cpk $$0, dfd.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfc $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), csl.a);
         }
      }
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   private dfd a() {
      if (this.b == null) {
         this.b = dfe.a().a(" ", "#", "#").a('#', dfc.a(dfh.a(csl.dP))).b();
      }

      return this.b;
   }

   private dfd g() {
      if (this.c == null) {
         this.c = dfe.a().a("^", "#", "#").a('^', dfc.a(f)).a('#', dfc.a(dfh.a(csl.dP))).b();
      }

      return this.c;
   }

   private dfd u() {
      if (this.d == null) {
         this.d = dfe.a().a("~ ~", "###", "~#~").a('#', dfc.a(dfh.a(csl.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.d;
   }

   private dfd v() {
      if (this.e == null) {
         this.e = dfe.a().a("~^~", "###", "~#~").a('^', dfc.a(f)).a('#', dfc.a(dfh.a(csl.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }
}
