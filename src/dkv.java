import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkv extends dlm {
   public static final eax<ja> a = dqa.e;
   public static final eaq b = eap.u;

   protected dkv(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dkv> a();

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bub.a;
   }

   protected abstract void a(div var1, iu var2, cqy var3);

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.a($$1.c_($$2));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dwx> dwy<T> a(div $$0, dwz<T> $$1, dwz<? extends dwk> $$2) {
      return $$0 instanceof arq $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dwk.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
