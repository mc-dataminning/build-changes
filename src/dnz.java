import com.mojang.serialization.MapCodec;

public class dnz extends dke implements dri {
   public static final MapCodec<dnz> a = b(dnz::new);
   private static final fcm c = dke.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dye b = dyd.D;

   public dnz(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(b) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(etq.c)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
