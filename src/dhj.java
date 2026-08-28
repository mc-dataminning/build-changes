import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhj extends dfk {
   public static final MapCodec<dhj> a = b(dhj::new);
   public static final dtc<dta> b = dsu.ae;

   @Override
   public MapCodec<? extends dhj> a() {
      return a;
   }

   public dhj(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dta.b));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      dta $$6 = $$0.c(b);
      if ($$1.o() != je.a.b || $$6 == dta.b != ($$1 == je.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dta.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfd.a.o();
      }
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      iz $$1 = $$0.a();
      dca $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
      iz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dta.a)), 3);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      if ($$0.c(b) != dta.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dse $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dta.b;
      }
   }

   public static void a(dcb $$0, dse $$1, iz $$2, int $$3) {
      iz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dta.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dta.a)), $$3);
   }

   public static dse c(dcd $$0, iz $$1, dse $$2) {
      return $$2.b(dsu.C) ? $$2.a(dsu.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
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
   public void a(dca $$0, cmz $$1, iz $$2, dse $$3, @Nullable dpj $$4, cur $$5) {
      super.a($$0, $$1, $$2, dfd.a.o(), $$4, $$5);
   }

   protected static void b(dca $$0, iz $$1, dse $$2, cmz $$3) {
      dta $$4 = $$2.c(b);
      if ($$4 == dta.a) {
         iz $$5 = $$1.d();
         dse $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dta.b) {
            dse $$7 = $$6.u().b(eny.c) ? dfd.G.o() : dfd.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dfb.i($$6));
         }
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dse $$0, iz $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(b) == dta.b ? 0 : 1).v(), $$1.w());
   }
}
