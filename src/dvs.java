import com.mojang.serialization.Codec;

public class dvs extends dwg {
   public static final Codec<dvs> a = bhv.b(0, 256).fieldOf("count").xmap(dvs::new, $$0 -> $$0.c).codec();
   private final bhv c;

   private dvs(bhv $$0) {
      this.c = $$0;
   }

   public static dvs a(bhv $$0) {
      return new dvs($$0);
   }

   public static dvs a(int $$0) {
      return a(bhs.a($$0));
   }

   @Override
   protected int a(ato $$0, ht $$1) {
      return this.c.a($$0);
   }

   @Override
   public dwd<?> b() {
      return dwd.f;
   }
}
