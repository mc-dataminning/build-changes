import javax.annotation.Nullable;

public class czo extends csl implements czm {
   public static final dfx<dgh> a = dfp.bh;
   public static final dfq b = dfp.C;
   protected static final ehw c = csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ehw d = csl.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public czo(dey.d $$0) {
      super($$0);
      this.k(this.n().a(a, dgh.b).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dez $$0) {
      return $$0.c(a) != dgh.c;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      dgh $$4 = $$0.c(a);
      switch ($$4) {
         case c:
            return eht.b();
         case a:
            return d;
         default:
            return c;
      }
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      gu $$1 = $$0.a();
      dez $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(a, dgh.c).a(b, Boolean.valueOf(false));
      } else {
         eac $$3 = $$0.q().b_($$1);
         dez $$4 = this.n().a(a, dgh.b).a(b, Boolean.valueOf($$3.a() == ead.c));
         ha $$5 = $$0.k();
         return $$5 != ha.a && ($$5 == ha.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(a, dgh.a);
      }
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      cix $$2 = $$1.n();
      dgh $$3 = $$0.c(a);
      if ($$3 == dgh.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ha $$5 = $$1.k();
         return $$3 == dgh.b ? $$5 == ha.b || $$4 && $$5.o().d() : $$5 == ha.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cpm $$0, gu $$1, dez $$2, eac $$3) {
      return $$2.c(a) != dgh.c ? czm.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cbm $$0, cor $$1, gu $$2, dez $$3, eab $$4) {
      return $$3.c(a) != dgh.c ? czm.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(apq.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
