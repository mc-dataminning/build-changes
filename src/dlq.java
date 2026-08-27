import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends dch {
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final drb<dpl> b = dqo.bz;
   public static final dqs c = dgr.aE;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ir.c).a(b, dpl.a));
   }

   @Override
   public bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$0.d() || $$1.c(b) != dpl.b) {
         return bos.d;
      } else if ($$2 instanceof aqe $$7) {
         if ($$7.c_($$3) instanceof dpg $$9) {
            dpg.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bos.a;
         } else {
            return bos.d;
         }
      } else {
         return bos.b;
      }
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dpg($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0 instanceof aqe $$3
         ? a($$2, dnf.R, ($$1x, $$2x, $$3x, $$4) -> dpg.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dnf.R, ($$0x, $$1x, $$2x, $$3x) -> dpg.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public dpy a(dpy $$0, dji $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public djb b_(dpy $$0) {
      return djb.c;
   }
}
