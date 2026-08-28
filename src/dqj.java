import com.mojang.serialization.MapCodec;

public class dqj extends djt {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final int b = 2;
   public static final dwd c = dvt.aq;
   private static final float g = 3.0F;
   private static final fab[] h = new fab[]{dhy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dhy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   public fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dwd b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected deu d() {
      return cwb.vk;
   }

   @Override
   public dvd b(int $$0) {
      return $$0 == 2 ? dia.bS.m() : super.b($$0);
   }

   @Override
   public void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dev $$0) {
      return 1;
   }
}
