import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ddy extends dha {
   public static final MapCodec<ddy> a = b(ddy::new);
   public static final drb b = dha.aE;
   @Nullable
   private dqm c;
   @Nullable
   private dqm d;
   @Nullable
   private dqm e;
   @Nullable
   private dqm f;
   private static final Predicate<dqh> g = $$0 -> $$0 != null && ($$0.a(ddg.ee) || $$0.a(ddg.ef));

   @Override
   public MapCodec<? extends ddy> a() {
      return a;
   }

   protected ddy(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c));
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dag $$0, in $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(dad $$0, in $$1) {
      dqm.b $$2 = this.k().a($$0, $$1);
      if ($$2 != null) {
         cen $$3 = brn.aR.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dqm.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ceb $$5 = brn.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dad $$0, dqm.b $$1, brh $$2, in $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqi $$4 : $$0.a(aqi.class, $$2.cI().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dad $$0, dqm.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dql $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), ddg.a.n(), 2);
            $$0.c(2001, $$4.d(), dde.i($$4.a()));
         }
      }
   }

   public static void b(dad $$0, dqm.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dql $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), ddg.a);
         }
      }
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   private dqm b() {
      if (this.c == null) {
         this.c = dqn.a().a(" ", "#", "#").a('#', dql.a(dqq.a(ddg.dP))).b();
      }

      return this.c;
   }

   private dqm k() {
      if (this.d == null) {
         this.d = dqn.a().a("^", "#", "#").a('^', dql.a(g)).a('#', dql.a(dqq.a(ddg.dP))).b();
      }

      return this.d;
   }

   private dqm s() {
      if (this.e == null) {
         this.e = dqn.a().a("~ ~", "###", "~#~").a('#', dql.a(dqq.a(ddg.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dqm y() {
      if (this.f == null) {
         this.f = dqn.a().a("~^~", "###", "~#~").a('^', dql.a(g)).a('#', dql.a(dqq.a(ddg.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
