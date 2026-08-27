import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dlc extends dcw {
   public static final MapCodec<dlc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlc.a.b.fieldOf("kind").forGetter(dcw::b), u()).apply($$0, dlc::new));
   public static final int d = dsj.a();
   private static final int b = d + 1;
   public static final dsd e = drt.ba;
   protected static final evf f = dea.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final evf g = dea.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dlc> a() {
      return c;
   }

   protected dlc(dlc.a $$0, drc.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.b() == dlc.b.h ? g : f;
   }

   @Override
   protected evf f(drd $$0, daf $$1, io $$2) {
      return evc.a();
   }

   @Override
   public drd a(cxb $$0) {
      return super.a($$0).a(e, Integer.valueOf(dsj.a($$0.i())));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends ayz {
      Map<String, dlc.a> a = new Object2ObjectArrayMap();
      Codec<dlc.a> b = Codec.stringResolver(ayz::c, a::get);
   }

   public static enum b implements dlc.a {
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
