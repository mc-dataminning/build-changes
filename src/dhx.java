import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhx extends dfa {
   public static final MapCodec<dhx> a = b(dhx::new);
   public static final dtd b = dst.aQ;
   protected static final ewl c = dfa.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   protected dhx(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhz || $$3.b() instanceof drv;
   }

   @Override
   public dsd a(cyb $$0) {
      return !this.o().a((dcc)$$0.q(), $$0.a()) ? dfc.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcc)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbf)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btq && ($$3 instanceof cmy || $$0.ab().b(dbv.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsv $$0, dsd $$1, dbz $$2, iz $$3) {
      dsd $$4 = a($$1, dfc.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dww.c, $$3, dww.a.a($$0, $$4));
   }

   private static boolean a(dbf $$0, iz $$1) {
      return $$0.a_($$1.c()).a(awp.cx);
   }

   private static boolean a(dcc $$0, iz $$1) {
      for (iz $$2 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
