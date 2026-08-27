import com.mojang.serialization.Codec;

public class eag extends dzx {
   public static final Codec<eag> b = dnb.b.fieldOf("state").xmap(eag::new, $$0 -> $$0.c).codec();
   private final dnb c;

   protected eag(dnb $$0) {
      this.c = $$0;
   }

   @Override
   protected dzy<?> a() {
      return dzy.a;
   }

   @Override
   public dnb a(axd $$0, ib $$1) {
      return this.c;
   }
}
