import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class clz extends ckb implements dxc {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final akj<Integer> ci = akn.a(clz.class, akl.b);
   private static final int cj = 200;
   private static final int ck = 260;
   private static final int cl = 20;
   private static final int cm = 120;
   private static final int cn = 20;
   private static final int co = 35;
   private static final int cp = 10;
   private static final int cq = 20;
   private static final int cr = 100;
   private static final int cs = 20;
   private static final int ct = 30;
   private static final float cu = 4.5F;
   private static final float cv = 0.7F;
   private static final int cw = 30;
   private int cx;
   private int cz;
   private int cA;
   private int cB;
   public bsn b = new bsn();
   public bsn c = new bsn();
   public bsn d = new bsn();
   public bsn e = new bsn();
   public bsn bY = new bsn();
   public bsn bZ = new bsn();
   private final dwq<dxc.b> cC;
   private final dxc.d cD;
   private dxc.a cE;
   cly cF = new cly(this::b, Collections.emptyList());

   public clz(bsy<? extends ckb> $$0, dbw $$1) {
      super($$0, $$1);
      this.cD = new clz.a();
      this.cE = new dxc.a();
      this.cC = new dwq<>(new dxc.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(eok.m, 0.0F);
      this.a(eok.q, 8.0F);
      this.a(eok.f, 8.0F);
      this.a(eok.i, 8.0F);
      this.a(eok.o, 0.0F);
      this.a(eok.n, 0.0F);
   }

   @Override
   public zv<ach> dl() {
      return new aci(this, this.c(btz.n) ? 1 : 0);
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(btz.n);
      }
   }

   @Override
   public boolean a(dbz $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(iz $$0, dbz $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(brl $$0) {
      return this.gu() && !$$0.a(awq.e) ? true : super.b($$0);
   }

   boolean gu() {
      return this.c(btz.o) || this.c(btz.n);
   }

   @Override
   protected boolean o(bss $$0) {
      return false;
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   protected float aO() {
      return this.aa + 0.55F;
   }

   public static buu.a s() {
      return ckb.gw().a(buv.q, 500.0).a(buv.r, 0.3F).a(buv.n, 1.0).a(buv.d, 1.5).a(buv.c, 30.0);
   }

   @Override
   public boolean bc() {
      return true;
   }

   @Override
   protected float fe() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avy v() {
      return !this.c(btz.l) && !this.gu() ? this.y().b() : null;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.BK;
   }

   @Override
   protected avy o_() {
      return avz.BG;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bss $$0) {
      this.dP().a(this, (byte)4);
      this.a(avz.BF, 10.0F, this.ff());
      bzg.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ci, 0);
   }

   public int u() {
      return this.ao.a(ci);
   }

   private void gx() {
      this.ao.a(ci, this.gA());
   }

   @Override
   public void l() {
      if (this.dP() instanceof are $$0) {
         dxc.c.a($$0, this.cE, this.cD);
         if (this.fW() || this.W()) {
            cma.a((btn)this);
         }
      }

      super.l();
      if (this.dP().x_()) {
         if (this.ai % this.gy() == 0) {
            this.cA = 10;
            if (!this.aW()) {
               this.dP().a(this.du(), this.dw(), this.dA(), avz.BJ, this.de(), 5.0F, this.ff(), false);
            }
         }

         this.cz = this.cx;
         if (this.cx > 0) {
            this.cx--;
         }

         this.cB = this.cA;
         if (this.cA > 0) {
            this.cA--;
         }

         switch (this.ar()) {
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
      are $$0 = (are)this.dP();
      $$0.ag().a("wardenBrain");
      this.dS().a($$0, this);
      this.dP().ag().c();
      super.Z();
      if ((this.ai + this.al()) % 120 == 0) {
         a($$0, this.dn(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cF.a($$0, this::b);
         this.gx();
      }

      cma.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bY.a(this.ai);
      } else if ($$0 == 61) {
         this.cx = 10;
      } else if ($$0 == 62) {
         this.bZ.a(this.ai);
      } else {
         super.b($$0);
      }
   }

   private int gy() {
      float $$0 = (float)this.u() / (float)clx.c.a();
      return 40 - ayx.d(ayx.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayx.i($$0, (float)this.cz, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayx.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(bsn $$0) {
      if ((float)$$0.b() < 4500.0F) {
         azf $$1 = this.el();
         dsa $$2 = this.bp();
         if ($$2.l() != dld.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.du() + (double)ayx.b($$1, -0.7F, 0.7F);
               double $$5 = this.dw();
               double $$6 = this.dA() + (double)ayx.b($$1, -0.7F, 0.7F);
               this.dP().a(new la(li.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (at.equals($$0)) {
         switch (this.ar()) {
            case n:
               this.d.a(this.ai);
               break;
            case o:
               this.e.a(this.ai);
               break;
            case l:
               this.b.a(this.ai);
               break;
            case m:
               this.c.a(this.ai);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dbo $$0) {
      return this.gu();
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return cma.a(this, $$0);
   }

   @Override
   public bup<clz> dS() {
      return (bup<clz>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public void a(BiConsumer<dwq<?>, are> $$0) {
      if (this.dP() instanceof are $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bss $$0) {
      if ($$0 instanceof btn $$1
         && this.dP() == $$0.dP()
         && bsx.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bsy.d
         && $$1.ak() != bsy.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(are $$0, evp $$1, @Nullable bss $$2, int $$3) {
      bsa $$4 = new bsa(bsc.G, 260, 0, false, false);
      bsb.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      cly.a(this::b).encodeStart(vf.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxc.a.a.encodeStart(vf.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cly.a(this::b).parse(new Dynamic(vf.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gx();
      }

      if ($$0.b("listener", 10)) {
         dxc.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gz() {
      if (!this.c(btz.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public clx y() {
      return clx.a(this.gA());
   }

   private int gA() {
      return this.cF.b(this.p());
   }

   public void c(bss $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bss $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bss $$0, int $$1, boolean $$2) {
      if (!this.gg() && this.b($$0)) {
         cma.a((btn)this);
         boolean $$3 = !(this.p() instanceof cmv);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof cmv && $$3 && clx.a($$4).d()) {
            this.dS().b(ccr.o);
         }

         if ($$2) {
            this.gz();
         }
      }
   }

   public Optional<btn> gq() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btn p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      this.dS().a(ccr.aE, baa.a, 1200L);
      if ($$2 == btr.k) {
         this.b(btz.n);
         this.dS().a(ccr.aC, baa.a, (long)cma.a);
         this.a(avz.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gg() && !this.gu()) {
         bss $$3 = $$0.d();
         this.a($$3, clx.c.a() + 20, false);
         if (this.bD.c(ccr.o).isEmpty() && $$3 instanceof btn $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btn $$0) {
      this.dS().b(ccr.ay);
      this.dS().a(ccr.o, $$0);
      this.dS().b(ccr.E);
      bzg.a(this, 200);
   }

   @Override
   public bsv e(btz $$0) {
      bsv $$1 = super.e($$0);
      return this.gu() ? bsv.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gu() && super.bA();
   }

   @Override
   protected void D(bss $$0) {
      if (!this.gg() && !this.dS().a(ccr.aH)) {
         this.dS().a(ccr.aH, baa.a, 20L);
         this.d($$0);
         cma.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cly gr() {
      return this.cF;
   }

   @Override
   protected ccz b(dbw $$0) {
      return new ccy(this, $$0) {
         @Override
         protected eoj a(int $$0) {
            this.o = new eop();
            this.o.a(true);
            return new eoj(this.o, $$0) {
               @Override
               protected float a(eof $$0, eof $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxc.a gs() {
      return this.cE;
   }

   @Override
   public dxc.d gt() {
      return this.cD;
   }

   class a implements dxc.d {
      private static final int b = 16;
      private final dwx c = new dwr(clz.this, clz.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwx b() {
         return this.c;
      }

      @Override
      public axe<dwt> c() {
         return awv.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwt> $$2, dwt.a $$3) {
         if (!clz.this.gg() && !clz.this.eB() && !clz.this.dS().a(ccr.aI) && !clz.this.gu() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btn $$4 && !clz.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(are $$0, iz $$1, ji<dwt> $$2, @Nullable bss $$3, @Nullable bss $$4, float $$5) {
         if (!clz.this.eB()) {
            clz.this.bD.a(ccr.aI, baa.a, 40L);
            $$0.a(clz.this, (byte)61);
            clz.this.a(avz.BV, 5.0F, clz.this.ff());
            iz $$6 = $$1;
            if ($$4 != null) {
               if (clz.this.a($$4, 30.0)) {
                  if (clz.this.dS().a(ccr.aA)) {
                     if (clz.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     clz.this.d($$4);
                  } else {
                     clz.this.a($$4, 10, true);
                  }
               }

               clz.this.dS().a(ccr.aA, baa.a, 100L);
            } else {
               clz.this.d($$3);
            }

            if (!clz.this.y().d()) {
               Optional<btn> $$7 = clz.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cma.a(clz.this, $$6);
               }
            }
         }
      }
   }
}
