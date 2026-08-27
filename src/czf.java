import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class czf extends cwq {
   public static final MapCodec<czf> a = b(czf::new);
   public static final dkb b = dal.aE;
   public static final djy c = djx.h;
   protected static final emm d = cwq.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final emm e = cwq.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final emm f = emj.a(d, e);
   private static djm g;

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   public czf(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   public static djm b() {
      if (g == null) {
         g = djn.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', djl.a(djq.a))
            .a('^', djl.a(djq.a(cws.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.d))))
            .a('>', djl.a(djq.a(cws.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.e))))
            .a('v', djl.a(djq.a(cws.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.c))))
            .a('<', djl.a(djq.a(cws.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
