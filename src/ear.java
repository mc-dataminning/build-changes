import com.mojang.serialization.Codec;

public class ear implements eay {
   public static final Codec<ear> a = dpy.b.fieldOf("state").xmap(ear::new, $$0 -> $$0.b).codec();
   public final dpy b;

   public ear(dpy $$0) {
      this.b = $$0;
   }
}
