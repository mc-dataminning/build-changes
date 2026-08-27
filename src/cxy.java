import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cxy extends cvc implements cuw {
   public static final MapCodec<cxy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(agf.a(jz.au).fieldOf("feature").forGetter($$0x -> $$0x.e), jy.f.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, cxy::new)
   );
   protected static final ekb b = cut.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cut d;
   private final agf<dow<?, ?>> e;

   @Override
   public MapCodec<cxy> a() {
      return a;
   }

   protected cxy(agf<dow<?, ?>> $$0, cut $$1, dgv.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(arc.aK) || $$0.a(cuv.fl) || $$0.a(cuv.dX) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends ib<dow<?, ?>>> a(crv $$0) {
      return $$0.H_().d(jz.au).b(this.e);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      dgw $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      this.a($$0).ifPresent($$3x -> ((dow)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
