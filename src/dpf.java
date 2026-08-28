import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpf extends dok {
   public static final MapCodec<dpf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwb.a.fieldOf("wood_type").forGetter(dok::d), u()).apply($$0, dpf::new));
   public static final dvo b = dve.ba;

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   public dpf(dwb $$0, dun.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return this.o().b(b, Integer.valueOf(dvu.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == eqq.c));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !this.a($$0, $$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(duo $$0) {
      return dvu.b($$0.c(b));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, f);
   }
}
