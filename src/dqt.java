import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dqt extends dii {
   public static final MapCodec<dqt> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqt.a.b.fieldOf("kind").forGetter(dii::b), t()).apply($$0, dqt::new));
   public static final int d = dyc.a();
   private static final int b = d + 1;
   public static final dxw e = dxn.bd;
   protected static final fbu f = djm.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fbu g = djm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dqt> a() {
      return c;
   }

   protected dqt(dqt.a $$0, dww.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.b() == dqt.b.h ? g : f;
   }

   @Override
   protected fbu d_(dwx $$0) {
      return fbr.a();
   }

   @Override
   public dwx a(dag $$0) {
      return super.a($$0).b(e, Integer.valueOf(dyc.a($$0.i())));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azv {
      Map<String, dqt.a> a = new Object2ObjectArrayMap();
      Codec<dqt.a> b = Codec.stringResolver(azv::c, a::get);
   }

   public static enum b implements dqt.a {
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
