import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.time.Instant;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fof extends fob implements uv, zb {
   private static final Logger g = LogUtils.getLogger();
   private static final vg h = vg.c("multiplayer.unsecureserver.toast.title");
   private static final vg i = vg.c("multiplayer.unsecureserver.toast");
   private static final vg j = vg.c("multiplayer.disconnect.invalid_packet");
   private static final vg k = vg.c("multiplayer.disconnect.chat_validation_failed");
   private static final vg l = vg.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private foe o;
   private foe.a p;
   private final Map<UUID, fon> q = Maps.newHashMap();
   private final Set<fon> r = new ReferenceOpenHashSet();
   private final fnz s;
   private final foh t;
   private final evi u = new evi(this);
   private int v = 3;
   private int w = 3;
   private final auw x = auw.b();
   private CommandDispatcher<dx> y = new CommandDispatcher();
   private final cqn z = new cqn();
   private final UUID A = UUID.randomUUID();
   private Set<ahg<ctx>> B;
   private final iu.b C;
   private final cia D;
   @Nullable
   private vr E;
   private wa.c F = wa.c.a;
   private vo G = new vo(20);
   private vt H = vt.a();
   private final fny I = new fny();
   private final fom J;
   @Nullable
   private fok K;
   private boolean L = false;
   private volatile boolean M;
   private final eng N = new eng();

   public fof(evr $$0, uh $$1, foi $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fnz($$0, this.e);
      this.t = new foh(this, $$0);
      this.J = new fom(this, $$0.aN().k());
   }

   public foh i() {
      return this.t;
   }

   public void j() {
      this.M = true;
      this.k();
      this.e.c();
   }

   public void k() {
      this.o = null;
      this.K = null;
   }

   public cqn l() {
      return this.z;
   }

   @Override
   public void a(aaq $$0) {
      xi.a($$0, this, this.a);
      this.A();
      this.a.q = new fol(this.a, this);
      adh $$1 = $$0.l();
      List<ahg<ctx>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      ahg<ctx> $$3 = $$1.b();
      ih<dmy> $$4 = this.C.d(ke.ay).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      foe.a $$7 = new foe.a(bjz.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new foe(this, $$7, $$3, $$4, this.v, this.w, this.a::aG, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new ase(), new eve());
         this.a.s.r(-180.0F);
         if (this.a.T() != null) {
            this.a.T().a(this.a.s.cw());
         }
      }

      this.a.k.a();
      this.a.s.z();
      this.a.s.e($$0.a());
      this.o.c(this.a.s);
      this.a.s.cs = new fsu(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.o);
      this.a.s.u($$0.i());
      this.a.s.b($$0.j());
      this.a.s.v($$0.k());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.g());
      this.E = null;
      this.G = new vo(20);
      this.H = vt.a();
      if (this.b.j()) {
         this.a.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.ba().a(this.a);
   }

   @Override
   public void a(zc $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.o.c($$1);
         this.a($$1);
      } else {
         g.warn("Skipping Entity with id {}", $$0.e());
      }
   }

   @Nullable
   private blw b(zc $$0) {
      bmc<?> $$1 = $$0.e();
      if ($$1 == bmc.bw) {
         fon $$2 = this.a($$0.d());
         if ($$2 == null) {
            g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
            return null;
         } else {
            return new fsw(this.o, $$2.a());
         }
      } else {
         return $$1.a((ctx)this.o);
      }
   }

   private void a(blw $$0) {
      if ($$0 instanceof chi $$1) {
         this.a.ai().a((gio)(new gih($$1)));
      } else if ($$0 instanceof byd $$2) {
         boolean $$3 = $$2.aa_();
         gib $$4;
         if ($$3) {
            $$4 = new ghz($$2);
         } else {
            $$4 = new gia($$2);
         }

         this.a.ai().a((gip)$$4);
      }
   }

   @Override
   public void a(zd $$0) {
      xi.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      blw $$4 = new bme(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.c($$4);
   }

   @Override
   public void a(acf $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(acd $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.an().a($$0.d());
      }
   }

   @Override
   public void a(ada $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         double $$2 = $$0.d();
         double $$3 = $$0.e();
         double $$4 = $$0.f();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cX()) {
            float $$5 = (float)($$0.g() * 360) / 256.0F;
            float $$6 = (float)($$0.h() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.c($$0.i());
         }
      }
   }

   @Override
   public void a(adb $$0) {
      xi.a($$0, this, this.a);
      if (this.a.r != null) {
         bkn $$1 = this.a.r.s();
         $$1.a($$0.a());
         $$1.a($$0.d());
      }
   }

   @Override
   public void a(adc $$0) {
      xi.a($$0, this, this.a);
      if (this.a.r != null) {
         bkn $$1 = this.a.r.s();
         $$1.c($$0.a());
      }
   }

   @Override
   public void a(aby $$0) {
      xi.a($$0, this, this.a);
      if (cfp.d($$0.a())) {
         this.a.s.fS().l = $$0.a();
      }
   }

   @Override
   public void a(aat $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cX()) {
            if ($$0.i()) {
               afh $$2 = $$1.ah();
               emc $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
               $$2.e($$3);
               float $$4 = $$0.h() ? (float)($$0.f() * 360) / 256.0F : $$1.q_();
               float $$5 = $$0.h() ? (float)($$0.g() * 360) / 256.0F : $$1.f_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.h()) {
               float $$6 = (float)($$0.f() * 360) / 256.0F;
               float $$7 = (float)($$0.g() * 360) / 256.0F;
               $$1.a($$1.p_(), $$1.N_(), $$1.O_(), $$6, $$7, 3);
            }

            $$1.c($$0.j());
         }
      }
   }

   @Override
   public void a(abn $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(abj $$0) {
      xi.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, blw.c.b));
   }

   @Override
   public void a(abh $$0) {
      xi.a($$0, this, this.a);
      cfq $$1 = this.a.s;
      emc $$2 = $$1.do();
      boolean $$3 = $$0.i().contains(bnc.a);
      boolean $$4 = $$0.i().contains(bnc.b);
      boolean $$5 = $$0.i().contains(bnc.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dq() + $$0.a();
         $$1.ac = $$1.ac + $$0.a();
         $$1.K = $$1.K + $$0.a();
      } else {
         $$6 = 0.0;
         $$7 = $$0.a();
         $$1.ac = $$7;
         $$1.K = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.ds() + $$0.d();
         $$1.ad = $$1.ad + $$0.d();
         $$1.L = $$1.L + $$0.d();
      } else {
         $$10 = 0.0;
         $$11 = $$0.d();
         $$1.ad = $$11;
         $$1.L = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dw() + $$0.e();
         $$1.ae = $$1.ae + $$0.e();
         $$1.M = $$1.M + $$0.e();
      } else {
         $$14 = 0.0;
         $$15 = $$0.e();
         $$1.ae = $$15;
         $$1.M = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.f();
      float $$19 = $$0.g();
      if ($$0.i().contains(bnc.e)) {
         $$1.s($$1.dD() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bnc.d)) {
         $$1.r($$1.dB() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new adn($$0.h()));
      this.b.a(new aeh.b($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD(), false));
   }

   @Override
   public void a(abo $$0) {
      xi.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(aal $$0) {
      xi.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      aap $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dlw $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(zq $$0) {
      xi.a($$0, this, this.a);

      for (zq.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (zq.a $$2 : $$0.a()) {
         this.o.a(new cte($$2.b().e, $$2.b().f));
      }

      for (zq.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.an(); $$6 < this.o.ao(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, aak $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dlw $$0, int $$1, int $$2) {
      eeo $$3 = this.o.i().p();
      dlx[] $$4 = $$0.d();
      cte $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dlx $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(iz.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(aaf $$0) {
      xi.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(aaf $$0) {
      cte $$1 = $$0.a();
      this.o.a(() -> {
         eeo $$1x = this.o.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            iz $$3 = iz.a($$1, $$2);
            $$1x.a(cug.b, $$3, null);
            $$1x.a(cug.a, $$3, null);
         }

         for (int $$4 = this.o.an(); $$4 < this.o.ao(); $$4++) {
            $$1x.a(iz.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(zk $$0) {
      xi.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(acu $$0) {
      this.b.a();
      xi.a($$0, this, this.a);
      this.a.c(new fgn(l, this.b));
      this.b.a(new foc(this.a, this.b, new foi(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new adx());
   }

   @Override
   public void a(acz $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      bmo $$2 = (bmo)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bme) {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), art.is, aru.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), art.nd, aru.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new frb(this.a.ao(), this.a.aO(), this.o, $$1, $$2));
         if ($$1 instanceof ccb $$3) {
            cng $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), blw.c.b);
            }
         } else if (!($$1 instanceof bme)) {
            this.o.a($$0.a(), blw.c.b);
         }
      }
   }

   @Override
   public void a(acw $$0) {
      xi.a($$0, this, this.a);
      this.a.aX().a($$0.a(), $$0.d());
   }

   @Override
   public void a(aba $$0) {
      xi.a($$0, this, this.a);
      Optional<vz> $$1 = $$0.f().a(this.H);
      Optional<vc.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         this.H.a($$1.get(), $$0.e());
         UUID $$3 = $$0.a();
         fon $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.a.aX().a($$3, $$2.get());
         } else {
            vx $$5 = $$4.b();
            wb $$6;
            if ($$5 != null) {
               $$6 = new wb($$0.d(), $$3, $$5.c());
            } else {
               $$6 = wb.a($$3);
            }

            vw $$8 = new vw($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
            $$8 = $$4.c().updateAndValidate($$8);
            if ($$8 != null) {
               this.a.aX().a($$8, $$4.a(), $$2.get());
            } else {
               this.a.aX().a($$3, $$2.get());
            }
         }
      } else {
         this.b.a(j);
      }
   }

   @Override
   public void a(aac $$0) {
      xi.a($$0, this, this.a);
      Optional<vc.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aX().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(aab $$0) {
      xi.a($$0, this, this.a);
      Optional<vs> $$1 = $$0.a().a(this.H);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.G.a($$1.get());
         if (!this.a.aX().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(ze $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bmo $$2 = (bmo)$$1;
            $$2.a(bkb.a);
         } else if ($$0.d() == 3) {
            bmo $$3 = (bmo)$$1;
            $$3.a(bkb.b);
         } else if ($$0.d() == 2) {
            cfq $$4 = (cfq)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, jx.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, jx.s);
         }
      }
   }

   @Override
   public void a(aai $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(acp $$0) {
      xi.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(acb $$0) {
      xi.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
   }

   @Override
   public void a(ack $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.y(this.a.s);
         $$1.bB();

         for (int $$3 : $$0.a()) {
            blw $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof chk) {
                     this.a.s.N = $$1.dB();
                     this.a.s.r($$1.dB());
                     this.a.s.n($$1.dB());
                  }

                  vg $$5 = vg.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aW().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(ace $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 instanceof bmq) {
         ((bmq)$$1).r($$0.d());
      }
   }

   private static cng a(cfq $$0) {
      for (bkb $$1 : bkb.values()) {
         cng $$2 = $$0.b($$1);
         if ($$2.a(cnj.vp)) {
            return $$2;
         }
      }

      return new cng(cnj.vp);
   }

   @Override
   public void a(aad $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ai().a((gio)(new gig((ccs)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, jx.ah, 30);
               this.o.a($$1.dq(), $$1.ds(), $$1.dw(), art.yR, $$1.db(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cfq)this.a.s));
               }
               break;
            case 63:
               this.a.ai().a((gio)(new gik((car)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(aaa $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(aci $$0) {
      xi.a($$0, this, this.a);
      this.a.s.C($$0.a());
      this.a.s.gc().a($$0.d());
      this.a.s.gc().b($$0.e());
   }

   @Override
   public void a(ach $$0) {
      xi.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(abm $$0) {
      xi.a($$0, this, this.a);
      adh $$1 = $$0.a();
      ahg<ctx> $$2 = $$1.b();
      ih<dmy> $$3 = this.C.d(ke.ay).f($$1.a());
      fsv $$4 = this.a.s;
      if ($$2 != $$4.dL().ae()) {
         Map<String, egj> $$5 = this.o.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         foe.a $$8 = new foe.a(this.p.s(), this.p.n(), $$7);
         this.p = $$8;
         this.o = new foe(this, $$8, $$2, $$3, this.v, this.w, this.a::aG, this.a.f, $$6, $$1.c());
         this.o.a($$5);
         this.a.a(this.o);
      }

      this.a.t = null;
      if ($$4.fU()) {
         $$4.r();
      }

      fsv $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.o, $$4.j(), $$4.m(), $$4.bS(), $$4.bY());
      } else {
         $$9 = this.a.q.a(this.o, $$4.j(), $$4.m());
      }

      this.a($$9, this.o);
      $$9.e($$4.aj());
      this.a.s = $$9;
      if ($$2 != $$4.dL().ae()) {
         this.a.r().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<agq.b<?>> $$11 = $$4.an().c();
         if ($$11 != null) {
            $$9.an().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.eR().a($$4.eR());
      }

      $$9.z();
      this.o.c($$9);
      $$9.r(-180.0F);
      $$9.cs = new fsu(this.a.m);
      this.a.q.a($$9);
      $$9.u($$4.gi());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cA = $$4.cA;
      $$9.cB = $$4.cB;
      if (this.a.y instanceof fcl || this.a.y instanceof fcl.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(aae $$0) {
      xi.a($$0, this, this.a);
      ctp $$1 = new ctp(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n());
      $$1.a(true);
      this.a.s.g(this.a.s.do().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(aah $$0) {
      xi.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof cae $$2) {
         fsv $$3 = this.a.s;
         bkl $$4 = new bkl($$0.d());
         cjj $$5 = new cjj($$0.a(), $$3.fS(), $$4, $$2);
         $$3.bW = $$5;
         this.a.a(new ffk($$5, $$3.fS(), $$2));
      }
   }

   @Override
   public void a(aaw $$0) {
      xi.a($$0, this, this.a);
      fcz.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(zx $$0) {
      xi.a($$0, this, this.a);
      cfq $$1 = this.a.s;
      cng $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.az().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof ffa)) {
            $$1.bW.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fS().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof ffa $$5) {
            $$4 = !$$5.I();
         }

         if ($$0.a() == 0 && cjk.f($$3)) {
            if (!$$2.b()) {
               cng $$6 = $$1.bV.b($$3).g();
               if ($$6.b() || $$6.L() < $$2.L()) {
                  $$2.e(5);
               }
            }

            $$1.bV.a($$3, $$0.f(), $$2);
         } else if ($$0.a() == $$1.bW.j && ($$0.a() != 0 || !$$4)) {
            $$1.bW.a($$3, $$0.f(), $$2);
         }
      }
   }

   @Override
   public void a(zv $$0) {
      xi.a($$0, this, this.a);
      cfq $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bV.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bW.j) {
         $$1.bW.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(aax $$0) {
      xi.a($$0, this, this.a);
      hx $$1 = $$0.a();
      if (this.o.c_($$1) instanceof dim $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         djp $$3 = this.o.a_($$1);
         dim $$4 = new dim($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(zi $$0) {
      xi.a($$0, this, this.a);
      hx $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         so $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof dhn && this.a.y instanceof fev) {
            ((fev)this.a.y).I();
         }
      });
   }

   @Override
   public void a(zw $$0) {
      xi.a($$0, this, this.a);
      cfq $$1 = this.a.s;
      if ($$1.bW != null && $$1.bW.j == $$0.a()) {
         $$1.bW.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(acg $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((bmd)$$1x.getFirst(), (cng)$$1x.getSecond()));
      }
   }

   @Override
   public void a(zu $$0) {
      xi.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(zj $$0) {
      xi.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zh $$0) {
      xi.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aag $$0) {
      xi.a($$0, this, this.a);
      cfq $$1 = this.a.s;
      aag.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = aup.d($$3 + 0.5F);
      if ($$2 == aag.a) {
         $$1.a(vg.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == aag.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == aag.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == aag.d) {
         this.a.q.a(ctu.a($$4));
      } else if ($$2 == aag.e) {
         if ($$4 == 0) {
            this.a.s.cr.b(new adv(adv.a.a));
            this.a.a(new fdk(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fdu(true, () -> {
               this.a.s.cr.b(new adv(adv.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == aag.f) {
         evv $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fcm());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(vg.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(vg.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(vg.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(vg.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == aag.g) {
         this.o.a($$1, $$1.dq(), $$1.du(), $$1.dw(), art.aC, aru.h, 0.18F, 0.45F);
      } else if ($$2 == aag.h) {
         this.o.e($$3);
      } else if ($$2 == aag.i) {
         this.o.c($$3);
      } else if ($$2 == aag.j) {
         this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), art.un, aru.g, 1.0F, 1.0F);
      } else if ($$2 == aag.k) {
         this.o.a(jx.r, $$1.dq(), $$1.ds(), $$1.dw(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), art.hB, aru.f, 1.0F, 1.0F);
         }
      } else if ($$2 == aag.l) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == aag.m) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == aag.n && this.K != null) {
         this.K.c();
      }
   }

   private void a(fsv $$0, foe $$1) {
      this.K = new fok($$0, $$1, this.a.f);
      this.a.a(new fdk(this.K::b));
   }

   @Override
   public void a(aar $$0) {
      xi.a($$0, this, this.a);
      exh $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cnn.a($$2);
      egj $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = egj.a($$0.d(), $$0.e(), this.a.r.ae());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(aam $$0) {
      xi.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(add $$0) {
      xi.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(abp $$0) {
      xi.a($$0, this, this.a);
      ahh $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(zt $$0) {
      xi.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dn.a((ij.b)this.C, this.D)));
   }

   @Override
   public void a(acv $$0) {
      xi.a($$0, this, this.a);
      this.a.ai().a($$0.a(), $$0.d());
   }

   @Override
   public void a(zs $$0) {
      xi.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(adg $$0) {
      xi.a($$0, this, this.a);
      this.z.a($$0.a());
      eve $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.I_());
      this.a.a(gja.c, $$1.b());
   }

   @Override
   public void a(abg $$0) {
      xi.a($$0, this, this.a);
      emc $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(acy $$0) {
      xi.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(zf $$0) {
      xi.a($$0, this, this.a);

      for (Entry<asa<?>, Integer> $$1 : $$0.a().entrySet()) {
         asa<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fdw) {
         ((fdw)this.a.y).H();
      }
   }

   @Override
   public void a(abi $$0) {
      xi.a($$0, this, this.a);
      eve $$1 = this.a.s.m();
      $$1.a($$0.e());
      abi.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (ahh $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ahh $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (ahh $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ahh $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     ezx.a(this.a.ay(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fhg) {
         ((fhg)this.a.y).I();
      }
   }

   @Override
   public void a(adf $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 instanceof bmo) {
         ih<blh> $$2 = $$0.d();
         blj $$3 = new blj($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null);
         if (!$$0.j()) {
            $$3.i();
         }

         ((bmo)$$1).c($$3, null);
      }
   }

   @Override
   public void a(xq $$0) {
      super.a($$0);
      this.A();
   }

   private void A() {
      if (!this.b.g()) {
         cxa.a();
      }

      clo.e().n();
   }

   @Override
   public void a(abb $$0) {
   }

   @Override
   public void a(abc $$0) {
   }

   @Override
   public void a(abd $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fcl($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fQ();
         }
      }
   }

   @Override
   public void a(zn $$0) {
      xi.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(abx $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(aaj $$0) {
      xi.a($$0, this, this.a);
      dlg $$1 = this.o.D_();
      $$1.c($$0.a(), $$0.d());
      long $$2 = $$0.g();
      if ($$2 > 0L) {
         $$1.a($$0.f(), $$0.e(), $$2);
      } else {
         $$1.a($$0.e());
      }

      $$1.a($$0.h());
      $$1.c($$0.j());
      $$1.b($$0.i());
   }

   @Override
   public void a(abs $$0) {
      xi.a($$0, this, this.a);
      this.o.D_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(abt $$0) {
      xi.a($$0, this, this.a);
      this.o.D_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(abu $$0) {
      xi.a($$0, this, this.a);
      this.o.D_().a($$0.a());
   }

   @Override
   public void a(abw $$0) {
      xi.a($$0, this, this.a);
      this.o.D_().c($$0.a());
   }

   @Override
   public void a(abv $$0) {
      xi.a($$0, this, this.a);
      this.o.D_().b($$0.a());
   }

   @Override
   public void a(zr $$0) {
      xi.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(abq $$0) {
      xi.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().map(fop::b).ifPresent(this.c::a);
         this.c.a($$0.e());
         foq.b(this.c);
         if (!this.L && !this.B()) {
            ezy $$1 = ezy.a(this.a, ezy.a.g, h, i);
            this.a.ay().a($$1);
            this.L = true;
         }
      }
   }

   @Override
   public void a(zz $$0) {
      xi.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(abr $$0) {
      xi.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(acq $$0) {
      xi.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(aco $$0) {
      xi.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(acr $$0) {
      xi.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(acx $$0) {
      xi.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(abk $$0) {
      xi.a($$0, this, this.a);
      if ($$0.a(this.o) instanceof bmo $$1) {
         $$1.d($$0.d());
      }
   }

   @Override
   public void a(abe $$0) {
      xi.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aK().f($$1);
         fon $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(abf $$0) {
      xi.a($$0, this, this.a);

      for (abf.b $$1 : $$0.e()) {
         fon $$2 = new fon(Objects.requireNonNull($$1.b()), this.B());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aK().a($$2);
         }
      }

      for (abf.b $$3 : $$0.d()) {
         fon $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.a());
         } else {
            for (abf.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(abf.a $$0, abf.b $$1, fon $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cw().equals($$1.a())) {
               this.a.s.a($$1.e());
            }

            $$2.a($$1.e());
            break;
         case d:
            if ($$1.c()) {
               this.r.add($$2);
            } else {
               this.r.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
      }
   }

   private void a(abf.b $$0, fon $$1) {
      GameProfile $$2 = $$1.a();
      avd $$3 = this.a.aT();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.B());
      } else {
         vx.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               vx $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cft.b var7) {
               g.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.B());
            }
         } else {
            $$1.a(this.B());
         }
      }
   }

   private boolean B() {
      return !this.a.aU() ? false : this.c != null && this.c.g();
   }

   @Override
   public void a(aaz $$0) {
      xi.a($$0, this, this.a);
      cfq $$1 = this.a.s;
      $$1.fT().b = $$0.d();
      $$1.fT().d = $$0.f();
      $$1.fT().a = $$0.a();
      $$1.fT().c = $$0.e();
      $$1.fT().a($$0.g());
      $$1.fT().b($$0.h());
   }

   @Override
   public void a(act $$0) {
      xi.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(acs $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(zl $$0) {
      xi.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(zy $$0) {
      xi.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.gn().b($$0.a());
      } else {
         this.a.s.gn().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(aau $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.a.s.cW();
      if ($$1 != this.a.s && $$1.cX()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new aei($$1));
      }
   }

   @Override
   public void a(aav $$0) {
      xi.a($$0, this, this.a);
      cng $$1 = this.a.s.b($$0.a());
      if ($$1.a(cnj.tX)) {
         this.a.a(new fes(new fes.c($$1)));
      }
   }

   @Override
   public void a(yb $$0) {
      if ($$0 instanceof yk $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof yj $$2) {
         ((fxl)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof yp $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof yr $$4) {
         ((fxt)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof yn $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof yl $$6) {
         fwz.a $$7 = new fwz.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof ym $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof yq $$9) {
         fxr $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof yh $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof xy $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof xx $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof yi $$14) {
         this.a.k.o.a($$14.b(), this.o.X());
      } else if ($$0 instanceof yf $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof yg) {
         this.a.k.r.a();
      } else if ($$0 instanceof yo $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof yd $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof ye $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof ya $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(yb $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(acj $$0) {
      xi.a($$0, this, this.a);
      String $$1 = $$0.a();
      if ($$0.e() == 0) {
         this.N.a($$1, enj.a, $$0.d(), $$0.f(), false, $$0.g());
      } else {
         emy $$2 = this.N.a($$1);
         if ($$2 != null) {
            if ($$0.e() == 1) {
               this.N.j($$2);
            } else if ($$0.e() == 2) {
               $$2.a($$0.f());
               $$2.a($$0.d());
               $$2.b($$0.g());
            }
         }
      }
   }

   @Override
   public void a(acm $$0) {
      xi.a($$0, this, this.a);
      String $$1 = $$0.d();
      enf $$2 = enf.d($$0.a());
      emy $$3 = this.N.a($$1);
      if ($$3 != null) {
         ene $$4 = this.N.a($$2, $$3, true);
         $$4.a($$0.e());
         $$4.a($$0.f());
         $$4.a($$0.g());
      } else {
         g.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(abl $$0) {
      xi.a($$0, this, this.a);
      String $$1 = $$0.d();
      enf $$2 = enf.d($$0.a());
      if ($$1 == null) {
         this.N.b($$2);
      } else {
         emy $$3 = this.N.a($$1);
         if ($$3 != null) {
            this.N.e($$2, $$3);
         } else {
            g.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(acc $$0) {
      xi.a($$0, this, this.a);
      String $$1 = $$0.d();
      emy $$2 = $$1 == null ? null : this.N.a($$1);
      this.N.a($$0.a(), $$2);
   }

   @Override
   public void a(acl $$0) {
      xi.a($$0, this, this.a);
      acl.a $$1 = $$0.d();
      enb $$2;
      if ($$1 == acl.a.a) {
         $$2 = this.N.c($$0.e());
      } else {
         $$2 = this.N.b($$0.e());
         if ($$2 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<acl.b> $$4 = $$0.g();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         eni.b $$2x = eni.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         eni.a $$3x = eni.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      acl.a $$5 = $$0.a();
      if ($$5 == acl.a.a) {
         for (String $$6 : $$0.f()) {
            this.N.a($$6, $$2);
         }
      } else if ($$5 == acl.a.b) {
         for (String $$7 : $$0.f()) {
            this.N.b($$7, $$2);
         }
      }

      if ($$1 == acl.a.b) {
         this.N.d($$2);
      }
   }

   @Override
   public void a(aan $$0) {
      xi.a($$0, this, this.a);
      if ($$0.k() == 0) {
         double $$1 = (double)($$0.j() * $$0.g());
         double $$2 = (double)($$0.j() * $$0.h());
         double $$3 = (double)($$0.j() * $$0.i());

         try {
            this.o.a($$0.l(), $$0.a(), $$0.d(), $$0.e(), $$0.f(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            g.warn("Could not spawn particle effect {}", $$0.l());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.k(); $$5++) {
            double $$6 = this.x.k() * (double)$$0.g();
            double $$7 = this.x.k() * (double)$$0.h();
            double $$8 = this.x.k() * (double)$$0.i();
            double $$9 = this.x.k() * (double)$$0.j();
            double $$10 = this.x.k() * (double)$$0.j();
            double $$11 = this.x.k() * (double)$$0.j();

            try {
               this.o.a($$0.l(), $$0.a(), $$0.d() + $$6, $$0.e() + $$7, $$0.f() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               g.warn("Could not spawn particle effect {}", $$0.l());
               return;
            }
         }
      }
   }

   @Override
   public void a(ade $$0) {
      xi.a($$0, this, this.a);
      blw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bmo)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bnr $$2 = ((bmo)$$1).eR();

            for (ade.a $$3 : $$0.d()) {
               bnq $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bns $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aay $$0) {
      xi.a($$0, this, this.a);
      cij $$1 = this.a.s.bW;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fhg) {
               fha $$2 = ((fhg)this.a.y).J();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(aao $$0) {
      xi.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      aap $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, aap $$2) {
      eeo $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cug.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cug.b, $$7, $$8, $$9);
      $$3.a(new cte($$0, $$1), true);
   }

   @Override
   public void a(aas $$0) {
      xi.a($$0, this, this.a);
      cij $$1 = this.a.s.bW;
      if ($$0.a() == $$1.j && $$1 instanceof cjs $$2) {
         $$2.a($$0.d());
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(aca $$0) {
      xi.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(acn $$0) {
      xi.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(abz $$0) {
      xi.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(zg $$0) {
      xi.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(zm $$0) {
      xi.a($$0, this, this.a);

      for (xg<zb> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(zp $$0) {
      this.I.a();
   }

   @Override
   public void a(zo $$0) {
      this.I.a($$0.a());
      this.b(new adu(this.I.b()));
   }

   @Override
   public void a(agg $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, eeo $$2, cug $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, iz.a($$0, $$8, $$1), $$9 ? new dlr((byte[])$$6.next().clone()) : new dlr());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public uh m() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k() && !this.M;
   }

   public Collection<fon> n() {
      return this.r;
   }

   public Collection<fon> o() {
      return this.q.values();
   }

   public Collection<UUID> p() {
      return this.q.keySet();
   }

   @Nullable
   public fon a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public fon a(String $$0) {
      for (fon $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile q() {
      return this.n;
   }

   public fnz r() {
      return this.s;
   }

   public CommandDispatcher<dx> s() {
      return this.y;
   }

   public foe t() {
      return this.o;
   }

   public evi u() {
      return this.u;
   }

   public UUID v() {
      return this.A;
   }

   public Set<ahg<ctx>> w() {
      return this.B;
   }

   @Override
   public iu.b f() {
      return this.C;
   }

   public void a(vw $$0, boolean $$1) {
      vs $$2 = $$0.l();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.C();
      }
   }

   private void C() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new adq($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = atn.c.a();
      vo.a $$3 = this.G.b();
      vs $$4 = this.F.pack(new vz($$0, $$1, $$2, $$3.a()));
      this.b(new ads($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = atn.c.a();
      vo.a $$3 = this.G.b();
      dz $$4 = dz.a(vy.a(this.e($$0)), $$3x -> {
         vz $$4x = new vz($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new adr($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (vy.a(this.e($$0)).a().isEmpty()) {
         vo.a $$1 = this.G.b();
         this.b(new adr($$0, Instant.now(), 0L, dz.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<dx> e(String $$0) {
      return this.y.parse($$0, this.t);
   }

   @Override
   public void e() {
      if (this.b.j()) {
         foo $$0 = this.a.v();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.g();
      if (this.a.aN().f()) {
         this.J.a();
      }

      this.e.a();
      if (this.K != null) {
         this.K.a();
      }
   }

   public void a(cfs $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = vr.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new adt(this.E.a().a()));
         }
      }
   }

   @Nullable
   public fop x() {
      return this.c;
   }

   public cia y() {
      return this.D;
   }

   public boolean a(cia $$0) {
      return $$0.a(this.y());
   }

   public eng z() {
      return this.N;
   }
}
