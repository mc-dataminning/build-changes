import javax.annotation.Nullable;

public abstract class djf extends djl implements bme, bmp, bmq {
   private bmo e = bmo.a;
   @Nullable
   private vs f;

   protected djf(djn<?> $$0, ib $$1, dme $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = bmo.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = vs.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", vs.a.a(this.f));
      }
   }

   public void a(vs $$0) {
      this.f = $$0;
   }

   @Override
   public vs ad() {
      return this.f != null ? this.f : this.k();
   }

   @Override
   public vs Q_() {
      return this.ad();
   }

   @Nullable
   @Override
   public vs af() {
      return this.f;
   }

   protected abstract vs k();

   public boolean d(cia $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(cia $$0, bmo $$1, vs $$2) {
      if (!$$0.P_() && !$$1.a($$0.eR())) {
         $$0.a(vs.a("container.isLocked", $$2), true);
         $$0.a(atp.eH, atq.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cku createMenu(int $$0, chz $$1, cia $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cku a(int var1, chz var2);
}
