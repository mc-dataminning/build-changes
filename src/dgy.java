import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgy extends dch {
   public static final MapCodec<dgy> a = b(dgy::new);
   public static final dqp b = dqo.n;

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   protected dgy(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, @Nullable bre $$3, csd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cuq $$5 = $$4.a(jz.F, cuq.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof doe $$5) {
         $$5.l();
         return boq.a($$1.B);
      } else {
         return boq.d;
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof doe $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new doe($$0, $$1);
   }

   @Override
   public boolean f_(dpy $$0) {
      return true;
   }

   @Override
   public int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      if ($$1.c_($$2) instanceof doe $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      if ($$1.c_($$2) instanceof doe $$3 && $$3.f().f() instanceof csw $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$1.c(b) ? a($$2, dnf.e, doe::a) : null;
   }
}
