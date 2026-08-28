import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class drj extends dja {
   public static final MapCodec<drj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drj.a.b.fieldOf("kind").forGetter(dja::b), t()).apply($$0, drj::new));
   public static final int d = dys.a();
   private static final int b = d + 1;
   public static final dym e = dyd.bb;
   protected static final fcm f = dke.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fcm g = dke.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends drj> a() {
      return c;
   }

   protected drj(drj.a $$0, dxm.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.b() == drj.b.h ? g : f;
   }

   @Override
   protected fcm d_(dxn $$0) {
      return fcj.a();
   }

   @Override
   public dxn a(dbb $$0) {
      return super.a($$0).b(e, Integer.valueOf(dys.a($$0.i())));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bba {
      Map<String, drj.a> a = new Object2ObjectArrayMap();
      Codec<drj.a> b = Codec.stringResolver(bba::c, a::get);
   }

   public static enum b implements drj.a {
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
