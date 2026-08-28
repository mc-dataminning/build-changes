import com.mojang.serialization.MapCodec;

public abstract class djb extends djl {
   protected static final int a = 2;
   protected static final fbt b = djl.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected djb(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djb> a();

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return a($$1, $$2.e(), jn.b);
   }
}
