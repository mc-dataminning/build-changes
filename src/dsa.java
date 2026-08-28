import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dsa extends dkg implements dsb {
   public static final dzd d = dzc.I;
   private static final fdo a = dku.b(8.0, 0.0, 16.0);
   private final eaa b;

   protected dsa(eaa $$0, dyl.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dsa> a();

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a;
   }

   @Override
   public boolean a(dym $$0) {
      return true;
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwz($$0, $$1);
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$2.c_($$3) instanceof dwz $$7) {
         cza $$10 = $$0.h() instanceof cza $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awu.c.b($$0.h()));
                  $$2.a(edm.c, $$7.aw_(), edm.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return btq.a;
               } else {
                  return btq.f;
               }
            } else {
               return btq.f;
            }
         } else {
            return !$$11 && !$$7.u() ? btq.c : btq.a;
         }
      } else {
         return btq.e;
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.c_($$2) instanceof dwz $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aw_(), $$5.d(), awl.e);
            return btq.b;
         } else if ($$8) {
            return btq.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return btq.b;
         } else {
            return btq.e;
         }
      } else {
         return btq.e;
      }
   }

   private boolean b(cqi $$0, dwz $$1, boolean $$2) {
      dxa $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wu.a) || $$0x.b() instanceof yc);
   }

   public abstract float h(dym var1);

   public fcu o(dym $$0) {
      return new fcu(0.5, 0.5, 0.5);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(d) ? euu.c.a(false) : super.b_($$0);
   }

   public eaa d() {
      return this.b;
   }

   public static eaa a(dku $$0) {
      eaa $$1;
      if ($$0 instanceof dsa) {
         $$1 = ((dsa)$$0).d();
      } else {
         $$1 = eaa.b;
      }

      return $$1;
   }

   public void a(cqi $$0, dwz $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cqi $$0, dwz $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.h, dwz::a);
   }
}
