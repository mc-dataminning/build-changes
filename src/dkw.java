import com.mojang.serialization.MapCodec;

public abstract class dkw extends dlr {
   private final cyb a;

   protected dkw(cyb $$0, eag.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dkw> a();

   @Override
   public boolean a(eah $$0) {
      return true;
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dwt($$0, $$1, this.a);
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dwt $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cyb b() {
      return this.a;
   }
}
