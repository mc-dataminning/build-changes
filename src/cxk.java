import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class cxk extends ctc implements dab {
   public static final MapCodec<cxk> b = b(cxk::new);
   public static final int c = 7;
   public static final dgd d = dft.aC;
   public static final dfu e = dft.v;
   public static final dfu f = dft.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends cxk> a() {
      return b;
   }

   public cxk(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      return ehx.a();
   }

   @Override
   public boolean e_(dfd $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dfd $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dfd $$0, cph $$1, gw $$2) {
      return 1;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dfd a(dfd $$0, cqc $$1, gw $$2) {
      int $$3 = 7;
      gw.a $$4 = new gw.a();

      for (ha $$5 : ha.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dfd $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dfd $$0) {
      if ($$0.a(apv.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(f) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$1.q($$2.c())) {
         if ($$3.a(15) == 1) {
            gw $$4 = $$2.d();
            dfd $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ha.b)) {
               ase.a($$1, $$2, $$3, iv.m);
            }
         }
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      dfd $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eah.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
