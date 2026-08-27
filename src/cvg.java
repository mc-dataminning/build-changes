import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvg extends cwb {
   private final cll a;

   protected cvg(cll $$0, djf.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cvg> a();

   @Override
   public boolean a(djg $$0) {
      return true;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgk($$0, $$1, this.a);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      if ($$0.B) {
         $$0.a($$1, dgw.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dgw.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      dgu $$3 = $$0.c_($$1);
      return $$3 instanceof dgk ? ((dgk)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cll b() {
      return this.a;
   }
}
