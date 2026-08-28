import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends diq {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final dwu b = dwl.aQ;
   protected static final fas c = diq.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dlo || $$3.b() instanceof dvn;
   }

   @Override
   public dvv a(dad $$0) {
      return !this.m().a((dfp)$$0.q(), $$0.a()) ? dis.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      int $$4 = $$0.c(b);
      if (!a((dfp)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((der)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dfm $$0, dvv $$1, jh $$2, bul $$3, float $$4) {
      if ($$0 instanceof arp $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bvh
         && ($$3 instanceof cou || $$5.N().b(dfi.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bul $$0, dvv $$1, dfm $$2, jh $$3) {
      dvv $$4 = a($$1, dis.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ear.c, $$3, ear.a.a($$0, $$4));
   }

   private static boolean a(der $$0, jh $$1) {
      return $$0.a_($$1.d()).a(axc.cz);
   }

   private static boolean a(dfp $$0, jh $$1) {
      for (jh $$2 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axi.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
