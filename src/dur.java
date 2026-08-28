import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dur extends dlm implements dpl {
   public static final MapCodec<dur> a = b(dur::new);
   public static final eax<ebk> b = eap.bF;

   public dur(dzy.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyr($$0, $$1);
   }

   @Override
   public dzz a(dcr $$0) {
      day $$1 = $$0.n().a(kj.aq);
      dzz $$2 = this.m();
      if ($$1 != null) {
         ebk $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1.c_($$2) instanceof dyr $$6) {
         if (!$$3.gF()) {
            return bub.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bub.a;
         }
      } else {
         return bub.e;
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      dyr $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      dyr $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != ebk.a) {
            boolean $$7 = $$1.D($$2);
            boolean $$8 = $$6.c();
            if ($$7 && !$$8) {
               $$6.a(true);
               $$6.j();
            } else if (!$$7 && $$8) {
               $$6.a(false);
            }
         }
      }
   }

   @Nullable
   private static dyr a(div $$0, iu $$1) {
      if ($$0 instanceof arq $$2) {
         dwx var4 = $$2.c_($$1);
         if (var4 instanceof dyr) {
            return (dyr)var4;
         }
      }

      return null;
   }

   @Override
   public int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      if ($$0.c(b) != ebk.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dyr $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      cyy $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static cyy a(cyy $$0, ebk $$1) {
      $$0.b(kj.aq, $$0.a(kj.aq, day.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dur> a() {
      return a;
   }
}
