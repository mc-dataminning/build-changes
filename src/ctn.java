import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctn extends cuf {
   public static final dhq a = cyo.aE;
   public static final dhn b = dhm.r;

   protected ctn(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ctn> a();

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         this.a($$1, $$2, $$3);
         return biq.b;
      }
   }

   protected abstract void a(crs var1, ht var2, cdm var3);

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof deg) {
            ((deg)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         der $$5 = $$1.c_($$2);
         if ($$5 instanceof deg) {
            if ($$1 instanceof ama) {
               bim.a($$1, $$2, (deg)$$5);
               ((deg)$$5).a((ama)$$1, eji.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.a($$1.c_($$2));
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends der> des<T> a(crs $$0, det<T> $$1, det<? extends deg> $$2) {
      return $$0.B ? null : a($$1, $$2, deg::a);
   }
}
