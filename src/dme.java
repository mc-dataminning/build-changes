import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dfb implements dmc {
   public static final MapCodec<dme> a = b(dme::new);
   public static final dtc<dtm> b = dsu.bh;
   public static final dsv c = dsu.C;
   protected static final ewm d = dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ewm e = dfb.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dme> a() {
      return a;
   }

   public dme(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(b, dtm.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dse $$0) {
      return $$0.c(b) != dtm.c;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      dtm $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewj.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      iz $$1 = $$0.a();
      dse $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dtm.c).a(c, Boolean.valueOf(false));
      } else {
         enx $$3 = $$0.q().b_($$1);
         dse $$4 = this.o().a(b, dtm.b).a(c, Boolean.valueOf($$3.a() == eny.c));
         je $$5 = $$0.k();
         return $$5 != je.a && ($$5 == je.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dtm.a);
      }
   }

   @Override
   protected boolean a(dse $$0, cyc $$1) {
      cur $$2 = $$1.n();
      dtm $$3 = $$0.c(b);
      if ($$3 == dtm.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         je $$5 = $$1.k();
         return $$3 == dtm.b ? $$5 == je.b || $$4 && $$5.o().d() : $$5 == je.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      return $$2.c(b) != dtm.c ? dmc.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmz $$0, dbg $$1, iz $$2, dse $$3, enw $$4) {
      return $$3.c(b) != dtm.c ? dmc.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awv.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
