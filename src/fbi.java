public class fbi extends fak {
   private final ezv a;
   private final vs b;
   private final vs c;

   public fbi(int $$0, int $$1, int $$2, int $$3, vs $$4, fak.c $$5, ezv $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = vv.a($$4.f(), wp.a.c(true));
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      vs $$4 = this.z() ? this.c : this.b;
      $$0.b(this.a, $$4, this.B(), this.C(), 16777215 | awm.f(this.l * 255.0F) << 24);
   }
}
