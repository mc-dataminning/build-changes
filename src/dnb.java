import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dnb extends deu {
   public static final MapCodec<dnb> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnb.a.b.fieldOf("kind").forGetter(deu::b), u()).apply($$0, dnb::new));
   public static final int d = dui.a();
   private static final int b = d + 1;
   public static final duc e = dts.ba;
   protected static final exv f = dfy.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final exv g = dfy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dnb> a() {
      return c;
   }

   protected dnb(dnb.a $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return this.b() == dnb.b.h ? g : f;
   }

   @Override
   protected exv f(dtc $$0, dcc $$1, jd $$2) {
      return exs.a();
   }

   @Override
   public dtc a(cyd $$0) {
      return super.a($$0).a(e, Integer.valueOf(dui.a($$0.i())));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azk {
      Map<String, dnb.a> a = new Object2ObjectArrayMap();
      Codec<dnb.a> b = Codec.stringResolver(azk::c, a::get);
   }

   public static enum b implements dnb.a {
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
