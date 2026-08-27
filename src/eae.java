import com.mojang.serialization.Codec;

public class eae extends dzv {
   public static final Codec<eae> b = dmz.b.fieldOf("state").xmap(eae::new, $$0 -> $$0.c).codec();
   private final dmz c;

   protected eae(dmz $$0) {
      this.c = $$0;
   }

   @Override
   protected dzw<?> a() {
      return dzw.a;
   }

   @Override
   public dmz a(axd $$0, ib $$1) {
      return this.c;
   }
}
