import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dkg extends dca {
   public static final MapCodec<dkg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkg.a.b.fieldOf("kind").forGetter(dca::b), u()).apply($$0, dkg::new));
   public static final int d = drn.a();
   private static final int b = d + 1;
   public static final drh e = dqx.ba;
   protected static final eui f = dde.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eui g = dde.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dkg> a() {
      return c;
   }

   protected dkg(dkg.a $$0, dqg.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.b() == dkg.b.h ? g : f;
   }

   @Override
   protected eui f(dqh $$0, czj $$1, in $$2) {
      return euf.a();
   }

   @Override
   public dqh a(cwi $$0) {
      return super.a($$0).a(e, Integer.valueOf(drn.a($$0.i())));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends ayt {
      Map<String, dkg.a> a = new Object2ObjectArrayMap();
      Codec<dkg.a> b = axh.a(ayt::c, a::get);
   }

   public static enum b implements dkg.a {
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
