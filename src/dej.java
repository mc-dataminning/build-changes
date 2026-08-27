import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dej extends daa implements dha {
   public static final MapCodec<dej> b = b(dej::new);
   public static final int c = 7;
   public static final dnz d = dnp.aC;
   public static final dnq e = dnp.v;
   public static final dnq f = dnp.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dej> a() {
      return b;
   }

   public dej(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected eqk b_(dmz $$0, cwf $$1, ib $$2) {
      return eqh.a();
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dmz $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dmz $$0, cwf $$1, ib $$2) {
      return 1;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dmz a(dmz $$0, cxa $$1, ib $$2) {
      int $$3 = 7;
      ib.a $$4 = new ib.a();

      for (ih $$5 : ih.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dmz $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dmz $$0) {
      if ($$0.a(aun.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(f) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            ib $$4 = $$2.d();
            dmz $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ih.b)) {
               awz.a($$1, $$2, $$3, kc.m);
            }
         }
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      dmz $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eio.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
