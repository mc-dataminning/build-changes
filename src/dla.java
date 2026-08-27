import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dla extends dcu {
   public static final MapCodec<dla> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dla.a.b.fieldOf("kind").forGetter(dcu::b), u()).apply($$0, dla::new));
   public static final int d = dsh.a();
   private static final int b = d + 1;
   public static final dsb e = drr.ba;
   protected static final evd f = ddy.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final evd g = ddy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dla> a() {
      return c;
   }

   protected dla(dla.a $$0, dra.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(e, Integer.valueOf(0)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.b() == dla.b.h ? g : f;
   }

   @Override
   protected evd f(drb $$0, dad $$1, io $$2) {
      return eva.a();
   }

   @Override
   public drb a(cwz $$0) {
      return super.a($$0).a(e, Integer.valueOf(dsh.a($$0.i())));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends ayx {
      Map<String, dla.a> a = new Object2ObjectArrayMap();
      Codec<dla.a> b = Codec.stringResolver(ayx::c, a::get);
   }

   public static enum b implements dla.a {
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
