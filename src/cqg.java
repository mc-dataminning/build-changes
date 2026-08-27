import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqg extends ctg {
   public static final dcv a = ctg.aC;
   @Nullable
   private dcg b;
   @Nullable
   private dcg c;
   @Nullable
   private dcg d;
   @Nullable
   private dcg e;
   private static final Predicate<dcb> f = $$0 -> $$0 != null && ($$0.a(cpo.ef) || $$0.a(cpo.eg));

   protected cqg(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cmp $$0, gu $$1) {
      return this.a().a($$0, $$1) != null || this.u().a($$0, $$1) != null;
   }

   private void a(cmm $$0, gu $$1) {
      dcg.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bsj $$3 = bfn.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dcg.b $$4 = this.v().a($$0, $$1);
         if ($$4 != null) {
            brx $$5 = bfn.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cmm $$0, dcg.b $$1, bfj $$2, gu $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aig $$4 : $$0.a(aig.class, $$2.cE().g(5.0))) {
         ai.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cmm $$0, dcg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dcf $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cpo.a.n(), 2);
            $$0.c(2001, $$4.d(), cpn.i($$4.a()));
         }
      }
   }

   public static void b(cmm $$0, dcg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dcf $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cpo.a);
         }
      }
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   private dcg a() {
      if (this.b == null) {
         this.b = dch.a().a(" ", "#", "#").a('#', dcf.a(dck.a(cpo.dP))).b();
      }

      return this.b;
   }

   private dcg g() {
      if (this.c == null) {
         this.c = dch.a().a("^", "#", "#").a('^', dcf.a(f)).a('#', dcf.a(dck.a(cpo.dP))).b();
      }

      return this.c;
   }

   private dcg u() {
      if (this.d == null) {
         this.d = dch.a().a("~ ~", "###", "~#~").a('#', dcf.a(dck.a(cpo.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.d;
   }

   private dcg v() {
      if (this.e == null) {
         this.e = dch.a().a("~^~", "###", "~#~").a('^', dcf.a(f)).a('#', dcf.a(dck.a(cpo.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }
}
