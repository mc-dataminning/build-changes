import javax.annotation.Nullable;

public abstract class dpj extends dpp implements bpz, bqk, bql {
   private bqj d = bqj.a;
   @Nullable
   private wu e;

   protected dpj(dpr<?> $$0, ja $$1, dsk $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.d = bqj.b($$0);
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
   public wu ag() {
      return this.e != null ? this.e : this.k();
   }

   @Override
   public wu O_() {
      return this.ag();
   }

   @Nullable
   @Override
   public wu ai() {
      return this.e;
   }

   protected abstract wu k();

   public boolean d(cmk $$0) {
      return a($$0, this.d, this.O_());
   }

   public static boolean a(cmk $$0, bqj $$1, wu $$2) {
      if (!$$0.N_() && !$$1.a($$0.eU())) {
         $$0.a(wu.a("container.isLocked", $$2), true);
         $$0.a(avh.eP, avi.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract js<cuc> j();

   protected abstract void a(js<cuc> var1);

   @Override
   public boolean c() {
      for (cuc $$0 : this.j()) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuc a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public cuc a(int $$0, int $$1) {
      cuc $$2 = bqa.a(this.j(), $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cuc b(int $$0) {
      return bqa.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cuc $$1) {
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cmk $$0) {
      return bpz.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cph createMenu(int $$0, cmj $$1, cmk $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cph a(int var1, cmj var2);

   @Override
   protected void a(dpp.b $$0) {
      super.a($$0);
      this.e = $$0.a(kn.g);
      this.d = $$0.a(kn.ad, bqj.a);
      $$0.a(kn.aa, cwx.a).a(this.j());
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.g, this.e);
      if (!this.d.equals(bqj.a)) {
         $$0.a(kn.ad, this.d);
      }

      $$0.a(kn.aa, cwx.a(this.j()));
   }

   @Override
   public void a(tx $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
