import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvh extends cwc {
   private final clm a;

   protected cvh(clm $$0, djg.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cvh> a();

   @Override
   public boolean a(djh $$0) {
      return true;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgl($$0, $$1, this.a);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      if ($$0.B) {
         $$0.a($$1, dgx.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dgx.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      dgv $$3 = $$0.c_($$1);
      return $$3 instanceof dgl ? ((dgl)$$3).f() : super.a($$0, $$1, $$2);
   }

   public clm b() {
      return this.a;
   }
}
