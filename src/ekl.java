import com.mojang.serialization.MapCodec;

public class ekl extends eke {
   public static final MapCodec<ekl> b = dwy.a.fieldOf("state").xmap(dwx.a::b, djn::m).xmap(ekl::new, $$0 -> $$0.c);
   private final djn c;

   public ekl(djn $$0) {
      this.c = $$0;
   }

   @Override
   protected ekf<?> a() {
      return ekf.f;
   }

   @Override
   public dwy a(azh $$0, ji $$1) {
      jn.a $$2 = jn.a.a($$0);
      return this.c.m().c(dqe.i, $$2);
   }
}
