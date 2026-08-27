import com.mojang.serialization.Codec;

public class eik extends ejb {
   public static final Codec<eik> a = kr.e.q().fieldOf("block").xmap(eik::new, $$0 -> $$0.b).codec();
   private final dby b;

   public eik(dby $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(doz $$0, axr $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ejc<?> a() {
      return ejc.b;
   }
}
