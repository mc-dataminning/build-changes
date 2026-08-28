import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cmd extends cls {
   private static final int cc = 5;
   @Nullable
   private ja cd;
   private int ce;

   public cmd(bsm<? extends cmd> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzt(this));
      this.bU.a(0, new cbk<>(this, cwd.a(cuf.sk, cwe.g), avh.Bx, $$0 -> this.dQ().S() && !$$0.ci()));
      this.bU.a(0, new cbk<>(this, new cuc(cuf.qE), avh.BC, $$0 -> this.dQ().R() && $$0.ci()));
      this.bU.a(1, new cbi(this));
      this.bU.a(1, new bzg<>(this, ckj.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzg<>(this, cjj.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzg<>(this, ckf.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzg<>(this, cke.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzg<>(this, cjt.class, 15.0F, 0.5, 0.5));
      this.bU.a(1, new bzg<>(this, cjo.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzg<>(this, cki.class, 10.0F, 0.5, 0.5));
      this.bU.a(1, new cas(this, 0.5));
      this.bU.a(1, new cai(this));
      this.bU.a(2, new cmd.a(this, 2.0, 0.35));
      this.bU.a(4, new can(this, 0.35));
      this.bU.a(8, new cbm(this, 0.35));
      this.bU.a(9, new cac(this, cmk.class, 3.0F, 1.0F));
      this.bU.a(10, new cah(this, btd.class, 8.0F));
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      return null;
   }

   @Override
   public boolean gr() {
      return false;
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if (!$$2.a(cuf.tJ) && this.bE() && !this.gp() && !this.p_()) {
         if ($$1 == bqf.a) {
            $$0.a(avr.S);
         }

         if (!this.dQ().B) {
            if (this.gq().isEmpty()) {
               return bqg.c;
            }

            this.f($$0);
            this.a($$0, this.O_(), 1);
         }

         return bqg.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gv() {
      if (this.dQ().J().b(cpa.c)) {
         this.gy();
      } else {
         cmb.g[] $$0 = (cmb.g[])cmb.b.get(1);
         cmb.g[] $$1 = (cmb.g[])cmb.b.get(2);
         if ($$0 != null && $$1 != null) {
            dbe $$2 = this.gq();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cmb.g $$4 = $$1[$$3];
            dbd $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gy() {
      dbe $$0 = this.gq();

      for (Pair<cmb.g[], Integer> $$1 : cmb.d) {
         cmb.g[] $$2 = (cmb.g[])$$1.getLeft();
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
   protected void b(dbd $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dQ().b(new bsr(this.dQ(), this.dv(), this.dx() + 0.5, this.dB(), $$1));
      }
   }

   @Override
   protected avg v() {
      return this.gp() ? avh.BD : avh.Bv;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.BA;
   }

   @Override
   protected avg o_() {
      return avh.Bw;
   }

   @Override
   protected avg c(cuc $$0) {
      return $$0.a(cuf.qE) ? avh.By : avh.Bz;
   }

   @Override
   protected avg w(boolean $$0) {
      return $$0 ? avh.BE : avh.BB;
   }

   @Override
   public avg gs() {
      return avh.BE;
   }

   public void u(int $$0) {
      this.ce = $$0;
   }

   public int gx() {
      return this.ce;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dQ().B) {
         this.gz();
      }
   }

   private void gz() {
      if (this.ce > 0 && !this.gp() && --this.ce == 0) {
         this.ap();
      }
   }

   public void h(@Nullable ja $$0) {
      this.cd = $$0;
   }

   @Nullable
   ja gB() {
      return this.cd;
   }

   class a extends bzz {
      final cmd a;
      final double b;
      final double c;

      a(final cmd $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public void d() {
         this.a.h(null);
         cmd.this.bT.n();
      }

      @Override
      public boolean a() {
         ja $$0 = this.a.gB();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ja $$0 = this.a.gB();
         if ($$0 != null && cmd.this.bT.l()) {
            if (this.a($$0, 10.0)) {
               ewf $$1 = new ewf((double)$$0.u() - this.a.dv(), (double)$$0.v() - this.a.dx(), (double)$$0.w() - this.a.dB()).d();
               ewf $$2 = $$1.a(10.0).b(this.a.dv(), this.a.dx(), this.a.dB());
               cmd.this.bT.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cmd.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ja $$0, double $$1) {
         return !$$0.a(this.a.do(), $$1);
      }
   }
}
