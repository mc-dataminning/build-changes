import javax.annotation.Nullable;

public class cfo extends cfn implements bkz, cfp {
   private static final int i = 27;
   private il<clj> j = il.a(27, clj.b);
   @Nullable
   private agi k;
   private long l;

   public cfo(bku<? extends cfn> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cfo(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.o, $$0);
      this.a_($$1, $$2, $$3);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
   }

   @Override
   protected float x() {
      return 0.15F;
   }

   @Override
   protected int z() {
      return 1;
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bjo $$0) {
      this.b(this.ag_());
      this.a($$0, this.dN(), this);
   }

   @Override
   public void a(bkq.c $$0) {
      if (!this.dN().B && $$0.a()) {
         bit.a(this.dN(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bix a(cdu $$0, biw $$1) {
      if (this.r($$0) && !$$0.fJ()) {
         return super.a($$0, $$1);
      } else {
         bix $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dls.k, $$0);
            ccl.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cdu $$0) {
      $$0.a((bja)this);
      if (!$$0.dN().B) {
         this.a(dls.k, $$0);
         ccl.a($$0, true);
      }
   }

   @Override
   public cle ag_() {
      return switch (this.y()) {
         case b -> clm.nW;
         case c -> clm.nY;
         case d -> clm.oa;
         case e -> clm.oc;
         case f -> clm.oe;
         case g -> clm.og;
         case h -> clm.oi;
         case i -> clm.ok;
         default -> clm.nU;
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
   public clj a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public clj a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public clj b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, clj $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bly a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdu $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cgm createMenu(int $$0, cdt $$1, cdu $$2) {
      if (this.k != null && $$2.O_()) {
         return null;
      } else {
         this.e($$1.m);
         return cgt.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cdu $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public agi C() {
      return this.k;
   }

   @Override
   public void a(@Nullable agi $$0) {
      this.k = $$0;
   }

   @Override
   public long D() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public il<clj> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = il.a(this.b(), clj.b);
   }

   @Override
   public void c(cdu $$0) {
      this.dN().a(dls.j, this.dl(), dls.a.a($$0));
   }
}
