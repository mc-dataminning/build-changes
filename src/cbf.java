import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbf extends cau {
   private static final int bV = 5;
   @Nullable
   private gu bW;
   private int bX;

   public cbf(bim<? extends cbf> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpn(this));
      this.bO.a(0, new bre<>(this, ckw.a(new cix(cja.rv), ckx.i), aow.zn, $$0 -> this.dK().O() && !$$0.cd()));
      this.bO.a(0, new bre<>(this, new cix(cja.pQ), aow.zs, $$0 -> this.dK().N() && $$0.cd()));
      this.bO.a(1, new brc(this));
      this.bO.a(1, new bpa<>(this, bzt.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpa<>(this, byt.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpa<>(this, bzp.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpa<>(this, bzo.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpa<>(this, bzd.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bpa<>(this, byy.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpa<>(this, bzs.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bqm(this, 0.5));
      this.bO.a(1, new bqc(this));
      this.bO.a(2, new cbf.a(this, 2.0, 0.35));
      this.bO.a(4, new bqh(this, 0.35));
      this.bO.a(8, new brg(this, 0.35));
      this.bO.a(9, new bpw(this, cbm.class, 3.0F, 1.0F));
      this.bO.a(10, new bqb(this, bja.class, 8.0F));
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return null;
   }

   @Override
   public boolean gd() {
      return false;
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if (!$$2.a(cja.sR) && this.bv() && !this.gb() && !this.i_()) {
         if ($$1 == bgp.a) {
            $$0.a(apg.S);
         }

         if (this.gc().isEmpty()) {
            return bgq.a(this.dK().B);
         } else {
            if (!this.dK().B) {
               this.f($$0);
               this.a($$0, this.H_(), 1);
            }

            return bgq.a(this.dK().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gh() {
      if (this.dK().G().b(cdw.c)) {
         this.gk();
      } else {
         cbd.f[] $$0 = (cbd.f[])cbd.b.get(1);
         cbd.f[] $$1 = (cbd.f[])cbd.b.get(2);
         if ($$0 != null && $$1 != null) {
            coj $$2 = this.gc();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cbd.f $$4 = $$1[$$3];
            coi $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gk() {
      coj $$0 = this.gc();

      for (Pair<cbd.f[], Integer> $$1 : cbd.d) {
         cbd.f[] $$2 = (cbd.f[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", rd.a(this.bW));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = rd.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(coi $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dK().b(new bio(this.dK(), this.dp(), this.dr() + 0.5, this.dv(), $$1));
      }
   }

   @Override
   protected aov r() {
      return this.gb() ? aow.zt : aow.zl;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.zq;
   }

   @Override
   protected aov h_() {
      return aow.zm;
   }

   @Override
   protected aov c(cix $$0) {
      return $$0.a(cja.pQ) ? aow.zo : aow.zp;
   }

   @Override
   protected aov w(boolean $$0) {
      return $$0 ? aow.zu : aow.zr;
   }

   @Override
   public aov ge() {
      return aow.zu;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gj() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.gl();
      }
   }

   private void gl() {
      if (this.bX > 0 && !this.gb() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable gu $$0) {
      this.bW = $$0;
   }

   @Nullable
   gu gn() {
      return this.bW;
   }

   class a extends bpt {
      final cbf a;
      final double b;
      final double c;

      a(cbf $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cbf.this.bN.n();
      }

      @Override
      public boolean a() {
         gu $$0 = this.a.gn();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gu $$0 = this.a.gn();
         if ($$0 != null && cbf.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ehd $$1 = new ehd((double)$$0.u() - this.a.dp(), (double)$$0.v() - this.a.dr(), (double)$$0.w() - this.a.dv()).d();
               ehd $$2 = $$1.a(10.0).b(this.a.dp(), this.a.dr(), this.a.dv());
               cbf.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cbf.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gu $$0, double $$1) {
         return !$$0.a(this.a.di(), $$1);
      }
   }
}
