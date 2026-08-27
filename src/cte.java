import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cte extends cwe {
   public static final dft a = cwe.aC;
   @Nullable
   private dfe b;
   @Nullable
   private dfe c;
   @Nullable
   private dfe d;
   @Nullable
   private dfe e;
   private static final Predicate<dez> f = $$0 -> $$0 != null && ($$0.a(csm.ef) || $$0.a(csm.eg));

   protected cte(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cpo $$0, gu $$1) {
      return this.a().a($$0, $$1) != null || this.u().a($$0, $$1) != null;
   }

   private void a(cpl $$0, gu $$1) {
      dfe.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bvh $$3 = bim.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dfe.b $$4 = this.v().a($$0, $$1);
         if ($$4 != null) {
            buv $$5 = bim.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cpl $$0, dfe.b $$1, bii $$2, gu $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (akl $$4 : $$0.a(akl.class, $$2.cG().g(5.0))) {
         ai.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cpl $$0, dfe.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfd $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), csm.a.n(), 2);
            $$0.c(2001, $$4.d(), csl.i($$4.a()));
         }
      }
   }

   public static void b(cpl $$0, dfe.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfd $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), csm.a);
         }
      }
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   private dfe a() {
      if (this.b == null) {
         this.b = dff.a().a(" ", "#", "#").a('#', dfd.a(dfi.a(csm.dP))).b();
      }

      return this.b;
   }

   private dfe g() {
      if (this.c == null) {
         this.c = dff.a().a("^", "#", "#").a('^', dfd.a(f)).a('#', dfd.a(dfi.a(csm.dP))).b();
      }

      return this.c;
   }

   private dfe u() {
      if (this.d == null) {
         this.d = dff.a().a("~ ~", "###", "~#~").a('#', dfd.a(dfi.a(csm.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.d;
   }

   private dfe v() {
      if (this.e == null) {
         this.e = dff.a().a("~^~", "###", "~#~").a('^', dfd.a(f)).a('#', dfd.a(dfi.a(csm.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }
}
