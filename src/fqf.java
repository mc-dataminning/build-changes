import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
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
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqf extends fqb implements aag, ve {
   private static final Logger i = LogUtils.getLogger();
   private static final vq j = vq.c("multiplayer.unsecureserver.toast.title");
   private static final vq k = vq.c("multiplayer.unsecureserver.toast");
   private static final vq l = vq.c("multiplayer.disconnect.invalid_packet");
   private static final vq m = vq.c("multiplayer.disconnect.chat_validation_failed");
   private static final vq n = vq.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fqe q;
   private fqe.a r;
   private final Map<UUID, fqn> s = Maps.newHashMap();
   private final Set<fqn> t = new ReferenceOpenHashSet();
   private final fpz u;
   private final fqh v;
   private final exf w = new exf(this);
   private int x = 3;
   private int y = 3;
   private final awp z = awp.b();
   private CommandDispatcher<dz> A = new CommandDispatcher();
   private final csi B = new csi();
   private final UUID C = UUID.randomUUID();
   private Set<aix<cvr>> D;
   private final iw.b E;
   private final cjw F;
   @Nullable
   private wb G;
   private wk.c H = wk.c.a;
   private vy I = new vy(20);
   private wd J = wd.a();
   private final fpy K = new fpy();
   private final fqm L;
   @Nullable
   private fqk M;
   private boolean N;
   private boolean O = false;
   private volatile boolean P;
   private final epd Q = new epd();

   public fqf(exo $$0, uo $$1, fqi $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fpz($$0, this.e);
      this.v = new fqh(this, $$0);
      this.L = new fqm(this, $$0.aO().l());
   }

   public fqh h() {
      return this.v;
   }

   public void i() {
      this.P = true;
      this.j();
      this.e.c();
   }

   public void j() {
      this.q = null;
      this.M = null;
   }

   public csi k() {
      return this.B;
   }

   @Override
   public void a(abw $$0) {
      ya.a($$0, this, this.a);
      this.A();
      this.a.q = new fql(this.a, this);
      aen $$1 = $$0.m();
      List<aix<cvr>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      aix<cvr> $$3 = $$1.b();
      ij<dov> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fqe.a $$7 = new fqe.a(blt.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fqe(this, $$7, $$3, $$4, this.x, this.y, this.a::aH, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new atw(), new exb());
         this.a.s.r(-180.0F);
         if (this.a.U() != null) {
            this.a.U().a(this.a.s.cw());
         }
      }

      this.a.k.a();
      this.a.s.z();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cr = new fuu(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.q);
      this.a.s.t($$0.j());
      this.a.s.b($$0.k());
      this.a.s.u($$0.l());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.h());
      this.G = null;
      this.I = new vy(20);
      this.J = wd.a();
      if (this.b.h()) {
         this.a.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bb().a(this.a);
      this.N = $$0.n();
      if (this.c != null && !this.O && !this.B()) {
         fbw $$8 = fbw.a(this.a, fbw.a.g, j, k);
         this.a.az().a($$8);
         this.O = true;
      }
   }

   @Override
   public void a(aah $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bnq b(aah $$0) {
      bnw<?> $$1 = $$0.f();
      if ($$1 == bnw.bw) {
         fqn $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new fuw(this.q, $$2.a());
         }
      } else {
         return $$1.a((cvr)this.q);
      }
   }

   private void a(bnq $$0) {
      if ($$0 instanceof cje $$1) {
         this.a.aj().a((gko)(new gkh($$1)));
      } else if ($$0 instanceof bzy $$2) {
         boolean $$3 = $$2.aa_();
         gkb $$4;
         if ($$3) {
            $$4 = new gjz($$2);
         } else {
            $$4 = new gka($$2);
         }

         this.a.aj().a((gkp)$$4);
      }
   }

   @Override
   public void a(aai $$0) {
      ya.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bnq $$4 = new bny(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(adl $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(adj $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.an().a($$0.e());
      }
   }

   @Override
   public void a(aeg $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cX()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.c($$0.j());
         }
      }
   }

   @Override
   public void a(aeh $$0) {
      ya.a($$0, this, this.a);
      if (this.a.r != null) {
         bmh $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(aei $$0) {
      ya.a($$0, this, this.a);
      if (this.a.r != null) {
         bmh $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(ade $$0) {
      ya.a($$0, this, this.a);
      if (chk.d($$0.b())) {
         this.a.s.fT().l = $$0.b();
      }
   }

   @Override
   public void a(abz $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.cX()) {
            if ($$0.j()) {
               ago $$2 = $$1.ah();
               enz $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.q_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.f_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.p_(), $$1.N_(), $$1.O_(), $$6, $$7, 3);
            }

            $$1.c($$0.k());
         }
      }
   }

   @Override
   public void a(act $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(acp $$0) {
      ya.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bnq.c.b));
   }

   @Override
   public void a(acn $$0) {
      ya.a($$0, this, this.a);
      chl $$1 = this.a.s;
      enz $$2 = $$1.dp();
      boolean $$3 = $$0.j().contains(bov.a);
      boolean $$4 = $$0.j().contains(bov.b);
      boolean $$5 = $$0.j().contains(bov.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dr() + $$0.b();
         $$1.ab = $$1.ab + $$0.b();
         $$1.J = $$1.J + $$0.b();
      } else {
         $$6 = 0.0;
         $$7 = $$0.b();
         $$1.ab = $$7;
         $$1.J = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.dt() + $$0.e();
         $$1.ac = $$1.ac + $$0.e();
         $$1.K = $$1.K + $$0.e();
      } else {
         $$10 = 0.0;
         $$11 = $$0.e();
         $$1.ac = $$11;
         $$1.K = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dx() + $$0.f();
         $$1.ad = $$1.ad + $$0.f();
         $$1.L = $$1.L + $$0.f();
      } else {
         $$14 = 0.0;
         $$15 = $$0.f();
         $$1.ad = $$15;
         $$1.L = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.g();
      float $$19 = $$0.h();
      if ($$0.j().contains(bov.e)) {
         $$1.s($$1.dE() + $$19);
         $$1.N += $$19;
      } else {
         $$1.s($$19);
         $$1.N = $$19;
      }

      if ($$0.j().contains(bov.d)) {
         $$1.r($$1.dC() + $$18);
         $$1.M += $$18;
      } else {
         $$1.r($$18);
         $$1.M = $$18;
      }

      this.b.a(new aeu($$0.i()));
      this.b.a(new afo.b($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE(), false));
   }

   @Override
   public void a(acu $$0) {
      ya.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(abr $$0) {
      ya.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      abv $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dnq $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(aaw $$0) {
      ya.a($$0, this, this.a);

      for (aaw.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (aaw.a $$2 : $$0.b()) {
         this.q.a(new cuy($$2.b().e, $$2.b().f));
      }

      for (aaw.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.am(); $$6 < this.q.an(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, abq $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dnq $$0, int $$1, int $$2) {
      egl $$3 = this.q.i().p();
      dnr[] $$4 = $$0.d();
      cuy $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dnr $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(jb.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(abl $$0) {
      ya.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(abl $$0) {
      cuy $$1 = $$0.b();
      this.q.a(() -> {
         egl $$1x = this.q.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jb $$3 = jb.a($$1, $$2);
            $$1x.a(cwa.b, $$3, null);
            $$1x.a(cwa.a, $$3, null);
         }

         for (int $$4 = this.q.am(); $$4 < this.q.an(); $$4++) {
            $$1x.a(jb.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(aap $$0) {
      ya.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aea $$0) {
      ya.a($$0, this, this.a);
      this.a.c(new fim(n, this.b));
      this.b.a(zw.b, new fqc(this.a, this.b, new fqi(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h)));
      this.b(afe.a);
      this.b.a(zw.a);
   }

   @Override
   public void a(aef $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      boi $$2 = (boi)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bny) {
            this.q.a($$1.dr(), $$1.dt(), $$1.dx(), atl.it, atm.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.dr(), $$1.dt(), $$1.dx(), atl.ne, atm.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new ftb(this.a.ap(), this.a.aP(), this.q, $$1, $$2));
         if ($$1 instanceof cdw $$3) {
            cpd $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.f());
            }

            if ($$4.b()) {
               this.q.a($$0.b(), bnq.c.b);
            }
         } else if (!($$1 instanceof bny)) {
            this.q.a($$0.b(), bnq.c.b);
         }
      }
   }

   @Override
   public void a(aec $$0) {
      ya.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acg $$0) {
      ya.a($$0, this, this.a);
      Optional<wj> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fqn $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aY().a($$2, $$0.j());
         } else {
            wh $$4 = $$3.b();
            wl $$5;
            if ($$4 != null) {
               $$5 = new wl($$0.e(), $$2, $$4.c());
            } else {
               $$5 = wl.a($$2);
            }

            wg $$7 = new wg($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.aY().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aY().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(abi $$0) {
      ya.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(abh $$0) {
      ya.a($$0, this, this.a);
      Optional<wc> $$1 = $$0.b().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.I.a($$1.get());
         if (!this.a.aY().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(aaj $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            boi $$2 = (boi)$$1;
            $$2.a(blv.a);
         } else if ($$0.e() == 3) {
            boi $$3 = (boi)$$1;
            $$3.a(blv.b);
         } else if ($$0.e() == 2) {
            chl $$4 = (chl)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, jz.g);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, jz.s);
         }
      }
   }

   @Override
   public void a(abo $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(adv $$0) {
      ya.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(adh $$0) {
      ya.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(adq $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.y(this.a.s);
         $$1.bB();

         for (int $$3 : $$0.b()) {
            bnq $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cjg) {
                     this.a.s.M = $$1.dC();
                     this.a.s.r($$1.dC());
                     this.a.s.n($$1.dC());
                  }

                  vq $$5 = vq.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aX().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(adk $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 instanceof bok) {
         ((bok)$$1).s($$0.e());
      }
   }

   private static cpd a(chl $$0) {
      for (blv $$1 : blv.values()) {
         cpd $$2 = $$0.b($$1);
         if ($$2.a(cpg.vp)) {
            return $$2;
         }
      }

      return new cpd(cpg.vp);
   }

   @Override
   public void a(abj $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((gko)(new gkg((cen)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, jz.ah, 30);
               this.q.a($$1.dr(), $$1.dt(), $$1.dx(), atl.yS, $$1.db(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((chl)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((gko)(new gkk((ccm)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(abg $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(ado $$0) {
      ya.a($$0, this, this.a);
      this.a.s.D($$0.b());
      this.a.s.gd().a($$0.e());
      this.a.s.gd().b($$0.f());
   }

   @Override
   public void a(adn $$0) {
      ya.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acs $$0) {
      ya.a($$0, this, this.a);
      aen $$1 = $$0.b();
      aix<cvr> $$2 = $$1.b();
      ij<dov> $$3 = $$1.a();
      fuv $$4 = this.a.s;
      if ($$2 != $$4.dM().ad()) {
         Map<String, eig> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fqe.a $$8 = new fqe.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fqe(this, $$8, $$2, $$3, this.x, this.y, this.a::aH, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.fV()) {
         $$4.r();
      }

      fuv $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bS(), $$4.bY());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.aj());
      this.a.s = $$9;
      if ($$2 != $$4.dM().ad()) {
         this.a.r().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<aih.b<?>> $$11 = $$4.an().c();
         if ($$11 != null) {
            $$9.an().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.eS().a($$4.eS());
      }

      $$9.z();
      this.q.c($$9);
      $$9.r(-180.0F);
      $$9.cr = new fuu(this.a.m);
      this.a.q.a($$9);
      $$9.t($$4.gj());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cz = $$4.cz;
      $$9.cA = $$4.cA;
      if (this.a.y instanceof fek || this.a.y instanceof fek.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(abk $$0) {
      ya.a($$0, this, this.a);
      cvj $$1 = new cvj(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.dp().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(abn $$0) {
      ya.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cbz $$2) {
         fuv $$3 = this.a.s;
         bmf $$4 = new bmf($$0.e());
         clf $$5 = new clf($$0.b(), $$3.fT(), $$4, $$2);
         $$3.bW = $$5;
         this.a.a(new fhj($$5, $$3.fT(), $$2));
      }
   }

   @Override
   public void a(acc $$0) {
      ya.a($$0, this, this.a);
      fey.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(abd $$0) {
      ya.a($$0, this, this.a);
      chl $$1 = this.a.s;
      cpd $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aA().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fgz)) {
            $$1.bW.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.fT().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fgz $$5) {
            $$4 = !$$5.I();
         }

         if ($$0.b() == 0 && clg.f($$3)) {
            if (!$$2.b()) {
               cpd $$6 = $$1.bV.b($$3).g();
               if ($$6.b() || $$6.M() < $$2.M()) {
                  $$2.e(5);
               }
            }

            $$1.bV.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.bW.j && ($$0.b() != 0 || !$$4)) {
            $$1.bW.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(abb $$0) {
      ya.a($$0, this, this.a);
      chl $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.bV.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bW.j) {
         $$1.bW.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(acd $$0) {
      ya.a($$0, this, this.a);
      hz $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dkg $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dlj $$3 = this.q.a_($$1);
         dkg $$4 = new dkg($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(aan $$0) {
      ya.a($$0, this, this.a);
      hz $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         sw $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.a($$2);
         }

         if ($$1x instanceof djh && this.a.y instanceof fgu) {
            ((fgu)this.a.y).I();
         }
      });
   }

   @Override
   public void a(abc $$0) {
      ya.a($$0, this, this.a);
      chl $$1 = this.a.s;
      if ($$1.bW != null && $$1.bW.j == $$0.b()) {
         $$1.bW.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adm $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$0.e().forEach($$1x -> $$1.a((bnx)$$1x.getFirst(), (cpd)$$1x.getSecond()));
      }
   }

   @Override
   public void a(aba $$0) {
      ya.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(aao $$0) {
      ya.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aam $$0) {
      ya.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abm $$0) {
      ya.a($$0, this, this.a);
      chl $$1 = this.a.s;
      abm.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = awi.d($$3 + 0.5F);
      if ($$2 == abm.b) {
         $$1.a(vq.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == abm.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == abm.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == abm.e) {
         this.a.q.a(cvo.a($$4));
      } else if ($$2 == abm.f) {
         if ($$4 == 0) {
            this.a.s.cq.b(new afc(afc.a.a));
            this.a.a(new ffj(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fft(true, () -> {
               this.a.s.cq.b(new afc(afc.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == abm.g) {
         exs $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fel());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(vq.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(vq.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(vq.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(vq.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == abm.h) {
         this.q.a($$1, $$1.dr(), $$1.dv(), $$1.dx(), atl.aD, atm.h, 0.18F, 0.45F);
      } else if ($$2 == abm.i) {
         this.q.e($$3);
      } else if ($$2 == abm.j) {
         this.q.c($$3);
      } else if ($$2 == abm.k) {
         this.q.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), atl.uo, atm.g, 1.0F, 1.0F);
      } else if ($$2 == abm.l) {
         this.q.a(jz.r, $$1.dr(), $$1.dt(), $$1.dx(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), atl.hC, atm.f, 1.0F, 1.0F);
         }
      } else if ($$2 == abm.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == abm.n) {
         this.a.s.u($$3 == 1.0F);
      } else if ($$2 == abm.o && this.M != null) {
         this.M.c();
      }
   }

   private void a(fuv $$0, fqe $$1) {
      this.M = new fqk($$0, $$1, this.a.f);
      this.a.a(new ffj(this.M::b));
   }

   @Override
   public void a(abx $$0) {
      ya.a($$0, this, this.a);
      eze $$1 = this.a.j.j();
      int $$2 = $$0.b();
      String $$3 = cpk.a($$2);
      eig $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = eig.a($$0.e(), $$0.f(), this.a.r.ad());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(abs $$0) {
      ya.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(aej $$0) {
      ya.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(acv $$0) {
      ya.a($$0, this, this.a);
      aiy $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(aaz $$0) {
      ya.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(dq.a((il.b)this.E, this.F)));
   }

   @Override
   public void a(aeb $$0) {
      ya.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aay $$0) {
      ya.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aem $$0) {
      ya.a($$0, this, this.a);
      this.B.a($$0.b());
      exb $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.I_());
      this.a.a(gla.c, $$1.b());
   }

   @Override
   public void a(acm $$0) {
      ya.a($$0, this, this.a);
      enz $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(aee $$0) {
      ya.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(aak $$0) {
      ya.a($$0, this, this.a);
      ObjectIterator var2 = $$0.b().object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<ats<?>> $$1 = (Entry<ats<?>>)var2.next();
         ats<?> $$2 = (ats<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof ffv) {
         ((ffv)this.a.y).H();
      }
   }

   @Override
   public void a(aco $$0) {
      ya.a($$0, this, this.a);
      exb $$1 = this.a.s.m();
      $$1.a($$0.f());
      aco.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (aiy $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (aiy $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (aiy $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (aiy $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fbv.a(this.a.az(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fjf) {
         ((fjf)this.a.y).I();
      }
   }

   @Override
   public void a(ael $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 instanceof boi) {
         ij<bnb> $$2 = $$0.e();
         bnd $$3 = new bnd($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.i();
         }

         ((boi)$$1).c($$3, null);
      }
   }

   @Override
   public void a(ym $$0) {
      ya.a($$0, this, this.a);
      $$0.b().forEach(this::a);
      this.A();
   }

   private <T> void a(aix<? extends iv<? extends T>> $$0, aus.a $$1) {
      iv<T> $$2 = this.E.d($$0);
      $$1.a($$2);
   }

   private void A() {
      if (!this.b.e()) {
         dim.f();
         cyu.a();
      }

      cnk.e().n();
   }

   @Override
   public void a(ach $$0) {
   }

   @Override
   public void a(aci $$0) {
   }

   @Override
   public void a(acj $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fek($$0.e(), this.q.k().l()));
         } else {
            this.a.s.fR();
         }
      }
   }

   @Override
   public void a(aat $$0) {
      ya.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(add $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(abp $$0) {
      ya.a($$0, this, this.a);
      dna $$1 = this.q.D_();
      $$1.c($$0.b(), $$0.e());
      long $$2 = $$0.h();
      if ($$2 > 0L) {
         $$1.a($$0.g(), $$0.f(), $$2);
      } else {
         $$1.a($$0.f());
      }

      $$1.a($$0.i());
      $$1.c($$0.k());
      $$1.b($$0.j());
   }

   @Override
   public void a(acy $$0) {
      ya.a($$0, this, this.a);
      this.q.D_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(acz $$0) {
      ya.a($$0, this, this.a);
      this.q.D_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(ada $$0) {
      ya.a($$0, this, this.a);
      this.q.D_().a($$0.b());
   }

   @Override
   public void a(adc $$0) {
      ya.a($$0, this, this.a);
      this.q.D_().c($$0.b());
   }

   @Override
   public void a(adb $$0) {
      ya.a($$0, this, this.a);
      this.q.D_().b($$0.b());
   }

   @Override
   public void a(aax $$0) {
      ya.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(acw $$0) {
      ya.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fqq::b).ifPresent(this.c::a);
         fqr.b(this.c);
      }
   }

   @Override
   public void a(abf $$0) {
      ya.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(acx $$0) {
      ya.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(adw $$0) {
      ya.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(adu $$0) {
      ya.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(adx $$0) {
      ya.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aed $$0) {
      ya.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(acq $$0) {
      ya.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof boi $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(ack $$0) {
      ya.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aL().f($$1);
         fqn $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(acl $$0) {
      ya.a($$0, this, this.a);

      for (acl.b $$1 : $$0.f()) {
         fqn $$2 = new fqn(Objects.requireNonNull($$1.b()), this.B());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aL().a($$2);
         }
      }

      for (acl.b $$3 : $$0.e()) {
         fqn $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (acl.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(acl.a $$0, acl.b $$1, fqn $$2) {
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
               this.t.add($$2);
            } else {
               this.t.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
      }
   }

   private void a(acl.b $$0, fqn $$1) {
      GameProfile $$2 = $$1.a();
      awu $$3 = this.a.aU();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.B());
      } else {
         wh.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               wh $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cho.b var7) {
               i.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.B());
            }
         } else {
            $$1.a(this.B());
         }
      }
   }

   private boolean B() {
      return this.a.aV() && this.N;
   }

   @Override
   public void a(acf $$0) {
      ya.a($$0, this, this.a);
      chl $$1 = this.a.s;
      $$1.fU().b = $$0.e();
      $$1.fU().d = $$0.g();
      $$1.fU().a = $$0.b();
      $$1.fU().c = $$0.f();
      $$1.fU().a($$0.h());
      $$1.fU().b($$0.i());
   }

   @Override
   public void a(adz $$0) {
      ya.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(ady $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aaq $$0) {
      ya.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(abe $$0) {
      ya.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.go().b($$0.b());
      } else {
         this.a.s.go().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aca $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.a.s.cW();
      if ($$1 != this.a.s && $$1.cX()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new afp($$1));
      }
   }

   @Override
   public void a(acb $$0) {
      ya.a($$0, this, this.a);
      cpd $$1 = this.a.s.b($$0.b());
      if ($$1.a(cpg.tX)) {
         this.a.a(new fgr(new fgr.c($$1)));
      }
   }

   @Override
   public void a(yy $$0) {
      if ($$0 instanceof zh $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof zg $$2) {
         ((fzl)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof zm $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof zo $$4) {
         ((fzt)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof zk $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof zi $$6) {
         fyz.a $$7 = new fyz.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof zj $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof zn $$9) {
         fzr $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof ze $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof yv $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof yu $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof zf $$14) {
         this.a.k.o.a($$14.b(), this.q.X());
      } else if ($$0 instanceof zc $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof zd) {
         this.a.k.r.a();
      } else if ($$0 instanceof zl $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof za $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof zb $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof yx $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(yy $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(adp $$0) {
      ya.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.Q.a($$1, epg.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         eov $$2 = this.Q.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.Q.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(ads $$0) {
      ya.a($$0, this, this.a);
      String $$1 = $$0.e();
      epc $$2 = epc.d($$0.b());
      eov $$3 = this.Q.a($$1);
      if ($$3 != null) {
         epb $$4 = this.Q.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g());
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(acr $$0) {
      ya.a($$0, this, this.a);
      String $$1 = $$0.e();
      epc $$2 = epc.d($$0.b());
      if ($$1 == null) {
         this.Q.b($$2);
      } else {
         eov $$3 = this.Q.a($$1);
         if ($$3 != null) {
            this.Q.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(adi $$0) {
      ya.a($$0, this, this.a);
      String $$1 = $$0.e();
      eov $$2 = $$1 == null ? null : this.Q.a($$1);
      this.Q.a($$0.b(), $$2);
   }

   @Override
   public void a(adr $$0) {
      ya.a($$0, this, this.a);
      adr.a $$1 = $$0.e();
      eoy $$2;
      if ($$1 == adr.a.a) {
         $$2 = this.Q.c($$0.f());
      } else {
         $$2 = this.Q.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<adr.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         epf.b $$2x = epf.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         epf.a $$3x = epf.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      adr.a $$5 = $$0.b();
      if ($$5 == adr.a.a) {
         for (String $$6 : $$0.g()) {
            this.Q.a($$6, $$2);
         }
      } else if ($$5 == adr.a.b) {
         for (String $$7 : $$0.g()) {
            this.Q.b($$7, $$2);
         }
      }

      if ($$1 == adr.a.b) {
         this.Q.d($$2);
      }
   }

   @Override
   public void a(abt $$0) {
      ya.a($$0, this, this.a);
      if ($$0.l() == 0) {
         double $$1 = (double)($$0.k() * $$0.h());
         double $$2 = (double)($$0.k() * $$0.i());
         double $$3 = (double)($$0.k() * $$0.j());

         try {
            this.q.a($$0.m(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            i.warn("Could not spawn particle effect {}", $$0.m());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.l(); $$5++) {
            double $$6 = this.z.k() * (double)$$0.h();
            double $$7 = this.z.k() * (double)$$0.i();
            double $$8 = this.z.k() * (double)$$0.j();
            double $$9 = this.z.k() * (double)$$0.k();
            double $$10 = this.z.k() * (double)$$0.k();
            double $$11 = this.z.k() * (double)$$0.k();

            try {
               this.q.a($$0.m(), $$0.b(), $$0.e() + $$6, $$0.f() + $$7, $$0.g() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               i.warn("Could not spawn particle effect {}", $$0.m());
               return;
            }
         }
      }
   }

   @Override
   public void a(aek $$0) {
      ya.a($$0, this, this.a);
      bnq $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof boi)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bpm $$2 = ((boi)$$1).eS();

            for (aek.a $$3 : $$0.e()) {
               bpl $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bpn $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ace $$0) {
      ya.a($$0, this, this.a);
      ckf $$1 = this.a.s.bW;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fjf) {
               fiz $$2 = ((fjf)this.a.y).J();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(abu $$0) {
      ya.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      abv $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, abv $$2) {
      egl $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cwa.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cwa.b, $$7, $$8, $$9);
      $$3.a(new cuy($$0, $$1), true);
   }

   @Override
   public void a(aby $$0) {
      ya.a($$0, this, this.a);
      ckf $$1 = this.a.s.bW;
      if ($$0.b() == $$1.j && $$1 instanceof clo $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(adg $$0) {
      ya.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(adt $$0) {
      ya.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(adf $$0) {
      ya.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(aal $$0) {
      ya.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(aas $$0) {
      ya.a($$0, this, this.a);

      for (xx<? super aag> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aav $$0) {
      this.K.a();
   }

   @Override
   public void a(aau $$0) {
      this.K.a($$0.b());
      this.b(new afb(this.K.b()));
   }

   @Override
   public void a(ahr $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, egl $$2, cwa $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, jb.a($$0, $$8, $$1), $$9 ? new dnl((byte[])$$6.next().clone()) : new dnl());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public uo l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.P;
   }

   public Collection<fqn> m() {
      return this.t;
   }

   public Collection<fqn> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fqn a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fqn a(String $$0) {
      for (fqn $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public fpz q() {
      return this.u;
   }

   public CommandDispatcher<dz> r() {
      return this.A;
   }

   public fqe s() {
      return this.q;
   }

   public exf t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<aix<cvr>> v() {
      return this.D;
   }

   public iw.b w() {
      return this.E;
   }

   public void a(wg $$0, boolean $$1) {
      wc $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.C();
      }
   }

   private void C() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new aex($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = avg.c.a();
      vy.a $$3 = this.I.b();
      wc $$4 = this.H.pack(new wj($$0, $$1, $$2, $$3.a()));
      this.b(new aez($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = avg.c.a();
      vy.a $$3 = this.I.b();
      eb $$4 = eb.a(wi.a(this.e($$0)), $$3x -> {
         wj $$4x = new wj($$3x, $$1, $$2, $$3.a());
         return this.H.pack($$4x);
      });
      this.b(new aey($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (wi.a(this.e($$0)).a().isEmpty()) {
         vy.a $$1 = this.I.b();
         this.b(new aey($$0, Instant.now(), 0L, eb.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<dz> e(String $$0) {
      return this.A.parse($$0, this.v);
   }

   @Override
   public void e() {
      if (this.b.h()) {
         fqo $$0 = this.a.v();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.f();
      if (this.a.aO().f()) {
         this.L.a();
      }

      this.e.a();
      if (this.M != null) {
         this.M.a();
      }
   }

   public void a(chn $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = wb.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new afa(this.G.a().a()));
         }
      }
   }

   @Nullable
   public fqq x() {
      return this.c;
   }

   public cjw y() {
      return this.F;
   }

   public boolean a(cjw $$0) {
      return $$0.a(this.y());
   }

   public epd z() {
      return this.Q;
   }
}
