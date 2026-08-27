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

public class fns extends fno implements uu, za {
   private static final Logger g = LogUtils.getLogger();
   private static final vf h = vf.c("multiplayer.unsecureserver.toast.title");
   private static final vf i = vf.c("multiplayer.unsecureserver.toast");
   private static final vf j = vf.c("multiplayer.disconnect.invalid_packet");
   private static final vf k = vf.c("multiplayer.disconnect.chat_validation_failed");
   private static final vf l = vf.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private fnr o;
   private fnr.a p;
   private final Map<UUID, foa> q = Maps.newHashMap();
   private final Set<foa> r = new ReferenceOpenHashSet();
   private final fnm s;
   private final fnu t;
   private final euy u = new euy(this);
   private int v = 3;
   private int w = 3;
   private final auu x = auu.b();
   private CommandDispatcher<dx> y = new CommandDispatcher();
   private final cqe z = new cqe();
   private final UUID A = UUID.randomUUID();
   private Set<ahf<cto>> B;
   private final iu.b C;
   private final chr D;
   @Nullable
   private vq E;
   private vz.c F = vz.c.a;
   private vn G = new vn(20);
   private vs H = vs.a();
   private final fnl I = new fnl();
   private final fnz J;
   @Nullable
   private fnx K;
   private boolean L = false;
   private volatile boolean M;

   public fns(evh $$0, ug $$1, fnv $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fnm($$0, this.e);
      this.t = new fnu(this, $$0);
      this.J = new fnz(this, $$0.aN().k());
   }

   public fnu i() {
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

   public cqe l() {
      return this.z;
   }

   @Override
   public void a(aap $$0) {
      xh.a($$0, this, this.a);
      this.z();
      this.a.q = new fny(this.a, this);
      adg $$1 = $$0.l();
      List<ahf<cto>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      ahf<cto> $$3 = $$1.b();
      ih<dmp> $$4 = this.C.d(ke.ay).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fnr.a $$7 = new fnr.a(bjx.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new fnr(this, $$7, $$3, $$4, this.v, this.w, this.a::aG, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new asc(), new euu());
         this.a.s.r(-180.0F);
         if (this.a.T() != null) {
            this.a.T().a(this.a.s.cw());
         }
      }

      this.a.k.a();
      this.a.s.z();
      this.a.s.e($$0.a());
      this.o.c(this.a.s);
      this.a.s.co = new fsh(this.a.m);
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
      this.G = new vn(20);
      this.H = vs.a();
      if (this.b.j()) {
         this.a.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aZ().a(this.a);
   }

   @Override
   public void a(zb $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.o.c($$1);
         this.a($$1);
      } else {
         g.warn("Skipping Entity with id {}", $$0.e());
      }
   }

   @Nullable
   private blu b(zb $$0) {
      bly<?> $$1 = $$0.e();
      if ($$1 == bly.bv) {
         foa $$2 = this.a($$0.d());
         if ($$2 == null) {
            g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
            return null;
         } else {
            return new fsj(this.o, $$2.a());
         }
      } else {
         return $$1.a((cto)this.o);
      }
   }

   private void a(blu $$0) {
      if ($$0 instanceof cgz $$1) {
         this.a.ai().a((ghz)(new ghs($$1)));
      } else if ($$0 instanceof bxy $$2) {
         boolean $$3 = $$2.aa_();
         ghm $$4;
         if ($$3) {
            $$4 = new ghk($$2);
         } else {
            $$4 = new ghl($$2);
         }

         this.a.ai().a((gia)$$4);
      }
   }

   @Override
   public void a(zc $$0) {
      xh.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      blu $$4 = new bma(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.c($$4);
   }

   @Override
   public void a(ace $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(acc $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.an().a($$0.d());
      }
   }

   @Override
   public void a(acz $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
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
   public void a(ada $$0) {
      xh.a($$0, this, this.a);
      if (this.a.r != null) {
         bkk $$1 = this.a.r.s();
         $$1.a($$0.a());
         $$1.a($$0.d());
      }
   }

   @Override
   public void a(adb $$0) {
      xh.a($$0, this, this.a);
      if (this.a.r != null) {
         bkk $$1 = this.a.r.s();
         $$1.c($$0.a());
      }
   }

   @Override
   public void a(abx $$0) {
      xh.a($$0, this, this.a);
      if (cfg.d($$0.a())) {
         this.a.s.fS().l = $$0.a();
      }
   }

   @Override
   public void a(aas $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cX()) {
            if ($$0.i()) {
               afg $$2 = $$1.ah();
               els $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
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
   public void a(abm $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(abi $$0) {
      xh.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, blu.c.b));
   }

   @Override
   public void a(abg $$0) {
      xh.a($$0, this, this.a);
      cfh $$1 = this.a.s;
      els $$2 = $$1.dp();
      boolean $$3 = $$0.i().contains(bmy.a);
      boolean $$4 = $$0.i().contains(bmy.b);
      boolean $$5 = $$0.i().contains(bmy.c);
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
      if ($$0.i().contains(bmy.e)) {
         $$1.s($$1.dE() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bmy.d)) {
         $$1.r($$1.dC() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new adm($$0.h()));
      this.b.a(new aeg.b($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE(), false));
   }

   @Override
   public void a(abn $$0) {
      xh.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(aak $$0) {
      xh.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      aao $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dln $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(zp $$0) {
      xh.a($$0, this, this.a);

      for (zp.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (zp.a $$2 : $$0.a()) {
         this.o.a(new csv($$2.b().e, $$2.b().f));
      }

      for (zp.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.an(); $$6 < this.o.ao(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, aaj $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dln $$0, int $$1, int $$2) {
      eef $$3 = this.o.i().p();
      dlo[] $$4 = $$0.d();
      csv $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dlo $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(iz.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(aae $$0) {
      xh.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(aae $$0) {
      csv $$1 = $$0.a();
      this.o.a(() -> {
         eef $$1x = this.o.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            iz $$3 = iz.a($$1, $$2);
            $$1x.a(ctx.b, $$3, null);
            $$1x.a(ctx.a, $$3, null);
         }

         for (int $$4 = this.o.an(); $$4 < this.o.ao(); $$4++) {
            $$1x.a(iz.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(zj $$0) {
      xh.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(act $$0) {
      this.b.a();
      xh.a($$0, this, this.a);
      this.a.c(new fgb(l, this.b));
      this.b.a(new fnp(this.a, this.b, new fnv(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new adw());
   }

   @Override
   public void a(acy $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      bmk $$2 = (bmk)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bma) {
            this.o.a($$1.dr(), $$1.dt(), $$1.dx(), arr.id, ars.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dr(), $$1.dt(), $$1.dx(), arr.mO, ars.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fqo(this.a.ao(), this.a.aO(), this.o, $$1, $$2));
         if ($$1 instanceof cbt $$3) {
            cmx $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), blu.c.b);
            }
         } else if (!($$1 instanceof bma)) {
            this.o.a($$0.a(), blu.c.b);
         }
      }
   }

   @Override
   public void a(acv $$0) {
      xh.a($$0, this, this.a);
      this.a.aW().a($$0.a(), $$0.d());
   }

   @Override
   public void a(aaz $$0) {
      xh.a($$0, this, this.a);
      Optional<vy> $$1 = $$0.f().a(this.H);
      Optional<vb.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         foa $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.a.aW().a($$3, $$2.get());
         } else {
            vw $$5 = $$4.b();
            wa $$6;
            if ($$5 != null) {
               $$6 = new wa($$0.d(), $$3, $$5.c());
            } else {
               $$6 = wa.a($$3);
            }

            vv $$8 = new vv($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
            if (!$$4.c().updateAndValidate($$8)) {
               this.a.aW().a($$3, $$2.get());
            } else {
               this.a.aW().a($$8, $$4.a(), $$2.get());
               this.H.a($$8);
            }
         }
      } else {
         this.b.a(j);
      }
   }

   @Override
   public void a(aab $$0) {
      xh.a($$0, this, this.a);
      Optional<vb.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aW().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(aaa $$0) {
      xh.a($$0, this, this.a);
      Optional<vr> $$1 = $$0.a().a(this.H);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.G.a($$1.get());
         if (!this.a.aW().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(zd $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bmk $$2 = (bmk)$$1;
            $$2.a(bjz.a);
         } else if ($$0.d() == 3) {
            bmk $$3 = (bmk)$$1;
            $$3.a(bjz.b);
         } else if ($$0.d() == 2) {
            cfh $$4 = (cfh)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, jx.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, jx.s);
         }
      }
   }

   @Override
   public void a(aah $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(aco $$0) {
      xh.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(aca $$0) {
      xh.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
   }

   @Override
   public void a(acj $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bB();

         for (int $$3 : $$0.a()) {
            blu $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof chb) {
                     this.a.s.N = $$1.dC();
                     this.a.s.r($$1.dC());
                     this.a.s.n($$1.dC());
                  }

                  vf $$5 = vf.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aV().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(acd $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 instanceof bmm) {
         ((bmm)$$1).r($$0.d());
      }
   }

   private static cmx a(cfh $$0) {
      for (bjz $$1 : bjz.values()) {
         cmx $$2 = $$0.b($$1);
         if ($$2.a(cna.vm)) {
            return $$2;
         }
      }

      return new cmx(cna.vm);
   }

   @Override
   public void a(aac $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ai().a((ghz)(new ghr((cck)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, jx.ah, 30);
               this.o.a($$1.dr(), $$1.dt(), $$1.dx(), arr.yC, $$1.db(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cfh)this.a.s));
               }
               break;
            case 63:
               this.a.ai().a((ghz)(new ghv((caj)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(zz $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(ach $$0) {
      xh.a($$0, this, this.a);
      this.a.s.D($$0.a());
      this.a.s.gc().a($$0.d());
      this.a.s.gc().b($$0.e());
   }

   @Override
   public void a(acg $$0) {
      xh.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(abl $$0) {
      xh.a($$0, this, this.a);
      adg $$1 = $$0.a();
      ahf<cto> $$2 = $$1.b();
      ih<dmp> $$3 = this.C.d(ke.ay).f($$1.a());
      fsi $$4 = this.a.s;
      if ($$2 != $$4.dM().ae()) {
         emw $$5 = this.o.K();
         Map<String, ega> $$6 = this.o.l();
         boolean $$7 = $$1.f();
         boolean $$8 = $$1.g();
         fnr.a $$9 = new fnr.a(this.p.s(), this.p.n(), $$8);
         this.p = $$9;
         this.o = new fnr(this, $$9, $$2, $$3, this.v, this.w, this.a::aG, this.a.f, $$7, $$1.c());
         this.o.a($$5);
         this.o.a($$6);
         this.a.a(this.o);
      }

      this.a.t = null;
      if ($$4.fU()) {
         $$4.r();
      }

      fsi $$10;
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
         List<agp.b<?>> $$12 = $$4.an().c();
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
      $$10.co = new fsh(this.a.m);
      this.a.q.a($$10);
      $$10.u($$4.gi());
      $$10.b($$4.o());
      $$10.a($$1.h());
      $$10.f($$1.i());
      $$10.cw = $$4.cw;
      $$10.cx = $$4.cx;
      if (this.a.y instanceof fbz || this.a.y instanceof fbz.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(aad $$0) {
      xh.a($$0, this, this.a);
      ctg $$1 = new ctg(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n());
      $$1.a(true);
      this.a.s.g(this.a.s.dp().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(aag $$0) {
      xh.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof bzw $$2) {
         fsi $$3 = this.a.s;
         bki $$4 = new bki($$0.d());
         cja $$5 = new cja($$0.a(), $$3.fS(), $$4, $$2);
         $$3.bS = $$5;
         this.a.a(new fey($$5, $$3.fS(), $$2));
      }
   }

   @Override
   public void a(aav $$0) {
      xh.a($$0, this, this.a);
      fcn.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(zw $$0) {
      xh.a($$0, this, this.a);
      cfh $$1 = this.a.s;
      cmx $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.az().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof feo)) {
            $$1.bS.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fS().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof feo $$5) {
            $$4 = !$$5.H();
         }

         if ($$0.a() == 0 && cjb.f($$3)) {
            if (!$$2.b()) {
               cmx $$6 = $$1.bR.b($$3).g();
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
   public void a(zu $$0) {
      xh.a($$0, this, this.a);
      cfh $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bR.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bS.j) {
         $$1.bS.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(aaw $$0) {
      xh.a($$0, this, this.a);
      hx $$1 = $$0.a();
      if (this.o.c_($$1) instanceof did $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         djg $$3 = this.o.a_($$1);
         did $$4 = new did($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(zh $$0) {
      xh.a($$0, this, this.a);
      hx $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         sn $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof dhe && this.a.y instanceof fej) {
            ((fej)this.a.y).H();
         }
      });
   }

   @Override
   public void a(zv $$0) {
      xh.a($$0, this, this.a);
      cfh $$1 = this.a.s;
      if ($$1.bS != null && $$1.bS.j == $$0.a()) {
         $$1.bS.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(acf $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((blz)$$1x.getFirst(), (cmx)$$1x.getSecond()));
      }
   }

   @Override
   public void a(zt $$0) {
      xh.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(zi $$0) {
      xh.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zg $$0) {
      xh.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aaf $$0) {
      xh.a($$0, this, this.a);
      cfh $$1 = this.a.s;
      aaf.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = aun.d($$3 + 0.5F);
      if ($$2 == aaf.a) {
         $$1.a(vf.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == aaf.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == aaf.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == aaf.d) {
         this.a.q.a(ctl.a($$4));
      } else if ($$2 == aaf.e) {
         if ($$4 == 0) {
            this.a.s.cn.b(new adu(adu.a.a));
            this.a.a(new fcy(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fdi(true, () -> {
               this.a.s.cn.b(new adu(adu.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == aaf.f) {
         evl $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fca());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(vf.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(vf.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(vf.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(vf.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == aaf.g) {
         this.o.a($$1, $$1.dr(), $$1.dv(), $$1.dx(), arr.aq, ars.h, 0.18F, 0.45F);
      } else if ($$2 == aaf.h) {
         this.o.e($$3);
      } else if ($$2 == aaf.i) {
         this.o.c($$3);
      } else if ($$2 == aaf.j) {
         this.o.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), arr.tY, ars.g, 1.0F, 1.0F);
      } else if ($$2 == aaf.k) {
         this.o.a(jx.r, $$1.dr(), $$1.dt(), $$1.dx(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), arr.hm, ars.f, 1.0F, 1.0F);
         }
      } else if ($$2 == aaf.l) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == aaf.m) {
         this.a.s.w($$3 == 1.0F);
      } else if ($$2 == aaf.n && this.K != null) {
         this.K.c();
      }
   }

   private void a(fsi $$0, fnr $$1) {
      this.K = new fnx($$0, $$1, this.a.f);
      this.a.a(new fcy(this.K::b));
   }

   @Override
   public void a(aaq $$0) {
      xh.a($$0, this, this.a);
      ewv $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cne.a($$2);
      ega $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = ega.a($$0.d(), $$0.e(), this.a.r.ae());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(aal $$0) {
      xh.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(adc $$0) {
      xh.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(abo $$0) {
      xh.a($$0, this, this.a);
      ahg $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(zs $$0) {
      xh.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dn.a((ij.b)this.C, this.D)));
   }

   @Override
   public void a(acu $$0) {
      xh.a($$0, this, this.a);
      this.a.ai().a($$0.a(), $$0.d());
   }

   @Override
   public void a(zr $$0) {
      xh.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(adf $$0) {
      xh.a($$0, this, this.a);
      this.z.a($$0.a());
      euu $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.I_());
      this.a.a(gil.c, $$1.b());
   }

   @Override
   public void a(abf $$0) {
      xh.a($$0, this, this.a);
      els $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(acx $$0) {
      xh.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(ze $$0) {
      xh.a($$0, this, this.a);

      for (Entry<ary<?>, Integer> $$1 : $$0.a().entrySet()) {
         ary<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fdk) {
         ((fdk)this.a.y).E();
      }
   }

   @Override
   public void a(abh $$0) {
      xh.a($$0, this, this.a);
      euu $$1 = this.a.s.m();
      $$1.a($$0.e());
      abh.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (ahg $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ahg $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (ahg $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ahg $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     ezl.a(this.a.ay(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fgu) {
         ((fgu)this.a.y).H();
      }
   }

   @Override
   public void a(ade $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 instanceof bmk) {
         blf $$2 = $$0.d();
         if ($$2 != null) {
            blh $$3 = new blh($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((bmk)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(xp $$0) {
      super.a($$0);
      this.z();
   }

   private void z() {
      if (!this.b.g()) {
         cwr.a();
      }

      cle.e().n();
   }

   @Override
   public void a(aba $$0) {
   }

   @Override
   public void a(abb $$0) {
   }

   @Override
   public void a(abc $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fbz($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fQ();
         }
      }
   }

   @Override
   public void a(zm $$0) {
      xh.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(abw $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(aai $$0) {
      xh.a($$0, this, this.a);
      dkx $$1 = this.o.D_();
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
   public void a(abr $$0) {
      xh.a($$0, this, this.a);
      this.o.D_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(abs $$0) {
      xh.a($$0, this, this.a);
      this.o.D_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(abt $$0) {
      xh.a($$0, this, this.a);
      this.o.D_().a($$0.a());
   }

   @Override
   public void a(abv $$0) {
      xh.a($$0, this, this.a);
      this.o.D_().c($$0.a());
   }

   @Override
   public void a(abu $$0) {
      xh.a($$0, this, this.a);
      this.o.D_().b($$0.a());
   }

   @Override
   public void a(zq $$0) {
      xh.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(abp $$0) {
      xh.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().map(foc::b).ifPresent(this.c::a);
         this.c.a($$0.e());
         fod.b(this.c);
         if (!this.L && !$$0.e()) {
            ezm $$1 = ezm.a(this.a, ezm.a.g, h, i);
            this.a.ay().a($$1);
            this.L = true;
         }
      }
   }

   @Override
   public void a(zy $$0) {
      xh.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(abq $$0) {
      xh.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(acp $$0) {
      xh.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(acn $$0) {
      xh.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(acq $$0) {
      xh.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(acw $$0) {
      xh.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(abj $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = $$0.a(this.o);
      if ($$1 instanceof bmk) {
         ((bmk)$$1).c($$0.a());
      }
   }

   @Override
   public void a(abd $$0) {
      xh.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aK().f($$1);
         foa $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(abe $$0) {
      xh.a($$0, this, this.a);

      for (abe.b $$1 : $$0.e()) {
         foa $$2 = new foa(Objects.requireNonNull($$1.b()), this.A());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aK().a($$2);
         }
      }

      for (abe.b $$3 : $$0.d()) {
         foa $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (abe.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(abe.a $$0, abe.b $$1, foa $$2) {
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

   private void a(abe.b $$0, foa $$1) {
      GameProfile $$2 = $$1.a();
      avb $$3 = this.a.aT();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         vw.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               vw $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cfk.b var7) {
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
   public void a(aay $$0) {
      xh.a($$0, this, this.a);
      cfh $$1 = this.a.s;
      $$1.fT().b = $$0.d();
      $$1.fT().d = $$0.f();
      $$1.fT().a = $$0.a();
      $$1.fT().c = $$0.e();
      $$1.fT().a($$0.g());
      $$1.fT().b($$0.h());
   }

   @Override
   public void a(acs $$0) {
      xh.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(acr $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(zk $$0) {
      xh.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(zx $$0) {
      xh.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.gn().b($$0.a());
      } else {
         this.a.s.gn().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(aat $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.a.s.cW();
      if ($$1 != this.a.s && $$1.cX()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new aeh($$1));
      }
   }

   @Override
   public void a(aau $$0) {
      xh.a($$0, this, this.a);
      cmx $$1 = this.a.s.b($$0.a());
      if ($$1.a(cna.tU)) {
         this.a.a(new feg(new feg.c($$1)));
      }
   }

   @Override
   public void a(ya $$0) {
      if ($$0 instanceof yj $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof yi $$2) {
         ((fwy)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof yo $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof yq $$4) {
         ((fxg)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof ym $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof yk $$6) {
         fwm.a $$7 = new fwm.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof yl $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof yp $$9) {
         fxe $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof yg $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof xx $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof xw $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof yh $$14) {
         this.a.k.o.a($$14.b(), this.o.X());
      } else if ($$0 instanceof ye $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof yf) {
         this.a.k.r.a();
      } else if ($$0 instanceof yn $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof yc $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof yd $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof xz $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(ya $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(aci $$0) {
      xh.a($$0, this, this.a);
      emw $$1 = this.o.K();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, emz.a, $$0.d(), $$0.f(), false, $$0.g());
      } else {
         emo $$3 = $$1.a($$2);
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
   public void a(acl $$0) {
      xh.a($$0, this, this.a);
      emw $$1 = this.o.K();
      String $$2 = $$0.d();
      emv $$3 = emv.d($$0.a());
      emo $$4 = $$1.a($$2);
      if ($$4 != null) {
         emu $$5 = $$1.a($$3, $$4, true);
         $$5.a($$0.e());
         $$5.a($$0.f());
         $$5.a($$0.g());
      } else {
         g.warn("Received packet for unknown scoreboard objective: {}", $$2);
      }
   }

   @Override
   public void a(abk $$0) {
      xh.a($$0, this, this.a);
      emw $$1 = this.o.K();
      String $$2 = $$0.d();
      emv $$3 = emv.d($$0.a());
      if ($$2 == null) {
         $$1.b($$3);
      } else {
         emo $$4 = $$1.a($$2);
         if ($$4 != null) {
            $$1.e($$3, $$4);
         } else {
            g.warn("Received packet for unknown scoreboard objective: {}", $$2);
         }
      }
   }

   @Override
   public void a(acb $$0) {
      xh.a($$0, this, this.a);
      emw $$1 = this.o.K();
      String $$2 = $$0.d();
      emo $$3 = $$2 == null ? null : $$1.a($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(ack $$0) {
      xh.a($$0, this, this.a);
      emw $$1 = this.o.K();
      ack.a $$2 = $$0.d();
      emr $$3;
      if ($$2 == ack.a.a) {
         $$3 = $$1.c($$0.e());
      } else {
         $$3 = $$1.b($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<ack.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         emy.b $$2x = emy.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         emy.a $$3x = emy.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      ack.a $$6 = $$0.a();
      if ($$6 == ack.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == ack.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == ack.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(aam $$0) {
      xh.a($$0, this, this.a);
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
   public void a(add $$0) {
      xh.a($$0, this, this.a);
      blu $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bmk)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bnn $$2 = ((bmk)$$1).eR();

            for (add.a $$3 : $$0.d()) {
               bnm $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, kd.u.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bno $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aax $$0) {
      xh.a($$0, this, this.a);
      cia $$1 = this.a.s.bS;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fgu) {
               fgo $$2 = ((fgu)this.a.y).I();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(aan $$0) {
      xh.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      aao $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, aao $$2) {
      eef $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, ctx.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, ctx.b, $$7, $$8, $$9);
      $$3.a(new csv($$0, $$1), true);
   }

   @Override
   public void a(aar $$0) {
      xh.a($$0, this, this.a);
      cia $$1 = this.a.s.bS;
      if ($$0.a() == $$1.j && $$1 instanceof cjj $$2) {
         $$2.a($$0.d());
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(abz $$0) {
      xh.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(acm $$0) {
      xh.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(aby $$0) {
      xh.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(zf $$0) {
      xh.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(zl $$0) {
      xh.a($$0, this, this.a);

      for (xf<za> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(zo $$0) {
      this.I.a();
   }

   @Override
   public void a(zn $$0) {
      this.I.a($$0.a());
      this.b(new adt(this.I.b()));
   }

   @Override
   public void a(agf $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, eef $$2, ctx $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, iz.a($$0, $$8, $$1), $$9 ? new dli((byte[])$$6.next().clone()) : new dli());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public ug m() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k() && !this.M;
   }

   public Collection<foa> n() {
      return this.r;
   }

   public Collection<foa> o() {
      return this.q.values();
   }

   public Collection<UUID> p() {
      return this.q.keySet();
   }

   @Nullable
   public foa a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public foa a(String $$0) {
      for (foa $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile q() {
      return this.n;
   }

   public fnm r() {
      return this.s;
   }

   public CommandDispatcher<dx> s() {
      return this.y;
   }

   public fnr t() {
      return this.o;
   }

   public euy u() {
      return this.u;
   }

   public UUID v() {
      return this.A;
   }

   public Set<ahf<cto>> w() {
      return this.B;
   }

   @Override
   public iu.b f() {
      return this.C;
   }

   public void a(vv $$0, boolean $$1) {
      vr $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new adp($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = atl.c.a();
      vn.a $$3 = this.G.b();
      vr $$4 = this.F.pack(new vy($$0, $$1, $$2, $$3.a()));
      this.b(new adr($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = atl.c.a();
      vn.a $$3 = this.G.b();
      dz $$4 = dz.a(vx.a(this.e($$0)), $$3x -> {
         vy $$4x = new vy($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new adq($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (vx.a(this.e($$0)).a().isEmpty()) {
         vn.a $$1 = this.G.b();
         this.b(new adq($$0, Instant.now(), 0L, dz.a, $$1.b()));
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
         fob $$0 = this.a.v();
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

   public void a(cfj $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = vq.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new ads(this.E.a().a()));
         }
      }
   }

   @Nullable
   public foc x() {
      return this.c;
   }

   public chr y() {
      return this.D;
   }

   public boolean a(chr $$0) {
      return $$0.a(this.y());
   }
}
