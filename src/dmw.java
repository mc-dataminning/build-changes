import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmw extends dek implements dig {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final dsz<dtl> b = dsr.bj;

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   protected dmw(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtl.b));
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqv($$0, $$1);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      dpg $$5 = $$1.c_($$2);
      if ($$5 instanceof dqv) {
         return ((dqv)$$5).a($$3) ? bqt.a($$1.B) : bqt.e;
      } else {
         return bqt.e;
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, @Nullable bto $$3, cuo $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpg $$5 = $$0.c_($$1);
            if ($$5 instanceof dqv) {
               ((dqv)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof are) {
         if ($$1.c_($$2) instanceof dqv $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((are)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(are $$0, dqv $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
