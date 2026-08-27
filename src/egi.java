import com.mojang.serialization.Codec;

public class egi extends ega {
   public static final Codec<egi> a = aut.a(ki.f).fieldOf("tag").xmap(egi::new, $$0 -> $$0.b).codec();
   private final aut<czf> b;

   public egi(aut<czf> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dme $$0, awt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected egb<?> a() {
      return egb.d;
   }
}
