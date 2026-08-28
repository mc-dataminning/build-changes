public class fik extends fhm {
   private final fgx a;
   private final wu b;
   private final wu c;

   public fik(int $$0, int $$1, int $$2, int $$3, wu $$4, fhm.c $$5, fgx $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wx.a($$4.f(), xr.a.c(true));
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      wu $$4 = this.B() ? this.c : this.b;
      $$0.b(this.a, $$4, this.D(), this.E(), 16777215 | aye.f(this.l * 255.0F) << 24);
   }
}
