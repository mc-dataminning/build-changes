import javax.annotation.Nullable;

public class chc extends chb implements bmd, chd {
   private static final int i = 27;
   private iq<cmx> j = iq.a(27, cmx.f);
   @Nullable
   private ahg k;
   private long l;

   public chc(bly<? extends chb> $$0, cto $$1) {
      super($$0, $$1);
   }

   public chc(cto $$0, double $$1, double $$2, double $$3) {
      super(bly.p, $$0);
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
   protected void b(sn $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bks $$0) {
      this.b(this.ah_());
      this.a($$0, this.dM(), this);
   }

   @Override
   public void a(blu.c $$0) {
      if (!this.dM().B && $$0.a()) {
         bjw.a(this.dM(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bka a(cfh $$0, bjz $$1) {
      if (this.r($$0) && !$$0.fI()) {
         return super.a($$0, $$1);
      } else {
         bka $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dnq.k, $$0);
            cdy.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cfh $$0) {
      $$0.a((bkd)this);
      if (!$$0.dM().B) {
         this.a(dnq.k, $$0);
         cdy.a($$0, true);
      }
   }

   @Override
   public cms ah_() {
      return switch (this.y()) {
         case b -> cna.nW;
         case c -> cna.nY;
         case d -> cna.oa;
         case e -> cna.oc;
         case f -> cna.oe;
         case g -> cna.og;
         case h -> cna.oi;
         case i -> cna.ok;
         default -> cna.nU;
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
   public cmx a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cmx a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cmx b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cmx $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bnc a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cfh $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cia createMenu(int $$0, cfg $$1, cfh $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return cih.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cfh $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ahg C() {
      return this.k;
   }

   @Override
   public void a(@Nullable ahg $$0) {
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
   public iq<cmx> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = iq.a(this.b(), cmx.f);
   }

   @Override
   public void c(cfh $$0) {
      this.dM().a(dnq.j, this.dk(), dnq.a.a($$0));
   }
}
