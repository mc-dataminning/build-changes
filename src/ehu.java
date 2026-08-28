import com.mojang.serialization.MapCodec;

public class ehu extends ehq {
   public static final MapCodec<ehu> a = ayh.l.fieldOf("chance").xmap(ehu::new, $$0 -> $$0.c);
   private final int c;

   private ehu(int $$0) {
      this.c = $$0;
   }

   public static ehu a(int $$0) {
      return new ehu($$0);
   }

   @Override
   protected boolean a(ehp $$0, azh $$1, iz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ehs<?> b() {
      return ehs.b;
   }
}
