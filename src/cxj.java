import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxj extends dak {
   public static final MapCodec<cxj> a = b(cxj::new);
   public static final dka b = dak.aE;
   @Nullable
   private djl c;
   @Nullable
   private djl d;
   @Nullable
   private djl e;
   @Nullable
   private djl f;
   private static final Predicate<djg> g = $$0 -> $$0 != null && ($$0.a(cwr.ee) || $$0.a(cwr.ef));

   @Override
   public MapCodec<? extends cxj> a() {
      return a;
   }

   protected cxj(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(ctr $$0, hx $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cto $$0, hx $$1) {
      djl.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         byv $$3 = bly.aP.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         djl.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            byj $$5 = bly.ad.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cto $$0, djl.b $$1, blu $$2, hx $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ane $$4 : $$0.a(ane.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cto $$0, djl.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            djk $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cwr.a.o(), 2);
            $$0.c(2001, $$4.d(), cwp.i($$4.a()));
         }
      }
   }

   public static void b(cto $$0, djl.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            djk $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cwr.a);
         }
      }
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   private djl b() {
      if (this.c == null) {
         this.c = djm.a().a(" ", "#", "#").a('#', djk.a(djp.a(cwr.dP))).b();
      }

      return this.c;
   }

   private djl g() {
      if (this.d == null) {
         this.d = djm.a().a("^", "#", "#").a('^', djk.a(g)).a('#', djk.a(djp.a(cwr.dP))).b();
      }

      return this.d;
   }

   private djl s() {
      if (this.e == null) {
         this.e = djm.a().a("~ ~", "###", "~#~").a('#', djk.a(djp.a(cwr.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private djl y() {
      if (this.f == null) {
         this.f = djm.a().a("~^~", "###", "~#~").a('^', djk.a(g)).a('#', djk.a(djp.a(cwr.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
