import com.mojang.serialization.MapCodec;

public class ekk extends ekd {
   public static final MapCodec<ekk> b = dwx.a.fieldOf("state").xmap(dww.a::b, djm::m).xmap(ekk::new, $$0 -> $$0.c);
   private final djm c;

   public ekk(djm $$0) {
      this.c = $$0;
   }

   @Override
   protected eke<?> a() {
      return eke.f;
   }

   @Override
   public dwx a(azh $$0, ji $$1) {
      jn.a $$2 = jn.a.a($$0);
      return this.c.m().c(dqd.i, $$2);
   }
}
