import javax.annotation.Nullable;

public abstract class crg extends cry {
   public static final dft a = cwe.aC;
   public static final dfq b = dfp.r;

   protected crg(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         this.a($$1, $$2, $$3);
         return bgq.b;
      }
   }

   protected abstract void a(cpl var1, gu var2, cbm var3);

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof dca) {
            ((dca)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcl $$5 = $$1.c_($$2);
         if ($$5 instanceof dca) {
            if ($$1 instanceof akk) {
               bgm.a($$1, $$2, (dca)$$5);
               ((dca)$$5).a((akk)$$1, ehd.b($$2));
            }

            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return ced.a($$1.c_($$2));
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dcl> dcm<T> a(cpl $$0, dcn<T> $$1, dcn<? extends dca> $$2) {
      return $$0.B ? null : a($$1, $$2, dca::a);
   }
}
