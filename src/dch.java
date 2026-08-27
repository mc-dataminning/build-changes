import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dch extends cua {
   public static final MapCodec<dch> a = b(dch::new);
   public static final dgs b = dgr.B;

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   public dch(dga.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqz $$0, ht $$1, cqr $$2) {
      if (!$$0.B) {
         bzr $$3 = new bzr($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cqz $$0, ht $$1) {
      a($$0, $$1, null);
   }

   private static void a(cqz $$0, ht $$1, @Nullable bkj $$2) {
      if (!$$0.B) {
         bzr $$3 = new bzr($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dq(), $$3.ds(), $$3.dw(), aqd.xN, aqe.e, 1.0F, 1.0F);
         $$0.a($$2, dkl.I, $$1);
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      if (!$$6.a(ckm.nE) && !$$6.a(ckm.tf)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cuc.a.o(), 11);
         cke $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(ckm.nE)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(aqn.c.b($$7));
         return bib.a($$1.B);
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      if (!$$0.B) {
         ht $$4 = $$2.a();
         bjt $$5 = $$3.v();
         if ($$3.bM() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bkj ? (bkj)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cqr $$0) {
      return false;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }
}
