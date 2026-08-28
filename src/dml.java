import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dml extends dfi implements dmj {
   public static final MapCodec<dml> a = b(dml::new);
   public static final dtj<dtt> b = dtb.bh;
   public static final dtc c = dtb.C;
   protected static final exa d = dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final exa e = dfi.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dml> a() {
      return a;
   }

   public dml(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(b, dtt.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsl $$0) {
      return $$0.c(b) != dtt.c;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      dtt $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewx.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      ja $$1 = $$0.a();
      dsl $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dtt.c).a(c, Boolean.valueOf(false));
      } else {
         eoj $$3 = $$0.q().b_($$1);
         dsl $$4 = this.o().a(b, dtt.b).a(c, Boolean.valueOf($$3.a() == eok.c));
         jf $$5 = $$0.k();
         return $$5 != jf.a && ($$5 == jf.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dtt.a);
      }
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      cud $$2 = $$1.n();
      dtt $$3 = $$0.c(b);
      if ($$3 == dtt.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         jf $$5 = $$1.k();
         return $$3 == dtt.b ? $$5 == jf.b || $$4 && $$5.o().d() : $$5 == jf.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      return $$2.c(b) != dtt.c ? dmj.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cml $$0, dbm $$1, ja $$2, dsl $$3, eoi $$4) {
      return $$3.c(b) != dtt.c ? dmj.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awc.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
