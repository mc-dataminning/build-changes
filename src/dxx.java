import com.mojang.serialization.Codec;

public class dxx extends dym {
   public static final Codec<dxx> a = dfa.b.fieldOf("block_state").xmap(dxx::new, $$0 -> $$0.b).codec();
   private final dfa b;

   public dxx(dfa $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfa $$0, aru $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dyn<?> a() {
      return dyn.c;
   }
}
