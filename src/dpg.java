import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dpg extends dha {
   public static final MapCodec<dpg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpg.a.b.fieldOf("kind").forGetter(dha::b), t()).apply($$0, dpg::new));
   public static final int d = dwp.a();
   private static final int b = d + 1;
   public static final dwj e = dvz.ba;
   protected static final fah f = die.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fah g = die.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dpg> a() {
      return c;
   }

   protected dpg(dpg.a $$0, dvi.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.b() == dpg.b.h ? g : f;
   }

   @Override
   protected fah d_(dvj $$0) {
      return fae.a();
   }

   @Override
   public dvj a(czs $$0) {
      return super.a($$0).b(e, Integer.valueOf(dwp.a($$0.i())));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bag {
      Map<String, dpg.a> a = new Object2ObjectArrayMap();
      Codec<dpg.a> b = Codec.stringResolver(bag::c, a::get);
   }

   public static enum b implements dpg.a {
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
