import com.mojang.serialization.MapCodec;

public class ego extends egp {
   public static final ego a = new ego(dym.a(0));
   public static final MapCodec<ego> b = dym.a.fieldOf("value").xmap(ego::new, ego::b);
   private final dym d;

   public static ego a(dym $$0) {
      return new ego($$0);
   }

   private ego(dym $$0) {
      this.d = $$0;
   }

   public dym b() {
      return this.d;
   }

   @Override
   public int a(azf $$0, dyp $$1) {
      return this.d.a($$1);
   }

   @Override
   public egq<?> a() {
      return egq.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
