import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class crm extends crl implements bvq, crs {
   private static final int h = 27;
   private jz<cxg> i = jz.a(27, cxg.j);
   @Nullable
   private alo<ewn> j;
   private long k;

   public crm(bvi<? extends crm> $$0, dgz $$1, Supplier<cxc> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected float s() {
      return 0.15F;
   }

   @Override
   protected int t() {
      return 1;
   }

   @Override
   protected void b(um $$0) {
      super.b($$0);
      this.a($$0, this.dY());
   }

   @Override
   protected void a(um $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public void a(arx $$0, btr $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bvb.d $$0) {
      if (!this.dW().C && $$0.a()) {
         bsw.a(this.dW(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bta a(cpo $$0, bsz $$1) {
      if (!$$0.fY()) {
         bta $$2 = super.a($$0, $$1);
         if ($$2 != bta.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bta.e;
      } else {
         bta $$3 = this.b_($$0);
         if ($$3.a() && $$0.dW() instanceof arx $$4) {
            this.a(eck.k, $$0);
            cod.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cpo $$0) {
      $$0.a(this);
      if ($$0.dW() instanceof arx $$1) {
         this.a(eck.k, $$0);
         cod.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.f();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public cxg a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxg b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxg $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwp a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpo $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cst createMenu(int $$0, cpn $$1, cpo $$2) {
      if (this.j != null && $$2.aa_()) {
         return null;
      } else {
         this.e($$1.k);
         return ctc.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cpo $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alo<ewn> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable alo<ewn> $$0) {
      this.j = $$0;
   }

   @Override
   public long x() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public jz<cxg> B() {
      return this.i;
   }

   @Override
   public void C() {
      this.i = jz.a(this.b(), cxg.j);
   }

   @Override
   public void c(cpo $$0) {
      this.dW().a(eck.j, this.du(), eck.a.a($$0));
   }
}
