import javax.annotation.Nullable;

public abstract class dph extends dpn implements bpw, bqh, bqi {
   private bqg d = bqg.a;
   @Nullable
   private wu e;

   protected dph(dpp<?> $$0, ja $$1, dsh $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.d = bqg.b($$0);
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
   public wu af() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public wu O_() {
      return this.af();
   }

   @Nullable
   @Override
   public wu ah() {
      return this.e;
   }

   protected abstract wu k();

   public boolean d(cmh $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cmh $$0, bqg $$1, wu $$2) {
      if (!$$0.N_() && !$$1.a($$0.eT())) {
         $$0.a(wu.a("container.isLocked", $$2), true);
         $$0.a(avf.eP, avg.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract js<cua> j();

   protected abstract void a(js<cua> var1);

   @Override
   public boolean c() {
      for (cua $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cua a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cua a(int $$0, int $$1) {
      cua $$2 = bpx.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cua b(int $$0) {
      return bpx.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cua $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cmh $$0) {
      return bpw.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cpe createMenu(int $$0, cmg $$1, cmh $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cpe a(int var1, cmg var2);

   @Override
   protected void a(dpn.b $$0) {
      super.a($$0);
      this.e = $$0.a(kn.g);
      this.d = $$0.a(kn.ad, bqg.a);
      $$0.a(kn.aa, cwv.a).a(this.j());
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.g, this.e);
      if (!this.d.equals(bqg.a)) {
         $$0.a(kn.ad, this.d);
      }

      $$0.a(kn.aa, cwv.a(this.j()));
   }

   @Override
   public void a(tx $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
