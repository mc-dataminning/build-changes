import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dqs extends dih {
   public static final MapCodec<dqs> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqs.a.b.fieldOf("kind").forGetter(dih::b), t()).apply($$0, dqs::new));
   public static final int d = dyb.a();
   private static final int b = d + 1;
   public static final dxv e = dxm.bd;
   protected static final fbt f = djl.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fbt g = djl.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dqs> a() {
      return c;
   }

   protected dqs(dqs.a $$0, dwv.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.b() == dqs.b.h ? g : f;
   }

   @Override
   protected fbt d_(dww $$0) {
      return fbq.a();
   }

   @Override
   public dww a(daf $$0) {
      return super.a($$0).b(e, Integer.valueOf(dyb.a($$0.i())));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azv {
      Map<String, dqs.a> a = new Object2ObjectArrayMap();
      Codec<dqs.a> b = Codec.stringResolver(azv::c, a::get);
   }

   public static enum b implements dqs.a {
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
