import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhl extends dde implements dkf {
   public static final MapCodec<dhl> a = b(dhl::new);
   public static final dqy b = dqx.j;
   public static final dqy c = dqx.C;
   protected static final eui d = euf.a(dde.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dde.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eui e = euf.a(dde.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dde.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   public dhl(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());

      for (is $$2 : $$0.f()) {
         if ($$2.o() == is.a.b) {
            dqh $$3 = this.n().a(b, Boolean.valueOf($$2 == is.b));
            if ($$3.a((dag)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == emb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      is $$3 = m($$0).g();
      return dde.a($$1, $$2.a($$3), $$3.g());
   }

   protected static is m(dqh $$0) {
      return $$0.c(b) ? is.a : is.b;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
