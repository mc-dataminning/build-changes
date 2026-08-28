public class fie extends fhg {
   private final fgr a;
   private final xp b;
   private final xp c;

   public fie(int $$0, int $$1, int $$2, int $$3, xp $$4, fhg.c $$5, fgr $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xs.a($$4.f(), ym.a.c(true));
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      xp $$4 = this.A() ? this.c : this.b;
      $$0.b(this.a, $$4, this.C(), this.D(), 16777215 | ayz.f(this.l * 255.0F) << 24);
   }
}
