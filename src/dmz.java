import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dmz extends diq implements dpr {
   public static final MapCodec<dmz> b = b(dmz::new);
   public static final int c = 7;
   public static final dwu d = dwl.aC;
   public static final dwm e = dwl.v;
   public static final dwm f = dwl.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dmz> a() {
      return b;
   }

   public dmz(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      return fap.a();
   }

   @Override
   protected boolean f(dvv $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dvv $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dvv $$0) {
      return 1;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(d) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dvv a(dvv $$0, dfn $$1, jh $$2) {
      int $$3 = 7;
      jh.a $$4 = new jh.a();

      for (jm $$5 : jm.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(d, Integer.valueOf($$3));
   }

   private static int r(dvv $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dvv $$0) {
      if ($$0.a(axc.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(f) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jh $$4 = $$2.e();
            dvv $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jm.b)) {
               azq.a($$1, $$2, $$3, ls.l);
            }
         }
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      dvv $$2 = this.m().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == erw.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
