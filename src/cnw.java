import javax.annotation.Nullable;

public class cnw extends cnv implements bsj, cnx {
   private static final int i = 27;
   private jg<ctq> j = jg.a(27, ctq.i);
   @Nullable
   private akm<epm> k;
   private long l;

   public cnw(bsc<? extends cnv> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cnw(daz $$0, double $$1, double $$2, double $$3) {
      super(bsc.r, $$0);
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
   protected void b(ud $$0) {
      super.b($$0);
      this.a($$0, this.dR());
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.b($$0, this.dR());
   }

   @Override
   public void a(bqp $$0) {
      this.b(this.ah_());
      this.a($$0, this.dP(), this);
   }

   @Override
   public void a(brw.c $$0) {
      if (!this.dP().B && $$0.a()) {
         bps.a(this.dP(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bpw a(cly $$0, bpv $$1) {
      if (this.r($$0) && !$$0.fR()) {
         return super.a($$0, $$1);
      } else {
         bpw $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dvw.k, $$0);
            ckp.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cly $$0) {
      $$0.a(this);
      if (!$$0.dP().B) {
         this.a(dvw.k, $$0);
         ckp.a($$0, true);
      }
   }

   @Override
   public ctl ah_() {
      return switch (this.x()) {
         case b -> ctt.nX;
         case c -> ctt.nZ;
         case d -> ctt.ob;
         case e -> ctt.od;
         case f -> ctt.of;
         case g -> ctt.oh;
         case h -> ctt.oj;
         case i -> ctt.ol;
         default -> ctt.nV;
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
   public ctq a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public ctq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public ctq b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, ctq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bti a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cov createMenu(int $$0, clx $$1, cly $$2) {
      if (this.k != null && $$2.N_()) {
         return null;
      } else {
         this.e($$1.l);
         return cpc.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cly $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akm<epm> B() {
      return this.k;
   }

   @Override
   public void a(@Nullable akm<epm> $$0) {
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
   public jg<ctq> D() {
      return this.j;
   }

   @Override
   public void E() {
      this.j = jg.a(this.b(), ctq.i);
   }

   @Override
   public void c(cly $$0) {
      this.dP().a(dvw.j, this.dn(), dvw.a.a($$0));
   }
}
