import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dms extends ddx {
   public static final MapCodec<dms> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dms.a.b.fieldOf("kind").forGetter(ddx::b), u()).apply($$0, dms::new));
   public static final int d = dui.a();
   private static final int b = d + 1;
   public static final duc e = dts.ba;
   protected static final exn f = dfc.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final exn g = dfc.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dms> a() {
      return c;
   }

   protected dms(dms.a $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.b() == dms.b.h ? g : f;
   }

   @Override
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return exk.a();
   }

   @Override
   public dtc a(cyd $$0) {
      return super.a($$0).a(e, Integer.valueOf(dui.a($$0.i())));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azg {
      Map<String, dms.a> a = new Object2ObjectArrayMap();
      Codec<dms.a> b = axu.a(azg::c, a::get);
   }

   public static enum b implements dms.a {
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
