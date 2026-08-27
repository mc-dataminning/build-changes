import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class djx extends dbr {
   public static final MapCodec<djx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djx.a.b.fieldOf("kind").forGetter(dbr::b), u()).apply($$0, djx::new));
   public static final int d = dre.a();
   private static final int b = d + 1;
   public static final dqy e = dqo.ba;
   protected static final ety f = dcv.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ety g = dcv.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends djx> a() {
      return c;
   }

   protected djx(djx.a $$0, dpx.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.b() == djx.b.h ? g : f;
   }

   @Override
   protected ety f(dpy $$0, cza $$1, im $$2) {
      return etv.a();
   }

   @Override
   public dpy a(cvl $$0) {
      return super.a($$0).a(e, Integer.valueOf(dre.a($$0.i())));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends ayq {
      Map<String, djx.a> a = new Object2ObjectArrayMap();
      Codec<djx.a> b = axe.a(ayq::c, a::get);
   }

   public static enum b implements djx.a {
      c("skeleton"),
      d("wither_skeleton"),
      e("player"),
      f("zombie"),
      g("creeper"),
      h("piglin"),
      i("dragon");

      private final String j;

      private b(String $$0) {
         this.j = $$0;
         a.put($$0, this);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
