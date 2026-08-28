import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dps extends dhm {
   public static final MapCodec<dps> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dps.a.b.fieldOf("kind").forGetter(dhm::b), t()).apply($$0, dps::new));
   public static final int d = dxa.a();
   private static final int b = d + 1;
   public static final dwu e = dwl.ba;
   protected static final fas f = diq.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fas g = diq.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dps> a() {
      return c;
   }

   protected dps(dps.a $$0, dvu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.b() == dps.b.h ? g : f;
   }

   @Override
   protected fas d_(dvv $$0) {
      return fap.a();
   }

   @Override
   public dvv a(dad $$0) {
      return super.a($$0).b(e, Integer.valueOf(dxa.a($$0.i())));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bai {
      Map<String, dps.a> a = new Object2ObjectArrayMap();
      Codec<dps.a> b = Codec.stringResolver(bai::c, a::get);
   }

   public static enum b implements dps.a {
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
