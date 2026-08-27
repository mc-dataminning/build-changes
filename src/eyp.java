public class eyp extends exr {
   private final exc a;
   private final vg b;
   private final vg c;

   public eyp(int $$0, int $$1, int $$2, int $$3, vg $$4, exr.c $$5, exc $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, p);
      this.a = $$6;
      this.b = $$4;
      this.c = vj.a($$4.f(), wd.a.c(true));
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      vg $$4 = this.z() ? this.c : this.b;
      $$0.b(this.a, $$4, this.B(), this.C(), 16777215 | aup.f(this.l * 255.0F) << 24);
   }
}
