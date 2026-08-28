import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvk extends dmo implements dqo {
   public static final MapCodec<dvk> a = b(dvk::new);
   public static final ecc<eco> b = ebu.bm;

   @Override
   public MapCodec<dvk> a() {
      return a;
   }

   protected dvk(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eco.b));
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzv($$0, $$1);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      dyc $$5 = $$1.c_($$2);
      if ($$5 instanceof dzv) {
         return (bur)(((dzv)$$5).a($$3) ? bur.a : bur.e);
      } else {
         return bur.e;
      }
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, @Nullable bxu $$3, czy $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dyc $$5 = $$0.c_($$1);
            if ($$5 instanceof dzv) {
               ((dzv)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if ($$1 instanceof ars) {
         if ($$1.c_($$2) instanceof dzv $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((ars)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(ars $$0, dzv $$1) {
      switch ($$1.v()) {
         case a:
            $$1.c(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.C();
         case d:
      }
   }
}
