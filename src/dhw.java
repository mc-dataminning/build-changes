import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhw extends dhb {
   public static final MapCodec<dhw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(doo.a.fieldOf("wood_type").forGetter(dhb::d), u()).apply($$0, dhw::new));
   public static final dob b = dnr.ba;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(doo $$0, dna.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(doh.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eiq.c));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dnb $$0) {
      return doh.b($$0.c(b));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, f);
   }
}
