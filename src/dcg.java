import javax.annotation.Nullable;

public abstract class dcg extends dcm implements bgj, bgt, bgu {
   private bgs c = bgs.a;
   @Nullable
   private tf d;

   protected dcg(dco<?> $$0, gu $$1, dfa $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c = bgs.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = tf.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", tf.a.a(this.d));
      }
   }

   public void a(tf $$0) {
      this.d = $$0;
   }

   @Override
   public tf ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public tf H_() {
      return this.ab();
   }

   @Nullable
   @Override
   public tf ad() {
      return this.d;
   }

   protected abstract tf g();

   public boolean d(cbn $$0) {
      return a($$0, this.c, this.H_());
   }

   public static boolean a(cbn $$0, bgs $$1, tf $$2) {
      if (!$$0.G_() && !$$1.a($$0.eR())) {
         $$0.a(tf.a("container.isLocked", $$2), true);
         $$0.a(aow.ei, aox.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cee createMenu(int $$0, cbm $$1, cbn $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cee a(int var1, cbm var2);
}
