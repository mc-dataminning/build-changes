import javax.annotation.Nullable;

public class cpy extends cpx implements bug, cpz {
   private static final int i = 27;
   private jx<cvs> j = jx.a(27, cvs.k);
   @Nullable
   private ald<etq> k;
   private long l;

   public cpy(bty<? extends cpx> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpy(dej $$0, double $$1, double $$2, double $$3) {
      super(bty.r, $$0);
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
   protected void b(ug $$0) {
      super.b($$0);
      this.a($$0, this.dU());
   }

   @Override
   protected void a(ug $$0) {
      super.a($$0);
      this.b($$0, this.dU());
   }

   @Override
   public void a(bsj $$0) {
      this.b(this.ak_());
      this.a($$0, this.dS(), this);
   }

   @Override
   public void a(btr.c $$0) {
      if (!this.dS().B && $$0.a()) {
         bro.a(this.dS(), this, this);
      }

      super.a($$0);
   }

   @Override
   public brs a(cnx $$0, brr $$1) {
      if (!$$0.fT()) {
         brs $$2 = super.a($$0, $$1);
         if ($$2 != brs.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fT()) {
         return brs.e;
      } else {
         brs $$3 = this.c_($$0);
         if ($$3.a()) {
            this.a(dzp.k, $$0);
            cmo.a($$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cnx $$0) {
      $$0.a(this);
      if (!$$0.dS().B) {
         this.a(dzp.k, $$0);
         cmo.a($$0, true);
      }
   }

   @Override
   public cvn ak_() {
      return switch (this.w()) {
         case b -> cvw.nY;
         case c -> cvw.oa;
         case d -> cvw.oc;
         case e -> cvw.oe;
         case f -> cvw.og;
         case g -> cvw.oi;
         case h -> cvw.ok;
         case i -> cvw.om;
         default -> cvw.nW;
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
   public cvs a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvs b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bve a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnx $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cqz createMenu(int $$0, cnw $$1, cnx $$2) {
      if (this.k != null && $$2.Q_()) {
         return null;
      } else {
         this.e($$1.k);
         return cri.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cnx $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ald<etq> F() {
      return this.k;
   }

   @Override
   public void a(@Nullable ald<etq> $$0) {
      this.k = $$0;
   }

   @Override
   public long G() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public jx<cvs> I() {
      return this.j;
   }

   @Override
   public void J() {
      this.j = jx.a(this.b(), cvs.k);
   }

   @Override
   public void c(cnx $$0) {
      this.dS().a(dzp.j, this.dq(), dzp.a.a($$0));
   }
}
