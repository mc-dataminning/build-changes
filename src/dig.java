import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dig extends dfj implements dfd {
   public static final MapCodec<dig> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), lp.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dig::new)
   );
   protected static final ewl b = dfa.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dfa d;
   private final ale<eam<?, ?>> e;

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   protected dig(ale<eam<?, ?>> $$0, dfa $$1, dsc.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfc.fl) || $$0.a(dfc.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ji<eam<?, ?>>> a(dcc $$0) {
      return $$0.H_().d(lq.aC).b(this.e);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      dsd $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      this.a($$0).ifPresent($$3x -> ((eam)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
