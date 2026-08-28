import com.mojang.serialization.MapCodec;

public class dwl extends dpx {
   public static final MapCodec<dwl> c = b(dwl::new);
   private static final ffk e = dmf.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dwl> a() {
      return c;
   }

   public dwl(eag.d $$0) {
      super($$0, ja.a, e, false);
   }

   @Override
   protected dpy c() {
      return (dpy)dmh.pf;
   }
}
