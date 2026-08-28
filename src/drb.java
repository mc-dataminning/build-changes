import com.mojang.serialization.MapCodec;

public class drb extends djk {
   public static final MapCodec<drb> a = b(drb::new);
   protected static final fbs b = djk.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return fbp.b();
   }

   @Override
   protected fbs c(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.b();
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      djr.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == jn.b && $$6.a(djm.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return 0.2F;
   }
}
