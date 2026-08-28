import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class duy extends dna implements duz {
   public static final ech d = ecg.I;
   private static final fgw a = dno.b(8.0, 0.0, 16.0);
   private final ede b;

   protected duy(ede $$0, ebp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends duy> a();

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a;
   }

   @Override
   public boolean a(ebq $$0) {
      return true;
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eac($$0, $$1);
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$2.c_($$3) instanceof eac $$7) {
         dbm $$10 = $$0.h() instanceof dbm $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gw();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(axi.c.b($$0.h()));
                  $$2.a(egq.c, $$7.aC_(), egq.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bvc.a;
               } else {
                  return bvc.f;
               }
            } else {
               return bvc.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bvc.c : bvc.a;
         }
      } else {
         return bvc.e;
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1.c_($$2) instanceof eac $$5) {
         if ($$1.C) {
            ag.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aC_(), $$5.d(), awz.e);
            return bvc.b;
         } else if ($$8) {
            return bvc.b;
         } else if (!this.a($$3, $$5) && $$3.gw() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bvc.b;
         } else {
            return bvc.e;
         }
      } else {
         return bvc.e;
      }
   }

   private boolean b(csi $$0, eac $$1, boolean $$2) {
      ead $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.X())).allMatch($$0x -> $$0x.equals(xf.a) || $$0x.b() instanceof yn);
   }

   public abstract float h(ebq var1);

   public fgc o(ebq $$0) {
      return new fgc(0.5, 0.5, 0.5);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   public ede d() {
      return this.b;
   }

   public static ede a(dno $$0) {
      ede $$1;
      if ($$0 instanceof duy) {
         $$1 = ((duy)$$0).d();
      } else {
         $$1 = ede.b;
      }

      return $$1;
   }

   public void a(csi $$0, eac $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(csi $$0, eac $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.h, eac::a);
   }
}
