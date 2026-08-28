import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class diw extends diq implements dix {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dwm b = dwl.e;
   private static final int c = 5;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      dvv $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            arp $$5 = (arp)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(ls.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(ls.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected erv b_(dvv $$0) {
      return erw.c.a(false);
   }

   public static void b(dfn $$0, jh $$1, dvv $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dfn $$0, jh $$1, dvv $$2, dvv $$3) {
      if (o($$2)) {
         dvv $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         jh.a $$5 = $$1.k().c(jm.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jm.b);
         }
      }
   }

   private static boolean o(dvv $$0) {
      return $$0.a(dis.nd) || $$0.a(dis.G) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dvv q(dvv $$0) {
      if ($$0.a(dis.nd)) {
         return $$0;
      } else if ($$0.a(dis.dW)) {
         return dis.nd.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dis.kJ) ? dis.nd.m().b(b, Boolean.valueOf(true)) : dis.G.m();
      }
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ls.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.da, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ls.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ls.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.cY, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      $$2.a($$3, erw.c, erw.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jm.a || $$4 == jm.b && !$$6.a(dis.nd) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2.e());
      return $$3.a(dis.nd) || $$3.a(dis.kJ) || $$3.a(dis.dW);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.a();
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.a;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   public cwm a(@Nullable cou $$0, dfn $$1, jh $$2, dvv $$3) {
      $$1.a($$2, dis.a.m(), 11);
      return new cwm(cwq.qA);
   }

   @Override
   public Optional<awm> as_() {
      return erw.c.j();
   }
}
