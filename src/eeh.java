import com.mojang.serialization.Codec;

public class eeh extends eey {
   public static final Codec<eeh> a = kf.e.q().fieldOf("block").xmap(eeh::new, $$0 -> $$0.b).codec();
   private final cyo b;

   public eeh(cyo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dlf $$0, awo $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eez<?> a() {
      return eez.b;
   }
}
