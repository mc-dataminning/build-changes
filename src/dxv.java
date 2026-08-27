import com.mojang.serialization.Codec;

public class dxv extends dym {
   public static final Codec<dxv> a = jb.f.q().fieldOf("block").xmap(dxv::new, $$0 -> $$0.b).codec();
   private final csm b;

   public dxv(csm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfa $$0, aru $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyn<?> a() {
      return dyn.b;
   }
}
