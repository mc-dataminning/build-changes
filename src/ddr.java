import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class ddr extends cvm {
   public static final MapCodec<ddr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddr.a.b.fieldOf("kind").forGetter(cvm::b), u()).apply($$0, ddr::new));
   public static final int d = dkn.a();
   private static final int b = d + 1;
   public static final dkh e = djx.ba;
   protected static final emm f = cwq.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final emm g = cwq.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends ddr> a() {
      return c;
   }

   protected ddr(ddr.a $$0, djg.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.b() == ddr.b.h ? g : f;
   }

   @Override
   public emm f(djh $$0, csv $$1, hx $$2) {
      return emj.a();
   }

   @Override
   public djh a(cph $$0) {
      return super.a($$0).a(e, Integer.valueOf(dkn.a($$0.i())));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends avk {
      Map<String, ddr.a> a = new Object2ObjectArrayMap();
      Codec<ddr.a> b = atw.a(avk::c, a::get);
   }

   public static enum b implements ddr.a {
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
