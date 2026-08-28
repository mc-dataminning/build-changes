import com.mojang.serialization.MapCodec;

public class ens extends eok {
   public static final MapCodec<ens> a = lu.e.q().fieldOf("block").xmap(ens::new, $$0 -> $$0.b);
   private final dgv b;

   public ens(dgv $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dua $$0, azk $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eol<?> a() {
      return eol.b;
   }
}
