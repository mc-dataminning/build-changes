import com.mojang.serialization.Codec;

public class egj extends egy {
   public static final Codec<egj> a = dnb.b.fieldOf("block_state").xmap(egj::new, $$0 -> $$0.b).codec();
   private final dnb b;

   public egj(dnb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dnb $$0, axd $$1) {
      return $$0 == this.b;
   }

   @Override
   protected egz<?> a() {
      return egz.c;
   }
}
