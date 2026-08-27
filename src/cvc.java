import javax.annotation.Nullable;

public class cvc extends cwf {
   public static final dfy<dfl> I = dfq.U;

   protected cvc(dez.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cpp $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      for (ha $$1 : $$0.f()) {
         dfa $$2;
         if ($$1.o() == ha.a.b) {
            $$2 = this.n().a(I, $$1 == ha.b ? dfl.c : dfl.a).a(aC, $$0.g());
         } else {
            $$2 = this.n().a(I, dfl.b).a(aC, $$1.g());
         }

         if ($$2.a((cpp)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ha h(dfa $$0) {
      switch ((dfl)$$0.c(I)) {
         case c:
            return ha.a;
         case a:
            return ha.b;
         default:
            return $$0.c(aC);
      }
   }
}
