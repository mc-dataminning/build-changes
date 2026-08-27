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

public class frb extends fqx implements aai, vg {
   private static final Logger i = LogUtils.getLogger();
   private static final vs j = vs.c("multiplayer.unsecureserver.toast.title");
   private static final vs k = vs.c("multiplayer.unsecureserver.toast");
   private static final vs l = vs.c("multiplayer.disconnect.invalid_packet");
   private static final vs m = vs.c("multiplayer.disconnect.chat_validation_failed");
   private static final vs n = vs.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fra q;
   private fra.a r;
   private final Map<UUID, frk> s = Maps.newHashMap();
   private final Set<frk> t = new ReferenceOpenHashSet();
   private final fqv u;
   private final frd v;
   private final eyb w = new eyb(this);
   private int x = 3;
   private int y = 3;
   private final awt z = awt.b();
   private CommandDispatcher<dz> A = new CommandDispatcher();
   private final csv B;
   private final UUID C = UUID.randomUUID();
   private Set<ajb<cwe>> D;
   private final iy.b E;
   private final ckl F;
   @Nullable
   private wd G;
   private wm.c H = wm.c.a;
   private wa I = new wa(20);
   private wf J = wf.a();
   private final fqu K = new fqu();
   private final frj L;
   private final frf M;
   @Nullable
   private frh N;
   private boolean O;
   private boolean P = false;
   private volatile boolean Q;
   private final epz R = new epz();

   public frb(eyk $$0, uq $$1, fre $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new fqv($$0, this.e);
      this.v = new frd(this, $$0);
      this.L = new frj(this, $$0.aO().m());
      this.B = new csv(this.E);
      this.M = new frf(this, $$0.aO());
   }

   public frd h() {
      return this.v;
   }

   public void i() {
      this.Q = true;
      this.j();
      this.e.c();
   }

   public void j() {
      this.q = null;
      this.N = null;
   }

   public csv k() {
      return this.B;
   }

   @Override
   public void a(abz $$0) {
      yc.a($$0, this, this.a);
      this.A();
      this.a.q = new fri(this.a, this);
      aeq $$1 = $$0.m();
      List<ajb<cwe>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      ajb<cwe> $$3 = $$1.b();
      il<dpq> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fra.a $$7 = new fra.a(bmi.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fra(this, $$7, $$3, $$4, this.x, this.y, this.a::aH, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new aua(), new exx());
         this.a.s.r(-180.0F);
         if (this.a.U() != null) {
            this.a.U().a(this.a.s.ct());
         }
      }

      this.a.k.a();
      this.a.s.z();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cs = new fvr(this.a.m);
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
      this.I = new wa(20);
      this.J = wf.a();
      if (this.b.h()) {
         this.a.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bb().a(this.a);
      this.O = $$0.n();
      if (this.c != null && !this.P && !this.B()) {
         fcs $$8 = fcs.a(this.a, fcs.a.g, j, k);
         this.a.ax().a($$8);
         this.P = true;
      }
   }

   @Override
   public void a(aaj $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bof b(aaj $$0) {
      bol<?> $$1 = $$0.f();
      if ($$1 == bol.bw) {
         frk $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new fvt(this.q, $$2.a());
         }
      } else {
         return $$1.a((cwe)this.q);
      }
   }

   private void a(bof $$0) {
      if ($$0 instanceof cjt $$1) {
         this.a.aj().a((glm)(new glf($$1)));
      } else if ($$0 instanceof can $$2) {
         boolean $$3 = $$2.aa_();
         gkz $$4;
         if ($$3) {
            $$4 = new gkx($$2);
         } else {
            $$4 = new gky($$2);
         }

         this.a.aj().a((gln)$$4);
      }
   }

   @Override
   public void a(aak $$0) {
      yc.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bof $$4 = new bon(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(ado $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(adm $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.an().a($$0.e());
      }
   }

   @Override
   public void a(aej $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cU()) {
            float $$5 = (float)($$0.h() * 360) / 256.0F;
            float $$6 = (float)($$0.i() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.c($$0.j());
         }
      }
   }

   @Override
   public void a(aek $$0) {
      yc.a($$0, this, this.a);
      if (this.a.r != null) {
         bmw $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(ael $$0) {
      yc.a($$0, this, this.a);
      if (this.a.r != null) {
         bmw $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(adh $$0) {
      yc.a($$0, this, this.a);
      if (chz.d($$0.b())) {
         this.a.s.fV().l = $$0.b();
      }
   }

   @Override
   public void a(acc $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.cU()) {
            if ($$0.j()) {
               ags $$2 = $$1.ah();
               eov $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
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
   public void a(acw $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(acs $$0) {
      yc.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bof.c.b));
   }

   @Override
   public void a(acq $$0) {
      yc.a($$0, this, this.a);
      cia $$1 = this.a.s;
      eov $$2 = $$1.dm();
      boolean $$3 = $$0.j().contains(bpk.a);
      boolean $$4 = $$0.j().contains(bpk.b);
      boolean $$5 = $$0.j().contains(bpk.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.do() + $$0.b();
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
         $$11 = $$1.dq() + $$0.e();
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
         $$15 = $$1.du() + $$0.f();
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
      if ($$0.j().contains(bpk.e)) {
         $$1.s($$1.dB() + $$19);
         $$1.N += $$19;
      } else {
         $$1.s($$19);
         $$1.N = $$19;
      }

      if ($$0.j().contains(bpk.d)) {
         $$1.r($$1.dz() + $$18);
         $$1.M += $$18;
      } else {
         $$1.r($$18);
         $$1.M = $$18;
      }

      this.b.a(new aex($$0.i()));
      this.b.a(new afs.b($$1.do(), $$1.dq(), $$1.du(), $$1.dz(), $$1.dB(), false));
   }

   @Override
   public void a(acx $$0) {
      yc.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(abu $$0) {
      yc.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      aby $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dol $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(aay $$0) {
      yc.a($$0, this, this.a);

      for (aay.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (aay.a $$2 : $$0.b()) {
         this.q.a(new cvl($$2.b().e, $$2.b().f));
      }

      for (aay.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.am(); $$6 < this.q.an(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, abt $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dol $$0, int $$1, int $$2) {
      ehg $$3 = this.q.i().p();
      dom[] $$4 = $$0.d();
      cvl $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dom $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(jd.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(abo $$0) {
      yc.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(abo $$0) {
      cvl $$1 = $$0.b();
      this.q.a(() -> {
         ehg $$1x = this.q.z_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            jd $$3 = jd.a($$1, $$2);
            $$1x.a(cwn.b, $$3, null);
            $$1x.a(cwn.a, $$3, null);
         }

         for (int $$4 = this.q.am(); $$4 < this.q.an(); $$4++) {
            $$1x.a(jd.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(aar $$0) {
      yc.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aed $$0) {
      yc.a($$0, this, this.a);
      this.a.c(new fji(n, this.b));
      this.b.a(zy.b, new fqy(this.a, this.b, new fre(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h)));
      this.b(afh.a);
      this.b.a(zy.a);
   }

   @Override
   public void a(aei $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      box $$2 = (box)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bon) {
            this.q.a($$1.do(), $$1.dq(), $$1.du(), atp.it, atq.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.do(), $$1.dq(), $$1.du(), atp.ne, atq.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fty(this.a.ap(), this.a.aP(), this.q, $$1, $$2));
         if ($$1 instanceof cel $$3) {
            cpq $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.f());
            }

            if ($$4.b()) {
               this.q.a($$0.b(), bof.c.b);
            }
         } else if (!($$1 instanceof bon)) {
            this.q.a($$0.b(), bof.c.b);
         }
      }
   }

   @Override
   public void a(aef $$0) {
      yc.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acj $$0) {
      yc.a($$0, this, this.a);
      Optional<wl> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         frk $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aY().a($$2, $$0.j());
         } else {
            wj $$4 = $$3.b();
            wn $$5;
            if ($$4 != null) {
               $$5 = new wn($$0.e(), $$2, $$4.c());
            } else {
               $$5 = wn.a($$2);
            }

            wi $$7 = new wi($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
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
   public void a(abl $$0) {
      yc.a($$0, this, this.a);
      this.a.aY().a($$0.b(), $$0.e());
   }

   @Override
   public void a(abk $$0) {
      yc.a($$0, this, this.a);
      Optional<we> $$1 = $$0.b().a(this.J);
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
   public void a(aal $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            box $$2 = (box)$$1;
            $$2.a(bmk.a);
         } else if ($$0.e() == 3) {
            box $$3 = (box)$$1;
            $$3.a(bmk.b);
         } else if ($$0.e() == 2) {
            cia $$4 = (cia)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, kb.g);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, kb.s);
         }
      }
   }

   @Override
   public void a(abr $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(ady $$0) {
      yc.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(adk $$0) {
      yc.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(adt $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.y(this.a.s);
         $$1.bB();

         for (int $$3 : $$0.b()) {
            bof $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cjv) {
                     this.a.s.M = $$1.dz();
                     this.a.s.r($$1.dz());
                     this.a.s.n($$1.dz());
                  }

                  vs $$5 = vs.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aX().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(adn $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 instanceof boz) {
         ((boz)$$1).s($$0.e());
      }
   }

   private static cpq a(cia $$0) {
      for (bmk $$1 : bmk.values()) {
         cpq $$2 = $$0.b($$1);
         if ($$2.a(cpt.vp)) {
            return $$2;
         }
      }

      return new cpq(cpt.vp);
   }

   @Override
   public void a(abm $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.aj().a((glm)(new gle((cfc)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, kb.ah, 30);
               this.q.a($$1.do(), $$1.dq(), $$1.du(), atp.yS, $$1.cY(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cia)this.a.s));
               }
               break;
            case 63:
               this.a.aj().a((glm)(new gli((cdb)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(abi $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(adr $$0) {
      yc.a($$0, this, this.a);
      this.a.s.D($$0.b());
      this.a.s.gf().a($$0.e());
      this.a.s.gf().b($$0.f());
   }

   @Override
   public void a(adq $$0) {
      yc.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acv $$0) {
      yc.a($$0, this, this.a);
      aeq $$1 = $$0.b();
      ajb<cwe> $$2 = $$1.b();
      il<dpq> $$3 = $$1.a();
      fvs $$4 = this.a.s;
      if ($$2 != $$4.dJ().ad()) {
         Map<eja, ejc> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fra.a $$8 = new fra.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fra(this, $$8, $$2, $$3, this.x, this.y, this.a::aH, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.fX()) {
         $$4.r();
      }

      fvs $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bP(), $$4.bV());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.aj());
      this.a.s = $$9;
      if ($$2 != $$4.dJ().ad()) {
         this.a.r().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<ail.b<?>> $$11 = $$4.an().c();
         if ($$11 != null) {
            $$9.an().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.eQ().a($$4.eQ());
      }

      $$9.z();
      this.q.c($$9);
      $$9.r(-180.0F);
      $$9.cs = new fvr(this.a.m);
      this.a.q.a($$9);
      $$9.t($$4.gl());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cA = $$4.cA;
      $$9.cB = $$4.cB;
      if (this.a.y instanceof ffg || this.a.y instanceof ffg.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(abn $$0) {
      yc.a($$0, this, this.a);
      cvw $$1 = new cvw(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.dm().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(abq $$0) {
      yc.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cco $$2) {
         fvs $$3 = this.a.s;
         bmu $$4 = new bmu($$0.e());
         clu $$5 = new clu($$0.b(), $$3.fV(), $$4, $$2);
         $$3.bX = $$5;
         this.a.a(new fif($$5, $$3.fV(), $$2));
      }
   }

   @Override
   public void a(acf $$0) {
      yc.a($$0, this, this.a);
      ffu.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(abf $$0) {
      yc.a($$0, this, this.a);
      cia $$1 = this.a.s;
      cpq $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aA().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fhv)) {
            $$1.bX.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.fV().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fhv $$5) {
            $$4 = !$$5.I();
         }

         if ($$0.b() == 0 && clv.f($$3)) {
            if (!$$2.b()) {
               cpq $$6 = $$1.bW.b($$3).g();
               if ($$6.b() || $$6.M() < $$2.M()) {
                  $$2.e(5);
               }
            }

            $$1.bW.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.bX.j && ($$0.b() != 0 || !$$4)) {
            $$1.bX.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(abd $$0) {
      yc.a($$0, this, this.a);
      cia $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.bW.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bX.j) {
         $$1.bX.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(acg $$0) {
      yc.a($$0, this, this.a);
      ib $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dku $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dme $$3 = this.q.a_($$1);
         dku $$4 = new dku($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(aap $$0) {
      yc.a($$0, this, this.a);
      ib $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         sy $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.a($$2, this.E);
         }

         if ($$1x instanceof djv && this.a.y instanceof fhq) {
            ((fhq)this.a.y).I();
         }
      });
   }

   @Override
   public void a(abe $$0) {
      yc.a($$0, this, this.a);
      cia $$1 = this.a.s;
      if ($$1.bX != null && $$1.bX.j == $$0.b()) {
         $$1.bX.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adp $$0) {
      yc.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof box $$2) {
         $$0.e().forEach($$1 -> $$2.a((bom)$$1.getFirst(), (cpq)$$1.getSecond()));
      }
   }

   @Override
   public void a(abc $$0) {
      yc.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(aaq $$0) {
      yc.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aao $$0) {
      yc.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abp $$0) {
      yc.a($$0, this, this.a);
      cia $$1 = this.a.s;
      abp.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = awm.d($$3 + 0.5F);
      if ($$2 == abp.b) {
         $$1.a(vs.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == abp.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == abp.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == abp.e) {
         this.a.q.a(cwb.a($$4));
      } else if ($$2 == abp.f) {
         if ($$4 == 0) {
            this.a.s.cr.b(new aff(aff.a.a));
            this.a.a(new fgf(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fgp(true, () -> {
               this.a.s.cr.b(new aff(aff.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == abp.g) {
         eyo $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new ffh());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(vs.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(vs.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(vs.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(vs.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == abp.h) {
         this.q.a($$1, $$1.do(), $$1.ds(), $$1.du(), atp.aD, atq.h, 0.18F, 0.45F);
      } else if ($$2 == abp.i) {
         this.q.e($$3);
      } else if ($$2 == abp.j) {
         this.q.c($$3);
      } else if ($$2 == abp.k) {
         this.q.a($$1, $$1.do(), $$1.dq(), $$1.du(), atp.uo, atq.g, 1.0F, 1.0F);
      } else if ($$2 == abp.l) {
         this.q.a(kb.r, $$1.do(), $$1.dq(), $$1.du(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.do(), $$1.dq(), $$1.du(), atp.hC, atq.f, 1.0F, 1.0F);
         }
      } else if ($$2 == abp.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == abp.n) {
         this.a.s.u($$3 == 1.0F);
      } else if ($$2 == abp.o && this.N != null) {
         this.N.c();
      }
   }

   private void a(fvs $$0, fra $$1) {
      this.N = new frh($$0, $$1, this.a.f);
      this.a.a(new fgf(this.N::b));
   }

   @Override
   public void a(aca $$0) {
      yc.a($$0, this, this.a);
      faa $$1 = this.a.j.j();
      eja $$2 = $$0.b();
      ejc $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = ejc.a($$0.e(), $$0.f(), this.a.r.ad());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(abv $$0) {
      yc.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(aem $$0) {
      yc.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(acy $$0) {
      yc.a($$0, this, this.a);
      ajc $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(abb $$0) {
      yc.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(dq.a(this.E, this.F)));
   }

   @Override
   public void a(aee $$0) {
      yc.a($$0, this, this.a);
      this.a.aj().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aba $$0) {
      yc.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(aep $$0) {
      yc.a($$0, this, this.a);
      this.B.a($$0.b());
      exx $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.I_());
      this.a.a(gly.c, $$1.b());
   }

   @Override
   public void a(acp $$0) {
      yc.a($$0, this, this.a);
      eov $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(aeh $$0) {
      yc.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(aam $$0) {
      yc.a($$0, this, this.a);
      ObjectIterator var2 = $$0.b().object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<atw<?>> $$1 = (Entry<atw<?>>)var2.next();
         atw<?> $$2 = (atw<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fgr) {
         ((fgr)this.a.y).H();
      }
   }

   @Override
   public void a(acr $$0) {
      yc.a($$0, this, this.a);
      exx $$1 = this.a.s.m();
      $$1.a($$0.f());
      acr.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (ajc $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ajc $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (ajc $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ajc $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fcr.a(this.a.ax(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fkb) {
         ((fkb)this.a.y).I();
      }
   }

   @Override
   public void a(aeo $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 instanceof box) {
         il<bnq> $$2 = $$0.e();
         bns $$3 = new bns($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.j();
         }

         ((box)$$1).c($$3, null);
      }
   }

   @Override
   public void a(yo $$0) {
      yc.a($$0, this, this.a);
      $$0.b().forEach(this::a);
      this.A();
   }

   private <T> void a(ajb<? extends ix<? extends T>> $$0, auw.a $$1) {
      ix<T> $$2 = this.E.d($$0);
      $$1.a($$2);
   }

   private void A() {
      if (!this.b.e()) {
         dja.f();
         czh.a();
      }

      cnz.e().n();
   }

   @Override
   public void a(ack $$0) {
   }

   @Override
   public void a(acl $$0) {
   }

   @Override
   public void a(acm $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new ffg($$0.e(), this.q.k().l()));
         } else {
            this.a.s.fT();
         }
      }
   }

   @Override
   public void a(aav $$0) {
      yc.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(adg $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(abs $$0) {
      yc.a($$0, this, this.a);
      dnv $$1 = this.q.D_();
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
   public void a(adb $$0) {
      yc.a($$0, this, this.a);
      this.q.D_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(adc $$0) {
      yc.a($$0, this, this.a);
      this.q.D_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(add $$0) {
      yc.a($$0, this, this.a);
      this.q.D_().a($$0.b());
   }

   @Override
   public void a(adf $$0) {
      yc.a($$0, this, this.a);
      this.q.D_().c($$0.b());
   }

   @Override
   public void a(ade $$0) {
      yc.a($$0, this, this.a);
      this.q.D_().b($$0.b());
   }

   @Override
   public void a(aaz $$0) {
      yc.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(acz $$0) {
      yc.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(frn::b).ifPresent(this.c::a);
         fro.b(this.c);
      }
   }

   @Override
   public void a(abh $$0) {
      yc.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ada $$0) {
      yc.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(adz $$0) {
      yc.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(adx $$0) {
      yc.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(aea $$0) {
      yc.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aeg $$0) {
      yc.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(act $$0) {
      yc.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof box $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(acn $$0) {
      yc.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aL().f($$1);
         frk $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(aco $$0) {
      yc.a($$0, this, this.a);

      for (aco.b $$1 : $$0.f()) {
         frk $$2 = new frk(Objects.requireNonNull($$1.b()), this.B());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aL().a($$2);
         }
      }

      for (aco.b $$3 : $$0.e()) {
         frk $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aco.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aco.a $$0, aco.b $$1, frk $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.ct().equals($$1.a())) {
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

   private void a(aco.b $$0, frk $$1) {
      GameProfile $$2 = $$1.a();
      awy $$3 = this.a.aU();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.B());
      } else {
         wj.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               wj $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cid.b var7) {
               i.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.B());
            }
         } else {
            $$1.a(this.B());
         }
      }
   }

   private boolean B() {
      return this.a.aV() && this.O;
   }

   @Override
   public void a(aci $$0) {
      yc.a($$0, this, this.a);
      cia $$1 = this.a.s;
      $$1.fW().b = $$0.e();
      $$1.fW().d = $$0.g();
      $$1.fW().a = $$0.b();
      $$1.fW().c = $$0.f();
      $$1.fW().a($$0.h());
      $$1.fW().b($$0.i());
   }

   @Override
   public void a(aec $$0) {
      yc.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(aeb $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aas $$0) {
      yc.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(abg $$0) {
      yc.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gq().b($$0.b());
      } else {
         this.a.s.gq().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(acd $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.a.s.cT();
      if ($$1 != this.a.s && $$1.cU()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new aft($$1));
      }
   }

   @Override
   public void a(ace $$0) {
      yc.a($$0, this, this.a);
      cpq $$1 = this.a.s.b($$0.b());
      if ($$1.a(cpt.tX)) {
         this.a.a(new fhn(new fhn.c($$1)));
      }
   }

   @Override
   public void a(za $$0) {
      if ($$0 instanceof zj $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof zi $$2) {
         ((gaj)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof zo $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof zq $$4) {
         ((gar)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof zm $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof zk $$6) {
         fzx.a $$7 = new fzx.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof zl $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof zp $$9) {
         gap $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof zg $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof yx $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof yw $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof zh $$14) {
         this.a.k.o.a($$14.b(), this.q.X());
      } else if ($$0 instanceof ze $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof zf) {
         this.a.k.r.a();
      } else if ($$0 instanceof zn $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof zc $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof zd $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof yz $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(za $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(ads $$0) {
      yc.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.R.a($$1, eqc.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         epr $$2 = this.R.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.R.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(adv $$0) {
      yc.a($$0, this, this.a);
      String $$1 = $$0.e();
      epy $$2 = epy.d($$0.b());
      epr $$3 = this.R.a($$1);
      if ($$3 != null) {
         epx $$4 = this.R.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(acu $$0) {
      yc.a($$0, this, this.a);
      String $$1 = $$0.e();
      epy $$2 = epy.d($$0.b());
      if ($$1 == null) {
         this.R.b($$2);
      } else {
         epr $$3 = this.R.a($$1);
         if ($$3 != null) {
            this.R.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(adl $$0) {
      yc.a($$0, this, this.a);
      String $$1 = $$0.e();
      epr $$2 = $$1 == null ? null : this.R.a($$1);
      this.R.a($$0.b(), $$2);
   }

   @Override
   public void a(adu $$0) {
      yc.a($$0, this, this.a);
      adu.a $$1 = $$0.e();
      epu $$2;
      if ($$1 == adu.a.a) {
         $$2 = this.R.c($$0.f());
      } else {
         $$2 = this.R.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<adu.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         eqb.b $$2x = eqb.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         eqb.a $$3x = eqb.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      adu.a $$5 = $$0.b();
      if ($$5 == adu.a.a) {
         for (String $$6 : $$0.g()) {
            this.R.a($$6, $$2);
         }
      } else if ($$5 == adu.a.b) {
         for (String $$7 : $$0.g()) {
            this.R.b($$7, $$2);
         }
      }

      if ($$1 == adu.a.b) {
         this.R.d($$2);
      }
   }

   @Override
   public void a(abw $$0) {
      yc.a($$0, this, this.a);
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
   public void a(aen $$0) {
      yc.a($$0, this, this.a);
      bof $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof box)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bqb $$2 = ((box)$$1).eQ();

            for (aen.a $$3 : $$0.e()) {
               bqa $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bqc $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ach $$0) {
      yc.a($$0, this, this.a);
      cku $$1 = this.a.s.bX;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fkb) {
               fjv $$2 = ((fkb)this.a.y).J();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(abx $$0) {
      yc.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      aby $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, aby $$2) {
      ehg $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cwn.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cwn.b, $$7, $$8, $$9);
      $$3.a(new cvl($$0, $$1), true);
   }

   @Override
   public void a(acb $$0) {
      yc.a($$0, this, this.a);
      cku $$1 = this.a.s.bX;
      if ($$0.b() == $$1.j && $$1 instanceof cmd $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(adj $$0) {
      yc.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(adw $$0) {
      yc.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(adi $$0) {
      yc.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(aan $$0) {
      yc.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(aau $$0) {
      yc.a($$0, this, this.a);

      for (xz<? super aai> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(aax $$0) {
      this.K.a();
   }

   @Override
   public void a(aaw $$0) {
      this.K.a($$0.b());
      this.b(new afe(this.K.b()));
   }

   @Override
   public void a(abj $$0) {
      this.a.aO().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ahv $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, ehg $$2, cwn $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, jd.a($$0, $$8, $$1), $$9 ? new dog((byte[])$$6.next().clone()) : new dog());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public uq l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.Q;
   }

   public Collection<frk> m() {
      return this.t;
   }

   public Collection<frk> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public frk a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public frk a(String $$0) {
      for (frk $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public fqv q() {
      return this.u;
   }

   public CommandDispatcher<dz> r() {
      return this.A;
   }

   public fra s() {
      return this.q;
   }

   public eyb t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<ajb<cwe>> v() {
      return this.D;
   }

   public iy.b w() {
      return this.E;
   }

   public void a(wi $$0, boolean $$1) {
      we $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.C();
      }
   }

   private void C() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new afa($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = avk.c.a();
      wa.a $$3 = this.I.b();
      we $$4 = this.H.pack(new wl($$0, $$1, $$2, $$3.a()));
      this.b(new afc($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = avk.c.a();
      wa.a $$3 = this.I.b();
      eb $$4 = eb.a(wk.a(this.e($$0)), $$3x -> {
         wl $$4x = new wl($$3x, $$1, $$2, $$3.a());
         return this.H.pack($$4x);
      });
      this.b(new afb($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (wk.a(this.e($$0)).a().isEmpty()) {
         wa.a $$1 = this.I.b();
         this.b(new afb($$0, Instant.now(), 0L, eb.a, $$1.b()));
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
         frl $$0 = this.a.v();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.f();
      if (this.a.aO().f()) {
         this.L.a();
      }

      this.M.a();
      this.e.a();
      if (this.N != null) {
         this.N.a();
      }
   }

   public void a(cic $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = wd.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new afd(this.G.a().a()));
         }
      }
   }

   @Nullable
   public frn x() {
      return this.c;
   }

   public ckl y() {
      return this.F;
   }

   public boolean a(ckl $$0) {
      return $$0.a(this.y());
   }

   public epz z() {
      return this.R;
   }
}
