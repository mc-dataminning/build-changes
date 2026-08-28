import com.mojang.serialization.MapCodec;

public class dlr extends djm {
   public static final MapCodec<dlr> a = b(dlr::new);
   protected static final fbu b = dmk.c;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   protected dlr(dww.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   public dwx a(dag $$0) {
      return !this.m().a((dgl)$$0.q(), $$0.a()) ? djm.a(this.m(), djo.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      dmk.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dmm;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
