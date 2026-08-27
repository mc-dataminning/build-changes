import com.mojang.serialization.Codec;

public class dtx extends dto {
   public static final Codec<dtx> b = dgw.b.fieldOf("state").xmap(dtx::new, $$0 -> $$0.c).codec();
   private final dgw c;

   protected dtx(dgw $$0) {
      this.c = $$0;
   }

   @Override
   protected dtp<?> a() {
      return dtp.a;
   }

   @Override
   public dgw a(ato $$0, ht $$1) {
      return this.c;
   }
}
