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

public class cqa {
   public static final bvu a = bvw.a(bul.aH);
   private static final int i = 7;
   private static final int j = 2;
   private static final int k = 32;
   private static final int l = 48000;
   private static final int m = 5;
   private static final xi n = xi.c("block.minecraft.ominous_banner");
   private static final String o = "event.minecraft.raid.raiders_remaining";
   public static final int b = 16;
   private static final int p = 40;
   private static final int q = 300;
   public static final int c = 2400;
   public static final int d = 600;
   private static final int r = 30;
   public static final int e = 24000;
   public static final int f = 5;
   private static final int s = 2;
   private static final xi t = xi.c("event.minecraft.raid");
   private static final xi u = xi.c("event.minecraft.raid.victory.full");
   private static final xi v = xi.c("event.minecraft.raid.defeat.full");
   private static final int w = 48000;
   private static final int x = 96;
   public static final int g = 9216;
   public static final int h = 12544;
   private final Map<Integer, cqb> y = Maps.newHashMap();
   private final Map<Integer, Set<cqb>> z = Maps.newHashMap();
   private final Set<UUID> A = Sets.newHashSet();
   private long B;
   private jh C;
   private final arn D;
   private boolean E;
   private final int F;
   private float G;
   private int H;
   private boolean I;
   private int J;
   private final ark K = new ark(t, brt.a.c, brt.b.c);
   private int L;
   private int M;
   private final azs N = azs.a();
   private final int O;
   private cqa.a P;
   private int Q;
   private Optional<jh> R = Optional.empty();

   public cqa(int $$0, arn $$1, jh $$2) {
      this.F = $$0;
      this.D = $$1;
      this.I = true;
      this.M = 300;
      this.K.a(0.0F);
      this.C = $$2;
      this.O = this.a($$1.ak());
      this.P = cqa.a.a;
   }

   public cqa(arn $$0, uk $$1) {
      this.D = $$0;
      this.F = $$1.h("Id");
      this.E = $$1.q("Started");
      this.I = $$1.q("Active");
      this.B = $$1.i("TicksActive");
      this.H = $$1.h("BadOmenLevel");
      this.J = $$1.h("GroupsSpawned");
      this.M = $$1.h("PreRaidTicks");
      this.L = $$1.h("PostRaidTicks");
      this.G = $$1.j("TotalHealth");
      this.C = new jh($$1.h("CX"), $$1.h("CY"), $$1.h("CZ"));
      this.O = $$1.h("NumGroups");
      this.P = cqa.a.a($$1.l("Status"));
      this.A.clear();
      if ($$1.b("HeroesOfTheVillage", 9)) {
         for (vh $$3 : $$1.c("HeroesOfTheVillage", 11)) {
            this.A.add(uz.a($$3));
         }
      }
   }

   public boolean a() {
      return this.e() || this.f();
   }

   public boolean b() {
      return this.c() && this.r() == 0 && this.M > 0;
   }

   public boolean c() {
      return this.J > 0;
   }

   public boolean d() {
      return this.P == cqa.a.d;
   }

   public boolean e() {
      return this.P == cqa.a.b;
   }

   public boolean f() {
      return this.P == cqa.a.c;
   }

   public float g() {
      return this.G;
   }

   public Set<cqb> h() {
      Set<cqb> $$0 = Sets.newHashSet();

      for (Set<cqb> $$1 : this.z.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public dfb i() {
      return this.D;
   }

   public boolean j() {
      return this.E;
   }

   public int k() {
      return this.J;
   }

   private Predicate<aro> w() {
      return $$0 -> {
         jh $$1 = $$0.dx();
         return $$0.bM() && this.D.d($$1) == this;
      };
   }

   private void x() {
      Set<aro> $$0 = Sets.newHashSet(this.K.g());
      List<aro> $$1 = this.D.a(this.w());

      for (aro $$2 : $$1) {
         if (!$$0.contains($$2)) {
            this.K.a($$2);
         }
      }

      for (aro $$3 : $$0) {
         if (!$$1.contains($$3)) {
            this.K.b($$3);
         }
      }
   }

   public int l() {
      return 5;
   }

   public int m() {
      return this.H;
   }

   public void a(int $$0) {
      this.H = $$0;
   }

   public boolean a(aro $$0) {
      btj $$1 = $$0.c(btl.I);
      if ($$1 == null) {
         return false;
      } else {
         this.H = this.H + $$1.e() + 1;
         this.H = azk.a(this.H, 0, this.l());
         if (!this.c()) {
            $$0.a(awv.aA);
            ao.J.a($$0);
         }

         return true;
      }
   }

   public void n() {
      this.I = false;
      this.K.b();
      this.P = cqa.a.d;
   }

   public void o() {
      if (!this.d()) {
         if (this.P == cqa.a.a) {
            boolean $$0 = this.I;
            this.I = this.D.B(this.C);
            if (this.D.ak() == bsa.a) {
               this.n();
               return;
            }

            if ($$0 != this.I) {
               this.K.d(this.I);
            }

            if (!this.I) {
               return;
            }

            if (!this.D.c(this.C)) {
               this.y();
            }

            if (!this.D.c(this.C)) {
               if (this.J > 0) {
                  this.P = cqa.a.c;
               } else {
                  this.n();
               }
            }

            this.B++;
            if (this.B >= 48000L) {
               this.n();
               return;
            }

            int $$1 = this.r();
            if ($$1 == 0 && this.A()) {
               if (this.M <= 0) {
                  if (this.M == 0 && this.J > 0) {
                     this.M = 300;
                     this.K.a(t);
                     return;
                  }
               } else {
                  boolean $$2 = this.R.isPresent();
                  boolean $$3 = !$$2 && this.M % 5 == 0;
                  if ($$2 && !this.D.f(this.R.get())) {
                     $$3 = true;
                  }

                  if ($$3) {
                     this.R = this.z();
                  }

                  if (this.M == 300 || this.M % 20 == 0) {
                     this.x();
                  }

                  this.M--;
                  this.K.a(azk.a((float)(300 - this.M) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.B % 20L == 0L) {
               this.x();
               this.F();
               if ($$1 > 0) {
                  if ($$1 <= 2) {
                     this.K.a(t.f().f(" - ").b(xi.a("event.minecraft.raid.raiders_remaining", $$1)));
                  } else {
                     this.K.a(t);
                  }
               } else {
                  this.K.a(t);
               }
            }

            boolean $$4 = false;
            int $$5 = 0;

            while (this.G()) {
               jh $$6 = this.R.orElseGet(() -> this.d(20));
               if ($$6 != null) {
                  this.E = true;
                  this.b($$6);
                  if (!$$4) {
                     this.a($$6);
                     $$4 = true;
                  }
               } else {
                  $$5++;
               }

               if ($$5 > 5) {
                  this.n();
                  break;
               }
            }

            if (this.j() && !this.A() && $$1 == 0) {
               if (this.L < 40) {
                  this.L++;
               } else {
                  this.P = cqa.a.b;

                  for (UUID $$7 : this.A) {
                     bue $$8 = this.D.a($$7);
                     if ($$8 instanceof bva) {
                        bva $$9 = (bva)$$8;
                        if (!$$8.R_()) {
                           $$9.a(new btj(btl.F, 48000, this.H - 1, false, false, true));
                           if ($$9 instanceof aro $$10) {
                              $$10.a(awv.aB);
                              ao.I.a($$10);
                           }
                        }
                     }
                  }
               }
            }

            this.H();
         } else if (this.a()) {
            this.Q++;
            if (this.Q >= 600) {
               this.n();
               return;
            }

            if (this.Q % 20 == 0) {
               this.x();
               this.K.d(true);
               if (this.e()) {
                  this.K.a(0.0F);
                  this.K.a(u);
               } else {
                  this.K.a(v);
               }
            }
         }
      }
   }

   private void y() {
      Stream<kj> $$0 = kj.a(kj.a(this.C), 2);
      $$0.filter(this.D::a).map(kj::k).min(Comparator.comparingDouble($$0x -> $$0x.j(this.C))).ifPresent(this::c);
   }

   private Optional<jh> z() {
      jh $$0 = this.d(8);
      return $$0 != null ? Optional.of($$0) : Optional.empty();
   }

   private boolean A() {
      return this.C() ? !this.D() : !this.B();
   }

   private boolean B() {
      return this.k() == this.O;
   }

   private boolean C() {
      return this.H > 1;
   }

   private boolean D() {
      return this.k() > this.O;
   }

   private boolean E() {
      return this.B() && this.r() == 0 && this.C();
   }

   private void F() {
      Iterator<Set<cqb>> $$0 = this.z.values().iterator();
      Set<cqb> $$1 = Sets.newHashSet();

      while ($$0.hasNext()) {
         Set<cqb> $$2 = $$0.next();

         for (cqb $$3 : $$2) {
            jh $$4 = $$3.dx();
            if ($$3.dS() || $$3.dX().ag() != this.D.ag() || this.C.j($$4) >= 12544.0) {
               $$1.add($$3);
            } else if ($$3.ag > 600) {
               if (this.D.a($$3.cH()) == null) {
                  $$1.add($$3);
               }

               if (!this.D.c($$4) && $$3.ew() > 2400) {
                  $$3.c($$3.gO() + 1);
               }

               if ($$3.gO() >= 30) {
                  $$1.add($$3);
               }
            }
         }
      }

      for (cqb $$5 : $$1) {
         this.a($$5, true);
         if ($$5.gy()) {
            this.c($$5.gM());
         }
      }
   }

   private void a(jh $$0) {
      float $$1 = 13.0F;
      int $$2 = 64;
      Collection<aro> $$3 = this.K.g();
      long $$4 = this.N.g();

      for (aro $$5 : this.D.x()) {
         ezn $$6 = $$5.dv();
         ezn $$7 = ezn.b($$0);
         double $$8 = Math.sqrt(($$7.d - $$6.d) * ($$7.d - $$6.d) + ($$7.f - $$6.f) * ($$7.f - $$6.f));
         double $$9 = $$6.d + 13.0 / $$8 * ($$7.d - $$6.d);
         double $$10 = $$6.f + 13.0 / $$8 * ($$7.f - $$6.f);
         if ($$8 <= 64.0 || $$3.contains($$5)) {
            $$5.g.b(new agc(awl.vb, awm.g, $$9, $$5.dE(), $$10, 64.0F, 1.0F, $$4));
         }
      }
   }

   private void b(jh $$0) {
      boolean $$1 = false;
      int $$2 = this.J + 1;
      this.G = 0.0F;
      bsb $$3 = this.D.d_($$0);
      boolean $$4 = this.E();

      for (cqa.b $$5 : cqa.b.f) {
         int $$6 = this.a($$5, $$2, $$4) + this.a($$5, this.N, $$2, $$3, $$4);
         int $$7 = 0;

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            cqb $$9 = $$5.g.a(this.D, buk.h);
            if ($$9 == null) {
               break;
            }

            if (!$$1 && $$9.gv()) {
               $$9.x(true);
               this.a($$2, $$9);
               $$1 = true;
            }

            this.a($$2, $$9, $$0, false);
            if ($$5.g == bul.aH) {
               cqb $$10 = null;
               if ($$2 == this.a(bsa.c)) {
                  $$10 = bul.aC.a(this.D, buk.h);
               } else if ($$2 >= this.a(bsa.d)) {
                  if ($$7 == 0) {
                     $$10 = bul.J.a(this.D, buk.h);
                  } else {
                     $$10 = bul.bk.a(this.D, buk.h);
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

      this.R = Optional.empty();
      this.J++;
      this.p();
      this.H();
   }

   public void a(int $$0, cqb $$1, @Nullable jh $$2, boolean $$3) {
      boolean $$4 = this.b($$0, $$1);
      if ($$4) {
         $$1.a(this);
         $$1.b($$0);
         $$1.A(true);
         $$1.c(0);
         if (!$$3 && $$2 != null) {
            $$1.a_((double)$$2.u() + 0.5, (double)$$2.v() + 1.0, (double)$$2.w() + 0.5);
            $$1.a(this.D, this.D.d_($$2), buk.h, null);
            $$1.a(this.D, $$0, false);
            $$1.d(true);
            this.D.a_($$1);
         }
      }
   }

   public void p() {
      this.K.a(azk.a(this.q() / this.G, 0.0F, 1.0F));
   }

   public float q() {
      float $$0 = 0.0F;

      for (Set<cqb> $$1 : this.z.values()) {
         for (cqb $$2 : $$1) {
            $$0 += $$2.eG();
         }
      }

      return $$0;
   }

   private boolean G() {
      return this.M == 0 && (this.J < this.O || this.E()) && this.r() == 0;
   }

   public int r() {
      return this.z.values().stream().mapToInt(Set::size).sum();
   }

   public void a(cqb $$0, boolean $$1) {
      Set<cqb> $$2 = this.z.get($$0.gM());
      if ($$2 != null) {
         boolean $$3 = $$2.remove($$0);
         if ($$3) {
            if ($$1) {
               this.G = this.G - $$0.eG();
            }

            $$0.a(null);
            this.p();
            this.H();
         }
      }
   }

   private void H() {
      this.D.z().c();
   }

   public static cwb a(jr<dsc> $$0) {
      cwb $$1 = new cwb(cwf.uR);
      dsd $$2 = new dsd.a()
         .a($$0, dse.z, cuy.j)
         .a($$0, dse.f, cuy.i)
         .a($$0, dse.j, cuy.h)
         .a($$0, dse.E, cuy.i)
         .a($$0, dse.k, cuy.p)
         .a($$0, dse.B, cuy.i)
         .a($$0, dse.y, cuy.i)
         .a($$0, dse.E, cuy.p)
         .a();
      $$1.b(ku.ai, $$2);
      $$1.b(ku.q, bap.a);
      $$1.b(ku.h, n);
      $$1.b(ku.k, cwy.b);
      return $$1;
   }

   @Nullable
   public cqb b(int $$0) {
      return this.y.get($$0);
   }

   @Nullable
   private jh d(int $$0) {
      int $$1 = this.M / 20;
      float $$2 = 0.22F * (float)$$1 - 0.24F;
      jh.a $$3 = new jh.a();
      float $$4 = this.D.A.i() * (float) (Math.PI * 2);

      for (int $$5 = 0; $$5 < $$0; $$5++) {
         float $$6 = $$4 + (float) Math.PI * (float)$$5 / 8.0F;
         int $$7 = this.C.u() + azk.d(azk.b($$6) * 32.0F * $$2) + this.D.A.a(3) * azk.d($$2);
         int $$8 = this.C.w() + azk.d(azk.a($$6) * 32.0F * $$2) + this.D.A.a(3) * azk.d($$2);
         int $$9 = this.D.a(ebf.a.b, $$7, $$8);
         if (azk.a($$9 - this.C.v()) <= 96) {
            $$3.d($$7, $$9, $$8);
            if (!this.D.c($$3) || $$1 <= 7) {
               int $$10 = 10;
               if (this.D.b($$3.u() - 10, $$3.w() - 10, $$3.u() + 10, $$3.w() + 10)
                  && this.D.f($$3)
                  && (a.isSpawnPositionOk(this.D, $$3, bul.aH) || this.D.a_($$3.e()).a(dig.dN) && this.D.a_($$3).l())) {
                  return $$3;
               }
            }
         }
      }

      return null;
   }

   private boolean b(int $$0, cqb $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(int $$0, cqb $$1, boolean $$2) {
      this.z.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
      Set<cqb> $$3 = this.z.get($$0);
      cqb $$4 = null;

      for (cqb $$5 : $$3) {
         if ($$5.cH().equals($$1.cH())) {
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
         this.G = this.G + $$1.eG();
      }

      this.p();
      this.H();
      return true;
   }

   public void a(int $$0, cqb $$1) {
      this.y.put($$0, $$1);
      $$1.a(bum.f, a($$1.dZ().e(lz.d)));
      $$1.a(bum.f, 2.0F);
   }

   public void c(int $$0) {
      this.y.remove($$0);
   }

   public jh s() {
      return this.C;
   }

   private void c(jh $$0) {
      this.C = $$0;
   }

   public int t() {
      return this.F;
   }

   private int a(cqa.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.O] : $$0.h[$$1];
   }

   private int a(cqa.b $$0, azs $$1, int $$2, bsb $$3, boolean $$4) {
      bsa $$5 = $$3.a();
      boolean $$6 = $$5 == bsa.b;
      boolean $$7 = $$5 == bsa.c;
      int $$9;
      switch ($$0) {
         case a:
         case c:
            if ($$6) {
               $$9 = $$1.a(2);
            } else if ($$7) {
               $$9 = 1;
            } else {
               $$9 = 2;
            }
            break;
         case b:
         default:
            return 0;
         case d:
            if ($$6 || $$2 <= 2 || $$2 == 4) {
               return 0;
            }

            $$9 = 1;
            break;
         case e:
            $$9 = !$$6 && $$4 ? 1 : 0;
      }

      return $$9 > 0 ? $$1.a($$9 + 1) : 0;
   }

   public boolean u() {
      return this.I;
   }

   public uk a(uk $$0) {
      $$0.a("Id", this.F);
      $$0.a("Started", this.E);
      $$0.a("Active", this.I);
      $$0.a("TicksActive", this.B);
      $$0.a("BadOmenLevel", this.H);
      $$0.a("GroupsSpawned", this.J);
      $$0.a("PreRaidTicks", this.M);
      $$0.a("PostRaidTicks", this.L);
      $$0.a("TotalHealth", this.G);
      $$0.a("NumGroups", this.O);
      $$0.a("Status", this.P.a());
      $$0.a("CX", this.C.u());
      $$0.a("CY", this.C.v());
      $$0.a("CZ", this.C.w());
      uq $$1 = new uq();

      for (UUID $$2 : this.A) {
         $$1.add(uz.a($$2));
      }

      $$0.a("HeroesOfTheVillage", $$1);
      return $$0;
   }

   public int a(bsa $$0) {
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

   public float v() {
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

   public void a(bue $$0) {
      this.A.add($$0.cH());
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final cqa.a[] e = values();

      static cqa.a a(String $$0) {
         for (cqa.a $$1 : e) {
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
      a(bul.bk, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(bul.J, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(bul.aC, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(bul.bo, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(bul.aH, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final cqa.b[] f = values();
      final bul<? extends cqb> g;
      final int[] h;

      private b(final bul<? extends cqb> $$0, final int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
