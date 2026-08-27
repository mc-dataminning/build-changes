import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class clr extends clg {
   private static final int cj = 5;
   @Nullable
   private ir ck;
   private int cl;

   public clr(bsb<? extends clr> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      this.cb.a(0, new bzf(this));
      this.cb.a(0, new caw<>(this, cwr.a(cuk.tH, cws.i), avo.BS, $$0 -> this.dU().S() && !$$0.cm()));
      this.cb.a(0, new caw<>(this, new cuh(cuk.sb), avo.BX, $$0 -> this.dU().R() && $$0.cm()));
      this.cb.a(1, new cau(this));
      this.cb.a(1, new bys<>(this, cjx.class, 8.0F, 0.5, 0.5));
      this.cb.a(1, new bys<>(this, civ.class, 12.0F, 0.5, 0.5));
      this.cb.a(1, new bys<>(this, cjt.class, 8.0F, 0.5, 0.5));
      this.cb.a(1, new bys<>(this, cjs.class, 8.0F, 0.5, 0.5));
      this.cb.a(1, new bys<>(this, cjg.class, 15.0F, 0.5, 0.5));
      this.cb.a(1, new bys<>(this, cja.class, 12.0F, 0.5, 0.5));
      this.cb.a(1, new bys<>(this, cjw.class, 10.0F, 0.5, 0.5));
      this.cb.a(1, new cae(this, 0.5));
      this.cb.a(1, new bzu(this));
      this.cb.a(2, new clr.a(this, 2.0, 0.35));
      this.cb.a(4, new bzz(this, 0.35));
      this.cb.a(8, new cay(this, 0.35));
      this.cb.a(9, new bzo(this, cly.class, 3.0F, 1.0F));
      this.cb.a(10, new bzt(this, bsq.class, 8.0F));
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      return null;
   }

   @Override
   public boolean gB() {
      return false;
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (!$$2.a(cuk.vk) && this.bI() && !this.gz() && !this.o_()) {
         if ($$1 == bpz.a) {
            $$0.a(avz.S);
         }

         if (this.gA().isEmpty()) {
            return bqa.a(this.dU().C);
         } else {
            if (!this.dU().C) {
               this.f($$0);
               this.a($$0, this.P_(), 1);
            }

            return bqa.a(this.dU().C);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gF() {
      if (this.dU().K().b(cor.d)) {
         this.gI();
      } else {
         clp.g[] $$0 = (clp.g[])clp.b.get(1);
         clp.g[] $$1 = (clp.g[])clp.b.get(2);
         if ($$0 != null && $$1 != null) {
            daz $$2 = this.gA();
            this.a($$2, $$0, 5);
            int $$3 = this.al.a($$1.length);
            clp.g $$4 = $$1[$$3];
            day $$5 = $$4.a(this, this.al);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gI() {
      daz $$0 = this.gA();

      for (Pair<clp.g[], Integer> $$1 : clp.d) {
         clp.g[] $$2 = (clp.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cl);
      if (this.ck != null) {
         $$0.a("wander_target", uz.a(this.ck));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cl = $$0.h("DespawnDelay");
      }

      uz.a($$0, "wander_target").ifPresent($$0x -> this.ck = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(day $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.al.a(4);
         this.dU().b(new bse(this.dU(), this.dz(), this.dB() + 0.5, this.dF(), $$1));
      }
   }

   @Override
   protected avn u() {
      return this.gz() ? avo.BY : avo.BQ;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.BV;
   }

   @Override
   protected avn n_() {
      return avo.BR;
   }

   @Override
   protected avn c(cuh $$0) {
      return $$0.a(cuk.sb) ? avo.BT : avo.BU;
   }

   @Override
   protected avn w(boolean $$0) {
      return $$0 ? avo.BZ : avo.BW;
   }

   @Override
   public avn gC() {
      return avo.BZ;
   }

   public void w(int $$0) {
      this.cl = $$0;
   }

   public int gH() {
      return this.cl;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dU().C) {
         this.gK();
      }
   }

   private void gK() {
      if (this.cl > 0 && !this.gz() && --this.cl == 0) {
         this.ao();
      }
   }

   public void e(@Nullable ir $$0) {
      this.ck = $$0;
   }

   @Nullable
   ir gL() {
      return this.ck;
   }

   class a extends bzl {
      final clr a;
      final double b;
      final double c;

      a(clr $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public void d() {
         this.a.e(null);
         clr.this.ca.n();
      }

      @Override
      public boolean a() {
         ir $$0 = this.a.gL();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ir $$0 = this.a.gL();
         if ($$0 != null && clr.this.ca.l()) {
            if (this.a($$0, 10.0)) {
               ewu $$1 = new ewu((double)$$0.u() - this.a.dz(), (double)$$0.v() - this.a.dB(), (double)$$0.w() - this.a.dF()).d();
               ewu $$2 = $$1.a(10.0).b(this.a.dz(), this.a.dB(), this.a.dF());
               clr.this.ca.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               clr.this.ca.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ir $$0, double $$1) {
         return !$$0.a(this.a.ds(), $$1);
      }
   }
}
