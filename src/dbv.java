import com.mojang.serialization.MapCodec;

public abstract class dbv extends dcq {
   private final crs a;

   protected dbv(crs $$0, dqg.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dbv> a();

   @Override
   public boolean a(dqh $$0) {
      return true;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnb($$0, $$1, this.a);
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return $$0.c_($$1) instanceof dnb $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public crs b() {
      return this.a;
   }
}
