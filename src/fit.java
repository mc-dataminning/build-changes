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

public class fit extends fip implements sx, ws {
   private static final Logger g = LogUtils.getLogger();
   private static final ti h = ti.c("multiplayer.unsecureserver.toast.title");
   private static final ti i = ti.c("multiplayer.unsecureserver.toast");
   private static final ti j = ti.c("multiplayer.disconnect.invalid_packet");
   private static final ti k = ti.c("multiplayer.disconnect.chat_validation_failed");
   private static final ti l = ti.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private fis o;
   private fis.a p;
   private final Map<UUID, fja> q = Maps.newHashMap();
   private final Set<fja> r = new ReferenceOpenHashSet();
   private final fin s;
   private final fiv t;
   private final eqh u = new eqh(this);
   private int v = 3;
   private int w = 3;
   private final arx x = arx.b();
   private CommandDispatcher<dw> y = new CommandDispatcher();
   private final cmg z = new cmg();
   private final UUID A = UUID.randomUUID();
   private Set<aet<cpq>> B;
   private final hu.b C;
   private final cdx D;
   @Nullable
   private ts E;
   private ub.c F = ub.c.a;
   private tp G = new tp(20);
   private tu H = tu.a();
   private final fim I = new fim();
   private final fiz J;
   private boolean K = false;

   public fit(eqq $$0, sj $$1, fiw $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fin($$0, this.e);
      this.t = new fiv(this, $$0);
      this.J = new fiz(this, $$0.aN().k());
   }

   public fiv i() {
      return this.t;
   }

   public void j() {
      this.o = null;
      this.e.c();
   }

   public cmg k() {
      return this.z;
   }

   @Override
   public void a(yi $$0) {
      vc.a($$0, this, this.a);
      this.y();
      this.a.q = new fiy(this.a, this);
      aaw $$1 = $$0.k();
      List<aet<cpq>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      aet<cpq> $$3 = $$1.b();
      hg<din> $$4 = this.C.d(je.au).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fis.a $$7 = new fis.a(bgq.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new fis(this, $$7, $$3, $$4, this.v, this.w, this.a::aG, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new apk(), new eqd());
         this.a.s.r(-180.0F);
         if (this.a.T() != null) {
            this.a.T().a(this.a.s.cv());
         }
      }

      this.a.k.a();
      this.a.s.v();
      int $$8 = $$0.a();
      this.a.s.e($$8);
      this.o.a($$8, (fmy)this.a.s);
      this.a.s.cm = new fna(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a.a(new eye());
      this.a.s.u($$0.i());
      this.a.s.b($$0.j());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.g());
      this.a.m.as();
      this.E = null;
      this.G = new tp(20);
      this.H = tu.a();
      if (this.b.j()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aZ().a(this.a);
   }

   @Override
   public void a(wt $$0) {
      vc.a($$0, this, this.a);
      bip<?> $$1 = $$0.e();
      bil $$2 = $$1.a((cpq)this.o);
      if ($$2 != null) {
         $$2.a($$0);
         int $$3 = $$0.a();
         this.o.a($$3, $$2);
         this.a($$2);
      } else {
         g.warn("Skipping Entity with id {}", $$1);
      }
   }

   private void a(bil $$0) {
      if ($$0 instanceof cdg) {
         this.a.ai().a((gch)(new gca((cdg)$$0)));
      } else if ($$0 instanceof bun) {
         boolean $$1 = ((bun)$$0).S_();
         gbu $$2;
         if ($$1) {
            $$2 = new gbs((bun)$$0);
         } else {
            $$2 = new gbt((bun)$$0);
         }

         this.a.ai().a((gci)$$2);
      }
   }

   @Override
   public void a(wu $$0) {
      vc.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      bil $$4 = new bir(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.a($$0.a(), $$4);
   }

   @Override
   public void a(zw $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(zu $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.al().a($$0.d());
      }
   }

   @Override
   public void a(wv $$0) {
      vc.a($$0, this, this.a);
      fja $$1 = this.a($$0.d());
      if ($$1 == null) {
         g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
      } else {
         double $$2 = $$0.e();
         double $$3 = $$0.f();
         double $$4 = $$0.g();
         float $$5 = (float)($$0.h() * 360) / 256.0F;
         float $$6 = (float)($$0.i() * 360) / 256.0F;
         int $$7 = $$0.a();
         fnc $$8 = new fnc(this.a.r, $$1.a());
         $$8.e($$7);
         $$8.f($$2, $$3, $$4);
         $$8.a($$2, $$3, $$4, $$5, $$6);
         $$8.bn();
         this.o.a($$7, (fmy)$$8);
      }
   }

   @Override
   public void a(aar $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
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
   public void a(zp $$0) {
      vc.a($$0, this, this.a);
      if (cbo.d($$0.a())) {
         this.a.s.fQ().l = $$0.a();
      }
   }

   @Override
   public void a(yl $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cW()) {
            if ($$0.i()) {
               acw $$2 = $$1.af();
               ehi $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
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
   public void a(ze $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(zb $$0) {
      vc.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, bil.c.b));
   }

   @Override
   public void a(yz $$0) {
      vc.a($$0, this, this.a);
      cbp $$1 = this.a.s;
      ehi $$2 = $$1.dn();
      boolean $$3 = $$0.i().contains(bjp.a);
      boolean $$4 = $$0.i().contains(bjp.b);
      boolean $$5 = $$0.i().contains(bjp.c);
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
      if ($$0.i().contains(bjp.e)) {
         $$1.s($$1.dC() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bjp.d)) {
         $$1.r($$1.dA() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new abc($$0.h()));
      this.b.a(new abw.b($$1.dp(), $$1.dr(), $$1.dv(), $$1.dA(), $$1.dC(), false));
   }

   @Override
   public void a(zf $$0) {
      vc.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(yd $$0) {
      vc.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      yh $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dhl $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(xi $$0) {
      vc.a($$0, this, this.a);

      for (xi.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (xi.a $$2 : $$0.a()) {
         this.o.a(new cox($$2.b().e, $$2.b().f));
      }

      for (xi.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.al(); $$6 < this.o.am(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, yc $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dhl $$0, int $$1, int $$2) {
      dzw $$3 = this.o.i().p();
      dhm[] $$4 = $$0.d();
      cox $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dhm $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(hz.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(xx $$0) {
      vc.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(xx $$0) {
      cox $$1 = $$0.a();
      this.o.a(() -> {
         dzw $$1x = this.o.s_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            hz $$3 = hz.a($$1, $$2);
            $$1x.a(cpz.b, $$3, null);
            $$1x.a(cpz.a, $$3, null);
         }

         for (int $$4 = this.o.al(); $$4 < this.o.am(); $$4++) {
            $$1x.a(hz.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(xc $$0) {
      vc.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(aal $$0) {
      this.b.a();
      vc.a($$0, this, this.a);
      this.a.c(new fbe(l, this.b));
      this.b.a(new fiq(this.a, this.b, new fiw(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new abn());
   }

   @Override
   public void a(aaq $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      bjb $$2 = (bjb)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bir) {
            this.o.a($$1.dp(), $$1.dr(), $$1.dv(), aoz.hA, apa.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dp(), $$1.dr(), $$1.dv(), aoz.ma, apa.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new flj(this.a.ao(), this.a.aO(), this.o, $$1, $$2));
         if ($$1 instanceof byi $$3) {
            cja $$4 = $$3.j();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), bil.c.b);
            }
         } else if (!($$1 instanceof bir)) {
            this.o.a($$0.a(), bil.c.b);
         }
      }
   }

   @Override
   public void a(aan $$0) {
      vc.a($$0, this, this.a);
      this.a.aW().a($$0.a(), $$0.d());
   }

   @Override
   public void a(ys $$0) {
      vc.a($$0, this, this.a);
      Optional<ua> $$1 = $$0.f().a(this.H);
      Optional<te.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         fja $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.b.a(k);
         } else {
            ty $$5 = $$4.b();
            uc $$6;
            if ($$5 != null) {
               $$6 = new uc($$0.d(), $$3, $$5.c());
            } else {
               $$6 = uc.a($$3);
            }

            tx $$8 = new tx($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
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
   public void a(xu $$0) {
      vc.a($$0, this, this.a);
      Optional<te.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aW().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(xt $$0) {
      vc.a($$0, this, this.a);
      Optional<tt> $$1 = $$0.a().a(this.H);
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
   public void a(ww $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bjb $$2 = (bjb)$$1;
            $$2.a(bgs.a);
         } else if ($$0.d() == 3) {
            bjb $$3 = (bjb)$$1;
            $$3.a(bgs.b);
         } else if ($$0.d() == 2) {
            cbp $$4 = (cbp)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, ix.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, ix.s);
         }
      }
   }

   @Override
   public void a(ya $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(aag $$0) {
      vc.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(zs $$0) {
      vc.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
      if (this.a.y instanceof eye $$1) {
         $$1.l();
      }
   }

   @Override
   public void a(aab $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bA();

         for (int $$3 : $$0.a()) {
            bil $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cdi) {
                     this.a.s.N = $$1.dA();
                     this.a.s.r($$1.dA());
                     this.a.s.n($$1.dA());
                  }

                  ti $$5 = ti.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aV().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(zv $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 instanceof bjd) {
         ((bjd)$$1).r($$0.d());
      }
   }

   private static cja a(cbp $$0) {
      for (bgs $$1 : bgs.values()) {
         cja $$2 = $$0.b($$1);
         if ($$2.a(cjd.uz)) {
            return $$2;
         }
      }

      return new cja(cjd.uz);
   }

   @Override
   public void a(xv $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ai().a((gch)(new gbz((byz)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ix.ae, 30);
               this.o.a($$1.dp(), $$1.dr(), $$1.dv(), aoz.xM, $$1.da(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cbp)this.a.s));
               }
               break;
            case 63:
               this.a.ai().a((gch)(new gcd((bwy)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(xs $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(zz $$0) {
      vc.a($$0, this, this.a);
      this.a.s.D($$0.a());
      this.a.s.ga().a($$0.d());
      this.a.s.ga().b($$0.e());
   }

   @Override
   public void a(zy $$0) {
      vc.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zd $$0) {
      vc.a($$0, this, this.a);
      aaw $$1 = $$0.a();
      aet<cpq> $$2 = $$1.b();
      hg<din> $$3 = this.C.d(je.au).f($$1.a());
      fnb $$4 = this.a.s;
      int $$5 = $$4.ah();
      if ($$2 != $$4.dK().ac()) {
         eih $$6 = this.o.I();
         Map<String, ebr> $$7 = this.o.l();
         boolean $$8 = $$1.f();
         boolean $$9 = $$1.g();
         fis.a $$10 = new fis.a(this.p.s(), this.p.n(), $$9);
         this.p = $$10;
         this.o = new fis(this, $$10, $$2, $$3, this.v, this.w, this.a::aG, this.a.f, $$8, $$1.c());
         this.o.a($$6);
         this.o.a($$7);
         this.a.a(this.o);
         this.a.a(new eye());
      }

      this.a.t = null;
      if ($$4.fS()) {
         $$4.q();
      }

      fnb $$11;
      if ($$0.a((byte)2)) {
         $$11 = this.a.q.a(this.o, $$4.j(), $$4.m(), $$4.bR(), $$4.bX());
      } else {
         $$11 = this.a.q.a(this.o, $$4.j(), $$4.m());
      }

      $$11.e($$5);
      this.a.s = $$11;
      if ($$2 != $$4.dK().ac()) {
         this.a.s().b();
      }

      this.a.t = $$11;
      if ($$0.a((byte)2)) {
         List<aef.b<?>> $$13 = $$4.al().c();
         if ($$13 != null) {
            $$11.al().a($$13);
         }
      }

      if ($$0.a((byte)1)) {
         $$11.eP().a($$4.eP());
      }

      $$11.v();
      this.o.a($$5, (fmy)$$11);
      $$11.r(-180.0F);
      $$11.cm = new fna(this.a.m);
      this.a.q.a($$11);
      $$11.u($$4.gg());
      $$11.b($$4.o());
      $$11.a($$1.h());
      $$11.f($$1.i());
      $$11.ct = $$4.ct;
      $$11.cu = $$4.cu;
      if (this.a.y instanceof exe || this.a.y instanceof exe.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(xw $$0) {
      vc.a($$0, this, this.a);
      cpi $$1 = new cpi(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j());
      $$1.a(true);
      this.a.s.f(this.a.s.dn().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(xz $$0) {
      vc.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof bwl $$2) {
         fnb $$3 = this.a.s;
         bha $$4 = new bha($$0.d());
         cfe $$5 = new cfe($$0.a(), $$3.fQ(), $$4, $$2);
         $$3.bQ = $$5;
         this.a.a(new fab($$5, $$3.fQ(), $$2));
      }
   }

   @Override
   public void a(yo $$0) {
      vc.a($$0, this, this.a);
      exs.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(xp $$0) {
      vc.a($$0, this, this.a);
      cbp $$1 = this.a.s;
      cja $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.az().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof ezr)) {
            $$1.bQ.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fQ().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof ezr $$5) {
            $$4 = !$$5.E();
         }

         if ($$0.a() == 0 && cff.f($$3)) {
            if (!$$2.b()) {
               cja $$6 = $$1.bP.b($$3).e();
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
   public void a(xn $$0) {
      vc.a($$0, this, this.a);
      cbp $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bP.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bQ.j) {
         $$1.bQ.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(yp $$0) {
      vc.a($$0, this, this.a);
      gw $$1 = $$0.a();
      if (this.o.c_($$1) instanceof ddy $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         dfe $$3 = this.o.a_($$1);
         ddy $$4 = new ddy($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(xa $$0) {
      vc.a($$0, this, this.a);
      gw $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         qu $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof dda && this.a.y instanceof ezn) {
            ((ezn)this.a.y).E();
         }
      });
   }

   @Override
   public void a(xo $$0) {
      vc.a($$0, this, this.a);
      cbp $$1 = this.a.s;
      if ($$1.bQ != null && $$1.bQ.j == $$0.a()) {
         $$1.bQ.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(zx $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((biq)$$1x.getFirst(), (cja)$$1x.getSecond()));
      }
   }

   @Override
   public void a(xm $$0) {
      vc.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(xb $$0) {
      vc.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(wz $$0) {
      vc.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(xy $$0) {
      vc.a($$0, this, this.a);
      cbp $$1 = this.a.s;
      xy.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = ars.d($$3 + 0.5F);
      if ($$2 == xy.a) {
         $$1.a(ti.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == xy.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == xy.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == xy.d) {
         this.a.q.a(cpn.a($$4));
      } else if ($$2 == xy.e) {
         if ($$4 == 0) {
            this.a.s.cl.b(new abk(abk.a.a));
            this.a.a(new eye());
         } else if ($$4 == 1) {
            this.a.a(new eym(true, () -> {
               this.a.s.cl.b(new abk(abk.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == xy.f) {
         equ $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new exf());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(ti.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(ti.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(ti.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(ti.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == xy.g) {
         this.o.a($$1, $$1.dp(), $$1.dt(), $$1.dv(), aoz.aq, apa.h, 0.18F, 0.45F);
      } else if ($$2 == xy.h) {
         this.o.e($$3);
      } else if ($$2 == xy.i) {
         this.o.c($$3);
      } else if ($$2 == xy.j) {
         this.o.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aoz.ti, apa.g, 1.0F, 1.0F);
      } else if ($$2 == xy.k) {
         this.o.a(ix.r, $$1.dp(), $$1.dr(), $$1.dv(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aoz.gJ, apa.f, 1.0F, 1.0F);
         }
      } else if ($$2 == xy.l) {
         this.a.s.b($$3 == 0.0F);
      }
   }

   @Override
   public void a(yj $$0) {
      vc.a($$0, this, this.a);
      esc $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cjh.a($$2);
      ebr $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = ebr.a($$0.d(), $$0.e(), this.a.r.ac());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(ye $$0) {
      vc.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(aas $$0) {
      vc.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(zg $$0) {
      vc.a($$0, this, this.a);
      aeu $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(xl $$0) {
      vc.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dn.a((hi.b)this.C, this.D)));
   }

   @Override
   public void a(aam $$0) {
      vc.a($$0, this, this.a);
      this.a.ai().a($$0.a(), $$0.d());
   }

   @Override
   public void a(xk $$0) {
      vc.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(aav $$0) {
      vc.a($$0, this, this.a);
      this.z.a($$0.a());
      eqd $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.B_());
      this.a.a(gct.c, $$1.b());
   }

   @Override
   public void a(yy $$0) {
      vc.a($$0, this, this.a);
      ehi $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(aap $$0) {
      vc.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(wx $$0) {
      vc.a($$0, this, this.a);

      for (Entry<apg<?>, Integer> $$1 : $$0.a().entrySet()) {
         apg<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof eyo) {
         ((eyo)this.a.y).D();
      }
   }

   @Override
   public void a(za $$0) {
      vc.a($$0, this, this.a);
      eqd $$1 = this.a.s.m();
      $$1.a($$0.e());
      za.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (aeu $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (aeu $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (aeu $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (aeu $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     euq.a(this.a.ay(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fbx) {
         ((fbx)this.a.y).E();
      }
   }

   @Override
   public void a(aau $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 instanceof bjb) {
         bhw $$2 = $$0.d();
         if ($$2 != null) {
            bhy $$3 = new bhy($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((bjb)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(vj $$0) {
      super.a($$0);
      this.y();
   }

   private void y() {
      if (!this.b.g()) {
         csr.a();
      }

      chh.e().n();
   }

   @Override
   public void a(yt $$0) {
   }

   @Override
   public void a(yu $$0) {
   }

   @Override
   public void a(yv $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new exe($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fO();
         }
      }
   }

   @Override
   public void a(xf $$0) {
      vc.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(zo $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(yb $$0) {
      vc.a($$0, this, this.a);
      dgv $$1 = this.o.w_();
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
   public void a(zj $$0) {
      vc.a($$0, this, this.a);
      this.o.w_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(zk $$0) {
      vc.a($$0, this, this.a);
      this.o.w_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zl $$0) {
      vc.a($$0, this, this.a);
      this.o.w_().a($$0.a());
   }

   @Override
   public void a(zn $$0) {
      vc.a($$0, this, this.a);
      this.o.w_().c($$0.a());
   }

   @Override
   public void a(zm $$0) {
      vc.a($$0, this, this.a);
      this.o.w_().b($$0.a());
   }

   @Override
   public void a(xj $$0) {
      vc.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(zh $$0) {
      vc.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().ifPresent(this.c::a);
         this.c.a($$0.e());
         fjd.b(this.c);
         if (!this.K && !$$0.e()) {
            eur $$1 = eur.a(this.a, eur.a.h, h, i);
            this.a.ay().a($$1);
            this.K = true;
         }
      }
   }

   @Override
   public void a(xr $$0) {
      vc.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(zi $$0) {
      vc.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(aah $$0) {
      vc.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(aaf $$0) {
      vc.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(aai $$0) {
      vc.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aao $$0) {
      vc.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(zc $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = $$0.a(this.o);
      if ($$1 instanceof bjb) {
         ((bjb)$$1).c($$0.a());
      }
   }

   @Override
   public void a(yw $$0) {
      vc.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aK().f($$1);
         fja $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(yx $$0) {
      vc.a($$0, this, this.a);

      for (yx.b $$1 : $$0.e()) {
         fja $$2 = new fja(Objects.requireNonNull($$1.b()), this.z());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aK().a($$2);
         }
      }

      for (yx.b $$3 : $$0.d()) {
         fja $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (yx.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(yx.a $$0, yx.b $$1, fja $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cv().equals($$1.a())) {
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

   private void a(yx.b $$0, fja $$1) {
      GameProfile $$2 = $$1.a();
      asc $$3 = this.a.aT();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.z());
      } else {
         ty.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               ty $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cbs.b var7) {
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
   public void a(yr $$0) {
      vc.a($$0, this, this.a);
      cbp $$1 = this.a.s;
      $$1.fR().b = $$0.d();
      $$1.fR().d = $$0.f();
      $$1.fR().a = $$0.a();
      $$1.fR().c = $$0.e();
      $$1.fR().a($$0.g());
      $$1.fR().b($$0.h());
   }

   @Override
   public void a(aak $$0) {
      vc.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(aaj $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(xd $$0) {
      vc.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(xq $$0) {
      vc.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.gl().b($$0.a());
      } else {
         this.a.s.gl().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(ym $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.a.s.cV();
      if ($$1 != this.a.s && $$1.cW()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new abx($$1));
      }
   }

   @Override
   public void a(yn $$0) {
      vc.a($$0, this, this.a);
      cja $$1 = this.a.s.b($$0.a());
      if ($$1.a(cjd.th)) {
         this.a.a(new ezk(new ezk.c($$1)));
      }
   }

   @Override
   public void a(vs $$0) {
      if ($$0 instanceof wb $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof wa $$2) {
         ((frp)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof wg $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof wi $$4) {
         ((frx)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof we $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof wc $$6) {
         fre.a $$7 = new fre.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof wd $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof wh $$9) {
         frv $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof vy $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof vq $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof vp $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof vz $$14) {
         this.a.k.o.a($$14.b(), this.o.V());
      } else if ($$0 instanceof vw $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof vx) {
         this.a.k.r.a();
      } else if ($$0 instanceof wf $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof vu $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof vv $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else {
         this.b($$0);
      }
   }

   private void b(vs $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(aaa $$0) {
      vc.a($$0, this, this.a);
      eih $$1 = this.o.I();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, eik.a, $$0.d(), $$0.f());
      } else {
         eie $$3 = $$1.b($$2);
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
   public void a(aad $$0) {
      vc.a($$0, this, this.a);
      eih $$1 = this.o.I();
      String $$2 = $$0.d();
      switch ($$0.f()) {
         case a:
            eie $$3 = $$1.b($$2);
            if ($$3 != null) {
               eig $$4 = $$1.c($$0.a(), $$3);
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
   public void a(zt $$0) {
      vc.a($$0, this, this.a);
      eih $$1 = this.o.I();
      String $$2 = $$0.d();
      eie $$3 = $$2 == null ? null : $$1.b($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(aac $$0) {
      vc.a($$0, this, this.a);
      eih $$1 = this.o.I();
      aac.a $$2 = $$0.d();
      eif $$3;
      if ($$2 == aac.a.a) {
         $$3 = $$1.e($$0.e());
      } else {
         $$3 = $$1.d($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<aac.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         eij.b $$2x = eij.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         eij.a $$3x = eij.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      aac.a $$6 = $$0.a();
      if ($$6 == aac.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == aac.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == aac.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(yf $$0) {
      vc.a($$0, this, this.a);
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
   public void a(aat $$0) {
      vc.a($$0, this, this.a);
      bil $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bjb)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bke $$2 = ((bjb)$$1).eP();

            for (aat.a $$3 : $$0.d()) {
               bkd $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, jd.v.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bkf $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(yq $$0) {
      vc.a($$0, this, this.a);
      ceg $$1 = this.a.s.bQ;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fbx) {
               fbr $$2 = ((fbx)this.a.y).F();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(yg $$0) {
      vc.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      yh $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, yh $$2) {
      dzw $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cpz.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cpz.b, $$7, $$8, $$9);
      $$3.a(new cox($$0, $$1), true);
   }

   @Override
   public void a(yk $$0) {
      vc.a($$0, this, this.a);
      ceg $$1 = this.a.s.bQ;
      if ($$0.a() == $$1.j && $$1 instanceof cfn $$2) {
         $$2.a(new cop($$0.d().a()));
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(zr $$0) {
      vc.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(aae $$0) {
      vc.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(zq $$0) {
      vc.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(wy $$0) {
      vc.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(xe $$0) {
      vc.a($$0, this, this.a);

      for (va<ws> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(xh $$0) {
      this.I.a();
   }

   @Override
   public void a(xg $$0) {
      this.I.a($$0.a());
      this.b(new abj(this.I.b()));
   }

   @Override
   public void a(adv $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, dzw $$2, cpz $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, hz.a($$0, $$8, $$1), $$9 ? new dhg((byte[])$$6.next().clone()) : new dhg());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public sj l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k();
   }

   public Collection<fja> m() {
      return this.r;
   }

   public Collection<fja> n() {
      return this.q.values();
   }

   public Collection<UUID> o() {
      return this.q.keySet();
   }

   @Nullable
   public fja a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public fja a(String $$0) {
      for (fja $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.n;
   }

   public fin q() {
      return this.s;
   }

   public CommandDispatcher<dw> r() {
      return this.y;
   }

   public fis s() {
      return this.o;
   }

   public eqh t() {
      return this.u;
   }

   public UUID u() {
      return this.A;
   }

   public Set<aet<cpq>> v() {
      return this.B;
   }

   @Override
   public hu.b f() {
      return this.C;
   }

   public void a(tx $$0, boolean $$1) {
      tt $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.A();
      }
   }

   private void A() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new abf($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqs.c.a();
      tp.a $$3 = this.G.b();
      tt $$4 = this.F.pack(new ua($$0, $$1, $$2, $$3.a()));
      this.b(new abh($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqs.c.a();
      tp.a $$3 = this.G.b();
      dy $$4 = dy.a(tz.a(this.e($$0)), $$3x -> {
         ua $$4x = new ua($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new abg($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (tz.a(this.e($$0)).a().isEmpty()) {
         tp.a $$1 = this.G.b();
         this.b(new abg($$0, Instant.now(), 0L, dy.a, $$1.b()));
         return true;
      } else {
         return false;
      }
   }

   private ParseResults<dw> e(String $$0) {
      return this.y.parse($$0, this.t);
   }

   @Override
   public void e() {
      if (this.b.j()) {
         fjb $$0 = this.a.w();
         if ($$0.b()) {
            $$0.a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
         }
      }

      this.g();
      if (this.a.aN().f()) {
         this.J.a();
      }

      this.e.a();
   }

   public void a(cbr $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = ts.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new abi(this.E.a().a()));
         }
      }
   }

   @Nullable
   public fjc w() {
      return this.c;
   }

   public cdx x() {
      return this.D;
   }

   public boolean a(cdx $$0) {
      return $$0.a(this.x());
   }
}
