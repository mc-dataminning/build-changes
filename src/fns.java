import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fns extends ctp {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dne e = new dne();
   private final dnk<blv> f = new dnk<>(blv.class, new fns.b());
   private final fnt D;
   private final ftf E;
   private final fns.a F;
   private final fsw G;
   private final bkl H;
   private final evi I = evi.O();
   final List<fsg> J = Lists.newArrayList();
   private emx K = new emx();
   private final Map<String, egb> L = Maps.newHashMap();
   private static final long M = 16777215L;
   private int N;
   private final Object2ObjectArrayMap<cta, ewm> O = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(fst.a, new ewm($$0xx -> this.b($$0xx, fst.a)));
      $$0x.put(fst.b, new ewm($$0xx -> this.b($$0xx, fst.b)));
      $$0x.put(fst.c, new ewm($$0xx -> this.b($$0xx, fst.c)));
   });
   private final fno P;
   private final Deque<Runnable> Q = Queues.newArrayDeque();
   private int R;
   private final fpa S = new fpa();
   private static final Set<cmt> T = Set.of(cnb.hA, cnb.hB);

   public void b(int $$0) {
      this.S.a($$0, this);
   }

   public void b(hx $$0, djh $$1, int $$2) {
      if (!this.S.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(hx $$0, djh $$1, elt $$2) {
      djh $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cfi $$4 = this.I.s;
         if (this == $$4.dM() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fpa a() {
      return this.S;
   }

   @Override
   public boolean a(hx $$0, djh $$1, int $$2, int $$3) {
      if (this.S.c()) {
         djh $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.S.a($$0, $$4, this.I.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fns(fnt $$0, fns.a $$1, ahf<ctp> $$2, ih<dmq> $$3, int $$4, int $$5, Supplier<bgs> $$6, ftf $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.f(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.P = new fno(this, $$4);
      this.H = new bkl();
      this.F = $$1;
      this.E = $$7;
      this.G = fsw.a($$3.a());
      this.a(new hx(8, 64, 8), 0.0F);
      this.R = $$5;
      this.S();
      this.V();
   }

   public void a(Runnable $$0) {
      this.Q.add($$0);
   }

   public void b() {
      int $$0 = this.Q.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.Q.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public boolean c() {
      return this.Q.isEmpty();
   }

   public fsw d() {
      return this.G;
   }

   public void a(BooleanSupplier $$0) {
      this.D_().s();
      if (this.s().i()) {
         this.n();
      }

      if (this.N > 0) {
         this.c(this.N - 1);
      }

      this.af().a("blocks");
      this.P.a($$0, true);
      this.af().c();
   }

   private void n() {
      this.b(this.A.e() + 1L);
      if (this.A.q().b(ctl.l)) {
         this.c(this.A.f() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.Z().a(ctl.l).a(false, null);
      } else {
         this.Z().a(ctl.l).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<blv> e() {
      return this.G().a();
   }

   public void f() {
      bgs $$0 = this.af();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dH() && !$$0x.bO() && !this.H.a($$0x)) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.R();
   }

   @Override
   public boolean h(blv $$0) {
      return $$0.do().a(this.I.s.do()) <= this.R;
   }

   public void a(blv $$0) {
      $$0.bp();
      $$0.ah++;
      this.af().a(() -> kd.g.b($$0.ai()).toString());
      $$0.l();
      this.af().c();

      for (blv $$1 : $$0.cP()) {
         this.a($$0, $$1);
      }
   }

   private void a(blv $$0, blv $$1) {
      if ($$1.dH() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cfi || this.e.c($$1)) {
         $$1.bp();
         $$1.ah++;
         $$1.t();

         for (blv $$2 : $$1.cP()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dlo $$0) {
      $$0.I();
      this.P.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(csw $$0) {
      this.O.forEach(($$1, $$2) -> $$2.a($$0.e, $$0.f));
      this.f.a($$0);
      this.E.a($$0);
   }

   public void g() {
      this.O.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int h() {
      return this.f.b();
   }

   public void c(blv $$0) {
      this.a($$0.aj(), blv.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, blv.c $$1) {
      blv $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.ao();
      }
   }

   @Nullable
   @Override
   public blv a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void W() {
      this.D.m().a(vf.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      auv $$4 = auv.a();
      cwq $$5 = this.p();
      hx.a $$6 = new hx.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private cwq p() {
      if (this.I.q.l() == ctm.b) {
         cmy $$0 = this.I.s.eT();
         cmt $$1 = $$0.d();
         if (T.contains($$1) && $$1 instanceof ckr $$2) {
            return $$2.e();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, auv $$4, @Nullable cwq $$5, hx.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      djh $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      eer $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         jv $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, ic.a);
            hx $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new jp(jx.d, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(hx $$0, djh $$1, jv $$2, boolean $$3) {
      if ($$1.u().c()) {
         emm $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(ic.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(ash.an)) {
            double $$6 = $$4.b(ic.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               hx $$7 = $$0.d();
               djh $$8 = this.a_($$7);
               emm $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(ic.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(hx $$0, jv $$1, emm $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(ic.a.a), (double)$$0.u() + $$2.c(ic.a.a), (double)$$0.w() + $$2.b(ic.a.c), (double)$$0.w() + $$2.c(ic.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, jv $$5) {
      this.a($$5, auo.d(this.z.j(), $$0, $$1), $$4, auo.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.I.s.cn.h());
      $$1.a("Server type", () -> this.I.T() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable cfi $$0, double $$1, double $$2, double $$3, ih<arr> $$4, art $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.I.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cfi $$0, blv $$1, ih<arr> $$2, art $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.I.s) {
         this.I.ai().a((gia)(new ghr($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(blv $$0, arr $$1, art $$2, float $$3, float $$4) {
      this.I.ai().a((gia)(new ghr($$1, $$2, $$3, $$4, $$0, this.z.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, arr $$3, art $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, arr $$3, art $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.I.j.m().b().c($$0, $$1, $$2);
      ghv $$10 = new ghv($$3, $$4, $$5, $$6, auv.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.I.ai().a($$10, (int)($$11 * 20.0));
      } else {
         this.I.ai().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sn $$6) {
      this.I.g.a(new fqg.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.g, $$6));
   }

   @Override
   public void a(xf<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public cqf r() {
      return this.D.l();
   }

   @Override
   public bkl s() {
      return this.H;
   }

   public void a(emx $$0) {
      this.K = $$0;
   }

   @Override
   public eng<cwq> N() {
      return end.b();
   }

   @Override
   public eng<eeq> M() {
      return end.b();
   }

   public fno i() {
      return this.P;
   }

   @Nullable
   @Override
   public egb a(String $$0) {
      return this.L.get($$0);
   }

   public void b(String $$0, egb $$1) {
      this.L.put($$0, $$1);
   }

   @Override
   public void a(String $$0, egb $$1) {
   }

   @Override
   public int v() {
      return 0;
   }

   @Override
   public emx K() {
      return this.K;
   }

   @Override
   public void a(hx $$0, djh $$1, djh $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(hx $$0, djh $$1, djh $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, hx $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, hx $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cfi $$0, int $$1, hx $$2, int $$3) {
      try {
         this.E.b($$1, $$2, $$3);
      } catch (Throwable var8) {
         o $$5 = o.a(var8, "Playing level event");
         p $$6 = $$5.a("Level event being played");
         $$6.a("Block coordinates", p.a(this, $$2));
         $$6.a("Event source", $$0);
         $$6.a("Event type", $$1);
         $$6.a("Event data", $$3);
         throw new y($$5);
      }
   }

   @Override
   public void a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(jv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(jv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<fsg> x() {
      return this.J;
   }

   @Override
   public ih<cuo> a(int $$0, int $$1, int $$2) {
      return this.I_().d(ke.at).f(cuv.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (auo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = auo.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public elt a(elt $$0, float $$1) {
      float $$2 = this.f($$1);
      elt $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      cuq $$4 = this.G_();
      elt $$5 = atp.a($$3, ($$1x, $$2x, $$3x) -> elt.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = auo.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = auo.a($$6, 0.0F, 1.0F);
      float $$7 = (float)$$5.c * $$6;
      float $$8 = (float)$$5.d * $$6;
      float $$9 = (float)$$5.e * $$6;
      float $$10 = this.d($$1);
      if ($$10 > 0.0F) {
         float $$11 = ($$7 * 0.3F + $$8 * 0.59F + $$9 * 0.11F) * 0.6F;
         float $$12 = 1.0F - $$10 * 0.75F;
         $$7 = $$7 * $$12 + $$11 * (1.0F - $$12);
         $$8 = $$8 * $$12 + $$11 * (1.0F - $$12);
         $$9 = $$9 * $$12 + $$11 * (1.0F - $$12);
      }

      float $$13 = this.b($$1);
      if ($$13 > 0.0F) {
         float $$14 = ($$7 * 0.3F + $$8 * 0.59F + $$9 * 0.11F) * 0.2F;
         float $$15 = 1.0F - $$13 * 0.75F;
         $$7 = $$7 * $$15 + $$14 * (1.0F - $$15);
         $$8 = $$8 * $$15 + $$14 * (1.0F - $$15);
         $$9 = $$9 * $$15 + $$14 * (1.0F - $$15);
      }

      int $$16 = this.j();
      if ($$16 > 0) {
         float $$17 = (float)$$16 - $$1;
         if ($$17 > 1.0F) {
            $$17 = 1.0F;
         }

         $$17 *= 0.45F;
         $$7 = $$7 * (1.0F - $$17) + 0.8F * $$17;
         $$8 = $$8 * (1.0F - $$17) + 0.8F * $$17;
         $$9 = $$9 * (1.0F - $$17) + 1.0F * $$17;
      }

      return new elt((double)$$7, (double)$$8, (double)$$9);
   }

   public elt h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = auo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = auo.a($$2, 0.0F, 1.0F);
      float $$3 = 1.0F;
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      float $$6 = this.d($$0);
      if ($$6 > 0.0F) {
         float $$7 = ($$3 * 0.3F + $$4 * 0.59F + $$5 * 0.11F) * 0.6F;
         float $$8 = 1.0F - $$6 * 0.95F;
         $$3 = $$3 * $$8 + $$7 * (1.0F - $$8);
         $$4 = $$4 * $$8 + $$7 * (1.0F - $$8);
         $$5 = $$5 * $$8 + $$7 * (1.0F - $$8);
      }

      $$3 *= $$2 * 0.9F + 0.1F;
      $$4 *= $$2 * 0.9F + 0.1F;
      $$5 *= $$2 * 0.85F + 0.15F;
      float $$9 = this.b($$0);
      if ($$9 > 0.0F) {
         float $$10 = ($$3 * 0.3F + $$4 * 0.59F + $$5 * 0.11F) * 0.2F;
         float $$11 = 1.0F - $$9 * 0.95F;
         $$3 = $$3 * $$11 + $$10 * (1.0F - $$11);
         $$4 = $$4 * $$11 + $$10 * (1.0F - $$11);
         $$5 = $$5 * $$11 + $$10 * (1.0F - $$11);
      }

      return new elt((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (auo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = auo.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.I.m.b().c() ? 0 : this.N;
   }

   @Override
   public void c(int $$0) {
      this.N = $$0;
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      boolean $$2 = this.d().e();
      if (!$$1) {
         return $$2 ? 0.9F : 1.0F;
      } else {
         switch ($$0) {
            case a:
               return $$2 ? 0.9F : 0.5F;
            case b:
               return $$2 ? 0.9F : 1.0F;
            case c:
            case d:
               return 0.8F;
            case e:
            case f:
               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int a(hx $$0, cta $$1) {
      ewm $$2 = (ewm)this.O.get($$1);
      return $$2.a($$0);
   }

   public int b(hx $$0, cta $$1) {
      int $$2 = evi.O().m.C().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         hz $$7 = new hz($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         hx.a $$8 = new hx.a();

         while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.t($$8).a(), (double)$$8.u(), (double)$$8.w());
            $$4 += ($$9 & 0xFF0000) >> 16;
            $$5 += ($$9 & 0xFF00) >> 8;
            $$6 += $$9 & 0xFF;
         }

         return ($$4 / $$3 & 0xFF) << 16 | ($$5 / $$3 & 0xFF) << 8 | $$6 / $$3 & 0xFF;
      }
   }

   public void a(hx $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fns.a k() {
      return this.F;
   }

   @Override
   public void a(dnr $$0, elt $$1, dnr.a $$2) {
   }

   protected Map<String, egb> l() {
      return ImmutableMap.copyOf(this.L);
   }

   protected void a(Map<String, egb> $$0) {
      this.L.putAll($$0);
   }

   @Override
   protected dnh<blv> G() {
      return this.f.a();
   }

   @Override
   public String H() {
      return "Chunks[C] W: " + this.P.e() + " E: " + this.f.c();
   }

   @Override
   public void a(hx $$0, djh $$1) {
      this.I.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.R = $$0;
   }

   public int m() {
      return this.R;
   }

   @Override
   public chs I() {
      return this.D.y();
   }

   public static class a implements egt {
      private final boolean a;
      private final ctl b;
      private final boolean c;
      private int d;
      private int e;
      private int f;
      private float g;
      private long h;
      private long i;
      private boolean j;
      private bjy k;
      private boolean l;

      public a(bjy $$0, boolean $$1, boolean $$2) {
         this.k = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new ctl();
      }

      @Override
      public int a() {
         return this.d;
      }

      @Override
      public int b() {
         return this.e;
      }

      @Override
      public int c() {
         return this.f;
      }

      @Override
      public float d() {
         return this.g;
      }

      @Override
      public long e() {
         return this.h;
      }

      @Override
      public long f() {
         return this.i;
      }

      @Override
      public void b(int $$0) {
         this.d = $$0;
      }

      @Override
      public void c(int $$0) {
         this.e = $$0;
      }

      @Override
      public void d(int $$0) {
         this.f = $$0;
      }

      @Override
      public void a(float $$0) {
         this.g = $$0;
      }

      public void a(long $$0) {
         this.h = $$0;
      }

      public void b(long $$0) {
         this.i = $$0;
      }

      @Override
      public void a(hx $$0, float $$1) {
         this.d = $$0.u();
         this.e = $$0.v();
         this.f = $$0.w();
         this.g = $$1;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public boolean k() {
         return this.j;
      }

      @Override
      public void b(boolean $$0) {
         this.j = $$0;
      }

      @Override
      public boolean n() {
         return this.a;
      }

      @Override
      public ctl q() {
         return this.b;
      }

      @Override
      public bjy s() {
         return this.k;
      }

      @Override
      public boolean t() {
         return this.l;
      }

      @Override
      public void a(p $$0, ctr $$1) {
         egt.super.a($$0, $$1);
      }

      public void a(bjy $$0) {
         this.k = $$0;
      }

      public void a(boolean $$0) {
         this.l = $$0;
      }

      public double a(ctr $$0) {
         return this.c ? (double)$$0.J_() : 63.0;
      }

      public float g() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dng<blv> {
      public void a(blv $$0) {
      }

      public void b(blv $$0) {
      }

      public void c(blv $$0) {
         fns.this.e.a($$0);
      }

      public void d(blv $$0) {
         fns.this.e.b($$0);
      }

      public void e(blv $$0) {
         if ($$0 instanceof fsg) {
            fns.this.J.add((fsg)$$0);
         }
      }

      public void f(blv $$0) {
         $$0.ag();
         fns.this.J.remove($$0);
      }

      public void g(blv $$0) {
      }
   }
}
