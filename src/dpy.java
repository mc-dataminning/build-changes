import com.mojang.serialization.Codec;

public class dpy implements dpr {
   public static final Codec<dpy> a = Codec.unit(() -> dpy.b);
   public static final dpy b = new dpy();
}
