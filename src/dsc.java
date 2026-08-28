import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dsc extends djq {
   public static final MapCodec<dsc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dsc.a.b.fieldOf("kind").forGetter(djq::b), t()).apply($$0, dsc::new));
   public static final int d = dzs.a();
   private static final int b = d + 1;
   public static final dzm e = dzc.bd;
   private static final fdo f = dku.b(8.0, 0.0, 8.0);
   private static final fdo g = dku.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dsc> a() {
      return c;
   }

   protected dsc(dsc.a $$0, dyl.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.b() == dsc.b.h ? g : f;
   }

   @Override
   protected fdo d_(dym $$0) {
      return fdl.a();
   }

   @Override
   public dym a(dbn $$0) {
      return super.a($$0).b(e, Integer.valueOf(dzs.a($$0.i())));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bag {
      Map<String, dsc.a> a = new Object2ObjectArrayMap();
      Codec<dsc.a> b = Codec.stringResolver(bag::c, a::get);
   }

   public static enum b implements dsc.a {
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
