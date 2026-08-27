import com.mojang.serialization.Codec;

public class dwj extends dwx {
   public static final Codec<dwj> a = big.b(0, 256).fieldOf("count").xmap(dwj::new, $$0 -> $$0.c).codec();
   private final big c;

   private dwj(big $$0) {
      this.c = $$0;
   }

   public static dwj a(big $$0) {
      return new dwj($$0);
   }

   public static dwj a(int $$0) {
      return a(bid.a($$0));
   }

   @Override
   protected int a(atw $$0, hx $$1) {
      return this.c.a($$0);
   }

   @Override
   public dwu<?> b() {
      return dwu.f;
   }
}
