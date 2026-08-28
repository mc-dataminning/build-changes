import javax.annotation.Nullable;

public class cqr extends cqq implements bux, cqs {
   private static final int i = 27;
   private jz<cwf> j = jz.a(27, cwf.k);
   @Nullable
   private alk<eul> k;
   private long l;

   public cqr(bup<? extends cqq> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cqr(dff $$0, double $$1, double $$2, double $$3) {
      super(bup.r, $$0);
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
   protected void b(un $$0) {
      super.b($$0);
      this.a($$0, this.ea());
   }

   @Override
   protected void a(un $$0) {
      super.a($$0);
      this.b($$0, this.ea());
   }

   @Override
   public void a(bsy $$0) {
      this.b(this.al_());
      this.a($$0, this.dY(), this);
   }

   @Override
   public void a(bui.c $$0) {
      if (!this.dY().C && $$0.a()) {
         bsd.a(this.dY(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      if (!$$0.gb()) {
         bsh $$2 = super.a($$0, $$1);
         if ($$2 != bsh.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.gb()) {
         return bsh.e;
      } else {
         bsh $$3 = this.c_($$0);
         if ($$3.a()) {
            this.a(eak.k, $$0);
            cng.a($$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cor $$0) {
      $$0.a(this);
      if (!$$0.dY().C) {
         this.a(eak.k, $$0);
         cng.a($$0, true);
      }
   }

   @Override
   public cwb al_() {
      return switch (this.w()) {
         case b -> cwj.nY;
         case c -> cwj.oa;
         case d -> cwj.oc;
         case e -> cwj.oe;
         case f -> cwj.og;
         case g -> cwj.oi;
         case h -> cwj.ok;
         case i -> cwj.om;
         default -> cwj.nW;
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
   public cwf a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cwf a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwf b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cwf $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvw a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cor $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public crs createMenu(int $$0, coq $$1, cor $$2) {
      if (this.k != null && $$2.R_()) {
         return null;
      } else {
         this.e($$1.k);
         return csb.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cor $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alk<eul> F() {
      return this.k;
   }

   @Override
   public void a(@Nullable alk<eul> $$0) {
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
   public jz<cwf> I() {
      return this.j;
   }

   @Override
   public void J() {
      this.j = jz.a(this.b(), cwf.k);
   }

   @Override
   public void c(cor $$0) {
      this.dY().a(eak.j, this.dw(), eak.a.a($$0));
   }
}
