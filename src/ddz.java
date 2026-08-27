import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class ddz extends cvu {
   public static final MapCodec<ddz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddz.a.b.fieldOf("kind").forGetter(cvu::b), u()).apply($$0, ddz::new));
   public static final int d = dkv.a();
   private static final int b = d + 1;
   public static final dkp e = dkf.ba;
   protected static final emv f = cwy.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final emv g = cwy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends ddz> a() {
      return c;
   }

   protected ddz(ddz.a $$0, djo.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.b() == ddz.b.h ? g : f;
   }

   @Override
   public emv f(djp $$0, ctd $$1, hx $$2) {
      return ems.a();
   }

   @Override
   public djp a(cpp $$0) {
      return super.a($$0).a(e, Integer.valueOf(dkv.a($$0.i())));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends avl {
      Map<String, ddz.a> a = new Object2ObjectArrayMap();
      Codec<ddz.a> b = atx.a(avl::c, a::get);
   }

   public static enum b implements ddz.a {
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
