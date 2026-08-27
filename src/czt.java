import javax.annotation.Nullable;

public class czt extends csq implements czr {
   public static final dgc<dgm> a = dfu.bh;
   public static final dfv b = dfu.C;
   protected static final eib c = csq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eib d = csq.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public czt(dfd.d $$0) {
      super($$0);
      this.k(this.n().a(a, dgm.b).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfe $$0) {
      return $$0.c(a) != dgm.c;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      dgm $$4 = $$0.c(a);
      switch ($$4) {
         case c:
            return ehy.b();
         case a:
            return d;
         default:
            return c;
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      gw $$1 = $$0.a();
      dfe $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(a, dgm.c).a(b, Boolean.valueOf(false));
      } else {
         eah $$3 = $$0.q().b_($$1);
         dfe $$4 = this.n().a(a, dgm.b).a(b, Boolean.valueOf($$3.a() == eai.c));
         hc $$5 = $$0.k();
         return $$5 != hc.a && ($$5 == hc.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(a, dgm.a);
      }
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      cja $$2 = $$1.n();
      dgm $$3 = $$0.c(a);
      if ($$3 == dgm.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         hc $$5 = $$1.k();
         return $$3 == dgm.b ? $$5 == hc.b || $$4 && $$5.o().d() : $$5 == hc.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cpr $$0, gw $$1, dfe $$2, eah $$3) {
      return $$2.c(a) != dgm.c ? czr.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cbp $$0, cow $$1, gw $$2, dfe $$3, eag $$4) {
      return $$3.c(a) != dgm.c ? czr.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(apt.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
