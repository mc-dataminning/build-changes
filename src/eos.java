import com.mojang.serialization.MapCodec;

public class eos extends eok {
   public static final MapCodec<eos> a = axi.a(lv.f).fieldOf("tag").xmap(eos::new, $$0 -> $$0.b);
   private final axi<dgv> b;

   public eos(axi<dgv> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dua $$0, azk $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eol<?> a() {
      return eol.d;
   }
}
