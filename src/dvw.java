import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvw extends dmo implements dqo {
   public static final MapCodec<dvw> a = b(dvw::new);
   public static final ecc<ecp> b = ebu.bF;

   public dvw(ebd.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzw($$0, $$1);
   }

   @Override
   public ebe a(ddr $$0) {
      dby $$1 = $$0.n().a(kk.aq);
      ebe $$2 = this.m();
      if ($$1 != null) {
         ecp $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.c_($$2) instanceof dzw $$6) {
         if (!$$3.gG()) {
            return bur.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bur.a;
         }
      } else {
         return bur.e;
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      dzw $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      dzw $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != ecp.a) {
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
   private static dzw a(djx $$0, iv $$1) {
      if ($$0 instanceof ars $$2) {
         dyc var4 = $$2.c_($$1);
         if (var4 instanceof dzw) {
            return (dzw)var4;
         }
      }

      return null;
   }

   @Override
   public int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      if ($$0.c(b) != ecp.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof dzw $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      czy $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static czy a(czy $$0, ecp $$1) {
      $$0.b(kk.aq, $$0.a(kk.aq, dby.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dvw> a() {
      return a;
   }
}
