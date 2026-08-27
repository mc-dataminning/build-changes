import com.mojang.serialization.Codec;

public class ecm extends eci {
   public static final Codec<ecm> a = awe.k.fieldOf("chance").xmap(ecm::new, $$0 -> $$0.c).codec();
   private final int c;

   private ecm(int $$0) {
      this.c = $$0;
   }

   public static ecm a(int $$0) {
      return new ecm($$0);
   }

   @Override
   protected boolean a(ech $$0, axd $$1, ib $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eck<?> b() {
      return eck.b;
   }
}
