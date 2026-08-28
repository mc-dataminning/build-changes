import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class cqm extends cok implements efx {
   private static final int bI = 40;
   private static final int bJ = 200;
   private static final int bK = 500;
   private static final float bL = 0.3F;
   private static final float bM = 1.0F;
   private static final float bN = 1.5F;
   private static final int bO = 30;
   private static final int bP = 24;
   private static final akj<Integer> bQ = akn.a(cqm.class, akl.b);
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
   public bvz a = new bvz();
   public bvz b = new bvz();
   public bvz c = new bvz();
   public bvz d = new bvz();
   public bvz bG = new bvz();
   public bvz bH = new bvz();
   private final efl<efx.b> cj;
   private final efx.d ck;
   private efx.a cl;
   cql cm = new cql(this::b, Collections.emptyList());

   public cqm(bwr<? extends cok> $$0, djh $$1) {
      super($$0, $$1);
      this.ck = new cqm.a();
      this.cl = new efx.a();
      this.cj = new efl<>(new efx.b(this));
      this.by = 5;
      this.O().a(true);
      this.a(exm.m, 0.0F);
      this.a(exm.q, 8.0F);
      this.a(exm.f, 8.0F);
      this.a(exm.i, 8.0F);
      this.a(exm.o, 0.0F);
      this.a(exm.n, 0.0F);
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, $$0, this.c(bxv.n) ? 1 : 0);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bxv.n);
      }
   }

   @Override
   public boolean a(djk $$0) {
      return super.a($$0) && $$0.a(this, this.an().n().a(this.ds()));
   }

   @Override
   public float a(iv $$0, djk $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(arq $$0, bux $$1) {
      return this.gu() && !$$1.a(axd.d) ? true : super.a($$0, $$1);
   }

   boolean gu() {
      return this.c(bxv.o) || this.c(bxv.n);
   }

   @Override
   protected boolean o(bwi $$0) {
      return false;
   }

   @Override
   public float fT() {
      return 5.0F;
   }

   @Override
   protected float aS() {
      return this.X + 0.55F;
   }

   public static byo.a j() {
      return cok.gw().a(byp.s, 500.0).a(byp.v, 0.3F).a(byp.p, 1.0).a(byp.d, 1.5).a(byp.c, 30.0).a(byp.m, 24.0);
   }

   @Override
   public boolean bf() {
      return true;
   }

   @Override
   protected float fd() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awm u() {
      return !this.c(bxv.l) && !this.gu() ? this.n().b() : null;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.CS;
   }

   @Override
   protected awm l_() {
      return awn.CO;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.Dc, 10.0F, 1.0F);
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      $$0.a(this, (byte)4);
      this.a(awn.CN, 10.0F, this.fe());
      cda.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   public int m() {
      return this.al.a(bQ);
   }

   private void gx() {
      this.al.a(bQ, this.gA());
   }

   @Override
   public void h() {
      if (this.dU() instanceof arq $$0) {
         efx.c.a($$0, this.cl, this.ck);
         if (this.gc() || this.Z()) {
            cqn.a((bxj)this);
         }
      }

      super.h();
      if (this.dU().w_()) {
         if (this.af % this.gy() == 0) {
            this.ch = 10;
            if (!this.aZ()) {
               this.dU().a(this.dz(), this.dB(), this.dF(), awn.CR, this.dl(), 5.0F, this.fe(), false);
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

         switch (this.at()) {
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
      bqq $$1 = bqp.a();
      $$1.a("wardenBrain");
      this.eb().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ao()) % 120 == 0) {
         a($$0, this.ds(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cm.a($$0, this::b);
         this.gx();
      }

      cqn.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bG.a(this.af);
      } else if ($$0 == 61) {
         this.cf = 10;
      } else if ($$0 == 62) {
         this.bH.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gy() {
      float $$0 = (float)this.m() / (float)cqk.c.a();
      return 40 - azm.d(azm.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.cg, (float)this.cf) / 10.0F;
   }

   public float K(float $$0) {
      return azm.h($$0, (float)this.ci, (float)this.ch) / 10.0F;
   }

   private void a(bvz $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azv $$1 = this.dX();
         eao $$2 = this.br();
         if ($$2.o() != dsz.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dz() + (double)azm.b($$1, -0.7F, 0.7F);
               double $$5 = this.dB();
               double $$6 = this.dF() + (double)azm.b($$1, -0.7F, 0.7F);
               this.dU().a(new lq(ly.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (aq.equals($$0)) {
         switch (this.at()) {
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
   public boolean a(dja $$0) {
      return this.gu();
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cqn.a(this, $$0);
   }

   @Override
   public byj<cqm> eb() {
      return (byj<cqm>)super.eb();
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   public void a(BiConsumer<efl<?>, arq> $$0) {
      if (this.dU() instanceof arq $$1) {
         $$0.accept(this.cj, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bwi $$0) {
      if ($$0 instanceof bxj $$1
         && this.dU() == $$0.dU()
         && bwp.e.test($$0)
         && !this.s($$0)
         && $$1.an() != bwr.f
         && $$1.an() != bwr.bG
         && !$$1.cB()
         && !$$1.eG()
         && this.dU().A_().a($$1.cQ())) {
         return true;
      }

      return false;
   }

   public static void a(arq $$0, fex $$1, @Nullable bwi $$2, int $$3) {
      bvm $$4 = new bvm(bvo.G, 260, 0, false, false);
      bvn.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("anger", cql.a(this::b), $$1, this.cm);
      $$0.a("listener", efx.a.a, $$1, this.cl);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      this.cm = $$0.<cql>a("anger", cql.a(this::b), $$1).orElseGet(() -> new cql(this::b, Collections.emptyList()));
      this.gx();
      this.cl = $$0.<efx.a>a("listener", efx.a.a, $$1).orElseGet(efx.a::new);
   }

   private void gz() {
      if (!this.c(bxv.l)) {
         this.a(this.n().c(), 10.0F, this.fe());
      }
   }

   public cqk n() {
      return cqk.a(this.gA());
   }

   private int gA() {
      return this.cm.b(this.f());
   }

   @Override
   public void c(bwi $$0) {
      this.cm.a($$0);
   }

   public void d(@Nullable bwi $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bwi $$0, int $$1, boolean $$2) {
      if (!this.gi() && this.b($$0)) {
         cqn.a((bxj)this);
         boolean $$3 = !(this.f() instanceof crj);
         int $$4 = this.cm.a($$0, $$1);
         if ($$0 instanceof crj && $$3 && cqk.a($$4).d()) {
            this.eb().b(cgl.p);
         }

         if ($$2) {
            this.gz();
         }
      }
   }

   public Optional<bxj> q() {
      return this.n().d() ? this.cm.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bxj f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.eb().a(cgl.aF, bau.a, 1200L);
      if ($$2 == bwq.k) {
         this.b(bxv.n);
         this.eb().a(cgl.aD, bau.a, (long)cqn.a);
         this.a(awn.CK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gi() && !this.gu()) {
         bwi $$4 = $$1.d();
         this.a($$4, cqk.c.a() + 20, false);
         if (this.bs.c(cgl.p).isEmpty() && $$4 instanceof bxj $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(bxj $$0) {
      this.eb().b(cgl.az);
      this.eb().a(cgl.p, $$0);
      this.eb().b(cgl.F);
      cda.a(this, 200);
   }

   @Override
   public bwl e(bxv $$0) {
      bwl $$1 = super.e($$0);
      return this.gu() ? bwl.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bF() {
      return !this.gu() && super.bF();
   }

   @Override
   protected void D(bwi $$0) {
      if (!this.gi() && !this.eb().a(cgl.aI)) {
         this.eb().a(cgl.aI, bau.a, 20L);
         this.d($$0);
         cqn.a(this, $$0.du());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cql t() {
      return this.cm;
   }

   @Override
   protected cgt b(djh $$0) {
      return new cgs(this, $$0) {
         @Override
         protected exl a(int $$0) {
            this.o = new exr();
            return new exl(this.o, $$0) {
               @Override
               protected float a(exh $$0, exh $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public efx.a x() {
      return this.cl;
   }

   @Override
   public efx.d gt() {
      return this.ck;
   }

   class a implements efx.d {
      private static final int b = 16;
      private final efs c = new efm(cqm.this, cqm.this.cR());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public efs b() {
         return this.c;
      }

      @Override
      public axr<efo> c() {
         return axi.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<efo> $$2, efo.a $$3) {
         if (!cqm.this.gi() && !cqm.this.eG() && !cqm.this.eb().a(cgl.aJ) && !cqm.this.gu() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof bxj $$4 && !cqm.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arq $$0, iv $$1, jf<efo> $$2, @Nullable bwi $$3, @Nullable bwi $$4, float $$5) {
         if (!cqm.this.eG()) {
            cqm.this.bs.a(cgl.aJ, bau.a, 40L);
            $$0.a(cqm.this, (byte)61);
            cqm.this.a(awn.Dd, 5.0F, cqm.this.fe());
            iv $$6 = $$1;
            if ($$4 != null) {
               if (cqm.this.a($$4, 30.0)) {
                  if (cqm.this.eb().a(cgl.aB)) {
                     if (cqm.this.b($$4)) {
                        $$6 = $$4.du();
                     }

                     cqm.this.d($$4);
                  } else {
                     cqm.this.a($$4, 10, true);
                  }
               }

               cqm.this.eb().a(cgl.aB, bau.a, 100L);
            } else {
               cqm.this.d($$3);
            }

            if (!cqm.this.n().d()) {
               Optional<bxj> $$7 = cqm.this.cm.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cqn.a(cqm.this, $$6);
               }
            }
         }
      }
   }
}
