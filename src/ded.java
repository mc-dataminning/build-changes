import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ded extends deu {
   public static final dtf a = dje.aE;
   public static final dtc b = dtb.r;

   protected ded(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, jf.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ded> a();

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqh.c;
      }
   }

   protected abstract void a(dcg var1, ja var2, cml var3);

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dpe) {
            if ($$1 instanceof aqm) {
               bqd.a($$1, $$2, (dpe)$$5);
               ((dpe)$$5).a((aqm)$$1, ewh.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.a($$1.c_($$2));
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpq> dpr<T> a(dcg $$0, dps<T> $$1, dps<? extends dpe> $$2) {
      return $$0.B ? null : a($$1, $$2, dpe::a);
   }
}
