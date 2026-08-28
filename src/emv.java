import com.mojang.serialization.MapCodec;

public class emv extends emr {
   public static final MapCodec<emv> a = ayi.m.fieldOf("chance").xmap(emv::new, $$0 -> $$0.c);
   private final int c;

   private emv(int $$0) {
      this.c = $$0;
   }

   public static emv a(int $$0) {
      return new emv($$0);
   }

   @Override
   protected boolean a(emq $$0, azh $$1, ji $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public emt<?> b() {
      return emt.b;
   }
}
