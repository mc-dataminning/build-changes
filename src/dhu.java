import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhu extends dex {
   public static final MapCodec<dhu> a = b(dhu::new);
   public static final dta b = dsq.aQ;
   protected static final ewi c = dex.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   protected dhu(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      dsa $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhw || $$3.b() instanceof drs;
   }

   @Override
   public dsa a(cxy $$0) {
      return !this.o().a((dbz)$$0.q(), $$0.a()) ? dez.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      int $$4 = $$0.c(b);
      if (!a((dbz)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbc)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dbw $$0, dsa $$1, iz $$2, bss $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btn && ($$3 instanceof cmv || $$0.ab().b(dbs.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bss $$0, dsa $$1, dbw $$2, iz $$3) {
      dsa $$4 = a($$1, dez.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dwt.c, $$3, dwt.a.a($$0, $$4));
   }

   private static boolean a(dbc $$0, iz $$1) {
      return $$0.a_($$1.c()).a(awo.cx);
   }

   private static boolean a(dbz $$0, iz $$1) {
      for (iz $$2 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awu.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
