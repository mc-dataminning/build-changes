import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cpv extends cnt implements eex {
   private static final Logger bH = LogUtils.getLogger();
   private static final int bI = 40;
   private static final int bJ = 200;
   private static final int bK = 500;
   private static final float bL = 0.3F;
   private static final float bM = 1.0F;
   private static final float bN = 1.5F;
   private static final int bO = 30;
   private static final int bP = 24;
   private static final akh<Integer> bQ = akl.a(cpv.class, akj.b);
   private static final int bR = 200;
   private static final int bS = 260;
   private static final int bT = 20;
   private static final int bU = 120;
   private static final int bV = 20;
   private static final int bW = 35;
   private static final int bX = 10;
   private static final int bY = 20;
   private static final int bZ = 100;
   private static final int ca = 20;
   private static final int cb = 30;
   private static final float cc = 4.5F;
   private static final float cd = 0.7F;
   private static final int ce = 30;
   private int cf;
   private int cg;
   private int ch;
   private int ci;
   public bvr a = new bvr();
   public bvr b = new bvr();
   public bvr c = new bvr();
   public bvr d = new bvr();
   public bvr bF = new bvr();
   public bvr bG = new bvr();
   private final eel<eex.b> cj;
   private final eex.d ck;
   private eex.a cl;
   cpu cm = new cpu(this::b, Collections.emptyList());

   public cpv(bwj<? extends cnt> $$0, dip $$1) {
      super($$0, $$1);
      this.ck = new cpv.a();
      this.cl = new eex.a();
      this.cj = new eel<>(new eex.b(this));
      this.bx = 5;
      this.O().a(true);
      this.a(ewm.m, 0.0F);
      this.a(ewm.q, 8.0F);
      this.a(ewm.f, 8.0F);
      this.a(ewm.i, 8.0F);
      this.a(ewm.o, 0.0F);
      this.a(ewm.n, 0.0F);
   }

   @Override
   public zd<abs> a(arm $$0) {
      return new abt(this, $$0, this.c(bxl.n) ? 1 : 0);
   }

   @Override
   public void a(abt $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bxl.n);
      }
   }

   @Override
   public boolean a(dis $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(aro $$0, bup $$1) {
      return this.gr() && !$$1.a(axb.d) ? true : super.a($$0, $$1);
   }

   boolean gr() {
      return this.c(bxl.o) || this.c(bxl.n);
   }

   @Override
   protected boolean o(bwa $$0) {
      return false;
   }

   @Override
   public float fT() {
      return 5.0F;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bye.a j() {
      return cnt.gt().a(byf.s, 500.0).a(byf.v, 0.3F).a(byf.p, 1.0).a(byf.d, 1.5).a(byf.c, 30.0).a(byf.m, 24.0);
   }

   @Override
   public boolean bh() {
      return true;
   }

   @Override
   protected float fd() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awk u() {
      return !this.c(bxl.l) && !this.gr() ? this.n().b() : null;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.CM;
   }

   @Override
   protected awk l_() {
      return awl.CI;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.CW, 10.0F, 1.0F);
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      $$0.a(this, (byte)4);
      this.a(awl.CH, 10.0F, this.fe());
      ccq.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   public int m() {
      return this.al.a(bQ);
   }

   private void gu() {
      this.al.a(bQ, this.gx());
   }

   @Override
   public void h() {
      if (this.dV() instanceof aro $$0) {
         eex.c.a($$0, this.cl, this.ck);
         if (this.fZ() || this.Z()) {
            cpw.a((bwz)this);
         }
      }

      super.h();
      if (this.dV().w_()) {
         if (this.af % this.gv() == 0) {
            this.ch = 10;
            if (!this.bb()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awl.CL, this.dm(), 5.0F, this.fe(), false);
            }
         }

         this.cg = this.cf;
         if (this.cf > 0) {
            this.cf--;
         }

         this.ci = this.ch;
         if (this.ch > 0) {
            this.ch--;
         }

         switch (this.aw()) {
            case n:
               this.a(this.c);
               break;
            case o:
               this.a(this.d);
         }
      }
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("wardenBrain");
      this.eb().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.dt(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cm.a($$0, this::b);
         this.gu();
      }

      cpw.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bF.a(this.af);
      } else if ($$0 == 61) {
         this.cf = 10;
      } else if ($$0 == 62) {
         this.bG.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gv() {
      float $$0 = (float)this.m() / (float)cpt.c.a();
      return 40 - azk.d(azk.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azk.h($$0, (float)this.cg, (float)this.cf) / 10.0F;
   }

   public float K(float $$0) {
      return azk.h($$0, (float)this.ci, (float)this.ch) / 10.0F;
   }

   private void a(bvr $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azt $$1 = this.dY();
         dzo $$2 = this.bt();
         if ($$2.o() != dsf.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azk.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azk.b($$1, -0.7F, 0.7F);
               this.dV().a(new lp(lx.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
      if (aq.equals($$0)) {
         switch (this.aw()) {
            case n:
               this.c.a(this.af);
               break;
            case o:
               this.d.a(this.af);
               break;
            case l:
               this.a.a(this.af);
               break;
            case m:
               this.b.a(this.af);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dii $$0) {
      return this.gr();
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cpw.a(this, $$0);
   }

   @Override
   public bxz<cpv> eb() {
      return (bxz<cpv>)super.eb();
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public void a(BiConsumer<eel<?>, aro> $$0) {
      if (this.dV() instanceof aro $$1) {
         $$0.accept(this.cj, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bwa $$0) {
      if ($$0 instanceof bwz $$1
         && this.dV() == $$0.dV()
         && bwh.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bwj.f
         && $$1.aq() != bwj.bG
         && !$$1.cC()
         && !$$1.eG()
         && this.dV().A_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(aro $$0, fdw $$1, @Nullable bwa $$2, int $$3) {
      bve $$4 = new bve(bvg.G, 260, 0, false, false);
      bvf.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      alc<uu> $$1 = this.dX().a(ul.a);
      cpu.a(this::b)
         .encodeStart($$1, this.cm)
         .resultOrPartial($$0x -> bH.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      eex.a.a
         .encodeStart($$1, this.cl)
         .resultOrPartial($$0x -> bH.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      alc<uu> $$1 = this.dX().a(ul.a);
      if ($$0.e("anger")) {
         cpu.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> bH.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cm = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         eex.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bH.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cl = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bxl.l)) {
         this.a(this.n().c(), 10.0F, this.fe());
      }
   }

   public cpt n() {
      return cpt.a(this.gx());
   }

   private int gx() {
      return this.cm.b(this.f());
   }

   @Override
   public void c(bwa $$0) {
      this.cm.a($$0);
   }

   public void d(@Nullable bwa $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bwa $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         cpw.a((bwz)this);
         boolean $$3 = !(this.f() instanceof cqs);
         int $$4 = this.cm.a($$0, $$1);
         if ($$0 instanceof cqs && $$3 && cpt.a($$4).d()) {
            this.eb().b(cgb.p);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bwz> q() {
      return this.n().d() ? this.cm.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bwz f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.eb().a(cgb.aF, bas.a, 1200L);
      if ($$2 == bwi.k) {
         this.b(bxl.n);
         this.eb().a(cgb.aD, bas.a, (long)cpw.a);
         this.a(awl.CE, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gf() && !this.gr()) {
         bwa $$4 = $$1.d();
         this.a($$4, cpt.c.a() + 20, false);
         if (this.bs.c(cgb.p).isEmpty() && $$4 instanceof bwz $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(bwz $$0) {
      this.eb().b(cgb.az);
      this.eb().a(cgb.p, $$0);
      this.eb().b(cgb.F);
      ccq.a(this, 200);
   }

   @Override
   public bwd e(bxl $$0) {
      bwd $$1 = super.e($$0);
      return this.gr() ? bwd.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bH() {
      return !this.gr() && super.bH();
   }

   @Override
   protected void D(bwa $$0) {
      if (!this.gf() && !this.eb().a(cgb.aI)) {
         this.eb().a(cgb.aI, bas.a, 20L);
         this.d($$0);
         cpw.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cpu t() {
      return this.cm;
   }

   @Override
   protected cgj b(dip $$0) {
      return new cgi(this, $$0) {
         @Override
         protected ewl a(int $$0) {
            this.o = new ewr();
            return new ewl(this.o, $$0) {
               @Override
               protected float a(ewh $$0, ewh $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public eex.a x() {
      return this.cl;
   }

   @Override
   public eex.d gq() {
      return this.ck;
   }

   class a implements eex.d {
      private static final int b = 16;
      private final ees c = new eem(cpv.this, cpv.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ees b() {
         return this.c;
      }

      @Override
      public axp<eeo> c() {
         return axg.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aro $$0, iu $$1, je<eeo> $$2, eeo.a $$3) {
         if (!cpv.this.gf() && !cpv.this.eG() && !cpv.this.eb().a(cgb.aJ) && !cpv.this.gr() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof bwz $$4 && !cpv.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aro $$0, iu $$1, je<eeo> $$2, @Nullable bwa $$3, @Nullable bwa $$4, float $$5) {
         if (!cpv.this.eG()) {
            cpv.this.bs.a(cgb.aJ, bas.a, 40L);
            $$0.a(cpv.this, (byte)61);
            cpv.this.a(awl.CX, 5.0F, cpv.this.fe());
            iu $$6 = $$1;
            if ($$4 != null) {
               if (cpv.this.a($$4, 30.0)) {
                  if (cpv.this.eb().a(cgb.aB)) {
                     if (cpv.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cpv.this.d($$4);
                  } else {
                     cpv.this.a($$4, 10, true);
                  }
               }

               cpv.this.eb().a(cgb.aB, bas.a, 100L);
            } else {
               cpv.this.d($$3);
            }

            if (!cpv.this.n().d()) {
               Optional<bwz> $$7 = cpv.this.cm.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cpw.a(cpv.this, $$6);
               }
            }
         }
      }
   }
}
