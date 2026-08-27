import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ddc extends daj implements dib {
   protected static final MapCodec<List<dib.a>> a = dib.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<ddc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(ddc::b), u()).apply($$0, ddc::new));
   protected static final float c = 3.0F;
   protected static final eqk d = daa.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dib.a> e;

   @Override
   public MapCodec<? extends ddc> a() {
      return b;
   }

   public ddc(il<boh> $$0, int $$1, dmy.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public ddc(List<dib.a> $$0, dmy.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dib.a> a(il<boh> $$0, int $$1) {
      return List.of(new dib.a($$0, $$1 * 20));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      epr $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dib.a> b() {
      return this.e;
   }
}
