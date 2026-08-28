import com.mojang.serialization.MapCodec;

public class erq extends esg {
   public static final MapCodec<erq> a = dxv.a.fieldOf("block_state").xmap(erq::new, $$0 -> $$0.b);
   private final dxv b;

   public erq(dxv $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxv $$0, bam $$1) {
      return $$0 == this.b;
   }

   @Override
   protected esh<?> a() {
      return esh.c;
   }
}
