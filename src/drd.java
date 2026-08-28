import com.mojang.serialization.MapCodec;

public class drd extends djm {
   public static final MapCodec<drd> a = b(drd::new);
   protected static final fbu b = djm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   public drd(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected fbu b_(dwx $$0, dfn $$1, ji $$2) {
      return fbr.b();
   }

   @Override
   protected fbu c(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return fbr.b();
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      djt.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(djo.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   protected float c(dwx $$0, dfn $$1, ji $$2) {
      return 0.2F;
   }
}
