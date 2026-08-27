import javax.annotation.Nullable;

public abstract class fjq extends fjg {
   protected final fbs<?>[] o;
   @Nullable
   private fdn a;
   protected fem p;

   public fjq(fjo $$0, fbt $$1, wg $$2, fbs<?>[] $$3) {
      super($$0, $$1, $$2);
      this.o = $$3;
   }

   @Override
   protected void aN_() {
      this.p = this.c(new fem(this.j, this.k, this.l, this));
      this.p.a(this.o);
      this.a = this.p.b(this.c.as());
      if (this.a != null) {
         this.a.j = this.j.aY().a();
      }

      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.p.a(this.k, this.d);
   }

   public void C() {
      if (this.a instanceof fdw) {
         ((fdw)this.a).a(this.c.as().c());
      }
   }
}
