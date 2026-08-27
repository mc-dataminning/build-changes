import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyr extends czm {
   private final cpb a;

   protected cyr(cpb $$0, dmy.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cyr> a();

   @Override
   public boolean a(dmz $$0) {
      return true;
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new djw($$0, $$1, this.a);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      if ($$0.B) {
         $$0.a($$1, dki.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.B()) {
         $$0.a($$1, dki.t).ifPresent($$1x -> $$1x.a($$4.z()));
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      dkg $$3 = $$0.c_($$1);
      return $$3 instanceof djw ? ((djw)$$3).c() : super.a($$0, $$1, $$2);
   }

   public cpb b() {
      return this.a;
   }
}
