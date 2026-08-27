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

public class fiz extends cpx {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dji e = new dji();
   private final djo<bis> f = new djo<>(bis.class, new fiz.b());
   private final fja D;
   private final foe E;
   private final fiz.a F;
   private final fnv G;
   private final eqx H = eqx.O();
   final List<fnf> I = Lists.newArrayList();
   private eio J = new eio();
   private final Map<String, eby> K = Maps.newHashMap();
   private static final long L = 16777215L;
   private int M;
   private final Object2ObjectArrayMap<cpi, erz> N = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(fns.a, new erz($$0xx -> this.b($$0xx, fns.a)));
      $$0x.put(fns.b, new erz($$0xx -> this.b($$0xx, fns.b)));
      $$0x.put(fns.c, new erz($$0xx -> this.b($$0xx, fns.c)));
   });
   private final fiv O;
   private final Deque<Runnable> P = Queues.newArrayDeque();
   private int Q;
   private final fkf R = new fkf();
   private static final Set<cjc> S = Set.of(cjk.hf, cjk.hg);

   public void b(int $$0) {
      this.R.a($$0, this);
   }

   public void b(gw $$0, dfl $$1, int $$2) {
      if (!this.R.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(gw $$0, dfl $$1, ehp $$2) {
      dfl $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cbw $$4 = this.H.s;
         if (this == $$4.dL() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fkf a() {
      return this.R;
   }

   @Override
   public boolean a(gw $$0, dfl $$1, int $$2, int $$3) {
      if (this.R.c()) {
         dfl $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.R.a($$0, $$4, this.H.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fiz(fja $$0, fiz.a $$1, aex<cpx> $$2, hg<diu> $$3, int $$4, int $$5, Supplier<bdr> $$6, foe $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.f(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.O = new fiv(this, $$4);
      this.F = $$1;
      this.E = $$7;
      this.G = fnv.a($$3.a());
      this.a(new gw(8, 64, 8), 0.0F);
      this.Q = $$5;
      this.Q();
      this.T();
   }

   public void a(Runnable $$0) {
      this.P.add($$0);
   }

   public void b() {
      int $$0 = this.P.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.P.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public boolean c() {
      return this.P.isEmpty();
   }

   public fnv d() {
      return this.G;
   }

   public void a(BooleanSupplier $$0) {
      this.B_().s();
      this.o();
      if (this.M > 0) {
         this.c(this.M - 1);
      }

      this.ad().a("blocks");
      this.O.a($$0, true);
      this.ad().c();
   }

   private void o() {
      this.b(this.A.e() + 1L);
      if (this.A.q().b(cpt.k)) {
         this.c(this.A.f() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.X().a(cpt.k).a(false, null);
      } else {
         this.X().a(cpt.k).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<bis> e() {
      return this.E().a();
   }

   public void f() {
      bdr $$0 = this.ad();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dG() && !$$0x.bN()) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.P();
   }

   @Override
   public boolean h(bis $$0) {
      return $$0.dn().a(this.H.s.dn()) <= this.Q;
   }

   public void a(bis $$0) {
      $$0.bn();
      $$0.ah++;
      this.ad().a(() -> jd.h.b($$0.ag()).toString());
      $$0.l();
      this.ad().c();

      for (bis $$1 : $$0.cP()) {
         this.a($$0, $$1);
      }
   }

   private void a(bis $$0, bis $$1) {
      if ($$1.dG() || $$1.cY() != $$0) {
         $$1.aa();
      } else if ($$1 instanceof cbw || this.e.c($$1)) {
         $$1.bn();
         $$1.ah++;
         $$1.by();

         for (bis $$2 : $$1.cP()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dhs $$0) {
      $$0.I();
      this.O.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(cpe $$0) {
      this.N.forEach(($$1, $$2) -> $$2.a($$0.e, $$0.f));
      this.f.a($$0);
      this.E.a($$0);
   }

   public void g() {
      this.N.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int h() {
      return this.f.b();
   }

   public void c(bis $$0) {
      this.a($$0.ah(), bis.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, bis.c $$1) {
      bis $$2 = this.E().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.am();
      }
   }

   @Nullable
   @Override
   public bis a(int $$0) {
      return this.E().a($$0);
   }

   @Override
   public void U() {
      this.D.l().a(tn.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      ase $$4 = ase.a();
      csx $$5 = this.p();
      gw.a $$6 = new gw.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private csx p() {
      if (this.H.q.l() == cpu.b) {
         cjh $$0 = this.H.s.eS();
         cjc $$1 = $$0.d();
         if (S.contains($$1) && $$1 instanceof cha $$2) {
            return $$2.e();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, ase $$4, @Nullable csx $$5, gw.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dfl $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      eao $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         iv $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, hc.a);
            gw $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new ip(ix.d, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.s($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(gw $$0, dfl $$1, iv $$2, boolean $$3) {
      if ($$1.u().c()) {
         eii $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(hc.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(apu.an)) {
            double $$6 = $$4.b(hc.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               gw $$7 = $$0.d();
               dfl $$8 = this.a_($$7);
               eii $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(hc.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(gw $$0, iv $$1, eii $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(hc.a.a), (double)$$0.u() + $$2.c(hc.a.a), (double)$$0.w() + $$2.b(hc.a.c), (double)$$0.w() + $$2.c(hc.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, iv $$5) {
      this.a($$5, ary.d(this.z.j(), $$0, $$1), $$4, ary.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.H.s.cn.h());
      $$1.a("Server type", () -> this.H.T() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      return $$1;
   }

   @Override
   public void a(@Nullable cbw $$0, double $$1, double $$2, double $$3, hg<ape> $$4, apg $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.H.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cbw $$0, bis $$1, hg<ape> $$2, apg $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.H.s) {
         this.H.ai().a((gco)(new gcf($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, ape $$3, apg $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, ape $$3, apg $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.H.j.m().b().c($$0, $$1, $$2);
      gcj $$10 = new gcj($$3, $$4, $$5, $$6, ase.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.H.ai().a($$10, (int)($$11 * 20.0));
      } else {
         this.H.ai().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable qy $$6) {
      this.H.g.a(new flk.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.H.g, $$6));
   }

   @Override
   public void a(vf<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public cmn q() {
      return this.D.k();
   }

   public void a(eio $$0) {
      this.J = $$0;
   }

   @Override
   public eix<csx> L() {
      return eiu.b();
   }

   @Override
   public eix<ean> K() {
      return eiu.b();
   }

   public fiv i() {
      return this.O;
   }

   @Nullable
   @Override
   public eby a(String $$0) {
      return this.K.get($$0);
   }

   public void b(String $$0, eby $$1) {
      this.K.put($$0, $$1);
   }

   @Override
   public void a(String $$0, eby $$1) {
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   public eio I() {
      return this.J;
   }

   @Override
   public void a(gw $$0, dfl $$1, dfl $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(gw $$0, dfl $$1, dfl $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, gw $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, gw $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cbw $$0, int $$1, gw $$2, int $$3) {
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
   public void a(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(iv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(iv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<fnf> v() {
      return this.I;
   }

   @Override
   public hg<cqv> a(int $$0, int $$1, int $$2) {
      return this.G_().d(je.ap).f(crc.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ary.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = ary.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public ehp a(ehp $$0, float $$1) {
      float $$2 = this.f($$1);
      ehp $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      cqx $$4 = this.E_();
      ehp $$5 = arb.a($$3, ($$1x, $$2x, $$3x) -> ehp.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = ary.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = ary.a($$6, 0.0F, 1.0F);
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

      return new ehp((double)$$7, (double)$$8, (double)$$9);
   }

   public ehp h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = ary.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = ary.a($$2, 0.0F, 1.0F);
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

      return new ehp((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ary.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = ary.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.H.m.b().c() ? 0 : this.M;
   }

   @Override
   public void c(int $$0) {
      this.M = $$0;
   }

   @Override
   public float a(hc $$0, boolean $$1) {
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
   public int a(gw $$0, cpi $$1) {
      erz $$2 = (erz)this.N.get($$1);
      return $$2.a($$0);
   }

   public int b(gw $$0, cpi $$1) {
      int $$2 = eqx.O().m.B().c();
      if ($$2 == 0) {
         return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         gz $$7 = new gz($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         gw.a $$8 = new gw.a();

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

   public void a(gw $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fiz.a k() {
      return this.F;
   }

   @Override
   public void a(djv $$0, ehp $$1, djv.a $$2) {
   }

   protected Map<String, eby> l() {
      return ImmutableMap.copyOf(this.K);
   }

   protected void a(Map<String, eby> $$0) {
      this.K.putAll($$0);
   }

   @Override
   protected djl<bis> E() {
      return this.f.a();
   }

   @Override
   public String F() {
      return "Chunks[C] W: " + this.O.e() + " E: " + this.f.c();
   }

   @Override
   public void a(gw $$0, dfl $$1) {
      this.H.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.Q = $$0;
   }

   public int m() {
      return this.Q;
   }

   @Override
   public cee G() {
      return this.D.x();
   }

   public static class a implements ecp {
      private final boolean a;
      private final cpt b;
      private final boolean c;
      private int d;
      private int e;
      private int f;
      private float g;
      private long h;
      private long i;
      private boolean j;
      private bgx k;
      private boolean l;

      public a(bgx $$0, boolean $$1, boolean $$2) {
         this.k = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new cpt();
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
      public void a(gw $$0, float $$1) {
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
      public cpt q() {
         return this.b;
      }

      @Override
      public bgx s() {
         return this.k;
      }

      @Override
      public boolean t() {
         return this.l;
      }

      @Override
      public void a(p $$0, cpz $$1) {
         ecp.super.a($$0, $$1);
      }

      public void a(bgx $$0) {
         this.k = $$0;
      }

      public void a(boolean $$0) {
         this.l = $$0;
      }

      public double a(cpz $$0) {
         return this.c ? (double)$$0.H_() : 63.0;
      }

      public float g() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements djk<bis> {
      public void a(bis $$0) {
      }

      public void b(bis $$0) {
      }

      public void c(bis $$0) {
         fiz.this.e.a($$0);
      }

      public void d(bis $$0) {
         fiz.this.e.b($$0);
      }

      public void e(bis $$0) {
         if ($$0 instanceof fnf) {
            fiz.this.I.add((fnf)$$0);
         }
      }

      public void f(bis $$0) {
         $$0.ae();
         fiz.this.I.remove($$0);
      }

      public void g(bis $$0) {
      }
   }
}
