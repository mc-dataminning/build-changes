import com.mojang.serialization.MapCodec;

public class die extends djh {
   public static final MapCodec<die> a = b(die::new);
   private static final ezq[] b = new ezq[]{
      dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dur.d $$0) {
      super($$0);
   }

   @Override
   protected dei d() {
      return cvw.uh;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b[this.h($$0)];
   }
}
