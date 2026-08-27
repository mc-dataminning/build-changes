import com.mojang.serialization.Codec;

public class ejl extends eka {
   public static final Codec<ejl> a = dpy.b.fieldOf("block_state").xmap(ejl::new, $$0 -> $$0.b).codec();
   private final dpy b;

   public ejl(dpy $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dpy $$0, ayd $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ekb<?> a() {
      return ekb.c;
   }
}
