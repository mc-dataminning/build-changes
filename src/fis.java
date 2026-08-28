public class fis extends fhu {
   private final fhf a;
   private final wu b;
   private final wu c;

   public fis(int $$0, int $$1, int $$2, int $$3, wu $$4, fhu.c $$5, fhf $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wx.a($$4.f(), xr.a.c(true));
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | ayg.f(this.l * 255.0F) << 24);
   }
}
