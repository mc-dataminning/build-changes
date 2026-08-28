import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dmd extends ddx {
   public static final MapCodec<dmd> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmd.a.b.fieldOf("kind").forGetter(ddx::b), u()).apply($$0, dmd::new));
   public static final int d = dtk.a();
   private static final int b = d + 1;
   public static final dte e = dsu.ba;
   protected static final ewm f = dfb.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ewm g = dfb.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dmd> a() {
      return c;
   }

   protected dmd(dmd.a $$0, dsd.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.b() == dmd.b.h ? g : f;
   }

   @Override
   protected ewm f(dse $$0, dbg $$1, iz $$2) {
      return ewj.a();
   }

   @Override
   public dse a(cyc $$0) {
      return super.a($$0).a(e, Integer.valueOf(dtk.a($$0.i())));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azu {
      Map<String, dmd.a> a = new Object2ObjectArrayMap();
      Codec<dmd.a> b = Codec.stringResolver(azu::c, a::get);
   }

   public static enum b implements dmd.a {
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
