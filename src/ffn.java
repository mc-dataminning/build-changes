import javax.annotation.Nullable;

public abstract class ffn extends ffd {
   protected final exr<?>[] c;
   @Nullable
   private ezm l;
   protected fal k;

   public ffn(ffl $$0, exs $$1, vq $$2, exr<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aQ_() {
      this.k = this.c(new fal(this.f, this.g, this.h - 64, 32, 25));
      this.k.a(this.c);
      this.j();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.j = this.f.aX().a();
      }
   }

   protected void j() {
      this.c(ezo.a(vp.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void o() {
      if (this.l instanceof ezv) {
         ((ezv)this.l).a(this.b.ap().c());
      }
   }
}
