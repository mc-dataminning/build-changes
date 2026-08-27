public class fgc extends ffe {
   private final fep a;
   private final wu b;
   private final wu c;

   public fgc(int $$0, int $$1, int $$2, int $$3, wu $$4, ffe.c $$5, fep $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wx.a($$4.f(), xr.a.c(true));
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | axz.f(this.l * 255.0F) << 24);
   }
}
