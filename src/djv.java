import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djv extends dbk implements dfg {
   public static final MapCodec<djv> a = b(djv::new);
   public static final dpx<dqj> b = dpp.bj;

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqj.b));
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnu($$0, $$1);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      dmf $$5 = $$1.c_($$2);
      if ($$5 instanceof dnu) {
         return ((dnu)$$5).a($$3) ? boa.a($$1.B) : boa.d;
      } else {
         return boa.d;
      }
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, @Nullable bqo $$3, crj $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dmf $$5 = $$0.c_($$1);
            if ($$5 instanceof dnu) {
               ((dnu)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof aps) {
         if ($$1.c_($$2) instanceof dnu $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aps)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aps $$0, dnu $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}
