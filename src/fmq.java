import javax.annotation.Nullable;

public abstract class fmq extends fjo {
   private static final int b = 100;
   private final wg c;
   @Nullable
   private final wg d;
   private final wg o;
   @Nullable
   protected fdr a;
   @Nullable
   private fea p;
   private final fha q;

   protected fmq(wg $$0, wg $$1, wg $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fmq(wg $$0, wg $$1, @Nullable wg $$2, wg $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.o = $$3;
      this.q = new fha(0, 0, this.k, this.l);
   }

   protected abstract fhd m();

   @Override
   protected void aN_() {
      fhg $$0 = this.q.a(fhg.d().a(8));
      $$0.c().b();
      $$0.a(new few(this.n(), this.m));
      this.p = $$0.a(new fea(this.k - 100, this.c, this.m, 12), $$0x -> $$0x.a(12));
      this.p.b(false);
      fhg $$1 = $$0.a(fhg.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fdr.a(this.d, this.m).a());
      }

      $$1.a(this.m());
      this.q.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.p != null) {
         this.p.d(this.k - 100);
      }

      this.q.a();
      fha.a(this.q, this.G());
   }

   @Override
   public wg i() {
      return this.o;
   }
}
