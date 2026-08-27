public class euh extends etj {
   private final esw a;
   private final ui b;
   private final ui c;

   public euh(int $$0, int $$1, int $$2, int $$3, ui $$4, etj.c $$5, esw $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, o);
      this.a = $$6;
      this.b = $$4;
      this.c = ul.a($$4.f(), vf.a.c(true));
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      ui $$4 = this.n() ? this.c : this.b;
      $$0.b(this.a, $$4, this.p(), this.r(), 16777215 | asy.f(this.k * 255.0F) << 24);
   }
}
