import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwi extends dna implements dra {
   public static final MapCodec<dwi> a = b(dwi::new);
   public static final eco<edb> b = ecg.bF;

   public dwi(ebp.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eai($$0, $$1);
   }

   @Override
   public ebq a(ded $$0) {
      dck $$1 = $$0.n().a(kl.aq);
      ebq $$2 = this.m();
      if ($$1 != null) {
         edb $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1.c_($$2) instanceof eai $$6) {
         if (!$$3.gG()) {
            return bvc.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bvc.a;
         }
      } else {
         return bvc.e;
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      eai $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      eai $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != edb.a) {
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
   private static eai a(dkj $$0, iw $$1) {
      if ($$0 instanceof asb $$2) {
         dyo var4 = $$2.c_($$1);
         if (var4 instanceof eai) {
            return (eai)var4;
         }
      }

      return null;
   }

   @Override
   public int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      if ($$0.c(b) != edb.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof eai $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      dak $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static dak a(dak $$0, edb $$1) {
      $$0.b(kl.aq, $$0.a(kl.aq, dck.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dwi> a() {
      return a;
   }
}
