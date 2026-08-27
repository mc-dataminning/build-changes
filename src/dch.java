import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dch extends czo implements dhg {
   protected static final MapCodec<List<dhg.a>> a = dhg.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dch> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dch::b), u()).apply($$0, dch::new));
   protected static final float c = 3.0F;
   protected static final epo d = czf.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dhg.a> e;

   @Override
   public MapCodec<? extends dch> a() {
      return b;
   }

   public dch(il<bnq> $$0, int $$1, dmd.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dch(List<dhg.a> $$0, dmd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dhg.a> a(il<bnq> $$0, int $$1) {
      return List.of(new dhg.a($$0, $$1 * 20));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      eov $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dhg.a> b() {
      return this.e;
   }
}
