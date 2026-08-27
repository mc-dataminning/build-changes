import com.mojang.serialization.Codec;

public class ebd extends ebr {
   public static final Codec<ebd> a = blq.b(0, 256).fieldOf("count").xmap(ebd::new, $$0 -> $$0.c).codec();
   private final blq c;

   private ebd(blq $$0) {
      this.c = $$0;
   }

   public static ebd a(blq $$0) {
      return new ebd($$0);
   }

   public static ebd a(int $$0) {
      return a(bln.a($$0));
   }

   @Override
   protected int a(awt $$0, ib $$1) {
      return this.c.a($$0);
   }

   @Override
   public ebo<?> b() {
      return ebo.f;
   }
}
