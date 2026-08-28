import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhh extends dfi {
   public static final MapCodec<dhh> a = b(dhh::new);
   public static final dta<dsy> b = dss.ae;

   @Override
   public MapCodec<? extends dhh> a() {
      return a;
   }

   public dhh(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsy.b));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      dsy $$6 = $$0.c(b);
      if ($$1.o() != je.a.b || $$6 == dsy.b != ($$1 == je.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dsy.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfb.a.o();
      }
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      iz $$1 = $$0.a();
      dby $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, btp $$3, cup $$4) {
      iz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dsy.a)), 3);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      if ($$0.c(b) != dsy.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dsc $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dsy.b;
      }
   }

   public static void a(dbz $$0, dsc $$1, iz $$2, int $$3) {
      iz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dsy.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dsy.a)), $$3);
   }

   public static dsc c(dcb $$0, iz $$1, dsc $$2) {
      return $$2.b(dss.C) ? $$2.a(dss.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
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
   public void a(dby $$0, cmx $$1, iz $$2, dsc $$3, @Nullable dph $$4, cup $$5) {
      super.a($$0, $$1, $$2, dfb.a.o(), $$4, $$5);
   }

   protected static void b(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      dsy $$4 = $$2.c(b);
      if ($$4 == dsy.a) {
         iz $$5 = $$1.d();
         dsc $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dsy.b) {
            dsc $$7 = $$6.u().b(enw.c) ? dfb.G.o() : dfb.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dez.i($$6));
         }
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dsc $$0, iz $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(b) == dsy.b ? 0 : 1).v(), $$1.w());
   }
}
