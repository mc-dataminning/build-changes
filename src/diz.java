import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diz extends djq {
   public static final dyk<jm> a = doc.aF;
   public static final dye b = dyd.r;

   protected diz(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends diz> a();

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bte.a;
   }

   protected abstract void a(dha var1, jh var2, cps var3);

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dup $$5 = $$1.c_($$2);
         if ($$5 instanceof dud) {
            if ($$1 instanceof ash) {
               bta.a($$1, $$2, (dud)$$5);
               ((dud)$$5).a((ash)$$1, fbs.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.a($$1.c_($$2));
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dup> duq<T> a(dha $$0, dur<T> $$1, dur<? extends dud> $$2) {
      return $$0 instanceof ash $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dud.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
