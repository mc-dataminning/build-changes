import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cxp extends cva {
   public static final MapCodec<cxp> a = b(cxp::new);
   public static final dic b = cyv.aE;
   public static final dhz c = dhy.h;
   protected static final ekn d = cva.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ekn e = cva.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ekn f = ekk.a(d, e);
   private static dhn g;

   @Override
   public MapCodec<cxp> a() {
      return a;
   }

   public cxp(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }

   public static dhn b() {
      if (g == null) {
         g = dho.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dhm.a(dhr.a))
            .a('^', dhm.a(dhr.a(cvc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.d))))
            .a('>', dhm.a(dhr.a(cvc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.e))))
            .a('v', dhm.a(dhr.a(cvc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.c))))
            .a('<', dhm.a(dhr.a(cvc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
