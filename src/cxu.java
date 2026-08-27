import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cxu extends cvf {
   public static final MapCodec<cxu> a = b(cxu::new);
   public static final dih b = cza.aE;
   public static final die c = did.h;
   protected static final eks d = cvf.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eks e = cvf.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eks f = ekp.a(d, e);
   private static dhs g;

   @Override
   public MapCodec<cxu> a() {
      return a;
   }

   public cxu(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   public static dhs b() {
      if (g == null) {
         g = dht.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dhr.a(dhw.a))
            .a('^', dhr.a(dhw.a(cvh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ib.d))))
            .a('>', dhr.a(dhw.a(cvh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ib.e))))
            .a('v', dhr.a(dhw.a(cvh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ib.c))))
            .a('<', dhr.a(dhw.a(cvh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ib.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
