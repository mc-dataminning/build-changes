import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmo extends cmd {
   private static final int cc = 5;
   @Nullable
   private jd cd;
   private int ce;

   public cmo(bsw<? extends cmo> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cae(this));
      this.bU.a(0, new cbv<>(this, cws.a(cur.sk, cwt.g), avo.By, $$0 -> this.dQ().S() && !$$0.ci()));
      this.bU.a(0, new cbv<>(this, new cuo(cur.qE), avo.BD, $$0 -> this.dQ().R() && $$0.ci()));
      this.bU.a(1, new cbt(this));
      this.bU.a(1, new bzr<>(this, cku.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzr<>(this, cju.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzr<>(this, ckq.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzr<>(this, ckp.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzr<>(this, cke.class, 15.0F, 0.5, 0.5));
      this.bU.a(1, new bzr<>(this, cjz.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzr<>(this, ckt.class, 10.0F, 0.5, 0.5));
      this.bU.a(1, new cbd(this, 0.5));
      this.bU.a(1, new cat(this));
      this.bU.a(2, new cmo.a(this, 2.0, 0.35));
      this.bU.a(4, new cay(this, 0.35));
      this.bU.a(8, new cbx(this, 0.35));
      this.bU.a(9, new can(this, cmv.class, 3.0F, 1.0F));
      this.bU.a(10, new cas(this, btn.class, 8.0F));
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      return null;
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (!$$2.a(cur.tJ) && this.bE() && !this.gn() && !this.o_()) {
         if ($$1 == bqp.a) {
            $$0.a(avy.S);
         }

         if (!this.dQ().B) {
            if (this.go().isEmpty()) {
               return bqq.c;
            }

            this.f($$0);
            this.a($$0, this.O_(), 1);
         }

         return bqq.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gt() {
      if (this.dQ().J().b(cpl.c)) {
         this.gw();
      } else {
         cmm.g[] $$0 = (cmm.g[])cmm.b.get(1);
         cmm.g[] $$1 = (cmm.g[])cmm.b.get(2);
         if ($$0 != null && $$1 != null) {
            dbt $$2 = this.go();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmm.g $$4 = $$1[$$3];
            dbs $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gw() {
      dbt $$0 = this.go();

      for (Pair<cmm.g[], Integer> $$1 : cmm.d) {
         cmm.g[] $$2 = (cmm.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.ce);
      if (this.cd != null) {
         $$0.a("wander_target", up.a(this.cd));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.ce = $$0.h("DespawnDelay");
      }

      up.a($$0, "wander_target").ifPresent($$0x -> this.cd = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dbs $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dQ().b(new btb(this.dQ(), this.dv(), this.dx() + 0.5, this.dB(), $$1));
      }
   }

   @Override
   protected avn v() {
      return this.gn() ? avo.BE : avo.Bw;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.BB;
   }

   @Override
   protected avn n_() {
      return avo.Bx;
   }

   @Override
   protected avn c(cuo $$0) {
      return $$0.a(cur.qE) ? avo.Bz : avo.BA;
   }

   @Override
   protected avn w(boolean $$0) {
      return $$0 ? avo.BF : avo.BC;
   }

   @Override
   public avn gq() {
      return avo.BF;
   }

   public void u(int $$0) {
      this.ce = $$0;
   }

   public int gv() {
      return this.ce;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dQ().B) {
         this.gx();
      }
   }

   private void gx() {
      if (this.ce > 0 && !this.gn() && --this.ce == 0) {
         this.aq();
      }
   }

   public void g(@Nullable jd $$0) {
      this.cd = $$0;
   }

   @Nullable
   jd gz() {
      return this.cd;
   }

   class a extends cak {
      final cmo a;
      final double b;
      final double c;

      a(final cmo $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public void e() {
         this.a.g(null);
         cmo.this.bT.n();
      }

      @Override
      public boolean b() {
         jd $$0 = this.a.gz();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jd $$0 = this.a.gz();
         if ($$0 != null && cmo.this.bT.l()) {
            if (this.a($$0, 10.0)) {
               eww $$1 = new eww((double)$$0.u() - this.a.dv(), (double)$$0.v() - this.a.dx(), (double)$$0.w() - this.a.dB()).d();
               eww $$2 = $$1.a(10.0).b(this.a.dv(), this.a.dx(), this.a.dB());
               cmo.this.bT.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cmo.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jd $$0, double $$1) {
         return !$$0.a(this.a.do(), $$1);
      }
   }
}
