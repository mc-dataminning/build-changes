import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dti extends dlm implements dtj {
   public static final eaq d = eap.I;
   private static final ffc a = dma.b(8.0, 0.0, 16.0);
   private final ebn b;

   protected dti(ebn $$0, dzy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dti> a();

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a;
   }

   @Override
   public boolean a(dzz $$0) {
      return true;
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyl($$0, $$1);
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$2.c_($$3) instanceof dyl $$7) {
         daa $$10 = $$0.h() instanceof daa $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awx.c.b($$0.h()));
                  $$2.a(eez.c, $$7.aw_(), eez.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bub.a;
               } else {
                  return bub.f;
               }
            } else {
               return bub.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bub.c : bub.a;
         }
      } else {
         return bub.e;
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1.c_($$2) instanceof dyl $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aw_(), $$5.d(), awo.e);
            return bub.b;
         } else if ($$8) {
            return bub.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bub.b;
         } else {
            return bub.e;
         }
      } else {
         return bub.e;
      }
   }

   private boolean b(cqy $$0, dyl $$1, boolean $$2) {
      dym $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wx.a) || $$0x.b() instanceof yf);
   }

   public abstract float h(dzz var1);

   public fei o(dzz $$0) {
      return new fei(0.5, 0.5, 0.5);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(d) ? ewh.c.a(false) : super.b_($$0);
   }

   public ebn d() {
      return this.b;
   }

   public static ebn a(dma $$0) {
      ebn $$1;
      if ($$0 instanceof dti) {
         $$1 = ((dti)$$0).d();
      } else {
         $$1 = ebn.b;
      }

      return $$1;
   }

   public void a(cqy $$0, dyl $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cqy $$0, dyl $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.h, dyl::a);
   }
}
