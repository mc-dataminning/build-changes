import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dgq extends djs {
   public static final MapCodec<dgq> a = b(dgq::new);
   public static final dtu b = djs.aE;
   @Nullable
   private dtf c;
   @Nullable
   private dtf d;
   @Nullable
   private dtf e;
   @Nullable
   private dtf f;
   private static final Predicate<dta> g = $$0 -> $$0 != null && ($$0.a(dfy.ee) || $$0.a(dfy.ef));

   @Override
   public MapCodec<? extends dgq> a() {
      return a;
   }

   protected dgq(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcx $$0, jd $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dcu $$0, jd $$1) {
      dtf.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cga $$3 = bsw.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dtf.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfo $$5 = bsw.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dcu $$0, dtf.b $$1, bsq $$2, jd $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqu $$4 : $$0.a(aqu.class, $$2.cL().g(5.0))) {
         an.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dcu $$0, dtf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dte $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfy.a.o(), 2);
            $$0.c(2001, $$4.d(), dfw.i($$4.a()));
         }
      }
   }

   public static void b(dcu $$0, dtf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dte $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfy.a);
         }
      }
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   private dtf b() {
      if (this.c == null) {
         this.c = dtg.a().a(" ", "#", "#").a('#', dte.a(dtj.a(dfy.dP))).b();
      }

      return this.c;
   }

   private dtf m() {
      if (this.d == null) {
         this.d = dtg.a().a("^", "#", "#").a('^', dte.a(g)).a('#', dte.a(dtj.a(dfy.dP))).b();
      }

      return this.d;
   }

   private dtf y() {
      if (this.e == null) {
         this.e = dtg.a().a("~ ~", "###", "~#~").a('#', dte.a(dtj.a(dfy.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dtf z() {
      if (this.f == null) {
         this.f = dtg.a().a("~^~", "###", "~#~").a('^', dte.a(g)).a('#', dte.a(dtj.a(dfy.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
