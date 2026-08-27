public class few extends fdy {
   private final fdj a;
   private final wi b;
   private final wi c;

   public few(int $$0, int $$1, int $$2, int $$3, wi $$4, fdy.c $$5, fdj $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wl.a($$4.f(), xf.a.c(true));
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      wi $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | axm.f(this.l * 255.0F) << 24);
   }
}
