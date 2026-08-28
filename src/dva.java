import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dva extends dmk {
   public static final MapCodec<dva> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dva.a.b.fieldOf("kind").forGetter(dmk::b), t()).apply($$0, dva::new));
   public static final int d = ecw.a();
   private static final int b = d + 1;
   public static final ecq e = ecg.bd;
   private static final fgw f = dno.b(8.0, 0.0, 8.0);
   private static final fgw g = dno.b(10.0, 0.0, 8.0);

   @Override
   public MapCodec<? extends dva> a() {
      return c;
   }

   protected dva(dva.a $$0, ebp.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(e, Integer.valueOf(0)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.b() == dva.b.h ? g : f;
   }

   @Override
   protected fgw d_(ebq $$0) {
      return fgt.a();
   }

   @Override
   public ebq a(ded $$0) {
      return super.a($$0).b(e, Integer.valueOf(ecw.a($$0.i())));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends bax {
      Map<String, dva.a> a = new Object2ObjectArrayMap();
      Codec<dva.a> b = Codec.stringResolver(bax::c, a::get);
   }

   public static enum b implements dva.a {
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
