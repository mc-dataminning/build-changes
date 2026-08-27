import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvp extends cwk {
   private final clv a;

   protected cvp(clv $$0, djo.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cvp> a();

   @Override
   public boolean a(djp $$0) {
      return true;
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dgt($$0, $$1, this.a);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      if ($$0.B) {
         $$0.a($$1, dhf.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dhf.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      dhd $$3 = $$0.c_($$1);
      return $$3 instanceof dgt ? ((dgt)$$3).f() : super.a($$0, $$1, $$2);
   }

   public clv b() {
      return this.a;
   }
}
