import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dfn extends dcq implements dck {
   public static final MapCodec<dfn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aju.a(ku.az).fieldOf("feature").forGetter($$0x -> $$0x.e), kt.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dfn::new)
   );
   protected static final etc b = dch.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dch d;
   private final aju<dxr<?, ?>> e;

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   protected dfn(aju<dxr<?, ?>> $$0, dch $$1, dph.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(ave.aL) || $$0.a(dcj.fl) || $$0.a(dcj.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends in<dxr<?, ?>>> a(czj $$0) {
      return $$0.H_().d(ku.az).b(this.e);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      dpi $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      this.a($$0).ifPresent($$3x -> ((dxr)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
