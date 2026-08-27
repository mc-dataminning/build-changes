import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dgq extends dch implements djh {
   public static final MapCodec<dgq> b = b(dgq::new);
   public static final int c = 7;
   public static final dqi d = dpy.aC;
   public static final dpz e = dpy.v;
   public static final dpz f = dpy.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dgq> a() {
      return b;
   }

   public dgq(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected etc b_(dpi $$0, cym $$1, id $$2) {
      return esz.a();
   }

   @Override
   protected boolean e_(dpi $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dpi $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dpi $$0, cym $$1, id $$2) {
      return 1;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dpi a(dpi $$0, czh $$1, id $$2) {
      int $$3 = 7;
      id.a $$4 = new id.a();

      for (ij $$5 : ij.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dpi $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dpi $$0) {
      if ($$0.a(ave.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(f) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            id $$4 = $$2.d();
            dpi $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ij.b)) {
               axp.a($$1, $$2, $$3, kn.m);
            }
         }
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      dpi $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == elc.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
