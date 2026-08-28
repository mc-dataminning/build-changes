import javax.annotation.Nullable;

public abstract class frb extends fnx {
   protected final fnx b;
   protected final fgm c;
   @Nullable
   protected fjd q;
   public final flt r = new flt(this);

   public frb(fnx $$0, fgm $$1, wy $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aP_() {
      this.F();
      this.aQ_();
      this.D();
      this.r.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   protected void F() {
      this.r.a(this.k, this.o);
   }

   protected void aQ_() {
      this.q = this.r.c(new fjd(this.l, this.m, this));
      this.m();
   }

   protected abstract void m();

   protected void D() {
      this.r.b(fig.a(wx.d, $$0 -> this.d()).a(200).a());
   }

   @Override
   protected void c() {
      this.r.a();
      if (this.q != null) {
         this.q.a(this.m, this.r);
      }
   }

   @Override
   public void j() {
      this.l.m.av();
   }

   @Override
   public void d() {
      if (this.q != null) {
         this.q.c();
      }

      this.l.a(this.b);
   }
}
