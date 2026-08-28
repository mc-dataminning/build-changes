import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhc extends dfd {
   public static final MapCodec<dhc> a = b(dhc::new);
   public static final dsv<dst> b = dsn.ae;

   @Override
   public MapCodec<? extends dhc> a() {
      return a;
   }

   public dhc(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dst.b));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      dst $$6 = $$0.c(b);
      if ($$1.o() != je.a.b || $$6 == dst.b != ($$1 == je.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dst.b && $$1 == je.a && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dew.a.n();
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      iz $$1 = $$0.a();
      dbt $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      iz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, dst.a)), 3);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      if ($$0.c(b) != dst.a) {
         return super.a($$0, $$1, $$2);
      } else {
         drx $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dst.b;
      }
   }

   public static void a(dbu $$0, drx $$1, iz $$2, int $$3) {
      iz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dst.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dst.a)), $$3);
   }

   public static drx c(dbw $$0, iz $$1, drx $$2) {
      return $$2.b(dsn.C) ? $$2.a(dsn.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eX());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbt $$0, cms $$1, iz $$2, drx $$3, @Nullable dpc $$4, cuk $$5) {
      super.a($$0, $$1, $$2, dew.a.n(), $$4, $$5);
   }

   protected static void b(dbt $$0, iz $$1, drx $$2, cms $$3) {
      dst $$4 = $$2.c(b);
      if ($$4 == dst.a) {
         iz $$5 = $$1.d();
         drx $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dst.b) {
            drx $$7 = $$6.u().b(enr.c) ? dew.G.n() : dew.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, deu.i($$6));
         }
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(drx $$0, iz $$1) {
      return ayu.b($$1.u(), $$1.c($$0.c(b) == dst.b ? 0 : 1).v(), $$1.w());
   }
}
