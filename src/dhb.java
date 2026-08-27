import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dhb extends cyw {
   public static final MapCodec<dhb> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhb.a.b.fieldOf("kind").forGetter(cyw::b), u()).apply($$0, dhb::new));
   public static final int d = dof.a();
   private static final int b = d + 1;
   public static final dnz e = dnp.ba;
   protected static final eqk f = daa.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eqk g = daa.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dhb> a() {
      return c;
   }

   protected dhb(dhb.a $$0, dmy.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.b() == dhb.b.h ? g : f;
   }

   @Override
   protected eqk f(dmz $$0, cwf $$1, ib $$2) {
      return eqh.a();
   }

   @Override
   public dmz a(css $$0) {
      return super.a($$0).a(e, Integer.valueOf(dof.a($$0.i())));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends axq {
      Map<String, dhb.a> a = new Object2ObjectArrayMap();
      Codec<dhb.a> b = awe.a(axq::c, a::get);
   }

   public static enum b implements dhb.a {
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
