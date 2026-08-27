import com.mojang.serialization.MapCodec;

public class eko extends elf {
   public static final MapCodec<eko> a = le.e.q().fieldOf("block").xmap(eko::new, $$0 -> $$0.b);
   private final dea b;

   public eko(dea $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drd $$0, aym $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected elg<?> a() {
      return elg.b;
   }
}
