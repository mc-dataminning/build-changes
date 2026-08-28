import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfu extends diw {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final dsx b = diw.aE;
   @Nullable
   private dsi c;
   @Nullable
   private dsi d;
   @Nullable
   private dsi e;
   @Nullable
   private dsi f;
   private static final Predicate<dsd> g = $$0 -> $$0 != null && ($$0.a(dfc.ee) || $$0.a(dfc.ef));

   @Override
   public MapCodec<? extends dfu> a() {
      return a;
   }

   protected dfu(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcc $$0, iz $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dbz $$0, iz $$1) {
      dsi.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cge $$3 = btb.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsi.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfs $$5 = btb.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dbz $$0, dsi.b $$1, bsv $$2, iz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arg $$4 : $$0.a(arg.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dbz $$0, dsi.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsh $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfc.a.o(), 2);
            $$0.c(2001, $$4.d(), dfa.i($$4.a()));
         }
      }
   }

   public static void b(dbz $$0, dsi.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsh $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfc.a);
         }
      }
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   private dsi b() {
      if (this.c == null) {
         this.c = dsj.a().a(" ", "#", "#").a('#', dsh.a(dsm.a(dfc.dP))).b();
      }

      return this.c;
   }

   private dsi m() {
      if (this.d == null) {
         this.d = dsj.a().a("^", "#", "#").a('^', dsh.a(g)).a('#', dsh.a(dsm.a(dfc.dP))).b();
      }

      return this.d;
   }

   private dsi y() {
      if (this.e == null) {
         this.e = dsj.a().a("~ ~", "###", "~#~").a('#', dsh.a(dsm.a(dfc.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsi z() {
      if (this.f == null) {
         this.f = dsj.a().a("~^~", "###", "~#~").a('^', dsh.a(g)).a('#', dsh.a(dsm.a(dfc.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
