import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dhd extends cyy {
   public static final MapCodec<dhd> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhd.a.b.fieldOf("kind").forGetter(cyy::b), u()).apply($$0, dhd::new));
   public static final int d = doh.a();
   private static final int b = d + 1;
   public static final dob e = dnr.ba;
   protected static final eqm f = dac.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eqm g = dac.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dhd> a() {
      return c;
   }

   protected dhd(dhd.a $$0, dna.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.b() == dhd.b.h ? g : f;
   }

   @Override
   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      return eqj.a();
   }

   @Override
   public dnb a(csu $$0) {
      return super.a($$0).a(e, Integer.valueOf(doh.a($$0.i())));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends axq {
      Map<String, dhd.a> a = new Object2ObjectArrayMap();
      Codec<dhd.a> b = awe.a(axq::c, a::get);
   }

   public static enum b implements dhd.a {
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
