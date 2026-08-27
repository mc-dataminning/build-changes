import javax.annotation.Nullable;

public class cwp extends csm implements czn {
   public static final dfu a = cwf.aC;
   public static final dfr b = dfq.C;
   protected static final float c = 3.0F;
   protected static final ehx d = csm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ehx e = csm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehx f = csm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehx g = csm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected cwp(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      switch ((ha)$$0.c(a)) {
         case c:
            return g;
         case d:
            return f;
         case e:
            return e;
         case f:
         default:
            return d;
      }
   }

   private boolean a(cos $$0, gu $$1, ha $$2) {
      dfa $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csn.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eae.c, eae.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      if (!$$0.c()) {
         dfa $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(a) == $$0.k()) {
            return null;
         }
      }

      dfa $$2 = this.n();
      cpp $$3 = $$0.q();
      gu $$4 = $$0.a();
      ead $$5 = $$0.q().b_($$0.a());

      for (ha $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(a, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(b, Boolean.valueOf($$5.a() == eae.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(b) ? eae.c.a(false) : super.c_($$0);
   }
}
