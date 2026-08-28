import com.mojang.serialization.MapCodec;

public class els extends elo {
   public static final MapCodec<els> a = ayv.m.fieldOf("chance").xmap(els::new, $$0 -> $$0.c);
   private final int c;

   private els(int $$0) {
      this.c = $$0;
   }

   public static els a(int $$0) {
      return new els($$0);
   }

   @Override
   protected boolean a(eln $$0, azu $$1, jh $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public elq<?> b() {
      return elq.b;
   }
}
