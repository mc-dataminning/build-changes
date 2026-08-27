import com.mojang.serialization.Codec;

public class efl extends ega {
   public static final Codec<efl> a = dme.b.fieldOf("block_state").xmap(efl::new, $$0 -> $$0.b).codec();
   private final dme b;

   public efl(dme $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dme $$0, awt $$1) {
      return $$0 == this.b;
   }

   @Override
   protected egb<?> a() {
      return egb.c;
   }
}
