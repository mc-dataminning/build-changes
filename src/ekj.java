import com.mojang.serialization.MapCodec;

public class ekj extends ekc {
   public static final MapCodec<ekj> b = dww.a.fieldOf("state").xmap(dwv.a::b, djl::m).xmap(ekj::new, $$0 -> $$0.c);
   private final djl c;

   public ekj(djl $$0) {
      this.c = $$0;
   }

   @Override
   protected ekd<?> a() {
      return ekd.f;
   }

   @Override
   public dww a(azh $$0, ji $$1) {
      jn.a $$2 = jn.a.a($$0);
      return this.c.m().c(dqc.i, $$2);
   }
}
