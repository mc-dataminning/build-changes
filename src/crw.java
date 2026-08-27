import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class crw extends cso {
   public static final dfx a = cww.aE;
   public static final dfu b = dft.r;

   protected crw(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends crw> a();

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         this.a($$1, $$2, $$3);
         return bhe.b;
      }
   }

   protected abstract void a(cqb var1, gw var2, cca var3);

   @Override
   public dfd a(clt $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof dco) {
            ((dco)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof dco) {
            if ($$1 instanceof akt) {
               bha.a($$1, $$2, (dco)$$5);
               ((dco)$$5).a((akt)$$1, ehh.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return cer.a($$1.c_($$2));
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dcz> dda<T> a(cqb $$0, ddb<T> $$1, ddb<? extends dco> $$2) {
      return $$0.B ? null : a($$1, $$2, dco::a);
   }
}
