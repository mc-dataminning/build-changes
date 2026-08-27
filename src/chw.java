import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class chw extends cfy implements drw {
   private static final Logger bZ = LogUtils.getLogger();
   private static final int ca = 40;
   private static final int cb = 200;
   private static final int cc = 500;
   private static final float cd = 0.3F;
   private static final float ce = 1.0F;
   private static final float cf = 1.5F;
   private static final int cg = 30;
   private static final aim<Integer> ch = aiq.a(chw.class, aio.b);
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
   public bos b = new bos();
   public bos c = new bos();
   public bos d = new bos();
   public bos e = new bos();
   public bos bX = new bos();
   public bos bY = new bos();
   private final drk<drw.b> cB;
   private final drw.d cC;
   private drw.a cD;
   chv cE = new chv(this::b, Collections.emptyList());

   public chw(bpc<? extends cfy> $$0, cwz $$1) {
      super($$0, $$1);
      this.cC = new chw.a();
      this.cD = new drw.a();
      this.cB = new drk<>(new drw.b(this));
      this.bM = 5;
      this.K().a(true);
      this.a(eiy.m, 0.0F);
      this.a(eiy.q, 8.0F);
      this.a(eiy.f, 8.0F);
      this.a(eiy.i, 8.0F);
      this.a(eiy.o, 0.0F);
      this.a(eiy.n, 0.0F);
   }

   @Override
   public yb<aam> di() {
      return new aan(this, this.c(bpz.n) ? 1 : 0);
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bpz.n);
      }
   }

   @Override
   public boolean a(cxc $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(ib $$0, cxc $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bnv $$0) {
      return this.gr() && !$$0.a(aup.e) ? true : super.b($$0);
   }

   boolean gr() {
      return this.c(bpz.o) || this.c(bpz.n);
   }

   @Override
   protected boolean o(bow $$0) {
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

   public static bqu.a r() {
      return cfy.gt().a(bqv.q, 500.0).a(bqv.r, 0.3F).a(bqv.n, 1.0).a(bqv.d, 1.5).a(bqv.c, 30.0);
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
   protected atx v() {
      return !this.c(bpz.l) && !this.gr() ? this.y().b() : null;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.Bj;
   }

   @Override
   protected atx n_() {
      return aty.Bf;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.Bt, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bow $$0) {
      this.dM().a(this, (byte)4);
      this.a(aty.Be, 10.0F, this.fc());
      bvg.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   public int s() {
      return this.an.a(ch);
   }

   private void gu() {
      this.an.a(ch, this.gx());
   }

   @Override
   public void l() {
      if (this.dM() instanceof apf $$0) {
         drw.c.a($$0, this.cD, this.cC);
         if (this.fU() || this.V()) {
            chx.a((bpo)this);
         }
      }

      super.l();
      if (this.dM().x_()) {
         if (this.ah % this.gv() == 0) {
            this.cz = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), aty.Bi, this.db(), 5.0F, this.fc(), false);
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
      apf $$0 = (apf)this.dM();
      $$0.ae().a("wardenBrain");
      this.dP().a($$0, this);
      this.dM().ae().c();
      super.Y();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cE.a($$0, this::b);
         this.gu();
      }

      chx.a(this);
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
      float $$0 = (float)this.s() / (float)chu.c.a();
      return 40 - aww.d(aww.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return aww.i($$0, (float)this.cx, (float)this.cw) / 10.0F;
   }

   public float H(float $$0) {
      return aww.i($$0, (float)this.cA, (float)this.cz) / 10.0F;
   }

   private void a(bos $$0) {
      if ((float)$$0.b() < 4500.0F) {
         axd $$1 = this.ei();
         dmz $$2 = this.bn();
         if ($$2.l() != dgf.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)aww.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)aww.b($$1, -0.7F, 0.7F);
               this.dM().a(new ju(kc.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aim<?> $$0) {
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
   public boolean a(cwr $$0) {
      return this.gr();
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return chx.a(this, $$0);
   }

   @Override
   public bqp<chw> dP() {
      return (bqp<chw>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public void a(BiConsumer<drk<?>, apf> $$0) {
      if (this.dM() instanceof apf $$1) {
         $$0.accept(this.cB, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bow $$0) {
      if ($$0 instanceof bpo $$1
         && this.dM() == $$0.dM()
         && bpb.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bpc.e
         && $$1.ai() != bpc.bl
         && !$$1.cr()
         && !$$1.ey()
         && this.dM().C_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(apf $$0, epr $$1, @Nullable bow $$2, int $$3) {
      boj $$4 = new boj(bol.G, 260, 0, false, false);
      bok.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      chv.a(this::b).encodeStart(to.a, this.cE).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("anger", $$1));
      drw.a.a.encodeStart(to.a, this.cD).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         chv.a(this::b).parse(new Dynamic(to.a, $$0.c("anger"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cE = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         drw.a.a.parse(new Dynamic(to.a, $$0.p("listener"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cD = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bpz.l)) {
         this.a(this.y().c(), 10.0F, this.fc());
      }
   }

   public chu y() {
      return chu.a(this.gx());
   }

   private int gx() {
      return this.cE.b(this.p());
   }

   public void c(bow $$0) {
      this.cE.a($$0);
   }

   public void d(@Nullable bow $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bow $$0, int $$1, boolean $$2) {
      if (!this.gd() && this.b($$0)) {
         chx.a((bpo)this);
         boolean $$3 = !(this.dP().c(byr.o).orElse(null) instanceof cis);
         int $$4 = this.cE.a($$0, $$1);
         if ($$0 instanceof cis && $$3 && chu.a($$4).d()) {
            this.dP().b(byr.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bpo> gn() {
      return this.y().d() ? this.cE.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bpo p() {
      return this.dP().c(byr.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      this.dP().a(byr.aE, axy.a, 1200L);
      if ($$2 == bps.k) {
         this.b(bpz.n);
         this.dP().a(byr.aC, axy.a, (long)chx.a);
         this.a(aty.Bb, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.gd() && !this.gr()) {
         bow $$3 = $$0.d();
         this.a($$3, chu.c.a() + 20, false);
         if (this.bC.c(byr.o).isEmpty() && $$3 instanceof bpo $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bpo $$0) {
      this.dP().b(byr.ay);
      this.dP().a(byr.o, $$0);
      this.dP().b(byr.E);
      bvg.a(this, 200);
   }

   @Override
   public boz e(bpz $$0) {
      boz $$1 = super.e($$0);
      return this.gr() ? boz.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bx() {
      return !this.gr() && super.bx();
   }

   @Override
   protected void D(bow $$0) {
      if (!this.gd() && !this.dP().a(byr.aH)) {
         this.dP().a(byr.aH, axy.a, 20L);
         this.d($$0);
         chx.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public chv go() {
      return this.cE;
   }

   @Override
   protected byz b(cwz $$0) {
      return new byy(this, $$0) {
         @Override
         protected eje a(int $$0) {
            this.o = new ejh();
            this.o.a(true);
            return new eje(this.o, $$0) {
               @Override
               protected float a(eja $$0, eja $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public drw.a gp() {
      return this.cD;
   }

   @Override
   public drw.d gq() {
      return this.cC;
   }

   class a implements drw.d {
      private static final int b = 16;
      private final drr c = new drl(chw.this, chw.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public drr b() {
         return this.c;
      }

      @Override
      public avd<drn> c() {
         return aut.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drn> $$2, drn.a $$3) {
         if (!chw.this.gd() && !chw.this.ey() && !chw.this.dP().a(byr.aI) && !chw.this.gr() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bpo $$4 && !chw.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(apf $$0, ib $$1, il<drn> $$2, @Nullable bow $$3, @Nullable bow $$4, float $$5) {
         if (!chw.this.ey()) {
            chw.this.bC.a(byr.aI, axy.a, 40L);
            $$0.a(chw.this, (byte)61);
            chw.this.a(aty.Bu, 5.0F, chw.this.fc());
            ib $$6 = $$1;
            if ($$4 != null) {
               if (chw.this.a($$4, 30.0)) {
                  if (chw.this.dP().a(byr.aA)) {
                     if (chw.this.b($$4)) {
                        $$6 = $$4.dm();
                     }

                     chw.this.d($$4);
                  } else {
                     chw.this.a($$4, 10, true);
                  }
               }

               chw.this.dP().a(byr.aA, axy.a, 100L);
            } else {
               chw.this.d($$3);
            }

            if (!chw.this.y().d()) {
               Optional<bpo> $$7 = chw.this.cE.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  chx.a(chw.this, $$6);
               }
            }
         }
      }
   }
}
