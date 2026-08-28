import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dio extends dfr implements dfl {
   public static final MapCodec<dio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aH).fieldOf("feature").forGetter($$0x -> $$0x.e), lq.e.r().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dio::new)
   );
   protected static final exa b = dfi.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dfi d;
   private final akj<eay<?, ?>> e;

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(akj<eay<?, ?>> $$0, dfi $$1, dsk.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(avw.aL) || $$0.a(dfk.fl) || $$0.a(dfk.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jj<eay<?, ?>>> a(dcj $$0) {
      return $$0.H_().d(lr.aH).b(this.e);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      dsl $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      this.a($$0).ifPresent($$3x -> ((eay)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
