import com.mojang.serialization.MapCodec;

public class eel extends eec {
   public static final MapCodec<eel> b = drb.b.fieldOf("state").xmap(eel::new, $$0 -> $$0.c);
   private final drb c;

   protected eel(drb $$0) {
      this.c = $$0;
   }

   @Override
   protected eed<?> a() {
      return eed.a;
   }

   @Override
   public drb a(ayk $$0, io $$1) {
      return this.c;
   }
}
