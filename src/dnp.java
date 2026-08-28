import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dnp extends dkw implements dsr {
   protected static final MapCodec<daq> a = daq.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dnp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dnp::b), t()).apply($$0, dnp::new));
   protected static final float c = 3.0F;
   protected static final fcs d = dkm.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final daq e;

   @Override
   public MapCodec<? extends dnp> a() {
      return b;
   }

   public dnp(jq<bun> $$0, float $$1, dxu.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dnp(daq $$0, dxu.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static daq a(jq<bun> $$0, float $$1) {
      return new daq(List.of(new daq.a($$0, bae.d($$1 * 20.0F))));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      fby $$4 = $$0.a($$2);
      return d.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   public daq b() {
      return this.e;
   }
}
