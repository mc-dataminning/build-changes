import com.mojang.serialization.MapCodec;

public class dkc extends djk {
   public static final MapCodec<dkc> a = b(dkc::new);
   protected static final fbs b = djk.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dkc> a() {
      return a;
   }

   public dkc(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return !$$1.u($$2.e());
   }
}
