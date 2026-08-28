import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpi extends don {
   public static final MapCodec<dpi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwf.a.fieldOf("wood_type").forGetter(don::d), t()).apply($$0, dpi::new));
   public static final dvs b = dvi.ba;

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(dwf $$0, dur.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return this.n().b(b, Integer.valueOf(dvy.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == equ.c));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !this.a($$0, $$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dus $$0) {
      return dvy.b($$0.c(b));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, f);
   }
}
