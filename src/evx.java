public class evx extends euz {
   private final eum a;
   private final ur b;
   private final ur c;

   public evx(int $$0, int $$1, int $$2, int $$3, ur $$4, euz.c $$5, eum $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = uu.a($$4.f(), vo.a.c(true));
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      ur $$4 = this.n() ? this.c : this.b;
      $$0.b(this.a, $$4, this.p(), this.r(), 16777215 | atm.f(this.k * 255.0F) << 24);
   }
}
