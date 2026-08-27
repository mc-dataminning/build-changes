import javax.annotation.Nullable;

public abstract class eus extends eui {
   protected final enq<?>[] c;
   @Nullable
   private epf l;
   protected eqd k;

   public eus(euq $$0, enr $$1, sw $$2, enq<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void b() {
      this.k = new eqd(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.e();
      this.l = this.k.b(this.b.an());
      if (this.l != null) {
         this.l.r = this.f.aU().a();
      }
   }

   protected void e() {
      this.d(epi.a(sv.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   public void l() {
      if (this.l instanceof epp) {
         ((epp)this.l).a(this.b.an().c());
      }
   }
}
