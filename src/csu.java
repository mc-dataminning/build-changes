import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class csu extends ctm {
   public static final dgv a = cxu.aE;
   public static final dgs b = dgr.r;

   protected csu(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends csu> a();

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         this.a($$1, $$2, $$3);
         return bib.b;
      }
   }

   protected abstract void a(cqz var1, ht var2, ccx var3);

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof ddm) {
            ((ddm)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         ddx $$5 = $$1.c_($$2);
         if ($$5 instanceof ddm) {
            if ($$1 instanceof alq) {
               bhx.a($$1, $$2, (ddm)$$5);
               ((ddm)$$5).a((alq)$$1, eif.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return cfp.a($$1.c_($$2));
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends ddx> ddy<T> a(cqz $$0, ddz<T> $$1, ddz<? extends ddm> $$2) {
      return $$0.B ? null : a($$1, $$2, ddm::a);
   }
}
