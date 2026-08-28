public class frl extends fqn {
   private final fpx a;
   private final wv b;
   private final wv c;

   public frl(int $$0, int $$1, int $$2, int $$3, wv $$4, fqn.c $$5, fpx $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wy.a($$4.f(), xs.a.c(true));
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      wv $$4 = this.D() ? this.c : this.b;
      $$0.b(this.a, $$4, this.F(), this.G(), 16777215 | azk.f(this.l * 255.0F) << 24);
   }
}
