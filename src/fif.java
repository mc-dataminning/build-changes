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

public class fif extends fib implements st, wo {
   private static final Logger g = LogUtils.getLogger();
   private static final te h = te.c("multiplayer.unsecureserver.toast.title");
   private static final te i = te.c("multiplayer.unsecureserver.toast");
   private static final te j = te.c("multiplayer.disconnect.invalid_packet");
   private static final te k = te.c("multiplayer.disconnect.chat_validation_failed");
   private static final te l = te.c("connect.reconfiging");
   private static final int m = 64;
   private final GameProfile n;
   private fie o;
   private fie.a p;
   private final Map<UUID, fil> q = Maps.newHashMap();
   private final Set<fil> r = new ReferenceOpenHashSet();
   private final fhz s;
   private final fih t;
   private final eqe u = new eqe(this);
   private int v = 3;
   private int w = 3;
   private final art x = art.b();
   private CommandDispatcher<dv> y = new CommandDispatcher();
   private final cma z = new cma();
   private final UUID A = UUID.randomUUID();
   private Set<aeo<cpk>> B;
   private final ht.b C;
   private final cdt D;
   @Nullable
   private to E;
   private tx.c F = tx.c.a;
   private tl G = new tl(20);
   private tq H = tq.a();
   private volatile long I = ac.b();
   private final fhy J = new fhy(50);

   public fif(eqn $$0, sf $$1, fii $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fhz($$0, this.e);
      this.t = new fih(this, $$0);
   }

   public fih i() {
      return this.t;
   }

   public void j() {
      this.o = null;
      this.e.c();
   }

   public cma k() {
      return this.z;
   }

   @Override
   public void a(ye $$0) {
      uy.a($$0, this, this.a);
      this.y();
      this.a.r = new fik(this.a, this);
      aas $$1 = $$0.k();
      List<aeo<cpk>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      aeo<cpk> $$3 = $$1.b();
      hf<dih> $$4 = this.C.d(jd.au).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fie.a $$7 = new fie.a(bgl.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new fie(this, $$7, $$3, $$4, this.v, this.w, this.a::aG, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.o, new apf(), new eqa());
         this.a.t.r(-180.0F);
         if (this.a.S() != null) {
            this.a.S().a(this.a.t.cv());
         }
      }

      this.a.k.a();
      this.a.t.v();
      int $$8 = $$0.a();
      this.a.t.e($$8);
      this.o.a($$8, (fmf)this.a.t);
      this.a.t.cm = new fmh(this.a.m);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a.a(new exu());
      this.a.t.u($$0.i());
      this.a.t.b($$0.j());
      this.a.t.a($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.m.b($$0.g());
      this.a.m.ar();
      this.E = null;
      this.G = new tl(20);
      this.H = tq.a();
      if (this.b.j()) {
         this.a.v().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aY().a(this.a);
   }

   @Override
   public void a(wp $$0) {
      uy.a($$0, this, this.a);
      bik<?> $$1 = $$0.e();
      big $$2 = $$1.a((cpk)this.o);
      if ($$2 != null) {
         $$2.a($$0);
         int $$3 = $$0.a();
         this.o.a($$3, $$2);
         this.a($$2);
      } else {
         g.warn("Skipping Entity with id {}", $$1);
      }
   }

   private void a(big $$0) {
      if ($$0 instanceof cdc) {
         this.a.ah().a((gbo)(new gbh((cdc)$$0)));
      } else if ($$0 instanceof buj) {
         boolean $$1 = ((buj)$$0).S_();
         gbb $$2;
         if ($$1) {
            $$2 = new gaz((buj)$$0);
         } else {
            $$2 = new gba((buj)$$0);
         }

         this.a.ah().a((gbp)$$2);
      }
   }

   @Override
   public void a(wq $$0) {
      uy.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      big $$4 = new bim(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.a($$0.a(), $$4);
   }

   @Override
   public void a(zs $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(zq $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.al().a($$0.d());
      }
   }

   @Override
   public void a(wr $$0) {
      uy.a($$0, this, this.a);
      fil $$1 = this.a($$0.d());
      if ($$1 == null) {
         g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
      } else {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         float $$5 = (float)($$0.h() * 360) / 256.0F;
         float $$6 = (float)($$0.i() * 360) / 256.0F;
         int $$7 = $$0.a();
         fmj $$8 = new fmj(this.a.s, $$1.a());
         $$8.e($$7);
         $$8.f($$2, $$3, $$4);
         $$8.a($$2, $$3, $$4, $$5, $$6);
         $$8.bn();
         this.o.a($$7, (fmf)$$8);
      }
   }

   @Override
   public void a(aan $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         double $$2 = $$0.d();
         double $$3 = $$0.e();
         double $$4 = $$0.f();
         $$1.f($$2, $$3, $$4);
         if (!$$1.cW()) {
            float $$5 = (float)($$0.g() * 360) / 256.0F;
            float $$6 = (float)($$0.h() * 360) / 256.0F;
            $$1.a($$2, $$3, $$4, $$5, $$6, 3);
            $$1.c($$0.i());
         }
      }
   }

   @Override
   public void a(zl $$0) {
      uy.a($$0, this, this.a);
      if (cbk.d($$0.a())) {
         this.a.t.fQ().l = $$0.a();
      }
   }

   @Override
   public void a(yh $$0) {
      uy.a($$0, this, this.a);
      big $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cW()) {
            if ($$0.i()) {
               acr $$2 = $$1.af();
               ehf $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
               $$2.e($$3);
               float $$4 = $$0.h() ? (float)($$0.f() * 360) / 256.0F : $$1.dA();
               float $$5 = $$0.h() ? (float)($$0.g() * 360) / 256.0F : $$1.dC();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.h()) {
               float $$6 = (float)($$0.f() * 360) / 256.0F;
               float $$7 = (float)($$0.g() * 360) / 256.0F;
               $$1.a($$1.dp(), $$1.dr(), $$1.dv(), $$6, $$7, 3);
            }

            $$1.c($$0.j());
         }
      }
   }

   @Override
   public void a(za $$0) {
      uy.a($$0, this, this.a);
      big $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(yx $$0) {
      uy.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, big.c.b));
   }

   @Override
   public void a(yv $$0) {
      uy.a($$0, this, this.a);
      cbl $$1 = this.a.t;
      ehf $$2 = $$1.dn();
      boolean $$3 = $$0.i().contains(bjk.a);
      boolean $$4 = $$0.i().contains(bjk.b);
      boolean $$5 = $$0.i().contains(bjk.c);
      double $$6;
      double $$7;
      if ($$3) {
         $$6 = $$2.a();
         $$7 = $$1.dp() + $$0.a();
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
         $$11 = $$1.dr() + $$0.d();
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
         $$15 = $$1.dv() + $$0.e();
         $$1.ae = $$1.ae + $$0.e();
         $$1.M = $$1.M + $$0.e();
      } else {
         $$14 = 0.0;
         $$15 = $$0.e();
         $$1.ae = $$15;
         $$1.M = $$15;
      }

      $$1.e($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.f();
      float $$19 = $$0.g();
      if ($$0.i().contains(bjk.e)) {
         $$1.s($$1.dC() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bjk.d)) {
         $$1.r($$1.dA() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new aax($$0.h()));
      this.b.a(new abr.b($$1.dp(), $$1.dr(), $$1.dv(), $$1.dA(), $$1.dC(), false));
   }

   @Override
   public void a(zb $$0) {
      uy.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(xz $$0) {
      uy.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      yd $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dhf $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(xe $$0) {
      uy.a($$0, this, this.a);

      for (xe.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (xe.a $$2 : $$0.a()) {
         this.o.a(new cor($$2.b().e, $$2.b().f));
      }

      for (xe.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.al(); $$6 < this.o.am(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, xy $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dhf $$0, int $$1, int $$2) {
      dzq $$3 = this.o.i().p();
      dhg[] $$4 = $$0.d();
      cor $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dhg $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(hy.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(xt $$0) {
      uy.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(xt $$0) {
      cor $$1 = $$0.a();
      this.o.a(() -> {
         dzq $$1x = this.o.s_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            hy $$3 = hy.a($$1, $$2);
            $$1x.a(cpt.b, $$3, null);
            $$1x.a(cpt.a, $$3, null);
         }

         for (int $$4 = this.o.al(); $$4 < this.o.am(); $$4++) {
            $$1x.a(hy.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(wy $$0) {
      uy.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(aah $$0) {
      this.b.a();
      uy.a($$0, this, this.a);
      this.a.c(new fau(l, this.b));
      this.b.a(new fic(this.a, this.b, new fii(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new abi());
   }

   @Override
   public void a(aam $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      biw $$2 = (biw)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof bim) {
            this.o.a($$1.dp(), $$1.dr(), $$1.dv(), aou.hA, aov.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dp(), $$1.dr(), $$1.dv(), aou.ma, aov.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new fkq(this.a.an(), this.a.aN(), this.o, $$1, $$2));
         if ($$1 instanceof bye $$3) {
            ciw $$4 = $$3.j();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), big.c.b);
            }
         } else if (!($$1 instanceof bim)) {
            this.o.a($$0.a(), big.c.b);
         }
      }
   }

   @Override
   public void a(aaj $$0) {
      uy.a($$0, this, this.a);
      this.a.aV().a($$0.a(), $$0.d());
   }

   @Override
   public void a(yo $$0) {
      uy.a($$0, this, this.a);
      Optional<tw> $$1 = $$0.f().a(this.H);
      Optional<ta.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         fil $$4 = this.a($$3);
         if ($$4 == null) {
            this.b.a(k);
         } else {
            tu $$5 = $$4.b();
            ty $$6;
            if ($$5 != null) {
               $$6 = new ty($$0.d(), $$3, $$5.d());
            } else {
               $$6 = ty.a($$3);
            }

            tt $$8 = new tt($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
            if (!$$4.c().updateAndValidate($$8)) {
               this.b.a(k);
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
   public void a(xq $$0) {
      uy.a($$0, this, this.a);
      Optional<ta.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aV().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(xp $$0) {
      uy.a($$0, this, this.a);
      Optional<tp> $$1 = $$0.a().a(this.H);
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
   public void a(ws $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            biw $$2 = (biw)$$1;
            $$2.a(bgn.a);
         } else if ($$0.d() == 3) {
            biw $$3 = (biw)$$1;
            $$3.a(bgn.b);
         } else if ($$0.d() == 2) {
            cbl $$4 = (cbl)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, iw.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, iw.s);
         }
      }
   }

   @Override
   public void a(xw $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(aac $$0) {
      uy.a($$0, this, this.a);
      this.a.s.b($$0.a());
      this.a.s.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(zo $$0) {
      uy.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d());
      if (this.a.z instanceof exu $$1) {
         $$1.l();
      }
   }

   @Override
   public void a(zx $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.t);
         $$1.bA();

         for (int $$3 : $$0.a()) {
            big $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t && !$$2) {
                  if ($$1 instanceof cde) {
                     this.a.t.N = $$1.dA();
                     this.a.t.r($$1.dA());
                     this.a.t.n($$1.dA());
                  }

                  te $$5 = te.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aU().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(zr $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 instanceof biy) {
         ((biy)$$1).r($$0.d());
      }
   }

   private static ciw a(cbl $$0) {
      for (bgn $$1 : bgn.values()) {
         ciw $$2 = $$0.b($$1);
         if ($$2.a(ciz.uz)) {
            return $$2;
         }
      }

      return new ciw(ciz.uz);
   }

   @Override
   public void a(xr $$0) {
      uy.a($$0, this, this.a);
      big $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ah().a((gbo)(new gbg((byv)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, iw.ae, 30);
               this.o.a($$1.dp(), $$1.dr(), $$1.dv(), aou.xH, $$1.da(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cbl)this.a.t));
               }
               break;
            case 63:
               this.a.ah().a((gbo)(new gbk((bwu)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(xo $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(zv $$0) {
      uy.a($$0, this, this.a);
      this.a.t.D($$0.a());
      this.a.t.ga().a($$0.d());
      this.a.t.ga().b($$0.e());
   }

   @Override
   public void a(zu $$0) {
      uy.a($$0, this, this.a);
      this.a.t.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(yz $$0) {
      uy.a($$0, this, this.a);
      aas $$1 = $$0.a();
      aeo<cpk> $$2 = $$1.b();
      hf<dih> $$3 = this.C.d(jd.au).f($$1.a());
      fmi $$4 = this.a.t;
      int $$5 = $$4.ah();
      if ($$2 != $$4.dK().ac()) {
         eie $$6 = this.o.I();
         Map<String, ebl> $$7 = this.o.l();
         boolean $$8 = $$1.f();
         boolean $$9 = $$1.g();
         fie.a $$10 = new fie.a(this.p.s(), this.p.n(), $$9);
         this.p = $$10;
         this.o = new fie(this, $$10, $$2, $$3, this.v, this.w, this.a::aG, this.a.f, $$8, $$1.c());
         this.o.a($$6);
         this.o.a($$7);
         this.a.a(this.o);
         this.a.a(new exu());
      }

      this.a.u = null;
      if ($$4.fS()) {
         $$4.q();
      }

      fmi $$11;
      if ($$0.a((byte)2)) {
         $$11 = this.a.r.a(this.o, $$4.j(), $$4.m(), $$4.bR(), $$4.bX());
      } else {
         $$11 = this.a.r.a(this.o, $$4.j(), $$4.m());
      }

      $$11.e($$5);
      this.a.t = $$11;
      if ($$2 != $$4.dK().ac()) {
         this.a.r().b();
      }

      this.a.u = $$11;
      if ($$0.a((byte)2)) {
         List<aea.b<?>> $$13 = $$4.al().c();
         if ($$13 != null) {
            $$11.al().a($$13);
         }
      }

      if ($$0.a((byte)1)) {
         $$11.eP().a($$4.eP());
      }

      $$11.v();
      this.o.a($$5, (fmf)$$11);
      $$11.r(-180.0F);
      $$11.cm = new fmh(this.a.m);
      this.a.r.a($$11);
      $$11.u($$4.gg());
      $$11.b($$4.o());
      $$11.a($$1.h());
      $$11.f($$1.i());
      $$11.ct = $$4.ct;
      $$11.cu = $$4.cu;
      if (this.a.z instanceof ewu || this.a.z instanceof ewu.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   @Override
   public void a(xs $$0) {
      uy.a($$0, this, this.a);
      cpc $$1 = new cpc(this.a.s, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j());
      $$1.a(true);
      this.a.t.f(this.a.t.dn().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(xv $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.e());
      if ($$1 instanceof bwh) {
         fmi $$2 = this.a.t;
         bwh $$3 = (bwh)$$1;
         bgv $$4 = new bgv($$0.d());
         cfa $$5 = new cfa($$0.a(), $$2.fQ(), $$4, $$3);
         $$2.bQ = $$5;
         this.a.a(new ezr($$5, $$2.fQ(), $$3));
      }
   }

   @Override
   public void a(yk $$0) {
      uy.a($$0, this, this.a);
      exi.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(xl $$0) {
      uy.a($$0, this, this.a);
      cbl $$1 = this.a.t;
      ciw $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.az().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.z instanceof ezh)) {
            $$1.bQ.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fQ().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.z instanceof ezh $$5) {
            $$4 = !$$5.D();
         }

         if ($$0.a() == 0 && cfb.f($$3)) {
            if (!$$2.b()) {
               ciw $$6 = $$1.bP.b($$3).e();
               if ($$6.b() || $$6.L() < $$2.L()) {
                  $$2.e(5);
               }
            }

            $$1.bP.a($$3, $$0.f(), $$2);
         } else if ($$0.a() == $$1.bQ.j && ($$0.a() != 0 || !$$4)) {
            $$1.bQ.a($$3, $$0.f(), $$2);
         }
      }
   }

   @Override
   public void a(xj $$0) {
      uy.a($$0, this, this.a);
      cbl $$1 = this.a.t;
      if ($$0.a() == 0) {
         $$1.bP.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bQ.j) {
         $$1.bQ.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(yl $$0) {
      uy.a($$0, this, this.a);
      gv $$1 = $$0.a();
      if (this.o.c_($$1) instanceof dds $$2) {
         this.a.t.a($$2, $$0.d());
      } else {
         dey $$3 = this.o.a_($$1);
         dds $$4 = new dds($$1, $$3);
         $$4.a(this.o);
         this.a.t.a($$4, $$0.d());
      }
   }

   @Override
   public void a(ww $$0) {
      uy.a($$0, this, this.a);
      gv $$1 = $$0.a();
      this.a.s.a($$1, $$0.d()).ifPresent($$1x -> {
         qs $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof dcu && this.a.z instanceof ezd) {
            ((ezd)this.a.z).D();
         }
      });
   }

   @Override
   public void a(xk $$0) {
      uy.a($$0, this, this.a);
      cbl $$1 = this.a.t;
      if ($$1.bQ != null && $$1.bQ.j == $$0.a()) {
         $$1.bQ.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(zt $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((bil)$$1x.getFirst(), (ciw)$$1x.getSecond()));
      }
   }

   @Override
   public void a(xi $$0) {
      uy.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(wx $$0) {
      uy.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(wv $$0) {
      uy.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(xu $$0) {
      uy.a($$0, this, this.a);
      cbl $$1 = this.a.t;
      xu.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = aro.d($$3 + 0.5F);
      if ($$2 == xu.a) {
         $$1.a(te.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == xu.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == xu.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == xu.d) {
         this.a.r.a(cph.a($$4));
      } else if ($$2 == xu.e) {
         if ($$4 == 0) {
            this.a.t.cl.b(new abf(abf.a.a));
            this.a.a(new exu());
         } else if ($$4 == 1) {
            this.a.a(new eyc(true, () -> {
               this.a.t.cl.b(new abf(abf.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == xu.f) {
         eqr $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new ewv());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(te.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(te.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(te.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(te.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == xu.g) {
         this.o.a($$1, $$1.dp(), $$1.dt(), $$1.dv(), aou.aq, aov.h, 0.18F, 0.45F);
      } else if ($$2 == xu.h) {
         this.o.e($$3);
      } else if ($$2 == xu.i) {
         this.o.c($$3);
      } else if ($$2 == xu.j) {
         this.o.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aou.ti, aov.g, 1.0F, 1.0F);
      } else if ($$2 == xu.k) {
         this.o.a(iw.r, $$1.dp(), $$1.dr(), $$1.dv(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aou.gJ, aov.f, 1.0F, 1.0F);
         }
      } else if ($$2 == xu.l) {
         this.a.t.b($$3 == 0.0F);
      }
   }

   @Override
   public void a(yf $$0) {
      uy.a($$0, this, this.a);
      erz $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cjd.a($$2);
      ebl $$4 = this.a.s.a($$3);
      if ($$4 == null) {
         $$4 = ebl.a($$0.d(), $$0.e(), this.a.s.ac());
         this.a.s.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(ya $$0) {
      uy.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.s.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.s.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(aao $$0) {
      uy.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(zc $$0) {
      uy.a($$0, this, this.a);
      aep $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         ae $$2 = this.s.a().a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(xh $$0) {
      uy.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dm.a((hh.b)this.C, this.D)));
   }

   @Override
   public void a(aai $$0) {
      uy.a($$0, this, this.a);
      this.a.ah().a($$0.a(), $$0.d());
   }

   @Override
   public void a(xg $$0) {
      uy.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(aar $$0) {
      uy.a($$0, this, this.a);
      this.z.a($$0.a());
      eqa $$1 = this.a.t.m();
      $$1.a(this.z.b(), this.a.s.B_());
      this.a.a(gca.c, $$1.b());
   }

   @Override
   public void a(yu $$0) {
      uy.a($$0, this, this.a);
      ehf $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.t.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(aal $$0) {
      uy.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(wt $$0) {
      uy.a($$0, this, this.a);

      for (Entry<apb<?>, Integer> $$1 : $$0.a().entrySet()) {
         apb<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.t.j().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof eye) {
         ((eye)this.a.z).C();
      }
   }

   @Override
   public void a(yw $$0) {
      uy.a($$0, this, this.a);
      eqa $$1 = this.a.t.m();
      $$1.a($$0.e());
      yw.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (aep $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (aep $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (aep $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (aep $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.i()) {
                     euh.a(this.a.ay(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.z instanceof fbn) {
         ((fbn)this.a.z).D();
      }
   }

   @Override
   public void a(aaq $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 instanceof biw) {
         bhr $$2 = $$0.d();
         if ($$2 != null) {
            bht $$3 = new bht($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((biw)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(vf $$0) {
      super.a($$0);
      this.y();
   }

   private void y() {
      if (!this.b.g()) {
         csl.a();
      }

      chd.e().n();
   }

   @Override
   public void a(yp $$0) {
   }

   @Override
   public void a(yq $$0) {
   }

   @Override
   public void a(yr $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 == this.a.t) {
         if (this.a.t.o()) {
            this.a.a(new ewu($$0.d(), this.o.k().n()));
         } else {
            this.a.t.fO();
         }
      }
   }

   @Override
   public void a(xb $$0) {
      uy.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(zk $$0) {
      uy.a($$0, this, this.a);
      big $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(xx $$0) {
      uy.a($$0, this, this.a);
      dgp $$1 = this.o.w_();
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
   public void a(zf $$0) {
      uy.a($$0, this, this.a);
      this.o.w_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(zg $$0) {
      uy.a($$0, this, this.a);
      this.o.w_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zh $$0) {
      uy.a($$0, this, this.a);
      this.o.w_().a($$0.a());
   }

   @Override
   public void a(zj $$0) {
      uy.a($$0, this, this.a);
      this.o.w_().c($$0.a());
   }

   @Override
   public void a(zi $$0) {
      uy.a($$0, this, this.a);
      this.o.w_().b($$0.a());
   }

   @Override
   public void a(xf $$0) {
      uy.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(zd $$0) {
      uy.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().ifPresent(this.c::a);
         this.c.a($$0.e());
         fio.b(this.c);
         if (!$$0.e()) {
            eui $$1 = eui.a(this.a, eui.a.h, h, i);
            this.a.ay().a($$1);
         }
      }
   }

   @Override
   public void a(xn $$0) {
      uy.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(ze $$0) {
      uy.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(aad $$0) {
      uy.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(aab $$0) {
      uy.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(aae $$0) {
      uy.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aak $$0) {
      uy.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(yy $$0) {
      uy.a($$0, this, this.a);
      big $$1 = $$0.a(this.o);
      if ($$1 instanceof biw) {
         ((biw)$$1).c($$0.a());
      }
   }

   @Override
   public void a(ys $$0) {
      uy.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aK().f($$1);
         fil $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(yt $$0) {
      uy.a($$0, this, this.a);

      for (yt.b $$1 : $$0.e()) {
         fil $$2 = new fil(Objects.requireNonNull($$1.b()), this.z());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aK().a($$2);
         }
      }

      for (yt.b $$3 : $$0.d()) {
         fil $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (yt.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(yt.a $$0, yt.b $$1, fil $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cv().equals($$1.a())) {
               this.a.t.a($$1.e());
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

   private void a(yt.b $$0, fil $$1) {
      GameProfile $$2 = $$1.a();
      arx $$3 = this.a.aS();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.z());
      } else {
         tu.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               tu $$5 = $$4.a($$2, $$3, cbo.b);
               $$1.a($$5);
            } catch (cbo.b var7) {
               g.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.z());
            }
         } else {
            $$1.a(this.z());
         }
      }
   }

   private boolean z() {
      return this.c != null && this.c.f();
   }

   @Override
   public void a(yn $$0) {
      uy.a($$0, this, this.a);
      cbl $$1 = this.a.t;
      $$1.fR().b = $$0.d();
      $$1.fR().d = $$0.f();
      $$1.fR().a = $$0.a();
      $$1.fR().c = $$0.e();
      $$1.fR().a($$0.g());
      $$1.fR().b($$0.h());
   }

   @Override
   public void a(aag $$0) {
      uy.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(aaf $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(wz $$0) {
      uy.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(xm $$0) {
      uy.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.t.gl().b($$0.a());
      } else {
         this.a.t.gl().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(yi $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.a.t.cV();
      if ($$1 != this.a.t && $$1.cW()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new abs($$1));
      }
   }

   @Override
   public void a(yj $$0) {
      uy.a($$0, this, this.a);
      ciw $$1 = this.a.t.b($$0.a());
      if ($$1.a(ciz.th)) {
         this.a.a(new eza(new eza.c($$1)));
      }
   }

   @Override
   public void a(vo $$0) {
      if ($$0 instanceof vx $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof vw $$2) {
         ((fqw)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof wc $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof we $$4) {
         ((fre)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof wa $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof vy $$6) {
         fql.a $$7 = new fql.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof vz $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof wd $$9) {
         frc $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof vu $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof vm $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof vl $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof vv $$14) {
         this.a.k.o.a($$14.b(), this.o.V());
      } else if ($$0 instanceof vs $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof vt) {
         this.a.k.r.a();
      } else if ($$0 instanceof wb $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof vq $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof vr $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else {
         this.b($$0);
      }
   }

   private void b(vo $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(zw $$0) {
      uy.a($$0, this, this.a);
      eie $$1 = this.o.I();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, eih.a, $$0.d(), $$0.f());
      } else {
         eib $$3 = $$1.b($$2);
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
   public void a(zz $$0) {
      uy.a($$0, this, this.a);
      eie $$1 = this.o.I();
      String $$2 = $$0.d();
      switch ($$0.f()) {
         case a:
            eib $$3 = $$1.b($$2);
            if ($$3 != null) {
               eid $$4 = $$1.c($$0.a(), $$3);
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
   public void a(zp $$0) {
      uy.a($$0, this, this.a);
      eie $$1 = this.o.I();
      String $$2 = $$0.d();
      eib $$3 = $$2 == null ? null : $$1.b($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(zy $$0) {
      uy.a($$0, this, this.a);
      eie $$1 = this.o.I();
      zy.a $$2 = $$0.d();
      eic $$3;
      if ($$2 == zy.a.a) {
         $$3 = $$1.e($$0.e());
      } else {
         $$3 = $$1.d($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<zy.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         eig.b $$2x = eig.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         eig.a $$3x = eig.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      zy.a $$6 = $$0.a();
      if ($$6 == zy.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == zy.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == zy.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(yb $$0) {
      uy.a($$0, this, this.a);
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
   public void a(aap $$0) {
      uy.a($$0, this, this.a);
      big $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof biw)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bka $$2 = ((biw)$$1).eP();

            for (aap.a $$3 : $$0.d()) {
               bjz $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, jc.v.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bkb $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(ym $$0) {
      uy.a($$0, this, this.a);
      cec $$1 = this.a.t.bQ;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.z instanceof fbn) {
               fbh $$2 = ((fbn)this.a.z).E();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(yc $$0) {
      uy.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      yd $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, yd $$2) {
      dzq $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cpt.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cpt.b, $$7, $$8, $$9);
      $$3.a(new cor($$0, $$1), true);
   }

   @Override
   public void a(yg $$0) {
      uy.a($$0, this, this.a);
      cec $$1 = this.a.t.bQ;
      if ($$0.a() == $$1.j && $$1 instanceof cfj $$2) {
         $$2.a(new coi($$0.d().a()));
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(zn $$0) {
      uy.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(aaa $$0) {
      uy.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(zm $$0) {
      uy.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(wu $$0) {
      uy.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(xa $$0) {
      uy.a($$0, this, this.a);

      for (uw<wo> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(xd $$0) {
      this.I = ac.b();
   }

   @Override
   public void a(xc $$0) {
      long $$1 = ac.b() - this.I;
      int $$2 = $$0.a();
      if ($$2 > 0) {
         this.J.a($$2, $$1);
      }

      double $$3 = Math.max(0.0, this.J.a());
      float $$4 = (float)(25.0 / $$3);
      this.b(new abe($$4));
   }

   private void a(int $$0, int $$1, dzq $$2, cpt $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, hy.a($$0, $$8, $$1), $$9 ? new dha((byte[])$$6.next().clone()) : new dha());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public sf l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k();
   }

   public Collection<fil> m() {
      return this.r;
   }

   public Collection<fil> n() {
      return this.q.values();
   }

   public Collection<UUID> o() {
      return this.q.keySet();
   }

   @Nullable
   public fil a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public fil a(String $$0) {
      for (fil $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.n;
   }

   public fhz q() {
      return this.s;
   }

   public CommandDispatcher<dv> r() {
      return this.y;
   }

   public fie s() {
      return this.o;
   }

   public eqe t() {
      return this.u;
   }

   public UUID u() {
      return this.A;
   }

   public Set<aeo<cpk>> v() {
      return this.B;
   }

   @Override
   public ht.b f() {
      return this.C;
   }

   public void a(tt $$0, boolean $$1) {
      tp $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.A();
      }
   }

   private void A() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new aba($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqn.c.a();
      tl.a $$3 = this.G.b();
      tp $$4 = this.F.pack(new tw($$0, $$1, $$2, $$3.a()));
      this.b(new abc($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqn.c.a();
      tl.a $$3 = this.G.b();
      dx $$4 = dx.a(tv.a(this.e($$0)), $$3x -> {
         tw $$4x = new tw($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new abb($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (tv.a(this.e($$0)).a().isEmpty()) {
         tl.a $$1 = this.G.b();
         this.b(new abb($$0, Instant.now(), 0L, dx.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<dv> e(String $$0) {
      return this.y.parse($$0, this.t);
   }

   @Override
   public void e() {
      if (this.b.j()) {
         fim $$0 = this.a.v();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.g();
      this.e.a();
   }

   public void a(cbn $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = to.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new abd(this.E.a().b()));
         }
      }
   }

   @Nullable
   public fin w() {
      return this.c;
   }

   public cdt x() {
      return this.D;
   }

   public boolean a(cdt $$0) {
      return $$0.a(this.x());
   }
}
