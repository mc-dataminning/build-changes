import javax.annotation.Nullable;

public abstract class doc extends doi implements bpp, bqa, bqb {
   private bpz d = bpz.a;
   @Nullable
   private wx e;

   protected doc(dok<?> $$0, io $$1, drd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.d = bpz.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = wx.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", wx.a.a(this.e, $$1));
      }
   }

   @Override
   public wx af() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public wx O_() {
      return this.af();
   }

   @Nullable
   @Override
   public wx ah() {
      return this.e;
   }

   protected abstract wx k();

   public boolean d(cly $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cly $$0, bpz $$1, wx $$2) {
      if (!$$0.N_() && !$$1.a($$0.eX())) {
         $$0.a(wx.a("container.isLocked", $$2), true);
         $$0.a(avi.eP, avj.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jg<ctq> j();

   protected abstract void a(jg<ctq> var1);

   @Override
   public boolean c() {
      for (ctq $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ctq a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public ctq a(int $$0, int $$1) {
      ctq $$2 = bpq.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public ctq b(int $$0) {
      return bpq.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, ctq $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cly $$0) {
      return bpp.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cov createMenu(int $$0, clx $$1, cly $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cov a(int var1, clx var2);

   @Override
   protected void a(doi.b $$0) {
      super.a($$0);
      this.e = $$0.a(kb.f);
      this.d = $$0.a(kb.ac, bpz.a);
      $$0.a(kb.Z, cwm.a).a(this.j());
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.f, this.e);
      if (!this.d.equals(bpz.a)) {
         $$0.a(kb.ac, this.d);
      }

      $$0.a(kb.Z, cwm.a(this.j()));
   }

   @Override
   public void a(ud $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
