import com.mojang.serialization.MapCodec;

public class dtk extends dko {
   public static final MapCodec<dtk> a = b(dtk::new);
   protected static final fcm b = dke.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   protected dtk(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ash && $$3 instanceof crp) {
         $$1.a(new jh($$2), true, $$3);
      }
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      etp $$3 = $$1.b_($$2);
      etp $$4 = $$1.b_($$2.d());
      return ($$3.a() == etq.c || $$0.b() instanceof doe) && $$4.a() == etq.a;
   }
}
