import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dhc extends dej implements dmc {
   protected static final MapCodec<cwu> a = cwu.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dhc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dhc::b), u()).apply($$0, dhc::new));
   protected static final float c = 3.0F;
   protected static final evf d = dea.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cwu e;

   @Override
   public MapCodec<? extends dhc> a() {
      return b;
   }

   public dhc(ix<brc> $$0, float $$1, drc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dhc(cwu $$0, drc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cwu a(ix<brc> $$0, float $$1) {
      return new cwu(List.of(new cwu.a($$0, ayf.d($$1 * 20.0F))));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      eum $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cwu b() {
      return this.e;
   }
}
