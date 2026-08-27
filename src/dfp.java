import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dfp extends cxk {
   public static final MapCodec<dfp> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfp.a.b.fieldOf("kind").forGetter(cxk::b), u()).apply($$0, dfp::new));
   public static final int d = dml.a();
   private static final int b = d + 1;
   public static final dmf e = dlv.ba;
   protected static final eol f = cyo.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eol g = cyo.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dfp> a() {
      return c;
   }

   protected dfp(dfp.a $$0, dle.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.b() == dfp.b.h ? g : f;
   }

   @Override
   protected eol f(dlf $$0, cut $$1, hz $$2) {
      return eoi.a();
   }

   @Override
   public dlf a(crg $$0) {
      return super.a($$0).a(e, Integer.valueOf(dml.a($$0.i())));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends axc {
      Map<String, dfp.a> a = new Object2ObjectArrayMap();
      Codec<dfp.a> b = avp.a(axc::c, a::get);
   }

   public static enum b implements dfp.a {
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
