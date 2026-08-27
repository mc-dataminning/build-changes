import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dby extends czb implements cyv {
   public static final MapCodec<dby> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aix.a(kg.aw).fieldOf("feature").forGetter($$0x -> $$0x.e), kf.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dby::new)
   );
   protected static final eos b = cys.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cys d;
   private final aix<dtm<?, ?>> e;

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   protected dby(aix<dtm<?, ?>> $$0, cys $$1, dli.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(aua.aK) || $$0.a(cyu.fl) || $$0.a(cyu.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ij<dtm<?, ?>>> a(cvu $$0) {
      return $$0.I_().d(kg.aw).b(this.e);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      dlj $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      this.a($$0).ifPresent($$3x -> ((dtm)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
