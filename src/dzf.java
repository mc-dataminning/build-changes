import com.mojang.serialization.Codec;

public class dzf extends dyx {
   public static final Codec<dzf> a = aqj.a(je.e).fieldOf("tag").xmap(dzf::new, $$0 -> $$0.b).codec();
   private final aqj<csx> b;

   public dzf(aqj<csx> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfl $$0, ase $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyy<?> a() {
      return dyy.d;
   }
}
