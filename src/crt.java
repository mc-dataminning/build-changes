import javax.annotation.Nullable;

public class crt extends crz {
   public static final dfu a = dfq.P;
   public static final dfr b = dfq.u;

   public crt(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcm $$6 = $$1.c_($$2);
         if ($$6 instanceof dcf) {
            $$3.a((dcf)$$6);
            $$3.a(apg.ar);
            cae.a($$3, true);
         }

         return bgq.b;
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof bgj) {
            bgm.a($$1, $$2, (bgj)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      dcm $$4 = $$1.c_($$2);
      if ($$4 instanceof dcf) {
         ((dcf)$$4).i();
      }
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dcf($$0, $$1);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof dcf) {
            ((dcf)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return cee.a($$1.c_($$2));
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
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.d().g());
   }
}
