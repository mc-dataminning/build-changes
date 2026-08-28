import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dug extends dlm implements dpl {
   public static final MapCodec<dug> a = b(dug::new);
   public static final eax<ebj> b = eap.bm;

   @Override
   public MapCodec<dug> a() {
      return a;
   }

   protected dug(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ebj.b));
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyq($$0, $$1);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      dwx $$5 = $$1.c_($$2);
      if ($$5 instanceof dyq) {
         return (bub)(((dyq)$$5).a($$3) ? bub.a : bub.e);
      } else {
         return bub.e;
      }
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, @Nullable bxc $$3, cyy $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dwx $$5 = $$0.c_($$1);
            if ($$5 instanceof dyq) {
               ((dyq)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if ($$1 instanceof arq) {
         if ($$1.c_($$2) instanceof dyq $$7) {
            boolean $$8 = $$1.D($$2);
            boolean $$9 = $$7.E();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((arq)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(arq $$0, dyq $$1) {
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
