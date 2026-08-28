import com.mojang.serialization.MapCodec;

public class ela extends ekt {
   public static final MapCodec<ela> b = dxn.a.fieldOf("state").xmap(dxm.a::b, dke::m).xmap(ela::new, $$0 -> $$0.c);
   private final dke c;

   public ela(dke $$0) {
      this.c = $$0;
   }

   @Override
   protected eku<?> a() {
      return eku.f;
   }

   @Override
   public dxn a(bam $$0, jh $$1) {
      jm.a $$2 = jm.a.a($$0);
      return this.c.m().c(dqt.i, $$2);
   }
}
