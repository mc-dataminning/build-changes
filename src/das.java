import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class das extends cwj implements ddj {
   public static final MapCodec<das> b = b(das::new);
   public static final int c = 7;
   public static final dka d = djq.aC;
   public static final djr e = djq.v;
   public static final djr f = djq.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends das> a() {
      return b;
   }

   public das(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public emf b_(dja $$0, cso $$1, hx $$2) {
      return emc.a();
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(dja $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(dja $$0, cso $$1, hx $$2) {
      return 1;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dja a(dja $$0, ctj $$1, hx $$2) {
      int $$3 = 7;
      hx.a $$4 = new hx.a();

      for (ic $$5 : ic.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dja $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dja $$0) {
      if ($$0.a(asb.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(f) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            hx $$4 = $$2.d();
            dja $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ic.b)) {
               aul.a($$1, $$2, $$3, jx.m);
            }
         }
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      dja $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eel.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
