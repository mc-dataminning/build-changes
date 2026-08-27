import com.google.common.collect.Lists;
import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akl extends cbn {
   private static final Logger b = LogUtils.getLogger();
   private static final int ck = 32;
   private static final int cl = 10;
   public ali c;
   public final MinecraftServer d;
   public final akm e;
   private final aez cm;
   private final apc cn;
   private float co = Float.MIN_VALUE;
   private int cp = Integer.MIN_VALUE;
   private int cq = Integer.MIN_VALUE;
   private int cr = Integer.MIN_VALUE;
   private int cs = Integer.MIN_VALUE;
   private int ct = Integer.MIN_VALUE;
   private float cu = -1.0E8F;
   private int cv = -99999999;
   private boolean cw = true;
   private int cx = -99999999;
   private int cy = 60;
   private cbl cz = cbl.a;
   private boolean cA = true;
   private long cB = ac.b();
   @Nullable
   private bii cC;
   private boolean cD;
   private boolean cE;
   private final apb cF = new apb();
   @Nullable
   private ehe cG;
   private int cH;
   private boolean cI;
   private OptionalInt cJ = OptionalInt.empty();
   @Nullable
   private ehe cK;
   @Nullable
   private ehe cL;
   @Nullable
   private ehe cM;
   private hx cN = hx.a(0, 0, 0);
   private ajz cO = ajz.a;
   private aeq<cpm> cP = cpm.h;
   @Nullable
   private gu cQ;
   private boolean cR;
   private float cS;
   private final aln cT;
   private boolean cU;
   private boolean cV;
   private cat cW = new cat(0, 0, 0);
   private final cer cX = new cer() {
      @Override
      public void a(cee $$0, hn<ciy> $$1, ciy $$2, int[] $$3) {
         akl.this.c.b(new xk($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cee $$0, int $$1, ciy $$2) {
         akl.this.c.b(new xm($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cee $$0, ciy $$1) {
         akl.this.c.b(new xm(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cee $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cee $$0, int $$1, int $$2) {
         akl.this.c.b(new xl($$0.j, $$1, $$2));
      }
   };
   private final ceq cY = new ceq() {
      @Override
      public void a(cee $$0, int $$1, ciy $$2) {
         cfw $$3 = $$0.b($$1);
         if (!($$3 instanceof cfs)) {
            if ($$3.d == akl.this.fQ()) {
               ai.e.a(akl.this, akl.this.fQ(), $$2);
            }
         }
      }

      @Override
      public void a(cee $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private tv cZ;
   private int da;
   public boolean f;

   public akl(MinecraftServer $$0, akk $$1, GameProfile $$2) {
      super($$1, $$1.R(), $$1.S(), $$2);
      this.cT = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cn = $$0.ac().a((cbn)this);
      this.cm = $$0.ac().f(this);
      this.t(1.0F);
      this.e($$1);
   }

   private void e(akk $$0) {
      gu $$1 = $$0.R();
      if ($$0.x_().g() && $$0.n().aU().m() != cpj.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = arp.a($$0.w_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.u($$6);
         int $$8 = aru.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            gu $$13 = akf.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dr() < (double)($$0.aj() - 1)) {
            this.e(this.dp(), this.dr() + 1.0, this.dv());
         }
      }
   }

   private int u(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cat.a.parse(new Dynamic(rc.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.cW = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         qr $$1 = $$0.p("enteredNetherPosition");
         this.cL = new ehe($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cE = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cF.a($$0.p("recipeBook"), this.d.aE());
      }

      if (this.fB()) {
         this.fC();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.cQ = new gu($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.cR = $$0.q("SpawnForced");
         this.cS = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.cP = cpm.g.parse(rc.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cpm.h);
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cat.a.encodeStart(rc.a, this.cW).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cE);
      if (this.cL != null) {
         qr $$1 = new qr();
         $$1.a("x", this.cL.c);
         $$1.a("y", this.cL.d);
         $$1.a("z", this.cL.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bii $$2 = this.cV();
      bii $$3 = this.cY();
      if ($$3 != null && $$2 != this && $$2.cU()) {
         qr $$4 = new qr();
         qr $$5 = new qr();
         $$2.e($$5);
         $$4.a("Attach", $$3.cv());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cF.b());
      $$0.a("Dimension", this.dK().ac().a().toString());
      if (this.cQ != null) {
         $$0.a("SpawnX", this.cQ.u());
         $$0.a("SpawnY", this.cQ.v());
         $$0.a("SpawnZ", this.cQ.w());
         $$0.a("SpawnForced", this.cR);
         $$0.a("SpawnAngle", this.cS);
         aer.a.encodeStart(rc.a, this.cP.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.fZ();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cf = arp.a((float)$$0 / $$1, 0.0F, $$2);
      this.cx = -1;
   }

   public void b(int $$0) {
      this.cd = $$0;
      this.cx = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cx = -1;
   }

   @Override
   public void a(ciy $$0, int $$1) {
      super.a($$0, $$1);
      this.cx = -1;
   }

   private void a(cee $$0) {
      $$0.a(this.cY);
      $$0.a(this.cX);
   }

   public void h() {
      this.a(this.bP);
   }

   @Override
   public void Q_() {
      super.Q_();
      this.c.b(new yr());
   }

   @Override
   public void F_() {
      super.F_();
      this.c.b(new yq(this.eI()));
   }

   @Override
   protected void a(dfa $$0) {
      ai.d.a(this, $$0);
   }

   @Override
   protected ciu k() {
      return new cjt(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.cW.a();
      this.cy--;
      if (this.al > 0) {
         this.al--;
      }

      this.bQ.d();
      if (!this.dK().B && !this.bQ.a(this)) {
         this.q();
         this.bQ = this.bP;
      }

      bii $$0 = this.H();
      if ($$0 != this) {
         if ($$0.bv()) {
            this.a($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC());
            this.x().k().a(this);
            if (this.fH()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      ai.w.a(this);
      if (this.cG != null) {
         ai.u.a(this, this.cG, this.ah - this.cH);
      }

      this.o();
      this.p();
      this.cm.b(this);
   }

   @Override
   public void m() {
      try {
         if (!this.G_() || !this.dd()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fQ().b(); $$0++) {
            ciy $$1 = this.fQ().a($$0);
            if ($$1.d().ad_()) {
               ux<?> $$2 = ((chd)$$1.d()).a($$1, this.dK(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.et() != this.cu || this.cv != this.bR.a() || this.bR.e() == 0.0F != this.cw) {
            this.c.b(new zw(this.et(), this.bR.a(), this.bR.e()));
            this.cu = this.et();
            this.cv = this.bR.a();
            this.cw = this.bR.e() == 0.0F;
         }

         if (this.et() + this.fi() != this.co) {
            this.co = this.et() + this.fi();
            this.a(eig.f, arp.f(this.co));
         }

         if (this.bR.a() != this.cp) {
            this.cp = this.bR.a();
            this.a(eig.g, arp.f((float)this.cp));
         }

         if (this.ch() != this.cq) {
            this.cq = this.ch();
            this.a(eig.h, arp.f((float)this.cq));
         }

         if (this.eH() != this.cr) {
            this.cr = this.eH();
            this.a(eig.i, arp.f((float)this.cr));
         }

         if (this.ce != this.ct) {
            this.ct = this.ce;
            this.a(eig.j, arp.f((float)this.ct));
         }

         if (this.cd != this.cs) {
            this.cs = this.cd;
            this.a(eig.k, arp.f((float)this.cs));
         }

         if (this.ce != this.cx) {
            this.cx = this.ce;
            this.c.b(new zv(this.cf, this.ce, this.cd));
         }

         if (this.ah % 20 == 0) {
            ai.p.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new y($$4);
      }
   }

   @Override
   public void n() {
      if (this.et() > 0.0F && this.cK != null) {
         ai.U.a(this, this.cK);
      }

      this.cK = null;
      super.n();
   }

   public void o() {
      if (this.ab > 0.0F && this.cK == null) {
         this.cK = this.di();
      }
   }

   @Override
   public void p() {
      if (this.cY() != null && this.cY().bl()) {
         if (this.cM == null) {
            this.cM = this.di();
         } else {
            ai.V.a(this, this.cM);
         }
      }

      if (this.cM != null && (this.cY() == null || !this.cY().bl())) {
         this.cM = null;
      }
   }

   private void a(eig $$0, int $$1) {
      this.gf().a($$0, this.cx(), $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(bhg $$0) {
      this.a(djk.p);
      boolean $$1 = this.dK().X().b(cpi.m);
      if ($$1) {
         tf $$2 = this.eI().a();
         this.c.a(new ys(this.ah(), $$2), sp.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            tf $$3x = tf.a("death.attack.message_too_long", tf.b($$2x).a(n.o));
            tf $$4x = tf.a("death.attack.even_more_magic", this.H_()).a($$1xx -> $$1xx.a(new tk(tk.a.a, $$3x)));
            return new ys(this.ah(), $$4x);
         }));
         eif $$3 = this.cf();
         if ($$3 == null || $$3.k() == eif.b.a) {
            this.d.ac().a($$2, false);
         } else if ($$3.k() == eif.b.c) {
            this.d.ac().a(this, $$2);
         } else if ($$3.k() == eif.b.d) {
            this.d.ac().b(this, $$2);
         }
      } else {
         this.c.b(new ys(this.ah(), te.a));
      }

      this.ge();
      if (this.dK().X().b(cpi.J)) {
         this.gq();
      }

      if (!this.G_()) {
         this.g($$0);
      }

      this.gf().a(eig.c, this.cx(), eic::a);
      biy $$4 = this.eJ();
      if ($$4 != null) {
         this.b(apg.h.b($$4.ag()));
         $$4.a(this, this.bh, $$0);
         this.f($$4);
      }

      this.dK().a(this, (byte)3);
      this.a(apg.N);
      this.a(apg.i.b(apg.m));
      this.a(apg.i.b(apg.n));
      this.ay();
      this.k(0);
      this.a_(false);
      this.eI().c();
      this.a(Optional.of(hd.a(this.dK().ac(), this.dk())));
   }

   private void gq() {
      egz $$0 = new egz(this.dk()).c(32.0, 10.0, 32.0);
      this.dK().a(bja.class, $$0, bil.f).stream().filter($$0x -> $$0x instanceof bjf).forEach($$0x -> ((bjf)$$0x).a_((cbn)this));
   }

   @Override
   public void a(bii $$0, int $$1, bhg $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         String $$3 = this.cx();
         String $$4 = $$0.cx();
         this.gf().a(eig.e, $$3, eic::a);
         if ($$0 instanceof cbn) {
            this.a(apg.Q);
            this.gf().a(eig.d, $$3, eic::a);
         } else {
            this.a(apg.O);
         }

         this.a($$3, $$4, eig.l);
         this.a($$4, $$3, eig.m);
         ai.b.a(this, $$0, $$2);
      }
   }

   private void a(String $$0, String $$1, eig[] $$2) {
      eib $$3 = this.gf().g($$1);
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gf().a($$2[$$4], $$0, eic::a);
         }
      }
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.l() && this.gr() && $$0.a(apn.m);
         if (!$$2 && this.cy > 0 && !$$0.a(apn.d)) {
            return false;
         } else {
            bii $$3 = $$0.d();
            if ($$3 instanceof cbn $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cbt $$5 && $$5.v() instanceof cbn $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return !this.gr() ? false : super.a($$0);
   }

   private boolean gr() {
      return this.d.Y();
   }

   @Nullable
   @Override
   protected eba a(akk $$0) {
      eba $$1 = super.a($$0);
      if ($$1 != null && this.dK().ac() == cpm.h && $$0.ac() == cpm.j) {
         ehe $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new eba($$2, ehe.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bii b(akk $$0) {
      this.cD = true;
      akk $$1 = this.x();
      aeq<cpm> $$2 = $$1.ac();
      if ($$2 == cpm.j && $$0.ac() == cpm.h) {
         this.ae();
         this.x().a(this, bii.c.e);
         if (!this.f) {
            this.f = true;
            this.c.b(new xv(xv.e, this.cE ? 0.0F : 1.0F));
            this.cE = true;
         }

         return this;
      } else {
         ebu $$3 = $$0.u_();
         this.c.b(new za(this.d($$0), (byte)3));
         this.c.b(new xc($$3.s(), $$3.t()));
         anz $$4 = this.d.ac();
         $$4.d(this);
         $$1.a(this, bii.c.e);
         this.dH();
         eba $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ad().a("moving");
            if ($$2 == cpm.h && $$0.ac() == cpm.i) {
               this.cL = this.di();
            } else if ($$0.ac() == cpm.j) {
               this.a($$0, gu.a($$5.a));
            }

            $$1.ad().c();
            $$1.ad().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.m();
            $$0.b(this);
            $$1.ad().c();
            this.f($$1);
            this.c.b(new yo(this.fR()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bhv $$6 : this.eq()) {
               this.c.b(new aar(this.ah(), $$6));
            }

            this.c.b(new yb(1032, gu.b, 0, false));
            this.cx = -1;
            this.cu = -1.0F;
            this.cv = -1;
         }

         return this;
      }
   }

   private void a(akk $$0, gu $$1) {
      gu.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dfa $$6 = $$5 == -1 ? csn.co.n() : csn.a.n();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(akk $$0, gu $$1, boolean $$2, dgr $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ha.a $$5 = this.dK().a_(this.ax).d(cxo.a).orElse(ha.a.a);
         Optional<l.a> $$6 = $$0.o().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(akk $$0) {
      aeq<cpm> $$1 = $$0.ac();
      aeq<cpm> $$2 = this.dK().ac();
      ai.v.a(this, $$1, $$2);
      if ($$1 == cpm.i && $$2 == cpm.h && this.cL != null) {
         ai.C.a(this, this.cL);
      }

      if ($$2 != cpm.i) {
         this.cL = null;
      }
   }

   @Override
   public boolean a(akl $$0) {
      if ($$0.G_()) {
         return this.H() == this;
      } else {
         return this.G_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bii $$0, int $$1) {
      super.a($$0, $$1);
      this.bQ.d();
   }

   @Override
   public Either<cbn.a, asp> a(gu $$0) {
      ha $$1 = this.dK().a_($$0).c(cwf.aC);
      if (this.fB() || !this.bv()) {
         return Either.left(cbn.a.e);
      } else if (!this.dK().x_().j()) {
         return Either.left(cbn.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cbn.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cbn.a.d);
      } else {
         this.a(this.dK().ac(), $$0, this.dA(), false, true);
         if (this.dK().N()) {
            return Either.left(cbn.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ehe $$4 = ehe.c($$0);
               List<bzb> $$5 = this.dK()
                  .a(bzb.class, new egz($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cbn.a.f);
               }
            }

            Either<cbn.a, asp> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(apg.ap);
               ai.q.a(this);
            });
            if (!this.x().d()) {
               this.a(tf.c("sleep.not_possible"), true);
            }

            ((akk)this.dK()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(gu $$0) {
      this.a(apg.i.b(apg.n));
      super.b($$0);
   }

   private boolean a(gu $$0, ha $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(gu $$0) {
      ehe $$1 = ehe.c($$0);
      return Math.abs(this.dp() - $$1.a()) <= 3.0 && Math.abs(this.dr() - $$1.b()) <= 2.0 && Math.abs(this.dv() - $$1.c()) <= 3.0;
   }

   private boolean b(gu $$0, ha $$1) {
      gu $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fB()) {
         this.x().k().a(this, new wt(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bB();
      this.e($$0, $$1, $$2);
   }

   @Override
   public boolean b(bhg $$0) {
      return super.b($$0) || this.L();
   }

   @Override
   protected void a(double $$0, boolean $$1, dfa $$2, gu $$3) {
   }

   @Override
   protected void c(gu $$0) {
      if (!this.G_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dd()) {
         this.b($$3, new ehe($$0, $$1, $$2));
         gu $$4 = this.aF();
         super.a($$1, $$3, this.dK().a_($$4), $$4);
      }
   }

   @Override
   public void a(ddu $$0, boolean $$1) {
      this.c.b(new wz(this.dK(), $$0.p()));
      this.c.b(new ym($$0.p(), $$1));
   }

   private void gs() {
      this.da = this.da % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bgt $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bQ != this.bP) {
            this.q();
         }

         this.gs();
         cee $$1 = $$0.createMenu(this.da, this.fQ(), this);
         if ($$1 == null) {
            if (this.G_()) {
               this.a(tf.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new yl($$1.j, $$1.a(), $$0.H_()));
            this.a($$1);
            this.bQ = $$1;
            return OptionalInt.of(this.da);
         }
      }
   }

   @Override
   public void a(int $$0, cok $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new yh($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(bwj $$0, bgj $$1) {
      if (this.bQ != this.bP) {
         this.q();
      }

      this.gs();
      this.c.b(new xw(this.da, $$1.b(), $$0.ah()));
      this.bQ = new cfc(this.da, this.fQ(), $$1, $$0);
      this.a(this.bQ);
   }

   @Override
   public void a(ciy $$0, bgp $$1) {
      if ($$0.a(cjb.th)) {
         if (cku.a($$0, this.dc(), this)) {
            this.bQ.d();
         }

         this.c.b(new yk($$1));
      }
   }

   @Override
   public void a(dcw $$0) {
      this.c.b(wx.a($$0, dcm::o));
   }

   @Override
   public void q() {
      this.c.b(new xj(this.bQ.j));
      this.r();
   }

   @Override
   public void r() {
      this.bQ.b(this);
      this.bP.a(this.bQ);
      this.bQ = this.bP;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bN()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bk = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bm = $$1;
         }

         this.bj = $$2;
         this.f($$3);
      }
   }

   @Override
   public void a(apd<?> $$0, int $$1) {
      this.cn.b(this, $$0, $$1);
      this.gf().a($$0, this.cx(), $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(apd<?> $$0) {
      this.cn.a(this, $$0, 0);
      this.gf().a($$0, this.cx(), eic::c);
   }

   @Override
   public int a(Collection<cmb<?>> $$0) {
      return this.cF.a($$0, this);
   }

   @Override
   public void a(cmb<?> $$0, List<ciy> $$1) {
      ai.Z.a(this, $$0.e(), $$1);
   }

   @Override
   public void a(aer[] $$0) {
      List<cmb<?>> $$1 = Lists.newArrayList();

      for (aer $$2 : $$0) {
         this.d.aE().a($$2).ifPresent($$1::add);
      }

      this.a($$1);
   }

   @Override
   public int b(Collection<cmb<?>> $$0) {
      return this.cF.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cx = -1;
   }

   @Override
   public void s() {
      this.cI = true;
      this.bA();
      if (this.fB()) {
         this.a(true, false);
      }
   }

   public boolean t() {
      return this.cI;
   }

   public void u() {
      this.cu = -1.0E8F;
   }

   @Override
   public void a(tf $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void Z_() {
      if (!this.bv.b() && this.fl()) {
         this.c.b(new xs(this, (byte)9));
         super.Z_();
      }
   }

   @Override
   public void a(eb.a $$0, ehe $$1) {
      super.a($$0, $$1);
      this.c.b(new yv($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eb.a $$0, bii $$1, eb.a $$2) {
      ehe $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new yv($$0, $$1, $$2));
   }

   public void a(akl $$0, boolean $$1) {
      this.cW = $$0.cW;
      this.cU = $$0.cU;
      this.cZ = $$0.cZ;
      this.e.a($$0.e.b(), $$0.e.c());
      this.w();
      if ($$1) {
         this.fQ().a($$0.fQ());
         this.c($$0.et());
         this.bR = $$0.bR;
         this.cd = $$0.cd;
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.r($$0.fL());
         this.ax = $$0.ax;
      } else if (this.dK().X().b(cpi.d) || $$0.G_()) {
         this.fQ().a($$0.fQ());
         this.cd = $$0.cd;
         this.ce = $$0.ce;
         this.cf = $$0.cf;
         this.r($$0.fL());
      }

      this.cg = $$0.cg;
      this.bO = $$0.bO;
      this.al().b(bK, $$0.al().b(bK));
      this.cx = -1;
      this.cu = -1.0F;
      this.cv = -1;
      this.cF.a($$0.cF);
      this.cE = $$0.cE;
      this.cL = $$0.cL;
      this.cO = $$0.cO;
      this.cJ = $$0.cJ;
      this.i($$0.gh());
      this.j($$0.gi());
      this.a($$0.gp());
   }

   @Override
   protected void a(bhv $$0, @Nullable bii $$1) {
      super.a($$0, $$1);
      this.c.b(new aar(this.ah(), $$0));
      if ($$0.c() == bhx.y) {
         this.cH = this.ah;
         this.cG = this.di();
      }

      ai.A.a(this, $$1);
   }

   @Override
   protected void a(bhv $$0, boolean $$1, @Nullable bii $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new aar(this.ah(), $$0));
      ai.A.a(this, $$2);
   }

   @Override
   protected void a(bhv $$0) {
      super.a($$0);
      this.c.b(new yz(this.ah(), $$0.c()));
      if ($$0.c() == bhx.y) {
         this.cG = null;
      }

      ai.A.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dA(), this.dC(), bjm.g);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a(this.dp() + $$0, this.dr() + $$1, this.dv() + $$2, this.dA(), this.dC(), bjm.f);
   }

   @Override
   public boolean a(akk $$0, double $$1, double $$2, double $$3, Set<bjm> $$4, float $$5, float $$6) {
      cot $$7 = new cot(gu.a($$1, $$2, $$3));
      $$0.k().a(akp.g, $$7, 1, this.ah());
      this.aa();
      if (this.fB()) {
         this.a(true, true);
      }

      if ($$0 == this.dK()) {
         this.c.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.c.m();
   }

   @Override
   public void a(bii $$0) {
      this.x().k().a(this, new wt($$0, 4));
   }

   @Override
   public void b(bii $$0) {
      this.x().k().a(this, new wt($$0, 5));
   }

   @Override
   public void w() {
      if (this.c != null) {
         this.c.b(new yo(this.fR()));
         this.G();
      }
   }

   public akk x() {
      return (akk)this.dK();
   }

   public boolean a(cpj $$0) {
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new xv(xv.d, (float)$$0.a()));
         if ($$0 == cpj.d) {
            this.ge();
            this.aa();
         } else {
            this.c(this);
         }

         this.w();
         this.fj();
         return true;
      }
   }

   @Override
   public boolean G_() {
      return this.e.b() == cpj.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == cpj.b;
   }

   @Override
   public void a(tf $$0) {
      this.b($$0, false);
   }

   public void b(tf $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new aak($$0, $$1), sp.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               tf $$3 = tf.b($$2).a(n.o);
               return new aak(tf.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(tt $$0, boolean $$1, tb.a $$2) {
      if (this.gt()) {
         $$0.a(this, $$1, $$2);
      }
   }

   @Override
   public String y() {
      return this.c.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(abi $$0) {
      this.cJ = OptionalInt.of($$0.d());
      this.cz = $$0.e();
      this.cA = $$0.f();
      this.cU = $$0.i();
      this.cV = $$0.j();
      this.al().b(bK, (byte)$$0.g());
      this.al().b(bL, (byte)($$0.h() == bis.a ? 0 : 1));
   }

   public boolean z() {
      return this.cA;
   }

   public cbl A() {
      return this.cz;
   }

   private boolean v(boolean $$0) {
      return this.cz == cbl.c ? $$0 : true;
   }

   private boolean gt() {
      return this.cz == cbl.a;
   }

   public OptionalInt B() {
      return this.cJ;
   }

   public void a(adu $$0) {
      this.c.b(new ze($$0.a(), $$0.d().map(adu.a::a), $$0.e()));
   }

   @Override
   protected int C() {
      return this.d.c(this.fP());
   }

   @Override
   public void D() {
      this.cB = ac.b();
   }

   public apc E() {
      return this.cn;
   }

   public apb F() {
      return this.cF;
   }

   @Override
   protected void G() {
      if (this.G_()) {
         this.eo();
         this.j(true);
      } else {
         super.G();
      }
   }

   public bii H() {
      return (bii)(this.cC == null ? this : this.cC);
   }

   @Override
   public void c(@Nullable bii $$0) {
      bii $$1 = this.H();
      this.cC = (bii)($$0 == null ? this : $$0);
      if ($$1 != this.cC) {
         if (this.cC.dK() instanceof akk $$2) {
            this.a($$2, this.cC.dp(), this.cC.dr(), this.cC.dv(), Set.of(), this.dA(), this.dC());
         }

         if ($$0 != null) {
            this.x().k().a(this);
         }

         this.c.b(new zl(this.cC));
         this.c.m();
      }
   }

   @Override
   protected void I() {
      if (!this.cD) {
         super.I();
      }
   }

   @Override
   public void d(bii $$0) {
      if (this.e.b() == cpj.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long J() {
      return this.cB;
   }

   @Nullable
   public tf K() {
      return null;
   }

   @Override
   public void a(bgp $$0) {
      super.a($$0);
      this.gk();
   }

   public boolean L() {
      return this.cD;
   }

   public void M() {
      this.cD = false;
   }

   public aez N() {
      return this.cm;
   }

   public void a(akk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.aa();
      if ($$0 == this.dK()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         akk $$6 = this.x();
         ebu $$7 = $$0.u_();
         this.c.b(new za(this.d($$0), (byte)3));
         this.c.b(new xc($$7.s(), $$7.t()));
         this.d.ac().d(this);
         $$6.a(this, bii.c.e);
         this.dH();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ac().a(this, $$0);
         this.d.ac().e(this);
      }
   }

   @Nullable
   public gu O() {
      return this.cQ;
   }

   public float P() {
      return this.cS;
   }

   public aeq<cpm> Q() {
      return this.cP;
   }

   public boolean R() {
      return this.cR;
   }

   public void a(aeq<cpm> $$0, @Nullable gu $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.cQ) && $$0.equals(this.cP);
         if ($$4 && !$$5) {
            this.a(tf.c("block.minecraft.set_spawn"));
         }

         this.cQ = $$1;
         this.cP = $$0;
         this.cS = $$2;
         this.cR = $$3;
      } else {
         this.cQ = null;
         this.cP = cpm.h;
         this.cS = 0.0F;
         this.cR = false;
      }
   }

   public hx S() {
      return this.cN;
   }

   public void a(hx $$0) {
      this.cN = $$0;
   }

   public ajz T() {
      return this.cO;
   }

   public void a(ajz $$0) {
      this.cO = $$0;
   }

   @Override
   public void a(aov $$0, aox $$1, float $$2, float $$3) {
      this.c.b(new aah(jb.c.d($$0), $$1, this.dp(), this.dr(), this.dv(), $$2, $$3, this.ag.g()));
   }

   @Override
   public ux<wp> U() {
      return new ws(this);
   }

   @Override
   public byg a(ciy $$0, boolean $$1, boolean $$2) {
      byg $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dK().b($$3);
         ciy $$4 = $$3.j();
         if ($$2) {
            if (!$$4.b()) {
               this.a(apg.f.b($$4.d()), $$0.L());
            }

            this.a(apg.F);
         }

         return $$3;
      }
   }

   public aln V() {
      return this.cT;
   }

   public void c(akk $$0) {
      this.a((cpm)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static cpj a(@Nullable qr $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cpj.a($$0.h($$1)) : null;
   }

   private cpj b(@Nullable cpj $$0) {
      cpj $$1 = this.d.aX();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.o_();
      }
   }

   @Override
   public void c(@Nullable qr $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(qr $$0) {
      $$0.a("playerGameType", this.e.b().a());
      cpj $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean W() {
      return this.cU;
   }

   public boolean b(akl $$0) {
      return $$0 == this ? false : this.cU || $$0.cU;
   }

   @Override
   public boolean a(cpm $$0, gu $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(ciy $$0) {
      ai.T.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cbm $$1 = this.fQ();
      ciy $$2 = $$1.a($$0);
      this.bQ.b($$1, $$1.l).ifPresent($$1x -> this.bQ.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean X() {
      return this.cV;
   }

   @Override
   public Optional<cat> Y() {
      return Optional.of(this.cW);
   }

   @Override
   public void a(byg $$0) {
      super.a($$0);
      bii $$1 = $$0.v();
      if ($$1 != null) {
         ai.P.a(this, $$0.j(), $$1);
      }
   }

   public void a(tv $$0) {
      this.cZ = $$0;
   }

   @Nullable
   public tv Z() {
      return this.cZ != null && this.cZ.b() ? null : this.cZ;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cj = (float)(arp.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dA());
      this.c.b(new xx(this));
   }

   @Override
   public boolean a(bii $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.c.a(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
         if ($$0 instanceof biy $$2) {
            for (bhv $$3 : $$2.eq()) {
               this.c.b(new aar($$0.ah(), $$3));
            }
         }

         return true;
      }
   }

   @Override
   public void aa() {
      bii $$0 = this.cY();
      super.aa();
      if ($$0 instanceof biy $$1) {
         for (bhv $$2 : $$1.eq()) {
            this.c.b(new yz($$0.ah(), $$2.c()));
         }
      }
   }

   public aat d(akk $$0) {
      return new aat($$0.aa(), $$0.ac(), cqm.a($$0.A()), this.e.b(), this.e.c(), $$0.af(), $$0.z(), this.gp(), this.at());
   }
}
