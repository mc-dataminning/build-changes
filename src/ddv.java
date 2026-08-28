import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddv extends dem {
   public static final dsx a = diw.aE;
   public static final dsu b = dst.r;

   protected ddv(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddv> a();

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqv.c;
      }
   }

   protected abstract void a(dbz var1, iz var2, cmy var3);

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dow) {
            if ($$1 instanceof arf) {
               bqr.a($$1, $$2, (dow)$$5);
               ((dow)$$5).a((arf)$$1, evs.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.a($$1.c_($$2));
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpi> dpj<T> a(dbz $$0, dpk<T> $$1, dpk<? extends dow> $$2) {
      return $$0.B ? null : a($$1, $$2, dow::a);
   }
}
