import com.mojang.serialization.MapCodec;

public class emv extends enn {
   public static final MapCodec<emv> a = lt.e.r().fieldOf("block").xmap(emv::new, $$0 -> $$0.b);
   private final dfy b;

   public emv(dfy $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eno<?> a() {
      return eno.b;
   }
}
