import com.mojang.serialization.MapCodec;

public class elk extends elb {
   public static final MapCodec<elk> b = dxv.a.fieldOf("state").xmap(elk::new, $$0 -> $$0.c);
   private final dxv c;

   protected elk(dxv $$0) {
      this.c = $$0;
   }

   @Override
   protected elc<?> a() {
      return elc.a;
   }

   @Override
   public dxv a(bam $$0, jh $$1) {
      return this.c;
   }
}
