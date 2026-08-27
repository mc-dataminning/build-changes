import javax.annotation.Nullable;

public class cse extends crz implements csd {
   public cse(dez.d $$0) {
      super($$0);
   }

   @Override
   public chm a() {
      return chm.a;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dch($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.o, dch::a);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcm $$6 = $$1.c_($$2);
         if ($$6 instanceof dch) {
            $$3.a((dch)$$6);
            $$3.a(apg.ab);
         }

         return bgq.b;
      }
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof dch) {
            ((dch)$$5).a($$4.y());
         }
      }
   }
}
