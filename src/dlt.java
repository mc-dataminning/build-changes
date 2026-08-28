import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dlt extends dhj implements dol {
   public static final MapCodec<dlt> b = b(dlt::new);
   public static final int c = 7;
   public static final dvo d = dve.aC;
   public static final dvf e = dve.v;
   public static final dvf f = dve.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dlt> a() {
      return b;
   }

   public dlt(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      return ezj.a();
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(duo $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(duo $$0) {
      return 1;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      int $$6 = r($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static duo a(duo $$0, deh $$1, je $$2) {
      int $$3 = 7;
      je.a $$4 = new je.a();

      for (jj $$5 : jj.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(d, Integer.valueOf($$3));
   }

   private static int r(duo $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(duo $$0) {
      if ($$0.a(awt.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(f) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            je $$4 = $$2.e();
            duo $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jj.b)) {
               azh.a($$1, $$2, $$3, ln.l);
            }
         }
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      duo $$2 = this.o().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == eqq.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
