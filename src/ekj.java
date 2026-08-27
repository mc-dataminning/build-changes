import com.mojang.serialization.MapCodec;

public class ekj extends elf {
   public static final MapCodec<ekj> a = MapCodec.unit(() -> ekj.b);
   public static final ekj b = new ekj();

   private ekj() {
   }

   @Override
   public boolean a(drd $$0, aym $$1) {
      return true;
   }

   @Override
   protected elg<?> a() {
      return elg.a;
   }
}
