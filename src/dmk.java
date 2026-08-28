import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dmk extends dee {
   public static final MapCodec<dmk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmk.a.b.fieldOf("kind").forGetter(dee::b), u()).apply($$0, dmk::new));
   public static final int d = dtr.a();
   private static final int b = d + 1;
   public static final dtl e = dtb.ba;
   protected static final exa f = dfi.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final exa g = dfi.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dmk> a() {
      return c;
   }

   protected dmk(dmk.a $$0, dsk.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.b() == dmk.b.h ? g : f;
   }

   @Override
   protected exa f(dsl $$0, dbm $$1, ja $$2) {
      return ewx.a();
   }

   @Override
   public dsl a(cxn $$0) {
      return super.a($$0).a(e, Integer.valueOf(dtr.a($$0.i())));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azc {
      Map<String, dmk.a> a = new Object2ObjectArrayMap();
      Codec<dmk.a> b = Codec.stringResolver(azc::c, a::get);
   }

   public static enum b implements dmk.a {
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
