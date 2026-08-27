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

public class flo extends csf {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dlk e = new dlk();
   private final dlq<bkv> f = new dlq<>(bkv.class, new flo.b());
   private final flp D;
   private final fqx E;
   private final flo.a F;
   private final fqo G;
   private final bjl H;
   private final eti I = eti.N();
   final List<fpy> J = Lists.newArrayList();
   private eky K = new eky();
   private final Map<String, eeh> L = Maps.newHashMap();
   private static final long M = 16777215L;
   private int N;
   private final Object2ObjectArrayMap<crq, eul> O = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(fql.a, new eul($$0xx -> this.b($$0xx, fql.a)));
      $$0x.put(fql.b, new eul($$0xx -> this.b($$0xx, fql.b)));
      $$0x.put(fql.c, new eul($$0xx -> this.b($$0xx, fql.c)));
   });
   private final flk P;
   private final Deque<Runnable> Q = Queues.newArrayDeque();
   private int R;
   private final fmv S = new fmv();
   private static final Set<clj> T = Set.of(clr.hA, clr.hB);

   public void b(int $$0) {
      this.S.a($$0, this);
   }

   public void b(hx $$0, dhn $$1, int $$2) {
      if (!this.S.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(hx $$0, dhn $$1, ejz $$2) {
      dhn $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cdz $$4 = this.I.s;
         if (this == $$4.dN() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fmv a() {
      return this.S;
   }

   @Override
   public boolean a(hx $$0, dhn $$1, int $$2, int $$3) {
      if (this.S.c()) {
         dhn $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.S.a($$0, $$4, this.I.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public flo(flp $$0, flo.a $$1, agl<csf> $$2, ig<dkw> $$3, int $$4, int $$5, Supplier<bfs> $$6, fqx $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.f(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.P = new flk(this, $$4);
      this.H = new bjl();
      this.F = $$1;
      this.E = $$7;
      this.G = fqo.a($$3.a());
      this.a(new hx(8, 64, 8), 0.0F);
      this.R = $$5;
      this.R();
      this.U();
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

   public fqo d() {
      return this.G;
   }

   public void a(BooleanSupplier $$0) {
      this.D_().s();
      if (this.r().i()) {
         this.o();
      }

      if (this.N > 0) {
         this.c(this.N - 1);
      }

      this.ae().a("blocks");
      this.P.a($$0, true);
      this.ae().c();
   }

   private void o() {
      this.b(this.A.e() + 1L);
      if (this.A.q().b(csb.l)) {
         this.c(this.A.f() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.Y().a(csb.l).a(false, null);
      } else {
         this.Y().a(csb.l).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<bkv> e() {
      return this.F().a();
   }

   public void f() {
      bfs $$0 = this.ae();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dI() && !$$0x.bO() && !this.H.a($$0x)) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.Q();
   }

   @Override
   public boolean h(bkv $$0) {
      return $$0.dp().a(this.I.s.dp()) <= this.R;
   }

   public void a(bkv $$0) {
      $$0.bp();
      $$0.ah++;
      this.ae().a(() -> kc.h.b($$0.ai()).toString());
      $$0.l();
      this.ae().c();

      for (bkv $$1 : $$0.cQ()) {
         this.a($$0, $$1);
      }
   }

   private void a(bkv $$0, bkv $$1) {
      if ($$1.dI() || $$1.da() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cdz || this.e.c($$1)) {
         $$1.bp();
         $$1.ah++;
         $$1.t();

         for (bkv $$2 : $$1.cQ()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dju $$0) {
      $$0.I();
      this.P.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(crm $$0) {
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

   public void c(bkv $$0) {
      this.a($$0.aj(), bkv.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, bkv.c $$1) {
      bkv $$2 = this.F().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.ao();
      }
   }

   @Nullable
   @Override
   public bkv a(int $$0) {
      return this.F().a($$0);
   }

   @Override
   public void V() {
      this.D.m().a(uv.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      atw $$4 = atw.a();
      cvf $$5 = this.p();
      hx.a $$6 = new hx.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private cvf p() {
      if (this.I.q.l() == csc.b) {
         clo $$0 = this.I.s.eU();
         clj $$1 = $$0.d();
         if (T.contains($$1) && $$1 instanceof cjh $$2) {
            return $$2.e();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, atw $$4, @Nullable cvf $$5, hx.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dhn $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      ecx $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         ju $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, ib.a);
            hx $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new jo(jw.d, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.s($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(hx $$0, dhn $$1, ju $$2, boolean $$3) {
      if ($$1.u().c()) {
         eks $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(ib.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(ark.an)) {
            double $$6 = $$4.b(ib.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               hx $$7 = $$0.d();
               dhn $$8 = this.a_($$7);
               eks $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(ib.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(hx $$0, ju $$1, eks $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(ib.a.a), (double)$$0.u() + $$2.c(ib.a.a), (double)$$0.w() + $$2.b(ib.a.c), (double)$$0.w() + $$2.c(ib.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, ju $$5) {
      this.a($$5, atq.d(this.z.j(), $$0, $$1), $$4, atq.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.I.s.cn.h());
      $$1.a("Server type", () -> this.I.S() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable cdz $$0, double $$1, double $$2, double $$3, ig<aqu> $$4, aqw $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.I.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cdz $$0, bkv $$1, ig<aqu> $$2, aqw $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.I.s) {
         this.I.ah().a((gfh)(new gey($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, aqu $$3, aqw $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, aqu $$3, aqw $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.I.j.m().b().c($$0, $$1, $$2);
      gfc $$10 = new gfc($$3, $$4, $$5, $$6, atw.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.I.ah().a($$10, (int)($$11 * 20.0));
      } else {
         this.I.ah().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sd $$6) {
      this.I.g.a(new fob.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.g, $$6));
   }

   @Override
   public void a(wo<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public cow q() {
      return this.D.l();
   }

   @Override
   public bjl r() {
      return this.H;
   }

   public void a(eky $$0) {
      this.K = $$0;
   }

   @Override
   public elh<cvf> M() {
      return ele.b();
   }

   @Override
   public elh<ecw> L() {
      return ele.b();
   }

   public flk i() {
      return this.P;
   }

   @Nullable
   @Override
   public eeh a(String $$0) {
      return this.L.get($$0);
   }

   public void b(String $$0, eeh $$1) {
      this.L.put($$0, $$1);
   }

   @Override
   public void a(String $$0, eeh $$1) {
   }

   @Override
   public int u() {
      return 0;
   }

   @Override
   public eky J() {
      return this.K;
   }

   @Override
   public void a(hx $$0, dhn $$1, dhn $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(hx $$0, dhn $$1, dhn $$2) {
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
   public void a(@Nullable cdz $$0, int $$1, hx $$2, int $$3) {
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
   public void a(ju $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(ju $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(ju $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(ju $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<fpy> w() {
      return this.J;
   }

   @Override
   public ig<ctd> a(int $$0, int $$1, int $$2) {
      return this.I_().d(kd.ar).f(ctk.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (atq.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = atq.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public ejz a(ejz $$0, float $$1) {
      float $$2 = this.f($$1);
      ejz $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      ctf $$4 = this.G_();
      ejz $$5 = ass.a($$3, ($$1x, $$2x, $$3x) -> ejz.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = atq.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = atq.a($$6, 0.0F, 1.0F);
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

      return new ejz((double)$$7, (double)$$8, (double)$$9);
   }

   public ejz h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = atq.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = atq.a($$2, 0.0F, 1.0F);
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

      return new ejz((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (atq.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = atq.a($$2, 0.0F, 1.0F);
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
   public float a(ib $$0, boolean $$1) {
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
   public int a(hx $$0, crq $$1) {
      eul $$2 = (eul)this.O.get($$1);
      return $$2.a($$0);
   }

   public int b(hx $$0, crq $$1) {
      int $$2 = eti.N().m.C().c();
      if ($$2 == 0) {
         return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         hy $$7 = new hy($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         hx.a $$8 = new hx.a();

         while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.s($$8).a(), (double)$$8.u(), (double)$$8.w());
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

   public flo.a k() {
      return this.F;
   }

   @Override
   public void a(dlx $$0, ejz $$1, dlx.a $$2) {
   }

   protected Map<String, eeh> l() {
      return ImmutableMap.copyOf(this.L);
   }

   protected void a(Map<String, eeh> $$0) {
      this.L.putAll($$0);
   }

   @Override
   protected dln<bkv> F() {
      return this.f.a();
   }

   @Override
   public String G() {
      return "Chunks[C] W: " + this.P.e() + " E: " + this.f.c();
   }

   @Override
   public void a(hx $$0, dhn $$1) {
      this.I.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.R = $$0;
   }

   public int m() {
      return this.R;
   }

   @Override
   public cgi H() {
      return this.D.y();
   }

   public static class a implements eez {
      private final boolean a;
      private final csb b;
      private final boolean c;
      private int d;
      private int e;
      private int f;
      private float g;
      private long h;
      private long i;
      private boolean j;
      private biy k;
      private boolean l;

      public a(biy $$0, boolean $$1, boolean $$2) {
         this.k = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new csb();
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
      public csb q() {
         return this.b;
      }

      @Override
      public biy s() {
         return this.k;
      }

      @Override
      public boolean t() {
         return this.l;
      }

      @Override
      public void a(p $$0, csh $$1) {
         eez.super.a($$0, $$1);
      }

      public void a(biy $$0) {
         this.k = $$0;
      }

      public void a(boolean $$0) {
         this.l = $$0;
      }

      public double a(csh $$0) {
         return this.c ? (double)$$0.J_() : 63.0;
      }

      public float g() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dlm<bkv> {
      public void a(bkv $$0) {
      }

      public void b(bkv $$0) {
      }

      public void c(bkv $$0) {
         flo.this.e.a($$0);
      }

      public void d(bkv $$0) {
         flo.this.e.b($$0);
      }

      public void e(bkv $$0) {
         if ($$0 instanceof fpy) {
            flo.this.J.add((fpy)$$0);
         }
      }

      public void f(bkv $$0) {
         $$0.ag();
         flo.this.J.remove($$0);
      }

      public void g(bkv $$0) {
      }
   }
}
