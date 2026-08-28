import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dtc extends dkq {
   public static final MapCodec<dtc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtc.a.b.fieldOf("kind").forGetter(dkq::b), t()).apply($$0, dtc::new));
   public static final int d = eau.a();
   private static final int b = d + 1;
   public static final eao e = eae.bd;
   private static final feq f = dlu.b(8.0, 0.0, 8.0);
   private static final feq g = dlu.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dtc> a() {
      return c;
   }

   protected dtc(dtc.a $$0, dzn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.b() == dtc.b.h ? g : f;
   }

   @Override
   protected feq d_(dzo $$0) {
      return fen.a();
   }

   @Override
   public dzo a(dcl $$0) {
      return super.a($$0).b(e, Integer.valueOf(eau.a($$0.i())));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bai {
      Map<String, dtc.a> a = new Object2ObjectArrayMap();
      Codec<dtc.a> b = Codec.stringResolver(bai::c, a::get);
   }

   public static enum b implements dtc.a {
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
