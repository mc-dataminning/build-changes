import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class des extends dhu {
   public static final MapCodec<des> a = b(des::new);
   public static final drv b = dhu.aE;
   @Nullable
   private drg c;
   @Nullable
   private drg d;
   @Nullable
   private drg e;
   @Nullable
   private drg f;
   private static final Predicate<drb> g = $$0 -> $$0 != null && ($$0.a(dea.ee) || $$0.a(dea.ef));

   @Override
   public MapCodec<? extends des> a() {
      return a;
   }

   protected des(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dba $$0, io $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(dax $$0, io $$1) {
      drg.b $$2 = this.l().a($$0, $$1);
      if ($$2 != null) {
         cfc $$3 = bsa.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         drg.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ceq $$5 = bsa.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dax $$0, drg.b $$1, bru $$2, io $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqn $$4 : $$0.a(aqn.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dax $$0, drg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            drf $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dea.a.n(), 2);
            $$0.c(2001, $$4.d(), ddy.i($$4.a()));
         }
      }
   }

   public static void b(dax $$0, drg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            drf $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dea.a);
         }
      }
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   private drg b() {
      if (this.c == null) {
         this.c = drh.a().a(" ", "#", "#").a('#', drf.a(drk.a(dea.dP))).b();
      }

      return this.c;
   }

   private drg l() {
      if (this.d == null) {
         this.d = drh.a().a("^", "#", "#").a('^', drf.a(g)).a('#', drf.a(drk.a(dea.dP))).b();
      }

      return this.d;
   }

   private drg s() {
      if (this.e == null) {
         this.e = drh.a().a("~ ~", "###", "~#~").a('#', drf.a(drk.a(dea.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private drg y() {
      if (this.f == null) {
         this.f = drh.a().a("~^~", "###", "~#~").a('^', drf.a(g)).a('#', drf.a(drk.a(dea.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
