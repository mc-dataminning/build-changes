import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dlf extends dgv implements dnx {
   public static final MapCodec<dlf> b = b(dlf::new);
   public static final int c = 7;
   public static final dva d = duq.aC;
   public static final dur e = duq.v;
   public static final dur f = duq.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dlf> a() {
      return b;
   }

   public dlf(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      return eyu.a();
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dua $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dua $$0) {
      return 1;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      int $$6 = r($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dua a(dua $$0, ddt $$1, je $$2) {
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

   private static int r(dua $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dua $$0) {
      if ($$0.a(aws.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(f) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            je $$4 = $$2.e();
            dua $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jj.b)) {
               azg.a($$1, $$2, $$3, ln.l);
            }
         }
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      dua $$2 = this.o().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == eqc.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
