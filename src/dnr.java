import com.mojang.serialization.MapCodec;

public class dnr extends djt {
   public static final MapCodec<dnr> a = b(dnr::new);
   private static final fab[] b = new fab[]{
      dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected deu d() {
      return cwb.ui;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b[this.h($$0)];
   }
}
