import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class daz extends cwq implements ddq {
   public static final MapCodec<daz> b = b(daz::new);
   public static final int c = 7;
   public static final dkh d = djx.aC;
   public static final djy e = djx.v;
   public static final djy f = djx.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends daz> a() {
      return b;
   }

   public daz(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public emm b_(djh $$0, csv $$1, hx $$2) {
      return emj.a();
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(djh $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(djh $$0, csv $$1, hx $$2) {
      return 1;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static djh a(djh $$0, ctq $$1, hx $$2) {
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

   private static int o(djh $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(djh $$0) {
      if ($$0.a(ash.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(f) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            hx $$4 = $$2.d();
            djh $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ic.b)) {
               aur.a($$1, $$2, $$3, jx.m);
            }
         }
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      djh $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == ees.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
