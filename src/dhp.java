import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhp extends dfa {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final dsx b = diw.aE;
   public static final dsu c = dst.h;
   protected static final ewl d = dfa.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ewl e = dfa.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ewl f = ewi.a(d, e);
   private static dsi g;

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   public static dsi b() {
      if (g == null) {
         g = dsj.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dsh.a(dsm.a))
            .a('^', dsh.a(dsm.a(dfc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.d))))
            .a('>', dsh.a(dsm.a(dfc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.e))))
            .a('v', dsh.a(dsm.a(dfc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.c))))
            .a('<', dsh.a(dsm.a(dfc.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
