import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cyo extends cvz {
   public static final MapCodec<cyo> a = b(cyo::new);
   public static final djj b = czu.aE;
   public static final djg c = djf.h;
   protected static final elu d = cvz.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final elu e = cvz.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final elu f = elr.a(d, e);
   private static diu g;

   @Override
   public MapCodec<cyo> a() {
      return a;
   }

   public cyo(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }

   public static diu b() {
      if (g == null) {
         g = div.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dit.a(diy.a))
            .a('^', dit.a(diy.a(cwb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ia.d))))
            .a('>', dit.a(diy.a(cwb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ia.e))))
            .a('v', dit.a(diy.a(cwb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ia.c))))
            .a('<', dit.a(diy.a(cwb.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ia.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
