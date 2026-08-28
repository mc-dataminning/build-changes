import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dlz extends ddt {
   public static final MapCodec<dlz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlz.a.b.fieldOf("kind").forGetter(ddt::b), u()).apply($$0, dlz::new));
   public static final int d = dtg.a();
   private static final int b = d + 1;
   public static final dta e = dsq.ba;
   protected static final ewi f = dex.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ewi g = dex.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dlz> a() {
      return c;
   }

   protected dlz(dlz.a $$0, drz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.b() == dlz.b.h ? g : f;
   }

   @Override
   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      return ewf.a();
   }

   @Override
   public dsa a(cxy $$0) {
      return super.a($$0).a(e, Integer.valueOf(dtg.a($$0.i())));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azs {
      Map<String, dlz.a> a = new Object2ObjectArrayMap();
      Codec<dlz.a> b = Codec.stringResolver(azs::c, a::get);
   }

   public static enum b implements dlz.a {
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
