import javax.annotation.Nullable;

public class cpp extends cpo implements bty, cpq {
   private static final int i = 27;
   private jw<cvl> j = jw.a(27, cvl.k);
   @Nullable
   private ala<esy> k;
   private long l;

   public cpp(btq<? extends cpo> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cpp(dds $$0, double $$1, double $$2, double $$3) {
      super(btq.r, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected float v() {
      return 0.15F;
   }

   @Override
   protected int x() {
      return 1;
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.a($$0, this.dU());
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.b($$0, this.dU());
   }

   @Override
   public void a(bsb $$0) {
      this.b(this.aj_());
      this.a($$0, this.dS(), this);
   }

   @Override
   public void a(btj.c $$0) {
      if (!this.dS().B && $$0.a()) {
         brg.a(this.dS(), this, this);
      }

      super.a($$0);
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      if (!$$0.fR()) {
         brk $$2 = super.a($$0, $$1);
         if ($$2 != brk.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fR()) {
         return brk.e;
      } else {
         brk $$3 = this.c_($$0);
         if ($$3.a()) {
            this.a(dyx.k, $$0);
            cmg.a($$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cnp $$0) {
      $$0.a(this);
      if (!$$0.dS().B) {
         this.a(dyx.k, $$0);
         cmg.a($$0, true);
      }
   }

   @Override
   public cvg aj_() {
      return switch (this.w()) {
         case b -> cvo.nY;
         case c -> cvo.oa;
         case d -> cvo.oc;
         case e -> cvo.oe;
         case f -> cvo.og;
         case g -> cvo.oi;
         case h -> cvo.ok;
         case i -> cvo.om;
         default -> cvo.nW;
      };
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
   public cvl a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvl b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.c($$0, $$1);
   }

   @Override
   public buw a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnp $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cqq createMenu(int $$0, cno $$1, cnp $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.k);
         return cqz.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cnp $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ala<esy> E() {
      return this.k;
   }

   @Override
   public void a(@Nullable ala<esy> $$0) {
      this.k = $$0;
   }

   @Override
   public long F() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public jw<cvl> G() {
      return this.j;
   }

   @Override
   public void I() {
      this.j = jw.a(this.b(), cvl.k);
   }

   @Override
   public void c(cnp $$0) {
      this.dS().a(dyx.j, this.dq(), dyx.a.a($$0));
   }
}
