import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dge extends dgv {
   public static final dvi a = dlf.aF;
   public static final dvf b = dve.r;

   protected dge(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jj.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dge> a();

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         this.a($$1, $$2, $$3);
      }

      return brp.a;
   }

   protected abstract void a(deg var1, je var2, cnu var3);

   @Override
   public duo a(czk $$0) {
      return this.o().b(a, $$0.g().g());
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drs $$5 = $$1.c_($$2);
         if ($$5 instanceof drg) {
            if ($$1 instanceof arh) {
               brl.a($$1, $$2, (drg)$$5);
               ((drg)$$5).a((arh)$$1, eys.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.a($$1.c_($$2));
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends drs> drt<T> a(deg $$0, dru<T> $$1, dru<? extends drg> $$2) {
      return $$0.B ? null : a($$1, $$2, drg::a);
   }
}
