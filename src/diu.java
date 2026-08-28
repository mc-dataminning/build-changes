import com.mojang.serialization.MapCodec;

public class diu extends diw {
   public static final MapCodec<diu> a = b(diu::new);
   private static final fbu b = djm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends diu> a() {
      return a;
   }

   protected diu(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }
}
