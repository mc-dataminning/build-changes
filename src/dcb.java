import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcb extends dch {
   public static final MapCodec<dcb> a = b(dcb::new);
   public static final dqs b = dqo.P;
   public static final dqp c = dqo.u;

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   public dcb(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dmw) {
            $$3.a((dmw)$$5);
            $$3.a(avj.ar);
            cjc.a($$3, true);
         }

         return boq.b;
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      bom.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      dnd $$4 = $$1.c_($$2);
      if ($$4 instanceof dmw) {
         ((dmw)$$4).l();
      }
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dmw($$0, $$1);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.a($$1.c_($$2));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
