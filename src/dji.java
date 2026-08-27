import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dji extends dbd {
   public static final MapCodec<dji> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dji.a.b.fieldOf("kind").forGetter(dbd::b), u()).apply($$0, dji::new));
   public static final int d = dqo.a();
   private static final int b = d + 1;
   public static final dqi e = dpy.ba;
   protected static final etc f = dch.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final etc g = dch.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dji> a() {
      return c;
   }

   protected dji(dji.a $$0, dph.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.b() == dji.b.h ? g : f;
   }

   @Override
   protected etc f(dpi $$0, cym $$1, id $$2) {
      return esz.a();
   }

   @Override
   public dpi a(cux $$0) {
      return super.a($$0).a(e, Integer.valueOf(dqo.a($$0.i())));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends ayg {
      Map<String, dji.a> a = new Object2ObjectArrayMap();
      Codec<dji.a> b = awu.a(ayg::c, a::get);
   }

   public static enum b implements dji.a {
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
