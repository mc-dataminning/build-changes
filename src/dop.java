import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dop extends dgi {
   public static final MapCodec<dop> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dop.a.b.fieldOf("kind").forGetter(dgi::b), t()).apply($$0, dop::new));
   public static final int d = dvy.a();
   private static final int b = d + 1;
   public static final dvs e = dvi.ba;
   protected static final ezq f = dhm.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ezq g = dhm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dop> a() {
      return c;
   }

   protected dop(dop.a $$0, dur.d $$1) {
      super($$0, $$1);
      this.l(this.n().b(e, Integer.valueOf(0)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.b() == dop.b.h ? g : f;
   }

   @Override
   protected ezq d_(dus $$0) {
      return ezn.a();
   }

   @Override
   public dus a(czn $$0) {
      return super.a($$0).b(e, Integer.valueOf(dvy.a($$0.i())));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bab {
      Map<String, dop.a> a = new Object2ObjectArrayMap();
      Codec<dop.a> b = Codec.stringResolver(bab::c, a::get);
   }

   public static enum b implements dop.a {
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
