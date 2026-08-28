import com.mojang.serialization.MapCodec;

public class dpv extends dje {
   public static final MapCodec<dpv> a = b(dpv::new);
   public static final int b = 2;
   public static final dvo c = dve.aq;
   private static final float g = 3.0F;
   private static final ezm[] h = new ezm[]{dhj.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dhj.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   public ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dvo b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected def d() {
      return cvt.vk;
   }

   @Override
   public duo b(int $$0) {
      return $$0 == 2 ? dhl.bS.o() : super.b($$0);
   }

   @Override
   public void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(deg $$0) {
      return 1;
   }
}
