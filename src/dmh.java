import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dmh extends deb {
   public static final MapCodec<dmh> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmh.a.b.fieldOf("kind").forGetter(deb::b), u()).apply($$0, dmh::new));
   public static final int d = dtn.a();
   private static final int b = d + 1;
   public static final dth e = dsx.ba;
   protected static final ews f = dff.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ews g = dff.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dmh> a() {
      return c;
   }

   protected dmh(dmh.a $$0, dsg.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.b() == dmh.b.h ? g : f;
   }

   @Override
   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      return ewp.a();
   }

   @Override
   public dsh a(cxk $$0) {
      return super.a($$0).a(e, Integer.valueOf(dtn.a($$0.i())));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends ayz {
      Map<String, dmh.a> a = new Object2ObjectArrayMap();
      Codec<dmh.a> b = Codec.stringResolver(ayz::c, a::get);
   }

   public static enum b implements dmh.a {
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
