import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class djr extends dfh implements dmi {
   public static final MapCodec<djr> b = b(djr::new);
   public static final int c = 7;
   public static final dtk d = dta.aC;
   public static final dtb e = dta.v;
   public static final dtb f = dta.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends djr> a() {
      return b;
   }

   public djr(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      return ewv.a();
   }

   @Override
   protected boolean d_(dsk $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dsk $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dsk $$0, dbl $$1, ja $$2) {
      return 1;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dsk a(dsk $$0, dcg $$1, ja $$2) {
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

   private static int o(dsk $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dsk $$0) {
      if ($$0.a(avw.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(f) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            ja $$4 = $$2.d();
            dsk $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, jf.b)) {
               ayk.a($$1, $$2, $$3, lj.l);
            }
         }
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      dsk $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eoi.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
