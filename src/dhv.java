import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhv extends dey {
   public static final MapCodec<dhv> a = b(dhv::new);
   public static final dtb b = dsr.aQ;
   protected static final ewj c = dey.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   protected dhv(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhx || $$3.b() instanceof drt;
   }

   @Override
   public dsb a(cxz $$0) {
      return !this.o().a((dca)$$0.q(), $$0.a()) ? dfa.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      int $$4 = $$0.c(b);
      if (!a((dca)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbd)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dbx $$0, dsb $$1, iz $$2, bst $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bto && ($$3 instanceof cmw || $$0.ab().b(dbt.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bst $$0, dsb $$1, dbx $$2, iz $$3) {
      dsb $$4 = a($$1, dfa.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dwu.c, $$3, dwu.a.a($$0, $$4));
   }

   private static boolean a(dbd $$0, iz $$1) {
      return $$0.a_($$1.c()).a(awo.cx);
   }

   private static boolean a(dca $$0, iz $$1) {
      for (iz $$2 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awu.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
