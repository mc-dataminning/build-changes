import com.mojang.serialization.MapCodec;

public class ddd extends cwn {
   public static final MapCodec<ddd> a = b(ddd::new);
   public static final int b = 2;
   public static final dhw c = dhm.aq;
   private static final float g = 3.0F;
   private static final ekb[] h = new ekb[]{cut.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cut.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<ddd> a() {
      return a;
   }

   public ddd(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dhw b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected crr d() {
      return cle.up;
   }

   @Override
   public dgw b(int $$0) {
      return $$0 == 2 ? cuv.bS.o() : super.b($$0);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(crs $$0) {
      return 1;
   }
}
