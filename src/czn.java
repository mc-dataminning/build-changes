import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class czn extends cwy {
   public static final MapCodec<czn> a = b(czn::new);
   public static final dkj b = dat.aE;
   public static final dkg c = dkf.h;
   protected static final emv d = cwy.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final emv e = cwy.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final emv f = ems.a(d, e);
   private static dju g;

   @Override
   public MapCodec<czn> a() {
      return a;
   }

   public czn(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   public static dju b() {
      if (g == null) {
         g = djv.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', djt.a(djy.a))
            .a('^', djt.a(djy.a(cxa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.d))))
            .a('>', djt.a(djy.a(cxa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.e))))
            .a('v', djt.a(djy.a(cxa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.c))))
            .a('<', djt.a(djy.a(cxa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
