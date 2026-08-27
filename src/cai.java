import javax.annotation.Nullable;

public class cai extends cah implements bfs, caj {
   private static final int f = 27;
   private hn<cfz> g = hn.a(27, cfz.b);
   @Nullable
   private acq h;
   private long i;

   public cai(bfn<? extends cah> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public cai(cmm $$0, double $$1, double $$2, double $$3) {
      this(bfn.o, $$0);
      this.e($$1, $$2, $$3);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
   }

   @Override
   protected float q() {
      return 0.15F;
   }

   @Override
   protected int w() {
      return 1;
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(ben $$0) {
      super.a($$0);
      this.a($$0, this.dI(), this);
   }

   @Override
   public void a(bfj.c $$0) {
      if (!this.dI().B && $$0.a()) {
         bdt.a(this.dI(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      if (this.o($$0) && !$$0.fD()) {
         return super.a($$0, $$1);
      } else {
         bdx $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dgl.k, $$0);
            bxf.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(byo $$0) {
      $$0.a((bea)this);
      if (!$$0.dI().B) {
         this.a(dgl.k, $$0);
         bxf.a($$0, true);
      }
   }

   @Override
   public cfu j() {
      return switch (this.v()) {
         case b -> cgc.nl;
         case c -> cgc.nn;
         case d -> cgc.np;
         case e -> cgc.nr;
         case f -> cgc.nt;
         case g -> cgc.nv;
         case h -> cgc.nx;
         case i -> cgc.nz;
         default -> cgc.nj;
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
   public cfz a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cfz a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cfz b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cfz $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bgs a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(byo $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cbf createMenu(int $$0, byn $$1, byo $$2) {
      if (this.h != null && $$2.G_()) {
         return null;
      } else {
         this.e($$1.m);
         return cbm.a($$0, $$1, this);
      }
   }

   public void e(@Nullable byo $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public acq A() {
      return this.h;
   }

   @Override
   public void a(@Nullable acq $$0) {
      this.h = $$0;
   }

   @Override
   public long C() {
      return this.i;
   }

   @Override
   public void a(long $$0) {
      this.i = $$0;
   }

   @Override
   public hn<cfz> D() {
      return this.g;
   }

   @Override
   public void E() {
      this.g = hn.a(this.b(), cfz.b);
   }

   @Override
   public void c(byo $$0) {
      this.dI().a(dgl.j, this.dg(), dgl.a.a($$0));
   }
}
