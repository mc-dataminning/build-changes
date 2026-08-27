import javax.annotation.Nullable;

public abstract class doa extends dog implements bpn, bpy, bpz {
   private bpx d = bpx.a;
   @Nullable
   private wx e;

   protected doa(doi<?> $$0, io $$1, drb $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.d = bpx.b($$0);
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

   public boolean d(clw $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(clw $$0, bpx $$1, wx $$2) {
      if (!$$0.N_() && !$$1.a($$0.eX())) {
         $$0.a(wx.a("container.isLocked", $$2), true);
         $$0.a(avh.eP, avi.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jg<cto> j();

   protected abstract void a(jg<cto> var1);

   @Override
   public boolean c() {
      for (cto $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cto a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cto a(int $$0, int $$1) {
      cto $$2 = bpo.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cto b(int $$0) {
      return bpo.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cto $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(clw $$0) {
      return bpn.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cot createMenu(int $$0, clv $$1, clw $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cot a(int var1, clv var2);

   @Override
   protected void a(dog.b $$0) {
      super.a($$0);
      this.e = $$0.a(kb.f);
      this.d = $$0.a(kb.ac, bpx.a);
      $$0.a(kb.Z, cwk.a).a(this.j());
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.f, this.e);
      if (!this.d.equals(bpx.a)) {
         $$0.a(kb.ac, this.d);
      }

      $$0.a(kb.Z, cwk.a(this.j()));
   }

   @Override
   public void a(ud $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
