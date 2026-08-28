import com.mojang.serialization.MapCodec;

public class ehc extends ehq {
   public static final MapCodec<ehc> a = bpu.b(0, 256).fieldOf("count").xmap(ehc::new, $$0 -> $$0.c);
   private final bpu c;

   private ehc(bpu $$0) {
      this.c = $$0;
   }

   public static ehc a(bpu $$0) {
      return new ehc($$0);
   }

   public static ehc a(int $$0) {
      return a(bpr.a($$0));
   }

   @Override
   protected int a(azc $$0, iz $$1) {
      return this.c.a($$0);
   }

   @Override
   public ehn<?> b() {
      return ehn.f;
   }
}
