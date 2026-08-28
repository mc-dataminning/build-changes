import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfe extends dey implements dff {
   public static final MapCodec<dfe> a = b(dfe::new);
   public static final dss b = dsr.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      dsb $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            are $$5 = (are)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(li.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(li.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected enu b_(dsb $$0) {
      return env.c.a(false);
   }

   public static void b(dby $$0, iz $$1, dsb $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dby $$0, iz $$1, dsb $$2, dsb $$3) {
      if (m($$2)) {
         dsb $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         iz.a $$5 = $$1.j().c(je.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(je.b);
         }
      }
   }

   private static boolean m(dsb $$0) {
      return $$0.a(dfa.nd) || $$0.a(dfa.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dsb n(dsb $$0) {
      if ($$0.a(dfa.nd)) {
         return $$0;
      } else if ($$0.a(dfa.dW)) {
         return dfa.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfa.kJ) ? dfa.nd.o().a(b, Boolean.valueOf(true)) : dfa.G.o();
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(li.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avz.da, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(li.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(li.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avz.cY, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      $$3.a($$4, env.c, env.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == je.a || $$1 == je.b && !$$2.a(dfa.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.d());
      return $$3.a(dfa.nd) || $$3.a(dfa.kJ) || $$3.a(dfa.dW);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ewg.a();
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.a;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   public cuo a(@Nullable cmw $$0, dby $$1, iz $$2, dsb $$3) {
      $$1.a($$2, dfa.a.o(), 11);
      return new cuo(cur.qz);
   }

   @Override
   public Optional<avy> ar_() {
      return env.c.j();
   }
}
