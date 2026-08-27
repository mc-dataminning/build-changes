import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dft extends dde {
   public static final MapCodec<dft> a = b(dft::new);
   public static final drb b = dha.aE;
   public static final dqy c = dqx.h;
   protected static final eui d = dde.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eui e = dde.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eui f = euf.a(d, e);
   private static dqm g;

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   public static dqm b() {
      if (g == null) {
         g = dqn.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dql.a(dqq.a))
            .a('^', dql.a(dqq.a(ddg.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(is.d))))
            .a('>', dql.a(dqq.a(ddg.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(is.e))))
            .a('v', dql.a(dqq.a(ddg.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(is.c))))
            .a('<', dql.a(dqq.a(ddg.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(is.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
