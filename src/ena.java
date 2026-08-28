import com.mojang.serialization.MapCodec;

public class ena extends ems {
   public static final MapCodec<ena> a = awm.a(lr.f).fieldOf("tag").xmap(ena::new, $$0 -> $$0.b);
   private final awm<dfi> b;

   public ena(awm<dfi> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsl $$0, ayo $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emt<?> a() {
      return emt.d;
   }
}
