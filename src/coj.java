import javax.annotation.Nullable;

public class coj extends coi implements bsv, cok {
   private static final int i = 27;
   private js<cud> j = js.a(27, cud.l);
   @Nullable
   private akj<erb> k;
   private long l;

   public coj(bsn<? extends coi> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public coj(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.r, $$0);
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
      this.a($$0, this.dT());
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.b($$0, this.dT());
   }

   @Override
   public void a(bra $$0) {
      this.b(this.ag_());
      this.a($$0, this.dR(), this);
   }

   @Override
   public void a(bsh.d $$0) {
      if (!this.dR().B && $$0.a()) {
         bqd.a(this.dR(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      if (this.r($$0) && !$$0.fP()) {
         return super.a($$0, $$1);
      } else {
         bqh $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dxh.k, $$0);
            clc.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cml $$0) {
      $$0.a(this);
      if (!$$0.dR().B) {
         this.a(dxh.k, $$0);
         clc.a($$0, true);
      }
   }

   @Override
   public cty ag_() {
      return switch (this.x()) {
         case b -> cug.nX;
         case c -> cug.nZ;
         case d -> cug.ob;
         case e -> cug.od;
         case f -> cug.of;
         case g -> cug.oh;
         case h -> cug.oj;
         case i -> cug.ol;
         default -> cug.nV;
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
   public cud a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cud a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cud b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cud $$1) {
      this.c($$0, $$1);
   }

   @Override
   public btu a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cml $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cpi createMenu(int $$0, cmk $$1, cml $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpq.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cml $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akj<erb> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akj<erb> $$0) {
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
   public js<cud> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = js.a(this.b(), cud.l);
   }

   @Override
   public void c(cml $$0) {
      this.dR().a(dxh.j, this.dp(), dxh.a.a($$0));
   }
}
