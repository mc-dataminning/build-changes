import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dic extends dff {
   public static final MapCodec<dic> a = b(dic::new);
   public static final dth b = dsx.aQ;
   protected static final ews c = dff.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   protected dic(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof die || $$3.b() instanceof drz;
   }

   @Override
   public dsh a(cxk $$0) {
      return !this.o().a((dcg)$$0.q(), $$0.a()) ? dfh.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcg)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbj)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bsy && ($$3 instanceof cmh || $$0.ab().b(dbz.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsd $$0, dsh $$1, dcd $$2, ja $$3) {
      dsh $$4 = a($$1, dfh.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dxa.c, $$3, dxa.a.a($$0, $$4));
   }

   private static boolean a(dbj $$0, ja $$1) {
      return $$0.a_($$1.c()).a(avu.cx);
   }

   private static boolean a(dcg $$0, ja $$1) {
      for (ja $$2 : ja.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awa.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
