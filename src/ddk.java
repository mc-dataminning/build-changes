import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class ddk extends cvf {
   public static final MapCodec<ddk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddk.a.b.fieldOf("kind").forGetter(cvf::b), u()).apply($$0, ddk::new));
   public static final int d = dkg.a();
   private static final int b = d + 1;
   public static final dka e = djq.ba;
   protected static final emf f = cwj.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final emf g = cwj.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends ddk> a() {
      return c;
   }

   protected ddk(ddk.a $$0, diz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.b() == ddk.b.h ? g : f;
   }

   @Override
   public emf f(dja $$0, cso $$1, hx $$2) {
      return emc.a();
   }

   @Override
   public dja a(cpa $$0) {
      return super.a($$0).a(e, Integer.valueOf(dkg.a($$0.i())));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends ave {
      Map<String, ddk.a> a = new Object2ObjectArrayMap();
      Codec<ddk.a> b = atq.a(ave::c, a::get);
   }

   public static enum b implements ddk.a {
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
