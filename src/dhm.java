import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhm extends dex {
   public static final MapCodec<dhm> a = b(dhm::new);
   public static final dsu b = dit.aE;
   public static final dsr c = dsq.h;
   protected static final ewi d = dex.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ewi e = dex.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ewi f = ewf.a(d, e);
   private static dsf g;

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   public dhm(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   public static dsf b() {
      if (g == null) {
         g = dsg.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dse.a(dsj.a))
            .a('^', dse.a(dsj.a(dez.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.d))))
            .a('>', dse.a(dsj.a(dez.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.e))))
            .a('v', dse.a(dsj.a(dez.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.c))))
            .a('<', dse.a(dsj.a(dez.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
