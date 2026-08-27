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

public class fja extends fiw implements tc, wy {
   private static final Logger g = LogUtils.getLogger();
   private static final tn h = tn.c("multiplayer.unsecureserver.toast.title");
   private static final tn i = tn.c("multiplayer.unsecureserver.toast");
   private static final tn j = tn.c("multiplayer.disconnect.invalid_packet");
   private static final tn k = tn.c("multiplayer.disconnect.chat_validation_failed");
   private static final tn l = tn.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private fiz o;
   private fiz.a p;
   private final Map<UUID, fjh> q = Maps.newHashMap();
   private final Set<fjh> r = new ReferenceOpenHashSet();
   private final fiu s;
   private final fjc t;
   private final eqo u = new eqo(this);
   private int v = 3;
   private int w = 3;
   private final ase x = ase.b();
   private CommandDispatcher<dw> y = new CommandDispatcher();
   private final cmn z = new cmn();
   private final UUID A = UUID.randomUUID();
   private Set<aex<cpx>> B;
   private final hu.b C;
   private final cee D;
   @Nullable
   private tx E;
   private ug.c F = ug.c.a;
   private tu G = new tu(20);
   private tz H = tz.a();
   private final fit I = new fit();
   private final fjg J;
   private boolean K = false;
   private volatile boolean L;

   public fja(eqx $$0, so $$1, fjd $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fiu($$0, this.e);
      this.t = new fjc(this, $$0);
      this.J = new fjg(this, $$0.aN().k());
   }

   public fjc i() {
      return this.t;
   }

   public void j() {
      this.L = true;
      this.o = null;
      this.e.c();
   }

   public cmn k() {
      return this.z;
   }

   @Override
   public void a(yn $$0) {
      vh.a($$0, this, this.a);
      this.y();
      this.a.q = new fjf(this.a, this);
      abb $$1 = $$0.l();
      List<aex<cpx>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      aex<cpx> $$3 = $$1.b();
      hg<diu> $$4 = this.C.d(je.au).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fiz.a $$7 = new fiz.a(bgx.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new fiz(this, $$7, $$3, $$4, this.v, this.w, this.a::aG, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new apq(), new eqk());
         this.a.s.r(-180.0F);
         if (this.a.T() != null) {
            this.a.T().a(this.a.s.cv());
         }
      }

      this.a.k.a();
      this.a.s.x();
      this.a.s.e($$0.a());
      this.o.c(this.a.s);
      this.a.s.co = new fnh(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a.a(new eyl());
      this.a.s.u($$0.i());
      this.a.s.b($$0.j());
      this.a.s.v($$0.k());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.g());
      this.E = null;
      this.G = new tu(20);
      this.H = tz.a();
      if (this.b.j()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aZ().a(this.a);
   }

   @Override
   public void a(wz $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.o.c($$1);
         this.a($$1);
      } else {
         g.warn("Skipping Entity with id {}", $$0.e());
      }
   }

   @Nullable
   private bis b(wz $$0) {
      biw<?> $$1 = $$0.e();
      if ($$1 == biw.bt) {
         fjh $$2 = this.a($$0.d());
         if ($$2 == null) {
            g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
            return null;
         } else {
            return new fnj(this.o, $$2.a());
         }
      } else {
         return $$1.a((cpx)this.o);
      }
   }

   private void a(bis $$0) {
      if ($$0 instanceof cdn $$1) {
         this.a.ai().a((gco)(new gch($$1)));
      } else if ($$0 instanceof buu $$2) {
         boolean $$3 = $$2.X_();
         gcb $$4;
         if ($$3) {
            $$4 = new gbz($$2);
         } else {
            $$4 = new gca($$2);
         }

         this.a.ai().a((gcp)$$4);
      }
   }

   @Override
   public void a(xa $$0) {
      vh.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      bis $$4 = new biy(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.c($$4);
   }

   @Override
   public void a(aab $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(zz $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.al().a($$0.d());
      }
   }

   @Override
   public void a(aaw $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
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
   public void a(zu $$0) {
      vh.a($$0, this, this.a);
      if (cbv.d($$0.a())) {
         this.a.s.fR().l = $$0.a();
      }
   }

   @Override
   public void a(yq $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cW()) {
            if ($$0.i()) {
               ada $$2 = $$1.af();
               ehp $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
               $$2.e($$3);
               float $$4 = $$0.h() ? (float)($$0.f() * 360) / 256.0F : $$1.o_();
               float $$5 = $$0.h() ? (float)($$0.g() * 360) / 256.0F : $$1.d_();
               $$1.a($$3.a(), $$3.b(), $$3.c(), $$4, $$5, 3);
            } else if ($$0.h()) {
               float $$6 = (float)($$0.f() * 360) / 256.0F;
               float $$7 = (float)($$0.g() * 360) / 256.0F;
               $$1.a($$1.n_(), $$1.K_(), $$1.L_(), $$6, $$7, 3);
            }

            $$1.c($$0.j());
         }
      }
   }

   @Override
   public void a(zj $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(zg $$0) {
      vh.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, bis.c.b));
   }

   @Override
   public void a(ze $$0) {
      vh.a($$0, this, this.a);
      cbw $$1 = this.a.s;
      ehp $$2 = $$1.do();
      boolean $$3 = $$0.i().contains(bjw.a);
      boolean $$4 = $$0.i().contains(bjw.b);
      boolean $$5 = $$0.i().contains(bjw.c);
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

      $$1.e($$7, $$11, $$15);
      $$1.o($$6, $$10, $$14);
      float $$18 = $$0.f();
      float $$19 = $$0.g();
      if ($$0.i().contains(bjw.e)) {
         $$1.s($$1.dD() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bjw.d)) {
         $$1.r($$1.dB() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new abh($$0.h()));
      this.b.a(new aca.b($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD(), false));
   }

   @Override
   public void a(zk $$0) {
      vh.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(yi $$0) {
      vh.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      ym $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dhs $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(xn $$0) {
      vh.a($$0, this, this.a);

      for (xn.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (xn.a $$2 : $$0.a()) {
         this.o.a(new cpe($$2.b().e, $$2.b().f));
      }

      for (xn.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.al(); $$6 < this.o.am(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, yh $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dhs $$0, int $$1, int $$2) {
      ead $$3 = this.o.i().p();
      dht[] $$4 = $$0.d();
      cpe $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dht $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(hz.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(yc $$0) {
      vh.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(yc $$0) {
      cpe $$1 = $$0.a();
      this.o.a(() -> {
         ead $$1x = this.o.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            hz $$3 = hz.a($$1, $$2);
            $$1x.a(cqg.b, $$3, null);
            $$1x.a(cqg.a, $$3, null);
         }

         for (int $$4 = this.o.al(); $$4 < this.o.am(); $$4++) {
            $$1x.a(hz.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(xh $$0) {
      vh.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(aaq $$0) {
      this.b.a();
      vh.a($$0, this, this.a);
      this.a.c(new fbl(l, this.b));
      this.b.a(new fix(this.a, this.b, new fjd(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new abr());
   }

   @Override
   public void a(aav $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      bji $$2 = (bji)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof biy) {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apf.hA, apg.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apf.ma, apg.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new flq(this.a.ao(), this.a.aO(), this.o, $$1, $$2));
         if ($$1 instanceof byp $$3) {
            cjh $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), bis.c.b);
            }
         } else if (!($$1 instanceof biy)) {
            this.o.a($$0.a(), bis.c.b);
         }
      }
   }

   @Override
   public void a(aas $$0) {
      vh.a($$0, this, this.a);
      this.a.aW().a($$0.a(), $$0.d());
   }

   @Override
   public void a(yx $$0) {
      vh.a($$0, this, this.a);
      Optional<uf> $$1 = $$0.f().a(this.H);
      Optional<tj.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         fjh $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.b.a(k);
         } else {
            ud $$5 = $$4.b();
            uh $$6;
            if ($$5 != null) {
               $$6 = new uh($$0.d(), $$3, $$5.c());
            } else {
               $$6 = uh.a($$3);
            }

            uc $$8 = new uc($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
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
   public void a(xz $$0) {
      vh.a($$0, this, this.a);
      Optional<tj.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aW().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(xy $$0) {
      vh.a($$0, this, this.a);
      Optional<ty> $$1 = $$0.a().a(this.H);
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
   public void a(xb $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bji $$2 = (bji)$$1;
            $$2.a(bgz.a);
         } else if ($$0.d() == 3) {
            bji $$3 = (bji)$$1;
            $$3.a(bgz.b);
         } else if ($$0.d() == 2) {
            cbw $$4 = (cbw)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, ix.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, ix.s);
         }
      }
   }

   @Override
   public void a(yf $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(aal $$0) {
      vh.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(zx $$0) {
      vh.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
      if (this.a.y instanceof eyl $$1) {
         $$1.l();
      }
   }

   @Override
   public void a(aag $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bA();

         for (int $$3 : $$0.a()) {
            bis $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cdp) {
                     this.a.s.N = $$1.dB();
                     this.a.s.r($$1.dB());
                     this.a.s.n($$1.dB());
                  }

                  tn $$5 = tn.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aV().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(aaa $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 instanceof bjk) {
         ((bjk)$$1).r($$0.d());
      }
   }

   private static cjh a(cbw $$0) {
      for (bgz $$1 : bgz.values()) {
         cjh $$2 = $$0.b($$1);
         if ($$2.a(cjk.uz)) {
            return $$2;
         }
      }

      return new cjh(cjk.uz);
   }

   @Override
   public void a(ya $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ai().a((gco)(new gcg((bzg)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, ix.ae, 30);
               this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apf.xM, $$1.da(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cbw)this.a.s));
               }
               break;
            case 63:
               this.a.ai().a((gco)(new gck((bxf)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(xx $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(aae $$0) {
      vh.a($$0, this, this.a);
      this.a.s.D($$0.a());
      this.a.s.gb().a($$0.d());
      this.a.s.gb().b($$0.e());
   }

   @Override
   public void a(aad $$0) {
      vh.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zi $$0) {
      vh.a($$0, this, this.a);
      abb $$1 = $$0.a();
      aex<cpx> $$2 = $$1.b();
      hg<diu> $$3 = this.C.d(je.au).f($$1.a());
      fni $$4 = this.a.s;
      if ($$2 != $$4.dL().ac()) {
         eio $$5 = this.o.I();
         Map<String, eby> $$6 = this.o.l();
         boolean $$7 = $$1.f();
         boolean $$8 = $$1.g();
         fiz.a $$9 = new fiz.a(this.p.s(), this.p.n(), $$8);
         this.p = $$9;
         this.o = new fiz(this, $$9, $$2, $$3, this.v, this.w, this.a::aG, this.a.f, $$7, $$1.c());
         this.o.a($$5);
         this.o.a($$6);
         this.a.a(this.o);
         this.a.a(new eyl());
      }

      this.a.t = null;
      if ($$4.fT()) {
         $$4.q();
      }

      fni $$10;
      if ($$0.a((byte)2)) {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m(), $$4.bR(), $$4.bX());
      } else {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m());
      }

      $$10.e($$4.ah());
      this.a.s = $$10;
      if ($$2 != $$4.dL().ac()) {
         this.a.s().b();
      }

      this.a.t = $$10;
      if ($$0.a((byte)2)) {
         List<aej.b<?>> $$12 = $$4.al().c();
         if ($$12 != null) {
            $$10.al().a($$12);
         }
      }

      if ($$0.a((byte)1)) {
         $$10.eQ().a($$4.eQ());
      }

      $$10.x();
      this.o.c($$10);
      $$10.r(-180.0F);
      $$10.co = new fnh(this.a.m);
      this.a.q.a($$10);
      $$10.u($$4.gh());
      $$10.b($$4.o());
      $$10.a($$1.h());
      $$10.f($$1.i());
      $$10.cv = $$4.cv;
      $$10.cw = $$4.cw;
      if (this.a.y instanceof exl || this.a.y instanceof exl.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(yb $$0) {
      vh.a($$0, this, this.a);
      cpp $$1 = new cpp(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j());
      $$1.a(true);
      this.a.s.f(this.a.s.do().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(ye $$0) {
      vh.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof bws $$2) {
         fni $$3 = this.a.s;
         bhh $$4 = new bhh($$0.d());
         cfl $$5 = new cfl($$0.a(), $$3.fR(), $$4, $$2);
         $$3.bS = $$5;
         this.a.a(new fai($$5, $$3.fR(), $$2));
      }
   }

   @Override
   public void a(yt $$0) {
      vh.a($$0, this, this.a);
      exz.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(xu $$0) {
      vh.a($$0, this, this.a);
      cbw $$1 = this.a.s;
      cjh $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.az().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof ezy)) {
            $$1.bS.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fR().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof ezy $$5) {
            $$4 = !$$5.F();
         }

         if ($$0.a() == 0 && cfm.f($$3)) {
            if (!$$2.b()) {
               cjh $$6 = $$1.bR.b($$3).e();
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
   public void a(xs $$0) {
      vh.a($$0, this, this.a);
      cbw $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bR.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bS.j) {
         $$1.bS.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(yu $$0) {
      vh.a($$0, this, this.a);
      gw $$1 = $$0.a();
      if (this.o.c_($$1) instanceof def $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         dfl $$3 = this.o.a_($$1);
         def $$4 = new def($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(xf $$0) {
      vh.a($$0, this, this.a);
      gw $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         qy $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof ddh && this.a.y instanceof ezu) {
            ((ezu)this.a.y).F();
         }
      });
   }

   @Override
   public void a(xt $$0) {
      vh.a($$0, this, this.a);
      cbw $$1 = this.a.s;
      if ($$1.bS != null && $$1.bS.j == $$0.a()) {
         $$1.bS.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(aac $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((bix)$$1x.getFirst(), (cjh)$$1x.getSecond()));
      }
   }

   @Override
   public void a(xr $$0) {
      vh.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(xg $$0) {
      vh.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(xe $$0) {
      vh.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(yd $$0) {
      vh.a($$0, this, this.a);
      cbw $$1 = this.a.s;
      yd.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = ary.d($$3 + 0.5F);
      if ($$2 == yd.a) {
         $$1.a(tn.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == yd.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == yd.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == yd.d) {
         this.a.q.a(cpu.a($$4));
      } else if ($$2 == yd.e) {
         if ($$4 == 0) {
            this.a.s.cn.b(new abp(abp.a.a));
            this.a.a(new eyl());
         } else if ($$4 == 1) {
            this.a.a(new eyt(true, () -> {
               this.a.s.cn.b(new abp(abp.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == yd.f) {
         erb $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new exm());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(tn.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(tn.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(tn.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(tn.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == yd.g) {
         this.o.a($$1, $$1.dq(), $$1.du(), $$1.dw(), apf.aq, apg.h, 0.18F, 0.45F);
      } else if ($$2 == yd.h) {
         this.o.e($$3);
      } else if ($$2 == yd.i) {
         this.o.c($$3);
      } else if ($$2 == yd.j) {
         this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apf.ti, apg.g, 1.0F, 1.0F);
      } else if ($$2 == yd.k) {
         this.o.a(ix.r, $$1.dq(), $$1.ds(), $$1.dw(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apf.gJ, apg.f, 1.0F, 1.0F);
         }
      } else if ($$2 == yd.l) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == yd.m) {
         this.a.s.v($$3 == 1.0F);
      }
   }

   @Override
   public void a(yo $$0) {
      vh.a($$0, this, this.a);
      esj $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cjo.a($$2);
      eby $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = eby.a($$0.d(), $$0.e(), this.a.r.ac());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(yj $$0) {
      vh.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(aax $$0) {
      vh.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(zl $$0) {
      vh.a($$0, this, this.a);
      aey $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(xq $$0) {
      vh.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dn.a((hi.b)this.C, this.D)));
   }

   @Override
   public void a(aar $$0) {
      vh.a($$0, this, this.a);
      this.a.ai().a($$0.a(), $$0.d());
   }

   @Override
   public void a(xp $$0) {
      vh.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(aba $$0) {
      vh.a($$0, this, this.a);
      this.z.a($$0.a());
      eqk $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.G_());
      this.a.a(gda.c, $$1.b());
   }

   @Override
   public void a(zd $$0) {
      vh.a($$0, this, this.a);
      ehp $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(aau $$0) {
      vh.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(xc $$0) {
      vh.a($$0, this, this.a);

      for (Entry<apm<?>, Integer> $$1 : $$0.a().entrySet()) {
         apm<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof eyv) {
         ((eyv)this.a.y).E();
      }
   }

   @Override
   public void a(zf $$0) {
      vh.a($$0, this, this.a);
      eqk $$1 = this.a.s.m();
      $$1.a($$0.e());
      zf.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (aey $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (aey $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (aey $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (aey $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     eux.a(this.a.ay(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fce) {
         ((fce)this.a.y).F();
      }
   }

   @Override
   public void a(aaz $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 instanceof bji) {
         bid $$2 = $$0.d();
         if ($$2 != null) {
            bif $$3 = new bif($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((bji)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(vo $$0) {
      super.a($$0);
      this.y();
   }

   private void y() {
      if (!this.b.g()) {
         csy.a();
      }

      cho.e().n();
   }

   @Override
   public void a(yy $$0) {
   }

   @Override
   public void a(yz $$0) {
   }

   @Override
   public void a(za $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new exl($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fP();
         }
      }
   }

   @Override
   public void a(xk $$0) {
      vh.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(zt $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(yg $$0) {
      vh.a($$0, this, this.a);
      dhc $$1 = this.o.B_();
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
   public void a(zo $$0) {
      vh.a($$0, this, this.a);
      this.o.B_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(zp $$0) {
      vh.a($$0, this, this.a);
      this.o.B_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zq $$0) {
      vh.a($$0, this, this.a);
      this.o.B_().a($$0.a());
   }

   @Override
   public void a(zs $$0) {
      vh.a($$0, this, this.a);
      this.o.B_().c($$0.a());
   }

   @Override
   public void a(zr $$0) {
      vh.a($$0, this, this.a);
      this.o.B_().b($$0.a());
   }

   @Override
   public void a(xo $$0) {
      vh.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(zm $$0) {
      vh.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().map(fjj::b).ifPresent(this.c::a);
         this.c.a($$0.e());
         fjk.b(this.c);
         if (!this.K && !$$0.e()) {
            euy $$1 = euy.a(this.a, euy.a.h, h, i);
            this.a.ay().a($$1);
            this.K = true;
         }
      }
   }

   @Override
   public void a(xw $$0) {
      vh.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(zn $$0) {
      vh.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(aam $$0) {
      vh.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(aak $$0) {
      vh.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(aan $$0) {
      vh.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aat $$0) {
      vh.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(zh $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = $$0.a(this.o);
      if ($$1 instanceof bji) {
         ((bji)$$1).c($$0.a());
      }
   }

   @Override
   public void a(zb $$0) {
      vh.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aK().f($$1);
         fjh $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(zc $$0) {
      vh.a($$0, this, this.a);

      for (zc.b $$1 : $$0.e()) {
         fjh $$2 = new fjh(Objects.requireNonNull($$1.b()), this.z());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aK().a($$2);
         }
      }

      for (zc.b $$3 : $$0.d()) {
         fjh $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (zc.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(zc.a $$0, zc.b $$1, fjh $$2) {
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

   private void a(zc.b $$0, fjh $$1) {
      GameProfile $$2 = $$1.a();
      asj $$3 = this.a.aT();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.z());
      } else {
         ud.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               ud $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cbz.b var7) {
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
   public void a(yw $$0) {
      vh.a($$0, this, this.a);
      cbw $$1 = this.a.s;
      $$1.fS().b = $$0.d();
      $$1.fS().d = $$0.f();
      $$1.fS().a = $$0.a();
      $$1.fS().c = $$0.e();
      $$1.fS().a($$0.g());
      $$1.fS().b($$0.h());
   }

   @Override
   public void a(aap $$0) {
      vh.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(aao $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(xi $$0) {
      vh.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(xv $$0) {
      vh.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.gm().b($$0.a());
      } else {
         this.a.s.gm().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(yr $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.a.s.cV();
      if ($$1 != this.a.s && $$1.cW()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new acb($$1));
      }
   }

   @Override
   public void a(ys $$0) {
      vh.a($$0, this, this.a);
      cjh $$1 = this.a.s.b($$0.a());
      if ($$1.a(cjk.th)) {
         this.a.a(new ezr(new ezr.c($$1)));
      }
   }

   @Override
   public void a(vy $$0) {
      if ($$0 instanceof wh $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof wg $$2) {
         ((frw)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof wm $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof wo $$4) {
         ((fse)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof wk $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof wi $$6) {
         frl.a $$7 = new frl.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof wj $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof wn $$9) {
         fsc $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof we $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof vw $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof vv $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof wf $$14) {
         this.a.k.o.a($$14.b(), this.o.V());
      } else if ($$0 instanceof wc $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof wd) {
         this.a.k.r.a();
      } else if ($$0 instanceof wl $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof wa $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof wb $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else {
         this.b($$0);
      }
   }

   private void b(vy $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(aaf $$0) {
      vh.a($$0, this, this.a);
      eio $$1 = this.o.I();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, eir.a, $$0.d(), $$0.f());
      } else {
         eil $$3 = $$1.b($$2);
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
   public void a(aai $$0) {
      vh.a($$0, this, this.a);
      eio $$1 = this.o.I();
      String $$2 = $$0.d();
      switch ($$0.f()) {
         case a:
            eil $$3 = $$1.b($$2);
            if ($$3 != null) {
               ein $$4 = $$1.c($$0.a(), $$3);
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
   public void a(zy $$0) {
      vh.a($$0, this, this.a);
      eio $$1 = this.o.I();
      String $$2 = $$0.d();
      eil $$3 = $$2 == null ? null : $$1.b($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(aah $$0) {
      vh.a($$0, this, this.a);
      eio $$1 = this.o.I();
      aah.a $$2 = $$0.d();
      eim $$3;
      if ($$2 == aah.a.a) {
         $$3 = $$1.e($$0.e());
      } else {
         $$3 = $$1.d($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<aah.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         eiq.b $$2x = eiq.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         eiq.a $$3x = eiq.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      aah.a $$6 = $$0.a();
      if ($$6 == aah.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == aah.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == aah.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(yk $$0) {
      vh.a($$0, this, this.a);
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
   public void a(aay $$0) {
      vh.a($$0, this, this.a);
      bis $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bji)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bkl $$2 = ((bji)$$1).eQ();

            for (aay.a $$3 : $$0.d()) {
               bkk $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, jd.v.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bkm $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(yv $$0) {
      vh.a($$0, this, this.a);
      cen $$1 = this.a.s.bS;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fce) {
               fby $$2 = ((fce)this.a.y).G();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(yl $$0) {
      vh.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      ym $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, ym $$2) {
      ead $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cqg.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cqg.b, $$7, $$8, $$9);
      $$3.a(new cpe($$0, $$1), true);
   }

   @Override
   public void a(yp $$0) {
      vh.a($$0, this, this.a);
      cen $$1 = this.a.s.bS;
      if ($$0.a() == $$1.j && $$1 instanceof cfu $$2) {
         $$2.a($$0.d());
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(zw $$0) {
      vh.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(aaj $$0) {
      vh.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(zv $$0) {
      vh.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(xd $$0) {
      vh.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(xj $$0) {
      vh.a($$0, this, this.a);

      for (vf<wy> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(xm $$0) {
      this.I.a();
   }

   @Override
   public void a(xl $$0) {
      this.I.a($$0.a());
      this.b(new abo(this.I.b()));
   }

   @Override
   public void a(adz $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, ead $$2, cqg $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, hz.a($$0, $$8, $$1), $$9 ? new dhn((byte[])$$6.next().clone()) : new dhn());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public so l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k() && !this.L;
   }

   public Collection<fjh> m() {
      return this.r;
   }

   public Collection<fjh> n() {
      return this.q.values();
   }

   public Collection<UUID> o() {
      return this.q.keySet();
   }

   @Nullable
   public fjh a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public fjh a(String $$0) {
      for (fjh $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.n;
   }

   public fiu q() {
      return this.s;
   }

   public CommandDispatcher<dw> r() {
      return this.y;
   }

   public fiz s() {
      return this.o;
   }

   public eqo t() {
      return this.u;
   }

   public UUID u() {
      return this.A;
   }

   public Set<aex<cpx>> v() {
      return this.B;
   }

   @Override
   public hu.b f() {
      return this.C;
   }

   public void a(uc $$0, boolean $$1) {
      ty $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.A();
      }
   }

   private void A() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new abk($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqy.c.a();
      tu.a $$3 = this.G.b();
      ty $$4 = this.F.pack(new uf($$0, $$1, $$2, $$3.a()));
      this.b(new abm($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqy.c.a();
      tu.a $$3 = this.G.b();
      dy $$4 = dy.a(ue.a(this.e($$0)), $$3x -> {
         uf $$4x = new uf($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new abl($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (ue.a(this.e($$0)).a().isEmpty()) {
         tu.a $$1 = this.G.b();
         this.b(new abl($$0, Instant.now(), 0L, dy.a, $$1.b()));
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
         fji $$0 = this.a.w();
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

   public void a(cby $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = tx.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new abn(this.E.a().a()));
         }
      }
   }

   @Nullable
   public fjj w() {
      return this.c;
   }

   public cee x() {
      return this.D;
   }

   public boolean a(cee $$0) {
      return $$0.a(this.x());
   }
}
