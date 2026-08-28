import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfd extends dex implements dfe {
   public static final MapCodec<dfd> a = b(dfd::new);
   public static final dsr b = dsq.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   public dfd(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      dsa $$4 = $$1.a_($$2.c());
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
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected ent b_(dsa $$0) {
      return enu.c.a(false);
   }

   public static void b(dbx $$0, iz $$1, dsa $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dbx $$0, iz $$1, dsa $$2, dsa $$3) {
      if (m($$2)) {
         dsa $$4 = n($$3);
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

   private static boolean m(dsa $$0) {
      return $$0.a(dez.nd) || $$0.a(dez.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dsa n(dsa $$0) {
      if ($$0.a(dez.nd)) {
         return $$0;
      } else if ($$0.a(dez.dW)) {
         return dez.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dez.kJ) ? dez.nd.o().a(b, Boolean.valueOf(true)) : dez.G.o();
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
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
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      $$3.a($$4, enu.c, enu.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == je.a || $$1 == je.b && !$$2.a(dez.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      dsa $$3 = $$1.a_($$2.d());
      return $$3.a(dez.nd) || $$3.a(dez.kJ) || $$3.a(dez.dW);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ewf.a();
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.a;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   public cun a(@Nullable cmv $$0, dbx $$1, iz $$2, dsa $$3) {
      $$1.a($$2, dez.a.o(), 11);
      return new cun(cuq.qz);
   }

   @Override
   public Optional<avy> as_() {
      return enu.c.j();
   }
}
