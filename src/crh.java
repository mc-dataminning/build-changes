import javax.annotation.Nullable;

public abstract class crh extends crz {
   public static final dfu a = cwf.aC;
   public static final dfr b = dfq.r;

   protected crh(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         this.a($$1, $$2, $$3);
         return bgq.b;
      }
   }

   protected abstract void a(cpm var1, gu var2, cbn var3);

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof dcb) {
            ((dcb)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof dcb) {
            if ($$1 instanceof akk) {
               bgm.a($$1, $$2, (dcb)$$5);
               ((dcb)$$5).a((akk)$$1, ehe.b($$2));
            }

            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
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
   public cyr b_(dfa $$0) {
      return cyr.c;
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

   @Nullable
   protected static <T extends dcm> dcn<T> a(cpm $$0, dco<T> $$1, dco<? extends dcb> $$2) {
      return $$0.B ? null : a($$1, $$2, dcb::a);
   }
}
