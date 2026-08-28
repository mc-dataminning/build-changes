import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djj extends dez implements dma {
   public static final MapCodec<djj> b = b(djj::new);
   public static final int c = 7;
   public static final dtc d = dss.aC;
   public static final dst e = dss.v;
   public static final dst f = dss.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djj> a() {
      return b;
   }

   public djj(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ewk b_(dsc $$0, dbe $$1, iz $$2) {
      return ewh.a();
   }

   @Override
   protected boolean d_(dsc $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dsc $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dsc $$0, dbe $$1, iz $$2) {
      return 1;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dsc a(dsc $$0, dbz $$1, iz $$2) {
      int $$3 = 7;
      iz.a $$4 = new iz.a();

      for (je $$5 : je.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dsc $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dsc $$0) {
      if ($$0.a(awp.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(f) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            iz $$4 = $$2.d();
            dsc $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, je.b)) {
               azd.a($$1, $$2, $$3, li.l);
            }
         }
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      dsc $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == enw.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
