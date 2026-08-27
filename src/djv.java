import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class djv extends dch implements djw {
   public static final dqp f = dqo.C;
   protected static final float g = 4.0F;
   protected static final ety h = dcv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final drl a;

   protected djv(drl $$0, dpx.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djv> a();

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return h;
   }

   @Override
   public boolean a(dpy $$0) {
      return true;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new don($$0, $$1);
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.c_($$3) instanceof don $$7) {
         ctd $$10 = $$0.f() instanceof ctd $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gm();
         if (!$$2.B) {
            if ($$11 && !$$7.u() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(avj.c.b($$0.f()));
                  $$2.a(dur.c, $$7.az_(), dur.a.a($$4, $$7.n()));
                  if (!$$4.f()) {
                     $$0.g(1);
                  }

                  return bos.a;
               } else {
                  return bos.d;
               }
            } else {
               return bos.d;
            }
         } else {
            return !$$11 && !$$7.u() ? bos.b : bos.a;
         }
      } else {
         return bos.e;
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.c_($$2) instanceof don $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.u()) {
            $$1.a(null, $$5.az_(), $$5.d(), ava.e);
            return boq.a;
         } else if ($$8) {
            return boq.a;
         } else if (!this.a($$3, $$5) && $$3.gm() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return boq.a;
         } else {
            return boq.d;
         }
      } else {
         return boq.d;
      }
   }

   private boolean b(ckl $$0, don $$1, boolean $$2) {
      doo $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(wr.a) || $$0x.b() instanceof xz);
   }

   public abstract float g(dpy var1);

   public etf m(dpy $$0) {
      return new etf(0.5, 0.5, 0.5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(f) ? els.c.a(false) : super.c_($$0);
   }

   public drl d() {
      return this.a;
   }

   public static drl a(dcv $$0) {
      drl $$1;
      if ($$0 instanceof djv) {
         $$1 = ((djv)$$0).d();
      } else {
         $$1 = drl.b;
      }

      return $$1;
   }

   public void a(ckl $$0, don $$1, boolean $$2) {
      $$1.a($$0.cx());
      $$0.a($$1, $$2);
   }

   private boolean a(ckl $$0, don $$1) {
      UUID $$2 = $$1.t();
      return $$2 != null && !$$2.equals($$0.cx());
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.h, don::a);
   }
}
