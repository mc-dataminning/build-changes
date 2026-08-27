import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dda extends cuv {
   public static final MapCodec<dda> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dda.a.b.fieldOf("kind").forGetter(cuv::b), u()).apply($$0, dda::new));
   public static final int d = djv.a();
   private static final int b = d + 1;
   public static final djp e = djf.ba;
   protected static final elu f = cvz.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final elu g = cvz.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dda> a() {
      return c;
   }

   protected dda(dda.a $$0, dio.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.b() == dda.b.h ? g : f;
   }

   @Override
   public elu f(dip $$0, cse $$1, hv $$2) {
      return elr.a();
   }

   @Override
   public dip a(coq $$0) {
      return super.a($$0).a(e, Integer.valueOf(djv.a($$0.i())));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends aut {
      Map<String, dda.a> a = new Object2ObjectArrayMap();
      Codec<dda.a> b = atg.a(aut::c, a::get);
   }

   public static enum b implements dda.a {
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
