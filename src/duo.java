import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class duo extends dly {
   public static final MapCodec<duo> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(duo.a.b.fieldOf("kind").forGetter(dly::b), t()).apply($$0, duo::new));
   public static final int d = eck.a();
   private static final int b = d + 1;
   public static final ece e = ebu.bd;
   private static final fgk f = dnc.b(8.0, 0.0, 8.0);
   private static final fgk g = dnc.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends duo> a() {
      return c;
   }

   protected duo(duo.a $$0, ebd.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.b() == duo.b.h ? g : f;
   }

   @Override
   protected fgk d_(ebe $$0) {
      return fgh.a();
   }

   @Override
   public ebe a(ddr $$0) {
      return super.a($$0).b(e, Integer.valueOf(eck.a($$0.i())));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bam {
      Map<String, duo.a> a = new Object2ObjectArrayMap();
      Codec<duo.a> b = Codec.stringResolver(bam::c, a::get);
   }

   public static enum b implements duo.a {
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
