import javax.annotation.Nullable;

public class cwb extends csm implements czn {
   private static final dfr b = dfq.C;
   protected static final ehx a = csm.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected cwb(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(b) ? eae.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = super.a($$0);
      if ($$1 != null) {
         ead $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == eae.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.c();
      dfa $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ha.a);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && !this.a($$0, $$3, $$4)) {
         return csn.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eae.c, eae.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
