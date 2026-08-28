import com.mojang.serialization.MapCodec;

public class enu extends eok {
   public static final MapCodec<enu> a = dua.a.fieldOf("block_state").xmap(enu::new, $$0 -> $$0.b);
   private final dua b;

   public enu(dua $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dua $$0, azk $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eol<?> a() {
      return eol.c;
   }
}
