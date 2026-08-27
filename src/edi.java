import com.mojang.serialization.Codec;

public class edi extends ecz {
   public static final Codec<edi> b = dpy.b.fieldOf("state").xmap(edi::new, $$0 -> $$0.c).codec();
   private final dpy c;

   protected edi(dpy $$0) {
      this.c = $$0;
   }

   @Override
   protected eda<?> a() {
      return eda.a;
   }

   @Override
   public dpy a(ayd $$0, im $$1) {
      return this.c;
   }
}
