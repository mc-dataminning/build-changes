import com.mojang.serialization.MapCodec;

public class emq extends enh {
   public static final MapCodec<emq> a = lt.e.r().fieldOf("block").xmap(emq::new, $$0 -> $$0.b);
   private final dfw b;

   public emq(dfw $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dta $$0, ayv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eni<?> a() {
      return eni.b;
   }
}
