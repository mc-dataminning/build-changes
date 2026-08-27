import java.util.List;
import java.util.UUID;
import org.joml.Vector3f;

public class cde extends cgq implements ccs {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bno e = new bno(b, "Drinking speed penalty", -0.25, bno.a.a);
   private static final agm<Boolean> bT = agp.a(cde.class, ago.k);
   private int bU;
   private bvb<cgq> bV;
   private bva<cfh> bW;

   public cde(bly<? extends cde> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bV = new bvb<>(this, cgq.class, true, $$0 -> $$0 != null && this.gt() && $$0.ai() != bly.bl);
      this.bW = new bva<>(this, cfh.class, 10, true, false, null);
      this.bO.a(1, new bta(this));
      this.bO.a(2, new buf(this, 1.0, 60, 10.0F));
      this.bO.a(2, new but(this, 1.0));
      this.bO.a(3, new bto(this, cfh.class, 8.0F));
      this.bO.a(3, new bub(this));
      this.bP.a(1, new buy(this, cgq.class));
      this.bP.a(2, this.bV);
      this.bP.a(3, this.bW);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(bT, false);
   }

   @Override
   protected arq y() {
      return arr.Bf;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Bj;
   }

   @Override
   protected arq n_() {
      return arr.Bh;
   }

   public void y(boolean $$0) {
      this.an().b(bT, $$0);
   }

   @Override
   public boolean u() {
      return this.an().b(bT);
   }

   public static bnp.a w() {
      return cco.gk().a(bnq.l, 26.0).a(bnq.m, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dM().B && this.bx()) {
         this.bV.k();
         if (this.bV.i() <= 0) {
            this.bW.a(true);
         } else {
            this.bW.a(false);
         }

         if (this.u()) {
            if (this.bU-- <= 0) {
               this.y(false);
               cmx $$0 = this.eT();
               this.a(blz.a, cmx.f);
               if ($$0.a(cna.sh)) {
                  List<blh> $$1 = cox.a($$0);
                  if ($$1 != null) {
                     for (blh $$2 : $$1) {
                        this.b(new blh($$2));
                     }
                  }
               }

               this.a(dnq.l);
               this.a(bnq.m).b(e.a());
            }
         } else {
            cov $$3 = null;
            if (this.ag.i() < 0.15F && this.a(asl.a) && !this.a(blj.m)) {
               $$3 = coy.y;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ex() != null && this.ex().a(asi.j)) && !this.a(blj.l)) {
               $$3 = coy.n;
            } else if (this.ag.i() < 0.05F && this.ev() < this.eM()) {
               $$3 = coy.A;
            } else if (this.ag.i() < 0.5F && this.q() != null && !this.a(blj.a) && this.q().f(this) > 121.0) {
               $$3 = coy.p;
            }

            if ($$3 != null) {
               this.a(blz.a, cox.a(new cmx(cna.sh), $$3));
               this.bU = this.eT().r();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), arr.Bi, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               bnm $$4 = this.a(bnq.m);
               $$4.b(e.a());
               $$4.b(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dM().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public arq af_() {
      return arr.Bg;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dM().a(jx.ak, this.dr() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dx() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bks $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(asi.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bmk $$0, float $$1) {
      if (!this.u()) {
         els $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         cov $$7 = coy.C;
         if ($$0 instanceof cgq) {
            if ($$0.ev() <= 4.0F) {
               $$7 = coy.A;
            } else {
               $$7 = coy.H;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(blj.b)) {
            $$7 = coy.s;
         } else if ($$0.ev() >= 8.0F && !$$0.a(blj.s)) {
            $$7 = coy.E;
         } else if ($$6 <= 3.0 && !$$0.a(blj.r) && this.ag.i() < 0.25F) {
            $$7 = coy.N;
         }

         cgk $$8 = new cgk(this.dM(), this);
         $$8.a(cox.a(new cmx(cna.vh), $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arr.Bk, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dM().b($$8);
      }
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 1.62F;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.3125F * $$2, 0.0F);
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gf() {
      return false;
   }
}
