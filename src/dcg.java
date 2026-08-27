import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dcg extends cub {
   public static final MapCodec<dcg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcg.a.b.fieldOf("kind").forGetter(cub::b), u()).apply($$0, dcg::new));
   public static final int d = dit.a();
   private static final int b = d + 1;
   public static final din e = did.ba;
   protected static final eks f = cvf.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eks g = cvf.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dcg> a() {
      return c;
   }

   protected dcg(dcg.a $$0, dhm.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.b() == dcg.b.h ? g : f;
   }

   @Override
   public eks f(dhn $$0, crl $$1, hx $$2) {
      return ekp.a();
   }

   @Override
   public dhn a(cnw $$0) {
      return super.a($$0).a(e, Integer.valueOf(dit.a($$0.i())));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends auk {
      Map<String, dcg.a> a = new Object2ObjectArrayMap();
      Codec<dcg.a> b = asy.a(auk::c, a::get);
   }

   public static enum b implements dcg.a {
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
