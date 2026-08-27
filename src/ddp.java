import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ddp extends dgr {
   public static final MapCodec<ddp> a = b(ddp::new);
   public static final dqs b = dgr.aE;
   @Nullable
   private dqd c;
   @Nullable
   private dqd d;
   @Nullable
   private dqd e;
   @Nullable
   private dqd f;
   private static final Predicate<dpy> g = $$0 -> $$0 != null && ($$0.a(dcx.ee) || $$0.a(dcx.ef));

   @Override
   public MapCodec<? extends ddp> a() {
      return a;
   }

   protected ddp(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c));
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(czx $$0, im $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(czu $$0, im $$1) {
      dqd.b $$2 = this.k().a($$0, $$1);
      if ($$2 != null) {
         cdr $$3 = bqr.aR.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dqd.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cdf $$5 = bqr.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(czu $$0, dqd.b $$1, bql $$2, im $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqf $$4 : $$0.a(aqf.class, $$2.cI().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(czu $$0, dqd.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dqc $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dcx.a.n(), 2);
            $$0.c(2001, $$4.d(), dcv.i($$4.a()));
         }
      }
   }

   public static void b(czu $$0, dqd.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dqc $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dcx.a);
         }
      }
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   private dqd b() {
      if (this.c == null) {
         this.c = dqe.a().a(" ", "#", "#").a('#', dqc.a(dqh.a(dcx.dP))).b();
      }

      return this.c;
   }

   private dqd k() {
      if (this.d == null) {
         this.d = dqe.a().a("^", "#", "#").a('^', dqc.a(g)).a('#', dqc.a(dqh.a(dcx.dP))).b();
      }

      return this.d;
   }

   private dqd s() {
      if (this.e == null) {
         this.e = dqe.a().a("~ ~", "###", "~#~").a('#', dqc.a(dqh.a(dcx.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dqd y() {
      if (this.f == null) {
         this.f = dqe.a().a("~^~", "###", "~#~").a('^', dqc.a(g)).a('#', dqc.a(dqh.a(dcx.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
