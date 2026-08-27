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

public class fra extends cwe {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dqe e = new dqe();
   private final dqk<bof> f = new dqk<>(bof.class, new fra.b());
   private final frb D;
   private final fwo E;
   private final fra.a F;
   private final fwf G;
   private final bmw H;
   private final eyk I = eyk.P();
   final List<fvp> J = Lists.newArrayList();
   private final Map<eja, ejc> K = Maps.newHashMap();
   private static final long L = 16777215L;
   private int M;
   private final Object2ObjectArrayMap<cvp, ezp> N = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(fwc.a, new ezp($$0xx -> this.b($$0xx, fwc.a)));
      $$0x.put(fwc.b, new ezp($$0xx -> this.b($$0xx, fwc.b)));
      $$0x.put(fwc.c, new ezp($$0xx -> this.b($$0xx, fwc.c)));
   });
   private final fqw O;
   private final Deque<Runnable> P = Queues.newArrayDeque();
   private int Q;
   private final fsk R = new fsk();
   private static final Set<cpl> S = Set.of(cpt.hA, cpt.hB);

   public void b(int $$0) {
      this.R.a($$0, this);
   }

   public void b(ib $$0, dme $$1, int $$2) {
      if (!this.R.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(ib $$0, dme $$1, eov $$2) {
      dme $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cia $$4 = this.I.s;
         if (this == $$4.dJ() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fsk a() {
      return this.R;
   }

   @Override
   public boolean a(ib $$0, dme $$1, int $$2, int $$3) {
      if (this.R.c()) {
         dme $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.R.a($$0, $$4, this.I.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fra(frb $$0, fra.a $$1, ajb<cwe> $$2, il<dpq> $$3, int $$4, int $$5, Supplier<bjc> $$6, fwo $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.w(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.O = new fqw(this, $$4);
      this.H = new bmw();
      this.F = $$1;
      this.E = $$7;
      this.G = fwf.a($$3.a());
      this.a(new ib(8, 64, 8), 0.0F);
      this.Q = $$5;
      this.S();
      this.V();
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

   public fwf d() {
      return this.G;
   }

   public void a(BooleanSupplier $$0) {
      this.D_().s();
      if (this.s().i()) {
         this.n();
      }

      if (this.M > 0) {
         this.c(this.M - 1);
      }

      this.ae().a("blocks");
      this.O.a($$0, true);
      this.ae().c();
   }

   private void n() {
      this.b(this.A.c() + 1L);
      if (this.A.o().b(cwa.l)) {
         this.c(this.A.d() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.Z().a(cwa.l).a(false, null);
      } else {
         this.Z().a(cwa.l).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<bof> e() {
      return this.G().a();
   }

   public void f() {
      bjc $$0 = this.ae();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dE() && !$$0x.bL() && !this.H.a($$0x)) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.R();
   }

   @Override
   public boolean h(bof $$0) {
      return $$0.dl().a(this.I.s.dl()) <= this.Q;
   }

   public void a(bof $$0) {
      $$0.bp();
      $$0.ag++;
      this.ae().a(() -> kh.g.b($$0.ai()).toString());
      $$0.l();
      this.ae().c();

      for (bof $$1 : $$0.cM()) {
         this.a($$0, $$1);
      }
   }

   private void a(bof $$0, bof $$1) {
      if ($$1.dE() || $$1.cW() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cia || this.e.c($$1)) {
         $$1.bp();
         $$1.ag++;
         $$1.t();

         for (bof $$2 : $$1.cM()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dol $$0) {
      $$0.I();
      this.O.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(cvl $$0) {
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

   public void c(bof $$0) {
      this.a($$0.aj(), bof.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, bof.c $$1) {
      bof $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.ao();
      }
   }

   @Nullable
   @Override
   public bof a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void W() {
      this.D.l().a(vs.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      awt $$4 = awt.a();
      czf $$5 = this.p();
      ib.a $$6 = new ib.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private czf p() {
      if (this.I.q.j() == cwb.b) {
         cpq $$0 = this.I.s.eR();
         cpl $$1 = $$0.d();
         if (S.contains($$1) && $$1 instanceof cnl $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, awt $$4, @Nullable czf $$5, ib.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dme $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      ehr $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         jz $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, ih.a);
            ib $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new jt(kb.d, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(ib $$0, dme $$1, jz $$2, boolean $$3) {
      if ($$1.u().c()) {
         epo $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(ih.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(aue.an)) {
            double $$6 = $$4.b(ih.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               ib $$7 = $$0.d();
               dme $$8 = this.a_($$7);
               epo $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(ih.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(ib $$0, jz $$1, epo $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(ih.a.a), (double)$$0.u() + $$2.c(ih.a.a), (double)$$0.w() + $$2.b(ih.a.c), (double)$$0.w() + $$2.c(ih.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, jz $$5) {
      this.a($$5, awm.d(this.z.j(), $$0, $$1), $$4, awm.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.I.s.cr.g());
      $$1.a("Server type", () -> this.I.U() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable cia $$0, double $$1, double $$2, double $$3, il<ato> $$4, atq $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.I.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cia $$0, bof $$1, il<ato> $$2, atq $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.I.s) {
         this.I.aj().a((glm)(new gld($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bof $$0, ato $$1, atq $$2, float $$3, float $$4) {
      this.I.aj().a((glm)(new gld($$1, $$2, $$3, $$4, $$0, this.z.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, ato $$3, atq $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, ato $$3, atq $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.I.j.m().b().c($$0, $$1, $$2);
      glh $$10 = new glh($$3, $$4, $$5, $$6, awt.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.I.aj().a($$10, (int)($$11 * 20.0));
      } else {
         this.I.aj().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sy $$6) {
      this.I.g.a(new ftp.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.g, $$6));
   }

   @Override
   public void a(xz<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public csv r() {
      return this.D.k();
   }

   @Override
   public bmw s() {
      return this.H;
   }

   @Override
   public eqi<czf> N() {
      return eqf.b();
   }

   @Override
   public eqi<ehq> M() {
      return eqf.b();
   }

   public fqw i() {
      return this.O;
   }

   @Nullable
   @Override
   public ejc a(eja $$0) {
      return this.K.get($$0);
   }

   public void b(eja $$0, ejc $$1) {
      this.K.put($$0, $$1);
   }

   @Override
   public void a(eja $$0, ejc $$1) {
   }

   @Override
   public eja v() {
      return new eja(0);
   }

   @Override
   public epz K() {
      return this.D.z();
   }

   @Override
   public void a(ib $$0, dme $$1, dme $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(ib $$0, dme $$1, dme $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, ib $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, ib $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cia $$0, int $$1, ib $$2, int $$3) {
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
   public void a(jz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(jz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(jz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(jz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<fvp> x() {
      return this.J;
   }

   @Override
   public il<cxd> a(int $$0, int $$1, int $$2) {
      return this.I_().d(ki.au).f(cxk.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (awm.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = awm.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public eov a(eov $$0, float $$1) {
      float $$2 = this.f($$1);
      eov $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      cxf $$4 = this.G_();
      eov $$5 = avn.a($$3, ($$1x, $$2x, $$3x) -> eov.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = awm.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = awm.a($$6, 0.0F, 1.0F);
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

      return new eov((double)$$7, (double)$$8, (double)$$9);
   }

   public eov h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = awm.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = awm.a($$2, 0.0F, 1.0F);
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

      return new eov((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (awm.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = awm.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.I.m.b().c() ? 0 : this.M;
   }

   @Override
   public void c(int $$0) {
      this.M = $$0;
   }

   @Override
   public float a(ih $$0, boolean $$1) {
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
   public int a(ib $$0, cvp $$1) {
      ezp $$2 = (ezp)this.N.get($$1);
      return $$2.a($$0);
   }

   public int b(ib $$0, cvp $$1) {
      int $$2 = eyk.P().m.C().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         id $$7 = new id($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         ib.a $$8 = new ib.a();

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

   public void a(ib $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fra.a k() {
      return this.F;
   }

   @Override
   public void a(il<dqr> $$0, eov $$1, dqr.a $$2) {
   }

   protected Map<eja, ejc> l() {
      return ImmutableMap.copyOf(this.K);
   }

   protected void a(Map<eja, ejc> $$0) {
      this.K.putAll($$0);
   }

   @Override
   protected dqh<bof> G() {
      return this.f.a();
   }

   @Override
   public String H() {
      return "Chunks[C] W: " + this.O.e() + " E: " + this.f.c();
   }

   @Override
   public void a(ib $$0, dme $$1) {
      this.I.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.Q = $$0;
   }

   public int m() {
      return this.Q;
   }

   @Override
   public ckl I() {
      return this.D.y();
   }

   public static class a implements ejv {
      private final boolean a;
      private final cwa b;
      private final boolean c;
      private ib d;
      private float e;
      private long f;
      private long g;
      private boolean h;
      private bmi i;
      private boolean j;

      public a(bmi $$0, boolean $$1, boolean $$2) {
         this.i = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new cwa();
      }

      @Override
      public ib a() {
         return this.d;
      }

      @Override
      public float b() {
         return this.e;
      }

      @Override
      public long c() {
         return this.f;
      }

      @Override
      public long d() {
         return this.g;
      }

      public void a(long $$0) {
         this.f = $$0;
      }

      public void b(long $$0) {
         this.g = $$0;
      }

      @Override
      public void a(ib $$0, float $$1) {
         this.d = $$0.i();
         this.e = $$1;
      }

      @Override
      public boolean g() {
         return false;
      }

      @Override
      public boolean i() {
         return this.h;
      }

      @Override
      public void b(boolean $$0) {
         this.h = $$0;
      }

      @Override
      public boolean l() {
         return this.a;
      }

      @Override
      public cwa o() {
         return this.b;
      }

      @Override
      public bmi q() {
         return this.i;
      }

      @Override
      public boolean r() {
         return this.j;
      }

      @Override
      public void a(p $$0, cwg $$1) {
         ejv.super.a($$0, $$1);
      }

      public void a(bmi $$0) {
         this.i = $$0;
      }

      public void a(boolean $$0) {
         this.j = $$0;
      }

      public double a(cwg $$0) {
         return this.c ? (double)$$0.J_() : 63.0;
      }

      public float e() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dqg<bof> {
      public void a(bof $$0) {
      }

      public void b(bof $$0) {
      }

      public void c(bof $$0) {
         fra.this.e.a($$0);
      }

      public void d(bof $$0) {
         fra.this.e.b($$0);
      }

      public void e(bof $$0) {
         if ($$0 instanceof fvp) {
            fra.this.J.add((fvp)$$0);
         }
      }

      public void f(bof $$0) {
         $$0.ag();
         fra.this.J.remove($$0);
      }

      public void g(bof $$0) {
      }
   }
}
