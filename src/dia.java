import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dia extends dfh implements dna {
   protected static final MapCodec<cxs> a = cxs.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dia> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dia::b), u()).apply($$0, dia::new));
   protected static final float c = 3.0F;
   protected static final ewj d = dey.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxs e;

   @Override
   public MapCodec<? extends dia> a() {
      return b;
   }

   public dia(ji<brz> $$0, float $$1, dsa.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dia(cxs $$0, dsa.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxs a(ji<brz> $$0, float $$1) {
      return new cxs(List.of(new cxs.a($$0, ayy.d($$1 * 20.0F))));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      evq $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxs b() {
      return this.e;
   }
}
