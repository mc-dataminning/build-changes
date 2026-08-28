import com.mojang.serialization.MapCodec;

public class dlp extends djk {
   public static final MapCodec<dlp> a = b(dlp::new);
   protected static final fbs b = dmi.c;

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   protected dlp(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   public dwv a(dae $$0) {
      return !this.m().a((dgj)$$0.q(), $$0.a()) ? djk.a(this.m(), djm.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      dmi.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dmk;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
