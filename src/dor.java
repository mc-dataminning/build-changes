import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dor extends dnw {
   public static final MapCodec<dor> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dvn.a.fieldOf("wood_type").forGetter(dnw::d), u()).apply($$0, dor::new));
   public static final dva b = duq.ba;

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dvn $$0, dtz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.E.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return this.o().b(b, Integer.valueOf(dvg.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == eqc.c));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.a && !this.a($$0, $$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dua $$0) {
      return dvg.b($$0.c(b));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, f);
   }
}
