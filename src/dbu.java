import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dbu extends ctp {
   public static final MapCodec<dbu> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.a.b.fieldOf("kind").forGetter(ctp::b), t()).apply($$0, dbu::new));
   public static final int d = dic.a();
   private static final int b = d + 1;
   public static final dhw e = dhm.ba;
   protected static final ekb f = cut.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ekb g = cut.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dbu> a() {
      return c;
   }

   protected dbu(dbu.a $$0, dgv.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.b() == dbu.b.h ? g : f;
   }

   @Override
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      return ejy.a();
   }

   @Override
   public dgw a(cnj $$0) {
      return super.a($$0).a(e, Integer.valueOf(dic.a($$0.i())));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends aub {
      Map<String, dbu.a> a = new Object2ObjectArrayMap();
      Codec<dbu.a> b = asq.a(aub::c, a::get);
   }

   public static enum b implements dbu.a {
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
