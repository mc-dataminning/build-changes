import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duz extends dlr implements dpr {
   public static final MapCodec<duz> a = b(duz::new);
   public static final ebf<ebs> b = eax.bF;

   public duz(eag.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyz($$0, $$1);
   }

   @Override
   public eah a(dcw $$0) {
      dbd $$1 = $$0.n().a(kj.aq);
      eah $$2 = this.m();
      if ($$1 != null) {
         ebs $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1.c_($$2) instanceof dyz $$6) {
         if (!$$3.gG()) {
            return bud.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bud.a;
         }
      } else {
         return bud.e;
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      dyz $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      dyz $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != ebs.a) {
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
   private static dyz a(dja $$0, iu $$1) {
      if ($$0 instanceof arq $$2) {
         dxf var4 = $$2.c_($$1);
         if (var4 instanceof dyz) {
            return (dyz)var4;
         }
      }

      return null;
   }

   @Override
   public int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      if ($$0.c(b) != ebs.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dyz $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      czd $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static czd a(czd $$0, ebs $$1) {
      $$0.b(kj.aq, $$0.a(kj.aq, dbd.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<duz> a() {
      return a;
   }
}
