import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class drk extends diz {
   public static final MapCodec<drk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drk.a.b.fieldOf("kind").forGetter(diz::b), t()).apply($$0, drk::new));
   public static final int d = dyt.a();
   private static final int b = d + 1;
   public static final dyn e = dye.bd;
   protected static final fcl f = dkd.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fcl g = dkd.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends drk> a() {
      return c;
   }

   protected drk(drk.a $$0, dxn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.b() == drk.b.h ? g : f;
   }

   @Override
   protected fcl d_(dxo $$0) {
      return fci.a();
   }

   @Override
   public dxo a(dax $$0) {
      return super.a($$0).b(e, Integer.valueOf(dyt.a($$0.i())));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends baq {
      Map<String, drk.a> a = new Object2ObjectArrayMap();
      Codec<drk.a> b = Codec.stringResolver(baq::c, a::get);
   }

   public static enum b implements drk.a {
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
