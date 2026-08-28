public class fso extends frq {
   private final fra a;
   private final ww b;
   private final ww c;

   public fso(int $$0, int $$1, int $$2, int $$3, ww $$4, frq.c $$5, fra $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wz.a($$4.f(), xt.a.c(true));
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      ww $$4 = this.D() ? this.c : this.b;
      $$0.b(this.a, $$4, this.F(), this.G(), 16777215 | azk.f(this.l * 255.0F) << 24);
   }
}
