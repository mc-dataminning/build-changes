import com.mojang.serialization.MapCodec;

public class eto extends eue {
   public static final MapCodec<eto> a = dzo.a.fieldOf("block_state").xmap(eto::new, $$0 -> $$0.b);
   private final dzo b;

   public eto(dzo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dzo $$0, azt $$1) {
      return $$0 == this.b;
   }

   @Override
   protected euf<?> a() {
      return euf.c;
   }
}
