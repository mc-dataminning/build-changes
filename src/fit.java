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

public class fit extends fip implements ta, wx {
   private static final Logger g = LogUtils.getLogger();
   private static final tl h = tl.c("multiplayer.unsecureserver.toast.title");
   private static final tl i = tl.c("multiplayer.unsecureserver.toast");
   private static final tl j = tl.c("multiplayer.disconnect.invalid_packet");
   private static final tl k = tl.c("multiplayer.disconnect.chat_validation_failed");
   private static final tl l = tl.c("connect.reconfiguring");
   private static final int m = 64;
   private final GameProfile n;
   private fis o;
   private fis.a p;
   private final Map<UUID, fjb> q = Maps.newHashMap();
   private final Set<fjb> r = new ReferenceOpenHashSet();
   private final fin s;
   private final fiv t;
   private final eqg u = new eqg(this);
   private int v = 3;
   private int w = 3;
   private final ash x = ash.b();
   private CommandDispatcher<dw> y = new CommandDispatcher();
   private final cmr z = new cmr();
   private final UUID A = UUID.randomUUID();
   private Set<aey<cqb>> B;
   private final hr.b C;
   private final cei D;
   @Nullable
   private tw E;
   private uf.c F = uf.c.a;
   private tt G = new tt(20);
   private ty H = ty.a();
   private final fim I = new fim();
   private final fja J;
   @Nullable
   private fiy K;
   private boolean L = false;
   private volatile boolean M;

   public fit(eqp $$0, sm $$1, fiw $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.C = $$2.c();
      this.D = $$2.d();
      this.s = new fin($$0, this.e);
      this.t = new fiv(this, $$0);
      this.J = new fja(this, $$0.aN().k());
   }

   public fiv i() {
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

   public cmr l() {
      return this.z;
   }

   @Override
   public void a(ym $$0) {
      vg.a($$0, this, this.a);
      this.z();
      this.a.q = new fiz(this.a, this);
      aba $$1 = $$0.l();
      List<aey<cqb>> $$2 = Lists.newArrayList($$0.e());
      Collections.shuffle($$2);
      this.B = Sets.newLinkedHashSet($$2);
      aey<cqb> $$3 = $$1.b();
      he<dim> $$4 = this.C.d(jc.av).f($$1.a());
      this.v = $$0.g();
      this.w = $$0.h();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      fis.a $$7 = new fis.a(bhb.c, $$0.d(), $$6);
      this.p = $$7;
      this.o = new fis(this, $$7, $$3, $$4, this.v, this.w, this.a::aG, this.a.f, $$5, $$1.c());
      this.a.a(this.o);
      if (this.a.s == null) {
         this.a.s = this.a.q.a(this.o, new apr(), new eqc());
         this.a.s.r(-180.0F);
         if (this.a.T() != null) {
            this.a.T().a(this.a.s.cv());
         }
      }

      this.a.k.a();
      this.a.s.x();
      this.a.s.e($$0.a());
      this.o.c(this.a.s);
      this.a.s.co = new fnb(this.a.m);
      this.a.q.a(this.a.s);
      this.a.t = this.a.s;
      this.a(this.a.s, this.o);
      this.a.s.u($$0.i());
      this.a.s.b($$0.j());
      this.a.s.v($$0.k());
      this.a.s.a($$1.h());
      this.a.s.f($$1.i());
      this.a.q.a($$1.d(), $$1.e());
      this.a.m.b($$0.g());
      this.E = null;
      this.G = new tt(20);
      this.H = ty.a();
      if (this.b.j()) {
         this.a.w().a().thenAcceptAsync($$0x -> $$0x.ifPresent(this::a), this.a);
      }

      this.e.a($$1.d(), $$0.d());
      this.a.aZ().a(this.a);
   }

   @Override
   public void a(wy $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.o.c($$1);
         this.a($$1);
      } else {
         g.warn("Skipping Entity with id {}", $$0.e());
      }
   }

   @Nullable
   private biw b(wy $$0) {
      bja<?> $$1 = $$0.e();
      if ($$1 == bja.bt) {
         fjb $$2 = this.a($$0.d());
         if ($$2 == null) {
            g.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.d());
            return null;
         } else {
            return new fnd(this.o, $$2.a());
         }
      } else {
         return $$1.a((cqb)this.o);
      }
   }

   private void a(biw $$0) {
      if ($$0 instanceof cdr $$1) {
         this.a.ai().a((gci)(new gcb($$1)));
      } else if ($$0 instanceof buy $$2) {
         boolean $$3 = $$2.X_();
         gbv $$4;
         if ($$3) {
            $$4 = new gbt($$2);
         } else {
            $$4 = new gbu($$2);
         }

         this.a.ai().a((gcj)$$4);
      }
   }

   @Override
   public void a(wz $$0) {
      vg.a($$0, this, this.a);
      double $$1 = $$0.d();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      biw $$4 = new bjc(this.o, $$1, $$2, $$3, $$0.g());
      $$4.f($$1, $$2, $$3);
      $$4.r(0.0F);
      $$4.s(0.0F);
      $$4.e($$0.a());
      this.o.c($$4);
   }

   @Override
   public void a(aaa $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.l((double)$$0.d() / 8000.0, (double)$$0.e() / 8000.0, (double)$$0.f() / 8000.0);
      }
   }

   @Override
   public void a(zy $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.al().a($$0.d());
      }
   }

   @Override
   public void a(aav $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
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
   public void a(zt $$0) {
      vg.a($$0, this, this.a);
      if (cbz.d($$0.a())) {
         this.a.s.fS().l = $$0.a();
      }
   }

   @Override
   public void a(yp $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         if (!$$1.cW()) {
            if ($$0.i()) {
               acz $$2 = $$1.af();
               ehh $$3 = $$2.a((long)$$0.a(), (long)$$0.d(), (long)$$0.e());
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
   public void a(zi $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         float $$2 = (float)($$0.a() * 360) / 256.0F;
         $$1.a($$2, 3);
      }
   }

   @Override
   public void a(zf $$0) {
      vg.a($$0, this, this.a);
      $$0.a().forEach($$0x -> this.o.a($$0x, biw.c.b));
   }

   @Override
   public void a(zd $$0) {
      vg.a($$0, this, this.a);
      cca $$1 = this.a.s;
      ehh $$2 = $$1.do();
      boolean $$3 = $$0.i().contains(bka.a);
      boolean $$4 = $$0.i().contains(bka.b);
      boolean $$5 = $$0.i().contains(bka.c);
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
      if ($$0.i().contains(bka.e)) {
         $$1.s($$1.dD() + $$19);
         $$1.O += $$19;
      } else {
         $$1.s($$19);
         $$1.O = $$19;
      }

      if ($$0.i().contains(bka.d)) {
         $$1.r($$1.dB() + $$18);
         $$1.N += $$18;
      } else {
         $$1.r($$18);
         $$1.N = $$18;
      }

      this.b.a(new abg($$0.h()));
      this.b.a(new abz.b($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD(), false));
   }

   @Override
   public void a(zj $$0) {
      vg.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.o.b($$0x, $$1, 19));
   }

   @Override
   public void a(yh $$0) {
      vg.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      this.a($$1, $$2, $$0.e());
      yl $$3 = $$0.f();
      this.o.a(() -> {
         this.a($$1, $$2, $$3);
         dhk $$3x = this.o.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
         }
      });
   }

   @Override
   public void a(xm $$0) {
      vg.a($$0, this, this.a);

      for (xm.a $$1 : $$0.a()) {
         this.o.i().a($$1.b().e, $$1.b().f, $$1.a());
      }

      for (xm.a $$2 : $$0.a()) {
         this.o.a(new cpi($$2.b().e, $$2.b().f));
      }

      for (xm.a $$3 : $$0.a()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.o.al(); $$6 < this.o.am(); $$6++) {
                  this.a.f.b($$3.b().e + $$4, $$6, $$3.b().f + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, yg $$2) {
      this.o.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(dhk $$0, int $$1, int $$2) {
      dzv $$3 = this.o.i().p();
      dhl[] $$4 = $$0.d();
      cpi $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         dhl $$7 = $$4[$$6];
         int $$8 = this.o.g($$6);
         $$3.a(hw.a($$5, $$8), $$7.c());
         this.o.c($$1, $$8, $$2);
      }
   }

   @Override
   public void a(yb $$0) {
      vg.a($$0, this, this.a);
      this.o.i().a($$0.a());
      this.b($$0);
   }

   private void b(yb $$0) {
      cpi $$1 = $$0.a();
      this.o.a(() -> {
         dzv $$1x = this.o.x_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            hw $$3 = hw.a($$1, $$2);
            $$1x.a(cqk.b, $$3, null);
            $$1x.a(cqk.a, $$3, null);
         }

         for (int $$4 = this.o.al(); $$4 < this.o.am(); $$4++) {
            $$1x.a(hw.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(xg $$0) {
      vg.a($$0, this, this.a);
      this.o.b($$0.d(), $$0.a(), 19);
   }

   @Override
   public void a(aap $$0) {
      this.b.a();
      vg.a($$0, this, this.a);
      this.a.c(new fbe(l, this.b));
      this.b.a(new fiq(this.a, this.b, new fiw(this.n, this.e, this.C, this.D, this.d, this.c, this.f)));
      this.b.b();
      this.b(new abq());
   }

   @Override
   public void a(aau $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      bjm $$2 = (bjm)this.o.a($$0.d());
      if ($$2 == null) {
         $$2 = this.a.s;
      }

      if ($$1 != null) {
         if ($$1 instanceof bjc) {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apg.hA, aph.h, 0.1F, (this.x.i() - this.x.i()) * 0.35F + 0.9F, false);
         } else {
            this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apg.ma, aph.h, 0.2F, (this.x.i() - this.x.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new flk(this.a.ao(), this.a.aO(), this.o, $$1, $$2));
         if ($$1 instanceof byt $$3) {
            cjl $$4 = $$3.q();
            if (!$$4.b()) {
               $$4.h($$0.e());
            }

            if ($$4.b()) {
               this.o.a($$0.a(), biw.c.b);
            }
         } else if (!($$1 instanceof bjc)) {
            this.o.a($$0.a(), biw.c.b);
         }
      }
   }

   @Override
   public void a(aar $$0) {
      vg.a($$0, this, this.a);
      this.a.aW().a($$0.a(), $$0.d());
   }

   @Override
   public void a(yw $$0) {
      vg.a($$0, this, this.a);
      Optional<ue> $$1 = $$0.f().a(this.H);
      Optional<th.a> $$2 = $$0.i().a(this.C);
      if (!$$1.isEmpty() && !$$2.isEmpty()) {
         UUID $$3 = $$0.a();
         fjb $$4 = this.a($$3);
         if ($$4 == null) {
            g.error("Received player chat packet for unknown player with ID: {}", $$3);
            this.b.a(k);
         } else {
            uc $$5 = $$4.b();
            ug $$6;
            if ($$5 != null) {
               $$6 = new ug($$0.d(), $$3, $$5.c());
            } else {
               $$6 = ug.a($$3);
            }

            ub $$8 = new ub($$6, $$0.e(), $$1.get(), $$0.g(), $$0.h());
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
   public void a(xy $$0) {
      vg.a($$0, this, this.a);
      Optional<th.a> $$1 = $$0.d().a(this.C);
      if ($$1.isEmpty()) {
         this.b.a(j);
      } else {
         this.a.aW().a($$0.a(), $$1.get());
      }
   }

   @Override
   public void a(xx $$0) {
      vg.a($$0, this, this.a);
      Optional<tx> $$1 = $$0.a().a(this.H);
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
   public void a(xa $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if ($$0.d() == 0) {
            bjm $$2 = (bjm)$$1;
            $$2.a(bhd.a);
         } else if ($$0.d() == 3) {
            bjm $$3 = (bjm)$$1;
            $$3.a(bhd.b);
         } else if ($$0.d() == 2) {
            cca $$4 = (cca)$$1;
            $$4.a(false, false);
         } else if ($$0.d() == 4) {
            this.a.g.a($$1, iv.g);
         } else if ($$0.d() == 5) {
            this.a.g.a($$1, iv.s);
         }
      }
   }

   @Override
   public void a(ye $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.m($$0.d());
      }
   }

   @Override
   public void a(aak $$0) {
      vg.a($$0, this, this.a);
      this.a.r.b($$0.a());
      this.a.r.c($$0.d());
      this.e.a($$0.a());
   }

   @Override
   public void a(zw $$0) {
      vg.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d());
   }

   @Override
   public void a(aaf $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.d());
      if ($$1 == null) {
         g.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.z(this.a.s);
         $$1.bA();

         for (int $$3 : $$0.a()) {
            biw $$4 = this.o.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.s && !$$2) {
                  if ($$1 instanceof cdt) {
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
   public void a(zz $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 instanceof bjo) {
         ((bjo)$$1).r($$0.d());
      }
   }

   private static cjl a(cca $$0) {
      for (bhd $$1 : bhd.values()) {
         cjl $$2 = $$0.b($$1);
         if ($$2.a(cjo.uz)) {
            return $$2;
         }
      }

      return new cjl(cjo.uz);
   }

   @Override
   public void a(xz $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         switch ($$0.a()) {
            case 21:
               this.a.ai().a((gci)(new gca((bzk)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, iv.ae, 30);
               this.o.a($$1.dq(), $$1.ds(), $$1.dw(), apg.xM, $$1.da(), 1.0F, 1.0F, false);
               if ($$1 == this.a.s) {
                  this.a.j.a(a((cca)this.a.s));
               }
               break;
            case 63:
               this.a.ai().a((gci)(new gce((bxj)$$1)));
               break;
            default:
               $$1.b($$0.a());
         }
      }
   }

   @Override
   public void a(xw $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$1.c($$0.a(this.o));
      }
   }

   @Override
   public void a(aad $$0) {
      vg.a($$0, this, this.a);
      this.a.s.D($$0.a());
      this.a.s.gc().a($$0.d());
      this.a.s.gc().b($$0.e());
   }

   @Override
   public void a(aac $$0) {
      vg.a($$0, this, this.a);
      this.a.s.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zh $$0) {
      vg.a($$0, this, this.a);
      aba $$1 = $$0.a();
      aey<cqb> $$2 = $$1.b();
      he<dim> $$3 = this.C.d(jc.av).f($$1.a());
      fnc $$4 = this.a.s;
      if ($$2 != $$4.dL().ac()) {
         eig $$5 = this.o.I();
         Map<String, ebq> $$6 = this.o.l();
         boolean $$7 = $$1.f();
         boolean $$8 = $$1.g();
         fis.a $$9 = new fis.a(this.p.s(), this.p.n(), $$8);
         this.p = $$9;
         this.o = new fis(this, $$9, $$2, $$3, this.v, this.w, this.a::aG, this.a.f, $$7, $$1.c());
         this.o.a($$5);
         this.o.a($$6);
         this.a.a(this.o);
      }

      this.a.t = null;
      if ($$4.fU()) {
         $$4.q();
      }

      fnc $$10;
      if ($$0.a((byte)2)) {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m(), $$4.bR(), $$4.bX());
      } else {
         $$10 = this.a.q.a(this.o, $$4.j(), $$4.m());
      }

      this.a($$10, this.o);
      $$10.e($$4.ah());
      this.a.s = $$10;
      if ($$2 != $$4.dL().ac()) {
         this.a.s().b();
      }

      this.a.t = $$10;
      if ($$0.a((byte)2)) {
         List<aei.b<?>> $$12 = $$4.al().c();
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
      $$10.co = new fnb(this.a.m);
      this.a.q.a($$10);
      $$10.u($$4.gi());
      $$10.b($$4.o());
      $$10.a($$1.h());
      $$10.f($$1.i());
      $$10.cv = $$4.cv;
      $$10.cw = $$4.cw;
      if (this.a.y instanceof exe || this.a.y instanceof exe.a) {
         this.a.a(null);
      }

      this.a.q.a($$1.d(), $$1.e());
   }

   @Override
   public void a(ya $$0) {
      vg.a($$0, this, this.a);
      cpt $$1 = new cpt(this.a.r, null, $$0.f(), $$0.g(), $$0.h(), $$0.i(), $$0.j());
      $$1.a(true);
      this.a.s.f(this.a.s.do().b((double)$$0.a(), (double)$$0.d(), (double)$$0.e()));
   }

   @Override
   public void a(yd $$0) {
      vg.a($$0, this, this.a);
      if (this.o.a($$0.e()) instanceof bww $$2) {
         fnc $$3 = this.a.s;
         bhl $$4 = new bhl($$0.d());
         cfp $$5 = new cfp($$0.a(), $$3.fS(), $$4, $$2);
         $$3.bS = $$5;
         this.a.a(new fab($$5, $$3.fS(), $$2));
      }
   }

   @Override
   public void a(ys $$0) {
      vg.a($$0, this, this.a);
      exs.a($$0.d(), this.a, $$0.a(), $$0.e());
   }

   @Override
   public void a(xt $$0) {
      vg.a($$0, this, this.a);
      cca $$1 = this.a.s;
      cjl $$2 = $$0.e();
      int $$3 = $$0.d();
      this.a.az().a($$2);
      if ($$0.a() == -1) {
         if (!(this.a.y instanceof ezr)) {
            $$1.bS.b($$2);
         }
      } else if ($$0.a() == -2) {
         $$1.fS().a($$3, $$2);
      } else {
         boolean $$4 = false;
         if (this.a.y instanceof ezr $$5) {
            $$4 = !$$5.F();
         }

         if ($$0.a() == 0 && cfq.f($$3)) {
            if (!$$2.b()) {
               cjl $$6 = $$1.bR.b($$3).e();
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
   public void a(xr $$0) {
      vg.a($$0, this, this.a);
      cca $$1 = this.a.s;
      if ($$0.a() == 0) {
         $$1.bR.a($$0.f(), $$0.d(), $$0.e());
      } else if ($$0.a() == $$1.bS.j) {
         $$1.bS.a($$0.f(), $$0.d(), $$0.e());
      }
   }

   @Override
   public void a(yt $$0) {
      vg.a($$0, this, this.a);
      gw $$1 = $$0.a();
      if (this.o.c_($$1) instanceof deh $$2) {
         this.a.s.a($$2, $$0.d());
      } else {
         dfd $$3 = this.o.a_($$1);
         deh $$4 = new deh($$1, $$3);
         $$4.a(this.o);
         this.a.s.a($$4, $$0.d());
      }
   }

   @Override
   public void a(xe $$0) {
      vg.a($$0, this, this.a);
      gw $$1 = $$0.a();
      this.a.r.a($$1, $$0.d()).ifPresent($$1x -> {
         qw $$2 = $$0.e();
         if ($$2 != null) {
            $$1x.a($$2);
         }

         if ($$1x instanceof ddj && this.a.y instanceof ezn) {
            ((ezn)this.a.y).F();
         }
      });
   }

   @Override
   public void a(xs $$0) {
      vg.a($$0, this, this.a);
      cca $$1 = this.a.s;
      if ($$1.bS != null && $$1.bS.j == $$0.a()) {
         $$1.bS.a($$0.d(), $$0.e());
      }
   }

   @Override
   public void a(aab $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         $$0.d().forEach($$1x -> $$1.a((bjb)$$1x.getFirst(), (cjl)$$1x.getSecond()));
      }
   }

   @Override
   public void a(xq $$0) {
      vg.a($$0, this, this.a);
      this.a.s.e();
   }

   @Override
   public void a(xf $$0) {
      vg.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.f(), $$0.d(), $$0.e());
   }

   @Override
   public void a(xd $$0) {
      vg.a($$0, this, this.a);
      this.a.r.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(yc $$0) {
      vg.a($$0, this, this.a);
      cca $$1 = this.a.s;
      yc.a $$2 = $$0.a();
      float $$3 = $$0.d();
      int $$4 = asb.d($$3 + 0.5F);
      if ($$2 == yc.a) {
         $$1.a(tl.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == yc.b) {
         this.o.k().b(true);
         this.o.e(0.0F);
      } else if ($$2 == yc.c) {
         this.o.k().b(false);
         this.o.e(1.0F);
      } else if ($$2 == yc.d) {
         this.a.q.a(cpy.a($$4));
      } else if ($$2 == yc.e) {
         if ($$4 == 0) {
            this.a.s.cn.b(new abo(abo.a.a));
            this.a.a(new eyd(() -> false));
         } else if ($$4 == 1) {
            this.a.a(new eym(true, () -> {
               this.a.s.cn.b(new abo(abo.a.a));
               this.a.a(null);
            }));
         }
      } else if ($$2 == yc.f) {
         eqt $$5 = this.a.m;
         if ($$3 == 0.0F) {
            this.a.a(new exf());
         } else if ($$3 == 101.0F) {
            this.a.l.d().a(tl.a("demo.help.movement", $$5.x.k(), $$5.y.k(), $$5.z.k(), $$5.A.k()));
         } else if ($$3 == 102.0F) {
            this.a.l.d().a(tl.a("demo.help.jump", $$5.B.k()));
         } else if ($$3 == 103.0F) {
            this.a.l.d().a(tl.a("demo.help.inventory", $$5.E.k()));
         } else if ($$3 == 104.0F) {
            this.a.l.d().a(tl.a("demo.day.6", $$5.O.k()));
         }
      } else if ($$2 == yc.g) {
         this.o.a($$1, $$1.dq(), $$1.du(), $$1.dw(), apg.aq, aph.h, 0.18F, 0.45F);
      } else if ($$2 == yc.h) {
         this.o.e($$3);
      } else if ($$2 == yc.i) {
         this.o.c($$3);
      } else if ($$2 == yc.j) {
         this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apg.ti, aph.g, 1.0F, 1.0F);
      } else if ($$2 == yc.k) {
         this.o.a(iv.r, $$1.dq(), $$1.ds(), $$1.dw(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.o.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apg.gJ, aph.f, 1.0F, 1.0F);
         }
      } else if ($$2 == yc.l) {
         this.a.s.b($$3 == 0.0F);
      } else if ($$2 == yc.m) {
         this.a.s.v($$3 == 1.0F);
      } else if ($$2 == yc.n && this.K != null) {
         this.K.c();
      }
   }

   private void a(fnc $$0, fis $$1) {
      this.K = new fiy($$0, $$1, this.a.f);
      this.a.a(new eyd(this.K::b));
   }

   @Override
   public void a(yn $$0) {
      vg.a($$0, this, this.a);
      esb $$1 = this.a.j.j();
      int $$2 = $$0.a();
      String $$3 = cjs.a($$2);
      ebq $$4 = this.a.r.a($$3);
      if ($$4 == null) {
         $$4 = ebq.a($$0.d(), $$0.e(), this.a.r.ac());
         this.a.r.b($$3, $$4);
      }

      $$0.a($$4);
      $$1.a($$2, $$4);
   }

   @Override
   public void a(yi $$0) {
      vg.a($$0, this, this.a);
      if ($$0.a()) {
         this.a.r.b($$0.d(), $$0.f(), $$0.e());
      } else {
         this.a.r.c($$0.d(), $$0.f(), $$0.e());
      }
   }

   @Override
   public void a(aaw $$0) {
      vg.a($$0, this, this.a);
      this.s.a($$0);
   }

   @Override
   public void a(zk $$0) {
      vg.a($$0, this, this.a);
      aez $$1 = $$0.a();
      if ($$1 == null) {
         this.s.a(null, false);
      } else {
         af $$2 = this.s.a($$1);
         this.s.a($$2, false);
      }
   }

   @Override
   public void a(xp $$0) {
      vg.a($$0, this, this.a);
      this.y = new CommandDispatcher($$0.a(dn.a((hg.b)this.C, this.D)));
   }

   @Override
   public void a(aaq $$0) {
      vg.a($$0, this, this.a);
      this.a.ai().a($$0.a(), $$0.d());
   }

   @Override
   public void a(xo $$0) {
      vg.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(aaz $$0) {
      vg.a($$0, this, this.a);
      this.z.a($$0.a());
      eqc $$1 = this.a.s.m();
      $$1.a(this.z.b(), this.a.r.G_());
      this.a.a(gcu.c, $$1.b());
   }

   @Override
   public void a(zc $$0) {
      vg.a($$0, this, this.a);
      ehh $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.s.a($$0.a(), $$1);
      }
   }

   @Override
   public void a(aat $$0) {
      vg.a($$0, this, this.a);
      if (!this.u.a($$0.a(), $$0.d())) {
         g.debug("Got unhandled response to tag query {}", $$0.a());
      }
   }

   @Override
   public void a(xb $$0) {
      vg.a($$0, this, this.a);

      for (Entry<apn<?>, Integer> $$1 : $$0.a().entrySet()) {
         apn<?> $$2 = $$1.getKey();
         int $$3 = $$1.getValue();
         this.a.s.j().a(this.a.s, $$2, $$3);
      }

      if (this.a.y instanceof eyo) {
         ((eyo)this.a.y).E();
      }
   }

   @Override
   public void a(ze $$0) {
      vg.a($$0, this, this.a);
      eqc $$1 = this.a.s.m();
      $$1.a($$0.e());
      ze.a $$2 = $$0.f();
      switch ($$2) {
         case c:
            for (aez $$3 : $$0.a()) {
               this.z.a($$3).ifPresent($$1::c);
            }
            break;
         case a:
            for (aez $$4 : $$0.a()) {
               this.z.a($$4).ifPresent($$1::a);
            }

            for (aez $$5 : $$0.d()) {
               this.z.a($$5).ifPresent($$1::f);
            }
            break;
         case b:
            for (aez $$6 : $$0.a()) {
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
         ((fbx)this.a.y).F();
      }
   }

   @Override
   public void a(aay $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 instanceof bjm) {
         bih $$2 = $$0.d();
         if ($$2 != null) {
            bij $$3 = new bij($$2, $$0.f(), $$0.e(), $$0.h(), $$0.g(), $$0.i(), null, Optional.ofNullable($$0.j()));
            ((bjm)$$1).c($$3, null);
         }
      }
   }

   @Override
   public void a(vn $$0) {
      super.a($$0);
      this.z();
   }

   private void z() {
      if (!this.b.g()) {
         cte.a();
      }

      chs.e().n();
   }

   @Override
   public void a(yx $$0) {
   }

   @Override
   public void a(yy $$0) {
   }

   @Override
   public void a(yz $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 == this.a.s) {
         if (this.a.s.o()) {
            this.a.a(new exe($$0.d(), this.o.k().n()));
         } else {
            this.a.s.fQ();
         }
      }
   }

   @Override
   public void a(xj $$0) {
      vg.a($$0, this, this.a);
      this.p.a($$0.d());
      this.p.a($$0.a());
   }

   @Override
   public void a(zs $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = $$0.a(this.o);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(yf $$0) {
      vg.a($$0, this, this.a);
      dgu $$1 = this.o.B_();
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
   public void a(zn $$0) {
      vg.a($$0, this, this.a);
      this.o.B_().c($$0.d(), $$0.a());
   }

   @Override
   public void a(zo $$0) {
      vg.a($$0, this, this.a);
      this.o.B_().a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(zp $$0) {
      vg.a($$0, this, this.a);
      this.o.B_().a($$0.a());
   }

   @Override
   public void a(zr $$0) {
      vg.a($$0, this, this.a);
      this.o.B_().c($$0.a());
   }

   @Override
   public void a(zq $$0) {
      vg.a($$0, this, this.a);
      this.o.B_().b($$0.a());
   }

   @Override
   public void a(xn $$0) {
      vg.a($$0, this, this.a);
      this.a.l.c();
      if ($$0.a()) {
         this.a.l.a();
      }
   }

   @Override
   public void a(zl $$0) {
      vg.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.a();
         $$0.d().map(fjd::b).ifPresent(this.c::a);
         this.c.a($$0.e());
         fje.b(this.c);
         if (!this.L && !$$0.e()) {
            eur $$1 = eur.a(this.a, eur.a.h, h, i);
            this.a.ay().a($$1);
            this.L = true;
         }
      }
   }

   @Override
   public void a(xv $$0) {
      vg.a($$0, this, this.a);
      this.t.a($$0.a(), $$0.d());
   }

   @Override
   public void a(zm $$0) {
      vg.a($$0, this, this.a);
      this.a.l.a($$0.a(), false);
   }

   @Override
   public void a(aal $$0) {
      vg.a($$0, this, this.a);
      this.a.l.c($$0.a());
   }

   @Override
   public void a(aaj $$0) {
      vg.a($$0, this, this.a);
      this.a.l.b($$0.a());
   }

   @Override
   public void a(aam $$0) {
      vg.a($$0, this, this.a);
      this.a.l.a($$0.a(), $$0.d(), $$0.e());
   }

   @Override
   public void a(aas $$0) {
      vg.a($$0, this, this.a);
      this.a.l.h().b($$0.a().getString().isEmpty() ? null : $$0.a());
      this.a.l.h().a($$0.d().getString().isEmpty() ? null : $$0.d());
   }

   @Override
   public void a(zg $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = $$0.a(this.o);
      if ($$1 instanceof bjm) {
         ((bjm)$$1).c($$0.a());
      }
   }

   @Override
   public void a(za $$0) {
      vg.a($$0, this, this.a);

      for (UUID $$1 : $$0.a()) {
         this.a.aK().f($$1);
         fjb $$2 = this.q.remove($$1);
         if ($$2 != null) {
            this.r.remove($$2);
         }
      }
   }

   @Override
   public void a(zb $$0) {
      vg.a($$0, this, this.a);

      for (zb.b $$1 : $$0.e()) {
         fjb $$2 = new fjb(Objects.requireNonNull($$1.b()), this.A());
         if (this.q.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aK().a($$2);
         }
      }

      for (zb.b $$3 : $$0.d()) {
         fjb $$4 = this.q.get($$3.a());
         if ($$4 == null) {
            g.warn("Ignoring player info update for unknown player {}", $$3.a());
         } else {
            for (zb.a $$5 : $$0.a()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(zb.a $$0, zb.b $$1, fjb $$2) {
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

   private void a(zb.b $$0, fjb $$1) {
      GameProfile $$2 = $$1.a();
      asm $$3 = this.a.aT();
      if ($$3 == null) {
         g.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.A());
      } else {
         uc.a $$4 = $$0.g();
         if ($$4 != null) {
            try {
               uc $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (ccd.b var7) {
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
   public void a(yv $$0) {
      vg.a($$0, this, this.a);
      cca $$1 = this.a.s;
      $$1.fT().b = $$0.d();
      $$1.fT().d = $$0.f();
      $$1.fT().a = $$0.a();
      $$1.fT().c = $$0.e();
      $$1.fT().a($$0.g());
      $$1.fT().b($$0.h());
   }

   @Override
   public void a(aao $$0) {
      vg.a($$0, this, this.a);
      this.a.r.a(this.a.s, $$0.e(), $$0.f(), $$0.g(), $$0.a(), $$0.d(), $$0.h(), $$0.i(), $$0.j());
   }

   @Override
   public void a(aan $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.e());
      if ($$1 != null) {
         this.a.r.a(this.a.s, $$1, $$0.a(), $$0.d(), $$0.f(), $$0.g(), $$0.h());
      }
   }

   @Override
   public void a(xh $$0) {
      vg.a($$0, this, this.a);
      this.a.l.j().a($$0);
   }

   @Override
   public void a(xu $$0) {
      vg.a($$0, this, this.a);
      if ($$0.d() == 0) {
         this.a.s.gn().b($$0.a());
      } else {
         this.a.s.gn().a($$0.a(), $$0.d());
      }
   }

   @Override
   public void a(yq $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.a.s.cV();
      if ($$1 != this.a.s && $$1.cW()) {
         $$1.a($$0.a(), $$0.d(), $$0.e(), $$0.f(), $$0.g());
         this.b.a(new aca($$1));
      }
   }

   @Override
   public void a(yr $$0) {
      vg.a($$0, this, this.a);
      cjl $$1 = this.a.s.b($$0.a());
      if ($$1.a(cjo.th)) {
         this.a.a(new ezk(new ezk.c($$1)));
      }
   }

   @Override
   public void a(vx $$0) {
      if ($$0 instanceof wg $$1) {
         this.a.k.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof wf $$2) {
         ((frq)this.a.k.g).a($$2.b(), $$2.c());
      } else if ($$0 instanceof wl $$3) {
         this.a.k.h.a($$3.c(), $$3.d(), $$3.b());
      } else if ($$0 instanceof wn $$4) {
         ((fry)this.a.k.j).a($$4.b(), $$4.c(), $$4.d(), $$4.e(), $$4.f(), $$4.g());
      } else if ($$0 instanceof wj $$5) {
         this.a.k.m.a($$5.b(), $$5.c());
      } else if ($$0 instanceof wh $$6) {
         frf.a $$7 = new frf.a($$6.b(), $$6.c(), $$6.d());
         this.a.k.m.a($$7);
      } else if ($$0 instanceof wi $$8) {
         this.a.k.m.a($$8.b());
      } else if ($$0 instanceof wm $$9) {
         frw $$10 = this.a.k.n;
         $$9.b().forEach($$10::a);
         $$9.c().forEach($$10::b);
      } else if ($$0 instanceof wd $$11) {
         this.a.k.q.a($$11.b(), $$11.c(), $$11.d());
      } else if ($$0 instanceof vv $$12) {
         this.a.k.m.a($$12.b());
      } else if ($$0 instanceof vu $$13) {
         this.a.k.o.a($$13.b());
      } else if ($$0 instanceof we $$14) {
         this.a.k.o.a($$14.b(), this.o.V());
      } else if ($$0 instanceof wb $$15) {
         this.a.k.r.a($$15.b(), $$15.c(), $$15.d(), $$15.e());
      } else if ($$0 instanceof wc) {
         this.a.k.r.a();
      } else if ($$0 instanceof wk $$16) {
         this.a.k.p.a($$16.b());
      } else if ($$0 instanceof vz $$17) {
         this.a.k.s.a($$17.b(), $$17.c());
      } else if ($$0 instanceof wa $$18) {
         this.a.k.s.a($$18.b(), $$18.c());
      } else {
         this.b($$0);
      }
   }

   private void b(vx $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(aae $$0) {
      vg.a($$0, this, this.a);
      eig $$1 = this.o.I();
      String $$2 = $$0.a();
      if ($$0.e() == 0) {
         $$1.a($$2, eij.a, $$0.d(), $$0.f());
      } else {
         eid $$3 = $$1.b($$2);
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
   public void a(aah $$0) {
      vg.a($$0, this, this.a);
      eig $$1 = this.o.I();
      String $$2 = $$0.d();
      switch ($$0.f()) {
         case a:
            eid $$3 = $$1.b($$2);
            if ($$3 != null) {
               eif $$4 = $$1.c($$0.a(), $$3);
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
   public void a(zx $$0) {
      vg.a($$0, this, this.a);
      eig $$1 = this.o.I();
      String $$2 = $$0.d();
      eid $$3 = $$2 == null ? null : $$1.b($$2);
      $$1.a($$0.a(), $$3);
   }

   @Override
   public void a(aag $$0) {
      vg.a($$0, this, this.a);
      eig $$1 = this.o.I();
      aag.a $$2 = $$0.d();
      eie $$3;
      if ($$2 == aag.a.a) {
         $$3 = $$1.e($$0.e());
      } else {
         $$3 = $$1.d($$0.e());
         if ($$3 == null) {
            g.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.e(), $$0.d(), $$0.a()});
            return;
         }
      }

      Optional<aag.b> $$5 = $$0.g();
      $$5.ifPresent($$1x -> {
         $$3.a($$1x.a());
         $$3.a($$1x.c());
         $$3.a($$1x.b());
         eii.b $$2x = eii.b.a($$1x.d());
         if ($$2x != null) {
            $$3.a($$2x);
         }

         eii.a $$3x = eii.a.a($$1x.e());
         if ($$3x != null) {
            $$3.a($$3x);
         }

         $$3.b($$1x.f());
         $$3.c($$1x.g());
      });
      aag.a $$6 = $$0.a();
      if ($$6 == aag.a.a) {
         for (String $$7 : $$0.f()) {
            $$1.a($$7, $$3);
         }
      } else if ($$6 == aag.a.b) {
         for (String $$8 : $$0.f()) {
            $$1.b($$8, $$3);
         }
      }

      if ($$2 == aag.a.b) {
         $$1.d($$3);
      }
   }

   @Override
   public void a(yj $$0) {
      vg.a($$0, this, this.a);
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
   public void a(aax $$0) {
      vg.a($$0, this, this.a);
      biw $$1 = this.o.a($$0.a());
      if ($$1 != null) {
         if (!($$1 instanceof bjm)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            bkp $$2 = ((bjm)$$1).eQ();

            for (aax.a $$3 : $$0.d()) {
               bko $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  g.warn("Entity {} does not have attribute {}", $$1, jb.v.b($$3.a()));
               } else {
                  $$4.a($$3.b());
                  $$4.e();

                  for (bkq $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(yu $$0) {
      vg.a($$0, this, this.a);
      cer $$1 = this.a.s.bS;
      if ($$1.j == $$0.d()) {
         this.z.a($$0.a()).ifPresent($$1x -> {
            if (this.a.y instanceof fbx) {
               fbr $$2 = ((fbx)this.a.y).G();
               $$2.a($$1x, $$1.i);
            }
         });
      }
   }

   @Override
   public void a(yk $$0) {
      vg.a($$0, this, this.a);
      int $$1 = $$0.a();
      int $$2 = $$0.d();
      yl $$3 = $$0.e();
      this.o.a(() -> this.a($$1, $$2, $$3));
   }

   private void a(int $$0, int $$1, yl $$2) {
      dzv $$3 = this.o.i().p();
      BitSet $$4 = $$2.a();
      BitSet $$5 = $$2.b();
      Iterator<byte[]> $$6 = $$2.c().iterator();
      this.a($$0, $$1, $$3, cqk.a, $$4, $$5, $$6);
      BitSet $$7 = $$2.d();
      BitSet $$8 = $$2.e();
      Iterator<byte[]> $$9 = $$2.f().iterator();
      this.a($$0, $$1, $$3, cqk.b, $$7, $$8, $$9);
      $$3.a(new cpi($$0, $$1), true);
   }

   @Override
   public void a(yo $$0) {
      vg.a($$0, this, this.a);
      cer $$1 = this.a.s.bS;
      if ($$0.a() == $$1.j && $$1 instanceof cfy $$2) {
         $$2.a($$0.d());
         $$2.f($$0.f());
         $$2.g($$0.e());
         $$2.a($$0.g());
         $$2.b($$0.h());
      }
   }

   @Override
   public void a(zv $$0) {
      vg.a($$0, this, this.a);
      this.v = $$0.a();
      this.a.m.b(this.v);
      this.o.i().a($$0.a());
   }

   @Override
   public void a(aai $$0) {
      vg.a($$0, this, this.a);
      this.w = $$0.a();
      this.o.h(this.w);
   }

   @Override
   public void a(zu $$0) {
      vg.a($$0, this, this.a);
      this.o.i().d($$0.a(), $$0.d());
   }

   @Override
   public void a(xc $$0) {
      vg.a($$0, this, this.a);
      this.o.b($$0.a());
   }

   @Override
   public void a(xi $$0) {
      vg.a($$0, this, this.a);

      for (ve<wx> $$1 : $$0.a()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(xl $$0) {
      this.I.a();
   }

   @Override
   public void a(xk $$0) {
      this.I.a($$0.a());
      this.b(new abn(this.I.b()));
   }

   @Override
   public void a(ady $$0) {
      this.J.a($$0);
   }

   private void a(int $$0, int $$1, dzv $$2, cqk $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6) {
      for (int $$7 = 0; $$7 < $$2.c(); $$7++) {
         int $$8 = $$2.d() + $$7;
         boolean $$9 = $$4.get($$7);
         boolean $$10 = $$5.get($$7);
         if ($$9 || $$10) {
            $$2.a($$3, hw.a($$0, $$8, $$1), $$9 ? new dhf((byte[])$$6.next().clone()) : new dhf());
            this.o.c($$0, $$8, $$1);
         }
      }
   }

   public sm m() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.k() && !this.M;
   }

   public Collection<fjb> n() {
      return this.r;
   }

   public Collection<fjb> o() {
      return this.q.values();
   }

   public Collection<UUID> p() {
      return this.q.keySet();
   }

   @Nullable
   public fjb a(UUID $$0) {
      return this.q.get($$0);
   }

   @Nullable
   public fjb a(String $$0) {
      for (fjb $$1 : this.q.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile q() {
      return this.n;
   }

   public fin r() {
      return this.s;
   }

   public CommandDispatcher<dw> s() {
      return this.y;
   }

   public fis t() {
      return this.o;
   }

   public eqg u() {
      return this.u;
   }

   public UUID v() {
      return this.A;
   }

   public Set<aey<cqb>> w() {
      return this.B;
   }

   @Override
   public hr.b f() {
      return this.C;
   }

   public void a(ub $$0, boolean $$1) {
      tx $$2 = $$0.k();
      if ($$2 != null && this.G.a($$2, $$1) && this.G.c() > 64) {
         this.B();
      }
   }

   private void B() {
      int $$0 = this.G.a();
      if ($$0 > 0) {
         this.b(new abj($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ara.c.a();
      tt.a $$3 = this.G.b();
      tx $$4 = this.F.pack(new ue($$0, $$1, $$2, $$3.a()));
      this.b(new abl($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = ara.c.a();
      tt.a $$3 = this.G.b();
      dy $$4 = dy.a(ud.a(this.e($$0)), $$3x -> {
         ue $$4x = new ue($$3x, $$1, $$2, $$3.a());
         return this.F.pack($$4x);
      });
      this.b(new abk($$0, $$1, $$2, $$4, $$3.b()));
   }

   public boolean d(String $$0) {
      if (ud.a(this.e($$0)).a().isEmpty()) {
         tt.a $$1 = this.G.b();
         this.b(new abk($$0, Instant.now(), 0L, dy.a, $$1.b()));
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
         fjc $$0 = this.a.w();
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

   public void a(ccc $$0) {
      if (this.a.b(this.n.getId())) {
         if (this.E == null || !this.E.c().equals($$0)) {
            this.E = tw.a($$0);
            this.F = this.E.a(this.n.getId());
            this.b(new abm(this.E.a().a()));
         }
      }
   }

   @Nullable
   public fjd x() {
      return this.c;
   }

   public cei y() {
      return this.D;
   }

   public boolean a(cei $$0) {
      return $$0.a(this.y());
   }
}
