import javax.annotation.Nullable;

public class coi extends coh implements bsu, coj {
   private static final int i = 27;
   private js<cuc> j = js.a(27, cuc.l);
   @Nullable
   private akj<eqz> k;
   private long l;

   public coi(bsm<? extends coh> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public coi(dcf $$0, double $$1, double $$2, double $$3) {
      super(bsm.r, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected float w() {
      return 0.15F;
   }

   @Override
   protected int y() {
      return 1;
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.a($$0, this.dS());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dS());
   }

   @Override
   public void a(bqz $$0) {
      this.b(this.ag_());
      this.a($$0, this.dQ(), this);
   }

   @Override
   public void a(bsg.c $$0) {
      if (!this.dQ().B && $$0.a()) {
         bqc.a(this.dQ(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqg a(cmk $$0, bqf $$1) {
      if (this.r($$0) && !$$0.fO()) {
         return super.a($$0, $$1);
      } else {
         bqg $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dxg.k, $$0);
            clb.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cmk $$0) {
      $$0.a(this);
      if (!$$0.dQ().B) {
         this.a(dxg.k, $$0);
         clb.a($$0, true);
      }
   }

   @Override
   public ctx ag_() {
      return switch (this.x()) {
         case b -> cuf.nX;
         case c -> cuf.nZ;
         case d -> cuf.ob;
         case e -> cuf.od;
         case f -> cuf.of;
         case g -> cuf.oh;
         case h -> cuf.oj;
         case i -> cuf.ol;
         default -> cuf.nV;
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
   public cuc a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cuc a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cuc b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cuc $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btt a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmk $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cph createMenu(int $$0, cmj $$1, cmk $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpp.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cmk $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akj<eqz> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akj<eqz> $$0) {
      this.k = $$0;
   }

   @Override
   public long C() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public js<cuc> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = js.a(this.b(), cuc.l);
   }

   @Override
   public void c(cmk $$0) {
      this.dQ().a(dxg.j, this.do(), dxg.a.a($$0));
   }
}
