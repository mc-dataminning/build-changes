public class fjl extends fin {
   private final fhy a;
   private final xe b;
   private final xe c;

   public fjl(int $$0, int $$1, int $$2, int $$3, xe $$4, fin.c $$5, fhy $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xh.a($$4.f(), yb.a.c(true));
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      xe $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | aym.f(this.l * 255.0F) << 24);
   }
}
