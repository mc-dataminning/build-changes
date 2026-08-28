import javax.annotation.Nullable;

public abstract class frh extends fod {
   protected final fod b;
   protected final fgs c;
   @Nullable
   protected fjj r;
   public final flz s = new flz(this);

   public frh(fod $$0, fgs $$1, wz $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aT_() {
      this.E();
      this.D();
      this.C();
      this.s.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   protected void E() {
      this.s.a(this.k, this.o);
   }

   protected void D() {
      this.r = this.s.c(new fjj(this.l, this.m, this));
      this.m();
      if (this.r.b(this.c.as()) instanceof fit $$0) {
         this.p = $$0;
         this.p.j = this.l.aV().a();
      }
   }

   protected abstract void m();

   protected void C() {
      this.s.b(fim.a(wy.d, $$0 -> this.d()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.r != null) {
         this.r.a(this.m, this.s);
      }
   }

   @Override
   public void j() {
      this.l.m.aw();
   }

   @Override
   public void d() {
      if (this.r != null) {
         this.r.c();
      }

      this.l.a(this.b);
   }
}
