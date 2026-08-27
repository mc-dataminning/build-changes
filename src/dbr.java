import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbr extends dch implements crf {
   public static final dqp a = dqo.w;
   private final djx.a b;

   public dbr(djx.a $$0, dpx.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dbr> a();

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dop($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dcx.gO) || $$1.a(dcx.gP) || $$1.a(dcx.gQ) || $$1.a(dcx.gR);
         if ($$3) {
            return a($$2, dnf.p, dop::a);
         }
      }

      return null;
   }

   public djx.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   public bqs k() {
      return bqs.f;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
