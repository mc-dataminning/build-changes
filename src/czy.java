import javax.annotation.Nullable;

public class czy extends csv implements czw {
   public static final dgh<dgr> a = dfz.bh;
   public static final dga b = dfz.C;
   protected static final eig c = csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eig d = csv.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public czy(dfi.d $$0) {
      super($$0);
      this.k(this.n().a(a, dgr.b).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfj $$0) {
      return $$0.c(a) != dgr.c;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      dgr $$4 = $$0.c(a);
      switch ($$4) {
         case c:
            return eid.b();
         case a:
            return d;
         default:
            return c;
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      gw $$1 = $$0.a();
      dfj $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(a, dgr.c).a(b, Boolean.valueOf(false));
      } else {
         eam $$3 = $$0.q().b_($$1);
         dfj $$4 = this.n().a(a, dgr.b).a(b, Boolean.valueOf($$3.a() == ean.c));
         ha $$5 = $$0.k();
         return $$5 != ha.a && ($$5 == ha.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(a, dgr.a);
      }
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      cjf $$2 = $$1.n();
      dgr $$3 = $$0.c(a);
      if ($$3 == dgr.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ha $$5 = $$1.k();
         return $$3 == dgr.b ? $$5 == ha.b || $$4 && $$5.o().d() : $$5 == ha.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cpw $$0, gw $$1, dfj $$2, eam $$3) {
      return $$2.c(a) != dgr.c ? czw.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cbu $$0, cpb $$1, gw $$2, dfj $$3, eal $$4) {
      return $$3.c(a) != dgr.c ? czw.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(apx.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
