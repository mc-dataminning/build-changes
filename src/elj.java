import com.mojang.serialization.MapCodec;

public class elj extends ela {
   public static final MapCodec<elj> b = dxu.a.fieldOf("state").xmap(elj::new, $$0 -> $$0.c);
   private final dxu c;

   protected elj(dxu $$0) {
      this.c = $$0;
   }

   @Override
   protected elb<?> a() {
      return elb.a;
   }

   @Override
   public dxu a(bam $$0, jh $$1) {
      return this.c;
   }
}
