import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dei extends dch implements djw {
   public static final MapCodec<dei> a = b(dei::new);
   public static final dqp b = dqo.C;
   private static final int d = 3;
   protected static final ety c = dcv.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   public dei(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.z, $$0.B ? dnp::a : dnp::b);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.b;
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(b) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(avt.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
