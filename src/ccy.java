import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class ccy extends cbi implements dmb {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final afo<Integer> cd = afr.a(ccy.class, afq.b);
   private static final int ce = 200;
   private static final int cf = 260;
   private static final int cg = 20;
   private static final int ch = 120;
   private static final int ci = 20;
   private static final int cj = 35;
   private static final int ck = 10;
   private static final int cl = 20;
   private static final int cm = 100;
   private static final int cn = 20;
   private static final int co = 30;
   private static final float cp = 4.5F;
   private static final float cq = 0.7F;
   private static final int cr = 30;
   private int cs;
   private int ct;
   private int cu;
   private int cv;
   public bkm b = new bkm();
   public bkm c = new bkm();
   public bkm d = new bkm();
   public bkm e = new bkm();
   public bkm bT = new bkm();
   public bkm bU = new bkm();
   private final dlp<dmb.b> cw;
   private final dmb.d cx;
   private dmb.a cy;
   ccx cz = new ccx(this::a, Collections.emptyList());

   public ccy(bku<? extends cbi> $$0, csa $$1) {
      super($$0, $$1);
      this.cx = new ccy.a();
      this.cy = new dmb.a();
      this.cw = new dlp<>(new dmb.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(edd.m, 0.0F);
      this.a(edd.q, 8.0F);
      this.a(edd.f, 8.0F);
      this.a(edd.i, 8.0F);
      this.a(edd.o, 0.0F);
      this.a(edd.n, 0.0F);
   }

   @Override
   public wk<yd> dk() {
      return new ye(this, this.c(bls.n) ? 1 : 0);
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bls.n);
      }
   }

   @Override
   public boolean a(csd $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dl()));
   }

   @Override
   public float a(ht $$0, csd $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bjo $$0) {
      return this.gj() && !$$0.a(ari.d) ? true : super.b($$0);
   }

   boolean gj() {
      return this.c(bls.o) || this.c(bls.n);
   }

   @Override
   protected boolean o(bkq $$0) {
      return false;
   }

   @Override
   public boolean fH() {
      return true;
   }

   @Override
   protected float aM() {
      return this.Z + 0.55F;
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 500.0).a(bmm.m, 0.3F).a(bmm.i, 1.0).a(bmm.d, 1.5).a(bmm.c, 30.0);
   }

   @Override
   public boolean aX() {
      return true;
   }

   @Override
   protected float eX() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected aqq y() {
      return !this.c(bls.l) && !this.gj() ? this.A().b() : null;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.Ai;
   }

   @Override
   protected aqq m_() {
      return aqr.Ae;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.As, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bkq $$0) {
      this.dN().a(this, (byte)4);
      this.a(aqr.Ad, 10.0F, this.eY());
      bqw.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cd, 0);
   }

   public int w() {
      return this.an.b(cd);
   }

   private void gm() {
      this.an.b(cd, this.gp());
   }

   @Override
   public void l() {
      if (this.dN() instanceof ame $$0) {
         dmb.c.a($$0, this.cy, this.cx);
         if (this.fM() || this.W()) {
            ccz.a((blg)this);
         }
      }

      super.l();
      if (this.dN().x_()) {
         if (this.ah % this.gn() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dN().a(this.ds(), this.du(), this.dy(), aqr.Ah, this.dc(), 5.0F, this.eY(), false);
            }
         }

         this.ct = this.cs;
         if (this.cs > 0) {
            this.cs--;
         }

         this.cv = this.cu;
         if (this.cu > 0) {
            this.cu--;
         }

         switch (this.ap()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void Z() {
      ame $$0 = (ame)this.dN();
      $$0.ae().a("wardenBrain");
      this.dP().a($$0, this);
      this.dN().ae().c();
      super.Z();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dl(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gm();
      }

      ccz.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bT.a(this.ah);
      } else if ($$0 == 61) {
         this.cs = 10;
      } else if ($$0 == 62) {
         this.bU.a(this.ah);
      } else {
         super.b($$0);
      }
   }

   private int gn() {
      float $$0 = (float)this.w() / (float)ccw.c.a();
      return 40 - atm.d(atm.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return atm.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return atm.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bkm $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ats $$1 = this.eh();
         dhi $$2 = this.bk();
         if ($$2.l() != dbf.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.ds() + (double)atm.b($$1, -0.7F, 0.7F);
               double $$5 = this.du();
               double $$6 = this.dy() + (double)atm.b($$1, -0.7F, 0.7F);
               this.dN().a(new jk(js.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(afo<?> $$0) {
      if (as.equals($$0)) {
         switch (this.ap()) {
            case n:
               this.d.a(this.ah);
               break;
            case o:
               this.e.a(this.ah);
               break;
            case l:
               this.b.a(this.ah);
               break;
            case m:
               this.c.a(this.ah);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean cM() {
      return this.gj();
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return ccz.a(this, $$0);
   }

   @Override
   public bmg<ccy> dP() {
      return (bmg<ccy>)super.dP();
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   public void a(BiConsumer<dlp<?>, ame> $$0) {
      if (this.dN() instanceof ame $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bkq $$0) {
      if ($$0 instanceof blg $$1
         && this.dN() == $$0.dN()
         && bkt.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bku.d
         && $$1.ai() != bku.bi
         && !$$1.cr()
         && !$$1.ex()
         && this.dN().C_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(ame $$0, eju $$1, @Nullable bkq $$2, int $$3) {
      bkd $$4 = new bkd(bkf.G, 260, 0, false, false);
      bke.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      ccx.a(this::a).encodeStart(sn.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dmb.a.a.encodeStart(sn.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         ccx.a(this::a).parse(new Dynamic(sn.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gm();
      }

      if ($$0.b("listener", 10)) {
         dmb.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void go() {
      if (!this.c(bls.l)) {
         this.a(this.A().c(), 10.0F, this.eY());
      }
   }

   public ccw A() {
      return ccw.a(this.gp());
   }

   private int gp() {
      return this.cz.b(this.q());
   }

   public void b(bkq $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable bkq $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bkq $$0, int $$1, boolean $$2) {
      if (!this.fV() && this.a($$0)) {
         ccz.a((blg)this);
         boolean $$3 = !(this.dP().c(buh.o).orElse(null) instanceof cdu);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cdu && $$3 && ccw.a($$4).d()) {
            this.dP().b(buh.o);
         }

         if ($$2) {
            this.go();
         }
      }
   }

   public Optional<blg> gf() {
      return this.A().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public blg q() {
      return this.dP().c(buh.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.dP().a(buh.aD, auo.a, 1200L);
      if ($$2 == blk.k) {
         this.b(bls.n);
         this.dP().a(buh.aB, auo.a, (long)ccz.a);
         this.a(aqr.Aa, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dN().B && !this.fV() && !this.gj()) {
         bkq $$3 = $$0.d();
         this.a($$3, ccw.c.a() + 20, false);
         if (this.bz.c(buh.o).isEmpty() && $$3 instanceof blg $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(blg $$0) {
      this.dP().b(buh.ax);
      this.dP().a(buh.o, $$0);
      this.dP().b(buh.E);
      bqw.a(this, 200);
   }

   @Override
   public bkr a(bls $$0) {
      bkr $$1 = super.a($$0);
      return this.gj() ? bkr.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gj() && super.bu();
   }

   @Override
   protected void D(bkq $$0) {
      if (!this.fV() && !this.dP().a(buh.aG)) {
         this.dP().a(buh.aG, auo.a, 20L);
         this.c($$0);
         ccz.a(this, $$0.dn());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public ccx gg() {
      return this.cz;
   }

   @Override
   protected bup b(csa $$0) {
      return new buo(this, $$0) {
         @Override
         protected edj a(int $$0) {
            this.o = new edm();
            this.o.a(true);
            return new edj(this.o, $$0) {
               @Override
               protected float a(edf $$0, edf $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dmb.a gh() {
      return this.cy;
   }

   @Override
   public dmb.d gi() {
      return this.cx;
   }

   class a implements dmb.d {
      private static final int b = 16;
      private final dlw c = new dlq(ccy.this, ccy.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dlw b() {
         return this.c;
      }

      @Override
      public arv<dls> c() {
         return arm.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ame $$0, ht $$1, dls $$2, dls.a $$3) {
         if (!ccy.this.fV() && !ccy.this.ex() && !ccy.this.dP().a(buh.aH) && !ccy.this.gj() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof blg $$4 && !ccy.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ame $$0, ht $$1, dls $$2, @Nullable bkq $$3, @Nullable bkq $$4, float $$5) {
         if (!ccy.this.ex()) {
            ccy.this.bz.a(buh.aH, auo.a, 40L);
            $$0.a(ccy.this, (byte)61);
            ccy.this.a(aqr.At, 5.0F, ccy.this.eY());
            ht $$6 = $$1;
            if ($$4 != null) {
               if (ccy.this.a($$4, 30.0)) {
                  if (ccy.this.dP().a(buh.az)) {
                     if (ccy.this.a($$4)) {
                        $$6 = $$4.dn();
                     }

                     ccy.this.c($$4);
                  } else {
                     ccy.this.a($$4, 10, true);
                  }
               }

               ccy.this.dP().a(buh.az, auo.a, 100L);
            } else {
               ccy.this.c($$3);
            }

            if (!ccy.this.A().d()) {
               Optional<blg> $$7 = ccy.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  ccz.a(ccy.this, $$6);
               }
            }
         }
      }
   }
}
