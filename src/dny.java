import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dny extends dfr {
   public static final MapCodec<dny> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dny.a.b.fieldOf("kind").forGetter(dfr::b), u()).apply($$0, dny::new));
   public static final int d = dvg.a();
   private static final int b = d + 1;
   public static final dva e = duq.ba;
   protected static final eyx f = dgv.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eyx g = dgv.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dny> a() {
      return c;
   }

   protected dny(dny.a $$0, dtz.d $$1) {
      super($$0, $$1);
      this.l(this.o().b(e, Integer.valueOf(0)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.b() == dny.b.h ? g : f;
   }

   @Override
   protected eyx d_(dua $$0) {
      return eyu.a();
   }

   @Override
   public dua a(cyw $$0) {
      return super.a($$0).b(e, Integer.valueOf(dvg.a($$0.i())));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azy {
      Map<String, dny.a> a = new Object2ObjectArrayMap();
      Codec<dny.a> b = Codec.stringResolver(azy::c, a::get);
   }

   public static enum b implements dny.a {
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
