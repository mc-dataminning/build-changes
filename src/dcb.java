import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dcb extends ctw {
   public static final MapCodec<dcb> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcb.a.b.fieldOf("kind").forGetter(ctw::b), u()).apply($$0, dcb::new));
   public static final int d = dio.a();
   private static final int b = d + 1;
   public static final dii e = dhy.ba;
   protected static final ekn f = cva.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ekn g = cva.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dcb> a() {
      return c;
   }

   protected dcb(dcb.a $$0, dhh.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.b() == dcb.b.h ? g : f;
   }

   @Override
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      return ekk.a();
   }

   @Override
   public dhi a(cnr $$0) {
      return super.a($$0).a(e, Integer.valueOf(dio.a($$0.i())));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends aug {
      Map<String, dcb.a> a = new Object2ObjectArrayMap();
      Codec<dcb.a> b = asu.a(aug::c, a::get);
   }

   public static enum b implements dcb.a {
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
