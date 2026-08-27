import com.mojang.serialization.MapCodec;

public abstract class dcp extends ddk {
   private final csh a;

   protected dcp(csh $$0, dra.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dcp> a();

   @Override
   public boolean a(drb $$0) {
      return true;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dnv($$0, $$1, this.a);
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return $$0.c_($$1) instanceof dnv $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public csh b() {
      return this.a;
   }
}
