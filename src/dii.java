import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dii extends ddy implements dkz {
   public static final MapCodec<dii> b = b(dii::new);
   public static final int c = 7;
   public static final dsb d = drr.aC;
   public static final drs e = drr.v;
   public static final drs f = drr.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dii> a() {
      return b;
   }

   public dii(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected evd b_(drb $$0, dad $$1, io $$2) {
      return eva.a();
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(drb $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(drb $$0, dad $$1, io $$2) {
      return 1;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static drb a(drb $$0, day $$1, io $$2) {
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

   private static int o(drb $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(drb $$0) {
      if ($$0.a(avw.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(f) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            io $$4 = $$2.d();
            drb $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, it.b)) {
               ayg.a($$1, $$2, $$3, ky.l);
            }
         }
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      drb $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == emv.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
