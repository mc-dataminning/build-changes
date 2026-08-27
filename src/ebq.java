import com.mojang.serialization.Codec;

public class ebq extends ebm {
   public static final Codec<ebq> a = avu.j.fieldOf("chance").xmap(ebq::new, $$0 -> $$0.c).codec();
   private final int c;

   private ebq(int $$0) {
      this.c = $$0;
   }

   public static ebq a(int $$0) {
      return new ebq($$0);
   }

   @Override
   protected boolean a(ebl $$0, awt $$1, ib $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ebo<?> b() {
      return ebo.b;
   }
}
