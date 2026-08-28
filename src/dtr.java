import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dtr extends dlb {
   public static final MapCodec<dtr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtr.a.b.fieldOf("kind").forGetter(dlb::b), t()).apply($$0, dtr::new));
   public static final int d = ebn.a();
   private static final int b = d + 1;
   public static final ebh e = eax.bd;
   private static final ffk f = dmf.b(8.0, 0.0, 8.0);
   private static final ffk g = dmf.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dtr> a() {
      return c;
   }

   protected dtr(dtr.a $$0, eag.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.b() == dtr.b.h ? g : f;
   }

   @Override
   protected ffk d_(eah $$0) {
      return ffh.a();
   }

   @Override
   public eah a(dcw $$0) {
      return super.a($$0).b(e, Integer.valueOf(ebn.a($$0.i())));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bak {
      Map<String, dtr.a> a = new Object2ObjectArrayMap();
      Codec<dtr.a> b = Codec.stringResolver(bak::c, a::get);
   }

   public static enum b implements dtr.a {
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
