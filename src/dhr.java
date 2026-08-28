import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhr extends deu {
   public static final MapCodec<dhr> a = b(dhr::new);
   public static final dsx b = dsn.aQ;
   protected static final ewf c = deu.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   protected dhr(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      drx $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dht || $$3.b() instanceof drp;
   }

   @Override
   public drx a(cxv $$0) {
      return !this.n().a((dbw)$$0.q(), $$0.a()) ? dew.j.n() : super.a($$0);
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      int $$4 = $$0.c(b);
      if (!a((dbw)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((daz)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dbt $$0, drx $$1, iz $$2, bsp $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btk && ($$3 instanceof cms || $$0.ab().b(dbp.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsp $$0, drx $$1, dbt $$2, iz $$3) {
      drx $$4 = a($$1, dew.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dwq.c, $$3, dwq.a.a($$0, $$4));
   }

   private static boolean a(daz $$0, iz $$1) {
      return $$0.a_($$1.c()).a(awl.cx);
   }

   private static boolean a(dbw $$0, iz $$1) {
      for (iz $$2 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awr.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
