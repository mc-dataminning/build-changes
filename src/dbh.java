import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dbh extends cys {
   public static final MapCodec<dbh> a = b(dbh::new);
   public static final dmd b = dcn.aE;
   public static final dma c = dlz.h;
   protected static final eos d = cys.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eos e = cys.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eos f = eop.a(d, e);
   private static dlo g;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   public static dlo b() {
      if (g == null) {
         g = dlp.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dln.a(dls.a))
            .a('^', dln.a(dls.a(cyu.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.d))))
            .a('>', dln.a(dls.a(cyu.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.e))))
            .a('v', dln.a(dls.a(cyu.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.c))))
            .a('<', dln.a(dls.a(cyu.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
