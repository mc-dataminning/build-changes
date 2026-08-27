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

public class fiy extends fiu implements ta, ww {
   private static final Logger g = LogUtils.getLogger();
   private static final tl h = tl.c("multiplayer.unsecureserver.toast.title");
   private static final tl i = tl.c("multiplayer.unsecureserver.toast");
   private static final tl j = tl.c("multiplayer.disconnect.invalid_packet");
   private static final tl k = tl.c("multiplayer.disconnect.chat_validation_failed");
   private static final tl l = tl.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private fix o;
   private fix.a p;
   private final Map<UUID, fjf> q = Maps.newHashMap();
   private final Set<fjf> r = new ReferenceOpenHashSet();
   private final fis s;
   private final fja t;
   private final eqm u = new eqm(this);
   private int v = 3;
   private int w = 3;
   private final asc x = asc.b();
   private CommandDispatcher<dw> y = new CommandDispatcher();
   private final cml z = new cml();
   private final UUID A = UUID.randomUUID();
   private Set<aev<cpv>> B;
   private final hr.b C;
   private final cec D;
   @Nullable
   private tv E;
   private ue.c F = ue.c.a;
   private ts G = new ts(20);
   private tx H = tx.a();
   private final fir I = new fir();
   private final fje J;
   private boolean K = false;
   private volatile boolean L;

   public fiy(eqv $$0, sm $$1, fjb $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fis($$0, this.e);
      this.t = new fja(this, $$0);
      this.J = new fje(this, $$0.aN().k());
   }

   public fja i() {
      return this.t;
   }

   public void j() {
      this.L = true;
      this.o = null;
      this.e.c();
   }

   public cml k() {
      return this.z;
   }

   @Override
   public void a(yl $$0) {
      vf.a($$0, this, this.a);
      this.y();
      this.a.q = new fjd(this.a, this);
      aaz $$1 = $$0.l();
      List<aev<cpv>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      aev<cpv> $$3 = $$1.b();
      he<dis> $$4 = this.C.d(jc.au).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fix.a $$7 = new fix.a(bgv.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new fix(this, $$7, $$3, $$4, this.v, this.w, this.a::aG, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new apo(), new eqi());
         this.a.s.r(-180.0F);
         if (this.a.T() != null) {
            this.a.T().a(this.a.s.cv());
         }
      }

      this.a.k.a();
      this.a.s.x();
      this.a.s.e($$0.a());
      this.o.c(this.a.s);
      this.a.s.co = new fnf(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a.a(new eyj());
      this.a.s.u($$0.i());
      this.a.s.b($$0.j());
      this.a.s.v($$0.k());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.g());
      this.E = null;
      this.G = new ts(20);
      this.H = tx.a();
      if (this.b.j()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aZ().a(this.a);
   }

   @Override
   public void a(wx $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.o.c($$1);
         this.a($$1);
      } else {
         g.warn("Skipping Entity with id {}", $$0.e());
      }
   }

   @Nullable
   private biq b(wx $$0) {
      biu<?> $$1 = $$0.e();
      if ($$1 == biu.bt) {
         fjf $$2 = this.a($$0.d());
         if ($$2 == null) {
            g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
            return null;
         } else {
            return new fnh(this.o, $$2.a());
         }
      } else {
         return $$1.a((cpv)this.o);
      }
   }

   private void a(biq $$0) {
      if ($$0 instanceof cdl $$1) {
         this.a.ai().a((gcm)(new gcf($$1)));
      } else if ($$0 instanceof bus $$2) {
         boolean $$3 = $$2.X_();
         gbz $$4;
         if ($$3) {
            $$4 = new gbx($$2);
         } else {
            $$4 = new gby($$2);
         }

         this.a.ai().a((gcn)$$4);
      }
   }

   @Override
   public void a(wy $$0) {
      vf.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      biq $$4 = new biw(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.c($$4);
   }

   @Override
   public void a(zz $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(zx $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.al().a($$0.d());
      }
   }

   @Override
   public void a(aau $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
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
   public void a(zs $$0) {
      vf.a($$0, this, this.a);
      if (cbt.d($$0.a())) {
         this.a.s.fR().l = $$0.a();
      }
   }

   @Override
   public void a(yo $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cW()) {
            if ($$0.i()) {
               acy $$2 = $$1.af();
               ehn $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
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
   public void a(zh $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(ze $$0) {
      vf.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, biq.c.b));
   }

   @Override
   public void a(zc $$0) {
      vf.a($$0, this, this.a);
      cbu $$1 = this.a.s;
      ehn $$2 = $$1.do();
      boolean $$3 = $$0.i().contains(bju.a);
      boolean $$4 = $$0.i().contains(bju.b);
      boolean $$5 = $$0.i().contains(bju.c);
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
      if ($$0.i().contains(bju.e)) {
         $$1.s($$1.dD() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bju.d)) {
         $$1.r($$1.dB() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new abf($$0.h()));
      this.b.a(new aby.b($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD(), false));
   }

   @Override
   public void a(zi $$0) {
      vf.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(yg $$0) {
      vf.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      yk $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dhq $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(xl $$0) {
      vf.a($$0, this, this.a);

      for (xl.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (xl.a $$2 : $$0.a()) {
         this.o.a(new cpc($$2.b().e, $$2.b().f));
      }

      for (xl.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.al(); $$6 < this.o.am(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, yf $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dhq $$0, int $$1, int $$2) {
      eab $$3 = this.o.i().p();
      dhr[] $$4 = $$0.d();
      cpc $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dhr $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(hw.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(ya $$0) {
      vf.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(ya $$0) {
      cpc $$1 = $$0.a();
      this.o.a(() -> {
         eab $$1x = this.o.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            hw $$3 = hw.a($$1, $$2);
            $$1x.a(cqe.b, $$3, null);
            $$1x.a(cqe.a, $$3, null);
         }

         for (int $$4 = this.o.al(); $$4 < this.o.am(); $$4++) {
            $$1x.a(hw.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(xf $$0) {
      vf.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(aao $$0) {
      this.b.a();
      vf.a($$0, this, this.a);
      this.a.c(new fbj(l, this.b));
      this.b.a(new fiv(this.a, this.b, new fjb(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new abp());
   }

   @Override
   public void a(aat $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      bjg $$2 = (bjg)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof biw) {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apd.hA, ape.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apd.ma, ape.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new flo(this.a.ao(), this.a.aO(), this.o, $$1, $$2));
         if ($$1 instanceof byn $$3) {
            cjf $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), biq.c.b);
            }
         } else if (!($$1 instanceof biw)) {
            this.o.a($$0.a(), biq.c.b);
         }
      }
   }

   @Override
   public void a(aaq $$0) {
      vf.a($$0, this, this.a);
      this.a.aW().a($$0.a(), $$0.d());
   }

   @Override
   public void a(yv $$0) {
      vf.a($$0, this, this.a);
      Optional<ud> $$1 = $$0.f().a(this.H);
      Optional<th.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         fjf $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.b.a(k);
         } else {
            ub $$5 = $$4.b();
            uf $$6;
            if ($$5 != null) {
               $$6 = new uf($$0.d(), $$3, $$5.c());
            } else {
               $$6 = uf.a($$3);
            }

            ua $$8 = new ua($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
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
   public void a(xx $$0) {
      vf.a($$0, this, this.a);
      Optional<th.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aW().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(xw $$0) {
      vf.a($$0, this, this.a);
      Optional<tw> $$1 = $$0.a().a(this.H);
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
   public void a(wz $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bjg $$2 = (bjg)$$1;
            $$2.a(bgx.a);
         } else if ($$0.d() == 3) {
            bjg $$3 = (bjg)$$1;
            $$3.a(bgx.b);
         } else if ($$0.d() == 2) {
            cbu $$4 = (cbu)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, iv.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, iv.s);
         }
      }
   }

   @Override
   public void a(yd $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(aaj $$0) {
      vf.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(zv $$0) {
      vf.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
      if (this.a.y instanceof eyj $$1) {
         $$1.l();
      }
   }

   @Override
   public void a(aae $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bA();

         for (int $$3 : $$0.a()) {
            biq $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cdn) {
                     this.a.s.N = $$1.dB();
                     this.a.s.r($$1.dB());
                     this.a.s.n($$1.dB());
                  }

                  tl $$5 = tl.a("mount.onboard", this.a.m.C.k());
                  this.a.l.a($$5, false);
                  this.a.aV().c($$5);
               }
            }
         }
      }
   }

   @Override
   public void a(zy $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 instanceof bji) {
         ((bji)$$1).r($$0.d());
      }
   }

   private static cjf a(cbu $$0) {
      for (bgx $$1 : bgx.values()) {
         cjf $$2 = $$0.b($$1);
         if ($$2.a(cji.uz)) {
            return $$2;
         }
      }

      return new cjf(cji.uz);
   }

   @Override
   public void a(xy $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ai().a((gcm)(new gce((bze)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, iv.ae, 30);
               this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apd.xM, $$1.da(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cbu)this.a.s));
               }
               break;
            case 63:
               this.a.ai().a((gcm)(new gci((bxd)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(xv $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(aac $$0) {
      vf.a($$0, this, this.a);
      this.a.s.D($$0.a());
      this.a.s.gb().a($$0.d());
      this.a.s.gb().b($$0.e());
   }

   @Override
   public void a(aab $$0) {
      vf.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zg $$0) {
      vf.a($$0, this, this.a);
      aaz $$1 = $$0.a();
      aev<cpv> $$2 = $$1.b();
      he<dis> $$3 = this.C.d(jc.au).f($$1.a());
      fng $$4 = this.a.s;
      if ($$2 != $$4.dL().ac()) {
         eim $$5 = this.o.I();
         Map<String, ebw> $$6 = this.o.l();
         boolean $$7 = $$1.f();
         boolean $$8 = $$1.g();
         fix.a $$9 = new fix.a(this.p.s(), this.p.n(), $$8);
         this.p = $$9;
         this.o = new fix(this, $$9, $$2, $$3, this.v, this.w, this.a::aG, this.a.f, $$7, $$1.c());
         this.o.a($$5);
         this.o.a($$6);
         this.a.a(this.o);
         this.a.a(new eyj());
      }

      this.a.t = null;
      if ($$4.fT()) {
         $$4.q();
      }

      fng $$10;
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
         List<aeh.b<?>> $$12 = $$4.al().c();
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
      $$10.co = new fnf(this.a.m);
      this.a.q.a($$10);
      $$10.u($$4.gh());
      $$10.b($$4.o());
      $$10.a($$1.h());
      $$10.f($$1.i());
      $$10.cv = $$4.cv;
      $$10.cw = $$4.cw;
      if (this.a.y instanceof exj || this.a.y instanceof exj.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(xz $$0) {
      vf.a($$0, this, this.a);
      cpn $$1 = new cpn(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j());
      $$1.a(true);
      this.a.s.f(this.a.s.do().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(yc $$0) {
      vf.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof bwq $$2) {
         fng $$3 = this.a.s;
         bhf $$4 = new bhf($$0.d());
         cfj $$5 = new cfj($$0.a(), $$3.fR(), $$4, $$2);
         $$3.bS = $$5;
         this.a.a(new fag($$5, $$3.fR(), $$2));
      }
   }

   @Override
   public void a(yr $$0) {
      vf.a($$0, this, this.a);
      exx.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(xs $$0) {
      vf.a($$0, this, this.a);
      cbu $$1 = this.a.s;
      cjf $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.az().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof ezw)) {
            $$1.bS.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fR().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof ezw $$5) {
            $$4 = !$$5.F();
         }

         if ($$0.a() == 0 && cfk.f($$3)) {
            if (!$$2.b()) {
               cjf $$6 = $$1.bR.b($$3).e();
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
   public void a(xq $$0) {
      vf.a($$0, this, this.a);
      cbu $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bR.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bS.j) {
         $$1.bS.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(ys $$0) {
      vf.a($$0, this, this.a);
      gw $$1 = $$0.a();
      if (this.o.c_($$1) instanceof ded $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         dfj $$3 = this.o.a_($$1);
         ded $$4 = new ded($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(xd $$0) {
      vf.a($$0, this, this.a);
      gw $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         qw $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof ddf && this.a.y instanceof ezs) {
            ((ezs)this.a.y).F();
         }
      });
   }

   @Override
   public void a(xr $$0) {
      vf.a($$0, this, this.a);
      cbu $$1 = this.a.s;
      if ($$1.bS != null && $$1.bS.j == $$0.a()) {
         $$1.bS.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(aaa $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((biv)$$1x.getFirst(), (cjf)$$1x.getSecond()));
      }
   }

   @Override
   public void a(xp $$0) {
      vf.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(xe $$0) {
      vf.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(xc $$0) {
      vf.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(yb $$0) {
      vf.a($$0, this, this.a);
      cbu $$1 = this.a.s;
      yb.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = arw.d($$3 + 0.5F);
      if ($$2 == yb.a) {
         $$1.a(tl.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == yb.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == yb.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == yb.d) {
         this.a.q.a(cps.a($$4));
      } else if ($$2 == yb.e) {
         if ($$4 == 0) {
            this.a.s.cn.b(new abn(abn.a.a));
            this.a.a(new eyj());
         } else if ($$4 == 1) {
            this.a.a(new eyr(true, () -> {
               this.a.s.cn.b(new abn(abn.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == yb.f) {
         eqz $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new exk());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(tl.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(tl.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(tl.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(tl.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == yb.g) {
         this.o.a($$1, $$1.dq(), $$1.du(), $$1.dw(), apd.aq, ape.h, 0.18F, 0.45F);
      } else if ($$2 == yb.h) {
         this.o.e($$3);
      } else if ($$2 == yb.i) {
         this.o.c($$3);
      } else if ($$2 == yb.j) {
         this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apd.ti, ape.g, 1.0F, 1.0F);
      } else if ($$2 == yb.k) {
         this.o.a(iv.r, $$1.dq(), $$1.ds(), $$1.dw(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apd.gJ, ape.f, 1.0F, 1.0F);
         }
      } else if ($$2 == yb.l) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == yb.m) {
         this.a.s.v($$3 == 1.0F);
      }
   }

   @Override
   public void a(ym $$0) {
      vf.a($$0, this, this.a);
      esh $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cjm.a($$2);
      ebw $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = ebw.a($$0.d(), $$0.e(), this.a.r.ac());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(yh $$0) {
      vf.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(aav $$0) {
      vf.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(zj $$0) {
      vf.a($$0, this, this.a);
      aew $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(xo $$0) {
      vf.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dn.a((hg.b)this.C, this.D)));
   }

   @Override
   public void a(aap $$0) {
      vf.a($$0, this, this.a);
      this.a.ai().a($$0.a(), $$0.d());
   }

   @Override
   public void a(xn $$0) {
      vf.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(aay $$0) {
      vf.a($$0, this, this.a);
      this.z.a($$0.a());
      eqi $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.G_());
      this.a.a(gcy.c, $$1.b());
   }

   @Override
   public void a(zb $$0) {
      vf.a($$0, this, this.a);
      ehn $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(aas $$0) {
      vf.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(xa $$0) {
      vf.a($$0, this, this.a);

      for (Entry<apk<?>, Integer> $$1 : $$0.a().entrySet()) {
         apk<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof eyt) {
         ((eyt)this.a.y).E();
      }
   }

   @Override
   public void a(zd $$0) {
      vf.a($$0, this, this.a);
      eqi $$1 = this.a.s.m();
      $$1.a($$0.e());
      zd.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (aew $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (aew $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (aew $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (aew $$6 : $$0.a()) {
               this.z.a($$6).ifPresent($$1x -> {
                  $$1.a($$1x);
                  $$1.f($$1x);
                  if ($$1x.b().h()) {
                     euv.a(this.a.ay(), $$1x);
                  }
               });
            }
      }

      $$1.b().forEach($$1x -> $$1x.a($$1));
      if (this.a.y instanceof fcc) {
         ((fcc)this.a.y).F();
      }
   }

   @Override
   public void a(aax $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 instanceof bjg) {
         bib $$2 = $$0.d();
         if ($$2 != null) {
            bid $$3 = new bid($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((bjg)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(vm $$0) {
      super.a($$0);
      this.y();
   }

   private void y() {
      if (!this.b.g()) {
         csw.a();
      }

      chm.e().n();
   }

   @Override
   public void a(yw $$0) {
   }

   @Override
   public void a(yx $$0) {
   }

   @Override
   public void a(yy $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new exj($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fP();
         }
      }
   }

   @Override
   public void a(xi $$0) {
      vf.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(zr $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(ye $$0) {
      vf.a($$0, this, this.a);
      dha $$1 = this.o.B_();
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
   public void a(zm $$0) {
      vf.a($$0, this, this.a);
      this.o.B_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(zn $$0) {
      vf.a($$0, this, this.a);
      this.o.B_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zo $$0) {
      vf.a($$0, this, this.a);
      this.o.B_().a($$0.a());
   }

   @Override
   public void a(zq $$0) {
      vf.a($$0, this, this.a);
      this.o.B_().c($$0.a());
   }

   @Override
   public void a(zp $$0) {
      vf.a($$0, this, this.a);
      this.o.B_().b($$0.a());
   }

   @Override
   public void a(xm $$0) {
      vf.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(zk $$0) {
      vf.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().map(fjh::b).ifPresent(this.c::a);
         this.c.a($$0.e());
         fji.b(this.c);
         if (!this.K && !$$0.e()) {
            euw $$1 = euw.a(this.a, euw.a.h, h, i);
            this.a.ay().a($$1);
            this.K = true;
         }
      }
   }

   @Override
   public void a(xu $$0) {
      vf.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(zl $$0) {
      vf.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(aak $$0) {
      vf.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(aai $$0) {
      vf.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(aal $$0) {
      vf.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aar $$0) {
      vf.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(zf $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = $$0.a(this.o);
      if ($$1 instanceof bjg) {
         ((bjg)$$1).c($$0.a());
      }
   }

   @Override
   public void a(yz $$0) {
      vf.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aK().f($$1);
         fjf $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(za $$0) {
      vf.a($$0, this, this.a);

      for (za.b $$1 : $$0.e()) {
         fjf $$2 = new fjf(Objects.requireNonNull($$1.b()), this.z());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aK().a($$2);
         }
      }

      for (za.b $$3 : $$0.d()) {
         fjf $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (za.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(za.a $$0, za.b $$1, fjf $$2) {
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

   private void a(za.b $$0, fjf $$1) {
      GameProfile $$2 = $$1.a();
      ash $$3 = this.a.aT();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.z());
      } else {
         ub.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               ub $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cbx.b var7) {
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
   public void a(yu $$0) {
      vf.a($$0, this, this.a);
      cbu $$1 = this.a.s;
      $$1.fS().b = $$0.d();
      $$1.fS().d = $$0.f();
      $$1.fS().a = $$0.a();
      $$1.fS().c = $$0.e();
      $$1.fS().a($$0.g());
      $$1.fS().b($$0.h());
   }

   @Override
   public void a(aan $$0) {
      vf.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(aam $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(xg $$0) {
      vf.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(xt $$0) {
      vf.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.gm().b($$0.a());
      } else {
         this.a.s.gm().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(yp $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.a.s.cV();
      if ($$1 != this.a.s && $$1.cW()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new abz($$1));
      }
   }

   @Override
   public void a(yq $$0) {
      vf.a($$0, this, this.a);
      cjf $$1 = this.a.s.b($$0.a());
      if ($$1.a(cji.th)) {
         this.a.a(new ezp(new ezp.c($$1)));
      }
   }

   @Override
   public void a(vw $$0) {
      if ($$0 instanceof wf $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof we $$2) {
         ((fru)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof wk $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof wm $$4) {
         ((fsc)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof wi $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof wg $$6) {
         frj.a $$7 = new frj.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof wh $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof wl $$9) {
         fsa $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof wc $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof vu $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof vt $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof wd $$14) {
         this.a.k.o.a($$14.b(), this.o.V());
      } else if ($$0 instanceof wa $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof wb) {
         this.a.k.r.a();
      } else if ($$0 instanceof wj $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof vy $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof vz $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else {
         this.b($$0);
      }
   }

   private void b(vw $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(aad $$0) {
      vf.a($$0, this, this.a);
      eim $$1 = this.o.I();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, eip.a, $$0.d(), $$0.f());
      } else {
         eij $$3 = $$1.b($$2);
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
   public void a(aag $$0) {
      vf.a($$0, this, this.a);
      eim $$1 = this.o.I();
      String $$2 = $$0.d();
      switch ($$0.f()) {
         case a:
            eij $$3 = $$1.b($$2);
            if ($$3 != null) {
               eil $$4 = $$1.c($$0.a(), $$3);
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
   public void a(zw $$0) {
      vf.a($$0, this, this.a);
      eim $$1 = this.o.I();
      String $$2 = $$0.d();
      eij $$3 = $$2 == null ? null : $$1.b($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(aaf $$0) {
      vf.a($$0, this, this.a);
      eim $$1 = this.o.I();
      aaf.a $$2 = $$0.d();
      eik $$3;
      if ($$2 == aaf.a.a) {
         $$3 = $$1.e($$0.e());
      } else {
         $$3 = $$1.d($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<aaf.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         eio.b $$2x = eio.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         eio.a $$3x = eio.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      aaf.a $$6 = $$0.a();
      if ($$6 == aaf.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == aaf.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == aaf.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(yi $$0) {
      vf.a($$0, this, this.a);
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
   public void a(aaw $$0) {
      vf.a($$0, this, this.a);
      biq $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bjg)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bkj $$2 = ((bjg)$$1).eQ();

            for (aaw.a $$3 : $$0.d()) {
               bki $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, jb.v.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bkk $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(yt $$0) {
      vf.a($$0, this, this.a);
      cel $$1 = this.a.s.bS;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fcc) {
               fbw $$2 = ((fcc)this.a.y).G();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(yj $$0) {
      vf.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      yk $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, yk $$2) {
      eab $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cqe.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cqe.b, $$7, $$8, $$9);
      $$3.a(new cpc($$0, $$1), true);
   }

   @Override
   public void a(yn $$0) {
      vf.a($$0, this, this.a);
      cel $$1 = this.a.s.bS;
      if ($$0.a() == $$1.j && $$1 instanceof cfs $$2) {
         $$2.a($$0.d());
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(zu $$0) {
      vf.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(aah $$0) {
      vf.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(zt $$0) {
      vf.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(xb $$0) {
      vf.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(xh $$0) {
      vf.a($$0, this, this.a);

      for (vd<ww> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(xk $$0) {
      this.I.a();
   }

   @Override
   public void a(xj $$0) {
      this.I.a($$0.a());
      this.b(new abm(this.I.b()));
   }

   @Override
   public void a(adx $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, eab $$2, cqe $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, hw.a($$0, $$8, $$1), $$9 ? new dhl((byte[])$$6.next().clone()) : new dhl());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public sm l() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k() && !this.L;
   }

   public Collection<fjf> m() {
      return this.r;
   }

   public Collection<fjf> n() {
      return this.q.values();
   }

   public Collection<UUID> o() {
      return this.q.keySet();
   }

   @Nullable
   public fjf a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public fjf a(String $$0) {
      for (fjf $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile p() {
      return this.n;
   }

   public fis q() {
      return this.s;
   }

   public CommandDispatcher<dw> r() {
      return this.y;
   }

   public fix s() {
      return this.o;
   }

   public eqm t() {
      return this.u;
   }

   public UUID u() {
      return this.A;
   }

   public Set<aev<cpv>> v() {
      return this.B;
   }

   @Override
   public hr.b f() {
      return this.C;
   }

   public void a(ua $$0, boolean $$1) {
      tw $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.A();
      }
   }

   private void A() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new abi($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqw.c.a();
      ts.a $$3 = this.G.b();
      tw $$4 = this.F.pack(new ud($$0, $$1, $$2, $$3.a()));
      this.b(new abk($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = aqw.c.a();
      ts.a $$3 = this.G.b();
      dy $$4 = dy.a(uc.a(this.e($$0)), $$3x -> {
         ud $$4x = new ud($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new abj($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (uc.a(this.e($$0)).a().isEmpty()) {
         ts.a $$1 = this.G.b();
         this.b(new abj($$0, Instant.now(), 0L, dy.a, $$1.b()));
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
         fjg $$0 = this.a.w();
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

   public void a(cbw $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = tv.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new abl(this.E.a().a()));
         }
      }
   }

   @Nullable
   public fjh w() {
      return this.c;
   }

   public cec x() {
      return this.D;
   }

   public boolean a(cec $$0) {
      return $$0.a(this.x());
   }
}
