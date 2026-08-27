import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cuq extends cvl {
   private final ckv a;

   protected cuq(ckv $$0, dio.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cuq> a();

   @Override
   public boolean a(dip $$0) {
      return true;
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dft($$0, $$1, this.a);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      if ($$0.B) {
         $$0.a($$1, dgf.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dgf.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      dgd $$3 = $$0.c_($$1);
      return $$3 instanceof dft ? ((dft)$$3).f() : super.a($$0, $$1, $$2);
   }

   public ckv b() {
      return this.a;
   }
}
