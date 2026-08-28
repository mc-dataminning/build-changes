import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dqu extends dij {
   public static final MapCodec<dqu> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqu.a.b.fieldOf("kind").forGetter(dij::b), t()).apply($$0, dqu::new));
   public static final int d = dyd.a();
   private static final int b = d + 1;
   public static final dxx e = dxo.bd;
   protected static final fbv f = djn.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fbv g = djn.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dqu> a() {
      return c;
   }

   protected dqu(dqu.a $$0, dwx.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.b() == dqu.b.h ? g : f;
   }

   @Override
   protected fbv d_(dwy $$0) {
      return fbs.a();
   }

   @Override
   public dwy a(dah $$0) {
      return super.a($$0).b(e, Integer.valueOf(dyd.a($$0.i())));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azv {
      Map<String, dqu.a> a = new Object2ObjectArrayMap();
      Codec<dqu.a> b = Codec.stringResolver(azv::c, a::get);
   }

   public static enum b implements dqu.a {
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
