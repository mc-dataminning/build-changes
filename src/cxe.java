import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cxe extends cuj implements cud {
   public static final MapCodec<cxe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(afv.a(jz.at).fieldOf("feature").forGetter($$0x -> $$0x.e), jy.f.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, cxe::new)
   );
   protected static final eiy b = cua.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cua d;
   private final afv<dob<?, ?>> e;

   @Override
   public MapCodec<cxe> a() {
      return a;
   }

   protected cxe(afv<dob<?, ?>> $$0, cua $$1, dga.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(aqs.aK) || $$0.a(cuc.fl) || $$0.a(cuc.dX) || super.d($$0, $$1, $$2);
   }

   private Optional<? extends ib<dob<?, ?>>> a(crc $$0) {
      return $$0.H_().d(jz.at).b(this.e);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      dgb $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      this.a($$0).ifPresent($$3x -> ((dob)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
