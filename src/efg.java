import com.mojang.serialization.Codec;

public class efg extends eey {
   public static final Codec<efg> a = auo.a(kg.f).fieldOf("tag").xmap(efg::new, $$0 -> $$0.b).codec();
   private final auo<cyo> b;

   public efg(auo<cyo> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dlf $$0, awo $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eez<?> a() {
      return eez.d;
   }
}
