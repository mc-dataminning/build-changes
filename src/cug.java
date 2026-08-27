import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cug extends cua implements cuh {
   public static final MapCodec<cug> a = b(cug::new);
   public static final dgs b = dgr.e;
   private static final int c = 5;

   @Override
   public MapCodec<cug> a() {
      return a;
   }

   public cug(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      dgb $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            alq $$5 = (alq)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(js.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(js.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public ebe c_(dgb $$0) {
      return ebf.c.a(false);
   }

   public static void b(cra $$0, ht $$1, dgb $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cra $$0, ht $$1, dgb $$2, dgb $$3) {
      if (h($$2)) {
         dgb $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ht.a $$5 = $$1.j().c(hx.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(hx.b);
         }
      }
   }

   private static boolean h(dgb $$0) {
      return $$0.a(cuc.nd) || $$0.a(cuc.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dgb n(dgb $$0) {
      if ($$0.a(cuc.nd)) {
         return $$0;
      } else if ($$0.a(cuc.dW)) {
         return cuc.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cuc.kJ) ? cuc.nd.o().a(b, Boolean.valueOf(true)) : cuc.G.o();
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(js.aj, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqd.ct, aqe.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(js.ak, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(js.ak, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqd.cr, aqe.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      $$3.a($$4, ebf.c, ebf.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == hx.a || $$1 == hx.b && !$$2.a(cuc.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2.d());
      return $$3.a(cuc.nd) || $$3.a(cuc.kJ) || $$3.a(cuc.dW);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return eiv.a();
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.a;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public ckj a(@Nullable ccx $$0, cra $$1, ht $$2, dgb $$3) {
      $$1.a($$2, cuc.a.o(), 11);
      return new ckj(ckm.pL);
   }

   @Override
   public Optional<aqc> at_() {
      return ebf.c.j();
   }
}
