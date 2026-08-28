import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhf extends dfg {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final dsy<dsw> b = dsq.ae;

   @Override
   public MapCodec<? extends dhf> a() {
      return a;
   }

   public dhf(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsw.b));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      dsw $$6 = $$0.c(b);
      if ($$1.o() != je.a.b || $$6 == dsw.b != ($$1 == je.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dsw.b && $$1 == je.a && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dez.a.o();
      }
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      iz $$1 = $$0.a();
      dbw $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
      iz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dsw.a)), 3);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      if ($$0.c(b) != dsw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dsa $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dsw.b;
      }
   }

   public static void a(dbx $$0, dsa $$1, iz $$2, int $$3) {
      iz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dsw.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dsw.a)), $$3);
   }

   public static dsa c(dbz $$0, iz $$1, dsa $$2) {
      return $$2.b(dsq.C) ? $$2.a(dsq.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
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
   public void a(dbw $$0, cmv $$1, iz $$2, dsa $$3, @Nullable dpf $$4, cun $$5) {
      super.a($$0, $$1, $$2, dez.a.o(), $$4, $$5);
   }

   protected static void b(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      dsw $$4 = $$2.c(b);
      if ($$4 == dsw.a) {
         iz $$5 = $$1.d();
         dsa $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dsw.b) {
            dsa $$7 = $$6.u().b(enu.c) ? dez.G.o() : dez.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dex.i($$6));
         }
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dsa $$0, iz $$1) {
      return ayx.b($$1.u(), $$1.c($$0.c(b) == dsw.b ? 0 : 1).v(), $$1.w());
   }
}
