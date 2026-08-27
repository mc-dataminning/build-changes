import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cix extends cgz implements dub {
   private static final Logger bZ = LogUtils.getLogger();
   private static final int ca = 40;
   private static final int cb = 200;
   private static final int cc = 500;
   private static final float cd = 0.3F;
   private static final float ce = 1.0F;
   private static final float cf = 1.5F;
   private static final int cg = 30;
   private static final aiy<Integer> ch = ajc.a(cix.class, aja.b);
   private static final int ci = 200;
   private static final int cj = 260;
   private static final int ck = 20;
   private static final int cl = 120;
   private static final int cm = 20;
   private static final int cn = 35;
   private static final int co = 10;
   private static final int cp = 20;
   private static final int cq = 100;
   private static final int cr = 20;
   private static final int cs = 30;
   private static final float ct = 4.5F;
   private static final float cu = 0.7F;
   private static final int cv = 30;
   private int cw;
   private int cx;
   private int cz;
   private int cA;
   public bpq b = new bpq();
   public bpq c = new bpq();
   public bpq d = new bpq();
   public bpq e = new bpq();
   public bpq bX = new bpq();
   public bpq bY = new bpq();
   private final dtp<dub.b> cB;
   private final dub.d cC;
   private dub.a cD;
   ciw cE = new ciw(this::b, Collections.emptyList());

   public cix(bqb<? extends cgz> $$0, cyx $$1) {
      super($$0, $$1);
      this.cC = new cix.a();
      this.cD = new dub.a();
      this.cB = new dtp<>(new dub.b(this));
      this.bM = 5;
      this.K().a(true);
      this.a(elj.m, 0.0F);
      this.a(elj.q, 8.0F);
      this.a(elj.f, 8.0F);
      this.a(elj.i, 8.0F);
      this.a(elj.o, 0.0F);
      this.a(elj.n, 0.0F);
   }

   @Override
   public yn<aay> di() {
      return new aaz(this, this.c(bqz.n) ? 1 : 0);
   }

   @Override
   public void a(aaz $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bqz.n);
      }
   }

   @Override
   public boolean a(cza $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bot $$0) {
      return this.gr() && !$$0.a(ave.e) ? true : super.b($$0);
   }

   boolean gr() {
      return this.c(bqz.o) || this.c(bqz.n);
   }

   @Override
   protected boolean o(bpv $$0) {
      return false;
   }

   @Override
   public boolean fL() {
      return true;
   }

   @Override
   protected float aM() {
      return this.Z + 0.55F;
   }

   public static bru.a r() {
      return cgz.gt().a(brv.q, 500.0).a(brv.r, 0.3F).a(brv.n, 1.0).a(brv.d, 1.5).a(brv.c, 30.0);
   }

   @Override
   public boolean ba() {
      return true;
   }

   @Override
   protected float fb() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected aul v() {
      return !this.c(bqz.l) && !this.gr() ? this.y().b() : null;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Br;
   }

   @Override
   protected aul o_() {
      return aum.Bn;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.BB, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bpv $$0) {
      this.dM().a(this, (byte)4);
      this.a(aum.Bm, 10.0F, this.fc());
      bwg.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   public int u() {
      return this.an.a(ch);
   }

   private void gu() {
      this.an.a(ch, this.gx());
   }

   @Override
   public void l() {
      if (this.dM() instanceof aps $$0) {
         dub.c.a($$0, this.cD, this.cC);
         if (this.fU() || this.V()) {
            ciy.a((bqo)this);
         }
      }

      super.l();
      if (this.dM().x_()) {
         if (this.ah % this.gv() == 0) {
            this.cz = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), aum.Bq, this.db(), 5.0F, this.fc(), false);
            }
         }

         this.cx = this.cw;
         if (this.cw > 0) {
            this.cw--;
         }

         this.cA = this.cz;
         if (this.cz > 0) {
            this.cz--;
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
   protected void Y() {
      aps $$0 = (aps)this.dM();
      $$0.af().a("wardenBrain");
      this.dP().a($$0, this);
      this.dM().af().c();
      super.Y();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cE.a($$0, this::b);
         this.gu();
      }

      ciy.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bX.a(this.ah);
      } else if ($$0 == 61) {
         this.cw = 10;
      } else if ($$0 == 62) {
         this.bY.a(this.ah);
      } else {
         super.b($$0);
      }
   }

   private int gv() {
      float $$0 = (float)this.u() / (float)civ.c.a();
      return 40 - axk.d(axk.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return axk.i($$0, (float)this.cx, (float)this.cw) / 10.0F;
   }

   public float H(float $$0) {
      return axk.i($$0, (float)this.cA, (float)this.cz) / 10.0F;
   }

   private void a(bpq $$0) {
      if ((float)$$0.b() < 4500.0F) {
         axr $$1 = this.ei();
         doz $$2 = this.bn();
         if ($$2.l() != did.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)axk.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)axk.b($$1, -0.7F, 0.7F);
               this.dM().a(new kd(kl.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aiy<?> $$0) {
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
   public boolean a(cyp $$0) {
      return this.gr();
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return ciy.a(this, $$0);
   }

   @Override
   public brp<cix> dP() {
      return (brp<cix>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   public void a(BiConsumer<dtp<?>, aps> $$0) {
      if (this.dM() instanceof aps $$1) {
         $$0.accept(this.cB, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bpv $$0) {
      if ($$0 instanceof bqo $$1
         && this.dM() == $$0.dM()
         && bqa.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bqb.d
         && $$1.ai() != bqb.bl
         && !$$1.cr()
         && !$$1.ey()
         && this.dM().C_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(aps $$0, esa $$1, @Nullable bpv $$2, int $$3) {
      bph $$4 = new bph(bpj.G, 260, 0, false, false);
      bpi.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      ciw.a(this::b).encodeStart(ua.a, this.cE).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dub.a.a.encodeStart(ua.a, this.cD).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         ciw.a(this::b).parse(new Dynamic(ua.a, $$0.c("anger"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cE = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         dub.a.a.parse(new Dynamic(ua.a, $$0.p("listener"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cD = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bqz.l)) {
         this.a(this.y().c(), 10.0F, this.fc());
      }
   }

   public civ y() {
      return civ.a(this.gx());
   }

   private int gx() {
      return this.cE.b(this.p());
   }

   public void c(bpv $$0) {
      this.cE.a($$0);
   }

   public void d(@Nullable bpv $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bpv $$0, int $$1, boolean $$2) {
      if (!this.gd() && this.b($$0)) {
         ciy.a((bqo)this);
         boolean $$3 = !(this.dP().c(bzr.o).orElse(null) instanceof cjt);
         int $$4 = this.cE.a($$0, $$1);
         if ($$0 instanceof cjt && $$3 && civ.a($$4).d()) {
            this.dP().b(bzr.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bqo> gn() {
      return this.y().d() ? this.cE.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bqo p() {
      return this.dP().c(bzr.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.dP().a(bzr.aE, aym.a, 1200L);
      if ($$2 == bqs.k) {
         this.b(bqz.n);
         this.dP().a(bzr.aC, aym.a, (long)ciy.a);
         this.a(aum.Bj, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.gd() && !this.gr()) {
         bpv $$3 = $$0.d();
         this.a($$3, civ.c.a() + 20, false);
         if (this.bC.c(bzr.o).isEmpty() && $$3 instanceof bqo $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bqo $$0) {
      this.dP().b(bzr.ay);
      this.dP().a(bzr.o, $$0);
      this.dP().b(bzr.E);
      bwg.a(this, 200);
   }

   @Override
   public bpy e(bqz $$0) {
      bpy $$1 = super.e($$0);
      return this.gr() ? bpy.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bx() {
      return !this.gr() && super.bx();
   }

   @Override
   protected void D(bpv $$0) {
      if (!this.gd() && !this.dP().a(bzr.aH)) {
         this.dP().a(bzr.aH, aym.a, 20L);
         this.d($$0);
         ciy.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public ciw go() {
      return this.cE;
   }

   @Override
   protected bzz b(cyx $$0) {
      return new bzy(this, $$0) {
         @Override
         protected eli a(int $$0) {
            this.o = new elo();
            this.o.a(true);
            return new eli(this.o, $$0) {
               @Override
               protected float a(ele $$0, ele $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dub.a gp() {
      return this.cD;
   }

   @Override
   public dub.d gq() {
      return this.cC;
   }

   class a implements dub.d {
      private static final int b = 16;
      private final dtw c = new dtq(cix.this, cix.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dtw b() {
         return this.c;
      }

      @Override
      public avr<dts> c() {
         return avi.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aps $$0, ib $$1, il<dts> $$2, dts.a $$3) {
         if (!cix.this.gd() && !cix.this.ey() && !cix.this.dP().a(bzr.aI) && !cix.this.gr() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bqo $$4 && !cix.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aps $$0, ib $$1, il<dts> $$2, @Nullable bpv $$3, @Nullable bpv $$4, float $$5) {
         if (!cix.this.ey()) {
            cix.this.bC.a(bzr.aI, aym.a, 40L);
            $$0.a(cix.this, (byte)61);
            cix.this.a(aum.BC, 5.0F, cix.this.fc());
            ib $$6 = $$1;
            if ($$4 != null) {
               if (cix.this.a($$4, 30.0)) {
                  if (cix.this.dP().a(bzr.aA)) {
                     if (cix.this.b($$4)) {
                        $$6 = $$4.dm();
                     }

                     cix.this.d($$4);
                  } else {
                     cix.this.a($$4, 10, true);
                  }
               }

               cix.this.dP().a(bzr.aA, aym.a, 100L);
            } else {
               cix.this.d($$3);
            }

            if (!cix.this.y().d()) {
               Optional<bqo> $$7 = cix.this.cE.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  ciy.a(cix.this, $$6);
               }
            }
         }
      }
   }
}
