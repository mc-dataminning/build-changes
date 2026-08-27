import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class diz extends dau {
   public static final MapCodec<diz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(diz.a.b.fieldOf("kind").forGetter(dau::b), u()).apply($$0, diz::new));
   public static final int d = dqf.a();
   private static final int b = d + 1;
   public static final dpz e = dpp.ba;
   protected static final est f = dby.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final est g = dby.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends diz> a() {
      return c;
   }

   protected diz(diz.a $$0, doy.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.b() == diz.b.h ? g : f;
   }

   @Override
   protected est f(doz $$0, cyd $$1, ib $$2) {
      return esq.a();
   }

   @Override
   public doz a(cuo $$0) {
      return super.a($$0).a(e, Integer.valueOf(dqf.a($$0.i())));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends aye {
      Map<String, diz.a> a = new Object2ObjectArrayMap();
      Codec<diz.a> b = aws.a(aye::c, a::get);
   }

   public static enum b implements diz.a {
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
