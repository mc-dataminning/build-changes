import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dmj extends ded {
   public static final MapCodec<dmj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmj.a.b.fieldOf("kind").forGetter(ded::b), u()).apply($$0, dmj::new));
   public static final int d = dtq.a();
   private static final int b = d + 1;
   public static final dtk e = dta.ba;
   protected static final ewy f = dfh.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ewy g = dfh.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dmj> a() {
      return c;
   }

   protected dmj(dmj.a $$0, dsj.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.b() == dmj.b.h ? g : f;
   }

   @Override
   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      return ewv.a();
   }

   @Override
   public dsk a(cxm $$0) {
      return super.a($$0).a(e, Integer.valueOf(dtq.a($$0.i())));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azc {
      Map<String, dmj.a> a = new Object2ObjectArrayMap();
      Codec<dmj.a> b = Codec.stringResolver(azc::c, a::get);
   }

   public static enum b implements dmj.a {
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
