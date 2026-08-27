import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dft extends cxo {
   public static final MapCodec<dft> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dft.a.b.fieldOf("kind").forGetter(cxo::b), u()).apply($$0, dft::new));
   public static final int d = dmp.a();
   private static final int b = d + 1;
   public static final dmj e = dlz.ba;
   protected static final eos f = cys.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eos g = cys.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dft> a() {
      return c;
   }

   protected dft(dft.a $$0, dli.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.b() == dft.b.h ? g : f;
   }

   @Override
   protected eos f(dlj $$0, cux $$1, hz $$2) {
      return eop.a();
   }

   @Override
   public dlj a(crk $$0) {
      return super.a($$0).a(e, Integer.valueOf(dmp.a($$0.i())));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends axc {
      Map<String, dft.a> a = new Object2ObjectArrayMap();
      Codec<dft.a> b = avq.a(axc::c, a::get);
   }

   public static enum b implements dft.a {
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
