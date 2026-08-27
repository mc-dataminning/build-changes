import com.mojang.serialization.Codec;

public class ejj extends eka {
   public static final Codec<ejj> a = lc.e.q().fieldOf("block").xmap(ejj::new, $$0 -> $$0.b).codec();
   private final dcv b;

   public ejj(dcv $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dpy $$0, ayd $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ekb<?> a() {
      return ekb.b;
   }
}
