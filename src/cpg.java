import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cpg extends cov implements czm.b {
   private static final int cb = 5;
   @Nullable
   private jh cc;
   private int cd;

   public cpg(bvi<? extends cpg> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccp(this));
      this.bT.a(0, new ceg<>(this, czf.a(cxk.ti, czg.g), awv.Cn, $$0 -> this.dW().W() && !$$0.cp()));
      this.bT.a(0, new ceg<>(this, new cxg(cxk.rl), awv.Cs, $$0 -> this.dW().V() && $$0.cp()));
      this.bT.a(1, new cee(this));
      this.bT.a(1, new ccc<>(this, cnh.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccc<>(this, cmh.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new ccc<>(this, cnd.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccc<>(this, cnc.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccc<>(this, cmr.class, 15.0F, 0.5, 0.5));
      this.bT.a(1, new ccc<>(this, cmm.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new ccc<>(this, cng.class, 10.0F, 0.5, 0.5));
      this.bT.a(1, new cdo(this, 0.5));
      this.bT.a(1, new cde(this));
      this.bT.a(2, new cpg.a(this, 2.0, 0.35));
      this.bT.a(4, new cdj(this, 0.35));
      this.bT.a(8, new cei(this, 0.35));
      this.bT.a(9, new ccy(this, cpo.class, 3.0F, 1.0F));
      this.bT.a(10, new cdd(this, bvz.class, 8.0F));
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return null;
   }

   @Override
   public boolean gr() {
      return false;
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if (!$$2.a(cxk.uG) && this.bL() && !this.gp() && !this.e_()) {
         if ($$1 == bsz.a) {
            $$0.a(axf.S);
         }

         if (!this.dW().C) {
            if (this.gq().isEmpty()) {
               return bta.c;
            }

            this.a($$0);
            this.a($$0, this.p_(), 1);
         }

         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gv() {
      if (this.dW().K().b(csm.b)) {
         this.gy();
      } else {
         cpe.g[] $$0 = (cpe.g[])cpe.b.get(1);
         cpe.g[] $$1 = (cpe.g[])cpe.b.get(2);
         if ($$0 != null && $$1 != null) {
            dfx $$2 = this.gq();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cpe.g $$4 = $$1[$$3];
            dfw $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gy() {
      dfx $$0 = this.gq();

      for (Pair<cpe.g[], Integer> $$1 : cpe.d) {
         cpe.g[] $$2 = (cpe.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cd);
      if (this.cc != null) {
         $$0.a("wander_target", vb.a(this.cc));
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cd = $$0.h("DespawnDelay");
      }

      vb.a($$0, "wander_target").ifPresent($$0x -> this.cc = $$0x);
      this.c_(Math.max(0, this.Z_()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dfw $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dW().b(new bvn(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   protected awu u() {
      return this.gp() ? awv.Ct : awv.Cl;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Cq;
   }

   @Override
   protected awu o_() {
      return awv.Cm;
   }

   @Override
   public awu j(cxg $$0) {
      return $$0.a(cxk.rl) ? awv.Co : awv.Cp;
   }

   @Override
   protected awu x(boolean $$0) {
      return $$0 ? awv.Cu : awv.Cr;
   }

   @Override
   public awu gs() {
      return awv.Cu;
   }

   public void t(int $$0) {
      this.cd = $$0;
   }

   public int gx() {
      return this.cd;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.gz();
      }
   }

   private void gz() {
      if (this.cd > 0 && !this.gp() && --this.cd == 0) {
         this.at();
      }
   }

   public void h(@Nullable jh $$0) {
      this.cc = $$0;
   }

   @Nullable
   jh gB() {
      return this.cc;
   }

   class a extends ccv {
      final cpg a;
      final double b;
      final double c;

      a(final cpg $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cpg.this.bS.o();
      }

      @Override
      public boolean b() {
         jh $$0 = this.a.gB();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gB();
         if ($$0 != null && cpg.this.bS.m()) {
            if (this.a($$0, 10.0)) {
               fbr $$1 = new fbr((double)$$0.u() - this.a.dB(), (double)$$0.v() - this.a.dD(), (double)$$0.w() - this.a.dH()).d();
               fbr $$2 = $$1.c(10.0).b(this.a.dB(), this.a.dD(), this.a.dH());
               cpg.this.bS.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cpg.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jh $$0, double $$1) {
         return !$$0.a(this.a.du(), $$1);
      }
   }
}
