import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dtk extends dkw {
   public static final MapCodec<dtk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtk.a.b.fieldOf("kind").forGetter(dkw::b), t()).apply($$0, dtk::new));
   public static final int d = ebf.a();
   private static final int b = d + 1;
   public static final eaz e = eap.bd;
   private static final ffc f = dma.b(8.0, 0.0, 8.0);
   private static final ffc g = dma.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dtk> a() {
      return c;
   }

   protected dtk(dtk.a $$0, dzy.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.b() == dtk.b.h ? g : f;
   }

   @Override
   protected ffc d_(dzz $$0) {
      return fez.a();
   }

   @Override
   public dzz a(dcr $$0) {
      return super.a($$0).b(e, Integer.valueOf(ebf.a($$0.i())));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bak {
      Map<String, dtk.a> a = new Object2ObjectArrayMap();
      Codec<dtk.a> b = Codec.stringResolver(bak::c, a::get);
   }

   public static enum b implements dtk.a {
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
