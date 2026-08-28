import com.mojang.serialization.MapCodec;

public class dpn extends dko {
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final int b = 3;
   public static final dym c = dyd.at;
   private static final fcm[] d = new fcm[]{
      dke.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   protected dpn(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(dkg.ej);
   }

   @Override
   protected boolean f(dxn $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(cxo.sX);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }
}
