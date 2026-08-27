import javax.annotation.Nullable;

public abstract class fgj extends ffz {
   protected final eyn<?>[] c;
   @Nullable
   private fai l;
   protected fbh k;

   public fgj(fgh $$0, eyo $$1, vs $$2, eyn<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aP_() {
      this.k = this.c(new fbh(this.f, this.g, this.h - 64, 32, 25));
      this.k.a(this.c);
      this.j();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.j = this.f.aX().a();
      }
   }

   protected void j() {
      this.c(fak.a(vr.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void o() {
      if (this.l instanceof far) {
         ((far)this.l).a(this.b.ap().c());
      }
   }
}
