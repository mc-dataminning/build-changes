import com.mojang.serialization.MapCodec;

public abstract class dja extends djk {
   protected static final int a = 2;
   protected static final fbs b = djk.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dja(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dja> a();

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return a($$1, $$2.e(), jn.b);
   }
}
