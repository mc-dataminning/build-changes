import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cua extends cur {
   public static final dih a = cza.aE;
   public static final die b = did.r;

   protected cua(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ib.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cua> a();

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         this.a($$1, $$2, $$3);
         return bjb.b;
      }
   }

   protected abstract void a(csf var1, hx var2, cdz var3);

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dex) {
            ((dex)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfi $$5 = $$1.c_($$2);
         if ($$5 instanceof dex) {
            if ($$1 instanceof ami) {
               bix.a($$1, $$2, (dex)$$5);
               ((dex)$$5).a((ami)$$1, ejz.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.a($$1.c_($$2));
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dfi> dfj<T> a(csf $$0, dfk<T> $$1, dfk<? extends dex> $$2) {
      return $$0.B ? null : a($$1, $$2, dex::a);
   }
}
