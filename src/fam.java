public class fam extends ezo {
   private final eyz a;
   private final vq b;
   private final vq c;

   public fam(int $$0, int $$1, int $$2, int $$3, vq $$4, ezo.c $$5, eyz $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = vt.a($$4.f(), wn.a.c(true));
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      vq $$4 = this.z() ? this.c : this.b;
      $$0.b(this.a, $$4, this.B(), this.C(), 16777215 | awi.f(this.l * 255.0F) << 24);
   }
}
