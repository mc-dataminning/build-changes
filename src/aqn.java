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
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqn extends cmk {
   private static final Logger cB = LogUtils.getLogger();
   private static final int cC = 32;
   private static final int cD = 10;
   private static final int cE = 25;
   public static final double b = 1.0;
   private static final buh cF = new buh(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, buh.a.a);
   private static final buh cG = new buh(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, buh.a.a);
   public arm c;
   public final MinecraftServer d;
   public final aqo e;
   private final aks cH;
   private final avn cI;
   private float cJ = Float.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private int cL = Integer.MIN_VALUE;
   private int cM = Integer.MIN_VALUE;
   private int cN = Integer.MIN_VALUE;
   private int cO = Integer.MIN_VALUE;
   private float cP = -1.0E8F;
   private int cQ = -99999999;
   private boolean cR = true;
   private int cS = -99999999;
   private int cT = 60;
   private cmi cU = cmi.a;
   private boolean cV = true;
   private long cW = ac.c();
   @Nullable
   private bsg cX;
   private boolean cY;
   private boolean cZ;
   private final avm da = new avm();
   @Nullable
   private ewf db;
   private int dc;
   private boolean dd;
   private int de = 2;
   private String df = "en_us";
   @Nullable
   private ewf dg;
   @Nullable
   private ewf dh;
   @Nullable
   private ewf di;
   private kc dj = kc.a(0, 0, 0);
   private apy dk = apy.a;
   private akj<dcf> dl = dcf.h;
   @Nullable
   private ja dm;
   private boolean dn;
   private float do;
   private final arr dp;
   private boolean dq;
   private boolean dr;
   private boolean ds;
   private clq dt = new clq(0, 0, 0);
   @Nullable
   private ja du;
   private ewf dv = ewf.b;
   private final cpv dw = new cpv() {
      @Override
      public void a(cph $$0, js<cuc> $$1, cuc $$2, int[] $$3) {
         aqn.this.c.b(new aci($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cph $$0, int $$1, cuc $$2) {
         aqn.this.c.b(new ack($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cph $$0, cuc $$1) {
         aqn.this.c.b(new ack(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cph $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cph $$0, int $$1, int $$2) {
         aqn.this.c.b(new acj($$0.j, $$1, $$2));
      }
   };
   private final cpu dx = new cpu() {
      @Override
      public void a(cph $$0, int $$1, cuc $$2) {
         crd $$3 = $$0.b($$1);
         if (!($$3 instanceof cqz)) {
            if ($$3.c == aqn.this.fZ()) {
               am.f.a(aqn.this, aqn.this.fZ(), $$2);
            }
         }
      }

      @Override
      public void a(cph $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xl dy;
   @Nullable
   public final Object f;
   private int dz;
   public boolean g;

   public aqn(MinecraftServer $$0, aqm $$1, GameProfile $$2, apz $$3) {
      super($$1, $$1.V(), $$1.W(), $$2);
      this.dp = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cI = $$0.ai().a((cmk)this);
      this.cH = $$0.ai().f(this);
      this.e($$1);
      this.a($$3);
      this.f = null;
   }

   private void e(aqm $$0) {
      ja $$1 = $$0.V();
      if ($$0.D_().g() && $$0.o().bc().k() != dcc.c) {
         int $$2 = Math.max(0, this.d.a($$0));
         int $$3 = ayg.a($$0.C_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.t($$6);
         int $$8 = ayo.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ja $$13 = aqh.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dx() < (double)($$0.am() - 1)) {
            this.a_(this.dv(), this.dx() + 1.0, this.dB());
         }
      }
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         clq.a.parse(new Dynamic(ul.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cB::error).ifPresent($$0x -> this.dt = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         tx $$1 = $$0.p("enteredNetherPosition");
         this.dh = new ewf($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cZ = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.da.a($$0.p("recipeBook"), this.d.aK());
      }

      if (this.fI()) {
         this.fJ();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dm = new ja($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dn = $$0.q("SpawnForced");
         this.do = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dl = dcf.g.parse(ul.a, $$0.c("SpawnDimension")).resultOrPartial(cB::error).orElse(dcf.h);
         }
      }

      this.ds = $$0.q("spawn_extra_particles_on_fall");
      uu $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         ja.a.parse(ul.a, $$2).resultOrPartial(cB::error).ifPresent($$0x -> this.du = $$0x);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      clq.a.encodeStart(ul.a, this.dt).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cZ);
      if (this.dh != null) {
         tx $$1 = new tx();
         $$1.a("x", this.dh.c);
         $$1.a("y", this.dh.d);
         $$1.a("z", this.dh.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bsg $$2 = this.da();
      bsg $$3 = this.dd();
      if ($$3 != null && $$2 != this && $$2.cZ()) {
         tx $$4 = new tx();
         tx $$5 = new tx();
         $$2.e($$5);
         $$4.a("Attach", $$3.cA());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.da.b());
      $$0.a("Dimension", this.dQ().af().a().toString());
      if (this.dm != null) {
         $$0.a("SpawnX", this.dm.u());
         $$0.a("SpawnY", this.dm.v());
         $$0.a("SpawnZ", this.dm.w());
         $$0.a("SpawnForced", this.dn);
         $$0.a("SpawnAngle", this.do);
         akk.a.encodeStart(ul.a, this.dl.a()).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.ds);
      if (this.du != null) {
         ja.a.encodeStart(ul.a, this.du).resultOrPartial(cB::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gi();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cs = ayg.a((float)$$0 / $$1, 0.0F, $$2);
      this.cS = -1;
   }

   public void b(int $$0) {
      this.cq = $$0;
      this.cS = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cS = -1;
   }

   @Override
   public void a(cuc $$0, int $$1) {
      super.a($$0, $$1);
      this.cS = -1;
   }

   private void a(cph $$0) {
      $$0.a(this.dx);
      $$0.a(this.dw);
   }

   public void h() {
      this.a(this.cc);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(adq.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new adp(this.eM()));
   }

   @Override
   protected void a(dsk $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cty k() {
      return new cva(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.dt.a();
      this.cT--;
      if (this.am > 0) {
         this.am--;
      }

      this.cd.d();
      if (!this.dQ().B && !this.cd.b(this)) {
         this.r();
         this.cd = this.cc;
      }

      bsg $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bE()) {
            this.a($$0.dv(), $$0.dx(), $$0.dB(), $$0.dG(), $$0.dI());
            this.z().l().a(this);
            if (this.fP()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      am.x.a(this);
      if (this.db != null) {
         am.v.a(this, this.db, this.ai - this.dc);
      }

      this.o();
      this.p();
      this.gC();
      this.cH.b(this);
   }

   private void gC() {
      buf $$0 = this.f(buj.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cF);
         } else {
            $$0.e(cF);
         }
      }

      buf $$1 = this.f(buj.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cG);
         } else {
            $$1.e(cG);
         }
      }
   }

   public void m() {
      try {
         if (!this.N_() || !this.di()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fZ().b(); $$0++) {
            cuc $$1 = this.fZ().a($$0);
            if ($$1.g().ak_()) {
               zb<?> $$2 = ((csm)$$1.g()).a($$1, this.dQ(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.ex() != this.cP || this.cQ != this.ce.a() || this.ce.e() == 0.0F != this.cR) {
            this.c.b(new aex(this.ex(), this.ce.a(), this.ce.e()));
            this.cP = this.ex();
            this.cQ = this.ce.a();
            this.cR = this.ce.e() == 0.0F;
         }

         if (this.ex() + this.fp() != this.cJ) {
            this.cJ = this.ex() + this.fp();
            this.a(exm.g, ayg.f(this.cJ));
         }

         if (this.ce.a() != this.cK) {
            this.cK = this.ce.a();
            this.a(exm.h, ayg.f((float)this.cK));
         }

         if (this.cm() != this.cL) {
            this.cL = this.cm();
            this.a(exm.i, ayg.f((float)this.cL));
         }

         if (this.eL() != this.cM) {
            this.cM = this.eL();
            this.a(exm.j, ayg.f((float)this.cM));
         }

         if (this.cr != this.cO) {
            this.cO = this.cr;
            this.a(exm.k, ayg.f((float)this.cO));
         }

         if (this.cq != this.cN) {
            this.cN = this.cq;
            this.a(exm.l, ayg.f((float)this.cN));
         }

         if (this.cr != this.cS) {
            this.cS = this.cr;
            this.c.b(new aew(this.cs, this.cr, this.cq));
         }

         if (this.ai % 20 == 0) {
            am.q.a(this);
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
      if (this.ex() > 0.0F && this.dg != null) {
         am.X.a(this, this.dg);
      }

      this.dg = null;
      super.n();
   }

   public void o() {
      if (this.ac > 0.0F && this.dg == null) {
         this.dg = this.do();
         if (this.cx != null && this.cx.d <= this.dg.d) {
            am.ae.a(this, this.cx, this.cy);
         }
      }
   }

   public void p() {
      if (this.dd() != null && this.dd().bt()) {
         if (this.di == null) {
            this.di = this.do();
         } else {
            am.Y.a(this, this.di);
         }
      }

      if (this.di != null && (this.dd() == null || !this.dd().bt())) {
         this.di = null;
      }
   }

   private void a(exm $$0, int $$1) {
      this.go().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bqz $$0) {
      this.a(dxg.p);
      boolean $$1 = this.dQ().ab().b(dcb.n);
      if ($$1) {
         wu $$2 = this.eM().a();
         this.c.a(new adr(this.am(), $$2), wb.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            wu $$3x = wu.a("death.attack.message_too_long", wu.b($$2x).a(n.o));
            wu $$4x = wu.a("death.attack.even_more_magic", this.O_()).a($$1xx -> $$1xx.a(new xa(xa.a.a, $$3x)));
            return new adr(this.am(), $$4x);
         }));
         exl $$3 = this.ck();
         if ($$3 == null || $$3.k() == exl.b.a) {
            this.d.ai().a($$2, false);
         } else if ($$3.k() == exl.b.c) {
            this.d.ai().a(this, $$2);
         } else if ($$3.k() == exl.b.d) {
            this.d.ai().b(this, $$2);
         }
      } else {
         this.c.b(new adr(this.am(), wt.a));
      }

      this.gn();
      if (this.dQ().ab().b(dcb.N)) {
         this.gD();
      }

      if (!this.N_()) {
         this.g($$0);
      }

      this.go().a(exm.d, this, exh::b);
      btb $$4 = this.eN();
      if ($$4 != null) {
         this.b(avr.h.b($$4.al()));
         $$4.a(this, this.bl, $$0);
         this.f($$4);
      }

      this.dQ().a(this, (byte)3);
      this.a(avr.N);
      this.a(avr.i.b(avr.m));
      this.a(avr.i.b(avr.n));
      this.aD();
      this.k(0);
      this.c(false);
      this.eM().c();
      this.a(Optional.of(ji.a(this.dQ().af(), this.dq())));
   }

   private void gD() {
      ewa $$0 = new ewa(this.dq()).c(32.0, 10.0, 32.0);
      this.dQ().a(btd.class, $$0, bsl.f).stream().filter($$0x -> $$0x instanceof bth).forEach($$0x -> ((bth)$$0x).a_((cmk)this));
   }

   @Override
   public void a(bsg $$0, int $$1, bqz $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.go().a(exm.f, this, exh::b);
         if ($$0 instanceof cmk) {
            this.a(avr.Q);
            this.go().a(exm.e, this, exh::b);
         } else {
            this.a(avr.O);
         }

         this.a(this, $$0, exm.m);
         this.a($$0, this, exm.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(exi $$0, exi $$1, exm[] $$2) {
      exe $$3 = this.go().e($$1.cC());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.go().a($$2[$$4], $$0, exh::b);
         }
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gE() && $$0.a(avy.n);
         if (!$$2 && this.cT > 0 && !$$0.a(avy.e)) {
            return false;
         } else {
            bsg $$3 = $$0.d();
            if ($$3 instanceof cmk $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cmq $$5 && $$5.s() instanceof cmk $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cmk $$0) {
      return !this.gE() ? false : super.a($$0);
   }

   private boolean gE() {
      return this.d.ae();
   }

   @Nullable
   @Override
   protected epg a(aqm $$0) {
      epg $$1 = super.a($$0);
      if ($$1 != null && this.dQ().af() == dcf.h && $$0.af() == dcf.j) {
         ewf $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new epg($$2, ewf.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bsg b(aqm $$0) {
      this.cY = true;
      aqm $$1 = this.z();
      akj<dcf> $$2 = $$1.af();
      if ($$2 == dcf.j && $$0.af() == dcf.h) {
         this.aj();
         this.z().a(this, bsg.c.e);
         if (!this.g) {
            this.g = true;
            this.c.b(new acu(acu.f, this.cZ ? 0.0F : 1.0F));
            this.cZ = true;
         }

         return this;
      } else {
         eqe $$3 = $$0.A_();
         this.c.b(new aeb(this.d($$0), (byte)3));
         this.c.b(new aca($$3.q(), $$3.r()));
         auj $$4 = this.d.ai();
         $$4.d(this);
         $$1.a(this, bsg.c.e);
         this.dN();
         epg $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ag().a("moving");
            if ($$2 == dcf.h && $$0.af() == dcf.i) {
               this.dh = this.do();
            } else if ($$0.af() == dcf.j) {
               this.b($$0, ja.a($$5.a));
            }

            $$1.ag().c();
            $$1.ag().a("placing");
            this.c($$0);
            this.c.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.c.l();
            $$0.b(this);
            $$1.ag().c();
            this.f($$1);
            this.c.b(new adn(this.ga()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bro $$6 : this.eu()) {
               this.c.b(new afu(this.am(), $$6, false));
            }

            this.c.b(new ada(1032, ja.c, 0, false));
            this.cS = -1;
            this.cP = -1.0F;
            this.cQ = -1;
         }

         return this;
      }
   }

   private void b(aqm $$0, ja $$1) {
      ja.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dsk $$6 = $$5 == -1 ? dfj.co.o() : dfj.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(aqm $$0, ja $$1, boolean $$2, dub $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jf.a $$5 = this.dQ().a_(this.ay).d(dkl.b).orElse(jf.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            cB.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(aqm $$0) {
      akj<dcf> $$1 = $$0.af();
      akj<dcf> $$2 = this.dQ().af();
      am.w.a(this, $$1, $$2);
      if ($$1 == dcf.i && $$2 == dcf.h && this.dh != null) {
         am.D.a(this, this.dh);
      }

      if ($$2 != dcf.i) {
         this.dh = null;
      }
   }

   @Override
   public boolean a(aqn $$0) {
      if ($$0.N_()) {
         return this.K() == this;
      } else {
         return this.N_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bsg $$0, int $$1) {
      super.a($$0, $$1);
      this.cd.d();
   }

   @Override
   public Either<cmk.a, azk> a(ja $$0) {
      jf $$1 = this.dQ().a_($$0).c(djd.aE);
      if (this.fI() || !this.bE()) {
         return Either.left(cmk.a.e);
      } else if (!this.dQ().D_().j()) {
         return Either.left(cmk.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cmk.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cmk.a.d);
      } else {
         this.a(this.dQ().af(), $$0, this.dG(), false, true);
         if (this.dQ().R()) {
            return Either.left(cmk.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               ewf $$4 = ewf.c($$0);
               List<cjq> $$5 = this.dQ()
                  .a(cjq.class, new ewa($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cmk.a.f);
               }
            }

            Either<cmk.a, azk> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(avr.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(wu.c("sleep.not_possible"), true);
            }

            ((aqm)this.dQ()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ja $$0) {
      this.a(avr.i.b(avr.n));
      super.b($$0);
   }

   private boolean a(ja $$0, jf $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ja $$0) {
      ewf $$1 = ewf.c($$0);
      return Math.abs(this.dv() - $$1.a()) <= 3.0 && Math.abs(this.dx() - $$1.b()) <= 2.0 && Math.abs(this.dB() - $$1.c()) <= 3.0;
   }

   private boolean b(ja $$0, jf $$1) {
      ja $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fI()) {
         this.z().l().a(this, new abq(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bJ();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bqz $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
   }

   @Override
   protected void a(aqm $$0, ja $$1) {
      if (!this.N_()) {
         super.a($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.di()) {
         this.b($$3, new ewf($$0, $$1, $$2));
         ja $$4 = this.aK();
         dsk $$5 = this.dQ().a_($$4);
         if (this.ds && $$3 && this.ac > 0.0F) {
            ewf $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)(50.0F * this.ac);
            this.z().a(new lb(lj.b, $$5), $$6.c, $$6.d, $$6.e, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.ds = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable bsg $$0) {
      super.a($$0);
      this.cx = this.do();
      this.cy = $$0;
      this.cz = this.cz || $$0 != null && $$0.al() == bsm.bn;
   }

   @Override
   protected void q() {
      if (this.dQ().s().i()) {
         super.q();
      }
   }

   @Override
   public void a(dra $$0, boolean $$1) {
      this.c.b(new abw(this.dQ(), $$0.az_()));
      this.c.b(new adl($$0.az_(), $$1));
   }

   private void gF() {
      this.dz = this.dz % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bqk $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cd != this.cc) {
            this.r();
         }

         this.gF();
         cph $$1 = $$0.createMenu(this.dz, this.fZ(), this);
         if ($$1 == null) {
            if (this.N_()) {
               this.a(wu.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adk($$1.j, $$1.a(), $$0.O_()));
            this.a($$1);
            this.cd = $$1;
            return OptionalInt.of(this.dz);
         }
      }
   }

   @Override
   public void a(int $$0, dbe $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new adg($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cgv $$0, bpz $$1) {
      if (this.cd != this.cc) {
         this.r();
      }

      this.gF();
      this.c.b(new acv(this.dz, $$1.b(), $$0.am()));
      this.cd = new cqi(this.dz, this.fZ(), $$1, $$0);
      this.a(this.cd);
   }

   @Override
   public void a(cuc $$0, bqf $$1) {
      if ($$0.a(cuf.ua)) {
         if (cwa.a($$0, this.dh(), this)) {
            this.cd.d();
         }

         this.c.b(new adj($$1));
      }
   }

   @Override
   public void a(dpz $$0) {
      this.c.b(abu.a($$0, dpp::e));
   }

   @Override
   public void r() {
      this.c.b(new ach(this.cd.j));
      this.s();
   }

   @Override
   public void s() {
      this.cd.a(this);
      this.cc.a(this.cd);
      this.cd = this.cc;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bS()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bo = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bq = $$1;
         }

         this.bn = $$2;
         this.g($$3);
      }
   }

   @Override
   public void a(ewf $$0) {
      double $$1 = this.dv();
      double $$2 = this.dx();
      double $$3 = this.dB();
      super.a($$0);
      this.b(this.dv() - $$1, this.dx() - $$2, this.dB() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      super.t();
      this.r(this.dv() - $$0, this.dx() - $$1, this.dB() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bS() && !s($$0, $$1, $$2)) {
         if (this.cd()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(avr.C, $$3);
               this.D(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awc.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(avr.w, $$4);
               this.D(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bf()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(avr.s, $$5);
               this.D(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.q_()) {
            if ($$1 > 0.0) {
               this.a(avr.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aF()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cc()) {
                  this.a(avr.r, $$6);
                  this.D(0.1F * (float)$$6 * 0.01F);
               } else if (this.cb()) {
                  this.a(avr.q, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(avr.p, $$6);
                  this.D(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fB()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(avr.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(avr.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bS() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bsg $$4 = this.dd();
         if ($$4 instanceof cof) {
            this.a(avr.x, $$3);
         } else if ($$4 instanceof coh) {
            this.a(avr.y, $$3);
         } else if ($$4 instanceof cfi) {
            this.a(avr.z, $$3);
         } else if ($$4 instanceof cgv) {
            this.a(avr.A, $$3);
         } else if ($$4 instanceof ckd) {
            this.a(avr.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(avo<?> $$0, int $$1) {
      this.cI.b(this, $$0, $$1);
      this.go().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(avo<?> $$0) {
      this.cI.a(this, $$0, 0);
      this.go().a($$0, this, exh::c);
   }

   @Override
   public int a(Collection<cyk<?>> $$0) {
      return this.da.a($$0, this);
   }

   @Override
   public void a(cyk<?> $$0, List<cuc> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<akk> $$0) {
      List<cyk<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aK().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<cyk<?>> $$0) {
      return this.da.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cS = -1;
   }

   @Override
   public void u() {
      this.dd = true;
      this.bI();
      if (this.fI()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.dd;
   }

   public void w() {
      this.cP = -1.0E8F;
   }

   @Override
   public void a(wu $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bz.e() && this.fs()) {
         this.c.b(new acr(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(fc.a $$0, ewf $$1) {
      super.a($$0, $$1);
      this.c.b(new adu($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(fc.a $$0, bsg $$1, fc.a $$2) {
      ewf $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new adu($$0, $$1, $$2));
   }

   public void a(aqn $$0, boolean $$1) {
      this.dt = $$0.dt;
      this.dy = $$0.dy;
      this.e.a($$0.e.b(), $$0.e.c());
      this.y();
      if ($$1) {
         this.fZ().a($$0.fZ());
         this.u($$0.ex());
         this.ce = $$0.ce;
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fT());
         this.ay = $$0.ay;
      } else if (this.dQ().ab().b(dcb.d) || $$0.N_()) {
         this.fZ().a($$0.fZ());
         this.cq = $$0.cq;
         this.cr = $$0.cr;
         this.cs = $$0.cs;
         this.r($$0.fT());
      }

      this.ct = $$0.ct;
      this.cb = $$0.cb;
      this.aq().a(bX, $$0.aq().a(bX));
      this.cS = -1;
      this.cP = -1.0F;
      this.cQ = -1;
      this.da.a($$0.da);
      this.cZ = $$0.cZ;
      this.dh = $$0.dh;
      this.dk = $$0.dk;
      this.i($$0.gq());
      this.j($$0.gr());
      this.a($$0.gy());
   }

   @Override
   protected void a(bro $$0, @Nullable bsg $$1) {
      super.a($$0, $$1);
      this.c.b(new afu(this.am(), $$0, true));
      if ($$0.a(brq.y)) {
         this.dc = this.ai;
         this.db = this.do();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bro $$0, boolean $$1, @Nullable bsg $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new afu(this.am(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bro $$0) {
      super.a($$0);
      this.c.b(new adz(this.am(), $$0.c()));
      if ($$0.a(brq.y)) {
         this.db = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dG(), this.dI(), btp.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dv() + $$0, this.dx() + $$1, this.dB() + $$2, this.dG(), this.dI(), btp.f);
   }

   @Override
   public boolean a(aqm $$0, double $$1, double $$2, double $$3, Set<btp> $$4, float $$5, float $$6) {
      dbm $$7 = new dbm(ja.a($$1, $$2, $$3));
      $$0.l().a(aqr.f, $$7, 1, this.am());
      this.ac();
      if (this.fI()) {
         this.a(true, true);
      }

      if ($$0 == this.dQ()) {
         this.c.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.o($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.l();
   }

   @Override
   public void b(bsg $$0) {
      this.z().l().a(this, new abq($$0, 4));
   }

   @Override
   public void c(bsg $$0) {
      this.z().l().a(this, new abq($$0, 5));
   }

   @Override
   public void y() {
      if (this.c != null) {
         this.c.b(new adn(this.ga()));
         this.J();
      }
   }

   public aqm z() {
      return (aqm)this.dQ();
   }

   public boolean a(dcc $$0) {
      boolean $$1 = this.N_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new acu(acu.e, (float)$$0.a()));
         if ($$0 == dcc.d) {
            this.gn();
            this.ac();
            czn.a(this);
         } else {
            this.d(this);
            if ($$1) {
               czn.a(this.z(), this);
            }
         }

         this.y();
         this.fq();
         return true;
      }
   }

   @Override
   public boolean N_() {
      return this.e.b() == dcc.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == dcc.b;
   }

   @Override
   public void a(wu $$0) {
      this.b($$0, false);
   }

   public void b(wu $$0, boolean $$1) {
      if (this.v($$1)) {
         this.c.a(new afl($$0, $$1), wb.a(() -> {
            if (this.v(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               wu $$3 = wu.b($$2).a(n.o);
               return new afl(wu.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xj $$0, boolean $$1, wq.a $$2) {
      if (this.gG()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(apz $$0) {
      this.df = $$0.b();
      this.de = $$0.c();
      this.cU = $$0.d();
      this.cV = $$0.e();
      this.dq = $$0.h();
      this.dr = $$0.i();
      this.aq().a(bX, (byte)$$0.f());
      this.aq().a(bY, (byte)$$0.g().a());
   }

   public apz B() {
      int $$0 = this.aq().a(bX);
      bsv $$1 = bsv.d.apply(this.aq().a(bY));
      return new apz(this.df, this.de, this.cU, this.cV, $$0, $$1, this.dq, this.dr);
   }

   public boolean C() {
      return this.cV;
   }

   public cmi D() {
      return this.cU;
   }

   private boolean v(boolean $$0) {
      return this.cU == cmi.c ? $$0 : true;
   }

   private boolean gG() {
      return this.cU == cmi.a;
   }

   public int E() {
      return this.de;
   }

   public void a(ajj $$0) {
      this.c.b(new aef($$0.a(), $$0.d().map(ajj.a::a)));
   }

   @Override
   protected int F() {
      return this.d.c(this.fY());
   }

   @Override
   public void G() {
      this.cW = ac.c();
   }

   public avn H() {
      return this.cI;
   }

   public avm I() {
      return this.da;
   }

   @Override
   protected void J() {
      if (this.N_()) {
         this.es();
         this.k(true);
      } else {
         super.J();
      }
   }

   public bsg K() {
      return (bsg)(this.cX == null ? this : this.cX);
   }

   @Override
   public void d(@Nullable bsg $$0) {
      bsg $$1 = this.K();
      this.cX = (bsg)($$0 == null ? this : $$0);
      if ($$1 != this.cX) {
         if (this.cX.dQ() instanceof aqm $$2) {
            this.a($$2, this.cX.dv(), this.cX.dx(), this.cX.dB(), Set.of(), this.dG(), this.dI());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.c.b(new aem(this.cX));
         this.c.l();
      }
   }

   @Override
   protected void L() {
      if (!this.cY) {
         super.L();
      }
   }

   @Override
   public void e(bsg $$0) {
      if (this.e.b() == dcc.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long M() {
      return this.cW;
   }

   @Nullable
   public wu N() {
      return null;
   }

   @Override
   public void a(bqf $$0) {
      super.a($$0);
      this.gt();
   }

   public boolean O() {
      return this.cY;
   }

   public void P() {
      this.cY = false;
   }

   public aks Q() {
      return this.cH;
   }

   public void a(aqm $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.d(this);
      this.ac();
      if ($$0 == this.dQ()) {
         this.c.a($$1, $$2, $$3, $$4, $$5);
      } else {
         aqm $$6 = this.z();
         eqe $$7 = $$0.A_();
         this.c.b(new aeb(this.d($$0), (byte)3));
         this.c.b(new aca($$7.q(), $$7.r()));
         this.d.ai().d(this);
         $$6.a(this, bsg.c.e);
         this.dN();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.c.a($$1, $$2, $$3, $$4, $$5);
         this.d.ai().a(this, $$0);
         this.d.ai().e(this);
      }
   }

   @Nullable
   public ja R() {
      return this.dm;
   }

   public float S() {
      return this.do;
   }

   public akj<dcf> T() {
      return this.dl;
   }

   public boolean U() {
      return this.dn;
   }

   public void a(akj<dcf> $$0, @Nullable ja $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dm) && $$0.equals(this.dl);
         if ($$4 && !$$5) {
            this.a(wu.c("block.minecraft.set_spawn"));
         }

         this.dm = $$1;
         this.dl = $$0;
         this.do = $$2;
         this.dn = $$3;
      } else {
         this.dm = null;
         this.dl = dcf.h;
         this.do = 0.0F;
         this.dn = false;
      }
   }

   public kc V() {
      return this.dj;
   }

   public void a(kc $$0) {
      this.dj = $$0;
   }

   public apy W() {
      return this.dk;
   }

   public void a(apy $$0) {
      this.dk = $$0;
   }

   @Override
   public void a(avg $$0, avi $$1, float $$2, float $$3) {
      this.c.b(new afi(lq.b.e($$0), $$1, this.dv(), this.dx(), this.dB(), $$2, $$3, this.ah.g()));
   }

   @Override
   public ciu a(cuc $$0, boolean $$1, boolean $$2) {
      ciu $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dQ().b($$3);
         cuc $$4 = $$3.p();
         if ($$2) {
            if (!$$4.e()) {
               this.a(avr.f.b($$4.g()), $$0.H());
            }

            this.a(avr.F);
         }

         return $$3;
      }
   }

   public arr X() {
      return this.dp;
   }

   public void c(aqm $$0) {
      this.a((dcf)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static dcc a(@Nullable tx $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? dcc.a($$0.h($$1)) : null;
   }

   private dcc b(@Nullable dcc $$0) {
      dcc $$1 = this.d.bg();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.u_();
      }
   }

   @Override
   public void c(@Nullable tx $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(tx $$0) {
      $$0.a("playerGameType", this.e.b().a());
      dcc $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.dq;
   }

   public boolean b(aqn $$0) {
      return $$0 == this ? false : this.dq || $$0.dq;
   }

   @Override
   public boolean a(dcf $$0, ja $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cuc $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cmj $$1 = this.fZ();
      cuc $$2 = $$1.a($$0);
      this.cd.b($$1, $$1.k).ifPresent($$1x -> this.cd.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dr;
   }

   @Override
   public Optional<clq> aa() {
      return Optional.of(this.dt);
   }

   public void b(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public void a(ciu $$0) {
      super.a($$0);
      bsg $$1 = $$0.s();
      if ($$1 != null) {
         am.S.a(this, $$0.p(), $$1);
      }
   }

   public void a(xl $$0) {
      this.dy = $$0;
   }

   @Nullable
   public xl ab() {
      return this.dy != null && this.dy.b() ? null : this.dy;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cw = (float)(ayg.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dG());
      this.c.b(new acw(this));
   }

   @Override
   public boolean a(bsg $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.j(this);
         this.c.a(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
         if ($$0 instanceof btb $$2) {
            for (bro $$3 : $$2.eu()) {
               this.c.b(new afu($$0.am(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bsg $$0 = this.dd();
      super.ac();
      if ($$0 instanceof btb $$1) {
         for (bro $$2 : $$1.eu()) {
            this.c.b(new adz($$0.am(), $$2.c()));
         }
      }
   }

   public afw d(aqm $$0) {
      return new afw($$0.ae(), $$0.af(), ddh.a($$0.C()), this.e.b(), this.e.c(), $$0.ai(), $$0.B(), this.gy(), this.ay());
   }

   @Override
   public void c(ja $$0) {
      this.du = $$0;
   }

   public void ad() {
      this.du = null;
   }

   @Nullable
   public ja ae() {
      return this.du;
   }

   @Override
   public void a(boolean $$0, ewf $$1) {
      super.a($$0, $$1);
      this.dv = $$1;
   }

   @Override
   public ewf af() {
      return this.dv;
   }

   @Override
   protected float a(bsg $$0, float $$1, bqz $$2) {
      return czn.a(this.z(), this.eU(), $$0, $$2, $$1);
   }
}
