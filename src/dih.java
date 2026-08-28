import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dih extends diy {
   public static final dxu<jn> a = dnk.aF;
   public static final dxo b = dxn.v;

   protected dih(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dih> a();

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsj.a;
   }

   protected abstract void a(dgi var1, ji var2, cox var3);

   @Override
   public dwx a(dag $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dtz $$5 = $$1.c_($$2);
         if ($$5 instanceof dtn) {
            if ($$1 instanceof arc) {
               bsf.a($$1, $$2, (dtn)$$5);
               ((dtn)$$5).a((arc)$$1, fba.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.a($$1.c_($$2));
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dtz> dua<T> a(dgi $$0, dub<T> $$1, dub<? extends dtn> $$2) {
      return $$0 instanceof arc $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dtn.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
