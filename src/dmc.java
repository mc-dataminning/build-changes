import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dmc extends ddw {
   public static final MapCodec<dmc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmc.a.b.fieldOf("kind").forGetter(ddw::b), u()).apply($$0, dmc::new));
   public static final int d = dtj.a();
   private static final int b = d + 1;
   public static final dtd e = dst.ba;
   protected static final ewl f = dfa.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ewl g = dfa.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dmc> a() {
      return c;
   }

   protected dmc(dmc.a $$0, dsc.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.b() == dmc.b.h ? g : f;
   }

   @Override
   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      return ewi.a();
   }

   @Override
   public dsd a(cyb $$0) {
      return super.a($$0).a(e, Integer.valueOf(dtj.a($$0.i())));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azu {
      Map<String, dmc.a> a = new Object2ObjectArrayMap();
      Codec<dmc.a> b = Codec.stringResolver(azu::c, a::get);
   }

   public static enum b implements dmc.a {
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
