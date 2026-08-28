import com.mojang.serialization.MapCodec;

public abstract class djc extends djm {
   protected static final int a = 2;
   protected static final fbu b = djm.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected djc(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djc> a();

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return a($$1, $$2.e(), jn.b);
   }
}
