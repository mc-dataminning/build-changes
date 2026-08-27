import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxj extends cye {
   private final cnr a;

   protected cxj(cnr $$0, dli.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cxj> a();

   @Override
   public boolean a(dlj $$0) {
      return true;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new din($$0, $$1, this.a);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      if ($$0.B) {
         $$0.a($$1, diz.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.B()) {
         $$0.a($$1, diz.t).ifPresent($$1x -> $$1x.a($$4.z()));
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      dix $$3 = $$0.c_($$1);
      return $$3 instanceof din ? ((din)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cnr b() {
      return this.a;
   }
}
