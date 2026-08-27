import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxk extends dal {
   public static final MapCodec<cxk> a = b(cxk::new);
   public static final dkb b = dal.aE;
   @Nullable
   private djm c;
   @Nullable
   private djm d;
   @Nullable
   private djm e;
   @Nullable
   private djm f;
   private static final Predicate<djh> g = $$0 -> $$0 != null && ($$0.a(cws.ee) || $$0.a(cws.ef));

   @Override
   public MapCodec<? extends cxk> a() {
      return a;
   }

   protected cxk(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cts $$0, hx $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(ctp $$0, hx $$1) {
      djm.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         byw $$3 = blz.aP.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         djm.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            byk $$5 = blz.ad.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(ctp $$0, djm.b $$1, blv $$2, hx $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ane $$4 : $$0.a(ane.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(ctp $$0, djm.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            djl $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cws.a.o(), 2);
            $$0.c(2001, $$4.d(), cwq.i($$4.a()));
         }
      }
   }

   public static void b(ctp $$0, djm.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            djl $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cws.a);
         }
      }
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   private djm b() {
      if (this.c == null) {
         this.c = djn.a().a(" ", "#", "#").a('#', djl.a(djq.a(cws.dP))).b();
      }

      return this.c;
   }

   private djm g() {
      if (this.d == null) {
         this.d = djn.a().a("^", "#", "#").a('^', djl.a(g)).a('#', djl.a(djq.a(cws.dP))).b();
      }

      return this.d;
   }

   private djm s() {
      if (this.e == null) {
         this.e = djn.a().a("~ ~", "###", "~#~").a('#', djl.a(djq.a(cws.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private djm y() {
      if (this.f == null) {
         this.f = djn.a().a("~^~", "###", "~#~").a('^', djl.a(g)).a('#', djl.a(djq.a(cws.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
