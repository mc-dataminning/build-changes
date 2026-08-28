import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djk extends dfa implements dmb {
   public static final MapCodec<djk> b = b(djk::new);
   public static final int c = 7;
   public static final dtd d = dst.aC;
   public static final dsu e = dst.v;
   public static final dsu f = dst.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djk> a() {
      return b;
   }

   public djk(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ewl b_(dsd $$0, dbf $$1, iz $$2) {
      return ewi.a();
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dsd $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dsd $$0, dbf $$1, iz $$2) {
      return 1;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dsd a(dsd $$0, dca $$1, iz $$2) {
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

   private static int o(dsd $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dsd $$0) {
      if ($$0.a(awp.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(f) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            iz $$4 = $$2.d();
            dsd $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, je.b)) {
               azd.a($$1, $$2, $$3, li.l);
            }
         }
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      dsd $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == enx.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
