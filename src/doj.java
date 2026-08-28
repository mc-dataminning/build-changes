import com.mojang.serialization.MapCodec;

public class doj extends dkl {
   public static final MapCodec<doj> a = b(doj::new);
   private static final fas[] b = new fas[]{
      diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   public doj(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected dfl d() {
      return cwq.uy;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b[this.h($$0)];
   }
}
