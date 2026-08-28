import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dud extends dln {
   public static final MapCodec<dud> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dud.a.b.fieldOf("kind").forGetter(dln::b), t()).apply($$0, dud::new));
   public static final int d = ebz.a();
   private static final int b = d + 1;
   public static final ebt e = ebj.bd;
   private static final ffw f = dmr.b(8.0, 0.0, 8.0);
   private static final ffw g = dmr.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dud> a() {
      return c;
   }

   protected dud(dud.a $$0, eas.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.b() == dud.b.h ? g : f;
   }

   @Override
   protected ffw d_(eat $$0) {
      return fft.a();
   }

   @Override
   public eat a(ddg $$0) {
      return super.a($$0).b(e, Integer.valueOf(ebz.a($$0.i())));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bak {
      Map<String, dud.a> a = new Object2ObjectArrayMap();
      Codec<dud.a> b = Codec.stringResolver(bak::c, a::get);
   }

   public static enum b implements dud.a {
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
