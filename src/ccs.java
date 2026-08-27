import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ccs {
   private static final int h = 2;
   private static final int i = 0;
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 32;
   private static final int m = 48000;
   private static final int n = 3;
   private static final String o = "block.minecraft.ominous_banner";
   private static final String p = "event.minecraft.raid.raiders_remaining";
   public static final int a = 16;
   private static final int q = 40;
   private static final int r = 300;
   public static final int b = 2400;
   public static final int c = 600;
   private static final int s = 30;
   public static final int d = 24000;
   public static final int e = 5;
   private static final int t = 2;
   private static final te u = te.c("event.minecraft.raid");
   private static final te v = te.c("event.minecraft.raid.victory");
   private static final te w = te.c("event.minecraft.raid.defeat");
   private static final te x = u.e().f(" - ").b(v);
   private static final te y = u.e().f(" - ").b(w);
   private static final int z = 48000;
   public static final int f = 9216;
   public static final int g = 12544;
   private final Map<Integer, cct> A = Maps.newHashMap();
   private final Map<Integer, Set<cct>> B = Maps.newHashMap();
   private final Set<UUID> C = Sets.newHashSet();
   private long D;
   private gv E;
   private final aki F;
   private boolean G;
   private final int H;
   private float I;
   private int J;
   private boolean K;
   private int L;
   private final akf M = new akf(u, bge.a.c, bge.b.c);
   private int N;
   private int O;
   private final art P = art.a();
   private final int Q;
   private ccs.a R;
   private int S;
   private Optional<gv> T = Optional.empty();

   public ccs(int $$0, aki $$1, gv $$2) {
      this.H = $$0;
      this.F = $$1;
      this.K = true;
      this.O = 300;
      this.M.a(0.0F);
      this.E = $$2;
      this.Q = this.a($$1.ai());
      this.R = ccs.a.a;
   }

   public ccs(aki $$0, qs $$1) {
      this.F = $$0;
      this.H = $$1.h("Id");
      this.G = $$1.q("Started");
      this.K = $$1.q("Active");
      this.D = $$1.i("TicksActive");
      this.J = $$1.h("BadOmenLevel");
      this.L = $$1.h("GroupsSpawned");
      this.O = $$1.h("PreRaidTicks");
      this.N = $$1.h("PostRaidTicks");
      this.I = $$1.j("TotalHealth");
      this.E = new gv($$1.h("CX"), $$1.h("CY"), $$1.h("CZ"));
      this.Q = $$1.h("NumGroups");
      this.R = ccs.a.a($$1.l("Status"));
      this.C.clear();
      if ($$1.b("HeroesOfTheVillage", 9)) {
         qy $$2 = $$1.c("HeroesOfTheVillage", 11);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            this.C.add(re.a($$2.k($$3)));
         }
      }
   }

   public boolean a() {
      return this.e() || this.f();
   }

   public boolean b() {
      return this.c() && this.r() == 0 && this.O > 0;
   }

   public boolean c() {
      return this.L > 0;
   }

   public boolean d() {
      return this.R == ccs.a.d;
   }

   public boolean e() {
      return this.R == ccs.a.b;
   }

   public boolean f() {
      return this.R == ccs.a.c;
   }

   public float g() {
      return this.I;
   }

   public Set<cct> h() {
      Set<cct> $$0 = Sets.newHashSet();

      for (Set<cct> $$1 : this.B.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public cpk i() {
      return this.F;
   }

   public boolean j() {
      return this.G;
   }

   public int k() {
      return this.L;
   }

   private Predicate<akj> x() {
      return $$0 -> {
         gv $$1 = $$0.dk();
         return $$0.bv() && this.F.c($$1) == this;
      };
   }

   private void y() {
      Set<akj> $$0 = Sets.newHashSet(this.M.h());
      List<akj> $$1 = this.F.a(this.x());

      for (akj $$2 : $$1) {
         if (!$$0.contains($$2)) {
            this.M.a($$2);
         }
      }

      for (akj $$3 : $$0) {
         if (!$$1.contains($$3)) {
            this.M.b($$3);
         }
      }
   }

   public int l() {
      return 5;
   }

   public int m() {
      return this.J;
   }

   public void a(int $$0) {
      this.J = $$0;
   }

   public void a(cbl $$0) {
      if ($$0.a(bhv.E)) {
         this.J = this.J + $$0.b(bhv.E).e() + 1;
         this.J = aro.a(this.J, 0, this.l());
      }

      $$0.d(bhv.E);
   }

   public void n() {
      this.K = false;
      this.M.b();
      this.R = ccs.a.d;
   }

   public void o() {
      if (!this.d()) {
         if (this.R == ccs.a.a) {
            boolean $$0 = this.K;
            this.K = this.F.A(this.E);
            if (this.F.ai() == bgl.a) {
               this.n();
               return;
            }

            if ($$0 != this.K) {
               this.M.d(this.K);
            }

            if (!this.K) {
               return;
            }

            if (!this.F.b(this.E)) {
               this.z();
            }

            if (!this.F.b(this.E)) {
               if (this.L > 0) {
                  this.R = ccs.a.c;
               } else {
                  this.n();
               }
            }

            this.D++;
            if (this.D >= 48000L) {
               this.n();
               return;
            }

            int $$1 = this.r();
            if ($$1 == 0 && this.A()) {
               if (this.O <= 0) {
                  if (this.O == 0 && this.L > 0) {
                     this.O = 300;
                     this.M.a(u);
                     return;
                  }
               } else {
                  boolean $$2 = this.T.isPresent();
                  boolean $$3 = !$$2 && this.O % 5 == 0;
                  if ($$2 && !this.F.e(this.T.get())) {
                     $$3 = true;
                  }

                  if ($$3) {
                     int $$4 = 0;
                     if (this.O < 100) {
                        $$4 = 1;
                     } else if (this.O < 40) {
                        $$4 = 2;
                     }

                     this.T = this.d($$4);
                  }

                  if (this.O == 300 || this.O % 20 == 0) {
                     this.y();
                  }

                  this.O--;
                  this.M.a(aro.a((float)(300 - this.O) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.D % 20L == 0L) {
               this.y();
               this.F();
               if ($$1 > 0) {
                  if ($$1 <= 2) {
                     this.M.a(u.e().f(" - ").b(te.a("event.minecraft.raid.raiders_remaining", $$1)));
                  } else {
                     this.M.a(u);
                  }
               } else {
                  this.M.a(u);
               }
            }

            boolean $$5 = false;
            int $$6 = 0;

            while (this.G()) {
               gv $$7 = this.T.isPresent() ? this.T.get() : this.a($$6, 20);
               if ($$7 != null) {
                  this.G = true;
                  this.b($$7);
                  if (!$$5) {
                     this.a($$7);
                     $$5 = true;
                  }
               } else {
                  $$6++;
               }

               if ($$6 > 3) {
                  this.n();
                  break;
               }
            }

            if (this.j() && !this.A() && $$1 == 0) {
               if (this.N < 40) {
                  this.N++;
               } else {
                  this.R = ccs.a.b;

                  for (UUID $$8 : this.C) {
                     big $$9 = this.F.a($$8);
                     if ($$9 instanceof biw && !$$9.G_()) {
                        biw $$10 = (biw)$$9;
                        $$10.b(new bht(bhv.F, 48000, this.J - 1, false, false, true));
                        if ($$10 instanceof akj $$11) {
                           $$11.a(ape.aB);
                           ai.H.a($$11);
                        }
                     }
                  }
               }
            }

            this.H();
         } else if (this.a()) {
            this.S++;
            if (this.S >= 600) {
               this.n();
               return;
            }

            if (this.S % 20 == 0) {
               this.y();
               this.M.d(true);
               if (this.e()) {
                  this.M.a(0.0F);
                  this.M.a(x);
               } else {
                  this.M.a(y);
               }
            }
         }
      }
   }

   private void z() {
      Stream<hy> $$0 = hy.a(hy.a(this.E), 2);
      $$0.filter(this.F::a).map(hy::q).min(Comparator.comparingDouble($$0x -> $$0x.j(this.E))).ifPresent(this::c);
   }

   private Optional<gv> d(int $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         gv $$2 = this.a($$0, 1);
         if ($$2 != null) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   private boolean A() {
      return this.C() ? !this.D() : !this.B();
   }

   private boolean B() {
      return this.k() == this.Q;
   }

   private boolean C() {
      return this.J > 1;
   }

   private boolean D() {
      return this.k() > this.Q;
   }

   private boolean E() {
      return this.B() && this.r() == 0 && this.C();
   }

   private void F() {
      Iterator<Set<cct>> $$0 = this.B.values().iterator();
      Set<cct> $$1 = Sets.newHashSet();

      while ($$0.hasNext()) {
         Set<cct> $$2 = $$0.next();

         for (cct $$3 : $$2) {
            gv $$4 = $$3.dk();
            if ($$3.dF() || $$3.dK().ac() != this.F.ac() || this.E.j($$4) >= 12544.0) {
               $$1.add($$3);
            } else if ($$3.ah > 600) {
               if (this.F.a($$3.cv()) == null) {
                  $$1.add($$3);
               }

               if (!this.F.b($$4) && $$3.ej() > 2400) {
                  $$3.c($$3.gr() + 1);
               }

               if ($$3.gr() >= 30) {
                  $$1.add($$3);
               }
            }
         }
      }

      for (cct $$5 : $$1) {
         this.a($$5, true);
      }
   }

   private void a(gv $$0) {
      float $$1 = 13.0F;
      int $$2 = 64;
      Collection<akj> $$3 = this.M.h();
      long $$4 = this.P.g();

      for (akj $$5 : this.F.v()) {
         ehf $$6 = $$5.di();
         ehf $$7 = ehf.b($$0);
         double $$8 = Math.sqrt(($$7.c - $$6.c) * ($$7.c - $$6.c) + ($$7.e - $$6.e) * ($$7.e - $$6.e));
         double $$9 = $$6.c + 13.0 / $$8 * ($$7.c - $$6.c);
         double $$10 = $$6.e + 13.0 / $$8 * ($$7.e - $$6.e);
         if ($$8 <= 64.0 || $$3.contains($$5)) {
            $$5.c.b(new aag(aou.tp, aov.g, $$9, $$5.dr(), $$10, 64.0F, 1.0F, $$4));
         }
      }
   }

   private void b(gv $$0) {
      boolean $$1 = false;
      int $$2 = this.L + 1;
      this.I = 0.0F;
      bgm $$3 = this.F.d_($$0);
      boolean $$4 = this.E();

      for (ccs.b $$5 : ccs.b.f) {
         int $$6 = this.a($$5, $$2, $$4) + this.a($$5, this.P, $$2, $$3, $$4);
         int $$7 = 0;

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            cct $$9 = $$5.g.a((cpk)this.F);
            if ($$9 == null) {
               break;
            }

            if (!$$1 && $$9.ga()) {
               $$9.w(true);
               this.a($$2, $$9);
               $$1 = true;
            }

            this.a($$2, $$9, $$0, false);
            if ($$5.g == bik.aD) {
               cct $$10 = null;
               if ($$2 == this.a(bgl.c)) {
                  $$10 = bik.ay.a((cpk)this.F);
               } else if ($$2 >= this.a(bgl.d)) {
                  if ($$7 == 0) {
                     $$10 = bik.G.a((cpk)this.F);
                  } else {
                     $$10 = bik.bg.a((cpk)this.F);
                  }
               }

               $$7++;
               if ($$10 != null) {
                  this.a($$2, $$10, $$0, false);
                  $$10.a($$0, 0.0F, 0.0F);
                  $$10.n($$9);
               }
            }
         }
      }

      this.T = Optional.empty();
      this.L++;
      this.p();
      this.H();
   }

   public void a(int $$0, cct $$1, @Nullable gv $$2, boolean $$3) {
      boolean $$4 = this.b($$0, $$1);
      if ($$4) {
         $$1.a(this);
         $$1.b($$0);
         $$1.z(true);
         $$1.c(0);
         if (!$$3 && $$2 != null) {
            $$1.e((double)$$2.u() + 0.5, (double)$$2.v() + 1.0, (double)$$2.w() + 0.5);
            $$1.a(this.F, this.F.d_($$2), bja.h, null, null);
            $$1.a($$0, false);
            $$1.c(true);
            this.F.a_($$1);
         }
      }
   }

   public void p() {
      this.M.a(aro.a(this.q() / this.I, 0.0F, 1.0F));
   }

   public float q() {
      float $$0 = 0.0F;

      for (Set<cct> $$1 : this.B.values()) {
         for (cct $$2 : $$1) {
            $$0 += $$2.et();
         }
      }

      return $$0;
   }

   private boolean G() {
      return this.O == 0 && (this.L < this.Q || this.E()) && this.r() == 0;
   }

   public int r() {
      return this.B.values().stream().mapToInt(Set::size).sum();
   }

   public void a(cct $$0, boolean $$1) {
      Set<cct> $$2 = this.B.get($$0.gp());
      if ($$2 != null) {
         boolean $$3 = $$2.remove($$0);
         if ($$3) {
            if ($$1) {
               this.I = this.I - $$0.et();
            }

            $$0.a(null);
            this.p();
            this.H();
         }
      }
   }

   private void H() {
      this.F.x().c();
   }

   public static ciw s() {
      ciw $$0 = new ciw(ciz.tV);
      qs $$1 = new qs();
      qy $$2 = new dcb.a().a(dcc.z, chk.j).a(dcc.f, chk.i).a(dcc.j, chk.h).a(dcc.E, chk.i).a(dcc.k, chk.p).a(dcc.B, chk.i).a(dcc.y, chk.i).a(dcc.E, chk.p).a();
      $$1.a("Patterns", $$2);
      cgp.a($$0, dcm.t, $$1);
      $$0.a(ciw.a.f);
      $$0.a(te.c("block.minecraft.ominous_banner").a(n.g));
      return $$0;
   }

   @Nullable
   public cct b(int $$0) {
      return this.A.get($$0);
   }

   @Nullable
   private gv a(int $$0, int $$1) {
      int $$2 = $$0 == 0 ? 2 : 2 - $$0;
      gv.a $$3 = new gv.a();

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         float $$5 = this.F.z.i() * (float) (Math.PI * 2);
         int $$6 = this.E.u() + aro.d(aro.b($$5) * 32.0F * (float)$$2) + this.F.z.a(5);
         int $$7 = this.E.w() + aro.d(aro.a($$5) * 32.0F * (float)$$2) + this.F.z.a(5);
         int $$8 = this.F.a(dkh.a.b, $$6, $$7);
         $$3.d($$6, $$8, $$7);
         if (!this.F.b($$3) || $$0 >= 2) {
            int $$9 = 10;
            if (this.F.b($$3.u() - 10, $$3.w() - 10, $$3.u() + 10, $$3.w() + 10)
               && this.F.e($$3)
               && (cpv.a(bjr.c.a, this.F, $$3, bik.aD) || this.F.a_($$3.d()).a(csl.dN) && this.F.a_($$3).i())) {
               return $$3;
            }
         }
      }

      return null;
   }

   private boolean b(int $$0, cct $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(int $$0, cct $$1, boolean $$2) {
      this.B.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
      Set<cct> $$3 = this.B.get($$0);
      cct $$4 = null;

      for (cct $$5 : $$3) {
         if ($$5.cv().equals($$1.cv())) {
            $$4 = $$5;
            break;
         }
      }

      if ($$4 != null) {
         $$3.remove($$4);
         $$3.add($$1);
      }

      $$3.add($$1);
      if ($$2) {
         this.I = this.I + $$1.et();
      }

      this.p();
      this.H();
      return true;
   }

   public void a(int $$0, cct $$1) {
      this.A.put($$0, $$1);
      $$1.a(bil.f, s());
      $$1.a(bil.f, 2.0F);
   }

   public void c(int $$0) {
      this.A.remove($$0);
   }

   public gv t() {
      return this.E;
   }

   private void c(gv $$0) {
      this.E = $$0;
   }

   public int u() {
      return this.H;
   }

   private int a(ccs.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.Q] : $$0.h[$$1];
   }

   private int a(ccs.b $$0, art $$1, int $$2, bgm $$3, boolean $$4) {
      bgl $$5 = $$3.a();
      boolean $$6 = $$5 == bgl.b;
      boolean $$7 = $$5 == bgl.c;
      int $$9;
      switch ($$0) {
         case d:
            if ($$6 || $$2 <= 2 || $$2 == 4) {
               return 0;
            }

            $$9 = 1;
            break;
         case c:
         case a:
            if ($$6) {
               $$9 = $$1.a(2);
            } else if ($$7) {
               $$9 = 1;
            } else {
               $$9 = 2;
            }
            break;
         case e:
            $$9 = !$$6 && $$4 ? 1 : 0;
            break;
         default:
            return 0;
      }

      return $$9 > 0 ? $$1.a($$9 + 1) : 0;
   }

   public boolean v() {
      return this.K;
   }

   public qs a(qs $$0) {
      $$0.a("Id", this.H);
      $$0.a("Started", this.G);
      $$0.a("Active", this.K);
      $$0.a("TicksActive", this.D);
      $$0.a("BadOmenLevel", this.J);
      $$0.a("GroupsSpawned", this.L);
      $$0.a("PreRaidTicks", this.O);
      $$0.a("PostRaidTicks", this.N);
      $$0.a("TotalHealth", this.I);
      $$0.a("NumGroups", this.Q);
      $$0.a("Status", this.R.a());
      $$0.a("CX", this.E.u());
      $$0.a("CY", this.E.v());
      $$0.a("CZ", this.E.w());
      qy $$1 = new qy();

      for (UUID $$2 : this.C) {
         $$1.add(re.a($$2));
      }

      $$0.a("HeroesOfTheVillage", $$1);
      return $$0;
   }

   public int a(bgl $$0) {
      switch ($$0) {
         case b:
            return 3;
         case c:
            return 5;
         case d:
            return 7;
         default:
            return 0;
      }
   }

   public float w() {
      int $$0 = this.m();
      if ($$0 == 2) {
         return 0.1F;
      } else if ($$0 == 3) {
         return 0.25F;
      } else if ($$0 == 4) {
         return 0.5F;
      } else {
         return $$0 == 5 ? 0.75F : 0.0F;
      }
   }

   public void a(big $$0) {
      this.C.add($$0.cv());
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final ccs.a[] e = values();

      static ccs.a a(String $$0) {
         for (ccs.a $$1 : e) {
            if ($$0.equalsIgnoreCase($$1.name())) {
               return $$1;
            }
         }

         return a;
      }

      public String a() {
         return this.name().toLowerCase(Locale.ROOT);
      }
   }

   static enum b {
      a(bik.bg, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(bik.G, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(bik.ay, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(bik.bj, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(bik.aD, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final ccs.b[] f = values();
      final bik<? extends cct> g;
      final int[] h;

      private b(bik<? extends cct> $$0, int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
