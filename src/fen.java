public class fen extends fdp {
   private final fda a;
   private final wg b;
   private final wg c;

   public fen(int $$0, int $$1, int $$2, int $$3, wg $$4, fdp.c $$5, fda $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wj.a($$4.f(), xd.a.c(true));
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      wg $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | axk.f(this.l * 255.0F) << 24);
   }
}
