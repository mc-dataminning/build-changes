import com.mojang.serialization.MapCodec;

public class dht extends djt {
   public static final MapCodec<dht> a = b(dht::new);
   public static final int b = 3;
   public static final dwd c = dvt.as;
   private static final fab[] g = new fab[]{
      dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected dwd b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected deu d() {
      return cwb.vn;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dev $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return g[this.h($$0)];
   }
}
