import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dej implements dif {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final dsy<dtk> b = dsq.bj;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtk.b));
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqu($$0, $$1);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      dpf $$5 = $$1.c_($$2);
      if ($$5 instanceof dqu) {
         return ((dqu)$$5).a($$3) ? bqs.a($$1.B) : bqs.e;
      } else {
         return bqs.e;
      }
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, @Nullable btn $$3, cun $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpf $$5 = $$0.c_($$1);
            if ($$5 instanceof dqu) {
               ((dqu)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof are) {
         if ($$1.c_($$2) instanceof dqu $$7) {
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

   private void a(are $$0, dqu $$1) {
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
