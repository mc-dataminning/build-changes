import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dta extends dlg implements dtb {
   public static final eaf d = eae.I;
   private static final feq a = dlu.b(8.0, 0.0, 16.0);
   private final ebc b;

   protected dta(ebc $$0, dzn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dta> a();

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return a;
   }

   @Override
   public boolean a(dzo $$0) {
      return true;
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyb($$0, $$1);
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$2.c_($$3) instanceof dyb $$7) {
         czu $$10 = $$0.h() instanceof czu $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gv();
         if (!$$2.C) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awv.c.b($$0.h()));
                  $$2.a(eeo.c, $$7.aw_(), eeo.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bty.a;
               } else {
                  return bty.f;
               }
            } else {
               return bty.f;
            }
         } else {
            return !$$11 && !$$7.u() ? bty.c : bty.a;
         }
      } else {
         return bty.e;
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.c_($$2) instanceof dyb $$5) {
         if ($$1.C) {
            af.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.aw_(), $$5.d(), awm.e);
            return bty.b;
         } else if ($$8) {
            return bty.b;
         } else if (!this.a($$3, $$5) && $$3.gv() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bty.b;
         } else {
            return bty.e;
         }
      } else {
         return bty.e;
      }
   }

   private boolean b(cqs $$0, dyb $$1, boolean $$2) {
      dyc $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(wv.a) || $$0x.b() instanceof yd);
   }

   public abstract float h(dzo var1);

   public fdw o(dzo $$0) {
      return new fdw(0.5, 0.5, 0.5);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(d) ? evw.c.a(false) : super.b_($$0);
   }

   public ebc d() {
      return this.b;
   }

   public static ebc a(dlu $$0) {
      ebc $$1;
      if ($$0 instanceof dta) {
         $$1 = ((dta)$$0).d();
      } else {
         $$1 = ebc.b;
      }

      return $$1;
   }

   public void a(cqs $$0, dyb $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cqs $$0, dyb $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.h, dyb::a);
   }
}
