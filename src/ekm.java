import com.mojang.serialization.MapCodec;

public class ekm extends ekd {
   public static final MapCodec<ekm> b = dwx.a.fieldOf("state").xmap(ekm::new, $$0 -> $$0.c);
   private final dwx c;

   protected ekm(dwx $$0) {
      this.c = $$0;
   }

   @Override
   protected eke<?> a() {
      return eke.a;
   }

   @Override
   public dwx a(azh $$0, ji $$1) {
      return this.c;
   }
}
