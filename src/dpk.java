import javax.annotation.Nullable;

public abstract class dpk extends dpq implements bqa, bql, bqm {
   private bqk d = bqk.a;
   @Nullable
   private wu e;

   protected dpk(dps<?> $$0, ja $$1, dsl $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.d = bqk.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      if (this.e != null) {
         $$0.a("CustomName", wu.a.a(this.e, $$1));
      }
   }

   @Override
   public wu ah() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public wu O_() {
      return this.ah();
   }

   @Nullable
   @Override
   public wu aj() {
      return this.e;
   }

   protected abstract wu k();

   public boolean d(cml $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cml $$0, bqk $$1, wu $$2) {
      if (!$$0.N_() && !$$1.a($$0.eV())) {
         $$0.a(wu.a("container.isLocked", $$2), true);
         $$0.a(avh.eP, avi.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract js<cud> j();

   protected abstract void a(js<cud> var1);

   @Override
   public boolean c() {
      for (cud $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cud a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cud a(int $$0, int $$1) {
      cud $$2 = bqb.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cud b(int $$0) {
      return bqb.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cud $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cml $$0) {
      return bqa.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cpi createMenu(int $$0, cmk $$1, cml $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cpi a(int var1, cmk var2);

   @Override
   protected void a(dpq.b $$0) {
      super.a($$0);
      this.e = $$0.a(kn.g);
      this.d = $$0.a(kn.ad, bqk.a);
      $$0.a(kn.aa, cwy.a).a(this.j());
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.g, this.e);
      if (!this.d.equals(bqk.a)) {
         $$0.a(kn.ad, this.d);
      }

      $$0.a(kn.aa, cwy.a(this.j()));
   }

   @Override
   public void a(tx $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
