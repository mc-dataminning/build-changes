import com.mojang.serialization.Codec;

public class eer extends een {
   public static final Codec<eer> a = aws.j.fieldOf("chance").xmap(eer::new, $$0 -> $$0.c).codec();
   private final int c;

   private eer(int $$0) {
      this.c = $$0;
   }

   public static eer a(int $$0) {
      return new eer($$0);
   }

   @Override
   protected boolean a(eem $$0, axr $$1, ib $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eep<?> b() {
      return eep.b;
   }
}
