import javax.annotation.Nullable;

public class czp extends csm implements czn {
   public static final dfy<dgi> a = dfq.bh;
   public static final dfr b = dfq.C;
   protected static final ehx c = csm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ehx d = csm.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public czp(dez.d $$0) {
      super($$0);
      this.k(this.n().a(a, dgi.b).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfa $$0) {
      return $$0.c(a) != dgi.c;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      dgi $$4 = $$0.c(a);
      switch ($$4) {
         case c:
            return ehu.b();
         case a:
            return d;
         default:
            return c;
      }
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      gu $$1 = $$0.a();
      dfa $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(a, dgi.c).a(b, Boolean.valueOf(false));
      } else {
         ead $$3 = $$0.q().b_($$1);
         dfa $$4 = this.n().a(a, dgi.b).a(b, Boolean.valueOf($$3.a() == eae.c));
         ha $$5 = $$0.k();
         return $$5 != ha.a && ($$5 == ha.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(a, dgi.a);
      }
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      ciy $$2 = $$1.n();
      dgi $$3 = $$0.c(a);
      if ($$3 == dgi.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ha $$5 = $$1.k();
         return $$3 == dgi.b ? $$5 == ha.b || $$4 && $$5.o().d() : $$5 == ha.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(b) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cpn $$0, gu $$1, dfa $$2, ead $$3) {
      return $$2.c(a) != dgi.c ? czn.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cbn $$0, cos $$1, gu $$2, dfa $$3, eac $$4) {
      return $$3.c(a) != dgi.c ? czn.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
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
