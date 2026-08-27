import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cwg extends ctl implements ctf {
   public static final MapCodec<cwg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aey.a(jc.at).fieldOf("feature").forGetter($$0x -> $$0x.e), jb.f.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, cwg::new)
   );
   protected static final eia b = ctc.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final ctc d;
   private final aey<dnd<?, ?>> e;

   @Override
   public MapCodec<cwg> a() {
      return a;
   }

   protected cwg(aey<dnd<?, ?>> $$0, ctc $$1, dfc.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(apv.aK) || $$0.a(cte.fl) || $$0.a(cte.dX) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends he<dnd<?, ?>>> a(cqe $$0) {
      return $$0.G_().d(jc.at).b(this.e);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      dfd $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      this.a($$0).ifPresent($$3x -> ((dnd)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
