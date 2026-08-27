import javax.annotation.Nullable;

public abstract class dfx extends dgd implements bje, bjo, bjp {
   private bjn e = bjn.a;
   @Nullable
   private vb f;

   protected dfx(dgf<?> $$0, hv $$1, dip $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.e = bjn.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = vb.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", vb.a.a(this.f));
      }
   }

   public void a(vb $$0) {
      this.f = $$0;
   }

   @Override
   public vb ad() {
      return this.f != null ? this.f : this.l();
   }

   @Override
   public vb Q_() {
      return this.ad();
   }

   @Nullable
   @Override
   public vb af() {
      return this.f;
   }

   protected abstract vb l();

   public boolean d(cer $$0) {
      return a($$0, this.e, this.Q_());
   }

   public static boolean a(cer $$0, bjn $$1, vb $$2) {
      if (!$$0.P_() && !$$1.a($$0.eT())) {
         $$0.a(vb.a("container.isLocked", $$2), true);
         $$0.a(arc.er, ard.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public chk createMenu(int $$0, ceq $$1, cer $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract chk a(int var1, ceq var2);
}
