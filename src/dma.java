import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dma extends ddu {
   public static final MapCodec<dma> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dma.a.b.fieldOf("kind").forGetter(ddu::b), u()).apply($$0, dma::new));
   public static final int d = dth.a();
   private static final int b = d + 1;
   public static final dtb e = dsr.ba;
   protected static final ewj f = dey.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ewj g = dey.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dma> a() {
      return c;
   }

   protected dma(dma.a $$0, dsa.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.b() == dma.b.h ? g : f;
   }

   @Override
   protected ewj f(dsb $$0, dbd $$1, iz $$2) {
      return ewg.a();
   }

   @Override
   public dsb a(cxz $$0) {
      return super.a($$0).a(e, Integer.valueOf(dth.a($$0.i())));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azt {
      Map<String, dma.a> a = new Object2ObjectArrayMap();
      Codec<dma.a> b = Codec.stringResolver(azt::c, a::get);
   }

   public static enum b implements dma.a {
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
