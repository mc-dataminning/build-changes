import com.mojang.serialization.MapCodec;

public abstract class dga extends dgv {
   private final cuj a;

   protected dga(cuj $$0, dun.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dga> a();

   @Override
   public boolean a(duo $$0) {
      return true;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new drh($$0, $$1, this.a);
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return $$0.c_($$1) instanceof drh $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cuj b() {
      return this.a;
   }
}
