import com.mojang.serialization.MapCodec;

public class ems extends emk {
   public static final MapCodec<ems> a = awk.a(lr.f).fieldOf("tag").xmap(ems::new, $$0 -> $$0.b);
   private final awk<dff> b;

   public ems(awk<dff> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsh $$0, aym $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eml<?> a() {
      return eml.d;
   }
}
