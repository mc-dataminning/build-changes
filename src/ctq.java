import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ctq extends cwq {
   public static final dgf a = cwq.aC;
   @Nullable
   private dfq b;
   @Nullable
   private dfq c;
   @Nullable
   private dfq d;
   @Nullable
   private dfq e;
   private static final Predicate<dfl> f = $$0 -> $$0 != null && ($$0.a(csy.ef) || $$0.a(csy.eg));

   protected ctq(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cqa $$0, gw $$1) {
      return this.a().a($$0, $$1) != null || this.u().a($$0, $$1) != null;
   }

   private void a(cpx $$0, gw $$1) {
      dfq.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bvr $$3 = biw.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dfq.b $$4 = this.v().a($$0, $$1);
         if ($$4 != null) {
            bvf $$5 = biw.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cpx $$0, dfq.b $$1, bis $$2, gw $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (akt $$4 : $$0.a(akt.class, $$2.cG().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cpx $$0, dfq.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfp $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), csy.a.n(), 2);
            $$0.c(2001, $$4.d(), csx.i($$4.a()));
         }
      }
   }

   public static void b(cpx $$0, dfq.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfp $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), csy.a);
         }
      }
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   private dfq a() {
      if (this.b == null) {
         this.b = dfr.a().a(" ", "#", "#").a('#', dfp.a(dfu.a(csy.dP))).b();
      }

      return this.b;
   }

   private dfq g() {
      if (this.c == null) {
         this.c = dfr.a().a("^", "#", "#").a('^', dfp.a(f)).a('#', dfp.a(dfu.a(csy.dP))).b();
      }

      return this.c;
   }

   private dfq u() {
      if (this.d == null) {
         this.d = dfr.a().a("~ ~", "###", "~#~").a('#', dfp.a(dfu.a(csy.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.d;
   }

   private dfq v() {
      if (this.e == null) {
         this.e = dfr.a().a("~^~", "###", "~#~").a('^', dfp.a(f)).a('#', dfp.a(dfu.a(csy.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }
}
