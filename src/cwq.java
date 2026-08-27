import javax.annotation.Nullable;

public class cwq extends csm implements czn {
   public static final dfr a = dfq.j;
   public static final dfr b = dfq.C;
   protected static final ehx c = ehu.a(csm.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), csm.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ehx d = ehu.a(csm.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), csm.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public cwq(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());

      for (ha $$2 : $$0.f()) {
         if ($$2.o() == ha.a.b) {
            dfa $$3 = this.n().a(a, Boolean.valueOf($$2 == ha.b));
            if ($$3.a((cpp)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == eae.c));
            }
         }
      }

      return null;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      ha $$3 = h($$0).g();
      return csm.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ha h(dfa $$0) {
      return $$0.c(a) ? ha.a : ha.b;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(b) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
