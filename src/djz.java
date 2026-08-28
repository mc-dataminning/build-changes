import com.mojang.serialization.MapCodec;

public class djz extends dmb {
   public static final MapCodec<djz> a = b(djz::new);
   public static final int b = 3;
   public static final dym c = dyd.at;
   private static final fcm[] g = new fcm[]{
      dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected dym b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dgz d() {
      return cxo.wb;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dha $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return g[this.h($$0)];
   }
}
