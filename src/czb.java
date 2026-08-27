import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class czb extends cwi implements dea {
   protected static final MapCodec<List<dea.a>> a = dea.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<czb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czb::b), u()).apply($$0, czb::new));
   protected static final float c = 3.0F;
   protected static final elu d = cvz.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dea.a> e;

   @Override
   public MapCodec<? extends czb> a() {
      return b;
   }

   public czb(bkq $$0, int $$1, dio.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public czb(List<dea.a> $$0, dio.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dea.a> a(bkq $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new dea.a($$0, $$2));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      elb $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dea.a> b() {
      return this.e;
   }
}
