import com.mojang.serialization.MapCodec;

public class efl extends efc {
   public static final MapCodec<efl> b = dsb.b.fieldOf("state").xmap(efl::new, $$0 -> $$0.c);
   private final dsb c;

   protected efl(dsb $$0) {
      this.c = $$0;
   }

   @Override
   protected efd<?> a() {
      return efd.a;
   }

   @Override
   public dsb a(azg $$0, iz $$1) {
      return this.c;
   }
}
