import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dmz extends des {
   public static final MapCodec<dmz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmz.a.b.fieldOf("kind").forGetter(des::b), u()).apply($$0, dmz::new));
   public static final int d = dug.a();
   private static final int b = d + 1;
   public static final dua e = dtq.ba;
   protected static final exp f = dfw.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final exp g = dfw.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dmz> a() {
      return c;
   }

   protected dmz(dmz.a $$0, dsz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.b() == dmz.b.h ? g : f;
   }

   @Override
   protected exp f(dta $$0, dca $$1, jd $$2) {
      return exm.a();
   }

   @Override
   public dta a(cyb $$0) {
      return super.a($$0).a(e, Integer.valueOf(dug.a($$0.i())));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azj {
      Map<String, dmz.a> a = new Object2ObjectArrayMap();
      Codec<dmz.a> b = Codec.stringResolver(azj::c, a::get);
   }

   public static enum b implements dmz.a {
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
