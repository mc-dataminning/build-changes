import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfz extends djb {
   public static final MapCodec<dfz> a = b(dfz::new);
   public static final dtb b = djb.aE;
   @Nullable
   private dsm c;
   @Nullable
   private dsm d;
   @Nullable
   private dsm e;
   @Nullable
   private dsm f;
   private static final Predicate<dsh> g = $$0 -> $$0 != null && ($$0.a(dfh.ee) || $$0.a(dfh.ef));

   @Override
   public MapCodec<? extends dfz> a() {
      return a;
   }

   protected dfz(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcg $$0, ja $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dcd $$0, ja $$1) {
      dsm.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cfm $$3 = bsj.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsm.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfa $$5 = bsj.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dcd $$0, dsm.b $$1, bsd $$2, ja $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aql $$4 : $$0.a(aql.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dcd $$0, dsm.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsl $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfh.a.o(), 2);
            $$0.c(2001, $$4.d(), dff.i($$4.a()));
         }
      }
   }

   public static void b(dcd $$0, dsm.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsl $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfh.a);
         }
      }
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   private dsm b() {
      if (this.c == null) {
         this.c = dsn.a().a(" ", "#", "#").a('#', dsl.a(dsq.a(dfh.dP))).b();
      }

      return this.c;
   }

   private dsm m() {
      if (this.d == null) {
         this.d = dsn.a().a("^", "#", "#").a('^', dsl.a(g)).a('#', dsl.a(dsq.a(dfh.dP))).b();
      }

      return this.d;
   }

   private dsm y() {
      if (this.e == null) {
         this.e = dsn.a().a("~ ~", "###", "~#~").a('#', dsl.a(dsq.a(dfh.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsm z() {
      if (this.f == null) {
         this.f = dsn.a().a("~^~", "###", "~#~").a('^', dsl.a(g)).a('#', dsl.a(dsq.a(dfh.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
