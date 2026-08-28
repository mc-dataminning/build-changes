import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cnq extends cnf implements cye.b {
   private static final int ca = 5;
   @Nullable
   private jf cb;
   private int cc;

   public cnq(bty<? extends cnq> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(0, new ccv<>(this, cxr.a(cvw.sm, cxs.g), awg.BE, $$0 -> this.dS().T() && !$$0.cm()));
      this.bS.a(0, new ccv<>(this, new cvs(cvw.qF), awg.BJ, $$0 -> this.dS().S() && $$0.cm()));
      this.bS.a(1, new cct(this));
      this.bS.a(1, new car<>(this, clw.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new car<>(this, ckw.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new car<>(this, cls.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new car<>(this, clr.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new car<>(this, clg.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new car<>(this, clb.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new car<>(this, clv.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccd(this, 0.5));
      this.bS.a(1, new cbt(this));
      this.bS.a(2, new cnq.a(this, 2.0, 0.35));
      this.bS.a(4, new cby(this, 0.35));
      this.bS.a(8, new ccx(this, 0.35));
      this.bS.a(9, new cbn(this, cnx.class, 3.0F, 1.0F));
      this.bS.a(10, new cbs(this, bup.class, 8.0F));
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return null;
   }

   @Override
   public boolean gr() {
      return false;
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if (!$$2.a(cvw.tK) && this.bI() && !this.gp() && !this.p_()) {
         if ($$1 == brr.a) {
            $$0.a(awq.S);
         }

         if (!this.dS().B) {
            if (this.gq().isEmpty()) {
               return brs.c;
            }

            this.a($$0);
            this.a($$0, this.R_(), 1);
         }

         return brs.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gv() {
      if (this.dS().J().b(cqs.c)) {
         this.gy();
      } else {
         cno.g[] $$0 = (cno.g[])cno.b.get(1);
         cno.g[] $$1 = (cno.g[])cno.b.get(2);
         if ($$0 != null && $$1 != null) {
            ddh $$2 = this.gq();
            this.a($$2, $$0, 5);
            int $$3 = this.af.a($$1.length);
            cno.g $$4 = $$1[$$3];
            ddg $$5 = $$4.a(this, this.af);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gy() {
      ddh $$0 = this.gq();

      for (Pair<cno.g[], Integer> $$1 : cno.d) {
         cno.g[] $$2 = (cno.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", uv.a(this.cb));
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      uv.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(ddg $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.af.a(4);
         this.dS().b(new bud(this.dS(), this.dx(), this.dz() + 0.5, this.dD(), $$1));
      }
   }

   @Override
   protected awf w() {
      return this.gp() ? awg.BK : awg.BC;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.BH;
   }

   @Override
   protected awf o_() {
      return awg.BD;
   }

   @Override
   public awf n(cvs $$0) {
      return $$0.a(cvw.qF) ? awg.BF : awg.BG;
   }

   @Override
   protected awf x(boolean $$0) {
      return $$0 ? awg.BL : awg.BI;
   }

   @Override
   public awf gs() {
      return awg.BL;
   }

   public void u(int $$0) {
      this.cc = $$0;
   }

   public int gx() {
      return this.cc;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dS().B) {
         this.gz();
      }
   }

   private void gz() {
      if (this.cc > 0 && !this.gp() && --this.cc == 0) {
         this.as();
      }
   }

   public void h(@Nullable jf $$0) {
      this.cb = $$0;
   }

   @Nullable
   jf gB() {
      return this.cb;
   }

   class a extends cbk {
      final cnq a;
      final double b;
      final double c;

      a(final cnq $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cnq.this.bR.o();
      }

      @Override
      public boolean b() {
         jf $$0 = this.a.gB();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jf $$0 = this.a.gB();
         if ($$0 != null && cnq.this.bR.m()) {
            if (this.a($$0, 10.0)) {
               eyw $$1 = new eyw((double)$$0.u() - this.a.dx(), (double)$$0.v() - this.a.dz(), (double)$$0.w() - this.a.dD()).d();
               eyw $$2 = $$1.c(10.0).b(this.a.dx(), this.a.dz(), this.a.dD());
               cnq.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cnq.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jf $$0, double $$1) {
         return !$$0.a(this.a.dq(), $$1);
      }
   }
}
