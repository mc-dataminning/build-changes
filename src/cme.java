import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cme extends clt {
   private static final int cc = 5;
   @Nullable
   private ja cd;
   private int ce;

   public cme(bsn<? extends cme> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzu(this));
      this.bU.a(0, new cbl<>(this, cwe.a(cug.sk, cwf.g), avh.Bx, $$0 -> this.dR().S() && !$$0.cj()));
      this.bU.a(0, new cbl<>(this, new cud(cug.qE), avh.BC, $$0 -> this.dR().R() && $$0.cj()));
      this.bU.a(1, new cbj(this));
      this.bU.a(1, new bzh<>(this, ckk.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzh<>(this, cjk.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzh<>(this, ckg.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzh<>(this, ckf.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzh<>(this, cju.class, 15.0F, 0.5, 0.5));
      this.bU.a(1, new bzh<>(this, cjp.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzh<>(this, ckj.class, 10.0F, 0.5, 0.5));
      this.bU.a(1, new cat(this, 0.5));
      this.bU.a(1, new caj(this));
      this.bU.a(2, new cme.a(this, 2.0, 0.35));
      this.bU.a(4, new cao(this, 0.35));
      this.bU.a(8, new cbn(this, 0.35));
      this.bU.a(9, new cad(this, cml.class, 3.0F, 1.0F));
      this.bU.a(10, new cai(this, bte.class, 8.0F));
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      return null;
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (!$$2.a(cug.tJ) && this.bF() && !this.go() && !this.o_()) {
         if ($$1 == bqg.a) {
            $$0.a(avr.S);
         }

         if (!this.dR().B) {
            if (this.gp().isEmpty()) {
               return bqh.c;
            }

            this.f($$0);
            this.a($$0, this.O_(), 1);
         }

         return bqh.a(this.dR().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gu() {
      if (this.dR().J().b(cpb.c)) {
         this.gx();
      } else {
         cmc.g[] $$0 = (cmc.g[])cmc.b.get(1);
         cmc.g[] $$1 = (cmc.g[])cmc.b.get(2);
         if ($$0 != null && $$1 != null) {
            dbf $$2 = this.gp();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmc.g $$4 = $$1[$$3];
            dbe $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gx() {
      dbf $$0 = this.gp();

      for (Pair<cmc.g[], Integer> $$1 : cmc.d) {
         cmc.g[] $$2 = (cmc.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.ce);
      if (this.cd != null) {
         $$0.a("wander_target", um.a(this.cd));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.ce = $$0.h("DespawnDelay");
      }

      um.a($$0, "wander_target").ifPresent($$0x -> this.cd = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dbe $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dR().b(new bss(this.dR(), this.dw(), this.dy() + 0.5, this.dC(), $$1));
      }
   }

   @Override
   protected avg v() {
      return this.go() ? avh.BD : avh.Bv;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.BA;
   }

   @Override
   protected avg n_() {
      return avh.Bw;
   }

   @Override
   protected avg c(cud $$0) {
      return $$0.a(cug.qE) ? avh.By : avh.Bz;
   }

   @Override
   protected avg w(boolean $$0) {
      return $$0 ? avh.BE : avh.BB;
   }

   @Override
   public avg gr() {
      return avh.BE;
   }

   public void u(int $$0) {
      this.ce = $$0;
   }

   public int gw() {
      return this.ce;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dR().B) {
         this.gy();
      }
   }

   private void gy() {
      if (this.ce > 0 && !this.go() && --this.ce == 0) {
         this.aq();
      }
   }

   public void h(@Nullable ja $$0) {
      this.cd = $$0;
   }

   @Nullable
   ja gA() {
      return this.cd;
   }

   class a extends caa {
      final cme a;
      final double b;
      final double c;

      a(final cme $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public void d() {
         this.a.h(null);
         cme.this.bT.n();
      }

      @Override
      public boolean a() {
         ja $$0 = this.a.gA();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ja $$0 = this.a.gA();
         if ($$0 != null && cme.this.bT.l()) {
            if (this.a($$0, 10.0)) {
               ewh $$1 = new ewh((double)$$0.u() - this.a.dw(), (double)$$0.v() - this.a.dy(), (double)$$0.w() - this.a.dC()).d();
               ewh $$2 = $$1.a(10.0).b(this.a.dw(), this.a.dy(), this.a.dC());
               cme.this.bT.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cme.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ja $$0, double $$1) {
         return !$$0.a(this.a.dp(), $$1);
      }
   }
}
