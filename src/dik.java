import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dik extends dea implements dlb {
   public static final MapCodec<dik> b = b(dik::new);
   public static final int c = 7;
   public static final dsd d = drt.aC;
   public static final dru e = drt.v;
   public static final dru f = drt.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dik> a() {
      return b;
   }

   public dik(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      return evc.a();
   }

   @Override
   protected boolean d_(drd $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(drd $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(drd $$0, daf $$1, io $$2) {
      return 1;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static drd a(drd $$0, dba $$1, io $$2) {
      int $$3 = 7;
      io.a $$4 = new io.a();

      for (it $$5 : it.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(drd $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(drd $$0) {
      if ($$0.a(avx.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(f) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            io $$4 = $$2.d();
            drd $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, it.b)) {
               ayi.a($$1, $$2, $$3, ky.l);
            }
         }
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      drd $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == emx.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
