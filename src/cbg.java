import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbg extends cav {
   private static final int bV = 5;
   @Nullable
   private gu bW;
   private int bX;

   public cbg(bim<? extends cbg> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpo(this));
      this.bO.a(0, new brf<>(this, ckx.a(new ciy(cjb.rv), cky.i), aow.zi, $$0 -> this.dK().O() && !$$0.cd()));
      this.bO.a(0, new brf<>(this, new ciy(cjb.pQ), aow.zn, $$0 -> this.dK().N() && $$0.cd()));
      this.bO.a(1, new brd(this));
      this.bO.a(1, new bpb<>(this, bzu.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpb<>(this, byu.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpb<>(this, bzq.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpb<>(this, bzp.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpb<>(this, bze.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bpb<>(this, byz.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpb<>(this, bzt.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bqn(this, 0.5));
      this.bO.a(1, new bqd(this));
      this.bO.a(2, new cbg.a(this, 2.0, 0.35));
      this.bO.a(4, new bqi(this, 0.35));
      this.bO.a(8, new brh(this, 0.35));
      this.bO.a(9, new bpx(this, cbn.class, 3.0F, 1.0F));
      this.bO.a(10, new bqc(this, bja.class, 8.0F));
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return null;
   }

   @Override
   public boolean gc() {
      return false;
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if (!$$2.a(cjb.sR) && this.bv() && !this.ga() && !this.i_()) {
         if ($$1 == bgp.a) {
            $$0.a(apg.S);
         }

         if (this.gb().isEmpty()) {
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
   protected void gg() {
      if (this.dK().G().b(cdx.c)) {
         this.gj();
      } else {
         cbe.f[] $$0 = (cbe.f[])cbe.b.get(1);
         cbe.f[] $$1 = (cbe.f[])cbe.b.get(2);
         if ($$0 != null && $$1 != null) {
            cok $$2 = this.gb();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cbe.f $$4 = $$1[$$3];
            coj $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gj() {
      cok $$0 = this.gb();

      for (Pair<cbe.f[], Integer> $$1 : cbe.d) {
         cbe.f[] $$2 = (cbe.f[])$$1.getLeft();
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
   protected void b(coj $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dK().b(new bio(this.dK(), this.dp(), this.dr() + 0.5, this.dv(), $$1));
      }
   }

   @Override
   protected aov r() {
      return this.ga() ? aow.zo : aow.zg;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.zl;
   }

   @Override
   protected aov h_() {
      return aow.zh;
   }

   @Override
   protected aov c(ciy $$0) {
      return $$0.a(cjb.pQ) ? aow.zj : aow.zk;
   }

   @Override
   protected aov w(boolean $$0) {
      return $$0 ? aow.zp : aow.zm;
   }

   @Override
   public aov gd() {
      return aow.zp;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gi() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.gk();
      }
   }

   private void gk() {
      if (this.bX > 0 && !this.ga() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable gu $$0) {
      this.bW = $$0;
   }

   @Nullable
   gu gm() {
      return this.bW;
   }

   class a extends bpu {
      final cbg a;
      final double b;
      final double c;

      a(cbg $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cbg.this.bN.n();
      }

      @Override
      public boolean a() {
         gu $$0 = this.a.gm();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gu $$0 = this.a.gm();
         if ($$0 != null && cbg.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ehe $$1 = new ehe((double)$$0.u() - this.a.dp(), (double)$$0.v() - this.a.dr(), (double)$$0.w() - this.a.dv()).d();
               ehe $$2 = $$1.a(10.0).b(this.a.dp(), this.a.dr(), this.a.dv());
               cbg.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cbg.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gu $$0, double $$1) {
         return !$$0.a(this.a.di(), $$1);
      }
   }
}
