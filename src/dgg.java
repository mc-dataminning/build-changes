import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dgg extends cyb {
   public static final MapCodec<dgg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgg.a.b.fieldOf("kind").forGetter(cyb::b), u()).apply($$0, dgg::new));
   public static final int d = dnk.a();
   private static final int b = d + 1;
   public static final dne e = dmu.ba;
   protected static final epo f = czf.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final epo g = czf.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dgg> a() {
      return c;
   }

   protected dgg(dgg.a $$0, dmd.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.b() == dgg.b.h ? g : f;
   }

   @Override
   protected epo f(dme $$0, cvk $$1, ib $$2) {
      return epl.a();
   }

   @Override
   public dme a(crx $$0) {
      return super.a($$0).a(e, Integer.valueOf(dnk.a($$0.i())));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends axg {
      Map<String, dgg.a> a = new Object2ObjectArrayMap();
      Codec<dgg.a> b = avu.a(axg::c, a::get);
   }

   public static enum b implements dgg.a {
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
