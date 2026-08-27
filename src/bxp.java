import java.util.List;
import java.util.function.Predicate;

public class bxp extends bwt {
   private static final afs<Integer> e = afv.a(bxp.class, afu.b);
   int bT;
   int bU;
   private static final Predicate<bll> bV = $$0 -> $$0 instanceof cdz && ((cdz)$$0).f() ? false : $$0.ai() == bkz.f || $$0.eT() != blq.e;
   static final bvx bW = bvx.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bxp(bkz<? extends bxp> $$0, csf $$1) {
      super($$0, $$1);
      this.k_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, 0);
   }

   public int gh() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(afs<?> $$0) {
      if (e.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gh());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public clo b() {
      return new clo(clr.qC);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new bxp.a(this));
   }

   @Override
   public void l() {
      if (!this.dN().B && this.bx() && this.cZ()) {
         if (this.bT > 0) {
            if (this.gh() == 0) {
               this.a(aqv.tz, this.eX(), this.eY());
               this.c(1);
            } else if (this.bT > 40 && this.gh() == 1) {
               this.a(aqv.tz, this.eX(), this.eY());
               this.c(2);
            }

            this.bT++;
         } else if (this.gh() != 0) {
            if (this.bU > 60 && this.gh() == 2) {
               this.a(aqv.ty, this.eX(), this.eY());
               this.c(1);
            } else if (this.bU > 100 && this.gh() == 1) {
               this.a(aqv.ty, this.eX(), this.eY());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.gh() > 0) {
         for (bln $$1 : this.dN().a(bln.class, this.cH().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bln $$0) {
      int $$1 = this.gh();
      if ($$0.a(this.dO().b((bll)this), (float)(1 + $$1))) {
         $$0.b(new bki(bkk.s, 60 * $$1, 0), this);
         this.a(aqv.tD, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cdz $$0) {
      int $$1 = this.gh();
      if ($$0 instanceof amj && $$1 > 0 && $$0.a(this.dO().b((bll)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((amj)$$0).c.b(new zm(zm.j, 0.0F));
         }

         $$0.b(new bki(bkk.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aqu y() {
      return aqv.tx;
   }

   @Override
   protected aqu n_() {
      return aqv.tA;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.tC;
   }

   @Override
   protected aqu gg() {
      return aqv.tB;
   }

   @Override
   public bkw a(blx $$0) {
      return super.a($$0).a(s(this.gh()));
   }

   private static float s(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bsg {
      private final bxp a;

      public a(bxp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bll> $$0 = this.a.dN().a(bll.class, this.a.cH().g(2.0), $$0x -> bxp.bW.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bT = 1;
         this.a.bU = 0;
      }

      @Override
      public void d() {
         this.a.bT = 0;
      }
   }
}
