import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cpl extends cnj implements edv {
   private static final Logger bG = LogUtils.getLogger();
   private static final int bH = 40;
   private static final int bI = 200;
   private static final int bJ = 500;
   private static final float bK = 0.3F;
   private static final float bL = 1.0F;
   private static final float bM = 1.5F;
   private static final int bN = 30;
   private static final int bO = 24;
   private static final akg<Integer> bP = akk.a(cpl.class, aki.b);
   private static final int bQ = 200;
   private static final int bR = 260;
   private static final int bS = 20;
   private static final int bT = 120;
   private static final int bU = 20;
   private static final int bV = 35;
   private static final int bW = 10;
   private static final int bX = 20;
   private static final int bY = 100;
   private static final int bZ = 20;
   private static final int ca = 30;
   private static final float cb = 4.5F;
   private static final float cc = 0.7F;
   private static final int cd = 30;
   private int ce;
   private int cf;
   private int cg;
   private int ch;
   public bvj a = new bvj();
   public bvj b = new bvj();
   public bvj c = new bvj();
   public bvj d = new bvj();
   public bvj bE = new bvj();
   public bvj bF = new bvj();
   private final edj<edv.b> ci;
   private final edv.d cj;
   private edv.a ck;
   cpk cl = new cpk(this::b, Collections.emptyList());

   public cpl(bwb<? extends cnj> $$0, dhp $$1) {
      super($$0, $$1);
      this.cj = new cpl.a();
      this.ck = new edv.a();
      this.ci = new edj<>(new edv.b(this));
      this.bw = 5;
      this.O().a(true);
      this.a(evk.m, 0.0F);
      this.a(evk.q, 8.0F);
      this.a(evk.f, 8.0F);
      this.a(evk.i, 8.0F);
      this.a(evk.o, 0.0F);
      this.a(evk.n, 0.0F);
   }

   @Override
   public zc<abr> a(arl $$0) {
      return new abs(this, $$0, this.c(bxd.n) ? 1 : 0);
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bxd.n);
      }
   }

   @Override
   public boolean a(dhs $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(arn $$0, buh $$1) {
      return this.gr() && !$$1.a(axb.d) ? true : super.a($$0, $$1);
   }

   boolean gr() {
      return this.c(bxd.o) || this.c(bxd.n);
   }

   @Override
   protected boolean o(bvs $$0) {
      return false;
   }

   @Override
   public boolean fT() {
      return true;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.s, 500.0).a(bxx.v, 0.3F).a(bxx.p, 1.0).a(bxx.d, 1.5).a(bxx.c, 30.0).a(bxx.m, 24.0);
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
   protected awj u() {
      return !this.c(bxd.l) && !this.gr() ? this.n().b() : null;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.CM;
   }

   @Override
   protected awj l_() {
      return awk.CI;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.CW, 10.0F, 1.0F);
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      $$0.a(this, (byte)4);
      this.a(awk.CH, 10.0F, this.fe());
      cci.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bP, 0);
   }

   public int m() {
      return this.al.a(bP);
   }

   private void gu() {
      this.al.a(bP, this.gx());
   }

   @Override
   public void h() {
      if (this.dV() instanceof arn $$0) {
         edv.c.a($$0, this.ck, this.cj);
         if (this.fZ() || this.Z()) {
            cpm.a((bwr)this);
         }
      }

      super.h();
      if (this.dV().w_()) {
         if (this.af % this.gv() == 0) {
            this.cg = 10;
            if (!this.bb()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awk.CL, this.dm(), 5.0F, this.fe(), false);
            }
         }

         this.cf = this.ce;
         if (this.ce > 0) {
            this.ce--;
         }

         this.ch = this.cg;
         if (this.cg > 0) {
            this.cg--;
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
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("wardenBrain");
      this.eb().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.dt(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cl.a($$0, this::b);
         this.gu();
      }

      cpm.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bE.a(this.af);
      } else if ($$0 == 61) {
         this.ce = 10;
      } else if ($$0 == 62) {
         this.bF.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gv() {
      float $$0 = (float)this.m() / (float)cpj.c.a();
      return 40 - azk.d(azk.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float K(float $$0) {
      return azk.h($$0, (float)this.cf, (float)this.ce) / 10.0F;
   }

   public float L(float $$0) {
      return azk.h($$0, (float)this.ch, (float)this.cg) / 10.0F;
   }

   private void a(bvj $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azs $$1 = this.dY();
         dym $$2 = this.bt();
         if ($$2.o() != drf.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azk.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azk.b($$1, -0.7F, 0.7F);
               this.dV().a(new ln(lv.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
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
   public boolean a(dhi $$0) {
      return this.gr();
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cpm.a(this, $$0);
   }

   @Override
   public bxr<cpl> eb() {
      return (bxr<cpl>)super.eb();
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public void a(BiConsumer<edj<?>, arn> $$0) {
      if (this.dV() instanceof arn $$1) {
         $$0.accept(this.ci, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bvs $$0) {
      if ($$0 instanceof bwr $$1
         && this.dV() == $$0.dV()
         && bvz.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bwb.f
         && $$1.aq() != bwb.bF
         && !$$1.cC()
         && !$$1.eG()
         && this.dV().A_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(arn $$0, fcu $$1, @Nullable bvs $$2, int $$3) {
      buw $$4 = new buw(buy.G, 260, 0, false, false);
      bux.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      alb<ut> $$1 = this.dX().a(uk.a);
      cpk.a(this::b)
         .encodeStart($$1, this.cl)
         .resultOrPartial($$0x -> bG.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      edv.a.a
         .encodeStart($$1, this.ck)
         .resultOrPartial($$0x -> bG.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      alb<ut> $$1 = this.dX().a(uk.a);
      if ($$0.e("anger")) {
         cpk.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> bG.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cl = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         edv.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bG.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.ck = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bxd.l)) {
         this.a(this.n().c(), 10.0F, this.fe());
      }
   }

   public cpj n() {
      return cpj.a(this.gx());
   }

   private int gx() {
      return this.cl.b(this.f());
   }

   @Override
   public void c(bvs $$0) {
      this.cl.a($$0);
   }

   public void d(@Nullable bvs $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bvs $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         cpm.a((bwr)this);
         boolean $$3 = !(this.f() instanceof cqi);
         int $$4 = this.cl.a($$0, $$1);
         if ($$0 instanceof cqi && $$3 && cpj.a($$4).d()) {
            this.eb().b(cft.p);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bwr> q() {
      return this.n().d() ? this.cl.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bwr f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.eb().a(cft.aF, baq.a, 1200L);
      if ($$2 == bwa.k) {
         this.b(bxd.n);
         this.eb().a(cft.aD, baq.a, (long)cpm.a);
         this.a(awk.CE, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gf() && !this.gr()) {
         bvs $$4 = $$1.d();
         this.a($$4, cpj.c.a() + 20, false);
         if (this.br.c(cft.p).isEmpty() && $$4 instanceof bwr $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bwr $$0) {
      this.eb().b(cft.az);
      this.eb().a(cft.p, $$0);
      this.eb().b(cft.F);
      cci.a(this, 200);
   }

   @Override
   public bvv e(bxd $$0) {
      bvv $$1 = super.e($$0);
      return this.gr() ? bvv.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bH() {
      return !this.gr() && super.bH();
   }

   @Override
   protected void D(bvs $$0) {
      if (!this.gf() && !this.eb().a(cft.aI)) {
         this.eb().a(cft.aI, baq.a, 20L);
         this.d($$0);
         cpm.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cpk t() {
      return this.cl;
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cga(this, $$0) {
         @Override
         protected evj a(int $$0) {
            this.o = new evp();
            return new evj(this.o, $$0) {
               @Override
               protected float a(evf $$0, evf $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public edv.a x() {
      return this.ck;
   }

   @Override
   public edv.d gq() {
      return this.cj;
   }

   class a implements edv.d {
      private static final int b = 16;
      private final edq c = new edk(cpl.this, cpl.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public edq b() {
         return this.c;
      }

      @Override
      public axp<edm> c() {
         return axg.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arn $$0, jj $$1, js<edm> $$2, edm.a $$3) {
         if (!cpl.this.gf() && !cpl.this.eG() && !cpl.this.eb().a(cft.aJ) && !cpl.this.gr() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof bwr $$4 && !cpl.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arn $$0, jj $$1, js<edm> $$2, @Nullable bvs $$3, @Nullable bvs $$4, float $$5) {
         if (!cpl.this.eG()) {
            cpl.this.br.a(cft.aJ, baq.a, 40L);
            $$0.a(cpl.this, (byte)61);
            cpl.this.a(awk.CX, 5.0F, cpl.this.fe());
            jj $$6 = $$1;
            if ($$4 != null) {
               if (cpl.this.a($$4, 30.0)) {
                  if (cpl.this.eb().a(cft.aB)) {
                     if (cpl.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cpl.this.d($$4);
                  } else {
                     cpl.this.a($$4, 10, true);
                  }
               }

               cpl.this.eb().a(cft.aB, baq.a, 100L);
            } else {
               cpl.this.d($$3);
            }

            if (!cpl.this.n().d()) {
               Optional<bwr> $$7 = cpl.this.cl.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cpm.a(cpl.this, $$6);
               }
            }
         }
      }
   }
}
