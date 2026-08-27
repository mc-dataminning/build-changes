import javax.annotation.Nullable;

public class crx extends csm implements czn {
   public static final dfr c = dfq.C;
   private static final ehx a = csm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected crx(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Boolean.valueOf(true)));
   }

   protected void a(dfa $$0, cpn $$1, gu $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.y_().a(40));
      }
   }

   protected static boolean e(dfa $$0, cos $$1, gu $$2) {
      if ($$0.c(c)) {
         return true;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$1.b_($$2.a($$3)).a(apq.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, Boolean.valueOf($$1.a(apq.a) && $$1.e() == 8));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$1 == ha.a && !this.a($$0, (cpp)$$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(c);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(c) ? eae.c.a(false) : super.c_($$0);
   }
}
