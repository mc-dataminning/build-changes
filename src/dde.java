import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dde extends dal implements did {
   protected static final MapCodec<List<did.a>> a = did.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dde> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dde::b), u()).apply($$0, dde::new));
   protected static final float c = 3.0F;
   protected static final eqm d = dac.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<did.a> e;

   @Override
   public MapCodec<? extends dde> a() {
      return b;
   }

   public dde(il<boi> $$0, int $$1, dna.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dde(List<did.a> $$0, dna.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<did.a> a(il<boi> $$0, int $$1) {
      return List.of(new did.a($$0, $$1 * 20));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      ept $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<did.a> b() {
      return this.e;
   }
}
