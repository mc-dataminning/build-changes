import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfo extends diq {
   public static final MapCodec<dfo> a = b(dfo::new);
   public static final dsr b = diq.aE;
   @Nullable
   private dsc c;
   @Nullable
   private dsc d;
   @Nullable
   private dsc e;
   @Nullable
   private dsc f;
   private static final Predicate<drx> g = $$0 -> $$0 != null && ($$0.a(dew.ee) || $$0.a(dew.ef));

   @Override
   public MapCodec<? extends dfo> a() {
      return a;
   }

   protected dfo(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dbw $$0, iz $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(dbt $$0, iz $$1) {
      dsc.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cfy $$3 = bsv.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsc.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cfm $$5 = bsv.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dbt $$0, dsc.b $$1, bsp $$2, iz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arc $$4 : $$0.a(arc.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dbt $$0, dsc.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsb $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dew.a.n(), 2);
            $$0.c(2001, $$4.d(), deu.i($$4.a()));
         }
      }
   }

   public static void b(dbt $$0, dsc.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsb $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dew.a);
         }
      }
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   private dsc b() {
      if (this.c == null) {
         this.c = dsd.a().a(" ", "#", "#").a('#', dsb.a(dsg.a(dew.dP))).b();
      }

      return this.c;
   }

   private dsc m() {
      if (this.d == null) {
         this.d = dsd.a().a("^", "#", "#").a('^', dsb.a(g)).a('#', dsb.a(dsg.a(dew.dP))).b();
      }

      return this.d;
   }

   private dsc s() {
      if (this.e == null) {
         this.e = dsd.a().a("~ ~", "###", "~#~").a('#', dsb.a(dsg.a(dew.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsc y() {
      if (this.f == null) {
         this.f = dsd.a().a("~^~", "###", "~#~").a('^', dsb.a(g)).a('#', dsb.a(dsg.a(dew.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
