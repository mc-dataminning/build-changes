import com.mojang.serialization.MapCodec;

public class efr extends efs {
   public static final efr a = new efr(dxp.a(0));
   public static final MapCodec<efr> b = dxp.a.fieldOf("value").xmap(efr::new, efr::b);
   private final dxp d;

   public static efr a(dxp $$0) {
      return new efr($$0);
   }

   private efr(dxp $$0) {
      this.d = $$0;
   }

   public dxp b() {
      return this.d;
   }

   @Override
   public int a(aym $$0, dxs $$1) {
      return this.d.a($$1);
   }

   @Override
   public eft<?> a() {
      return eft.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
