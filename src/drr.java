import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class drr extends dji {
   public static final MapCodec<drr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drr.a.b.fieldOf("kind").forGetter(dji::b), t()).apply($$0, drr::new));
   public static final int d = dza.a();
   private static final int b = d + 1;
   public static final dyu e = dyl.bb;
   protected static final fcs f = dkm.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final fcs g = dkm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends drr> a() {
      return c;
   }

   protected drr(drr.a $$0, dxu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.b() == drr.b.h ? g : f;
   }

   @Override
   protected fcs d_(dxv $$0) {
      return fcp.a();
   }

   @Override
   public dxv a(dbg $$0) {
      return super.a($$0).b(e, Integer.valueOf(dza.a($$0.i())));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bba {
      Map<String, drr.a> a = new Object2ObjectArrayMap();
      Codec<drr.a> b = Codec.stringResolver(bba::c, a::get);
   }

   public static enum b implements drr.a {
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
