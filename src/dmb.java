import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dmb extends ddv {
   public static final MapCodec<dmb> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmb.a.b.fieldOf("kind").forGetter(ddv::b), u()).apply($$0, dmb::new));
   public static final int d = dti.a();
   private static final int b = d + 1;
   public static final dtc e = dss.ba;
   protected static final ewk f = dez.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ewk g = dez.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dmb> a() {
      return c;
   }

   protected dmb(dmb.a $$0, dsb.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.b() == dmb.b.h ? g : f;
   }

   @Override
   protected ewk f(dsc $$0, dbe $$1, iz $$2) {
      return ewh.a();
   }

   @Override
   public dsc a(cya $$0) {
      return super.a($$0).a(e, Integer.valueOf(dti.a($$0.i())));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azu {
      Map<String, dmb.a> a = new Object2ObjectArrayMap();
      Codec<dmb.a> b = Codec.stringResolver(azu::c, a::get);
   }

   public static enum b implements dmb.a {
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
