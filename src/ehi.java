import com.mojang.serialization.MapCodec;

public class ehi extends ehw {
   public static final MapCodec<ehi> a = bqa.b(0, 256).fieldOf("count").xmap(ehi::new, $$0 -> $$0.c);
   private final bqa c;

   private ehi(bqa $$0) {
      this.c = $$0;
   }

   public static ehi a(bqa $$0) {
      return new ehi($$0);
   }

   public static ehi a(int $$0) {
      return a(bpx.a($$0));
   }

   @Override
   protected int a(azh $$0, iz $$1) {
      return this.c.a($$0);
   }

   @Override
   public eht<?> b() {
      return eht.f;
   }
}
