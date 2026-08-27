import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class ddq extends cvl {
   public static final MapCodec<ddq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddq.a.b.fieldOf("kind").forGetter(cvl::b), u()).apply($$0, ddq::new));
   public static final int d = dkm.a();
   private static final int b = d + 1;
   public static final dkg e = djw.ba;
   protected static final eml f = cwp.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eml g = cwp.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends ddq> a() {
      return c;
   }

   protected ddq(ddq.a $$0, djf.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.b() == ddq.b.h ? g : f;
   }

   @Override
   public eml f(djg $$0, csu $$1, hx $$2) {
      return emi.a();
   }

   @Override
   public djg a(cpg $$0) {
      return super.a($$0).a(e, Integer.valueOf(dkm.a($$0.i())));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends avj {
      Map<String, ddq.a> a = new Object2ObjectArrayMap();
      Codec<ddq.a> b = atv.a(avj::c, a::get);
   }

   public static enum b implements ddq.a {
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
