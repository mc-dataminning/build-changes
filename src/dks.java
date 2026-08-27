import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends dcv {
   public static final MapCodec<dks> a = b(dks::new);
   private static final ws d = ws.c("container.stonecutter");
   public static final dqs b = dgr.aE;
   protected static final ety c = dcv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c));
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avj.ay);
         return boq.b;
      }
   }

   @Nullable
   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return new bpa(($$2x, $$3, $$4) -> new cpj($$2x, $$3, cns.a($$1, $$2)), d);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
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
      $$0.a(b);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
