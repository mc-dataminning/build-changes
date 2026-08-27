public class exw extends ewy {
   private final ewk a;
   private final vd b;
   private final vd c;

   public exw(int $$0, int $$1, int $$2, int $$3, vd $$4, ewy.c $$5, ewk $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = vg.a($$4.f(), wa.a.c(true));
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      vd $$4 = this.z() ? this.c : this.b;
      $$0.b(this.a, $$4, this.B(), this.C(), 16777215 | aui.f(this.l * 255.0F) << 24);
   }
}
