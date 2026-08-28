import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dpa extends dgu {
   public static final MapCodec<dpa> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpa.a.b.fieldOf("kind").forGetter(dgu::b), t()).apply($$0, dpa::new));
   public static final int d = dwj.a();
   private static final int b = d + 1;
   public static final dwd e = dvt.ba;
   protected static final fab f = dhy.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fab g = dhy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dpa> a() {
      return c;
   }

   protected dpa(dpa.a $$0, dvc.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.b() == dpa.b.h ? g : f;
   }

   @Override
   protected fab d_(dvd $$0) {
      return ezy.a();
   }

   @Override
   public dvd a(czm $$0) {
      return super.a($$0).b(e, Integer.valueOf(dwj.a($$0.i())));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends baf {
      Map<String, dpa.a> a = new Object2ObjectArrayMap();
      Codec<dpa.a> b = Codec.stringResolver(baf::c, a::get);
   }

   public static enum b implements dpa.a {
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
