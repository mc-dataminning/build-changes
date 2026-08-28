import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfv extends dix {
   public static final MapCodec<dfv> a = b(dfv::new);
   public static final dsy b = dix.aE;
   @Nullable
   private dsj c;
   @Nullable
   private dsj d;
   @Nullable
   private dsj e;
   @Nullable
   private dsj f;
   private static final Predicate<dse> g = $$0 -> $$0 != null && ($$0.a(dfd.ee) || $$0.a(dfd.ef));

   @Override
   public MapCodec<? extends dfv> a() {
      return a;
   }

   protected dfv(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcd $$0, iz $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dca $$0, iz $$1) {
      dsj.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cgf $$3 = btc.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsj.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cft $$5 = btc.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dca $$0, dsj.b $$1, bsw $$2, iz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arg $$4 : $$0.a(arg.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dca $$0, dsj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsi $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfd.a.o(), 2);
            $$0.c(2001, $$4.d(), dfb.i($$4.a()));
         }
      }
   }

   public static void b(dca $$0, dsj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsi $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfd.a);
         }
      }
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   private dsj b() {
      if (this.c == null) {
         this.c = dsk.a().a(" ", "#", "#").a('#', dsi.a(dsn.a(dfd.dP))).b();
      }

      return this.c;
   }

   private dsj m() {
      if (this.d == null) {
         this.d = dsk.a().a("^", "#", "#").a('^', dsi.a(g)).a('#', dsi.a(dsn.a(dfd.dP))).b();
      }

      return this.d;
   }

   private dsj y() {
      if (this.e == null) {
         this.e = dsk.a().a("~ ~", "###", "~#~").a('#', dsi.a(dsn.a(dfd.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsj z() {
      if (this.f == null) {
         this.f = dsk.a().a("~^~", "###", "~#~").a('^', dsi.a(g)).a('#', dsi.a(dsn.a(dfd.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
