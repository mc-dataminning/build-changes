import com.mojang.serialization.MapCodec;

public class ekq extends elf {
   public static final MapCodec<ekq> a = drd.b.fieldOf("block_state").xmap(ekq::new, $$0 -> $$0.b);
   private final drd b;

   public ekq(drd $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drd $$0, aym $$1) {
      return $$0 == this.b;
   }

   @Override
   protected elg<?> a() {
      return elg.c;
   }
}
