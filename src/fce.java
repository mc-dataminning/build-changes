public class fce extends fbg {
   private final far a;
   private final vu b;
   private final vu c;

   public fce(int $$0, int $$1, int $$2, int $$3, vu $$4, fbg.c $$5, far $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = vx.a($$4.f(), wr.a.c(true));
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      vu $$4 = this.z() ? this.c : this.b;
      $$0.b(this.a, $$4, this.B(), this.C(), 16777215 | aww.f(this.l * 255.0F) << 24);
   }
}
