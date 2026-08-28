import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfr extends dit {
   public static final MapCodec<dfr> a = b(dfr::new);
   public static final dsu b = dit.aE;
   @Nullable
   private dsf c;
   @Nullable
   private dsf d;
   @Nullable
   private dsf e;
   @Nullable
   private dsf f;
   private static final Predicate<dsa> g = $$0 -> $$0 != null && ($$0.a(dez.ee) || $$0.a(dez.ef));

   @Override
   public MapCodec<? extends dfr> a() {
      return a;
   }

   protected dfr(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dbz $$0, iz $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dbw $$0, iz $$1) {
      dsf.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cgb $$3 = bsy.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsf.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfp $$5 = bsy.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dbw $$0, dsf.b $$1, bss $$2, iz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arf $$4 : $$0.a(arf.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dbw $$0, dsf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dse $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dez.a.o(), 2);
            $$0.c(2001, $$4.d(), dex.i($$4.a()));
         }
      }
   }

   public static void b(dbw $$0, dsf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dse $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dez.a);
         }
      }
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   private dsf b() {
      if (this.c == null) {
         this.c = dsg.a().a(" ", "#", "#").a('#', dse.a(dsj.a(dez.dP))).b();
      }

      return this.c;
   }

   private dsf m() {
      if (this.d == null) {
         this.d = dsg.a().a("^", "#", "#").a('^', dse.a(g)).a('#', dse.a(dsj.a(dez.dP))).b();
      }

      return this.d;
   }

   private dsf y() {
      if (this.e == null) {
         this.e = dsg.a().a("~ ~", "###", "~#~").a('#', dse.a(dsj.a(dez.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsf z() {
      if (this.f == null) {
         this.f = dsg.a().a("~^~", "###", "~#~").a('^', dse.a(g)).a('#', dse.a(dsj.a(dez.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
