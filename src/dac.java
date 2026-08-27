import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dac extends cry {
   public static final MapCodec<dac> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dac.a.b.fieldOf("kind").forGetter(cry::b), t()).apply($$0, dac::new));
   public static final int d = dgj.a();
   private static final int b = d + 1;
   public static final dgd e = dft.ba;
   protected static final eia f = ctc.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eia g = ctc.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dac> a() {
      return c;
   }

   protected dac(dac.a $$0, dfc.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.b() == dac.b.h ? g : f;
   }

   @Override
   public eia f(dfd $$0, cph $$1, gw $$2) {
      return ehx.a();
   }

   @Override
   public dfd a(clt $$0) {
      return super.a($$0).a(e, Integer.valueOf(dgj.a($$0.i())));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends asu {
      Map<String, dac.a> a = new Object2ObjectArrayMap();
      Codec<dac.a> b = arj.a(asu::c, a::get);
   }

   public static enum b implements dac.a {
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
