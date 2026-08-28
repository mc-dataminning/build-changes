import com.mojang.serialization.MapCodec;

public class emy extends emq {
   public static final MapCodec<emy> a = awm.a(lr.f).fieldOf("tag").xmap(emy::new, $$0 -> $$0.b);
   private final awm<dfh> b;

   public emy(awm<dfh> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsk $$0, ayo $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emr<?> a() {
      return emr.d;
   }
}
