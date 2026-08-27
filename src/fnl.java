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

public class fnl extends fnh implements us, yx {
   private static final Logger g = LogUtils.getLogger();
   private static final vd h = vd.c("multiplayer.unsecureserver.toast.title");
   private static final vd i = vd.c("multiplayer.unsecureserver.toast");
   private static final vd j = vd.c("multiplayer.disconnect.invalid_packet");
   private static final vd k = vd.c("multiplayer.disconnect.chat_validation_failed");
   private static final vd l = vd.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private fnk o;
   private fnk.a p;
   private final Map<UUID, fnt> q = Maps.newHashMap();
   private final Set<fnt> r = new ReferenceOpenHashSet();
   private final fnf s;
   private final fnn t;
   private final eur u = new eur(this);
   private int v = 3;
   private int w = 3;
   private final aup x = aup.b();
   private CommandDispatcher<dx> y = new CommandDispatcher();
   private final cpy z = new cpy();
   private final UUID A = UUID.randomUUID();
   private Set<ahc<cti>> B;
   private final iu.b C;
   private final chl D;
   @Nullable
   private vo E;
   private vx.c F = vx.c.a;
   private vl G = new vl(20);
   private vq H = vq.a();
   private final fne I = new fne();
   private final fns J;
   @Nullable
   private fnq K;
   private boolean L = false;
   private volatile boolean M;

   public fnl(eva $$0, ue $$1, fno $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fnf($$0, this.e);
      this.t = new fnn(this, $$0);
      this.J = new fns(this, $$0.aM().k());
   }

   public fnn i() {
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

   public cpy l() {
      return this.z;
   }

   @Override
   public void a(aam $$0) {
      xf.a($$0, this, this.a);
      this.z();
      this.a.q = new fnr(this.a, this);
      add $$1 = $$0.l();
      List<ahc<cti>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      ahc<cti> $$3 = $$1.b();
      ih<dmj> $$4 = this.C.d(ke.ay).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fnk.a $$7 = new fnk.a(bjs.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new fnk(this, $$7, $$3, $$4, this.v, this.w, this.a::aF, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new arx(), new eun());
         this.a.s.r(-180.0F);
         if (this.a.S() != null) {
            this.a.S().a(this.a.s.cw());
         }
      }

      this.a.k.a();
      this.a.s.z();
      this.a.s.e($$0.a());
      this.o.c(this.a.s);
      this.a.s.co = new fsa(this.a.m);
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
      this.G = new vl(20);
      this.H = vq.a();
      if (this.b.j()) {
         this.a.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aY().a(this.a);
   }

   @Override
   public void a(yy $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.o.c($$1);
         this.a($$1);
      } else {
         g.warn("Skipping Entity with id {}", $$0.e());
      }
   }

   @Nullable
   private blp b(yy $$0) {
      blt<?> $$1 = $$0.e();
      if ($$1 == blt.bv) {
         fnt $$2 = this.a($$0.d());
         if ($$2 == null) {
            g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
            return null;
         } else {
            return new fsc(this.o, $$2.a());
         }
      } else {
         return $$1.a((cti)this.o);
      }
   }

   private void a(blp $$0) {
      if ($$0 instanceof cgt $$1) {
         this.a.ah().a((ghn)(new ghg($$1)));
      } else if ($$0 instanceof bxt $$2) {
         boolean $$3 = $$2.aa_();
         gha $$4;
         if ($$3) {
            $$4 = new ggy($$2);
         } else {
            $$4 = new ggz($$2);
         }

         this.a.ah().a((gho)$$4);
      }
   }

   @Override
   public void a(yz $$0) {
      xf.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      blp $$4 = new blv(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.c($$4);
   }

   @Override
   public void a(acb $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(abz $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.an().a($$0.d());
      }
   }

   @Override
   public void a(acw $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
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
   public void a(acx $$0) {
      xf.a($$0, this, this.a);
      if (this.a.r != null) {
         bkf $$1 = this.a.r.s();
         $$1.a($$0.a());
         $$1.a($$0.d());
      }
   }

   @Override
   public void a(acy $$0) {
      xf.a($$0, this, this.a);
      if (this.a.r != null) {
         bkf $$1 = this.a.r.s();
         $$1.c($$0.a());
      }
   }

   @Override
   public void a(abu $$0) {
      xf.a($$0, this, this.a);
      if (cfa.d($$0.a())) {
         this.a.s.fS().l = $$0.a();
      }
   }

   @Override
   public void a(aap $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cX()) {
            if ($$0.i()) {
               afd $$2 = $$1.ah();
               elm $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
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
   public void a(abj $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(abf $$0) {
      xf.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, blp.c.b));
   }

   @Override
   public void a(abd $$0) {
      xf.a($$0, this, this.a);
      cfb $$1 = this.a.s;
      elm $$2 = $$1.dp();
      boolean $$3 = $$0.i().contains(bmt.a);
      boolean $$4 = $$0.i().contains(bmt.b);
      boolean $$5 = $$0.i().contains(bmt.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dr() + $$0.a();
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
         $$11 = $$1.dt() + $$0.d();
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
         $$15 = $$1.dx() + $$0.e();
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
      if ($$0.i().contains(bmt.e)) {
         $$1.s($$1.dE() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bmt.d)) {
         $$1.r($$1.dC() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new adj($$0.h()));
      this.b.a(new aed.b($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE(), false));
   }

   @Override
   public void a(abk $$0) {
      xf.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(aah $$0) {
      xf.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      aal $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dlh $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(zm $$0) {
      xf.a($$0, this, this.a);

      for (zm.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (zm.a $$2 : $$0.a()) {
         this.o.a(new csp($$2.b().e, $$2.b().f));
      }

      for (zm.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.an(); $$6 < this.o.ao(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, aag $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dlh $$0, int $$1, int $$2) {
      edz $$3 = this.o.i().p();
      dli[] $$4 = $$0.d();
      csp $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dli $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(iz.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(aab $$0) {
      xf.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(aab $$0) {
      csp $$1 = $$0.a();
      this.o.a(() -> {
         edz $$1x = this.o.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            iz $$3 = iz.a($$1, $$2);
            $$1x.a(ctr.b, $$3, null);
            $$1x.a(ctr.a, $$3, null);
         }

         for (int $$4 = this.o.an(); $$4 < this.o.ao(); $$4++) {
            $$1x.a(iz.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(zg $$0) {
      xf.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(acq $$0) {
      this.b.a();
      xf.a($$0, this, this.a);
      this.a.c(new ffu(l, this.b));
      this.b.a(new fni(this.a, this.b, new fno(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new adt());
   }

   @Override
   public void a(acv $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      bmf $$2 = (bmf)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof blv) {
            this.o.a($$1.dr(), $$1.dt(), $$1.dx(), arm.id, arn.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dr(), $$1.dt(), $$1.dx(), arm.mO, arn.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fqh(this.a.an(), this.a.aN(), this.o, $$1, $$2));
         if ($$1 instanceof cbo $$3) {
            cmr $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), blp.c.b);
            }
         } else if (!($$1 instanceof blv)) {
            this.o.a($$0.a(), blp.c.b);
         }
      }
   }

   @Override
   public void a(acs $$0) {
      xf.a($$0, this, this.a);
      this.a.aV().a($$0.a(), $$0.d());
   }

   @Override
   public void a(aaw $$0) {
      xf.a($$0, this, this.a);
      Optional<vw> $$1 = $$0.f().a(this.H);
      Optional<uz.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         fnt $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.a.aV().a($$3, $$2.get());
         } else {
            vu $$5 = $$4.b();
            vy $$6;
            if ($$5 != null) {
               $$6 = new vy($$0.d(), $$3, $$5.c());
            } else {
               $$6 = vy.a($$3);
            }

            vt $$8 = new vt($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
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
   public void a(zy $$0) {
      xf.a($$0, this, this.a);
      Optional<uz.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aV().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(zx $$0) {
      xf.a($$0, this, this.a);
      Optional<vp> $$1 = $$0.a().a(this.H);
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
   public void a(za $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bmf $$2 = (bmf)$$1;
            $$2.a(bju.a);
         } else if ($$0.d() == 3) {
            bmf $$3 = (bmf)$$1;
            $$3.a(bju.b);
         } else if ($$0.d() == 2) {
            cfb $$4 = (cfb)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, jx.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, jx.s);
         }
      }
   }

   @Override
   public void a(aae $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(acl $$0) {
      xf.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(abx $$0) {
      xf.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
   }

   @Override
   public void a(acg $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bB();

         for (int $$3 : $$0.a()) {
            blp $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cgv) {
                     this.a.s.N = $$1.dC();
                     this.a.s.r($$1.dC());
                     this.a.s.n($$1.dC());
                  }

                  vd $$5 = vd.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aU().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aca $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 instanceof bmh) {
         ((bmh)$$1).r($$0.d());
      }
   }

   private static cmr a(cfb $$0) {
      for (bju $$1 : bju.values()) {
         cmr $$2 = $$0.b($$1);
         if ($$2.a(cmu.vm)) {
            return $$2;
         }
      }

      return new cmr(cmu.vm);
   }

   @Override
   public void a(zz $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ah().a((ghn)(new ghf((ccf)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, jx.ah, 30);
               this.o.a($$1.dr(), $$1.dt(), $$1.dx(), arm.yC, $$1.db(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cfb)this.a.s));
               }
               break;
            case 63:
               this.a.ah().a((ghn)(new ghj((cae)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(zw $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(ace $$0) {
      xf.a($$0, this, this.a);
      this.a.s.D($$0.a());
      this.a.s.gc().a($$0.d());
      this.a.s.gc().b($$0.e());
   }

   @Override
   public void a(acd $$0) {
      xf.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(abi $$0) {
      xf.a($$0, this, this.a);
      add $$1 = $$0.a();
      ahc<cti> $$2 = $$1.b();
      ih<dmj> $$3 = this.C.d(ke.ay).f($$1.a());
      fsb $$4 = this.a.s;
      if ($$2 != $$4.dM().ae()) {
         emq $$5 = this.o.K();
         Map<String, efu> $$6 = this.o.l();
         boolean $$7 = $$1.f();
         boolean $$8 = $$1.g();
         fnk.a $$9 = new fnk.a(this.p.s(), this.p.n(), $$8);
         this.p = $$9;
         this.o = new fnk(this, $$9, $$2, $$3, this.v, this.w, this.a::aF, this.a.f, $$7, $$1.c());
         this.o.a($$5);
         this.o.a($$6);
         this.a.a(this.o);
      }

      this.a.t = null;
      if ($$4.fU()) {
         $$4.r();
      }

      fsb $$10;
      if ($$0.a((byte)2)) {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m(), $$4.bS(), $$4.bY());
      } else {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m());
      }

      this.a($$10, this.o);
      $$10.e($$4.aj());
      this.a.s = $$10;
      if ($$2 != $$4.dM().ae()) {
         this.a.r().b();
      }

      this.a.t = $$10;
      if ($$0.a((byte)2)) {
         List<agm.b<?>> $$12 = $$4.an().c();
         if ($$12 != null) {
            $$10.an().a($$12);
         }
      }

      if ($$0.a((byte)1)) {
         $$10.eR().a($$4.eR());
      }

      $$10.z();
      this.o.c($$10);
      $$10.r(-180.0F);
      $$10.co = new fsa(this.a.m);
      this.a.q.a($$10);
      $$10.u($$4.gi());
      $$10.b($$4.o());
      $$10.a($$1.h());
      $$10.f($$1.i());
      $$10.cw = $$4.cw;
      $$10.cx = $$4.cx;
      if (this.a.y instanceof fbs || this.a.y instanceof fbs.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(aaa $$0) {
      xf.a($$0, this, this.a);
      cta $$1 = new cta(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n());
      $$1.a(true);
      this.a.s.g(this.a.s.dp().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(aad $$0) {
      xf.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof bzr $$2) {
         fsb $$3 = this.a.s;
         bkd $$4 = new bkd($$0.d());
         ciu $$5 = new ciu($$0.a(), $$3.fS(), $$4, $$2);
         $$3.bS = $$5;
         this.a.a(new fer($$5, $$3.fS(), $$2));
      }
   }

   @Override
   public void a(aas $$0) {
      xf.a($$0, this, this.a);
      fcg.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(zt $$0) {
      xf.a($$0, this, this.a);
      cfb $$1 = this.a.s;
      cmr $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.ay().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof feh)) {
            $$1.bS.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fS().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof feh $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.a() == 0 && civ.f($$3)) {
            if (!$$2.b()) {
               cmr $$6 = $$1.bR.b($$3).g();
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
   public void a(zr $$0) {
      xf.a($$0, this, this.a);
      cfb $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bR.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bS.j) {
         $$1.bS.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(aat $$0) {
      xf.a($$0, this, this.a);
      hx $$1 = $$0.a();
      if (this.o.c_($$1) instanceof dhx $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         dja $$3 = this.o.a_($$1);
         dhx $$4 = new dhx($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(ze $$0) {
      xf.a($$0, this, this.a);
      hx $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         sl $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof dgy && this.a.y instanceof fec) {
            ((fec)this.a.y).E();
         }
      });
   }

   @Override
   public void a(zs $$0) {
      xf.a($$0, this, this.a);
      cfb $$1 = this.a.s;
      if ($$1.bS != null && $$1.bS.j == $$0.a()) {
         $$1.bS.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(acc $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((blu)$$1x.getFirst(), (cmr)$$1x.getSecond()));
      }
   }

   @Override
   public void a(zq $$0) {
      xf.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(zf $$0) {
      xf.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zd $$0) {
      xf.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aac $$0) {
      xf.a($$0, this, this.a);
      cfb $$1 = this.a.s;
      aac.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = aui.d($$3 + 0.5F);
      if ($$2 == aac.a) {
         $$1.a(vd.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == aac.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == aac.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == aac.d) {
         this.a.q.a(ctf.a($$4));
      } else if ($$2 == aac.e) {
         if ($$4 == 0) {
            this.a.s.cn.b(new adr(adr.a.a));
            this.a.a(new fcr(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fdb(true, () -> {
               this.a.s.cn.b(new adr(adr.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == aac.f) {
         eve $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fbt());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(vd.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(vd.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(vd.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(vd.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == aac.g) {
         this.o.a($$1, $$1.dr(), $$1.dv(), $$1.dx(), arm.aq, arn.h, 0.18F, 0.45F);
      } else if ($$2 == aac.h) {
         this.o.e($$3);
      } else if ($$2 == aac.i) {
         this.o.c($$3);
      } else if ($$2 == aac.j) {
         this.o.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), arm.tY, arn.g, 1.0F, 1.0F);
      } else if ($$2 == aac.k) {
         this.o.a(jx.r, $$1.dr(), $$1.dt(), $$1.dx(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), arm.hm, arn.f, 1.0F, 1.0F);
         }
      } else if ($$2 == aac.l) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == aac.m) {
         this.a.s.w($$3 == 1.0F);
      } else if ($$2 == aac.n && this.K != null) {
         this.K.c();
      }
   }

   private void a(fsb $$0, fnk $$1) {
      this.K = new fnq($$0, $$1, this.a.f);
      this.a.a(new fcr(this.K::b));
   }

   @Override
   public void a(aan $$0) {
      xf.a($$0, this, this.a);
      ewo $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cmy.a($$2);
      efu $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = efu.a($$0.d(), $$0.e(), this.a.r.ae());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(aai $$0) {
      xf.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(acz $$0) {
      xf.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(abl $$0) {
      xf.a($$0, this, this.a);
      ahd $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(zp $$0) {
      xf.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dn.a((ij.b)this.C, this.D)));
   }

   @Override
   public void a(acr $$0) {
      xf.a($$0, this, this.a);
      this.a.ah().a($$0.a(), $$0.d());
   }

   @Override
   public void a(zo $$0) {
      xf.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(adc $$0) {
      xf.a($$0, this, this.a);
      this.z.a($$0.a());
      eun $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.I_());
      this.a.a(ghz.c, $$1.b());
   }

   @Override
   public void a(abc $$0) {
      xf.a($$0, this, this.a);
      elm $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(acu $$0) {
      xf.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(zb $$0) {
      xf.a($$0, this, this.a);

      for (Entry<art<?>, Integer> $$1 : $$0.a().entrySet()) {
         art<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fdd) {
         ((fdd)this.a.y).D();
      }
   }

   @Override
   public void a(abe $$0) {
      xf.a($$0, this, this.a);
      eun $$1 = this.a.s.m();
      $$1.a($$0.e());
      abe.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (ahd $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ahd $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (ahd $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ahd $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     eze.a(this.a.ax(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fgn) {
         ((fgn)this.a.y).E();
      }
   }

   @Override
   public void a(adb $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 instanceof bmf) {
         bla $$2 = $$0.d();
         if ($$2 != null) {
            blc $$3 = new blc($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((bmf)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(xm $$0) {
      super.a($$0);
      this.z();
   }

   private void z() {
      if (!this.b.g()) {
         cwl.a();
      }

      cky.e().n();
   }

   @Override
   public void a(aax $$0) {
   }

   @Override
   public void a(aay $$0) {
   }

   @Override
   public void a(aaz $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fbs($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fQ();
         }
      }
   }

   @Override
   public void a(zj $$0) {
      xf.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(abt $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(aaf $$0) {
      xf.a($$0, this, this.a);
      dkr $$1 = this.o.D_();
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
   public void a(abo $$0) {
      xf.a($$0, this, this.a);
      this.o.D_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(abp $$0) {
      xf.a($$0, this, this.a);
      this.o.D_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(abq $$0) {
      xf.a($$0, this, this.a);
      this.o.D_().a($$0.a());
   }

   @Override
   public void a(abs $$0) {
      xf.a($$0, this, this.a);
      this.o.D_().c($$0.a());
   }

   @Override
   public void a(abr $$0) {
      xf.a($$0, this, this.a);
      this.o.D_().b($$0.a());
   }

   @Override
   public void a(zn $$0) {
      xf.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(abm $$0) {
      xf.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().map(fnv::b).ifPresent(this.c::a);
         this.c.a($$0.e());
         fnw.b(this.c);
         if (!this.L && !$$0.e()) {
            ezf $$1 = ezf.a(this.a, ezf.a.h, h, i);
            this.a.ax().a($$1);
            this.L = true;
         }
      }
   }

   @Override
   public void a(zv $$0) {
      xf.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(abn $$0) {
      xf.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(acm $$0) {
      xf.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(ack $$0) {
      xf.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(acn $$0) {
      xf.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(act $$0) {
      xf.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(abg $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = $$0.a(this.o);
      if ($$1 instanceof bmf) {
         ((bmf)$$1).c($$0.a());
      }
   }

   @Override
   public void a(aba $$0) {
      xf.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aJ().f($$1);
         fnt $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(abb $$0) {
      xf.a($$0, this, this.a);

      for (abb.b $$1 : $$0.e()) {
         fnt $$2 = new fnt(Objects.requireNonNull($$1.b()), this.A());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aJ().a($$2);
         }
      }

      for (abb.b $$3 : $$0.d()) {
         fnt $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (abb.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(abb.a $$0, abb.b $$1, fnt $$2) {
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

   private void a(abb.b $$0, fnt $$1) {
      GameProfile $$2 = $$1.a();
      auv $$3 = this.a.aS();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         vu.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               vu $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cfe.b var7) {
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
   public void a(aav $$0) {
      xf.a($$0, this, this.a);
      cfb $$1 = this.a.s;
      $$1.fT().b = $$0.d();
      $$1.fT().d = $$0.f();
      $$1.fT().a = $$0.a();
      $$1.fT().c = $$0.e();
      $$1.fT().a($$0.g());
      $$1.fT().b($$0.h());
   }

   @Override
   public void a(acp $$0) {
      xf.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(aco $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(zh $$0) {
      xf.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(zu $$0) {
      xf.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.gn().b($$0.a());
      } else {
         this.a.s.gn().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(aaq $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.a.s.cW();
      if ($$1 != this.a.s && $$1.cX()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new aee($$1));
      }
   }

   @Override
   public void a(aar $$0) {
      xf.a($$0, this, this.a);
      cmr $$1 = this.a.s.b($$0.a());
      if ($$1.a(cmu.tU)) {
         this.a.a(new fdz(new fdz.c($$1)));
      }
   }

   @Override
   public void a(xx $$0) {
      if ($$0 instanceof yg $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof yf $$2) {
         ((fwr)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof yl $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof yn $$4) {
         ((fwz)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof yj $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof yh $$6) {
         fwf.a $$7 = new fwf.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof yi $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof ym $$9) {
         fwx $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof yd $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof xu $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof xt $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof ye $$14) {
         this.a.k.o.a($$14.b(), this.o.X());
      } else if ($$0 instanceof yb $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof yc) {
         this.a.k.r.a();
      } else if ($$0 instanceof yk $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof xz $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof ya $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof xw $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(xx $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(acf $$0) {
      xf.a($$0, this, this.a);
      emq $$1 = this.o.K();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, emt.a, $$0.d(), $$0.f(), false, $$0.g());
      } else {
         emi $$3 = $$1.a($$2);
         if ($$3 != null) {
            if ($$0.e() == 1) {
               $$1.j($$3);
            } else if ($$0.e() == 2) {
               $$3.a($$0.f());
               $$3.a($$0.d());
               $$3.b($$0.g());
            }
         }
      }
   }

   @Override
   public void a(aci $$0) {
      xf.a($$0, this, this.a);
      emq $$1 = this.o.K();
      String $$2 = $$0.d();
      emp $$3 = emp.d($$0.a());
      emi $$4 = $$1.a($$2);
      if ($$4 != null) {
         emo $$5 = $$1.a($$3, $$4, true);
         $$5.a($$0.e());
         $$5.a($$0.f());
         $$5.a($$0.g());
      } else {
         g.warn("Received packet for unknown scoreboard objective: {}", $$2);
      }
   }

   @Override
   public void a(abh $$0) {
      xf.a($$0, this, this.a);
      emq $$1 = this.o.K();
      String $$2 = $$0.d();
      emp $$3 = emp.d($$0.a());
      if ($$2 == null) {
         $$1.b($$3);
      } else {
         emi $$4 = $$1.a($$2);
         if ($$4 != null) {
            $$1.e($$3, $$4);
         } else {
            g.warn("Received packet for unknown scoreboard objective: {}", $$2);
         }
      }
   }

   @Override
   public void a(aby $$0) {
      xf.a($$0, this, this.a);
      emq $$1 = this.o.K();
      String $$2 = $$0.d();
      emi $$3 = $$2 == null ? null : $$1.a($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(ach $$0) {
      xf.a($$0, this, this.a);
      emq $$1 = this.o.K();
      ach.a $$2 = $$0.d();
      eml $$3;
      if ($$2 == ach.a.a) {
         $$3 = $$1.c($$0.e());
      } else {
         $$3 = $$1.b($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<ach.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         ems.b $$2x = ems.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         ems.a $$3x = ems.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      ach.a $$6 = $$0.a();
      if ($$6 == ach.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == ach.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == ach.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(aaj $$0) {
      xf.a($$0, this, this.a);
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
   public void a(ada $$0) {
      xf.a($$0, this, this.a);
      blp $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bmf)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bni $$2 = ((bmf)$$1).eR();

            for (ada.a $$3 : $$0.d()) {
               bnh $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, kd.u.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bnj $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aau $$0) {
      xf.a($$0, this, this.a);
      chu $$1 = this.a.s.bS;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fgn) {
               fgh $$2 = ((fgn)this.a.y).H();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(aak $$0) {
      xf.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      aal $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, aal $$2) {
      edz $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, ctr.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, ctr.b, $$7, $$8, $$9);
      $$3.a(new csp($$0, $$1), true);
   }

   @Override
   public void a(aao $$0) {
      xf.a($$0, this, this.a);
      chu $$1 = this.a.s.bS;
      if ($$0.a() == $$1.j && $$1 instanceof cjd $$2) {
         $$2.a($$0.d());
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(abw $$0) {
      xf.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(acj $$0) {
      xf.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(abv $$0) {
      xf.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(zc $$0) {
      xf.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(zi $$0) {
      xf.a($$0, this, this.a);

      for (xd<yx> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(zl $$0) {
      this.I.a();
   }

   @Override
   public void a(zk $$0) {
      this.I.a($$0.a());
      this.b(new adq(this.I.b()));
   }

   @Override
   public void a(agc $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, edz $$2, ctr $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, iz.a($$0, $$8, $$1), $$9 ? new dlc((byte[])$$6.next().clone()) : new dlc());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public ue m() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k() && !this.M;
   }

   public Collection<fnt> n() {
      return this.r;
   }

   public Collection<fnt> o() {
      return this.q.values();
   }

   public Collection<UUID> p() {
      return this.q.keySet();
   }

   @Nullable
   public fnt a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public fnt a(String $$0) {
      for (fnt $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile q() {
      return this.n;
   }

   public fnf r() {
      return this.s;
   }

   public CommandDispatcher<dx> s() {
      return this.y;
   }

   public fnk t() {
      return this.o;
   }

   public eur u() {
      return this.u;
   }

   public UUID v() {
      return this.A;
   }

   public Set<ahc<cti>> w() {
      return this.B;
   }

   @Override
   public iu.b f() {
      return this.C;
   }

   public void a(vt $$0, boolean $$1) {
      vp $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new adm($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = atg.c.a();
      vl.a $$3 = this.G.b();
      vp $$4 = this.F.pack(new vw($$0, $$1, $$2, $$3.a()));
      this.b(new ado($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = atg.c.a();
      vl.a $$3 = this.G.b();
      dz $$4 = dz.a(vv.a(this.e($$0)), $$3x -> {
         vw $$4x = new vw($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new adn($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (vv.a(this.e($$0)).a().isEmpty()) {
         vl.a $$1 = this.G.b();
         this.b(new adn($$0, Instant.now(), 0L, dz.a, $$1.b()));
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
         fnu $$0 = this.a.v();
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

   public void a(cfd $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = vo.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new adp(this.E.a().a()));
         }
      }
   }

   @Nullable
   public fnv x() {
      return this.c;
   }

   public chl y() {
      return this.D;
   }

   public boolean a(chl $$0) {
      return $$0.a(this.y());
   }
}
