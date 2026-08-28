import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class drq extends djh {
   public static final MapCodec<drq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drq.a.b.fieldOf("kind").forGetter(djh::b), t()).apply($$0, drq::new));
   public static final int d = dyz.a();
   private static final int b = d + 1;
   public static final dyt e = dyk.bb;
   protected static final fcr f = dkl.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fcr g = dkl.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends drq> a() {
      return c;
   }

   protected drq(drq.a $$0, dxt.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.b() == drq.b.h ? g : f;
   }

   @Override
   protected fcr d_(dxu $$0) {
      return fco.a();
   }

   @Override
   public dxu a(dbf $$0) {
      return super.a($$0).b(e, Integer.valueOf(dyz.a($$0.i())));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bba {
      Map<String, drq.a> a = new Object2ObjectArrayMap();
      Codec<drq.a> b = Codec.stringResolver(bba::c, a::get);
   }

   public static enum b implements drq.a {
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
