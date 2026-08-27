import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctj extends cuf {
   private final cjp a;

   protected ctj(cjp $$0, dgv.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ctj> a();

   @Override
   public boolean a(dgw $$0) {
      return true;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new deh($$0, $$1, this.a);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      if ($$0.B) {
         $$0.a($$1, det.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, det.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      der $$3 = $$0.c_($$1);
      return $$3 instanceof deh ? ((deh)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cjp b() {
      return this.a;
   }
}
