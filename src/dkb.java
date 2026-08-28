import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dkb extends dhm {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final dvm b = dli.aF;
   public static final dvj c = dvi.h;
   protected static final ezq d = dhm.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ezq e = dhm.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ezq f = ezn.a(d, e);
   private static dux g;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   public static dux b() {
      if (g == null) {
         g = duy.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', duw.a(dvb.a))
            .a('^', duw.a(dvb.a(dho.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jk.d))))
            .a('>', duw.a(dvb.a(dho.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jk.e))))
            .a('v', duw.a(dvb.a(dho.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jk.c))))
            .a('<', duw.a(dvb.a(dho.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jk.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
