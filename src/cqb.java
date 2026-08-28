import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class cqb extends cnz implements efi {
   private static final int bH = 40;
   private static final int bI = 200;
   private static final int bJ = 500;
   private static final float bK = 0.3F;
   private static final float bL = 1.0F;
   private static final float bM = 1.5F;
   private static final int bN = 30;
   private static final int bO = 24;
   private static final akj<Integer> bP = akn.a(cqb.class, akl.b);
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
   public bvu a = new bvu();
   public bvu b = new bvu();
   public bvu c = new bvu();
   public bvu d = new bvu();
   public bvu bF = new bvu();
   public bvu bG = new bvu();
   private final eew<efi.b> ci;
   private final efi.d cj;
   private efi.a ck;
   cqa cl = new cqa(this::b, Collections.emptyList());

   public cqb(bwm<? extends cnz> $$0, div $$1) {
      super($$0, $$1);
      this.cj = new cqb.a();
      this.ck = new efi.a();
      this.ci = new eew<>(new efi.b(this));
      this.bx = 5;
      this.O().a(true);
      this.a(ewx.m, 0.0F);
      this.a(ewx.q, 8.0F);
      this.a(ewx.f, 8.0F);
      this.a(ewx.i, 8.0F);
      this.a(ewx.o, 0.0F);
      this.a(ewx.n, 0.0F);
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, $$0, this.c(bxo.n) ? 1 : 0);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bxo.n);
      }
   }

   @Override
   public boolean a(diy $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(arq $$0, bus $$1) {
      return this.gr() && !$$1.a(axd.d) ? true : super.a($$0, $$1);
   }

   boolean gr() {
      return this.c(bxo.o) || this.c(bxo.n);
   }

   @Override
   protected boolean o(bwd $$0) {
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

   public static byh.a j() {
      return cnz.gt().a(byi.s, 500.0).a(byi.v, 0.3F).a(byi.p, 1.0).a(byi.d, 1.5).a(byi.c, 30.0).a(byi.m, 24.0);
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
   protected awm u() {
      return !this.c(bxo.l) && !this.gr() ? this.n().b() : null;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.CP;
   }

   @Override
   protected awm l_() {
      return awn.CL;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.CZ, 10.0F, 1.0F);
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      $$0.a(this, (byte)4);
      this.a(awn.CK, 10.0F, this.fe());
      cct.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
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
      if (this.dV() instanceof arq $$0) {
         efi.c.a($$0, this.ck, this.cj);
         if (this.fZ() || this.Z()) {
            cqc.a((bxc)this);
         }
      }

      super.h();
      if (this.dV().w_()) {
         if (this.af % this.gv() == 0) {
            this.cg = 10;
            if (!this.bb()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awn.CO, this.dm(), 5.0F, this.fe(), false);
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
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
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

      cqc.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bF.a(this.af);
      } else if ($$0 == 61) {
         this.ce = 10;
      } else if ($$0 == 62) {
         this.bG.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gv() {
      float $$0 = (float)this.m() / (float)cpz.c.a();
      return 40 - azm.d(azm.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.cf, (float)this.ce) / 10.0F;
   }

   public float K(float $$0) {
      return azm.h($$0, (float)this.ch, (float)this.cg) / 10.0F;
   }

   private void a(bvu $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azv $$1 = this.dY();
         dzz $$2 = this.bt();
         if ($$2.o() != dsm.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azm.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azm.b($$1, -0.7F, 0.7F);
               this.dV().a(new lp(lx.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
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
   public boolean a(dio $$0) {
      return this.gr();
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cqc.a(this, $$0);
   }

   @Override
   public byc<cqb> eb() {
      return (byc<cqb>)super.eb();
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void a(BiConsumer<eew<?>, arq> $$0) {
      if (this.dV() instanceof arq $$1) {
         $$0.accept(this.ci, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bwd $$0) {
      if ($$0 instanceof bxc $$1
         && this.dV() == $$0.dV()
         && bwk.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bwm.f
         && $$1.aq() != bwm.bG
         && !$$1.cC()
         && !$$1.eG()
         && this.dV().A_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(arq $$0, fei $$1, @Nullable bwd $$2, int $$3) {
      bvh $$4 = new bvh(bvj.G, 260, 0, false, false);
      bvi.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ale<uw> $$1 = this.dX().a(un.a);
      $$0.a("anger", cqa.a(this::b), $$1, this.cl);
      $$0.a("listener", efi.a.a, $$1, this.ck);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dX().a(un.a);
      this.cl = $$0.<cqa>a("anger", cqa.a(this::b), $$1).orElseGet(() -> new cqa(this::b, Collections.emptyList()));
      this.gu();
      this.ck = $$0.<efi.a>a("listener", efi.a.a, $$1).orElseGet(efi.a::new);
   }

   private void gw() {
      if (!this.c(bxo.l)) {
         this.a(this.n().c(), 10.0F, this.fe());
      }
   }

   public cpz n() {
      return cpz.a(this.gx());
   }

   private int gx() {
      return this.cl.b(this.f());
   }

   @Override
   public void c(bwd $$0) {
      this.cl.a($$0);
   }

   public void d(@Nullable bwd $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bwd $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         cqc.a((bxc)this);
         boolean $$3 = !(this.f() instanceof cqy);
         int $$4 = this.cl.a($$0, $$1);
         if ($$0 instanceof cqy && $$3 && cpz.a($$4).d()) {
            this.eb().b(cge.p);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bxc> q() {
      return this.n().d() ? this.cl.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bxc f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.eb().a(cge.aF, bau.a, 1200L);
      if ($$2 == bwl.k) {
         this.b(bxo.n);
         this.eb().a(cge.aD, bau.a, (long)cqc.a);
         this.a(awn.CH, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gf() && !this.gr()) {
         bwd $$4 = $$1.d();
         this.a($$4, cpz.c.a() + 20, false);
         if (this.bs.c(cge.p).isEmpty() && $$4 instanceof bxc $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(bxc $$0) {
      this.eb().b(cge.az);
      this.eb().a(cge.p, $$0);
      this.eb().b(cge.F);
      cct.a(this, 200);
   }

   @Override
   public bwg e(bxo $$0) {
      bwg $$1 = super.e($$0);
      return this.gr() ? bwg.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bH() {
      return !this.gr() && super.bH();
   }

   @Override
   protected void D(bwd $$0) {
      if (!this.gf() && !this.eb().a(cge.aI)) {
         this.eb().a(cge.aI, bau.a, 20L);
         this.d($$0);
         cqc.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cqa t() {
      return this.cl;
   }

   @Override
   protected cgm b(div $$0) {
      return new cgl(this, $$0) {
         @Override
         protected eww a(int $$0) {
            this.o = new exc();
            return new eww(this.o, $$0) {
               @Override
               protected float a(ews $$0, ews $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public efi.a x() {
      return this.ck;
   }

   @Override
   public efi.d gq() {
      return this.cj;
   }

   class a implements efi.d {
      private static final int b = 16;
      private final efd c = new eex(cqb.this, cqb.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public efd b() {
         return this.c;
      }

      @Override
      public axr<eez> c() {
         return axi.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<eez> $$2, eez.a $$3) {
         if (!cqb.this.gf() && !cqb.this.eG() && !cqb.this.eb().a(cge.aJ) && !cqb.this.gr() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof bxc $$4 && !cqb.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arq $$0, iu $$1, je<eez> $$2, @Nullable bwd $$3, @Nullable bwd $$4, float $$5) {
         if (!cqb.this.eG()) {
            cqb.this.bs.a(cge.aJ, bau.a, 40L);
            $$0.a(cqb.this, (byte)61);
            cqb.this.a(awn.Da, 5.0F, cqb.this.fe());
            iu $$6 = $$1;
            if ($$4 != null) {
               if (cqb.this.a($$4, 30.0)) {
                  if (cqb.this.eb().a(cge.aB)) {
                     if (cqb.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cqb.this.d($$4);
                  } else {
                     cqb.this.a($$4, 10, true);
                  }
               }

               cqb.this.eb().a(cge.aB, bau.a, 100L);
            } else {
               cqb.this.d($$3);
            }

            if (!cqb.this.n().d()) {
               Optional<bxc> $$7 = cqb.this.cl.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cqc.a(cqb.this, $$6);
               }
            }
         }
      }
   }
}
