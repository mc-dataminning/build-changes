import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvm extends dmq implements dqq {
   public static final MapCodec<dvm> a = b(dvm::new);
   public static final ece<ecq> b = ebw.bm;

   @Override
   public MapCodec<dvm> a() {
      return a;
   }

   protected dvm(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecq.b));
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzx($$0, $$1);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      dye $$5 = $$1.c_($$2);
      if ($$5 instanceof dzx) {
         return (but)(((dzx)$$5).a($$3) ? but.a : but.e);
      } else {
         return but.e;
      }
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, @Nullable bxw $$3, daa $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dye $$5 = $$0.c_($$1);
            if ($$5 instanceof dzx) {
               ((dzx)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$1 instanceof aru) {
         if ($$1.c_($$2) instanceof dzx $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((aru)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(aru $$0, dzx $$1) {
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
