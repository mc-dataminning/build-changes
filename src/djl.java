import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djl extends dfb implements dmc {
   public static final MapCodec<djl> b = b(djl::new);
   public static final int c = 7;
   public static final dte d = dsu.aC;
   public static final dsv e = dsu.v;
   public static final dsv f = dsu.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djl> a() {
      return b;
   }

   public djl(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ewm b_(dse $$0, dbg $$1, iz $$2) {
      return ewj.a();
   }

   @Override
   protected boolean d_(dse $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dse $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dse $$0, dbg $$1, iz $$2) {
      return 1;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dse a(dse $$0, dcb $$1, iz $$2) {
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

   private static int o(dse $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dse $$0) {
      if ($$0.a(awp.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(f) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            iz $$4 = $$2.d();
            dse $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, je.b)) {
               azd.a($$1, $$2, $$3, li.l);
            }
         }
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      dse $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eny.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
