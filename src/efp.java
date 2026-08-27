import com.mojang.serialization.MapCodec;

public class efp extends efq {
   public static final efp a = new efp(dxn.a(0));
   public static final MapCodec<efp> b = dxn.a.fieldOf("value").xmap(efp::new, efp::b);
   private final dxn d;

   public static efp a(dxn $$0) {
      return new efp($$0);
   }

   private efp(dxn $$0) {
      this.d = $$0;
   }

   public dxn b() {
      return this.d;
   }

   @Override
   public int a(ayk $$0, dxq $$1) {
      return this.d.a($$1);
   }

   @Override
   public efr<?> a() {
      return efr.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
