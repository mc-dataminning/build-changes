import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cwn extends cua {
   public static final MapCodec<cwn> a = b(cwn::new);
   public static final dgv b = cxu.aE;
   public static final dgs c = dgr.h;
   protected static final eiy d = cua.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eiy e = cua.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eiy f = eiv.a(d, e);
   private static dgg g;

   @Override
   public MapCodec<cwn> a() {
      return a;
   }

   public cwn(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   public static dgg b() {
      if (g == null) {
         g = dgh.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dgf.a(dgk.a))
            .a('^', dgf.a(dgk.a(cuc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.d))))
            .a('>', dgf.a(dgk.a(cuc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.e))))
            .a('v', dgf.a(dgk.a(cuc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.c))))
            .a('<', dgf.a(dgk.a(cuc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
