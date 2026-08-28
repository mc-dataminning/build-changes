import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djs extends dfi implements dmj {
   public static final MapCodec<djs> b = b(djs::new);
   public static final int c = 7;
   public static final dtl d = dtb.aC;
   public static final dtc e = dtb.v;
   public static final dtc f = dtb.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djs> a() {
      return b;
   }

   public djs(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      return ewx.a();
   }

   @Override
   protected boolean d_(dsl $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dsl $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dsl $$0, dbm $$1, ja $$2) {
      return 1;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dsl a(dsl $$0, dch $$1, ja $$2) {
      int $$3 = 7;
      ja.a $$4 = new ja.a();

      for (jf $$5 : jf.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dsl $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dsl $$0) {
      if ($$0.a(avw.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(f) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            ja $$4 = $$2.d();
            dsl $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, jf.b)) {
               ayk.a($$1, $$2, $$3, lj.l);
            }
         }
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      dsl $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eok.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
