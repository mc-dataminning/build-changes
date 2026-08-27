import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.logging.LogUtils;
import io.netty.buffer.Unpooled;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class fex implements so, ur {
   private static final Logger a = LogUtils.getLogger();
   private static final sw b = sw.c("disconnect.lost");
   private static final sw c = sw.c("multiplayer.unsecureserver.toast.title");
   private static final sw d = sw.c("multiplayer.unsecureserver.toast");
   private static final sw e = sw.c("multiplayer.disconnect.invalid_packet");
   private static final sw f = sw.c("multiplayer.disconnect.chat_validation_failed");
   private static final int g = 64;
   private final sd h;
   private final List<fex.a> i = new ArrayList<>();
   @Nullable
   private final ffd j;
   private final GameProfile k;
   private final euq l;
   private final enn m;
   private few n;
   private few.a o;
   private final Map<UUID, ffb> p = Maps.newHashMap();
   private final Set<ffb> q = new ReferenceOpenHashSet();
   private final fet r;
   private final fez s;
   private final ene t = new ene(this);
   private int u = 3;
   private int v = 3;
   private final apf w = apf.b();
   private CommandDispatcher<du> x = new CommandDispatcher();
   private final cjd y = new cjd();
   private final UUID z = UUID.randomUUID();
   private Set<acp<cmm>> A;
   private hl<fey> B = fey.a();
   private caw C = cay.f;
   private final fzp D;
   @Nullable
   private tg E;
   private tp.c F = tp.c.a;
   private td G = new td(20);
   private ti H = ti.a();

   public fex(enn $$0, euq $$1, sd $$2, @Nullable ffd $$3, GameProfile $$4, fzp $$5) {
      this.m = $$0;
      this.l = $$1;
      this.h = $$2;
      this.j = $$3;
      this.k = $$4;
      this.r = new fet($$0, $$5);
      this.s = new fez(this, $$0);
      this.D = $$5;
   }

   public fez d() {
      return this.s;
   }

   public void e() {
      this.n = null;
      this.D.c();
   }

   public cjd f() {
      return this.y;
   }

   @Override
   public void a(wi $$0) {
      uq.a($$0, this, this.m);
      this.m.r = new ffa(this.m, this);
      this.B = this.B.a(fey.b, $$0.g());
      if (!this.h.d()) {
         this.B.a().b().forEach($$0x -> $$0x.b().m());
      }

      List<acp<cmm>> $$1 = Lists.newArrayList($$0.f());
      Collections.shuffle($$1);
      this.A = Sets.newLinkedHashSet($$1);
      acp<cmm> $$2 = $$0.i();
      he<dfk> $$3 = this.B.a().d(jc.au).f($$0.h());
      this.u = $$0.l();
      this.v = $$0.m();
      boolean $$4 = $$0.p();
      boolean $$5 = $$0.q();
      few.a $$6 = new few.a(bdu.c, $$0.c(), $$5);
      this.o = $$6;
      this.n = new few(this, $$6, $$2, $$3, this.u, this.v, this.m::aG, this.m.f, $$4, $$0.j());
      this.m.a(this.n);
      if (this.m.t == null) {
         this.m.t = this.m.r.a(this.n, new ams(), new enb());
         this.m.t.a_(-180.0F);
         if (this.m.S() != null) {
            this.m.S().a(this.m.t.ct());
         }
      }

      this.m.k.a();
      this.m.t.E();
      int $$7 = $$0.a();
      this.m.t.e($$7);
      this.n.a($$7, (fiv)this.m.t);
      this.m.t.cm = new fix(this.m.m);
      this.m.r.a(this.m.t);
      this.m.u = this.m.t;
      this.m.a(new eup());
      this.m.t.u($$0.n());
      this.m.t.b($$0.o());
      this.m.t.a($$0.r());
      this.m.t.f($$0.s());
      this.m.r.a($$0.d(), $$0.e());
      this.m.m.b($$0.l());
      this.m.m.ar();
      this.h.a(new zq(zq.a, new sf(Unpooled.buffer()).a(ClientBrandRetriever.getClientModName())));
      this.E = null;
      this.G = new td(20);
      this.H = ti.a();
      if (this.h.g()) {
         this.m.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.m);
      }

      this.D.a($$0.d(), $$0.c());
      this.m.aY().a(this.m);
   }

   @Override
   public void a(us $$0) {
      uq.a($$0, this, this.m);
      bfn<?> $$1 = $$0.d();
      bfj $$2 = $$1.a((cmm)this.n);
      if ($$2 != null) {
         $$2.a($$0);
         int $$3 = $$0.a();
         this.n.a($$3, $$2);
         this.a($$2);
      } else {
         a.warn("Skipping Entity with id {}", $$1);
      }
   }

   private void a(bfj $$0) {
      if ($$0 instanceof caf) {
         this.m.ah().a((fxy)(new fxr((caf)$$0)));
      } else if ($$0 instanceof brm) {
         boolean $$1 = ((brm)$$0).S_();
         fxl $$2;
         if ($$1) {
            $$2 = new fxj((brm)$$0);
         } else {
            $$2 = new fxk((brm)$$0);
         }

         this.m.ah().a((fxz)$$2);
      }
   }

   @Override
   public void a(ut $$0) {
      uq.a($$0, this, this.m);
      double $$1 = $$0.c();
      double $$2 = $$0.d();
      double $$3 = $$0.e();
      bfj $$4 = new bfp(this.n, $$1, $$2, $$3, $$0.f());
      $$4.f($$1, $$2, $$3);
      $$4.a_(0.0F);
      $$4.b_(0.0F);
      $$4.e($$0.a());
      this.n.a($$0.a(), $$4);
   }

   @Override
   public void a(xy $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.c() / 8000.0, (double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0);
      }
   }

   @Override
   public void a(xw $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         $$1.aj().a($$0.c());
      }
   }

   @Override
   public void a(uu $$0) {
      uq.a($$0, this, this.m);
      ffb $$1 = this.a($$0.c());
      if ($$1 == null) {
         a.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.c());
      } else {
         double $$2 = $$0.d();
         double $$3 = $$0.e();
         double $$4 = $$0.f();
         float $$5 = (float)($$0.g() * 360) / 256.0F;
         float $$6 = (float)($$0.h() * 360) / 256.0F;
         int $$7 = $$0.a();
         fiz $$8 = new fiz(this.m.s, $$1.a());
         $$8.e($$7);
         $$8.f($$2, $$3, $$4);
         $$8.a($$2, $$3, $$4, $$5, $$6);
         $$8.bk();
         this.n.a($$7, (fiv)$$8);
      }
   }

   @Override
   public void a(ys $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         double $$2 = $$0.c();
         double $$3 = $$0.d();
         double $$4 = $$0.e();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cU()) {
            float $$5 = (float)($$0.f() * 360) / 256.0F;
            float $$6 = (float)($$0.g() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3, true);
            $$1.c($$0.h());
         }
      }
   }

   @Override
   public void a(xr $$0) {
      uq.a($$0, this, this.m);
      if (byn.d($$0.a())) {
         this.m.t.fN().l = $$0.a();
      }
   }

   @Override
   public void a(wl $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = $$0.a(this.n);
      if ($$1 != null) {
         if (!$$1.cU()) {
            if ($$0.h()) {
               aaz $$2 = $$1.ad();
               eei $$3 = $$2.a((long)$$0.a(), (long)$$0.c(), (long)$$0.d());
               $$2.e($$3);
               float $$4 = $$0.g() ? (float)($$0.e() * 360) / 256.0F : $$1.dy();
               float $$5 = $$0.g() ? (float)($$0.f() * 360) / 256.0F : $$1.dA();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3, false);
            } else if ($$0.g()) {
               float $$6 = (float)($$0.e() * 360) / 256.0F;
               float $$7 = (float)($$0.f() * 360) / 256.0F;
               $$1.a($$1.dn(), $$1.dp(), $$1.dt(), $$6, $$7, 3, false);
            }

            $$1.c($$0.i());
         }
      }
   }

   @Override
   public void a(xg $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = $$0.a(this.n);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(xc $$0) {
      uq.a($$0, this, this.m);
      $$0.a().forEach($$0x -> this.n.a($$0x, bfj.c.b));
   }

   @Override
   public void a(xa $$0) {
      uq.a($$0, this, this.m);
      byo $$1 = this.m.t;
      eei $$2 = $$1.dl();
      boolean $$3 = $$0.h().contains(bgn.a);
      boolean $$4 = $$0.h().contains(bgn.b);
      boolean $$5 = $$0.h().contains(bgn.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dn() + $$0.a();
         $$1.ab = $$1.ab + $$0.a();
         $$1.J = $$1.J + $$0.a();
      } else {
         $$6 = 0.0;
         $$7 = $$0.a();
         $$1.ab = $$7;
         $$1.J = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.dp() + $$0.c();
         $$1.ac = $$1.ac + $$0.c();
         $$1.K = $$1.K + $$0.c();
      } else {
         $$10 = 0.0;
         $$11 = $$0.c();
         $$1.ac = $$11;
         $$1.K = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dt() + $$0.d();
         $$1.ad = $$1.ad + $$0.d();
         $$1.L = $$1.L + $$0.d();
      } else {
         $$14 = 0.0;
         $$15 = $$0.d();
         $$1.ad = $$15;
         $$1.L = $$15;
      }

      $$1.e($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.e();
      float $$19 = $$0.f();
      if ($$0.h().contains(bgn.e)) {
         $$1.b_($$1.dA() + $$19);
         $$1.N += $$19;
      } else {
         $$1.b_($$19);
         $$1.N = $$19;
      }

      if ($$0.h().contains(bgn.d)) {
         $$1.a_($$1.dy() + $$18);
         $$1.M += $$18;
      } else {
         $$1.a_($$18);
         $$1.M = $$18;
      }

      this.h.a(new zd($$0.g()));
      this.h.a(new zx.b($$1.dn(), $$1.dp(), $$1.dt(), $$1.dy(), $$1.dA(), false));
   }

   @Override
   public void a(xh $$0) {
      uq.a($$0, this, this.m);
      $$0.a(($$0x, $$1) -> this.n.b($$0x, $$1, 19));
   }

   @Override
   public void a(wd $$0) {
      uq.a($$0, this, this.m);
      int $$1 = $$0.a();
      int $$2 = $$0.c();
      this.a($$1, $$2, $$0.d());
      wh $$3 = $$0.e();
      this.n.a(() -> {
         this.a($$1, $$2, $$3);
         dei $$3x = this.n.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(vf $$0) {
      uq.a($$0, this, this.m);

      for (vf.a $$1 : $$0.a()) {
         this.n.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (vf.a $$2 : $$0.a()) {
         this.n.a(new clt($$2.b().e, $$2.b().f));
      }

      for (vf.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.n.al(); $$6 < this.n.am(); $$6++) {
                  this.m.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, wc $$2) {
      this.n.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dei $$0, int $$1, int $$2) {
      dwt $$3 = this.n.i().p();
      dej[] $$4 = $$0.d();
      clt $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dej $$7 = $$4[$$6];
         int $$8 = this.n.g($$6);
         $$3.a(hx.a($$5, $$8), $$7.c());
         this.n.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(vw $$0) {
      uq.a($$0, this, this.m);
      int $$1 = $$0.a();
      int $$2 = $$0.c();
      feu $$3 = this.n.i();
      $$3.d($$1, $$2);
      this.b($$0);
   }

   private void b(vw $$0) {
      clt $$1 = new clt($$0.a(), $$0.c());
      this.n.a(() -> {
         dwt $$1x = this.n.s_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            hx $$3 = hx.a($$1, $$2);
            $$1x.a(cmv.b, $$3, null);
            $$1x.a(cmv.a, $$3, null);
         }

         for (int $$4 = this.n.al(); $$4 < this.n.am(); $$4++) {
            $$1x.a(hx.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(vb $$0) {
      uq.a($$0, this, this.m);
      this.n.b($$0.c(), $$0.a(), 19);
   }

   @Override
   public void a(vs $$0) {
      this.h.a($$0.a());
   }

   @Override
   public void a(sw $$0) {
      this.m.y();
      this.D.c();
      if (this.l != null) {
         if (this.l instanceof gan) {
            this.m.a(new gaj(this.l, b, $$0));
         } else {
            this.m.a(new ett(this.l, b, $$0));
         }
      } else {
         this.m.a(new ett(new exn(new euw()), b, $$0));
      }
   }

   public void a(uo<?> $$0) {
      this.h.a($$0);
   }

   @Override
   public void a(yr $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      bfz $$2 = (bfz)this.n.a($$0.c());
      if ($$2 == null) {
         $$2 = this.m.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bfp) {
            this.n.a($$1.dn(), $$1.dp(), $$1.dt(), amh.hA, ami.h, 0.1F, (this.w.i() - this.w.i()) * 0.35F + 0.9F, false);
         } else {
            this.n.a($$1.dn(), $$1.dp(), $$1.dt(), amh.ma, ami.h, 0.2F, (this.w.i() - this.w.i()) * 1.4F + 2.0F, false);
         }

         this.m.g.a(new fhg(this.m.an(), this.m.aN(), this.n, $$1, $$2));
         if ($$1 instanceof bvh $$3) {
            cfz $$4 = $$3.j();
            if (!$$4.b()) {
               $$4.h($$0.d());
            }

            if ($$4.b()) {
               this.n.a($$0.a(), bfj.c.b);
            }
         } else if (!($$1 instanceof bfp)) {
            this.n.a($$0.a(), bfj.c.b);
         }
      }
   }

   @Override
   public void a(yo $$0) {
      uq.a($$0, this, this.m);
      this.m.aV().a($$0.a(), $$0.c());
   }

   @Override
   public void a(wt $$0) {
      uq.a($$0, this, this.m);
      Optional<to> $$1 = $$0.e().a(this.H);
      Optional<ss.a> $$2 = $$0.h().a(this.B.a());
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         ffb $$4 = this.a($$3);
         if ($$4 == null) {
            this.h.a(f);
         } else {
            tm $$5 = $$4.b();
            tq $$6;
            if ($$5 != null) {
               $$6 = new tq($$0.c(), $$3, $$5.d());
            } else {
               $$6 = tq.a($$3);
            }

            tl $$8 = new tl($$6, $$0.d(), $$1.get(), $$0.f(), $$0.g());
            if (!$$4.c().updateAndValidate($$8)) {
               this.h.a(f);
            } else {
               this.m.aV().a($$8, $$4.a(), $$2.get());
               this.H.a($$8);
            }
         }
      } else {
         this.h.a(e);
      }
   }

   @Override
   public void a(vt $$0) {
      uq.a($$0, this, this.m);
      Optional<ss.a> $$1 = $$0.c().a(this.B.a());
      if ($$1.isEmpty()) {
         this.h.a(e);
      } else {
         this.m.aV().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(vr $$0) {
      uq.a($$0, this, this.m);
      Optional<th> $$1 = $$0.a().a(this.H);
      if ($$1.isEmpty()) {
         this.h.a(e);
      } else {
         this.G.a($$1.get());
         if (!this.m.aV().a($$1.get())) {
            this.m.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(uv $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         if ($$0.c() == 0) {
            bfz $$2 = (bfz)$$1;
            $$2.a(bdw.a);
         } else if ($$0.c() == 3) {
            bfz $$3 = (bfz)$$1;
            $$3.a(bdw.b);
         } else if ($$0.c() == 2) {
            byo $$4 = (byo)$$1;
            $$4.a(false, false);
         } else if ($$0.c() == 4) {
            this.m.g.a($$1, iv.g);
         } else if ($$0.c() == 5) {
            this.m.g.a($$1, iv.s);
         }
      }
   }

   @Override
   public void a(vz $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.c());
      }
   }

   @Override
   public void a(yi $$0) {
      uq.a($$0, this, this.m);
      this.m.s.b($$0.a());
      this.m.s.c($$0.c());
      this.D.a($$0.a());
   }

   @Override
   public void a(xu $$0) {
      uq.a($$0, this, this.m);
      this.m.s.a($$0.a(), $$0.c());
      if (this.m.z instanceof eup $$1) {
         $$1.l();
      }
   }

   @Override
   public void a(yd $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.c());
      if ($$1 == null) {
         a.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.w(this.m.t);
         $$1.bz();

         for (int $$3 : $$0.a()) {
            bfj $$4 = this.n.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.m.t && !$$2) {
                  if ($$1 instanceof cah) {
                     this.m.t.M = $$1.dy();
                     this.m.t.a_($$1.dy());
                     this.m.t.n($$1.dy());
                  }

                  sw $$5 = sw.a("mount.onboard", this.m.m.C.k());
                  this.m.l.a($$5, false);
                  this.m.aU().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(xx $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 instanceof bgb) {
         ((bgb)$$1).r($$0.c());
      }
   }

   private static cfz a(byo $$0) {
      for (bdw $$1 : bdw.values()) {
         cfz $$2 = $$0.b($$1);
         if ($$2.a(cgc.uz)) {
            return $$2;
         }
      }

      return new cfz(cgc.uz);
   }

   @Override
   public void a(vu $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = $$0.a(this.n);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.m.ah().a((fxy)(new fxq((bvy)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.m.g.a($$1, iv.ae, 30);
               this.n.a($$1.dn(), $$1.dp(), $$1.dt(), amh.xG, $$1.cY(), 1.0F, 1.0F, false);
               if ($$1 == this.m.t) {
                  this.m.j.a(a((byo)this.m.t));
               }
               break;
            case 63:
               this.m.ah().a((fxy)(new fxu((btx)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(vq $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.n));
      }
   }

   @Override
   public void a(yb $$0) {
      uq.a($$0, this, this.m);
      this.m.t.c($$0.a());
      this.m.t.fX().a($$0.c());
      this.m.t.fX().b($$0.d());
   }

   @Override
   public void a(ya $$0) {
      uq.a($$0, this, this.m);
      this.m.t.a($$0.a(), $$0.c(), $$0.d());
   }

   @Override
   public void a(xf $$0) {
      uq.a($$0, this, this.m);
      acp<cmm> $$1 = $$0.c();
      he<dfk> $$2 = this.B.a().d(jc.au).f($$0.a());
      fiy $$3 = this.m.t;
      int $$4 = $$3.af();
      if ($$1 != $$3.dI().ac()) {
         efg $$5 = this.n.I();
         Map<String, dyo> $$6 = this.n.l();
         boolean $$7 = $$0.g();
         boolean $$8 = $$0.h();
         few.a $$9 = new few.a(this.o.s(), this.o.n(), $$8);
         this.o = $$9;
         this.n = new few(this, $$9, $$1, $$2, this.u, this.v, this.m::aG, this.m.f, $$7, $$0.d());
         this.n.a($$5);
         this.n.a($$6);
         this.m.a(this.n);
         this.m.a(new eup());
      }

      String $$10 = $$3.u();
      this.m.u = null;
      if ($$3.fP()) {
         $$3.q();
      }

      fiy $$11;
      if ($$0.a((byte)2)) {
         $$11 = this.m.r.a(this.n, $$3.v(), $$3.x(), $$3.bP(), $$3.bV());
      } else {
         $$11 = this.m.r.a(this.n, $$3.v(), $$3.x());
      }

      $$11.e($$4);
      this.m.t = $$11;
      if ($$1 != $$3.dI().ac()) {
         this.m.r().b();
      }

      this.m.u = $$11;
      if ($$0.a((byte)2)) {
         List<acb.b<?>> $$13 = $$3.aj().c();
         if ($$13 != null) {
            $$11.aj().a($$13);
         }
      }

      if ($$0.a((byte)1)) {
         $$11.eM().a($$3.eM());
      }

      $$11.E();
      $$11.d($$10);
      this.n.a($$4, (fiv)$$11);
      $$11.a_(-180.0F);
      $$11.cm = new fix(this.m.m);
      this.m.r.a($$11);
      $$11.u($$3.gd());
      $$11.b($$3.y());
      $$11.a($$0.i());
      $$11.f($$0.j());
      $$11.ct = $$3.ct;
      $$11.cu = $$3.cu;
      if (this.m.z instanceof etq || this.m.z instanceof etq.a) {
         this.m.a(null);
      }

      this.m.r.a($$0.e(), $$0.f());
   }

   @Override
   public void a(vv $$0) {
      uq.a($$0, this, this.m);
      cme $$1 = new cme(this.m.s, null, $$0.e(), $$0.f(), $$0.g(), $$0.h(), $$0.i());
      $$1.a(true);
      this.m.t.f(this.m.t.dl().b((double)$$0.a(), (double)$$0.c(), (double)$$0.d()));
   }

   @Override
   public void a(vy $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.d());
      if ($$1 instanceof btk) {
         fiy $$2 = this.m.t;
         btk $$3 = (btk)$$1;
         bee $$4 = new bee($$0.c());
         ccd $$5 = new ccd($$0.a(), $$2.fN(), $$4, $$3);
         $$2.bR = $$5;
         this.m.a(new ewn($$5, $$2.fN(), $$3));
      }
   }

   @Override
   public void a(wo $$0) {
      uq.a($$0, this, this.m);
      eue.a($$0.c(), this.m, $$0.a(), $$0.d());
   }

   @Override
   public void a(vm $$0) {
      uq.a($$0, this, this.m);
      byo $$1 = this.m.t;
      cfz $$2 = $$0.d();
      int $$3 = $$0.c();
      this.m.aA().a($$2);
      if ($$0.a() == -1) {
         if (!(this.m.z instanceof ewd)) {
            $$1.bR.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fN().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.m.z instanceof ewd $$5) {
            $$4 = !$$5.D();
         }

         if ($$0.a() == 0 && cce.f($$3)) {
            if (!$$2.b()) {
               cfz $$6 = $$1.bQ.b($$3).e();
               if ($$6.b() || $$6.L() < $$2.L()) {
                  $$2.e(5);
               }
            }

            $$1.bQ.a($$3, $$0.e(), $$2);
         } else if ($$0.a() == $$1.bR.j && ($$0.a() != 0 || !$$4)) {
            $$1.bR.a($$3, $$0.e(), $$2);
         }
      }
   }

   @Override
   public void a(vk $$0) {
      uq.a($$0, this, this.m);
      byo $$1 = this.m.t;
      if ($$0.a() == 0) {
         $$1.bQ.a($$0.e(), $$0.c(), $$0.d());
      } else if ($$0.a() == $$1.bR.j) {
         $$1.bR.a($$0.e(), $$0.c(), $$0.d());
      }
   }

   @Override
   public void a(wp $$0) {
      uq.a($$0, this, this.m);
      gu $$1 = $$0.a();
      if (this.n.c_($$1) instanceof dav $$2) {
         this.m.t.a($$2, $$0.c());
      } else {
         dcb $$3 = this.n.a_($$1);
         dav $$4 = new dav($$1, $$3);
         $$4.a(this.n);
         this.m.t.a($$4, $$0.c());
      }
   }

   @Override
   public void a(uz $$0) {
      uq.a($$0, this, this.m);
      gu $$1 = $$0.a();
      this.m.s.a($$1, $$0.c()).ifPresent($$1x -> {
         qr $$2 = $$0.d();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof czx && this.m.z instanceof evz) {
            ((evz)this.m.z).D();
         }
      });
   }

   @Override
   public void a(vl $$0) {
      uq.a($$0, this, this.m);
      byo $$1 = this.m.t;
      if ($$1.bR != null && $$1.bR.j == $$0.a()) {
         $$1.bR.a($$0.c(), $$0.d());
      }
   }

   @Override
   public void a(xz $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         $$0.c().forEach($$1x -> $$1.a((bfo)$$1x.getFirst(), (cfz)$$1x.getSecond()));
      }
   }

   @Override
   public void a(vj $$0) {
      uq.a($$0, this, this.m);
      this.m.t.p();
   }

   @Override
   public void a(va $$0) {
      uq.a($$0, this, this.m);
      this.m.s.a($$0.a(), $$0.e(), $$0.c(), $$0.d());
   }

   @Override
   public void a(uy $$0) {
      uq.a($$0, this, this.m);
      this.m.s.a($$0.a(), $$0.c(), $$0.d());
   }

   @Override
   public void a(vx $$0) {
      uq.a($$0, this, this.m);
      byo $$1 = this.m.t;
      vx.a $$2 = $$0.a();
      float $$3 = $$0.c();
      int $$4 = apa.d($$3 + 0.5F);
      if ($$2 == vx.a) {
         $$1.a(sw.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == vx.b) {
         this.n.k().b(true);
         this.n.e(0.0F);
      } else if ($$2 == vx.c) {
         this.n.k().b(false);
         this.n.e(1.0F);
      } else if ($$2 == vx.d) {
         this.m.r.a(cmj.a($$4));
      } else if ($$2 == vx.e) {
         if ($$4 == 0) {
            this.m.t.cl.a(new zk(zk.a.a));
            this.m.a(new eup());
         } else if ($$4 == 1) {
            this.m.a(new euy(true, () -> {
               this.m.t.cl.a(new zk(zk.a.a));
               this.m.a(null);
            }));
         }
      } else if ($$2 == vx.f) {
         enr $$5 = this.m.m;
         if ($$3 == 0.0F) {
            this.m.a(new etr());
         } else if ($$3 == 101.0F) {
            this.m.l.d().a(sw.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.m.l.d().a(sw.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.m.l.d().a(sw.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.m.l.d().a(sw.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == vx.g) {
         this.n.a($$1, $$1.dn(), $$1.dr(), $$1.dt(), amh.aq, ami.h, 0.18F, 0.45F);
      } else if ($$2 == vx.h) {
         this.n.e($$3);
      } else if ($$2 == vx.i) {
         this.n.c($$3);
      } else if ($$2 == vx.j) {
         this.n.a($$1, $$1.dn(), $$1.dp(), $$1.dt(), amh.ti, ami.g, 1.0F, 1.0F);
      } else if ($$2 == vx.k) {
         this.n.a(iv.r, $$1.dn(), $$1.dp(), $$1.dt(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.n.a($$1, $$1.dn(), $$1.dp(), $$1.dt(), amh.gJ, ami.f, 1.0F, 1.0F);
         }
      } else if ($$2 == vx.l) {
         this.m.t.b($$3 == 0.0F);
      }
   }

   @Override
   public void a(wj $$0) {
      uq.a($$0, this, this.m);
      eoy $$1 = this.m.j.j();
      int $$2 = $$0.a();
      String $$3 = cgg.a($$2);
      dyo $$4 = this.m.s.a($$3);
      if ($$4 == null) {
         $$4 = dyo.a($$0.c(), $$0.d(), this.m.s.ac());
         this.m.s.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(we $$0) {
      uq.a($$0, this, this.m);
      if ($$0.a()) {
         this.m.s.b($$0.c(), $$0.e(), $$0.d());
      } else {
         this.m.s.c($$0.c(), $$0.e(), $$0.d());
      }
   }

   @Override
   public void a(yt $$0) {
      uq.a($$0, this, this.m);
      this.r.a($$0);
   }

   @Override
   public void a(xi $$0) {
      uq.a($$0, this, this.m);
      acq $$1 = $$0.a();
      if ($$1 == null) {
         this.r.a(null, false);
      } else {
         ae $$2 = this.r.a().a($$1);
         this.r.a($$2, false);
      }
   }

   @Override
   public void a(vi $$0) {
      uq.a($$0, this, this.m);
      this.x = new CommandDispatcher($$0.a(dm.a((hg.b)this.B.a(), this.C)));
   }

   @Override
   public void a(yn $$0) {
      uq.a($$0, this, this.m);
      this.m.ah().a($$0.a(), $$0.c());
   }

   @Override
   public void a(vh $$0) {
      uq.a($$0, this, this.m);
      this.s.a($$0.a(), $$0.c());
   }

   @Override
   public void a(yx $$0) {
      uq.a($$0, this, this.m);
      this.y.a($$0.a());
      enb $$1 = this.m.t.x();
      $$1.a(this.y.b(), this.m.s.B_());
      this.m.a(fyk.c, $$1.b());
   }

   @Override
   public void a(wz $$0) {
      uq.a($$0, this, this.m);
      eei $$1 = $$0.a(this.n);
      if ($$1 != null) {
         this.m.t.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(yq $$0) {
      uq.a($$0, this, this.m);
      if (!this.t.a($$0.a(), $$0.c())) {
         a.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(uw $$0) {
      uq.a($$0, this, this.m);

      for (Entry<amo<?>, Integer> $$1 : $$0.a().entrySet()) {
         amo<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.m.t.v().a(this.m.t, $$2, $$3);
      }

      if (this.m.z instanceof eva) {
         ((eva)this.m.z).C();
      }
   }

   @Override
   public void a(xb $$0) {
      uq.a($$0, this, this.m);
      enb $$1 = this.m.t.x();
      $$1.a($$0.d());
      xb.a $$2 = $$0.e();
      switch ($$2) {
         case c:
            for (acq $$3 : $$0.a()) {
               this.y.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (acq $$4 : $$0.a()) {
               this.y.a($$4).ifPresent($$1::a);
            }

            for (acq $$5 : $$0.c()) {
               this.y.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (acq $$6 : $$0.a()) {
               this.y.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.i()) {
                     ere.a(this.m.az(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.m.z instanceof eyi) {
         ((eyi)this.m.z).D();
      }
   }

   @Override
   public void a(yw $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 instanceof bfz) {
         bey $$2 = $$0.c();
         if ($$2 != null) {
            bfa $$3 = new bfa($$2, $$0.e(), $$0.d(), $$0.g(), $$0.f(), $$0.h(), null, Optional.ofNullable($$0.i()));
            ((bfz)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(yy $$0) {
      uq.a($$0, this, this.m);
      $$0.a().forEach(this::a);
      if (!this.h.d()) {
         cpo.a();
      }

      ceg.e().n();
   }

   @Override
   public void a(yv $$0) {
      uq.a($$0, this, this.m);
      this.C = cay.c.a($$0.a());
   }

   private <T> void a(acp<? extends hr<? extends T>> $$0, ano.a $$1) {
      if (!$$1.a()) {
         hr<T> $$2 = this.B.a().c($$0).orElseThrow(() -> new IllegalStateException("Unknown registry " + $$0));
         Map<anl<T>, List<he<T>>> $$4 = new HashMap<>();
         ano.a($$0, $$2, $$1, $$4::put);
         $$2.a($$4);
      }
   }

   @Override
   public void a(wu $$0) {
   }

   @Override
   public void a(wv $$0) {
   }

   @Override
   public void a(ww $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 == this.m.t) {
         if (this.m.t.y()) {
            this.m.a(new etq($$0.c(), this.n.k().n()));
         } else {
            this.m.t.fL();
         }
      }
   }

   @Override
   public void a(ve $$0) {
      uq.a($$0, this, this.m);
      this.o.a($$0.c());
      this.o.a($$0.a());
   }

   @Override
   public void a(xq $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = $$0.a(this.n);
      if ($$1 != null) {
         this.m.a($$1);
      }
   }

   @Override
   public void a(wa $$0) {
      uq.a($$0, this, this.m);
      dds $$1 = this.n.w_();
      $$1.c($$0.a(), $$0.c());
      long $$2 = $$0.f();
      if ($$2 > 0L) {
         $$1.a($$0.e(), $$0.d(), $$2);
      } else {
         $$1.a($$0.d());
      }

      $$1.a($$0.g());
      $$1.c($$0.i());
      $$1.b($$0.h());
   }

   @Override
   public void a(xl $$0) {
      uq.a($$0, this, this.m);
      this.n.w_().c($$0.c(), $$0.a());
   }

   @Override
   public void a(xm $$0) {
      uq.a($$0, this, this.m);
      this.n.w_().a($$0.a(), $$0.c(), $$0.d());
   }

   @Override
   public void a(xn $$0) {
      uq.a($$0, this, this.m);
      this.n.w_().a($$0.a());
   }

   @Override
   public void a(xp $$0) {
      uq.a($$0, this, this.m);
      this.n.w_().c($$0.a());
   }

   @Override
   public void a(xo $$0) {
      uq.a($$0, this, this.m);
      this.n.w_().b($$0.a());
   }

   @Override
   public void a(vg $$0) {
      uq.a($$0, this, this.m);
      this.m.l.c();
      if ($$0.a()) {
         this.m.l.a();
      }
   }

   @Override
   public void a(xj $$0) {
      uq.a($$0, this, this.m);
      if (this.j != null) {
         this.j.d = $$0.a();
         $$0.c().ifPresent(this.j::a);
         this.j.a($$0.d());
         ffe.b(this.j);
         if (!$$0.d()) {
            erf $$1 = erf.a(this.m, erf.a.h, c, d);
            this.m.az().a($$1);
         }
      }
   }

   @Override
   public void a(vo $$0) {
      uq.a($$0, this, this.m);
      this.s.a($$0.a(), $$0.c());
   }

   @Override
   public void a(xk $$0) {
      uq.a($$0, this, this.m);
      this.m.l.a($$0.a(), false);
   }

   @Override
   public void a(yj $$0) {
      uq.a($$0, this, this.m);
      this.m.l.c($$0.a());
   }

   @Override
   public void a(yh $$0) {
      uq.a($$0, this, this.m);
      this.m.l.b($$0.a());
   }

   @Override
   public void a(yk $$0) {
      uq.a($$0, this, this.m);
      this.m.l.a($$0.a(), $$0.c(), $$0.d());
   }

   @Override
   public void a(yp $$0) {
      uq.a($$0, this, this.m);
      this.m.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.m.l.h().a($$0.c().getString().isEmpty() ? null : $$0.c());
   }

   @Override
   public void a(xd $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = $$0.a(this.n);
      if ($$1 instanceof bfz) {
         ((bfz)$$1).c($$0.a());
      }
   }

   @Override
   public void a(wx $$0) {
      uq.a($$0, this, this.m);

      for (UUID $$1 : $$0.a()) {
         this.m.aK().f($$1);
         ffb $$2 = this.p.remove($$1);
         if ($$2 != null) {
            this.q.remove($$2);
         }
      }
   }

   @Override
   public void a(wy $$0) {
      uq.a($$0, this, this.m);

      for (wy.b $$1 : $$0.d()) {
         ffb $$2 = new ffb($$1.b(), this.u());
         if (this.p.putIfAbsent($$1.a(), $$2) == null) {
            this.m.aK().a($$2);
         }
      }

      for (wy.b $$3 : $$0.c()) {
         ffb $$4 = this.p.get($$3.a());
         if ($$4 == null) {
            a.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (wy.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(wy.a $$0, wy.b $$1, ffb $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.m.t != null && this.m.t.ct().equals($$1.a())) {
               this.m.t.a($$1.e());
            }

            $$2.a($$1.e());
            break;
         case d:
            if ($$1.c()) {
               this.q.add($$2);
            } else {
               this.q.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
      }
   }

   private void a(wy.b $$0, ffb $$1) {
      GameProfile $$2 = $$1.a();
      apj $$3 = this.m.aS();
      if ($$3 == null) {
         a.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.u());
      } else {
         tm.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               tm $$5 = $$4.a($$2, $$3, byr.b);
               $$1.a($$5);
            } catch (byr.b var7) {
               a.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.u());
            }
         } else {
            $$1.a(this.u());
         }
      }
   }

   private boolean u() {
      return this.j != null && this.j.e();
   }

   @Override
   public void a(wb $$0) {
      this.a(new zv($$0.a()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   private void a(uo<zb> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.a($$0);
      } else {
         this.i.add(new fex.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private void v() {
      Iterator<fex.a> $$0 = this.i.iterator();

      while ($$0.hasNext()) {
         fex.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.a($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   @Override
   public void a(ws $$0) {
      uq.a($$0, this, this.m);
      byo $$1 = this.m.t;
      $$1.fO().b = $$0.c();
      $$1.fO().d = $$0.e();
      $$1.fO().a = $$0.a();
      $$1.fO().c = $$0.d();
      $$1.fO().a($$0.f());
      $$1.fO().b($$0.g());
   }

   @Override
   public void a(ym $$0) {
      uq.a($$0, this, this.m);
      this.m.s.a(this.m.t, $$0.d(), $$0.e(), $$0.f(), $$0.a(), $$0.c(), $$0.g(), $$0.h(), $$0.i());
   }

   @Override
   public void a(yl $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.d());
      if ($$1 != null) {
         this.m.s.a(this.m.t, $$1, $$0.a(), $$0.c(), $$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(xe $$0) {
      URL $$1 = e($$0.a());
      if ($$1 == null) {
         this.a(aak.a.c);
      } else {
         String $$2 = $$0.c();
         boolean $$3 = $$0.d();
         if (this.j != null && this.j.b() == ffd.a.a) {
            this.a(aak.a.d);
            this.a(this.m.ab().a($$1, $$2, true));
         } else if (this.j != null && this.j.b() != ffd.a.c && (!$$3 || this.j.b() != ffd.a.b)) {
            this.a(aak.a.b);
            if ($$3) {
               this.h.a(sw.c("multiplayer.requiredTexturePrompt.disconnect"));
            }
         } else {
            this.m
               .execute(
                  () -> this.m
                        .a(
                           new etk(
                              $$3xx -> {
                                 this.m.a(null);
                                 if ($$3xx) {
                                    if (this.j != null) {
                                       this.j.a(ffd.a.a);
                                    }

                                    this.a(aak.a.d);
                                    this.a(this.m.ab().a($$1, $$2, true));
                                 } else {
                                    this.a(aak.a.b);
                                    if ($$3) {
                                       this.h.a(sw.c("multiplayer.requiredTexturePrompt.disconnect"));
                                    } else if (this.j != null) {
                                       this.j.a(ffd.a.b);
                                    }
                                 }

                                 if (this.j != null) {
                                    ffe.b(this.j);
                                 }
                              },
                              $$3 ? sw.c("multiplayer.requiredTexturePrompt.line1") : sw.c("multiplayer.texturePrompt.line1"),
                              a($$3 ? sw.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : sw.c("multiplayer.texturePrompt.line2"), $$0.e()),
                              $$3 ? sv.i : sv.f,
                              (sw)($$3 ? sw.c("menu.disconnect") : sv.g)
                           )
                        )
               );
         }
      }
   }

   private static sw a(sw $$0, @Nullable sw $$1) {
      return (sw)($$1 == null ? $$0 : sw.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL e(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   private void a(CompletableFuture<?> $$0) {
      $$0.thenRun(() -> this.a(aak.a.a)).exceptionally($$0x -> {
         this.a(aak.a.c);
         return null;
      });
   }

   private void a(aak.a $$0) {
      this.h.a(new aak($$0));
   }

   @Override
   public void a(vc $$0) {
      uq.a($$0, this, this.m);
      this.m.l.j().a($$0);
   }

   @Override
   public void a(vn $$0) {
      uq.a($$0, this, this.m);
      if ($$0.c() == 0) {
         this.m.t.gi().b($$0.a());
      } else {
         this.m.t.gi().a($$0.a(), $$0.c());
      }
   }

   @Override
   public void a(wm $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.m.t.cT();
      if ($$1 != this.m.t && $$1.cU()) {
         $$1.a($$0.a(), $$0.c(), $$0.d(), $$0.e(), $$0.f());
         this.h.a(new zy($$1));
      }
   }

   @Override
   public void a(wn $$0) {
      uq.a($$0, this, this.m);
      cfz $$1 = this.m.t.b($$0.a());
      if ($$1.a(cgc.th)) {
         this.m.a(new evw(new evw.c($$1)));
      }
   }

   @Override
   public void a(vp $$0) {
      uq.a($$0, this, this.m);
      acq $$1 = $$0.a();
      sf $$2 = null;

      try {
         $$2 = $$0.c();
         if (vp.a.equals($$1)) {
            String $$3 = $$2.s();
            this.m.t.d($$3);
            this.D.a($$3);
         } else if (vp.b.equals($$1)) {
            int $$4 = $$2.readInt();
            float $$5 = $$2.readFloat();
            dxt $$6 = dxt.b($$2);
            this.m.k.a.a($$4, $$6, $$5);
         } else if (vp.c.equals($$1)) {
            long $$7 = $$2.n();
            gu $$8 = $$2.f();
            ((fnk)this.m.k.g).a($$7, $$8);
         } else if (vp.d.equals($$1)) {
            dfk $$9 = this.B.a().d(jc.au).a($$2.t());
            drs $$10 = new drs($$2.readInt(), $$2.readInt(), $$2.readInt(), $$2.readInt(), $$2.readInt(), $$2.readInt());
            int $$11 = $$2.readInt();
            List<drs> $$12 = Lists.newArrayList();
            List<Boolean> $$13 = Lists.newArrayList();

            for (int $$14 = 0; $$14 < $$11; $$14++) {
               $$12.add(new drs($$2.readInt(), $$2.readInt(), $$2.readInt(), $$2.readInt(), $$2.readInt(), $$2.readInt()));
               $$13.add($$2.readBoolean());
            }

            this.m.k.h.a($$10, $$12, $$13, $$9);
         } else if (vp.e.equals($$1)) {
            ((fns)this.m.k.j).a($$2.f(), $$2.readFloat(), $$2.readFloat(), $$2.readFloat(), $$2.readFloat(), $$2.readFloat());
         } else if (vp.i.equals($$1)) {
            int $$15 = $$2.readInt();

            for (int $$16 = 0; $$16 < $$15; $$16++) {
               this.m.k.n.a($$2.h());
            }

            int $$17 = $$2.readInt();

            for (int $$18 = 0; $$18 < $$17; $$18++) {
               this.m.k.n.b($$2.h());
            }
         } else if (vp.g.equals($$1)) {
            gu $$19 = $$2.f();
            String $$20 = $$2.s();
            int $$21 = $$2.readInt();
            fmz.b $$22 = new fmz.b($$19, $$20, $$21);
            this.m.k.m.a($$22);
         } else if (vp.h.equals($$1)) {
            gu $$23 = $$2.f();
            this.m.k.m.a($$23);
         } else if (vp.f.equals($$1)) {
            gu $$24 = $$2.f();
            int $$25 = $$2.readInt();
            this.m.k.m.a($$24, $$25);
         } else if (vp.j.equals($$1)) {
            gu $$26 = $$2.f();
            int $$27 = $$2.readInt();
            int $$28 = $$2.readInt();
            List<fng.a> $$29 = Lists.newArrayList();

            for (int $$30 = 0; $$30 < $$28; $$30++) {
               int $$31 = $$2.readInt();
               boolean $$32 = $$2.readBoolean();
               String $$33 = $$2.e(255);
               $$29.add(new fng.a($$26, $$31, $$33, $$32));
            }

            this.m.k.q.a($$27, $$29);
         } else if (vp.p.equals($$1)) {
            int $$34 = $$2.readInt();
            Collection<gu> $$35 = Lists.newArrayList();

            for (int $$36 = 0; $$36 < $$34; $$36++) {
               $$35.add($$2.f());
            }

            this.m.k.p.a($$35);
         } else if (vp.k.equals($$1)) {
            double $$37 = $$2.readDouble();
            double $$38 = $$2.readDouble();
            double $$39 = $$2.readDouble();
            ho $$40 = new hp($$37, $$38, $$39);
            UUID $$41 = $$2.o();
            int $$42 = $$2.readInt();
            String $$43 = $$2.s();
            String $$44 = $$2.s();
            int $$45 = $$2.readInt();
            float $$46 = $$2.readFloat();
            float $$47 = $$2.readFloat();
            String $$48 = $$2.s();
            dxt $$49 = $$2.c(dxt::b);
            boolean $$50 = $$2.readBoolean();
            int $$51 = $$2.readInt();
            fmz.a $$52 = new fmz.a($$41, $$42, $$43, $$44, $$45, $$46, $$47, $$40, $$48, $$49, $$50, $$51);
            int $$53 = $$2.m();

            for (int $$54 = 0; $$54 < $$53; $$54++) {
               String $$55 = $$2.s();
               $$52.m.add($$55);
            }

            int $$56 = $$2.m();

            for (int $$57 = 0; $$57 < $$56; $$57++) {
               String $$58 = $$2.s();
               $$52.n.add($$58);
            }

            int $$59 = $$2.m();

            for (int $$60 = 0; $$60 < $$59; $$60++) {
               String $$61 = $$2.s();
               $$52.o.add($$61);
            }

            int $$62 = $$2.m();

            for (int $$63 = 0; $$63 < $$62; $$63++) {
               gu $$64 = $$2.f();
               $$52.q.add($$64);
            }

            int $$65 = $$2.m();

            for (int $$66 = 0; $$66 < $$65; $$66++) {
               gu $$67 = $$2.f();
               $$52.r.add($$67);
            }

            int $$68 = $$2.m();

            for (int $$69 = 0; $$69 < $$68; $$69++) {
               String $$70 = $$2.s();
               $$52.p.add($$70);
            }

            this.m.k.m.a($$52);
         } else if (vp.l.equals($$1)) {
            double $$71 = $$2.readDouble();
            double $$72 = $$2.readDouble();
            double $$73 = $$2.readDouble();
            ho $$74 = new hp($$71, $$72, $$73);
            UUID $$75 = $$2.o();
            int $$76 = $$2.readInt();
            gu $$77 = $$2.c(sf::f);
            gu $$78 = $$2.c(sf::f);
            int $$79 = $$2.readInt();
            dxt $$80 = $$2.c(dxt::b);
            fmy.a $$81 = new fmy.a($$75, $$76, $$74, $$80, $$77, $$78, $$79);
            int $$82 = $$2.m();

            for (int $$83 = 0; $$83 < $$82; $$83++) {
               String $$84 = $$2.s();
               $$81.h.add($$84);
            }

            int $$85 = $$2.m();

            for (int $$86 = 0; $$86 < $$85; $$86++) {
               gu $$87 = $$2.f();
               $$81.i.add($$87);
            }

            this.m.k.o.a($$81);
         } else if (vp.m.equals($$1)) {
            gu $$88 = $$2.f();
            String $$89 = $$2.s();
            int $$90 = $$2.readInt();
            int $$91 = $$2.readInt();
            boolean $$92 = $$2.readBoolean();
            fmy.b $$93 = new fmy.b($$88, $$89, $$90, $$91, $$92, this.n.V());
            this.m.k.o.a($$93);
         } else if (vp.o.equals($$1)) {
            this.m.k.r.a();
         } else if (vp.n.equals($$1)) {
            gu $$94 = $$2.f();
            int $$95 = $$2.readInt();
            String $$96 = $$2.s();
            int $$97 = $$2.readInt();
            this.m.k.r.a($$94, $$95, $$96, $$97);
         } else if (vp.q.equals($$1)) {
            dgl $$98 = jb.b.a(new acq($$2.s()));
            eei $$99 = new eei($$2.readDouble(), $$2.readDouble(), $$2.readDouble());
            this.m.k.s.a($$98, $$99);
         } else if (vp.r.equals($$1)) {
            acq $$100 = $$2.t();
            dgp $$101 = jb.w.b($$100).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$100)).b($$2);
            int $$102 = $$2.m();
            this.m.k.s.a($$101, $$102);
         } else {
            a.warn("Unknown custom packed identifier: {}", $$1);
         }
      } finally {
         if ($$2 != null) {
            $$2.release();
         }
      }
   }

   @Override
   public void a(yc $$0) {
      uq.a($$0, this, this.m);
      efg $$1 = this.n.I();
      String $$2 = $$0.a();
      if ($$0.d() == 0) {
         $$1.a($$2, efj.a, $$0.c(), $$0.e());
      } else if ($$1.b($$2)) {
         efd $$3 = $$1.d($$2);
         if ($$0.d() == 1) {
            $$1.j($$3);
         } else if ($$0.d() == 2) {
            $$3.a($$0.e());
            $$3.a($$0.c());
         }
      }
   }

   @Override
   public void a(yf $$0) {
      uq.a($$0, this, this.m);
      efg $$1 = this.n.I();
      String $$2 = $$0.c();
      switch ($$0.e()) {
         case a:
            efd $$3 = $$1.c($$2);
            eff $$4 = $$1.c($$0.a(), $$3);
            $$4.b($$0.d());
            break;
         case b:
            $$1.d($$0.a(), $$1.d($$2));
      }
   }

   @Override
   public void a(xv $$0) {
      uq.a($$0, this, this.m);
      efg $$1 = this.n.I();
      String $$2 = $$0.c();
      efd $$3 = $$2 == null ? null : $$1.c($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(ye $$0) {
      uq.a($$0, this, this.m);
      efg $$1 = this.n.I();
      ye.a $$2 = $$0.c();
      efe $$3;
      if ($$2 == ye.a.a) {
         $$3 = $$1.g($$0.d());
      } else {
         $$3 = $$1.f($$0.d());
         if ($$3 == null) {
            a.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.d(), $$0.c(), $$0.a()});
            return;
         }
      }

      Optional<ye.b> $$5 = $$0.f();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         efi.b $$2x = efi.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         efi.a $$3x = efi.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      ye.a $$6 = $$0.a();
      if ($$6 == ye.a.a) {
         for (String $$7 : $$0.e()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == ye.a.b) {
         for (String $$8 : $$0.e()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == ye.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(wf $$0) {
      uq.a($$0, this, this.m);
      if ($$0.j() == 0) {
         double $$1 = (double)($$0.i() * $$0.f());
         double $$2 = (double)($$0.i() * $$0.g());
         double $$3 = (double)($$0.i() * $$0.h());

         try {
            this.n.a($$0.k(), $$0.a(), $$0.c(), $$0.d(), $$0.e(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            a.warn("Could not spawn particle effect {}", $$0.k());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.j(); $$5++) {
            double $$6 = this.w.k() * (double)$$0.f();
            double $$7 = this.w.k() * (double)$$0.g();
            double $$8 = this.w.k() * (double)$$0.h();
            double $$9 = this.w.k() * (double)$$0.i();
            double $$10 = this.w.k() * (double)$$0.i();
            double $$11 = this.w.k() * (double)$$0.i();

            try {
               this.n.a($$0.k(), $$0.a(), $$0.c() + $$6, $$0.d() + $$7, $$0.e() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               a.warn("Could not spawn particle effect {}", $$0.k());
               return;
            }
         }
      }
   }

   @Override
   public void a(wq $$0) {
      uq.a($$0, this, this.m);
      this.a(new aag($$0.a()));
   }

   @Override
   public void a(yu $$0) {
      uq.a($$0, this, this.m);
      bfj $$1 = this.n.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bfz)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bhd $$2 = ((bfz)$$1).eM();

            for (yu.a $$3 : $$0.c()) {
               bhc $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  a.warn("Entity {} does not have attribute {}", $$1, jb.v.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bhe $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(wr $$0) {
      uq.a($$0, this, this.m);
      cbf $$1 = this.m.t.bR;
      if ($$1.j == $$0.c()) {
         this.y.a($$0.a()).ifPresent($$1x -> {
            if (this.m.z instanceof eyi) {
               eyc $$2 = ((eyi)this.m.z).E();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(wg $$0) {
      uq.a($$0, this, this.m);
      int $$1 = $$0.a();
      int $$2 = $$0.c();
      wh $$3 = $$0.d();
      this.n.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, wh $$2) {
      dwt $$3 = this.n.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cmv.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cmv.b, $$7, $$8, $$9);
      $$3.a(new clt($$0, $$1), true);
   }

   @Override
   public void a(wk $$0) {
      uq.a($$0, this, this.m);
      cbf $$1 = this.m.t.bR;
      if ($$0.a() == $$1.j && $$1 instanceof ccm $$2) {
         $$2.a(new cll($$0.c().a()));
         $$2.f($$0.e());
         $$2.g($$0.d());
         $$2.a($$0.f());
         $$2.b($$0.g());
      }
   }

   @Override
   public void a(xt $$0) {
      uq.a($$0, this, this.m);
      this.u = $$0.a();
      this.m.m.b(this.u);
      this.n.i().a($$0.a());
   }

   @Override
   public void a(yg $$0) {
      uq.a($$0, this, this.m);
      this.v = $$0.a();
      this.n.h(this.v);
   }

   @Override
   public void a(xs $$0) {
      uq.a($$0, this, this.m);
      this.n.i().e($$0.a(), $$0.c());
   }

   @Override
   public void a(ux $$0) {
      uq.a($$0, this, this.m);
      this.n.b($$0.a());
   }

   @Override
   public void a(vd $$0) {
      uq.a($$0, this, this.m);

      for (uo<ur> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   private void a(int $$0, int $$1, dwt $$2, cmv $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, hx.a($$0, $$8, $$1), $$9 ? new ded((byte[])$$6.next().clone()) : new ded());
            this.n.c($$0, $$8, $$1);
         }
      }
   }

   public sd g() {
      return this.h;
   }

   @Override
   public boolean a() {
      return this.h.h();
   }

   public Collection<ffb> h() {
      return this.q;
   }

   public Collection<ffb> i() {
      return this.p.values();
   }

   public Collection<UUID> j() {
      return this.p.keySet();
   }

   @Nullable
   public ffb a(UUID $$0) {
      return this.p.get($$0);
   }

   @Nullable
   public ffb a(String $$0) {
      for (ffb $$1 : this.p.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile k() {
      return this.k;
   }

   public fet l() {
      return this.r;
   }

   public CommandDispatcher<du> m() {
      return this.x;
   }

   public few n() {
      return this.n;
   }

   public ene o() {
      return this.t;
   }

   public UUID p() {
      return this.z;
   }

   public Set<acp<cmm>> q() {
      return this.A;
   }

   public hs r() {
      return this.B.a();
   }

   public void a(tl $$0, boolean $$1) {
      th $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.w();
      }
   }

   private void w() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.a(new zg($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = anz.c.a();
      td.a $$3 = this.G.b();
      th $$4 = this.F.pack(new to($$0, $$1, $$2, $$3.a()));
      this.a(new zi($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = anz.c.a();
      td.a $$3 = this.G.b();
      dw $$4 = dw.a(tn.a(this.f($$0)), $$3x -> {
         to $$4x = new to($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.a(new zh($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (tn.a(this.f($$0)).a().isEmpty()) {
         td.a $$1 = this.G.b();
         this.a(new zh($$0, Instant.now(), 0L, dw.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<du> f(String $$0) {
      return this.x.parse($$0, this.s);
   }

   @Override
   public void c() {
      if (this.h.g()) {
         ffc $$0 = this.m.v();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.m);
         }
      }

      this.v();
      this.D.a();
   }

   public void a(byq $$0) {
      if (this.k.getId().equals(this.m.U().g())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = tg.a($$0);
            this.F = this.E.a(this.k.getId());
            this.a(new zj(this.E.a().b()));
         }
      }
   }

   @Nullable
   public ffd s() {
      return this.j;
   }

   public caw t() {
      return this.C;
   }

   public boolean a(caw $$0) {
      return $$0.a(this.t());
   }

   static record a(uo<zb> a, BooleanSupplier b, long c) {
   }
}
