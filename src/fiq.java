public class fiq extends fhs {
   private final fhd a;
   private final wu b;
   private final wu c;

   public fiq(int $$0, int $$1, int $$2, int $$3, wu $$4, fhs.c $$5, fhd $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wx.a($$4.f(), xr.a.c(true));
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | ayg.f(this.l * 255.0F) << 24);
   }
}
