import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwm extends dno {
   public static final MapCodec<dwm> a = b(dwm::new);
   public static final ech b = ecg.H;

   @Override
   public MapCodec<dwm> a() {
      return a;
   }

   public dwm(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2) && a($$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if ($$1.D($$2) && a($$1, $$2)) {
         $$1.a($$2, false);
      }
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if (!$$0.A_() && !$$3.gk().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(asb $$0, iw $$1, dkc $$2) {
      if ($$0.O().c(dkf.ad)) {
         cop $$3 = new cop($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
         int $$4 = $$3.f();
         $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static boolean a(dkj $$0, iw $$1) {
      return a($$0, $$1, null);
   }

   private static boolean a(dkj $$0, iw $$1, @Nullable byf $$2) {
      if ($$0 instanceof asb $$3 && $$3.O().c(dkf.ad)) {
         cop $$5 = new cop($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$5);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awy.AC, awz.e, 1.0F, 1.0F);
         $$0.a($$2, egq.I, $$1);
         return true;
      }

      return false;
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if (!$$0.a(dao.pg) && !$$0.a(dao.vg)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         if (a($$2, $$3, $$4)) {
            $$2.a($$3, dnq.a.m(), 11);
            dag $$7 = $$0.h();
            if ($$0.a(dao.pg)) {
               $$0.a(1, $$4, byf.d($$5));
            } else {
               $$0.a(1, $$4);
            }

            $$4.b(axi.c.b($$7));
         } else if ($$2 instanceof asb $$8 && !$$8.O().c(dkf.ad)) {
            $$4.a(xg.c("block.minecraft.tnt.disabled"), true);
            return bvc.e;
         }

         return bvc.a;
      }
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      if ($$0 instanceof asb $$4) {
         iw $$5 = $$2.b();
         bxe $$6 = $$3.p();
         if ($$3.bX() && $$3.c($$4, $$5) && a($$0, $$5, $$6 instanceof byf ? (byf)$$6 : null)) {
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dkc $$0) {
      return false;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }
}
