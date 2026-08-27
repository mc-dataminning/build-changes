import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvx extends ctc {
   public static final MapCodec<cvx> a = b(cvx::new);
   public static final dgd b = dft.aQ;
   protected static final eia c = ctc.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<cvx> a() {
      return a;
   }

   protected cvx(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvz || $$3.b() instanceof dev;
   }

   @Override
   public dfd a(clt $$0) {
      return !this.o().a((cqe)$$0.q(), $$0.a()) ? cte.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      int $$4 = $$0.c(b);
      if (!a((cqe)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cph)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bjm && ($$3 instanceof cca || $$0.X().b(cpx.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable biw $$0, dfd $$1, cqb $$2, gw $$3) {
      dfd $$4 = a($$1, cte.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(djn.c, $$3, djn.a.a($$0, $$4));
   }

   private static boolean a(cph $$0, gw $$1) {
      return $$0.a_($$1.c()).a(apv.cp);
   }

   private static boolean a(cqe $$0, gw $$1) {
      for (gw $$2 : gw.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aqa.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
