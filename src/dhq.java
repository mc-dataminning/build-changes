import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhq extends dfb {
   public static final MapCodec<dhq> a = b(dhq::new);
   public static final dsy b = dix.aE;
   public static final dsv c = dsu.h;
   protected static final ewm d = dfb.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ewm e = dfb.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ewm f = ewj.a(d, e);
   private static dsj g;

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dhq(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   public static dsj b() {
      if (g == null) {
         g = dsk.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dsi.a(dsn.a))
            .a('^', dsi.a(dsn.a(dfd.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.d))))
            .a('>', dsi.a(dsn.a(dfd.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.e))))
            .a('v', dsi.a(dsn.a(dfd.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.c))))
            .a('<', dsi.a(dsn.a(dfd.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
