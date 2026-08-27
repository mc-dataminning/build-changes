import com.mojang.serialization.Codec;

public class dyi extends dyx {
   public static final Codec<dyi> a = dfl.b.fieldOf("block_state").xmap(dyi::new, $$0 -> $$0.b).codec();
   private final dfl b;

   public dyi(dfl $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfl $$0, ase $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dyy<?> a() {
      return dyy.c;
   }
}
