import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class djx extends dhe implements doy {
   protected static final MapCodec<cyp> a = cyp.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<djx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(djx::b), u()).apply($$0, djx::new));
   protected static final float c = 3.0F;
   protected static final eyx d = dgv.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cyp e;

   @Override
   public MapCodec<? extends djx> a() {
      return b;
   }

   public djx(jn<bso> $$0, float $$1, dtz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public djx(cyp $$0, dtz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cyp a(jn<bso> $$0, float $$1) {
      return new cyp(List.of(new cyp.a($$0, azc.d($$1 * 20.0F))));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      eye $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public cyp b() {
      return this.e;
   }
}
