import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dho extends dde implements dkf {
   public static final MapCodec<dho> b = b(dho::new);
   public static final int c = 7;
   public static final drh d = dqx.aC;
   public static final dqy e = dqx.v;
   public static final dqy f = dqx.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dho> a() {
      return b;
   }

   public dho(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      return euf.a();
   }

   @Override
   protected boolean d_(dqh $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dqh $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dqh $$0, czj $$1, in $$2) {
      return 1;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dqh a(dqh $$0, dae $$1, in $$2) {
      int $$3 = 7;
      in.a $$4 = new in.a();

      for (is $$5 : is.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dqh $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dqh $$0) {
      if ($$0.a(avr.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(f) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            in $$4 = $$2.d();
            dqh $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, is.b)) {
               ayc.a($$1, $$2, $$3, kx.l);
            }
         }
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      dqh $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == emb.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
