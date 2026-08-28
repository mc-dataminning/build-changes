import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class djy extends dhj {
   public static final MapCodec<djy> a = b(djy::new);
   public static final dvi b = dlf.aF;
   public static final dvf c = dve.h;
   protected static final ezm d = dhj.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ezm e = dhj.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ezm f = ezj.a(d, e);
   private static dut g;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public djy(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   public static dut b() {
      if (g == null) {
         g = duu.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dus.a(dux.a))
            .a('^', dus.a(dux.a(dhl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.d))))
            .a('>', dus.a(dux.a(dhl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.e))))
            .a('v', dus.a(dux.a(dhl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.c))))
            .a('<', dus.a(dux.a(dhl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
