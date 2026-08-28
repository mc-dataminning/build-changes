import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class drm extends dja {
   public static final MapCodec<drm> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drm.a.b.fieldOf("kind").forGetter(dja::b), t()).apply($$0, drm::new));
   public static final int d = dyw.a();
   private static final int b = d + 1;
   public static final dyq e = dyg.bd;
   private static final fcr f = dke.b(8.0, 0.0, 8.0);
   private static final fcr g = dke.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends drm> a() {
      return c;
   }

   protected drm(drm.a $$0, dxp.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.b() == drm.b.h ? g : f;
   }

   @Override
   protected fcr d_(dxq $$0) {
      return fco.a();
   }

   @Override
   public dxq a(dax $$0) {
      return super.a($$0).b(e, Integer.valueOf(dyw.a($$0.i())));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azv {
      Map<String, drm.a> a = new Object2ObjectArrayMap();
      Codec<drm.a> b = Codec.stringResolver(azv::c, a::get);
   }

   public static enum b implements drm.a {
      c("skeleton"),
      d("wither_skeleton"),
      e("player"),
      f("zombie"),
      g("creeper"),
      h("piglin"),
      i("dragon");

      private final String j;

      private b(final String $$0) {
         this.j = $$0;
         a.put($$0, this);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
