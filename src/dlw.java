import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dlw extends ddq {
   public static final MapCodec<dlw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlw.a.b.fieldOf("kind").forGetter(ddq::b), u()).apply($$0, dlw::new));
   public static final int d = dtd.a();
   private static final int b = d + 1;
   public static final dsx e = dsn.ba;
   protected static final ewf f = deu.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ewf g = deu.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dlw> a() {
      return c;
   }

   protected dlw(dlw.a $$0, drw.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.b() == dlw.b.h ? g : f;
   }

   @Override
   protected ewf f(drx $$0, daz $$1, iz $$2) {
      return ewc.a();
   }

   @Override
   public drx a(cxv $$0) {
      return super.a($$0).a(e, Integer.valueOf(dtd.a($$0.i())));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azp {
      Map<String, dlw.a> a = new Object2ObjectArrayMap();
      Codec<dlw.a> b = Codec.stringResolver(azp::c, a::get);
   }

   public static enum b implements dlw.a {
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
