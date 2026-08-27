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

public class flp extends fll implements uk, yh {
   private static final Logger g = LogUtils.getLogger();
   private static final uv h = uv.c("multiplayer.unsecureserver.toast.title");
   private static final uv i = uv.c("multiplayer.unsecureserver.toast");
   private static final uv j = uv.c("multiplayer.disconnect.invalid_packet");
   private static final uv k = uv.c("multiplayer.disconnect.chat_validation_failed");
   private static final uv l = uv.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private flo o;
   private flo.a p;
   private final Map<UUID, flx> q = Maps.newHashMap();
   private final Set<flx> r = new ReferenceOpenHashSet();
   private final flj s;
   private final flr t;
   private final esz u = new esz(this);
   private int v = 3;
   private int w = 3;
   private final atw x = atw.b();
   private CommandDispatcher<dy> y = new CommandDispatcher();
   private final cow z = new cow();
   private final UUID A = UUID.randomUUID();
   private Set<agl<csf>> B;
   private final it.b C;
   private final cgi D;
   @Nullable
   private vg E;
   private vp.c F = vp.c.a;
   private vd G = new vd(20);
   private vi H = vi.a();
   private final fli I = new fli();
   private final flw J;
   @Nullable
   private flu K;
   private boolean L = false;
   private volatile boolean M;

   public flp(eti $$0, tw $$1, fls $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new flj($$0, this.e);
      this.t = new flr(this, $$0);
      this.J = new flw(this, $$0.aM().k());
   }

   public flr i() {
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

   public cow l() {
      return this.z;
   }

   @Override
   public void a(zw $$0) {
      wq.a($$0, this, this.a);
      this.z();
      this.a.q = new flv(this.a, this);
      acm $$1 = $$0.l();
      List<agl<csf>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      agl<csf> $$3 = $$1.b();
      ig<dkw> $$4 = this.C.d(kd.aw).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      flo.a $$7 = new flo.a(biy.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new flo(this, $$7, $$3, $$4, this.v, this.w, this.a::aF, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new arg(), new esv());
         this.a.s.r(-180.0F);
         if (this.a.S() != null) {
            this.a.S().a(this.a.s.cw());
         }
      }

      this.a.k.a();
      this.a.s.z();
      this.a.s.e($$0.a());
      this.o.c(this.a.s);
      this.a.s.co = new fqa(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.o);
      this.a.s.u($$0.i());
      this.a.s.b($$0.j());
      this.a.s.w($$0.k());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.g());
      this.E = null;
      this.G = new vd(20);
      this.H = vi.a();
      if (this.b.j()) {
         this.a.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aY().a(this.a);
   }

   @Override
   public void a(yi $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.o.c($$1);
         this.a($$1);
      } else {
         g.warn("Skipping Entity with id {}", $$0.e());
      }
   }

   @Nullable
   private bkv b(yi $$0) {
      bkz<?> $$1 = $$0.e();
      if ($$1 == bkz.bt) {
         flx $$2 = this.a($$0.d());
         if ($$2 == null) {
            g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
            return null;
         } else {
            return new fqc(this.o, $$2.a());
         }
      } else {
         return $$1.a((csf)this.o);
      }
   }

   private void a(bkv $$0) {
      if ($$0 instanceof cfq $$1) {
         this.a.ah().a((gfh)(new gfa($$1)));
      } else if ($$0 instanceof bwx $$2) {
         boolean $$3 = $$2.aa_();
         geu $$4;
         if ($$3) {
            $$4 = new ges($$2);
         } else {
            $$4 = new get($$2);
         }

         this.a.ah().a((gfi)$$4);
      }
   }

   @Override
   public void a(yj $$0) {
      wq.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      bkv $$4 = new blb(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.c($$4);
   }

   @Override
   public void a(abk $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(abi $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.an().a($$0.d());
      }
   }

   @Override
   public void a(acf $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         double $$2 = $$0.d();
         double $$3 = $$0.e();
         double $$4 = $$0.f();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cY()) {
            float $$5 = (float)($$0.g() * 360) / 256.0F;
            float $$6 = (float)($$0.h() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.c($$0.i());
         }
      }
   }

   @Override
   public void a(acg $$0) {
      wq.a($$0, this, this.a);
      if (this.a.r != null) {
         bjl $$1 = this.a.r.r();
         $$1.a($$0.a());
         $$1.a($$0.d());
      }
   }

   @Override
   public void a(ach $$0) {
      wq.a($$0, this, this.a);
      if (this.a.r != null) {
         bjl $$1 = this.a.r.r();
         $$1.c($$0.a());
      }
   }

   @Override
   public void a(abd $$0) {
      wq.a($$0, this, this.a);
      if (cdy.d($$0.a())) {
         this.a.s.fT().l = $$0.a();
      }
   }

   @Override
   public void a(zz $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cY()) {
            if ($$0.i()) {
               aem $$2 = $$1.ah();
               ejz $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
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
   public void a(aas $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(aap $$0) {
      wq.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, bkv.c.b));
   }

   @Override
   public void a(aan $$0) {
      wq.a($$0, this, this.a);
      cdz $$1 = this.a.s;
      ejz $$2 = $$1.dq();
      boolean $$3 = $$0.i().contains(blz.a);
      boolean $$4 = $$0.i().contains(blz.b);
      boolean $$5 = $$0.i().contains(blz.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.ds() + $$0.a();
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
         $$11 = $$1.du() + $$0.d();
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
         $$15 = $$1.dy() + $$0.e();
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
      if ($$0.i().contains(blz.e)) {
         $$1.s($$1.dF() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(blz.d)) {
         $$1.r($$1.dD() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new acs($$0.h()));
      this.b.a(new adm.b($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF(), false));
   }

   @Override
   public void a(aat $$0) {
      wq.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(zr $$0) {
      wq.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      zv $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dju $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(yw $$0) {
      wq.a($$0, this, this.a);

      for (yw.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (yw.a $$2 : $$0.a()) {
         this.o.a(new crm($$2.b().e, $$2.b().f));
      }

      for (yw.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.am(); $$6 < this.o.an(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, zq $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dju $$0, int $$1, int $$2) {
      ecm $$3 = this.o.i().p();
      djv[] $$4 = $$0.d();
      crm $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         djv $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(iy.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(zl $$0) {
      wq.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(zl $$0) {
      crm $$1 = $$0.a();
      this.o.a(() -> {
         ecm $$1x = this.o.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            iy $$3 = iy.a($$1, $$2);
            $$1x.a(cso.b, $$3, null);
            $$1x.a(cso.a, $$3, null);
         }

         for (int $$4 = this.o.am(); $$4 < this.o.an(); $$4++) {
            $$1x.a(iy.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(yq $$0) {
      wq.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(abz $$0) {
      this.b.a();
      wq.a($$0, this, this.a);
      this.a.c(new fea(l, this.b));
      this.b.a(new flm(this.a, this.b, new fls(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new adc());
   }

   @Override
   public void a(ace $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      bll $$2 = (bll)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof blb) {
            this.o.a($$1.ds(), $$1.du(), $$1.dy(), aqv.hU, aqw.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.ds(), $$1.du(), $$1.dy(), aqv.mu, aqw.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new foh(this.a.an(), this.a.aN(), this.o, $$1, $$2));
         if ($$1 instanceof cas $$3) {
            clo $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), bkv.c.b);
            }
         } else if (!($$1 instanceof blb)) {
            this.o.a($$0.a(), bkv.c.b);
         }
      }
   }

   @Override
   public void a(acb $$0) {
      wq.a($$0, this, this.a);
      this.a.aV().a($$0.a(), $$0.d());
   }

   @Override
   public void a(aag $$0) {
      wq.a($$0, this, this.a);
      Optional<vo> $$1 = $$0.f().a(this.H);
      Optional<ur.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         flx $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.a.aV().a($$3, $$2.get());
         } else {
            vm $$5 = $$4.b();
            vq $$6;
            if ($$5 != null) {
               $$6 = new vq($$0.d(), $$3, $$5.c());
            } else {
               $$6 = vq.a($$3);
            }

            vl $$8 = new vl($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
            if (!$$4.c().updateAndValidate($$8)) {
               this.a.aV().a($$3, $$2.get());
            } else {
               this.a.aV().a($$8, $$4.a(), $$2.get());
               this.H.a($$8);
            }
         }
      } else {
         this.b.a(j);
      }
   }

   @Override
   public void a(zi $$0) {
      wq.a($$0, this, this.a);
      Optional<ur.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aV().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(zh $$0) {
      wq.a($$0, this, this.a);
      Optional<vh> $$1 = $$0.a().a(this.H);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.G.a($$1.get());
         if (!this.a.aV().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(yk $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bll $$2 = (bll)$$1;
            $$2.a(bja.a);
         } else if ($$0.d() == 3) {
            bll $$3 = (bll)$$1;
            $$3.a(bja.b);
         } else if ($$0.d() == 2) {
            cdz $$4 = (cdz)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, jw.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, jw.s);
         }
      }
   }

   @Override
   public void a(zo $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(abu $$0) {
      wq.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(abg $$0) {
      wq.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
   }

   @Override
   public void a(abp $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bB();

         for (int $$3 : $$0.a()) {
            bkv $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cfs) {
                     this.a.s.N = $$1.dD();
                     this.a.s.r($$1.dD());
                     this.a.s.n($$1.dD());
                  }

                  uv $$5 = uv.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aU().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(abj $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 instanceof bln) {
         ((bln)$$1).r($$0.d());
      }
   }

   private static clo a(cdz $$0) {
      for (bja $$1 : bja.values()) {
         clo $$2 = $$0.b($$1);
         if ($$2.a(clr.vl)) {
            return $$2;
         }
      }

      return new clo(clr.vl);
   }

   @Override
   public void a(zj $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ah().a((gfh)(new gez((cbj)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, jw.af, 30);
               this.o.a($$1.ds(), $$1.du(), $$1.dy(), aqv.yh, $$1.dc(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cdz)this.a.s));
               }
               break;
            case 63:
               this.a.ah().a((gfh)(new gfd((bzi)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(zg $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(abn $$0) {
      wq.a($$0, this, this.a);
      this.a.s.D($$0.a());
      this.a.s.gd().a($$0.d());
      this.a.s.gd().b($$0.e());
   }

   @Override
   public void a(abm $$0) {
      wq.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aar $$0) {
      wq.a($$0, this, this.a);
      acm $$1 = $$0.a();
      agl<csf> $$2 = $$1.b();
      ig<dkw> $$3 = this.C.d(kd.aw).f($$1.a());
      fqb $$4 = this.a.s;
      if ($$2 != $$4.dN().ad()) {
         eky $$5 = this.o.J();
         Map<String, eeh> $$6 = this.o.l();
         boolean $$7 = $$1.f();
         boolean $$8 = $$1.g();
         flo.a $$9 = new flo.a(this.p.s(), this.p.n(), $$8);
         this.p = $$9;
         this.o = new flo(this, $$9, $$2, $$3, this.v, this.w, this.a::aF, this.a.f, $$7, $$1.c());
         this.o.a($$5);
         this.o.a($$6);
         this.a.a(this.o);
      }

      this.a.t = null;
      if ($$4.fV()) {
         $$4.r();
      }

      fqb $$10;
      if ($$0.a((byte)2)) {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m(), $$4.bS(), $$4.bY());
      } else {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m());
      }

      this.a($$10, this.o);
      $$10.e($$4.aj());
      this.a.s = $$10;
      if ($$2 != $$4.dN().ad()) {
         this.a.r().b();
      }

      this.a.t = $$10;
      if ($$0.a((byte)2)) {
         List<afv.b<?>> $$12 = $$4.an().c();
         if ($$12 != null) {
            $$10.an().a($$12);
         }
      }

      if ($$0.a((byte)1)) {
         $$10.eS().a($$4.eS());
      }

      $$10.z();
      this.o.c($$10);
      $$10.r(-180.0F);
      $$10.co = new fqa(this.a.m);
      this.a.q.a($$10);
      $$10.u($$4.gj());
      $$10.b($$4.o());
      $$10.a($$1.h());
      $$10.f($$1.i());
      $$10.cv = $$4.cv;
      $$10.cw = $$4.cw;
      if (this.a.y instanceof ezy || this.a.y instanceof ezy.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(zk $$0) {
      wq.a($$0, this, this.a);
      crx $$1 = new crx(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j());
      $$1.a(true);
      this.a.s.g(this.a.s.dq().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(zn $$0) {
      wq.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof byv $$2) {
         fqb $$3 = this.a.s;
         bjj $$4 = new bjj($$0.d());
         chr $$5 = new chr($$0.a(), $$3.fT(), $$4, $$2);
         $$3.bS = $$5;
         this.a.a(new fcx($$5, $$3.fT(), $$2));
      }
   }

   @Override
   public void a(aac $$0) {
      wq.a($$0, this, this.a);
      fam.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(zd $$0) {
      wq.a($$0, this, this.a);
      cdz $$1 = this.a.s;
      clo $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.ay().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof fcn)) {
            $$1.bS.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fT().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fcn $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.a() == 0 && chs.f($$3)) {
            if (!$$2.b()) {
               clo $$6 = $$1.bR.b($$3).f();
               if ($$6.b() || $$6.L() < $$2.L()) {
                  $$2.e(5);
               }
            }

            $$1.bR.a($$3, $$0.f(), $$2);
         } else if ($$0.a() == $$1.bS.j && ($$0.a() != 0 || !$$4)) {
            $$1.bS.a($$3, $$0.f(), $$2);
         }
      }
   }

   @Override
   public void a(zb $$0) {
      wq.a($$0, this, this.a);
      cdz $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bR.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bS.j) {
         $$1.bS.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(aad $$0) {
      wq.a($$0, this, this.a);
      hx $$1 = $$0.a();
      if (this.o.c_($$1) instanceof dgr $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         dhn $$3 = this.o.a_($$1);
         dgr $$4 = new dgr($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(yo $$0) {
      wq.a($$0, this, this.a);
      hx $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         sd $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof dfs && this.a.y instanceof fci) {
            ((fci)this.a.y).E();
         }
      });
   }

   @Override
   public void a(zc $$0) {
      wq.a($$0, this, this.a);
      cdz $$1 = this.a.s;
      if ($$1.bS != null && $$1.bS.j == $$0.a()) {
         $$1.bS.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(abl $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((bla)$$1x.getFirst(), (clo)$$1x.getSecond()));
      }
   }

   @Override
   public void a(za $$0) {
      wq.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(yp $$0) {
      wq.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(yn $$0) {
      wq.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zm $$0) {
      wq.a($$0, this, this.a);
      cdz $$1 = this.a.s;
      zm.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = atq.d($$3 + 0.5F);
      if ($$2 == zm.a) {
         $$1.a(uv.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == zm.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == zm.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == zm.d) {
         this.a.q.a(csc.a($$4));
      } else if ($$2 == zm.e) {
         if ($$4 == 0) {
            this.a.s.cn.b(new ada(ada.a.a));
            this.a.a(new fax(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fbh(true, () -> {
               this.a.s.cn.b(new ada(ada.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == zm.f) {
         etm $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new ezz());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(uv.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(uv.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(uv.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(uv.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == zm.g) {
         this.o.a($$1, $$1.ds(), $$1.dw(), $$1.dy(), aqv.aq, aqw.h, 0.18F, 0.45F);
      } else if ($$2 == zm.h) {
         this.o.e($$3);
      } else if ($$2 == zm.i) {
         this.o.c($$3);
      } else if ($$2 == zm.j) {
         this.o.a($$1, $$1.ds(), $$1.du(), $$1.dy(), aqv.tD, aqw.g, 1.0F, 1.0F);
      } else if ($$2 == zm.k) {
         this.o.a(jw.r, $$1.ds(), $$1.du(), $$1.dy(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.ds(), $$1.du(), $$1.dy(), aqv.hd, aqw.f, 1.0F, 1.0F);
         }
      } else if ($$2 == zm.l) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == zm.m) {
         this.a.s.w($$3 == 1.0F);
      } else if ($$2 == zm.n && this.K != null) {
         this.K.c();
      }
   }

   private void a(fqb $$0, flo $$1) {
      this.K = new flu($$0, $$1, this.a.f);
      this.a.a(new fax(this.K::b));
   }

   @Override
   public void a(zx $$0) {
      wq.a($$0, this, this.a);
      euv $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = clv.a($$2);
      eeh $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = eeh.a($$0.d(), $$0.e(), this.a.r.ad());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(zs $$0) {
      wq.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(aci $$0) {
      wq.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(aau $$0) {
      wq.a($$0, this, this.a);
      agm $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(yz $$0) {
      wq.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dp.a((ii.b)this.C, this.D)));
   }

   @Override
   public void a(aca $$0) {
      wq.a($$0, this, this.a);
      this.a.ah().a($$0.a(), $$0.d());
   }

   @Override
   public void a(yy $$0) {
      wq.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(acl $$0) {
      wq.a($$0, this, this.a);
      this.z.a($$0.a());
      esv $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.I_());
      this.a.a(gft.c, $$1.b());
   }

   @Override
   public void a(aam $$0) {
      wq.a($$0, this, this.a);
      ejz $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(acd $$0) {
      wq.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(yl $$0) {
      wq.a($$0, this, this.a);

      for (Entry<arc<?>, Integer> $$1 : $$0.a().entrySet()) {
         arc<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fbj) {
         ((fbj)this.a.y).D();
      }
   }

   @Override
   public void a(aao $$0) {
      wq.a($$0, this, this.a);
      esv $$1 = this.a.s.m();
      $$1.a($$0.e());
      aao.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (agm $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (agm $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (agm $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (agm $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     exk.a(this.a.ax(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fet) {
         ((fet)this.a.y).E();
      }
   }

   @Override
   public void a(ack $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 instanceof bll) {
         bkg $$2 = $$0.d();
         if ($$2 != null) {
            bki $$3 = new bki($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((bll)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      this.z();
   }

   private void z() {
      if (!this.b.g()) {
         cvh.a();
      }

      cjv.e().n();
   }

   @Override
   public void a(aah $$0) {
   }

   @Override
   public void a(aai $$0) {
   }

   @Override
   public void a(aaj $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new ezy($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fR();
         }
      }
   }

   @Override
   public void a(yt $$0) {
      wq.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(abc $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(zp $$0) {
      wq.a($$0, this, this.a);
      dje $$1 = this.o.D_();
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
   public void a(aax $$0) {
      wq.a($$0, this, this.a);
      this.o.D_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(aay $$0) {
      wq.a($$0, this, this.a);
      this.o.D_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aaz $$0) {
      wq.a($$0, this, this.a);
      this.o.D_().a($$0.a());
   }

   @Override
   public void a(abb $$0) {
      wq.a($$0, this, this.a);
      this.o.D_().c($$0.a());
   }

   @Override
   public void a(aba $$0) {
      wq.a($$0, this, this.a);
      this.o.D_().b($$0.a());
   }

   @Override
   public void a(yx $$0) {
      wq.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(aav $$0) {
      wq.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().map(flz::b).ifPresent(this.c::a);
         this.c.a($$0.e());
         fma.b(this.c);
         if (!this.L && !$$0.e()) {
            exl $$1 = exl.a(this.a, exl.a.h, h, i);
            this.a.ax().a($$1);
            this.L = true;
         }
      }
   }

   @Override
   public void a(zf $$0) {
      wq.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(aaw $$0) {
      wq.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(abv $$0) {
      wq.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(abt $$0) {
      wq.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(abw $$0) {
      wq.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(acc $$0) {
      wq.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(aaq $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = $$0.a(this.o);
      if ($$1 instanceof bll) {
         ((bll)$$1).c($$0.a());
      }
   }

   @Override
   public void a(aak $$0) {
      wq.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aJ().f($$1);
         flx $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(aal $$0) {
      wq.a($$0, this, this.a);

      for (aal.b $$1 : $$0.e()) {
         flx $$2 = new flx(Objects.requireNonNull($$1.b()), this.A());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aJ().a($$2);
         }
      }

      for (aal.b $$3 : $$0.d()) {
         flx $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (aal.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aal.a $$0, aal.b $$1, flx $$2) {
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

   private void a(aal.b $$0, flx $$1) {
      GameProfile $$2 = $$1.a();
      auc $$3 = this.a.aS();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         vm.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               vm $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cec.b var7) {
               g.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.A());
            }
         } else {
            $$1.a(this.A());
         }
      }
   }

   private boolean A() {
      return this.c != null && this.c.f();
   }

   @Override
   public void a(aaf $$0) {
      wq.a($$0, this, this.a);
      cdz $$1 = this.a.s;
      $$1.fU().b = $$0.d();
      $$1.fU().d = $$0.f();
      $$1.fU().a = $$0.a();
      $$1.fU().c = $$0.e();
      $$1.fU().a($$0.g());
      $$1.fU().b($$0.h());
   }

   @Override
   public void a(aby $$0) {
      wq.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(abx $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(yr $$0) {
      wq.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(ze $$0) {
      wq.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.go().b($$0.a());
      } else {
         this.a.s.go().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(aaa $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.a.s.cX();
      if ($$1 != this.a.s && $$1.cY()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new adn($$1));
      }
   }

   @Override
   public void a(aab $$0) {
      wq.a($$0, this, this.a);
      clo $$1 = this.a.s.b($$0.a());
      if ($$1.a(clr.tT)) {
         this.a.a(new fcf(new fcf.c($$1)));
      }
   }

   @Override
   public void a(xh $$0) {
      if ($$0 instanceof xq $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof xp $$2) {
         ((fup)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof xv $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof xx $$4) {
         ((fux)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof xt $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof xr $$6) {
         fue.a $$7 = new fue.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof xs $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof xw $$9) {
         fuv $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof xn $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof xf $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof xe $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof xo $$14) {
         this.a.k.o.a($$14.b(), this.o.W());
      } else if ($$0 instanceof xl $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof xm) {
         this.a.k.r.a();
      } else if ($$0 instanceof xu $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof xj $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof xk $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else {
         this.b($$0);
      }
   }

   private void b(xh $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(abo $$0) {
      wq.a($$0, this, this.a);
      eky $$1 = this.o.J();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, elb.a, $$0.d(), $$0.f());
      } else {
         ekv $$3 = $$1.b($$2);
         if ($$3 != null) {
            if ($$0.e() == 1) {
               $$1.j($$3);
            } else if ($$0.e() == 2) {
               $$3.a($$0.f());
               $$3.a($$0.d());
            }
         }
      }
   }

   @Override
   public void a(abr $$0) {
      wq.a($$0, this, this.a);
      eky $$1 = this.o.J();
      String $$2 = $$0.d();
      switch ($$0.f()) {
         case a:
            ekv $$3 = $$1.b($$2);
            if ($$3 != null) {
               ekx $$4 = $$1.c($$0.a(), $$3);
               $$4.b($$0.e());
            } else {
               g.warn("Received packet for unknown scoreboard: {}", $$2);
            }
            break;
         case b:
            $$1.d($$0.a(), $$1.b($$2));
      }
   }

   @Override
   public void a(abh $$0) {
      wq.a($$0, this, this.a);
      eky $$1 = this.o.J();
      String $$2 = $$0.d();
      ekv $$3 = $$2 == null ? null : $$1.b($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(abq $$0) {
      wq.a($$0, this, this.a);
      eky $$1 = this.o.J();
      abq.a $$2 = $$0.d();
      ekw $$3;
      if ($$2 == abq.a.a) {
         $$3 = $$1.e($$0.e());
      } else {
         $$3 = $$1.d($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<abq.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         ela.b $$2x = ela.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         ela.a $$3x = ela.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      abq.a $$6 = $$0.a();
      if ($$6 == abq.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == abq.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == abq.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(zt $$0) {
      wq.a($$0, this, this.a);
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
   public void a(acj $$0) {
      wq.a($$0, this, this.a);
      bkv $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bll)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bmo $$2 = ((bll)$$1).eS();

            for (acj.a $$3 : $$0.d()) {
               bmn $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, kc.v.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bmp $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aae $$0) {
      wq.a($$0, this, this.a);
      cgr $$1 = this.a.s.bS;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fet) {
               fen $$2 = ((fet)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(zu $$0) {
      wq.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      zv $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, zv $$2) {
      ecm $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cso.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cso.b, $$7, $$8, $$9);
      $$3.a(new crm($$0, $$1), true);
   }

   @Override
   public void a(zy $$0) {
      wq.a($$0, this, this.a);
      cgr $$1 = this.a.s.bS;
      if ($$0.a() == $$1.j && $$1 instanceof cia $$2) {
         $$2.a($$0.d());
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(abf $$0) {
      wq.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(abs $$0) {
      wq.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(abe $$0) {
      wq.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(ym $$0) {
      wq.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(ys $$0) {
      wq.a($$0, this, this.a);

      for (wo<yh> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(yv $$0) {
      this.I.a();
   }

   @Override
   public void a(yu $$0) {
      this.I.a($$0.a());
      this.b(new acz(this.I.b()));
   }

   @Override
   public void a(afl $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, ecm $$2, cso $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, iy.a($$0, $$8, $$1), $$9 ? new djp((byte[])$$6.next().clone()) : new djp());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public tw m() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k() && !this.M;
   }

   public Collection<flx> n() {
      return this.r;
   }

   public Collection<flx> o() {
      return this.q.values();
   }

   public Collection<UUID> p() {
      return this.q.keySet();
   }

   @Nullable
   public flx a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public flx a(String $$0) {
      for (flx $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile q() {
      return this.n;
   }

   public flj r() {
      return this.s;
   }

   public CommandDispatcher<dy> s() {
      return this.y;
   }

   public flo t() {
      return this.o;
   }

   public esz u() {
      return this.u;
   }

   public UUID v() {
      return this.A;
   }

   public Set<agl<csf>> w() {
      return this.B;
   }

   @Override
   public it.b f() {
      return this.C;
   }

   public void a(vl $$0, boolean $$1) {
      vh $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new acv($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = asp.c.a();
      vd.a $$3 = this.G.b();
      vh $$4 = this.F.pack(new vo($$0, $$1, $$2, $$3.a()));
      this.b(new acx($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = asp.c.a();
      vd.a $$3 = this.G.b();
      ea $$4 = ea.a(vn.a(this.e($$0)), $$3x -> {
         vo $$4x = new vo($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new acw($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (vn.a(this.e($$0)).a().isEmpty()) {
         vd.a $$1 = this.G.b();
         this.b(new acw($$0, Instant.now(), 0L, ea.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<dy> e(String $$0) {
      return this.y.parse($$0, this.t);
   }

   @Override
   public void e() {
      if (this.b.j()) {
         fly $$0 = this.a.v();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.g();
      if (this.a.aM().f()) {
         this.J.a();
      }

      this.e.a();
      if (this.K != null) {
         this.K.a();
      }
   }

   public void a(ceb $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = vg.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new acy(this.E.a().a()));
         }
      }
   }

   @Nullable
   public flz x() {
      return this.c;
   }

   public cgi y() {
      return this.D;
   }

   public boolean a(cgi $$0) {
      return $$0.a(this.y());
   }
}
