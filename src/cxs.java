import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxs extends dat {
   public static final MapCodec<cxs> a = b(cxs::new);
   public static final dkj b = dat.aE;
   @Nullable
   private dju c;
   @Nullable
   private dju d;
   @Nullable
   private dju e;
   @Nullable
   private dju f;
   private static final Predicate<djp> g = $$0 -> $$0 != null && ($$0.a(cxa.ee) || $$0.a(cxa.ef));

   @Override
   public MapCodec<? extends cxs> a() {
      return a;
   }

   protected cxs(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cua $$0, hx $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(ctx $$0, hx $$1) {
      dju.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bza $$3 = bmc.aQ.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dju.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            byo $$5 = bmc.ae.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(ctx $$0, dju.b $$1, blw $$2, hx $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (anf $$4 : $$0.a(anf.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(ctx $$0, dju.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            djt $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cxa.a.o(), 2);
            $$0.c(2001, $$4.d(), cwy.i($$4.a()));
         }
      }
   }

   public static void b(ctx $$0, dju.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            djt $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cxa.a);
         }
      }
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   private dju b() {
      if (this.c == null) {
         this.c = djv.a().a(" ", "#", "#").a('#', djt.a(djy.a(cxa.dP))).b();
      }

      return this.c;
   }

   private dju g() {
      if (this.d == null) {
         this.d = djv.a().a("^", "#", "#").a('^', djt.a(g)).a('#', djt.a(djy.a(cxa.dP))).b();
      }

      return this.d;
   }

   private dju s() {
      if (this.e == null) {
         this.e = djv.a().a("~ ~", "###", "~#~").a('#', djt.a(djy.a(cxa.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dju y() {
      if (this.f == null) {
         this.f = djv.a().a("~^~", "###", "~#~").a('^', djt.a(g)).a('#', djt.a(djy.a(cxa.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
