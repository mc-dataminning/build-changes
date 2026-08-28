import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnq extends dna implements dod {
   public static final MapCodec<dnq> c = b(dnq::new);
   protected static final fbs g = djk.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dnq> a() {
      return c;
   }

   protected dnq(dwu.d $$0) {
      super($$0, jn.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dwv $$0) {
      return $$0.a(djm.J);
   }

   @Override
   protected djk b() {
      return djm.mF;
   }

   @Override
   protected boolean o(dwv $$0) {
      return !$$0.a(djm.ll);
   }

   @Override
   public boolean a(@Nullable cov $$0, dfl $$1, ji $$2, dwv $$3, esw $$4) {
      return false;
   }

   @Override
   public boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      return false;
   }

   @Override
   protected int a(azg $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return $$1.a(awu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected esx b_(dwv $$0) {
      return esy.c.a(false);
   }
}
