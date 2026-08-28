import com.mojang.serialization.MapCodec;

public class etm extends eue {
   public static final MapCodec<etm> a = mf.e.q().fieldOf("block").xmap(etm::new, $$0 -> $$0.b);
   private final dlu b;

   public etm(dlu $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dzo $$0, azt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected euf<?> a() {
      return euf.b;
   }
}
