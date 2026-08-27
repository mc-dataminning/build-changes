import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class byo extends bfz {
   private static final Logger b = LogUtils.getLogger();
   public static final int bB = 16;
   public static final int bC = 20;
   public static final int bD = 100;
   public static final int bE = 10;
   public static final int bF = 200;
   public static final float bG = 1.5F;
   public static final float bH = 0.6F;
   public static final float bI = 0.6F;
   public static final float bJ = 1.62F;
   public static final bfk bK = bfk.b(0.6F, 1.8F);
   private static final Map<bgl, bfk> c = ImmutableMap.builder()
      .put(bgl.a, bK)
      .put(bgl.c, aE)
      .put(bgl.b, bfk.b(0.6F, 0.6F))
      .put(bgl.d, bfk.b(0.6F, 0.6F))
      .put(bgl.e, bfk.b(0.6F, 0.6F))
      .put(bgl.f, bfk.b(0.6F, 1.5F))
      .put(bgl.h, bfk.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final aby<Float> e = acb.a(byo.class, aca.d);
   private static final aby<Integer> f = acb.a(byo.class, aca.b);
   protected static final aby<Byte> bL = acb.a(byo.class, aca.a);
   protected static final aby<Byte> bM = acb.a(byo.class, aca.a);
   protected static final aby<qr> bN = acb.a(byo.class, aca.s);
   protected static final aby<qr> bO = acb.a(byo.class, aca.s);
   private long g;
   private final byn cl = new byn(this);
   protected cco bP = new cco();
   public final cce bQ;
   public cbf bR;
   protected cbb bS = new cbb();
   protected int bT;
   public float bU;
   public float bV;
   public int bW;
   public double bX;
   public double bY;
   public double bZ;
   public double ca;
   public double cb;
   public double cc;
   private int cm;
   protected boolean cd;
   private final byl cn = new byl();
   public int ce;
   public int cf;
   public float cg;
   protected int ch;
   protected final float ci = 0.02F;
   private int co;
   private final GameProfile cp;
   private boolean cq;
   private cfz cr = cfz.b;
   private final cfv cs = this.k();
   private Optional<hd> ct = Optional.empty();
   @Nullable
   public bzc cj;
   protected float ck;

   public byo(cmm $$0, gu $$1, float $$2, GameProfile $$3) {
      super(bfn.bt, $$0);
      this.a_(hy.a($$3));
      this.cp = $$3;
      this.bQ = new cce(this.cl, !$$0.B, this);
      this.bR = this.bQ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bh = 180.0F;
   }

   public boolean a(cmm $$0, gu $$1, cmj $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cmj.d) {
         return true;
      } else if (this.fZ()) {
         return false;
      } else {
         cfz $$3 = this.eO();
         return $$3.b() || !$$3.b($$0.B_().d(jc.e), new dcf($$0, $$1, false));
      }
   }

   public static bhf.a fC() {
      return bfz.dM().a(bhg.f, 1.0).a(bhg.d, 0.1F).a(bhg.h).a(bhg.k);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(e, 0.0F);
      this.am.a(f, 0);
      this.am.a(bL, (byte)0);
      this.am.a(bM, (byte)1);
      this.am.a(bN, new qr());
      this.am.a(bO, new qr());
   }

   @Override
   public void l() {
      this.ae = this.G_();
      if (this.G_()) {
         this.c(false);
      }

      if (this.bW > 0) {
         this.bW--;
      }

      if (this.fy()) {
         this.cm++;
         if (this.cm > 100) {
            this.cm = 100;
         }

         if (!this.dI().B && this.dI().N()) {
            this.a(false, true);
         }
      } else if (this.cm > 0) {
         this.cm++;
         if (this.cm >= 110) {
            this.cm = 0;
         }
      }

      this.fG();
      super.l();
      if (!this.dI().B && this.bR != null && !this.bR.a(this)) {
         this.q();
         this.bR = this.bQ;
      }

      this.x();
      if (!this.dI().B) {
         this.bS.a(this);
         this.a(amr.k);
         this.a(amr.l);
         if (this.bs()) {
            this.a(amr.m);
         }

         if (this.bS()) {
            this.a(amr.o);
         }

         if (!this.fy()) {
            this.a(amr.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = apa.a(this.dn(), -2.9999999E7, 2.9999999E7);
      double $$2 = apa.a(this.dt(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dn() || $$2 != this.dt()) {
         this.e($$1, this.dp(), $$2);
      }

      this.aQ++;
      cfz $$3 = this.eO();
      if (!cfz.a(this.cr, $$3)) {
         if (!cfz.b(this.cr, $$3)) {
            this.gh();
         }

         this.cr = $$3.p();
      }

      this.s();
      this.cs.a();
      this.fH();
   }

   public boolean fD() {
      return this.bP();
   }

   protected boolean fE() {
      return this.bP();
   }

   protected boolean fF() {
      return this.bP();
   }

   protected boolean fG() {
      this.cd = this.a(anb.a);
      return this.cd;
   }

   private void s() {
      cfz $$0 = this.c(bfo.f);
      if ($$0.a(cgc.nC) && !this.a(anb.a)) {
         this.b(new bfa(bfc.m, 200, 0, false, false, true));
      }
   }

   protected cfv k() {
      return new cfv();
   }

   private void x() {
      this.bX = this.ca;
      this.bY = this.cb;
      this.bZ = this.cc;
      double $$0 = this.dn() - this.ca;
      double $$1 = this.dp() - this.cb;
      double $$2 = this.dt() - this.cc;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ca = this.dn();
         this.bX = this.ca;
      }

      if ($$2 > 10.0) {
         this.cc = this.dt();
         this.bZ = this.cc;
      }

      if ($$1 > 10.0) {
         this.cb = this.dp();
         this.bY = this.cb;
      }

      if ($$0 < -10.0) {
         this.ca = this.dn();
         this.bX = this.ca;
      }

      if ($$2 < -10.0) {
         this.cc = this.dt();
         this.bZ = this.cc;
      }

      if ($$1 < -10.0) {
         this.cb = this.dp();
         this.bY = this.cb;
      }

      this.ca += $$0 * 0.25;
      this.cc += $$2 * 0.25;
      this.cb += $$1 * 0.25;
   }

   protected void fH() {
      if (this.d(bgl.d)) {
         bgl $$0;
         if (this.fr()) {
            $$0 = bgl.b;
         } else if (this.fy()) {
            $$0 = bgl.c;
         } else if (this.bW()) {
            $$0 = bgl.d;
         } else if (this.fe()) {
            $$0 = bgl.e;
         } else if (this.bP() && !this.cn.b) {
            $$0 = bgl.f;
         } else {
            $$0 = bgl.a;
         }

         bgl $$6;
         if (this.G_() || this.bM() || this.d($$0)) {
            $$6 = $$0;
         } else if (this.d(bgl.f)) {
            $$6 = bgl.f;
         } else {
            $$6 = bgl.d;
         }

         this.b($$6);
      }
   }

   @Override
   public int at() {
      return this.cn.a ? 1 : 80;
   }

   @Override
   protected amg aJ() {
      return amh.sI;
   }

   @Override
   protected amg aK() {
      return amh.sG;
   }

   @Override
   protected amg aL() {
      return amh.sH;
   }

   @Override
   public int bH() {
      return 10;
   }

   @Override
   public void a(amg $$0, float $$1, float $$2) {
      this.dI().a(this, this.dn(), this.dp(), this.dt(), $$0, this.cY(), $$1, $$2);
   }

   public void a(amg $$0, ami $$1, float $$2, float $$3) {
   }

   @Override
   public ami cY() {
      return ami.h;
   }

   @Override
   protected int cZ() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.Z_();
      } else if ($$0 == 23) {
         this.cq = false;
      } else if ($$0 == 22) {
         this.cq = true;
      } else if ($$0 == 43) {
         this.a(iv.f);
      } else {
         super.b($$0);
      }
   }

   private void a(it $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dI().a($$0, this.d(1.0), this.dq() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected void q() {
      this.bR = this.bQ;
   }

   protected void r() {
   }

   @Override
   public void bv() {
      if (!this.dI().B && this.fE() && this.bM()) {
         this.Y();
         this.f(false);
      } else {
         double $$0 = this.dn();
         double $$1 = this.dp();
         double $$2 = this.dt();
         super.bv();
         this.bU = this.bV;
         this.bV = 0.0F;
         this.s(this.dn() - $$0, this.dp() - $$1, this.dt() - $$2);
      }
   }

   @Override
   protected void fc() {
      super.fc();
      this.eL();
      this.aX = this.dy();
   }

   @Override
   public void b_() {
      if (this.bT > 0) {
         this.bT--;
      }

      if (this.dI().ai() == bdu.a && this.dI().X().b(cmi.j)) {
         if (this.er() < this.eI() && this.ag % 20 == 0) {
            this.s(1.0F);
         }

         if (this.bS.c() && this.ag % 10 == 0) {
            this.bS.a(this.bS.a() + 1);
         }
      }

      this.cl.j();
      this.bU = this.bV;
      super.b_();
      this.w((float)this.b(bhg.d));
      float $$1;
      if (this.ay() && !this.es() && !this.bW()) {
         $$1 = Math.min(0.1F, (float)this.dl().h());
      } else {
         $$1 = 0.0F;
      }

      this.bV = this.bV + ($$1 - this.bV) * 0.4F;
      if (this.er() > 0.0F && !this.G_()) {
         eed $$2;
         if (this.bM() && !this.cW().dD()) {
            $$2 = this.cE().b(this.cW().cE()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cE().c(1.0, 0.5, 1.0);
         }

         List<bfj> $$4 = this.dI().a_(this, $$2);
         List<bfj> $$5 = Lists.newArrayList();

         for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
            bfj $$7 = $$4.get($$6);
            if ($$7.ae() == bfn.J) {
               $$5.add($$7);
            } else if (!$$7.dD()) {
               this.c($$7);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.af));
         }
      }

      this.c(this.ge());
      this.c(this.gf());
      if (!this.dI().B && (this.aa > 0.5F || this.aV()) || this.cn.b || this.fy() || this.az) {
         this.gb();
      }
   }

   private void c(@Nullable qr $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dI().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bfn.a($$1).filter($$0x -> $$0x == bfn.at).ifPresent($$0x -> {
            if (!bsb.a(this.dI(), this)) {
               this.dI().a(null, this.dn(), this.dp(), this.dt(), bsb.a(this.dI(), this.dI().z), this.cY(), 1.0F, bsb.a(this.dI().z));
            }
         });
      }
   }

   private void c(bfj $$0) {
      $$0.b_(this);
   }

   public int fI() {
      return this.am.b(f);
   }

   public void r(int $$0) {
      this.am.b(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fI();
      this.am.b(f, $$1 + $$0);
   }

   public void t(int $$0) {
      this.bz = $$0;
      if (!this.dI().B) {
         this.gb();
         this.c(4, true);
      }
   }

   @Override
   public void a(ben $$0) {
      super.a($$0);
      this.an();
      if (!this.G_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-apa.b((this.eB() + this.dy()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-apa.a((this.eB() + this.dy()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(amr.N);
      this.a(amr.i.b(amr.m));
      this.a(amr.i.b(amr.n));
      this.aw();
      this.a_(false);
      this.a(Optional.of(hd.a(this.dI().ac(), this.di())));
   }

   @Override
   protected void eu() {
      super.eu();
      if (!this.dI().X().b(cmi.d)) {
         this.fJ();
         this.cl.k();
      }
   }

   protected void fJ() {
      for (int $$0 = 0; $$0 < this.cl.b(); $$0++) {
         cfz $$1 = this.cl.a($$0);
         if (!$$1.b() && cki.e($$1)) {
            this.cl.b($$0);
         }
      }
   }

   @Override
   protected amg d(ben $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected amg g_() {
      return amh.sy;
   }

   @Nullable
   public bvh a(cfz $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public bvh a(cfz $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dI().B) {
            this.a(bdw.a);
         }

         double $$3 = this.dr() - 0.3F;
         bvh $$4 = new bvh(this.dI(), this.dn(), $$3, this.dt(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.c(this.ct());
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.o((double)(-apa.a($$6) * $$5), 0.2F, (double)(apa.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = apa.a(this.dA() * (float) (Math.PI / 180.0));
            float $$9 = apa.b(this.dA() * (float) (Math.PI / 180.0));
            float $$10 = apa.a(this.dy() * (float) (Math.PI / 180.0));
            float $$11 = apa.b(this.dy() * (float) (Math.PI / 180.0));
            float $$12 = this.af.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.af.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.af.i() - this.af.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(dcb $$0) {
      float $$1 = this.cl.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cki.g(this);
         cfz $$3 = this.eO();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bfb.a(this)) {
         $$1 *= 1.0F + (float)(bfb.b(this) + 1) * 0.2F;
      }

      if (this.a(bfc.d)) {
         $$1 *= switch (this.b(bfc.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(anb.a) && !cki.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.ay()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dcb $$0) {
      return !$$0.y() || this.cl.f().b($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a_(hy.a(this.cp));
      qx $$1 = $$0.c("Inventory", 10);
      this.cl.b($$1);
      this.cl.l = $$0.h("SelectedItemSlot");
      this.cm = $$0.g("SleepTimer");
      this.cg = $$0.j("XpP");
      this.ce = $$0.h("XpLevel");
      this.cf = $$0.h("XpTotal");
      this.ch = $$0.h("XpSeed");
      if (this.ch == 0) {
         this.ch = this.af.f();
      }

      this.r($$0.h("Score"));
      this.bS.a($$0);
      this.cn.b($$0);
      this.a(bhg.d).a((double)this.cn.b());
      if ($$0.b("EnderItems", 9)) {
         this.bP.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(hd.a.parse(rc.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      rd.g($$0);
      $$0.a("Inventory", this.cl.a(new qx()));
      $$0.a("SelectedItemSlot", this.cl.l);
      $$0.a("SleepTimer", (short)this.cm);
      $$0.a("XpP", this.cg);
      $$0.a("XpLevel", this.ce);
      $$0.a("XpTotal", this.cf);
      $$0.a("XpSeed", this.ch);
      $$0.a("Score", this.fI());
      this.bS.b($$0);
      this.cn.a($$0);
      $$0.a("EnderItems", this.bP.g());
      if (!this.ge().g()) {
         $$0.a("ShoulderEntityLeft", this.ge());
      }

      if (!this.gf().g()) {
         $$0.a("ShoulderEntityRight", this.gf());
      }

      this.gm().flatMap($$0x -> hd.a.encodeStart(rc.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(ben $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(amy.n)) {
         return !this.dI().X().b(cmi.C);
      } else if ($$0.a(amy.m)) {
         return !this.dI().X().b(cmi.D);
      } else if ($$0.a(amy.i)) {
         return !this.dI().X().b(cmi.E);
      } else {
         return $$0.a(amy.o) ? !this.dI().X().b(cmi.F) : false;
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cn.a && !$$0.a(amy.d)) {
         return false;
      } else {
         this.bc = 0;
         if (this.es()) {
            return false;
         } else {
            if (!this.dI().B) {
               this.gb();
            }

            if ($$0.f()) {
               if (this.dI().ai() == bdu.a) {
                  $$1 = 0.0F;
               }

               if (this.dI().ai() == bdu.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dI().ai() == bdu.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bfz $$0) {
      super.d($$0);
      if ($$0.fB()) {
         this.s(true);
      }
   }

   @Override
   public boolean ek() {
      return !this.fO().a && super.ek();
   }

   public boolean a(byo $$0) {
      efi $$1 = this.cd();
      efi $$2 = $$0.cd();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(ben $$0, float $$1) {
      this.cl.a($$0, $$1, byn.g);
   }

   @Override
   protected void c(ben $$0, float $$1) {
      this.cl.a($$0, $$1, byn.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bw.a(cgc.uy)) {
         if (!this.dI().B) {
            this.b(amr.c.b(this.bw.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + apa.d($$0);
            bdw $$2 = this.fj();
            this.bw.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bw.b()) {
               if ($$2 == bdw.a) {
                  this.a(bfo.a, cfz.b);
               } else {
                  this.a(bfo.b, cfz.b);
               }

               this.bw = cfz.b;
               this.a(amh.uR, 0.8F, 0.8F + this.dI().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(ben $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.ff(), 0.0F);
         this.y(this.ff() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(amr.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.z($$0.a());
            this.eG().a($$0, var7);
            this.t(this.er() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(amr.J, Math.round(var7 * 10.0F));
            }

            this.a(dgl.o);
         }
      }
   }

   @Override
   protected boolean dQ() {
      return !this.cn.b && super.dQ();
   }

   public boolean U() {
      return false;
   }

   public void a(dav $$0, boolean $$1) {
   }

   public void a(cln $$0) {
   }

   public void a(czx $$0) {
   }

   public void a(dba $$0) {
   }

   public void a(dam $$0) {
   }

   public void a(btk $$0, bdq $$1) {
   }

   public OptionalInt a(@Nullable bea $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cll $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cfz $$0, bdw $$1) {
   }

   public bdx a(bfj $$0, bdw $$1) {
      if (this.G_()) {
         if ($$0 instanceof bea) {
            this.a((bea)$$0);
         }

         return bdx.d;
      } else {
         cfz $$2 = this.b($$1);
         cfz $$3 = $$2.p();
         bdx $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cn.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bfz) {
               if (this.cn.d) {
                  $$2 = $$3;
               }

               bdx $$5 = $$2.a(this, (bfz)$$0, $$1);
               if ($$5.a()) {
                  this.dI().a(dgl.r, $$0.dg(), dgl.a.a(this));
                  if ($$2.b() && !this.cn.d) {
                     this.a($$1, cfz.b);
                  }

                  return $$5;
               }
            }

            return bdx.d;
         }
      }
   }

   @Override
   public double bw() {
      return -0.35;
   }

   @Override
   public void bA() {
      super.bA();
      this.I = 0;
   }

   @Override
   protected boolean eT() {
      return super.eT() || this.fy();
   }

   @Override
   public boolean dW() {
      return !this.cn.b;
   }

   @Override
   protected eei a(eei $$0, bgf $$1) {
      if (!this.cn.b && $$0.d <= 0.0 && ($$1 == bgf.a || $$1 == bgf.b) && this.fF() && this.y()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dI().a(this, this.cE().d($$2, (double)(-this.dC()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dI().a(this, this.cE().d(0.0, (double)(-this.dC()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dI().a(this, this.cE().d($$2, (double)(-this.dC()), $$3))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }

            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         $$0 = new eei($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean y() {
      return this.ay() || this.aa < this.dC() && !this.dI().a(this, this.cE().d(0.0, (double)(this.aa - this.dC()), 0.0));
   }

   public void d(bfj $$0) {
      if ($$0.cn()) {
         if (!$$0.r(this)) {
            float $$1 = (float)this.b(bhg.f);
            float $$2;
            if ($$0 instanceof bfz) {
               $$2 = cki.a(this.eO(), ((bfz)$$0).eN());
            } else {
               $$2 = cki.a(this.eO(), bge.a);
            }

            float $$4 = this.A(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gh();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cki.c(this);
               if (this.bV() && $$5) {
                  this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.sq, this.cY(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.aa > 0.0F && !this.ay() && !this.i_() && !this.aV() && !this.a(bfc.o) && !this.bM() && $$0 instanceof bfz;
               $$8 = $$8 && !this.bV();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.X - this.W);
               if ($$5 && !$$8 && !$$6 && this.ay() && $$10 < (double)this.fa()) {
                  cfz $$11 = this.b(bdw.a);
                  if ($$11.d() instanceof chk) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cki.d(this);
               if ($$0 instanceof bfz) {
                  $$12 = ((bfz)$$0).er();
                  if ($$14 > 0 && !$$0.bL()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               eei $$15 = $$0.dl();
               boolean $$16 = $$0.a(this.dJ().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bfz) {
                        ((bfz)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)apa.a(this.dy() * (float) (Math.PI / 180.0)),
                              (double)(-apa.b(this.dy() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-apa.a(this.dy() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(apa.b(this.dy() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.dl().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cki.a(this) * $$1;

                     for (bfz $$19 : this.dI().a(bfz.class, $$0.cE().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.p($$19) && (!($$19 instanceof bux) || !((bux)$$19).w()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)apa.a(this.dy() * (float) (Math.PI / 180.0)), (double)(-apa.b(this.dy() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dJ().a(this), $$17);
                        }
                     }

                     this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.st, this.cY(), 1.0F, 1.0F);
                     this.fK();
                  }

                  if ($$0 instanceof aig && $$0.S) {
                     ((aig)$$0).c.a(new xy($$0));
                     $$0.S = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.sp, this.cY(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.ss, this.cY(), 1.0F, 1.0F);
                     } else {
                        this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.su, this.cY(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.x($$0);
                  if ($$0 instanceof bfz) {
                     cki.a((bfz)$$0, this);
                  }

                  cki.b(this, $$0);
                  cfz $$20 = this.eO();
                  bfj $$21 = $$0;
                  if ($$0 instanceof btz) {
                     $$21 = ((btz)$$0).b;
                  }

                  if (!this.dI().B && !$$20.b() && $$21 instanceof bfz) {
                     $$20.a((bfz)$$21, this);
                     if ($$20.b()) {
                        this.a(bdw.a, cfz.b);
                     }
                  }

                  if ($$0 instanceof bfz) {
                     float $$22 = $$12 - ((bfz)$$0).er();
                     this.a(amr.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dI() instanceof aif && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((aif)this.dI()).a(iv.h, $$0.dn(), $$0.e(0.5), $$0.dt(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.z(0.1F);
               } else {
                  this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.sr, this.cY(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.aw();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bfz $$0) {
      this.d((bfj)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cki.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.af.i() < $$1) {
         this.gi().a(cgc.uy, 100);
         this.fo();
         this.dI().a(this, (byte)30);
      }
   }

   @Override
   public void a(bfj $$0) {
   }

   public void b(bfj $$0) {
   }

   public void fK() {
      double $$0 = (double)(-apa.a(this.dy() * (float) (Math.PI / 180.0)));
      double $$1 = (double)apa.b(this.dy() * (float) (Math.PI / 180.0));
      if (this.dI() instanceof aif) {
         ((aif)this.dI()).a(iv.ad, this.dn() + $$0, this.e(0.5), this.dt() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fL() {
   }

   @Override
   public void a(bfj.c $$0) {
      super.a($$0);
      this.bQ.b(this);
      if (this.bR != null && this.fP()) {
         this.r();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fM() {
      return this.cp;
   }

   public byn fN() {
      return this.cl;
   }

   public byl fO() {
      return this.cn;
   }

   public void a(cfz $$0, cfz $$1, cbn $$2) {
   }

   public boolean fP() {
      return this.bR != this.bQ;
   }

   public Either<byo.a, apz> a(gu $$0) {
      this.b($$0);
      this.cm = 0;
      return Either.right(apz.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fz();
      if (this.dI() instanceof aif && $$1) {
         ((aif)this.dI()).e();
      }

      this.cm = $$0 ? 0 : 100;
   }

   @Override
   public void fz() {
      this.a(true, true);
   }

   public static Optional<eei> a(aif $$0, gu $$1, float $$2, boolean $$3, boolean $$4) {
      dcb $$5 = $$0.a_($$1);
      cpn $$6 = $$5.b();
      if ($$6 instanceof cvu && ($$3 || $$5.c(cvu.c) > 0) && cvu.a($$0)) {
         Optional<eei> $$7 = cvu.a(bfn.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(cvu.c, Integer.valueOf($$5.c(cvu.c) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cpg && cpg.a($$0)) {
         return cpg.a(bfn.bt, $$0, $$1, $$5.c(cpg.aC), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dcb $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new eei((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fQ() {
      return this.fy() && this.cm >= 100;
   }

   public int fR() {
      return this.cm;
   }

   public void a(sw $$0, boolean $$1) {
   }

   public void a(acq $$0) {
      this.b(amr.i.b($$0));
   }

   public void a(acq $$0, int $$1) {
      this.a(amr.i.b($$0), $$1);
   }

   public void b(amo<?> $$0) {
      this.a($$0, 1);
   }

   public void a(amo<?> $$0, int $$1) {
   }

   public void a(amo<?> $$0) {
   }

   public int a(Collection<cjc<?>> $$0) {
      return 0;
   }

   public void a(cjc<?> $$0, List<cfz> $$1) {
   }

   public void a(acq[] $$0) {
   }

   public int b(Collection<cjc<?>> $$0) {
      return 0;
   }

   @Override
   public void eW() {
      super.eW();
      this.a(amr.E);
      if (this.bV()) {
         this.z(0.2F);
      } else {
         this.z(0.05F);
      }
   }

   @Override
   public void h(eei $$0) {
      double $$1 = this.dn();
      double $$2 = this.dp();
      double $$3 = this.dt();
      if (this.bW() && !this.bM()) {
         double $$4 = this.bD().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bk || !this.dI().a_(gu.a(this.dn(), this.dp() + 1.0 - 0.1, this.dt())).u().c()) {
            eei $$6 = this.dl();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cn.b && !this.bM()) {
         double $$7 = this.dl().d;
         super.h($$0);
         eei $$8 = this.dl();
         this.o($$8.c, $$7 * 0.6, $$8.e);
         this.n();
         this.b(7, false);
      } else {
         super.h($$0);
      }

      this.r(this.dn() - $$1, this.dp() - $$2, this.dt() - $$3);
   }

   @Override
   public void ba() {
      if (this.cn.b) {
         this.h(false);
      } else {
         super.ba();
      }
   }

   protected boolean h(gu $$0) {
      return !this.dI().a_($$0).o(this.dI(), $$0);
   }

   @Override
   public float fa() {
      return (float)this.b(bhg.d);
   }

   public void r(double $$0, double $$1, double $$2) {
      if (!this.bM()) {
         if (this.bW()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(amr.C, $$3);
               this.z(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(anb.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(amr.w, $$4);
               this.z(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aV()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(amr.s, $$5);
               this.z(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.i_()) {
            if ($$1 > 0.0) {
               this.a(amr.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.ay()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bV()) {
                  this.a(amr.r, $$6);
                  this.z(0.1F * (float)$$6 * 0.01F);
               } else if (this.bU()) {
                  this.a(amr.q, $$6);
                  this.z(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(amr.p, $$6);
                  this.z(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fr()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(amr.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(amr.v, $$8);
            }
         }
      }
   }

   private void s(double $$0, double $$1, double $$2) {
      if (this.bM()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            bfj $$4 = this.cW();
            if ($$4 instanceof caf) {
               this.a(amr.x, $$3);
            } else if ($$4 instanceof cah) {
               this.a(amr.y, $$3);
            } else if ($$4 instanceof bsc) {
               this.a(amr.z, $$3);
            } else if ($$4 instanceof btk) {
               this.a(amr.A, $$3);
            } else if ($$4 instanceof bwp) {
               this.a(amr.D, $$3);
            }
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, ben $$2) {
      if (this.cn.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(amr.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fS() {
      if (!this.ay() && !this.fr() && !this.aV() && !this.a(bfc.y)) {
         cfz $$0 = this.c(bfo.e);
         if ($$0.a(cgc.nh) && cet.d($$0)) {
            this.fT();
            return true;
         }
      }

      return false;
   }

   public void fT() {
      this.b(7, true);
   }

   public void fU() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bd() {
      if (!this.G_()) {
         super.bd();
      }
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      if (this.aV()) {
         this.aN();
         this.b($$1);
      } else {
         gu $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dcb $$3 = this.dI().a_($$2);
            if ($$3.a(amw.bm)) {
               this.a($$3, $$1);
            } else {
               super.b($$2, $$3);
            }
         } else {
            super.b($$0, $$1);
         }
      }
   }

   @Override
   public bfz.a eC() {
      return new bfz.a(amh.sF, amh.sv);
   }

   @Override
   public boolean a(aif $$0, bfz $$1) {
      this.b(amr.g.b($$1.ae()));
      return true;
   }

   @Override
   public void a(dcb $$0, eei $$1) {
      if (!this.cn.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.cg = this.cg + (float)$$0 / (float)this.fW();
      this.cf = apa.a(this.cf + $$0, 0, Integer.MAX_VALUE);

      while (this.cg < 0.0F) {
         float $$1 = this.cg * (float)this.fW();
         if (this.ce > 0) {
            this.c(-1);
            this.cg = 1.0F + $$1 / (float)this.fW();
         } else {
            this.c(-1);
            this.cg = 0.0F;
         }
      }

      while (this.cg >= 1.0F) {
         this.cg = (this.cg - 1.0F) * (float)this.fW();
         this.c(1);
         this.cg = this.cg / (float)this.fW();
      }
   }

   public int fV() {
      return this.ch;
   }

   @Override
   public void a(cfz $$0, int $$1) {
      this.ce -= $$1;
      if (this.ce < 0) {
         this.ce = 0;
         this.cg = 0.0F;
         this.cf = 0;
      }

      this.ch = this.af.f();
   }

   public void c(int $$0) {
      this.ce += $$0;
      if (this.ce < 0) {
         this.ce = 0;
         this.cg = 0.0F;
         this.cf = 0;
      }

      if ($$0 > 0 && this.ce % 5 == 0 && (float)this.co < (float)this.ag - 100.0F) {
         float $$1 = this.ce > 30 ? 1.0F : (float)this.ce / 30.0F;
         this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.sE, this.cY(), $$1 * 0.75F, 1.0F);
         this.co = this.ag;
      }
   }

   public int fW() {
      if (this.ce >= 30) {
         return 112 + (this.ce - 30) * 9;
      } else {
         return this.ce >= 15 ? 37 + (this.ce - 15) * 5 : 7 + this.ce * 2;
      }
   }

   public void z(float $$0) {
      if (!this.cn.a) {
         if (!this.dI().B) {
            this.bS.a($$0);
         }
      }
   }

   public Optional<bxu> W() {
      return Optional.empty();
   }

   public cbb fX() {
      return this.bS;
   }

   public boolean t(boolean $$0) {
      return this.cn.a || $$0 || this.bS.c();
   }

   public boolean fY() {
      return this.er() > 0.0F && this.er() < this.eI();
   }

   public boolean fZ() {
      return this.cn.e;
   }

   public boolean a(gu $$0, ha $$1, cfz $$2) {
      if (this.cn.e) {
         return true;
      } else {
         gu $$3 = $$0.a($$1.g());
         dcf $$4 = new dcf(this.dI(), $$3, false);
         return $$2.a(this.dI().B_().d(jc.e), $$4);
      }
   }

   @Override
   public int ea() {
      if (!this.dI().X().b(cmi.d) && !this.G_()) {
         int $$0 = this.ce * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean eb() {
      return true;
   }

   @Override
   public boolean cz() {
      return true;
   }

   @Override
   protected bfj.b aS() {
      return this.cn.b || this.ay() && this.bS() ? bfj.b.a : bfj.b.d;
   }

   public void w() {
   }

   @Override
   public sw Z() {
      return sw.b(this.cp.getName());
   }

   public cco ga() {
      return this.bP;
   }

   @Override
   public cfz c(bfo $$0) {
      if ($$0 == bfo.a) {
         return this.cl.f();
      } else if ($$0 == bfo.b) {
         return this.cl.k.get(0);
      } else {
         return $$0.a() == bfo.a.b ? this.cl.j.get($$0.b()) : cfz.b;
      }
   }

   @Override
   protected boolean a(bfo $$0) {
      return $$0.a() == bfo.a.b;
   }

   @Override
   public void a(bfo $$0, cfz $$1) {
      this.e($$1);
      if ($$0 == bfo.a) {
         this.a($$0, this.cl.i.set(this.cl.l, $$1), $$1);
      } else if ($$0 == bfo.b) {
         this.a($$0, this.cl.k.set(0, $$1), $$1);
      } else if ($$0.a() == bfo.a.b) {
         this.a($$0, this.cl.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cfz $$0) {
      return this.cl.e($$0);
   }

   @Override
   public Iterable<cfz> bI() {
      return Lists.newArrayList(new cfz[]{this.eO(), this.eP()});
   }

   @Override
   public Iterable<cfz> bJ() {
      return this.cl.j;
   }

   public boolean h(qr $$0) {
      if (this.bM() || !this.ay() || this.aV() || this.az) {
         return false;
      } else if (this.ge().g()) {
         this.i($$0);
         this.g = this.dI().V();
         return true;
      } else if (this.gf().g()) {
         this.j($$0);
         this.g = this.dI().V();
         return true;
      } else {
         return false;
      }
   }

   protected void gb() {
      if (this.g + 20L < this.dI().V()) {
         this.k(this.ge());
         this.i(new qr());
         this.k(this.gf());
         this.j(new qr());
      }
   }

   private void k(qr $$0) {
      if (!this.dI().B && !$$0.g()) {
         bfn.a($$0, this.dI()).ifPresent($$0x -> {
            if ($$0x instanceof bgv) {
               ((bgv)$$0x).b(this.ax);
            }

            $$0x.e(this.dn(), this.dp() + 0.7F, this.dt());
            ((aif)this.dI()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean G_();

   @Override
   public boolean bn() {
      return !this.G_() && super.bn();
   }

   @Override
   public boolean bW() {
      return !this.cn.b && !this.G_() && super.bW();
   }

   public abstract boolean f();

   @Override
   public boolean cw() {
      return !this.cn.b;
   }

   public efg gc() {
      return this.dI().I();
   }

   @Override
   public sw H_() {
      tj $$0 = efe.a(this.cd(), this.Z());
      return this.a($$0);
   }

   private tj a(tj $$0) {
      String $$1 = this.fM().getName();
      return $$0.a($$1x -> $$1x.a(new su(su.a.d, "/tell " + $$1 + " ")).a(this.cD()).a($$1));
   }

   @Override
   public String cv() {
      return this.fM().getName();
   }

   @Override
   public float b(bgl $$0, bfk $$1) {
      switch ($$0) {
         case d:
         case b:
         case e:
            return 0.4F;
         case f:
            return 1.27F;
         default:
            return 1.62F;
      }
   }

   @Override
   public void y(float $$0) {
      if ($$0 < 0.0F) {
         $$0 = 0.0F;
      }

      this.aj().b(e, $$0);
   }

   @Override
   public float ff() {
      return this.aj().b(e);
   }

   public boolean a(byp $$0) {
      return (this.aj().b(bL) & $$0.a()) == $$0.a();
   }

   @Override
   public bgs a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cl.i.size()) {
         return bgs.a(this.cl, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bP.b() ? bgs.a(this.bP, $$1) : super.a_($$0);
      }
   }

   public boolean gd() {
      return this.cq;
   }

   public void u(boolean $$0) {
      this.cq = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cn.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bft fh() {
      return this.am.b(bM) == 0 ? bft.a : bft.b;
   }

   public void a(bft $$0) {
      this.am.b(bM, (byte)($$0 == bft.a ? 0 : 1));
   }

   public qr ge() {
      return this.am.b(bN);
   }

   protected void i(qr $$0) {
      this.am.b(bN, $$0);
   }

   public qr gf() {
      return this.am.b(bO);
   }

   protected void j(qr $$0) {
      this.am.b(bO, $$0);
   }

   public float gg() {
      return (float)(1.0 / this.b(bhg.h) * 20.0);
   }

   public float A(float $$0) {
      return apa.a(((float)this.aQ + $$0) / this.gg(), 0.0F, 1.0F);
   }

   public void gh() {
      this.aQ = 0;
   }

   public cfv gi() {
      return this.cs;
   }

   @Override
   protected float aH() {
      return !this.cn.b && !this.fr() ? super.aH() : 1.0F;
   }

   public float gj() {
      return (float)this.b(bhg.k);
   }

   public boolean gk() {
      return this.cn.d && this.B() >= 2;
   }

   @Override
   public boolean f(cfz $$0) {
      bfo $$1 = bgb.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bfk a(bgl $$0) {
      return c.getOrDefault($$0, bK);
   }

   @Override
   public ImmutableList<bgl> fv() {
      return ImmutableList.of(bgl.a, bgl.f, bgl.d);
   }

   @Override
   public cfz g(cfz $$0) {
      if (!($$0.d() instanceof cgp)) {
         return cfz.b;
      } else {
         Predicate<cfz> $$1 = ((cgp)$$0.d()).e();
         cfz $$2 = cgp.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cgp)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cl.b(); $$3++) {
               cfz $$4 = this.cl.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cn.d ? new cfz(cgc.nH) : cfz.b;
         }
      }
   }

   @Override
   public cfz a(cmm $$0, cfz $$1) {
      this.fX().a($$1.d(), $$1);
      this.b(amr.c.b($$1.d()));
      $$0.a(null, this.dn(), this.dp(), this.dt(), amh.sx, ami.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aig) {
         ai.z.a((aig)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dcb $$0) {
      return this.cn.b || super.c($$0);
   }

   @Override
   public eei q(float $$0) {
      double $$1 = 0.22 * (this.fh() == bft.b ? -1.0 : 1.0);
      float $$2 = apa.i($$0 * 0.5F, this.dA(), this.N) * (float) (Math.PI / 180.0);
      float $$3 = apa.i($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fr() || this.fe()) {
         eei $$4 = this.f($$0);
         eei $$5 = this.dl();
         double $$6 = $$5.i();
         double $$7 = $$4.i();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.c * $$4.c + $$5.e * $$4.e) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.c * $$4.e - $$5.e * $$4.c;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.l($$0).e(new eei($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bX()) {
         return this.l($$0).e(new eei($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cE().c() - 1.0;
         double $$13 = this.bU() ? -0.2 : 0.07;
         return this.l($$0).e(new eei($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dH() {
      return true;
   }

   public boolean gl() {
      return this.fi() && this.fk().a(cgc.qj);
   }

   @Override
   public boolean dG() {
      return false;
   }

   public Optional<hd> gm() {
      return this.ct;
   }

   public void a(Optional<hd> $$0) {
      this.ct = $$0;
   }

   @Override
   public float eB() {
      return this.ck;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.ck = $$0;
   }

   @Override
   public boolean dB() {
      return true;
   }

   @Override
   protected float eZ() {
      if (this.cn.b && !this.bM()) {
         return this.bV() ? this.cn.a() * 2.0F : this.cn.a();
      } else {
         return this.bV() ? 0.025999999F : 0.02F;
      }
   }

   public static enum a {
      a,
      b(sw.c("block.minecraft.bed.no_sleep")),
      c(sw.c("block.minecraft.bed.too_far_away")),
      d(sw.c("block.minecraft.bed.obstructed")),
      e,
      f(sw.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final sw g;

      private a() {
         this.g = null;
      }

      private a(sw $$0) {
         this.g = $$0;
      }

      @Nullable
      public sw a() {
         return this.g;
      }
   }
}
