import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dty extends dli {
   public static final MapCodec<dty> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dty.a.b.fieldOf("kind").forGetter(dli::b), t()).apply($$0, dty::new));
   public static final int d = ebu.a();
   private static final int b = d + 1;
   public static final ebo e = ebe.bd;
   private static final ffr f = dmm.b(8.0, 0.0, 8.0);
   private static final ffr g = dmm.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dty> a() {
      return c;
   }

   protected dty(dty.a $$0, ean.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.b() == dty.b.h ? g : f;
   }

   @Override
   protected ffr d_(eao $$0) {
      return ffo.a();
   }

   @Override
   public eao a(ddd $$0) {
      return super.a($$0).b(e, Integer.valueOf(ebu.a($$0.i())));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bak {
      Map<String, dty.a> a = new Object2ObjectArrayMap();
      Codec<dty.a> b = Codec.stringResolver(bak::c, a::get);
   }

   public static enum b implements dty.a {
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
