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

public class ccq extends cba implements dlp {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final afm<Integer> cd = afp.a(ccq.class, afo.b);
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
   public bke b = new bke();
   public bke c = new bke();
   public bke d = new bke();
   public bke e = new bke();
   public bke bT = new bke();
   public bke bU = new bke();
   private final dld<dlp.b> cw;
   private final dlp.d cx;
   private dlp.a cy;
   ccp cz = new ccp(this::a, Collections.emptyList());

   public ccq(bkm<? extends cba> $$0, crs $$1) {
      super($$0, $$1);
      this.cx = new ccq.a();
      this.cy = new dlp.a();
      this.cw = new dld<>(new dlp.b(this));
      this.bJ = 5;
      this.L().a(true);
      this.a(ecr.m, 0.0F);
      this.a(ecr.q, 8.0F);
      this.a(ecr.f, 8.0F);
      this.a(ecr.i, 8.0F);
      this.a(ecr.o, 0.0F);
      this.a(ecr.n, 0.0F);
   }

   @Override
   public wk<yd> di() {
      return new ye(this, this.c(blk.n) ? 1 : 0);
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(blk.n);
      }
   }

   @Override
   public boolean a(crv $$0) {
      return super.a($$0) && $$0.a(this, this.ag().n().a(this.dj()));
   }

   @Override
   public float a(ht $$0, crv $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bjg $$0) {
      return this.gi() && !$$0.a(are.d) ? true : super.b($$0);
   }

   boolean gi() {
      return this.c(blk.o) || this.c(blk.n);
   }

   @Override
   protected boolean o(bki $$0) {
      return false;
   }

   @Override
   public boolean fG() {
      return true;
   }

   @Override
   protected float aK() {
      return this.Z + 0.55F;
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 500.0).a(bme.m, 0.3F).a(bme.i, 1.0).a(bme.d, 1.5).a(bme.c, 30.0);
   }

   @Override
   public boolean aV() {
      return true;
   }

   @Override
   protected float eV() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected aqm w() {
      return !this.c(blk.l) && !this.gi() ? this.y().b() : null;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.zH;
   }

   @Override
   protected aqm m_() {
      return aqn.zD;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.zR, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bki $$0) {
      this.dL().a(this, (byte)4);
      this.a(aqn.zC, 10.0F, this.eW());
      bqo.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cd, 0);
   }

   public int t() {
      return this.an.b(cd);
   }

   private void gl() {
      this.an.b(cd, this.go());
   }

   @Override
   public void l() {
      if (this.dL() instanceof ama $$0) {
         dlp.c.a($$0, this.cy, this.cx);
         if (this.fL() || this.U()) {
            ccr.a((bky)this);
         }
      }

      super.l();
      if (this.dL().x_()) {
         if (this.ah % this.gm() == 0) {
            this.cu = 10;
            if (!this.aS()) {
               this.dL().a(this.dq(), this.ds(), this.dw(), aqn.zG, this.da(), 5.0F, this.eW(), false);
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

         switch (this.an()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void X() {
      ama $$0 = (ama)this.dL();
      $$0.ad().a("wardenBrain");
      this.dN().a($$0, this);
      this.dL().ad().c();
      super.X();
      if ((this.ah + this.ah()) % 120 == 0) {
         a($$0, this.dj(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gl();
      }

      ccr.a(this);
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

   private int gm() {
      float $$0 = (float)this.t() / (float)cco.c.a();
      return 40 - ati.d(ati.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return ati.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return ati.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bke $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ato $$1 = this.ef();
         dgw $$2 = this.bi();
         if ($$2.l() != day.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dq() + (double)ati.b($$1, -0.7F, 0.7F);
               double $$5 = this.ds();
               double $$6 = this.dw() + (double)ati.b($$1, -0.7F, 0.7F);
               this.dL().a(new jk(js.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(afm<?> $$0) {
      if (as.equals($$0)) {
         switch (this.an()) {
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
   public boolean cL() {
      return this.gi();
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return ccr.a(this, $$0);
   }

   @Override
   public bly<ccq> dN() {
      return (bly<ccq>)super.dN();
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   public void a(BiConsumer<dld<?>, ama> $$0) {
      if (this.dL() instanceof ama $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bki $$0) {
      if ($$0 instanceof bky $$1
         && this.dL() == $$0.dL()
         && bkl.e.test($$0)
         && !this.s($$0)
         && $$1.ag() != bkm.d
         && $$1.ag() != bkm.bi
         && !$$1.cq()
         && !$$1.ev()
         && this.dL().C_().a($$1.cG())) {
         return true;
      }

      return false;
   }

   public static void a(ama $$0, eji $$1, @Nullable bki $$2, int $$3) {
      bjv $$4 = new bjv(bjx.G, 260, 0, false, false);
      bjw.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      ccp.a(this::a).encodeStart(sn.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dlp.a.a.encodeStart(sn.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         ccp.a(this::a).parse(new Dynamic(sn.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gl();
      }

      if ($$0.b("listener", 10)) {
         dlp.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gn() {
      if (!this.c(blk.l)) {
         this.a(this.y().c(), 10.0F, this.eW());
      }
   }

   public cco y() {
      return cco.a(this.go());
   }

   private int go() {
      return this.cz.b(this.q());
   }

   public void b(bki $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable bki $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bki $$0, int $$1, boolean $$2) {
      if (!this.fU() && this.a($$0)) {
         ccr.a((bky)this);
         boolean $$3 = !(this.dN().c(btz.o).orElse(null) instanceof cdm);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cdm && $$3 && cco.a($$4).d()) {
            this.dN().b(btz.o);
         }

         if ($$2) {
            this.gn();
         }
      }
   }

   public Optional<bky> ge() {
      return this.y().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bky q() {
      return this.dN().c(btz.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.dN().a(btz.aD, auj.a, 1200L);
      if ($$2 == blc.k) {
         this.b(blk.n);
         this.dN().a(btz.aB, auj.a, (long)ccr.a);
         this.a(aqn.zz, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dL().B && !this.fU() && !this.gi()) {
         bki $$3 = $$0.d();
         this.a($$3, cco.c.a() + 20, false);
         if (this.bz.c(btz.o).isEmpty() && $$3 instanceof bky $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bky $$0) {
      this.dN().b(btz.ax);
      this.dN().a(btz.o, $$0);
      this.dN().b(btz.E);
      bqo.a(this, 200);
   }

   @Override
   public bkj a(blk $$0) {
      bkj $$1 = super.a($$0);
      return this.gi() ? bkj.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bs() {
      return !this.gi() && super.bs();
   }

   @Override
   protected void D(bki $$0) {
      if (!this.fU() && !this.dN().a(btz.aG)) {
         this.dN().a(btz.aG, auj.a, 20L);
         this.c($$0);
         ccr.a(this, $$0.dl());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public ccp gf() {
      return this.cz;
   }

   @Override
   protected buh b(crs $$0) {
      return new bug(this, $$0) {
         @Override
         protected ecx a(int $$0) {
            this.o = new eda();
            this.o.a(true);
            return new ecx(this.o, $$0) {
               @Override
               protected float a(ect $$0, ect $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dlp.a gg() {
      return this.cy;
   }

   @Override
   public dlp.d gh() {
      return this.cx;
   }

   class a implements dlp.d {
      private static final int b = 16;
      private final dlk c = new dle(ccq.this, ccq.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dlk b() {
         return this.c;
      }

      @Override
      public arr<dlg> c() {
         return ari.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ama $$0, ht $$1, dlg $$2, dlg.a $$3) {
         if (!ccq.this.fU() && !ccq.this.ev() && !ccq.this.dN().a(btz.aH) && !ccq.this.gi() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bky $$4 && !ccq.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ama $$0, ht $$1, dlg $$2, @Nullable bki $$3, @Nullable bki $$4, float $$5) {
         if (!ccq.this.ev()) {
            ccq.this.bz.a(btz.aH, auj.a, 40L);
            $$0.a(ccq.this, (byte)61);
            ccq.this.a(aqn.zS, 5.0F, ccq.this.eW());
            ht $$6 = $$1;
            if ($$4 != null) {
               if (ccq.this.a($$4, 30.0)) {
                  if (ccq.this.dN().a(btz.az)) {
                     if (ccq.this.a($$4)) {
                        $$6 = $$4.dl();
                     }

                     ccq.this.c($$4);
                  } else {
                     ccq.this.a($$4, 10, true);
                  }
               }

               ccq.this.dN().a(btz.az, auj.a, 100L);
            } else {
               ccq.this.c($$3);
            }

            if (!ccq.this.y().d()) {
               Optional<bky> $$7 = ccq.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  ccr.a(ccq.this, $$6);
               }
            }
         }
      }
   }
}
