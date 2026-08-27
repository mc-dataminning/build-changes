public class ffs extends feu {
   private final fef a;
   private final ws b;
   private final ws c;

   public ffs(int $$0, int $$1, int $$2, int $$3, ws $$4, feu.c $$5, fef $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wv.a($$4.f(), xp.a.c(true));
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      ws $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | axw.f(this.l * 255.0F) << 24);
   }
}
