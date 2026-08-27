import javax.annotation.Nullable;

public class czn extends csk implements czl {
   public static final dfw<dgg> a = dfo.bh;
   public static final dfp b = dfo.C;
   protected static final ehy c = csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ehy d = csk.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public czn(dex.d $$0) {
      super($$0);
      this.k(this.n().a(a, dgg.b).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dey $$0) {
      return $$0.c(a) != dgg.c;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      dgg $$4 = $$0.c(a);
      switch ($$4) {
         case c:
            return ehv.b();
         case a:
            return d;
         default:
            return c;
      }
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      gv $$1 = $$0.a();
      dey $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(a, dgg.c).a(b, Boolean.valueOf(false));
      } else {
         eab $$3 = $$0.q().b_($$1);
         dey $$4 = this.n().a(a, dgg.b).a(b, Boolean.valueOf($$3.a() == eac.c));
         hb $$5 = $$0.k();
         return $$5 != hb.a && ($$5 == hb.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(a, dgg.a);
      }
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      ciw $$2 = $$1.n();
      dgg $$3 = $$0.c(a);
      if ($$3 == dgg.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         hb $$5 = $$1.k();
         return $$3 == dgg.b ? $$5 == hb.b || $$4 && $$5.o().d() : $$5 == hb.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cpl $$0, gv $$1, dey $$2, eab $$3) {
      return $$2.c(a) != dgg.c ? czl.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cbl $$0, coq $$1, gv $$2, dey $$3, eaa $$4) {
      return $$3.c(a) != dgg.c ? czl.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(apo.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
