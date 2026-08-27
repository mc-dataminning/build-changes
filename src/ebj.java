import com.mojang.serialization.Codec;

public class ebj extends ebb {
   public static final Codec<ebj> a = arv.a(jz.e).fieldOf("tag").xmap(ebj::new, $$0 -> $$0.b).codec();
   private final arv<cva> b;

   public ebj(arv<cva> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dhi $$0, ats $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ebc<?> a() {
      return ebc.d;
   }
}
