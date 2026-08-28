import com.mojang.serialization.MapCodec;

public class diw extends djz {
   public static final MapCodec<diw> a = b(diw::new);
   private static final fah[] b = new fah[]{
      die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected dfa d() {
      return cwf.uh;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b[this.h($$0)];
   }
}
