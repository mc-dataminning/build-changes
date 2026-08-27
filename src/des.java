import com.mojang.serialization.MapCodec;

public class des extends dfv {
   public static final MapCodec<des> a = b(des::new);
   private static final evf[] b = new evf[]{
      dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(drc.d $$0) {
      super($$0);
   }

   @Override
   protected day d() {
      return ctt.uf;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b[this.g($$0)];
   }
}
