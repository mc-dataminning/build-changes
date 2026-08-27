import javax.annotation.Nullable;

public class ccu extends cco {
   private final ccv bV = new ccv(this);
   private static final int bW = 18000;
   private static final boi bY = bol.aM.n().a(boh.a().a(bog.a, 0.0F, bol.aM.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bZ;
   private int ca;

   public ccu(bol<? extends ccu> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public static bqd.a u() {
      return gL().a(bqe.n, 15.0).a(bqe.o, 0.2F);
   }

   public static boolean c(bol<? extends cam> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return !bpb.a($$2) ? cam.b($$0, $$1, $$2, $$3, $$4) : bpb.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(awt $$0) {
      this.f(bqe.j).a(a($$0::j));
   }

   @Override
   protected void gB() {
   }

   @Override
   protected ato y() {
      return this.a(auj.a) ? atp.wB : atp.wx;
   }

   @Override
   protected ato n_() {
      return atp.wy;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.wz;
   }

   @Override
   protected ato aN() {
      if (this.aC()) {
         if (!this.bM()) {
            return atp.wE;
         }

         this.cv++;
         if (this.cv > 5 && this.cv % 3 == 0) {
            return atp.wC;
         }

         if (this.cv <= 5) {
            return atp.wE;
         }
      }

      return atp.wA;
   }

   @Override
   protected void e(float $$0) {
      if (this.aC()) {
         super.e(0.3F);
      } else {
         super.e(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gS() {
      if (this.aZ()) {
         this.a(atp.wD, 0.4F, 1.0F);
      } else {
         super.gS();
      }
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? bY : super.e($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.w() && this.ca++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.ca);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.ca = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float ff() {
      return 0.96F;
   }

   public boolean w() {
      return this.bZ;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bZ) {
         this.bZ = $$0;
         if ($$0) {
            this.bP.a(1, this.bV);
         } else {
            this.bP.a(this.bV);
         }
      }
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      return bol.aM.a((cwe)$$0);
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      return !this.gA() ? bml.d : super.b($$0, $$1);
   }
}
