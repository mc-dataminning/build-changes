import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class duq extends dma {
   public static final MapCodec<duq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(duq.a.b.fieldOf("kind").forGetter(dma::b), t()).apply($$0, duq::new));
   public static final int d = ecm.a();
   private static final int b = d + 1;
   public static final ecg e = ebw.bd;
   private static final fgm f = dne.b(8.0, 0.0, 8.0);
   private static final fgm g = dne.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends duq> a() {
      return c;
   }

   protected duq(duq.a $$0, ebf.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.b() == duq.b.h ? g : f;
   }

   @Override
   protected fgm d_(ebg $$0) {
      return fgj.a();
   }

   @Override
   public ebg a(ddt $$0) {
      return super.a($$0).b(e, Integer.valueOf(ecm.a($$0.i())));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bao {
      Map<String, duq.a> a = new Object2ObjectArrayMap();
      Codec<duq.a> b = Codec.stringResolver(bao::c, a::get);
   }

   public static enum b implements duq.a {
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
