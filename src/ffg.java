import javax.annotation.Nullable;

public abstract class ffg extends few {
   protected final exk<?>[] c;
   @Nullable
   private ezf l;
   protected fae k;

   public ffg(ffe $$0, exl $$1, vq $$2, exk<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aQ_() {
      this.k = this.d(new fae(this.f, this.g, this.h - 64, 32, 25));
      this.k.a(this.c);
      this.j();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.j = this.f.aW().a();
      }
   }

   protected void j() {
      this.d(ezh.a(vp.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void o() {
      if (this.l instanceof ezo) {
         ((ezo)this.l).a(this.b.ap().c());
      }
   }
}
