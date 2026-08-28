import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dqr extends dig {
   public static final MapCodec<dqr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqr.a.b.fieldOf("kind").forGetter(dig::b), t()).apply($$0, dqr::new));
   public static final int d = dya.a();
   private static final int b = d + 1;
   public static final dxu e = dxl.bd;
   protected static final fbs f = djk.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fbs g = djk.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dqr> a() {
      return c;
   }

   protected dqr(dqr.a $$0, dwu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.b() == dqr.b.h ? g : f;
   }

   @Override
   protected fbs d_(dwv $$0) {
      return fbp.a();
   }

   @Override
   public dwv a(dae $$0) {
      return super.a($$0).b(e, Integer.valueOf(dya.a($$0.i())));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azu {
      Map<String, dqr.a> a = new Object2ObjectArrayMap();
      Codec<dqr.a> b = Codec.stringResolver(azu::c, a::get);
   }

   public static enum b implements dqr.a {
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
