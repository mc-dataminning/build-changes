import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvy extends dmq implements dqq {
   public static final MapCodec<dvy> a = b(dvy::new);
   public static final ece<ecr> b = ebw.bF;

   public dvy(ebf.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzy($$0, $$1);
   }

   @Override
   public ebg a(ddt $$0) {
      dca $$1 = $$0.n().a(kl.aq);
      ebg $$2 = this.m();
      if ($$1 != null) {
         ecr $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.c_($$2) instanceof dzy $$6) {
         if (!$$3.gG()) {
            return but.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return but.a;
         }
      } else {
         return but.e;
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      dzy $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      dzy $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != ecr.a) {
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
   private static dzy a(djz $$0, iw $$1) {
      if ($$0 instanceof aru $$2) {
         dye var4 = $$2.c_($$1);
         if (var4 instanceof dzy) {
            return (dzy)var4;
         }
      }

      return null;
   }

   @Override
   public int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      if ($$0.c(b) != ecr.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dzy $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      daa $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static daa a(daa $$0, ecr $$1) {
      $$0.b(kl.aq, $$0.a(kl.aq, dca.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dvy> a() {
      return a;
   }
}
