import org.jetbrains.annotations.Nullable;

public class btx extends cgu {
   private static final akg<Integer> ch = akk.a(btx.class, aki.b);

   public btx(btq<? extends btx> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected ll q() {
      return ln.aP;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return btq.W.a($$0, btp.e);
   }

   @Override
   protected awc t() {
      return awd.kK;
   }

   @Override
   protected awc w() {
      return awd.kH;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.kJ;
   }

   @Override
   protected awc n_() {
      return awd.kI;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.t($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void m_() {
      super.m_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.t($$0 - 1);
      }

      this.dS().a(ln.aQ, this.d(0.6), this.dA(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.t(100);
      }

      return $$2;
   }

   private void t(int $$0) {
      this.am.a(ch, $$0);
   }

   public int y() {
      return this.am.a(ch);
   }

   public static boolean a(btq<? extends buf> $$0, dei $$1, btp $$2, je $$3, azk $$4) {
      return $$3.v() <= $$1.N() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dgx.G);
   }
}
