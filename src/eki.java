import com.mojang.serialization.Codec;

public class eki extends eka {
   public static final Codec<eki> a = awd.a(ld.f).fieldOf("tag").xmap(eki::new, $$0 -> $$0.b).codec();
   private final awd<dcv> b;

   public eki(awd<dcv> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dpy $$0, ayd $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ekb<?> a() {
      return ekb.d;
   }
}
