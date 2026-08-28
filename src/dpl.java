import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dpl extends dhf {
   public static final MapCodec<dpl> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpl.a.b.fieldOf("kind").forGetter(dhf::b), t()).apply($$0, dpl::new));
   public static final int d = dwt.a();
   private static final int b = d + 1;
   public static final dwn e = dwe.ba;
   protected static final fal f = dij.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fal g = dij.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dpl> a() {
      return c;
   }

   protected dpl(dpl.a $$0, dvn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.b() == dpl.b.h ? g : f;
   }

   @Override
   protected fal d_(dvo $$0) {
      return fai.a();
   }

   @Override
   public dvo a(czw $$0) {
      return super.a($$0).b(e, Integer.valueOf(dwt.a($$0.i())));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends baj {
      Map<String, dpl.a> a = new Object2ObjectArrayMap();
      Codec<dpl.a> b = Codec.stringResolver(baj::c, a::get);
   }

   public static enum b implements dpl.a {
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
