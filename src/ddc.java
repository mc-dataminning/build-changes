import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddc extends cur implements cyn {
   public static final MapCodec<ddc> a = b(ddc::new);
   public static final dil<dix> b = did.bj;

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   protected ddc(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dix.b));
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgw($$0, $$1);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      dfi $$6 = $$1.c_($$2);
      if ($$6 instanceof dgw) {
         return ((dgw)$$6).a($$3) ? bjb.a($$1.B) : bjb.d;
      } else {
         return bjb.d;
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dfi $$5 = $$0.c_($$1);
            if ($$5 instanceof dgw) {
               ((dgw)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof ami) {
         if ($$1.c_($$2) instanceof dgw $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ami)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ami $$0, dgw $$1) {
      switch ($$1.y()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.E();
         case d:
      }
   }
}
