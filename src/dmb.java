import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmb extends dlu implements dmc {
   public static final MapCodec<dmb> a = b(dmb::new);
   public static final eaf b = eae.h;
   private static final int c = 5;

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   public dmb(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      dzo $$4 = $$1.a_($$2.d());
      boolean $$5 = $$4.g($$1, $$2).c() && $$4.y().c();
      if ($$5) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected evv b_(dzo $$0) {
      return evw.c.a(false);
   }

   public static void b(diq $$0, iu $$1, dzo $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(diq $$0, iu $$1, dzo $$2, dzo $$3) {
      if (o($$2)) {
         dzo $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         iu.a $$5 = $$1.k().c(ja.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ja.b);
         }
      }
   }

   private static boolean o(dzo $$0) {
      return $$0.a(dlw.nF) || $$0.a(dlw.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dzo q(dzo $$0) {
      if ($$0.a(dlw.nF)) {
         return $$0;
      } else if ($$0.a(dlw.ej)) {
         return dlw.nF.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dlw.ll) ? dlw.nF.m().b(b, Boolean.valueOf(true)) : dlw.J.m();
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lx.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awl.da, awm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lx.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lx.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awl.cY, awm.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      $$2.a($$3, evw.c, evw.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == ja.a || $$4 == ja.b && !$$6.a(dlw.nF) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.e());
      return $$3.a(dlw.nF) || $$3.a(dlw.ll) || $$3.a(dlw.ej);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.a();
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   public cys a(@Nullable bwz $$0, diq $$1, iu $$2, dzo $$3) {
      $$1.a($$2, dlw.a.m(), 11);
      return new cys(cyw.rk);
   }

   @Override
   public Optional<awk> ao_() {
      return evw.c.j();
   }
}
