import com.mojang.serialization.MapCodec;

public class ekn extends eke {
   public static final MapCodec<ekn> b = dwy.a.fieldOf("state").xmap(ekn::new, $$0 -> $$0.c);
   private final dwy c;

   protected ekn(dwy $$0) {
      this.c = $$0;
   }

   @Override
   protected ekf<?> a() {
      return ekf.a;
   }

   @Override
   public dwy a(azh $$0, ji $$1) {
      return this.c;
   }
}
