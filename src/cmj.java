import javax.annotation.Nullable;

public class cmj extends cmi implements bqx, cmk {
   private static final int i = 27;
   private je<csd> j = je.a(27, csd.i);
   @Nullable
   private akf k;
   private long l;

   public cmj(bqr<? extends cmi> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cmj(czu $$0, double $$1, double $$2, double $$3) {
      super(bqr.r, $$0);
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
   protected void b(ty $$0) {
      super.b($$0);
      this.a($$0, this.dP());
   }

   @Override
   protected void a(ty $$0) {
      super.a($$0);
      this.b($$0, this.dP());
   }

   @Override
   public void a(bpj $$0) {
      this.b(this.ag_());
      this.a($$0, this.dN(), this);
   }

   @Override
   public void a(bql.c $$0) {
      if (!this.dN().B && $$0.a()) {
         bom.a(this.dN(), this, this);
      }

      super.a($$0);
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      if (this.r($$0) && !$$0.fP()) {
         return super.a($$0, $$1);
      } else {
         boq $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dur.k, $$0);
            cjc.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(ckl $$0) {
      $$0.a(this);
      if (!$$0.dN().B) {
         this.a(dur.k, $$0);
         cjc.a($$0, true);
      }
   }

   @Override
   public cry ag_() {
      return switch (this.x()) {
         case b -> csg.nX;
         case c -> csg.nZ;
         case d -> csg.ob;
         case e -> csg.od;
         case f -> csg.of;
         case g -> csg.oh;
         case h -> csg.oj;
         case i -> csg.ol;
         default -> csg.nV;
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
   public csd a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public csd b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.c($$0, $$1);
   }

   @Override
   public brv a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ckl $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cnh createMenu(int $$0, ckk $$1, ckl $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.m);
         return cno.a($$0, $$1, this);
      }
   }

   public void e(@Nullable ckl $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akf B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akf $$0) {
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
   public je<csd> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = je.a(this.b(), csd.i);
   }

   @Override
   public void c(ckl $$0) {
      this.dN().a(dur.j, this.dl(), dur.a.a($$0));
   }
}
