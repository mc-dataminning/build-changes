import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctw extends cur {
   private final ckc a;

   protected ctw(ckc $$0, dhm.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ctw> a();

   @Override
   public boolean a(dhn $$0) {
      return true;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dey($$0, $$1, this.a);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      if ($$0.B) {
         $$0.a($$1, dfk.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dfk.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      dfi $$3 = $$0.c_($$1);
      return $$3 instanceof dey ? ((dey)$$3).f() : super.a($$0, $$1, $$2);
   }

   public ckc b() {
      return this.a;
   }
}
