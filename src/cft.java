import javax.annotation.Nullable;

public class cft extends cfs implements ble, cfu {
   private static final int i = 27;
   private ip<clo> j = ip.a(27, clo.b);
   @Nullable
   private agm k;
   private long l;

   public cft(bkz<? extends cfs> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cft(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.o, $$0);
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
   protected void b(sd $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(sd $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public void a(bjt $$0) {
      this.b(this.ah_());
      this.a($$0, this.dN(), this);
   }

   @Override
   public void a(bkv.c $$0) {
      if (!this.dN().B && $$0.a()) {
         bix.a(this.dN(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bjb a(cdz $$0, bja $$1) {
      if (this.r($$0) && !$$0.fJ()) {
         return super.a($$0, $$1);
      } else {
         bjb $$2 = this.c_($$0);
         if ($$2.a()) {
            this.a(dlx.k, $$0);
            ccq.a($$0, true);
         }

         return $$2;
      }
   }

   @Override
   public void b(cdz $$0) {
      $$0.a((bje)this);
      if (!$$0.dN().B) {
         this.a(dlx.k, $$0);
         ccq.a($$0, true);
      }
   }

   @Override
   public clj ah_() {
      return switch (this.y()) {
         case b -> clr.nW;
         case c -> clr.nY;
         case d -> clr.oa;
         case e -> clr.oc;
         case f -> clr.oe;
         case g -> clr.og;
         case h -> clr.oi;
         case i -> clr.ok;
         default -> clr.nU;
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
   public clo a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public clo b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bmd a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cdz $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cgr createMenu(int $$0, cdy $$1, cdz $$2) {
      if (this.k != null && $$2.P_()) {
         return null;
      } else {
         this.e($$1.m);
         return cgy.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cdz $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public agm C() {
      return this.k;
   }

   @Override
   public void a(@Nullable agm $$0) {
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
   public ip<clo> E() {
      return this.j;
   }

   @Override
   public void G() {
      this.j = ip.a(this.b(), clo.b);
   }

   @Override
   public void c(cdz $$0) {
      this.dN().a(dlx.j, this.dl(), dlx.a.a($$0));
   }
}
