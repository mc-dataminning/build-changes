import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class day extends cwp implements ddp {
   public static final MapCodec<day> b = b(day::new);
   public static final int c = 7;
   public static final dkg d = djw.aC;
   public static final djx e = djw.v;
   public static final djx f = djw.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends day> a() {
      return b;
   }

   public day(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public eml b_(djg $$0, csu $$1, hx $$2) {
      return emi.a();
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(djg $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(djg $$0, csu $$1, hx $$2) {
      return 1;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static djg a(djg $$0, ctp $$1, hx $$2) {
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

   private static int o(djg $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(djg $$0) {
      if ($$0.a(asg.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(f) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            hx $$4 = $$2.d();
            djg $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ic.b)) {
               auq.a($$1, $$2, $$3, jx.m);
            }
         }
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      djg $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == eer.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
