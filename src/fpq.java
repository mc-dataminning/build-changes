public class fpq extends fos {
   private final fob a;
   private final wo b;
   private final wo c;

   public fpq(int $$0, int $$1, int $$2, int $$3, wo $$4, fos.c $$5, fob $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = wr.a($$4.f(), xl.a.c(true));
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      wo $$4 = this.D() ? this.c : this.b;
      $$0.b(this.a, $$4, this.F(), this.G(), 16777215 | ayz.f(this.l * 255.0F) << 24);
   }
}
