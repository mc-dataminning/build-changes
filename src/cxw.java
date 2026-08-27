import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxw extends cyr {
   private final cog a;

   protected cxw(cog $$0, dmd.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cxw> a();

   @Override
   public boolean a(dme $$0) {
      return true;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djb($$0, $$1, this.a);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      if ($$0.B) {
         $$0.a($$1, djn.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.B()) {
         $$0.a($$1, djn.t).ifPresent($$1x -> $$1x.a($$4.z()));
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      djl $$3 = $$0.c_($$1);
      return $$3 instanceof djb ? ((djb)$$3).c() : super.a($$0, $$1, $$2);
   }

   public cog b() {
      return this.a;
   }
}
