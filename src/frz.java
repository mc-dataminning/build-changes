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

public class frz extends frv implements aam, vi {
   private static final Logger i = LogUtils.getLogger();
   private static final vu j = vu.c("multiplayer.unsecureserver.toast.title");
   private static final vu k = vu.c("multiplayer.unsecureserver.toast");
   private static final vu l = vu.c("multiplayer.disconnect.invalid_packet");
   private static final vu m = vu.c("multiplayer.disconnect.chat_validation_failed");
   private static final vu n = vu.c("connect.reconfiguring");
   private static final int o = 64;
   private final GameProfile p;
   private fry q;
   private fry.a r;
   private final Map<UUID, fsj> s = Maps.newHashMap();
   private final Set<fsj> t = new ReferenceOpenHashSet();
   private final frt u;
   private final fsb v;
   private final eyx w = new eyx(this);
   private int x = 3;
   private int y = 3;
   private final axd z = axd.b();
   private CommandDispatcher<dz> A = new CommandDispatcher();
   private final ctq B;
   private final UUID C = UUID.randomUUID();
   private Set<ajg<cwz>> D;
   private final iz.b E;
   private final clf F;
   @Nullable
   private wf G;
   private wo.c H = wo.c.a;
   private wc I = new wc(20);
   private wh J = wh.a();
   private final frs K = new frs();
   private final fsi L;
   private final fsd M;
   @Nullable
   private fsg N;
   private boolean O;
   private boolean P = false;
   private volatile boolean Q;
   private final eqv R = new eqv();

   public frz(ezg $$0, us $$1, fsc $$2) {
      super($$0, $$1, $$2);
      this.p = $$2.a();
      this.E = $$2.c();
      this.F = $$2.d();
      this.u = new frt($$0, this.e);
      this.v = new fsb(this, $$0);
      this.L = new fsi(this, $$0.aP().m());
      this.B = new ctq(this.E);
      this.M = new fsd(this, $$0.aP());
   }

   public fsb h() {
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

   public ctq k() {
      return this.B;
   }

   @Override
   public void a(acd $$0) {
      ye.a($$0, this, this.a);
      this.a.q = new fsh(this.a, this);
      aeu $$1 = $$0.m();
      List<ajg<cwz>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.D = Sets.newLinkedHashSet($$2);
      ajg<cwz> $$3 = $$1.b();
      il<dqm> $$4 = $$1.a();
      this.x = $$0.h();
      this.y = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fry.a $$7 = new fry.a(bmz.c, $$0.e(), $$6);
      this.r = $$7;
      this.q = new fry(this, $$7, $$3, $$4, this.x, this.y, this.a::aI, this.a.f, $$5, $$1.c());
      this.a.a(this.q);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.q, new auj(), new eyt());
         this.a.s.r(-180.0F);
         if (this.a.V() != null) {
            this.a.V().a(this.a.s.cw());
         }
      }

      this.a.k.a();
      this.a.s.A();
      this.a.s.e($$0.b());
      this.q.c(this.a.s);
      this.a.s.cv = new fwr(this.a.m);
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
      this.I = new wc(20);
      this.J = wh.a();
      if (this.b.h()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bc().a(this.a);
      this.O = $$0.n();
      if (this.c != null && !this.P && !this.A()) {
         fdo $$8 = fdo.a(this.a, fdo.a.g, j, k);
         this.a.aA().a($$8);
         this.P = true;
      }
   }

   @Override
   public void a(aan $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.q.c($$1);
         this.a($$1);
      } else {
         i.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bow b(aan $$0) {
      bpc<?> $$1 = $$0.f();
      if ($$1 == bpc.bx) {
         fsj $$2 = this.a($$0.e());
         if ($$2 == null) {
            i.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new fwt(this.q, $$2.a());
         }
      } else {
         return $$1.a((cwz)this.q);
      }
   }

   private void a(bow $$0) {
      if ($$0 instanceof ckn $$1) {
         this.a.ak().a((gmm)(new gmf($$1)));
      } else if ($$0 instanceof cbe $$2) {
         boolean $$3 = $$2.Y_();
         glz $$4;
         if ($$3) {
            $$4 = new glx($$2);
         } else {
            $$4 = new gly($$2);
         }

         this.a.ak().a((gmn)$$4);
      }
   }

   @Override
   public void a(aao $$0) {
      ye.a($$0, this, this.a);
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      bow $$4 = new bpe(this.q, $$1, $$2, $$3, $$0.h());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.b());
      this.q.c($$4);
   }

   @Override
   public void a(ads $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.l((double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0, (double)$$0.g() / 8000.0);
      }
   }

   @Override
   public void a(adq $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.an().a($$0.e());
      }
   }

   @Override
   public void a(aen $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
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
   public void a(aeo $$0) {
      ye.a($$0, this, this.a);
      if (this.a.r != null) {
         bnn $$1 = this.a.r.s();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(aep $$0) {
      ye.a($$0, this, this.a);
      if (this.a.r != null) {
         bnn $$1 = this.a.r.s();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(adl $$0) {
      ye.a($$0, this, this.a);
      if (cir.d($$0.b())) {
         this.a.s.fZ().l = $$0.b();
      }
   }

   @Override
   public void a(acg $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = $$0.a(this.q);
      if ($$1 != null) {
         if (!$$1.cX()) {
            if ($$0.j()) {
               agw $$2 = $$1.ah();
               epr $$3 = $$2.a((long)$$0.b(), (long)$$0.e(), (long)$$0.f());
               $$2.e($$3);
               float $$4 = $$0.i() ? (float)($$0.g() * 360) / 256.0F : $$1.e_();
               float $$5 = $$0.i() ? (float)($$0.h() * 360) / 256.0F : $$1.M_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.i()) {
               float $$6 = (float)($$0.g() * 360) / 256.0F;
               float $$7 = (float)($$0.h() * 360) / 256.0F;
               $$1.a($$1.c_(), $$1.d_(), $$1.L_(), $$6, $$7, 3);
            }

            $$1.c($$0.k());
         }
      }
   }

   @Override
   public void a(ada $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = $$0.a(this.q);
      if ($$1 != null) {
         float $$2 = (float)($$0.b() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(acw $$0) {
      ye.a($$0, this, this.a);
      $$0.b().forEach($$0x -> this.q.a($$0x, bow.c.b));
   }

   @Override
   public void a(acu $$0) {
      ye.a($$0, this, this.a);
      cis $$1 = this.a.s;
      epr $$2 = $$1.dp();
      boolean $$3 = $$0.j().contains(bqb.a);
      boolean $$4 = $$0.j().contains(bqb.b);
      boolean $$5 = $$0.j().contains(bqb.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dr() + $$0.b();
         $$1.ac = $$1.ac + $$0.b();
         $$1.K = $$1.K + $$0.b();
      } else {
         $$6 = 0.0;
         $$7 = $$0.b();
         $$1.ac = $$7;
         $$1.K = $$7;
      }

      double $$10;
      double $$11;
      if ($$4) {
         $$10 = $$2.b();
         $$11 = $$1.dt() + $$0.e();
         $$1.ad = $$1.ad + $$0.e();
         $$1.L = $$1.L + $$0.e();
      } else {
         $$10 = 0.0;
         $$11 = $$0.e();
         $$1.ad = $$11;
         $$1.L = $$11;
      }

      double $$14;
      double $$15;
      if ($$5) {
         $$14 = $$2.c();
         $$15 = $$1.dx() + $$0.f();
         $$1.ae = $$1.ae + $$0.f();
         $$1.M = $$1.M + $$0.f();
      } else {
         $$14 = 0.0;
         $$15 = $$0.f();
         $$1.ae = $$15;
         $$1.M = $$15;
      }

      $$1.a_($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.g();
      float $$19 = $$0.h();
      if ($$0.j().contains(bqb.e)) {
         $$1.s($$1.dE() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.j().contains(bqb.d)) {
         $$1.r($$1.dC() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new afb($$0.i()));
      this.b.a(new afw.b($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE(), false));
   }

   @Override
   public void a(adb $$0) {
      ye.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.q.b($$0x, $$1, 19));
   }

   @Override
   public void a(aby $$0) {
      ye.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      acc $$3 = $$0.g();
      this.q.a(() -> {
         this.a($$1, $$2, $$3);
         dpg $$3x = this.q.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(abc $$0) {
      ye.a($$0, this, this.a);

      for (abc.a $$1 : $$0.b()) {
         this.q.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (abc.a $$2 : $$0.b()) {
         this.q.a(new cwg($$2.b().e, $$2.b().f));
      }

      for (abc.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.q.am(); $$6 < this.q.an(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, abx $$2) {
      this.q.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dpg $$0, int $$1, int $$2) {
      eic $$3 = this.q.i().p();
      dph[] $$4 = $$0.d();
      cwg $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dph $$7 = $$4[$$6];
         int $$8 = this.q.g($$6);
         $$3.a(je.a($$5, $$8), $$7.c());
         this.q.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(abs $$0) {
      ye.a($$0, this, this.a);
      this.q.i().a($$0.b());
      this.b($$0);
   }

   private void b(abs $$0) {
      cwg $$1 = $$0.b();
      this.q.a(() -> {
         eic $$1x = this.q.y_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            je $$3 = je.a($$1, $$2);
            $$1x.a(cxi.b, $$3, null);
            $$1x.a(cxi.a, $$3, null);
         }

         for (int $$4 = this.q.am(); $$4 < this.q.an(); $$4++) {
            $$1x.a(je.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(aav $$0) {
      ye.a($$0, this, this.a);
      this.q.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(aeh $$0) {
      ye.a($$0, this, this.a);
      this.a.c(new fkg(n, this.b));
      this.b.a(aab.b, new frw(this.a, this.b, new fsc(this.p, this.e, this.E, this.F, this.d, this.c, this.f, this.h)));
      this.b(afl.a);
      this.b.a(aab.a);
   }

   @Override
   public void a(aem $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      bpo $$2 = (bpo)this.q.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bpe) {
            this.q.a($$1.dr(), $$1.dt(), $$1.dx(), aty.iw, atz.h, 0.1F, (this.z.i() - this.z.i()) * 0.35F + 0.9F, false);
         } else {
            this.q.a($$1.dr(), $$1.dt(), $$1.dx(), aty.nh, atz.h, 0.2F, (this.z.i() - this.z.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fuy(this.a.aq(), this.a.aQ(), this.q, $$1, $$2));
         if ($$1 instanceof cfd $$3) {
            cqk $$4 = $$3.p();
            if (!$$4.b()) {
               $$4.h($$0.f());
            }

            if ($$4.b()) {
               this.q.a($$0.b(), bow.c.b);
            }
         } else if (!($$1 instanceof bpe)) {
            this.q.a($$0.b(), bow.c.b);
         }
      }
   }

   @Override
   public void a(aej $$0) {
      ye.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(acn $$0) {
      ye.a($$0, this, this.a);
      Optional<wn> $$1 = $$0.g().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.J.a($$1.get(), $$0.f());
         UUID $$2 = $$0.b();
         fsj $$3 = this.a($$2);
         if ($$3 == null) {
            i.error("Received player chat packet for unknown player with ID: {}", $$2);
            this.a.aZ().a($$2, $$0.j());
         } else {
            wl $$4 = $$3.b();
            wp $$5;
            if ($$4 != null) {
               $$5 = new wp($$0.e(), $$2, $$4.c());
            } else {
               $$5 = wp.a($$2);
            }

            wk $$7 = new wk($$5, $$0.f(), $$1.get(), $$0.h(), $$0.i());
            $$7 = $$3.c().updateAndValidate($$7);
            if ($$7 != null) {
               this.a.aZ().a($$7, $$3.a(), $$0.j());
            } else {
               this.a.aZ().a($$2, $$0.j());
            }
         }
      }
   }

   @Override
   public void a(abp $$0) {
      ye.a($$0, this, this.a);
      this.a.aZ().a($$0.b(), $$0.e());
   }

   @Override
   public void a(abo $$0) {
      ye.a($$0, this, this.a);
      Optional<wg> $$1 = $$0.b().a(this.J);
      if ($$1.isEmpty()) {
         this.b.a(l);
      } else {
         this.I.a($$1.get());
         if (!this.a.aZ().a($$1.get())) {
            this.a.l.d().a($$1.get());
         }
      }
   }

   @Override
   public void a(aap $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            bpo $$2 = (bpo)$$1;
            $$2.a(bnb.a);
         } else if ($$0.e() == 3) {
            bpo $$3 = (bpo)$$1;
            $$3.a(bnb.b);
         } else if ($$0.e() == 2) {
            cis $$4 = (cis)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, kc.g);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, kc.s);
         }
      }
   }

   @Override
   public void a(abv $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.m($$0.e());
      }
   }

   @Override
   public void a(aec $$0) {
      ye.a($$0, this, this.a);
      this.a.r.b($$0.b());
      this.a.r.c($$0.e());
      this.e.a($$0.b());
   }

   @Override
   public void a(ado $$0) {
      ye.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e());
   }

   @Override
   public void a(adx $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.e());
      if ($$1 == null) {
         i.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bE();

         for (int $$3 : $$0.b()) {
            bow $$4 = this.q.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof ckp) {
                     this.a.s.N = $$1.dC();
                     this.a.s.r($$1.dC());
                     this.a.s.n($$1.dC());
                  }

                  vu $$5 = vu.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aY().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(adr $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 instanceof bpq) {
         ((bpq)$$1).s($$0.e());
      }
   }

   private static cqk a(cis $$0) {
      for (bnb $$1 : bnb.values()) {
         cqk $$2 = $$0.b($$1);
         if ($$2.a(cqn.vq)) {
            return $$2;
         }
      }

      return new cqk(cqn.vq);
   }

   @Override
   public void a(abq $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = $$0.a(this.q);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.ak().a((gmm)(new gme((cfu)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, kc.ai, 30);
               this.q.a($$1.dr(), $$1.dt(), $$1.dx(), aty.yV, $$1.db(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cis)this.a.s));
               }
               break;
            case 63:
               this.a.ak().a((gmm)(new gmi((cds)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(abm $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.q));
      }
   }

   @Override
   public void a(adv $$0) {
      ye.a($$0, this, this.a);
      this.a.s.F($$0.b());
      this.a.s.gj().a($$0.e());
      this.a.s.gj().b($$0.f());
   }

   @Override
   public void a(adu $$0) {
      ye.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acz $$0) {
      ye.a($$0, this, this.a);
      aeu $$1 = $$0.b();
      ajg<cwz> $$2 = $$1.b();
      il<dqm> $$3 = $$1.a();
      fws $$4 = this.a.s;
      if ($$2 != $$4.dM().ad()) {
         Map<ejw, ejy> $$5 = this.q.l();
         boolean $$6 = $$1.f();
         boolean $$7 = $$1.g();
         fry.a $$8 = new fry.a(this.r.q(), this.r.l(), $$7);
         this.r = $$8;
         this.q = new fry(this, $$8, $$2, $$3, this.x, this.y, this.a::aI, this.a.f, $$6, $$1.c());
         this.q.a($$5);
         this.a.a(this.q);
      }

      this.a.t = null;
      if ($$4.gb()) {
         $$4.r();
      }

      fws $$9;
      if ($$0.a((byte)2)) {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m(), $$4.bS(), $$4.bY());
      } else {
         $$9 = this.a.q.a(this.q, $$4.j(), $$4.m());
      }

      this.a($$9, this.q);
      $$9.e($$4.aj());
      this.a.s = $$9;
      if ($$2 != $$4.dM().ad()) {
         this.a.s().b();
      }

      this.a.t = $$9;
      if ($$0.a((byte)2)) {
         List<aiq.c<?>> $$11 = $$4.an().c();
         if ($$11 != null) {
            $$9.an().a($$11);
         }
      }

      if ($$0.a((byte)1)) {
         $$9.eT().a($$4.eT());
      }

      $$9.A();
      this.q.c($$9);
      $$9.r(-180.0F);
      $$9.cv = new fwr(this.a.m);
      this.a.q.a($$9);
      $$9.t($$4.gp());
      $$9.b($$4.o());
      $$9.a($$1.h());
      $$9.f($$1.i());
      $$9.cD = $$4.cD;
      $$9.cE = $$4.cE;
      if (this.a.y instanceof fgd || this.a.y instanceof fgd.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(abr $$0) {
      ye.a($$0, this, this.a);
      cwr $$1 = new cwr(this.a.r, null, $$0.g(), $$0.h(), $$0.i(), $$0.j(), $$0.k(), $$0.l(), $$0.m(), $$0.n(), $$0.o());
      $$1.a(true);
      this.a.s.g(this.a.s.dp().b((double)$$0.b(), (double)$$0.e(), (double)$$0.f()));
   }

   @Override
   public void a(abu $$0) {
      ye.a($$0, this, this.a);
      if (this.q.a($$0.f()) instanceof cdf $$2) {
         fws $$3 = this.a.s;
         bnl $$4 = new bnl($$0.e());
         cmo $$5 = new cmo($$0.b(), $$3.fZ(), $$4, $$2);
         $$3.bZ = $$5;
         this.a.a(new fjd($$5, $$3.fZ(), $$2));
      }
   }

   @Override
   public void a(acj $$0) {
      ye.a($$0, this, this.a);
      fgs.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(abj $$0) {
      ye.a($$0, this, this.a);
      cis $$1 = this.a.s;
      cqk $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aB().a($$2);
      if ($$0.b() == -1) {
         if (!(this.a.y instanceof fit)) {
            $$1.bZ.b($$2);
         }
      } else if ($$0.b() == -2) {
         $$1.fZ().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof fit $$5) {
            $$4 = !$$5.I();
         }

         if ($$0.b() == 0 && cmp.f($$3)) {
            if (!$$2.b()) {
               cqk $$6 = $$1.bY.b($$3).g();
               if ($$6.b() || $$6.M() < $$2.M()) {
                  $$2.e(5);
               }
            }

            $$1.bY.a($$3, $$0.g(), $$2);
         } else if ($$0.b() == $$1.bZ.j && ($$0.b() != 0 || !$$4)) {
            $$1.bZ.a($$3, $$0.g(), $$2);
         }
      }
   }

   @Override
   public void a(abh $$0) {
      ye.a($$0, this, this.a);
      cis $$1 = this.a.s;
      if ($$0.b() == 0) {
         $$1.bY.a($$0.g(), $$0.e(), $$0.f());
      } else if ($$0.b() == $$1.bZ.j) {
         $$1.bZ.a($$0.g(), $$0.e(), $$0.f());
      }
   }

   @Override
   public void a(ack $$0) {
      ye.a($$0, this, this.a);
      ib $$1 = $$0.b();
      if (this.q.c_($$1) instanceof dlp $$2) {
         this.a.s.a($$2, $$0.e());
      } else {
         dmz $$3 = this.q.a_($$1);
         dlp $$4 = new dlp($$1, $$3);
         $$4.a(this.q);
         this.a.s.a($$4, $$0.e());
      }
   }

   @Override
   public void a(aat $$0) {
      ye.a($$0, this, this.a);
      ib $$1 = $$0.b();
      this.a.r.a($$1, $$0.e()).ifPresent($$1x -> {
         ta $$2 = $$0.f();
         if (!$$2.g()) {
            $$1x.a($$2, this.E);
         }

         if ($$1x instanceof dkq && this.a.y instanceof fio) {
            ((fio)this.a.y).I();
         }
      });
   }

   @Override
   public void a(abi $$0) {
      ye.a($$0, this, this.a);
      cis $$1 = this.a.s;
      if ($$1.bZ != null && $$1.bZ.j == $$0.b()) {
         $$1.bZ.a($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(adt $$0) {
      ye.a($$0, this, this.a);
      if (this.q.a($$0.b()) instanceof bpo $$2) {
         $$0.e().forEach($$1 -> $$2.a((bpd)$$1.getFirst(), (cqk)$$1.getSecond()));
      }
   }

   @Override
   public void a(abg $$0) {
      ye.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(aau $$0) {
      ye.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aas $$0) {
      ye.a($$0, this, this.a);
      this.a.r.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(abt $$0) {
      ye.a($$0, this, this.a);
      cis $$1 = this.a.s;
      abt.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = aww.d($$3 + 0.5F);
      if ($$2 == abt.b) {
         $$1.a(vu.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == abt.c) {
         this.q.k().b(true);
         this.q.e(0.0F);
      } else if ($$2 == abt.d) {
         this.q.k().b(false);
         this.q.e(1.0F);
      } else if ($$2 == abt.e) {
         this.a.q.a(cww.a($$4));
      } else if ($$2 == abt.f) {
         if ($$4 == 0) {
            this.a.s.cu.b(new afj(afj.a.a));
            this.a.a(new fhd(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new fhn(true, () -> {
               this.a.s.cu.b(new afj(afj.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == abt.g) {
         ezk $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new fge());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(vu.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(vu.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(vu.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(vu.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == abt.h) {
         this.q.a($$1, $$1.dr(), $$1.dv(), $$1.dx(), aty.aF, atz.h, 0.18F, 0.45F);
      } else if ($$2 == abt.i) {
         this.q.e($$3);
      } else if ($$2 == abt.j) {
         this.q.c($$3);
      } else if ($$2 == abt.k) {
         this.q.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), aty.ur, atz.g, 1.0F, 1.0F);
      } else if ($$2 == abt.l) {
         this.q.a(kc.r, $$1.dr(), $$1.dt(), $$1.dx(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.q.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), aty.hF, atz.f, 1.0F, 1.0F);
         }
      } else if ($$2 == abt.m) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == abt.n) {
         this.a.s.u($$3 == 1.0F);
      } else if ($$2 == abt.o && this.N != null) {
         this.N.c();
      }
   }

   private void a(fws $$0, fry $$1) {
      this.N = new fsg($$0, $$1, this.a.f);
      this.a.a(new fhd(this.N::b));
   }

   @Override
   public void a(ace $$0) {
      ye.a($$0, this, this.a);
      faw $$1 = this.a.j.j();
      ejw $$2 = $$0.b();
      ejy $$3 = this.a.r.a($$2);
      if ($$3 == null) {
         $$3 = ejy.a($$0.e(), $$0.f(), this.a.r.ad());
         this.a.r.b($$2, $$3);
      }

      $$0.a($$3);
      $$1.a($$2, $$3);
   }

   @Override
   public void a(abz $$0) {
      ye.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.r.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.r.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(aeq $$0) {
      ye.a($$0, this, this.a);
      this.u.a($$0);
   }

   @Override
   public void a(adc $$0) {
      ye.a($$0, this, this.a);
      ajh $$1 = $$0.b();
      if ($$1 == null) {
         this.u.a(null, false);
      } else {
         af $$2 = this.u.a($$1);
         this.u.a($$2, false);
      }
   }

   @Override
   public void a(abf $$0) {
      ye.a($$0, this, this.a);
      this.A = new CommandDispatcher($$0.a(dq.a(this.E, this.F)));
   }

   @Override
   public void a(aei $$0) {
      ye.a($$0, this, this.a);
      this.a.ak().a($$0.b(), $$0.e());
   }

   @Override
   public void a(abe $$0) {
      ye.a($$0, this, this.a);
      this.v.a($$0.e(), $$0.b());
   }

   @Override
   public void a(aet $$0) {
      ye.a($$0, this, this.a);
      this.B.a($$0.b());
      eyt $$1 = this.a.s.m();
      $$1.a(this.B.b(), this.a.r.H_());
      this.a.a(gmy.c, $$1.b());
   }

   @Override
   public void a(act $$0) {
      ye.a($$0, this, this.a);
      epr $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.s.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(ael $$0) {
      ye.a($$0, this, this.a);
      if (!this.w.a($$0.b(), $$0.e())) {
         i.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(aaq $$0) {
      ye.a($$0, this, this.a);
      ObjectIterator var2 = $$0.b().object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<auf<?>> $$1 = (Entry<auf<?>>)var2.next();
         auf<?> $$2 = (auf<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof fhp) {
         ((fhp)this.a.y).H();
      }
   }

   @Override
   public void a(acv $$0) {
      ye.a($$0, this, this.a);
      eyt $$1 = this.a.s.m();
      $$1.a($$0.f());
      acv.a $$2 = $$0.g();
      switch ($$2) {
         case c:
            for (ajh $$3 : $$0.b()) {
               this.B.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (ajh $$4 : $$0.b()) {
               this.B.a($$4).ifPresent($$1::a);
            }

            for (ajh $$5 : $$0.e()) {
               this.B.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (ajh $$6 : $$0.b()) {
               this.B.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     fdn.a(this.a.aA(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fkz) {
         ((fkz)this.a.y).I();
      }
   }

   @Override
   public void a(aes $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 instanceof bpo) {
         il<boh> $$2 = $$0.e();
         boj $$3 = new boj($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.j();
         }

         ((bpo)$$1).c($$3, null);
      }
   }

   @Override
   public void a(yq $$0) {
      ye.a($$0, this, this.a);
      fsp $$1 = new fsp();
      $$0.b().forEach($$1::a);
      $$1.a(this.E, this.b.e());
   }

   @Override
   public void a(aco $$0) {
   }

   @Override
   public void a(acp $$0) {
   }

   @Override
   public void a(acq $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new fgd($$0.e(), this.q.k().l()));
         } else {
            this.a.s.fX();
         }
      }
   }

   @Override
   public void a(aaz $$0) {
      ye.a($$0, this, this.a);
      this.r.a($$0.e());
      this.r.a($$0.b());
   }

   @Override
   public void a(adk $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = $$0.a(this.q);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(abw $$0) {
      ye.a($$0, this, this.a);
      doq $$1 = this.q.C_();
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
   public void a(adf $$0) {
      ye.a($$0, this, this.a);
      this.q.C_().c($$0.e(), $$0.b());
   }

   @Override
   public void a(adg $$0) {
      ye.a($$0, this, this.a);
      this.q.C_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adh $$0) {
      ye.a($$0, this, this.a);
      this.q.C_().a($$0.b());
   }

   @Override
   public void a(adj $$0) {
      ye.a($$0, this, this.a);
      this.q.C_().c($$0.b());
   }

   @Override
   public void a(adi $$0) {
      ye.a($$0, this, this.a);
      this.q.C_().b($$0.b());
   }

   @Override
   public void a(abd $$0) {
      ye.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.b()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(add $$0) {
      ye.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(fsm::b).ifPresent(this.c::a);
         fsn.b(this.c);
      }
   }

   @Override
   public void a(abl $$0) {
      ye.a($$0, this, this.a);
      this.v.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ade $$0) {
      ye.a($$0, this, this.a);
      this.a.l.a($$0.b(), false);
   }

   @Override
   public void a(aed $$0) {
      ye.a($$0, this, this.a);
      this.a.l.c($$0.b());
   }

   @Override
   public void a(aeb $$0) {
      ye.a($$0, this, this.a);
      this.a.l.b($$0.b());
   }

   @Override
   public void a(aee $$0) {
      ye.a($$0, this, this.a);
      this.a.l.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aek $$0) {
      ye.a($$0, this, this.a);
      this.a.l.h().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.l.h().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(acx $$0) {
      ye.a($$0, this, this.a);
      if ($$0.a(this.q) instanceof bpo $$1) {
         $$1.d($$0.e());
      }
   }

   @Override
   public void a(acr $$0) {
      ye.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aM().f($$1);
         fsj $$2 = this.s.remove($$1);
         if ($$2 != null) {
            this.t.remove($$2);
         }
      }
   }

   @Override
   public void a(acs $$0) {
      ye.a($$0, this, this.a);

      for (acs.b $$1 : $$0.f()) {
         fsj $$2 = new fsj(Objects.requireNonNull($$1.b()), this.A());
         if (this.s.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aM().a($$2);
         }
      }

      for (acs.b $$3 : $$0.e()) {
         fsj $$4 = this.s.get($$3.a());
         if ($$4 == null) {
            i.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (acs.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(acs.a $$0, acs.b $$1, fsj $$2) {
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

   private void a(acs.b $$0, fsj $$1) {
      GameProfile $$2 = $$1.a();
      axi $$3 = this.a.aV();
      if ($$3 == null) {
         i.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         wl.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               wl $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (civ.b var7) {
               i.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.A());
            }
         } else {
            $$1.a(this.A());
         }
      }
   }

   private boolean A() {
      return this.a.aW() && this.O;
   }

   @Override
   public void a(acm $$0) {
      ye.a($$0, this, this.a);
      cis $$1 = this.a.s;
      $$1.ga().b = $$0.e();
      $$1.ga().d = $$0.g();
      $$1.ga().a = $$0.b();
      $$1.ga().c = $$0.f();
      $$1.ga().a($$0.h());
      $$1.ga().b($$0.i());
   }

   @Override
   public void a(aeg $$0) {
      ye.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(aef $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.f());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(aaw $$0) {
      ye.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(abk $$0) {
      ye.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.s.gu().b($$0.b());
      } else {
         this.a.s.gu().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ach $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.a.s.cW();
      if ($$1 != this.a.s && $$1.cX()) {
         $$1.a($$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h());
         this.b.a(new afx($$1));
      }
   }

   @Override
   public void a(aci $$0) {
      ye.a($$0, this, this.a);
      cqk $$1 = this.a.s.b($$0.b());
      if ($$1.a(cqn.tY)) {
         this.a.a(new fil(new fil.c($$1)));
      }
   }

   @Override
   public void a(zc $$0) {
      if ($$0 instanceof zl $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof zk $$2) {
         ((gbj)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof zq $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof zs $$4) {
         ((gbr)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof zo $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof zm $$6) {
         gax.a $$7 = new gax.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof zn $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof zr $$9) {
         gbp $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof zi $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof yz $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof yy $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof zj $$14) {
         this.a.k.o.a($$14.b(), this.q.X());
      } else if ($$0 instanceof zg $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof zh) {
         this.a.k.r.a();
      } else if ($$0 instanceof zp $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof ze $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof zf $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else if ($$0 instanceof zb $$19) {
         this.a.k.u.a($$19.b());
      } else {
         this.b($$0);
      }
   }

   private void b(zc $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(adw $$0) {
      ye.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.R.a($$1, eqy.b, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         eqn $$2 = this.R.a($$1);
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
   public void a(adz $$0) {
      ye.a($$0, this, this.a);
      String $$1 = $$0.e();
      equ $$2 = equ.d($$0.b());
      eqn $$3 = this.R.a($$1);
      if ($$3 != null) {
         eqt $$4 = this.R.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         i.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(acy $$0) {
      ye.a($$0, this, this.a);
      String $$1 = $$0.e();
      equ $$2 = equ.d($$0.b());
      if ($$1 == null) {
         this.R.b($$2);
      } else {
         eqn $$3 = this.R.a($$1);
         if ($$3 != null) {
            this.R.e($$2, $$3);
         } else {
            i.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(adp $$0) {
      ye.a($$0, this, this.a);
      String $$1 = $$0.e();
      eqn $$2 = $$1 == null ? null : this.R.a($$1);
      this.R.a($$0.b(), $$2);
   }

   @Override
   public void a(ady $$0) {
      ye.a($$0, this, this.a);
      ady.a $$1 = $$0.e();
      eqq $$2;
      if ($$1 == ady.a.a) {
         $$2 = this.R.c($$0.f());
      } else {
         $$2 = this.R.b($$0.f());
         if ($$2 == null) {
            i.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<ady.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         eqx.b $$2x = eqx.b.a($$1x.d());
         if ($$2x != null) {
            $$2.a($$2x);
         }

         eqx.a $$3x = eqx.a.a($$1x.e());
         if ($$3x != null) {
            $$2.a($$3x);
         }

         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      ady.a $$5 = $$0.b();
      if ($$5 == ady.a.a) {
         for (String $$6 : $$0.g()) {
            this.R.a($$6, $$2);
         }
      } else if ($$5 == ady.a.b) {
         for (String $$7 : $$0.g()) {
            this.R.b($$7, $$2);
         }
      }

      if ($$1 == ady.a.b) {
         this.R.d($$2);
      }
   }

   @Override
   public void a(aca $$0) {
      ye.a($$0, this, this.a);
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
   public void a(aer $$0) {
      ye.a($$0, this, this.a);
      bow $$1 = this.q.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof bpo)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bqs $$2 = ((bpo)$$1).eT();

            for (aer.a $$3 : $$0.e()) {
               bqr $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  i.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bqt $$5 : $$3.c()) {
                     $$4.c($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(acl $$0) {
      ye.a($$0, this, this.a);
      clo $$1 = this.a.s.bZ;
      if ($$1.j == $$0.e()) {
         this.B.a($$0.b()).ifPresent($$1x -> {
            if (this.a.y instanceof fkz) {
               fkt $$2 = ((fkz)this.a.y).J();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(acb $$0) {
      ye.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      acc $$3 = $$0.f();
      this.q.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, acc $$2) {
      eic $$3 = this.q.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cxi.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cxi.b, $$7, $$8, $$9);
      $$3.a(new cwg($$0, $$1), true);
   }

   @Override
   public void a(acf $$0) {
      ye.a($$0, this, this.a);
      clo $$1 = this.a.s.bZ;
      if ($$0.b() == $$1.j && $$1 instanceof cmx $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(adn $$0) {
      ye.a($$0, this, this.a);
      this.x = $$0.b();
      this.a.m.b(this.x);
      this.q.i().a($$0.b());
   }

   @Override
   public void a(aea $$0) {
      ye.a($$0, this, this.a);
      this.y = $$0.b();
      this.q.h(this.y);
   }

   @Override
   public void a(adm $$0) {
      ye.a($$0, this, this.a);
      this.q.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(aar $$0) {
      ye.a($$0, this, this.a);
      this.q.b($$0.b());
   }

   @Override
   public void a(aay $$0) {
      ye.a($$0, this, this.a);

      for (yb<? super aam> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(abb $$0) {
      this.K.a();
   }

   @Override
   public void a(aba $$0) {
      this.K.a($$0.b());
      this.b(new afi(this.K.b()));
   }

   @Override
   public void a(abn $$0) {
      this.a.aP().a($$0.b(), $$0.e());
   }

   @Override
   public void a(ahz $$0) {
      this.L.a($$0);
   }

   private void a(int $$0, int $$1, eic $$2, cxi $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, je.a($$0, $$8, $$1), $$9 ? new dpb((byte[])$$6.next().clone()) : new dpb());
            this.q.c($$0, $$8, $$1);
         }
      }
   }

   public us l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.Q;
   }

   public Collection<fsj> m() {
      return this.t;
   }

   public Collection<fsj> n() {
      return this.s.values();
   }

   public Collection<UUID> o() {
      return this.s.keySet();
   }

   @Nullable
   public fsj a(UUID $$0) {
      return this.s.get($$0);
   }

   @Nullable
   public fsj a(String $$0) {
      for (fsj $$1 : this.s.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.p;
   }

   public frt q() {
      return this.u;
   }

   public CommandDispatcher<dz> r() {
      return this.A;
   }

   public fry s() {
      return this.q;
   }

   public eyx t() {
      return this.w;
   }

   public UUID u() {
      return this.C;
   }

   public Set<ajg<cwz>> v() {
      return this.D;
   }

   public iz.b w() {
      return this.E;
   }

   public void a(wk $$0, boolean $$1) {
      wg $$2 = $$0.l();
      if ($$2 != null && this.I.a($$2, $$1) && this.I.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.I.a();
      if ($$0 > 0) {
         this.b(new afe($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = avu.c.a();
      wc.a $$3 = this.I.b();
      wg $$4 = this.H.pack(new wn($$0, $$1, $$2, $$3.a()));
      this.b(new afg($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = avu.c.a();
      wc.a $$3 = this.I.b();
      eb $$4 = eb.a(wm.a(this.e($$0)), $$3x -> {
         wn $$4x = new wn($$3x, $$1, $$2, $$3.a());
         return this.H.pack($$4x);
      });
      this.b(new aff($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (wm.a(this.e($$0)).a().isEmpty()) {
         wc.a $$1 = this.I.b();
         this.b(new aff($$0, Instant.now(), 0L, eb.a, $$1.b()));
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
         fsk $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.f();
      if (this.a.aP().f()) {
         this.L.a();
      }

      this.M.a();
      this.e.a();
      if (this.N != null) {
         this.N.a();
      }
   }

   public void a(ciu $$0) {
      if (this.a.b(this.p.getId())) {
         if (this.G == null || !this.G.c().equals($$0)) {
            this.G = wf.a($$0);
            this.H = this.G.a(this.p.getId());
            this.b(new afh(this.G.a().a()));
         }
      }
   }

   @Nullable
   public fsm x() {
      return this.c;
   }

   public clf y() {
      return this.F;
   }

   public boolean a(clf $$0) {
      return $$0.a(this.y());
   }

   public eqv z() {
      return this.R;
   }
}
