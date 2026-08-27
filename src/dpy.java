import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class dpy extends dpx.a {
   public static final Codec<dpy> b = a(lc.e.q(), dcv::n).stable();

   public dpy(dcv $$0, Reference2ObjectArrayMap<drb<?>, Comparable<?>> $$1, MapCodec<dpy> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dpy x() {
      return this;
   }
}
