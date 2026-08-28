import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgh extends dgy {
   public static final dvm a = dli.aF;
   public static final dvj b = dvi.r;

   protected dgh(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jk.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dgh> a();

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         this.a($$1, $$2, $$3);
      }

      return brs.a;
   }

   protected abstract void a(dej var1, jf var2, cnx var3);

   @Override
   public dus a(czn $$0) {
      return this.n().b(a, $$0.g().g());
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drv $$5 = $$1.c_($$2);
         if ($$5 instanceof drj) {
            if ($$1 instanceof arj) {
               bro.a($$1, $$2, (drj)$$5);
               ((drj)$$5).a((arj)$$1, eyw.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.a($$1.c_($$2));
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends drv> drw<T> a(dej $$0, drx<T> $$1, drx<? extends drj> $$2) {
      return $$0.B ? null : a($$1, $$2, drj::a);
   }
}
