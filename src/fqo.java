public class fqo extends fpq {
   private final fpa a;
   private final wp b;
   private final wp c;

   public fqo(int $$0, int $$1, int $$2, int $$3, wp $$4, fpq.c $$5, fpa $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = ws.a($$4.f(), xm.a.c(true));
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      wp $$4 = this.D() ? this.c : this.b;
      $$0.b(this.a, $$4, this.F(), this.G(), 16777215 | ayz.f(this.l * 255.0F) << 24);
   }
}
