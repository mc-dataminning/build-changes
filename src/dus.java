import com.mojang.serialization.Codec;

public class dus extends duo {
   public static final Codec<dus> a = arg.j.fieldOf("chance").xmap(dus::new, $$0 -> $$0.c).codec();
   private final int c;

   private dus(int $$0) {
      this.c = $$0;
   }

   public static dus a(int $$0) {
      return new dus($$0);
   }

   @Override
   protected boolean a(dun $$0, asc $$1, gw $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public duq<?> b() {
      return duq.b;
   }
}
