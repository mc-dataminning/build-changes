public class ckl extends cjl {
   private static final int c = 300;
   private static final ajw<Boolean> d = aka.a(ckl.class, ajy.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int ca;

   public ckl(bsx<? extends ckl> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gn() {
      return this.ar().a(d);
   }

   public void x(boolean $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean gm() {
      return this.gn();
   }

   @Override
   public void l() {
      if (!this.dO().B && this.bE() && !this.fZ()) {
         if (this.az) {
            if (this.gn()) {
               this.ca--;
               if (this.ca < 0) {
                  this.go();
               }
            } else {
               this.e++;
               if (this.e >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.e = -1;
            this.x(false);
         }
      }

      super.l();
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gn() ? this.ca : -1);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.ca = $$0;
      this.x(true);
   }

   protected void go() {
      this.a(bsx.aY, true);
      if (!this.aX()) {
         this.dO().a(null, 1048, this.do(), 0);
      }
   }

   @Override
   public boolean dC() {
      return false;
   }

   @Override
   protected avo v() {
      return avp.xb;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.xm;
   }

   @Override
   protected avo n_() {
      return avp.xd;
   }

   @Override
   avo t() {
      return avp.xo;
   }

   @Override
   protected void a(aqu $$0, brk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjp $$4 && $$4.gl()) {
         $$4.gm();
         this.a(cut.ul);
      }
   }
}
