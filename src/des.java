import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class des extends ddx {
   public static final MapCodec<des> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlc.a.fieldOf("wood_type").forGetter(ddx::d), u()).apply($$0, des::new));
   public static final dkp b = dkf.ba;

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(dlc $$0, djo.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dkv.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == efa.c));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djp $$0) {
      return dkv.b($$0.c(b));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, f);
   }
}
