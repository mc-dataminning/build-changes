import com.mojang.serialization.MapCodec;

public class eln extends elf {
   public static final MapCodec<eln> a = awm.a(lf.f).fieldOf("tag").xmap(eln::new, $$0 -> $$0.b);
   private final awm<dea> b;

   public eln(awm<dea> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drd $$0, aym $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected elg<?> a() {
      return elg.d;
   }
}
