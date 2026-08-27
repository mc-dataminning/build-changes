import com.mojang.serialization.MapCodec;

public class cuo extends cwn {
   public static final MapCodec<cuo> a = b(cuo::new);
   public static final int b = 3;
   public static final dhw c = dhm.as;
   private static final ekb[] g = new ekb[]{
      cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cuo> a() {
      return a;
   }

   public cuo(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected dhw b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected crr d() {
      return cle.us;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(crs $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return g[this.g($$0)];
   }
}
