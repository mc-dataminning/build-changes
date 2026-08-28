import com.mojang.serialization.MapCodec;

public class emt extends enl {
   public static final MapCodec<emt> a = lt.e.r().fieldOf("block").xmap(emt::new, $$0 -> $$0.b);
   private final dfy b;

   public emt(dfy $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected enm<?> a() {
      return enm.b;
   }
}
