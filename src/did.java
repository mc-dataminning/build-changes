import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class did extends dfg implements dfa {
   public static final MapCodec<did> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), lp.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, did::new)
   );
   protected static final ewi b = dex.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dex d;
   private final ald<eaj<?, ?>> e;

   @Override
   public MapCodec<did> a() {
      return a;
   }

   protected did(ald<eaj<?, ?>> $$0, dex $$1, drz.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(awo.aL) || $$0.a(dez.fl) || $$0.a(dez.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ji<eaj<?, ?>>> a(dbz $$0) {
      return $$0.H_().d(lq.aC).b(this.e);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      dsa $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      this.a($$0).ifPresent($$3x -> ((eaj)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
