import com.mojang.serialization.Codec;

public class dyu extends dym {
   public static final Codec<dyu> a = aqa.a(jc.e).fieldOf("tag").xmap(dyu::new, $$0 -> $$0.b).codec();
   private final aqa<csm> b;

   public dyu(aqa<csm> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfa $$0, aru $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyn<?> a() {
      return dyn.d;
   }
}
