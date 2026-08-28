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

public class cpc {
   private static final int h = 2;
   private static final int i = 0;
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 32;
   private static final int m = 48000;
   private static final int n = 3;
   private static final xd o = xd.c("block.minecraft.ominous_banner");
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
   private static final xd u = xd.c("event.minecraft.raid");
   private static final xd v = xd.c("event.minecraft.raid.victory.full");
   private static final xd w = xd.c("event.minecraft.raid.defeat.full");
   private static final int x = 48000;
   public static final int f = 9216;
   public static final int g = 12544;
   private final Map<Integer, cpd> y = Maps.newHashMap();
   private final Map<Integer, Set<cpd>> z = Maps.newHashMap();
   private final Set<UUID> A = Sets.newHashSet();
   private long B;
   private je C;
   private final arg D;
   private boolean E;
   private final int F;
   private float G;
   private int H;
   private boolean I;
   private int J;
   private final ard K = new ard(u, bra.a.c, bra.b.c);
   private int L;
   private int M;
   private final azk N = azk.a();
   private final int O;
   private cpc.a P;
   private int Q;
   private Optional<je> R = Optional.empty();

   public cpc(int $$0, arg $$1, je $$2) {
      this.F = $$0;
      this.D = $$1;
      this.I = true;
      this.M = 300;
      this.K.a(0.0F);
      this.C = $$2;
      this.O = this.a($$1.am());
      this.P = cpc.a.a;
   }

   public cpc(arg $$0, uf $$1) {
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
      this.C = new je($$1.h("CX"), $$1.h("CY"), $$1.h("CZ"));
      this.O = $$1.h("NumGroups");
      this.P = cpc.a.a($$1.l("Status"));
      this.A.clear();
      if ($$1.b("HeroesOfTheVillage", 9)) {
         for (vc $$3 : $$1.c("HeroesOfTheVillage", 11)) {
            this.A.add(uu.a($$3));
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
      return this.P == cpc.a.d;
   }

   public boolean e() {
      return this.P == cpc.a.b;
   }

   public boolean f() {
      return this.P == cpc.a.c;
   }

   public float g() {
      return this.G;
   }

   public Set<cpd> h() {
      Set<cpd> $$0 = Sets.newHashSet();

      for (Set<cpd> $$1 : this.z.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public dds i() {
      return this.D;
   }

   public boolean j() {
      return this.E;
   }

   public int k() {
      return this.J;
   }

   private Predicate<arh> w() {
      return $$0 -> {
         je $$1 = $$0.ds();
         return $$0.bI() && this.D.d($$1) == this;
      };
   }

   private void x() {
      Set<arh> $$0 = Sets.newHashSet(this.K.g());
      List<arh> $$1 = this.D.a(this.w());

      for (arh $$2 : $$1) {
         if (!$$0.contains($$2)) {
            this.K.a($$2);
         }
      }

      for (arh $$3 : $$0) {
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

   public boolean a(arh $$0) {
      bsq $$1 = $$0.c(bss.I);
      if ($$1 == null) {
         return false;
      } else {
         this.H = this.H + $$1.e() + 1;
         this.H = azc.a(this.H, 0, this.l());
         if (!this.c()) {
            $$0.a(awn.aA);
            an.J.a($$0);
         }

         return true;
      }
   }

   public void n() {
      this.I = false;
      this.K.b();
      this.P = cpc.a.d;
   }

   public void o() {
      if (!this.d()) {
         if (this.P == cpc.a.a) {
            boolean $$0 = this.I;
            this.I = this.D.B(this.C);
            if (this.D.am() == brh.a) {
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
                  this.P = cpc.a.c;
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
            if ($$1 == 0 && this.z()) {
               if (this.M <= 0) {
                  if (this.M == 0 && this.J > 0) {
                     this.M = 300;
                     this.K.a(u);
                     return;
                  }
               } else {
                  boolean $$2 = this.R.isPresent();
                  boolean $$3 = !$$2 && this.M % 5 == 0;
                  if ($$2 && !this.D.f(this.R.get())) {
                     $$3 = true;
                  }

                  if ($$3) {
                     int $$4 = 0;
                     if (this.M < 100) {
                        $$4 = 1;
                     } else if (this.M < 40) {
                        $$4 = 2;
                     }

                     this.R = this.d($$4);
                  }

                  if (this.M == 300 || this.M % 20 == 0) {
                     this.x();
                  }

                  this.M--;
                  this.K.a(azc.a((float)(300 - this.M) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.B % 20L == 0L) {
               this.x();
               this.E();
               if ($$1 > 0) {
                  if ($$1 <= 2) {
                     this.K.a(u.f().f(" - ").b(xd.a("event.minecraft.raid.raiders_remaining", $$1)));
                  } else {
                     this.K.a(u);
                  }
               } else {
                  this.K.a(u);
               }
            }

            boolean $$5 = false;
            int $$6 = 0;

            while (this.F()) {
               je $$7 = this.R.isPresent() ? this.R.get() : this.a($$6, 20);
               if ($$7 != null) {
                  this.E = true;
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

            if (this.j() && !this.z() && $$1 == 0) {
               if (this.L < 40) {
                  this.L++;
               } else {
                  this.P = cpc.a.b;

                  for (UUID $$8 : this.A) {
                     btj $$9 = this.D.a($$8);
                     if ($$9 instanceof buf) {
                        buf $$10 = (buf)$$9;
                        if (!$$9.P_()) {
                           $$10.b(new bsq(bss.F, 48000, this.H - 1, false, false, true));
                           if ($$10 instanceof arh $$11) {
                              $$11.a(awn.aB);
                              an.I.a($$11);
                           }
                        }
                     }
                  }
               }
            }

            this.G();
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
                  this.K.a(v);
               } else {
                  this.K.a(w);
               }
            }
         }
      }
   }

   private void y() {
      Stream<kg> $$0 = kg.a(kg.a(this.C), 2);
      $$0.filter(this.D::a).map(kg::k).min(Comparator.comparingDouble($$0x -> $$0x.j(this.C))).ifPresent(this::c);
   }

   private Optional<je> d(int $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         je $$2 = this.a($$0, 1);
         if ($$2 != null) {
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   private boolean z() {
      return this.B() ? !this.C() : !this.A();
   }

   private boolean A() {
      return this.k() == this.O;
   }

   private boolean B() {
      return this.H > 1;
   }

   private boolean C() {
      return this.k() > this.O;
   }

   private boolean D() {
      return this.A() && this.r() == 0 && this.B();
   }

   private void E() {
      Iterator<Set<cpd>> $$0 = this.z.values().iterator();
      Set<cpd> $$1 = Sets.newHashSet();

      while ($$0.hasNext()) {
         Set<cpd> $$2 = $$0.next();

         for (cpd $$3 : $$2) {
            je $$4 = $$3.ds();
            if ($$3.dN() || $$3.dS().ag() != this.D.ag() || this.C.j($$4) >= 12544.0) {
               $$1.add($$3);
            } else if ($$3.ag > 600) {
               if (this.D.a($$3.cD()) == null) {
                  $$1.add($$3);
               }

               if (!this.D.c($$4) && $$3.eq() > 2400) {
                  $$3.c($$3.gI() + 1);
               }

               if ($$3.gI() >= 30) {
                  $$1.add($$3);
               }
            }
         }
      }

      for (cpd $$5 : $$1) {
         this.a($$5, true);
         if ($$5.gs()) {
            this.c($$5.gG());
         }
      }
   }

   private void a(je $$0) {
      float $$1 = 13.0F;
      int $$2 = 64;
      Collection<arh> $$3 = this.K.g();
      long $$4 = this.N.g();

      for (arh $$5 : this.D.x()) {
         eye $$6 = $$5.dq();
         eye $$7 = eye.b($$0);
         double $$8 = Math.sqrt(($$7.d - $$6.d) * ($$7.d - $$6.d) + ($$7.f - $$6.f) * ($$7.f - $$6.f));
         double $$9 = $$6.d + 13.0 / $$8 * ($$7.d - $$6.d);
         double $$10 = $$6.f + 13.0 / $$8 * ($$7.f - $$6.f);
         if ($$8 <= 64.0 || $$3.contains($$5)) {
            $$5.c.b(new afx(awd.vd, awe.g, $$9, $$5.dz(), $$10, 64.0F, 1.0F, $$4));
         }
      }
   }

   private void b(je $$0) {
      boolean $$1 = false;
      int $$2 = this.J + 1;
      this.G = 0.0F;
      bri $$3 = this.D.d_($$0);
      boolean $$4 = this.D();

      for (cpc.b $$5 : cpc.b.f) {
         int $$6 = this.a($$5, $$2, $$4) + this.a($$5, this.N, $$2, $$3, $$4);
         int $$7 = 0;

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            cpd $$9 = $$5.g.a(this.D, btp.h);
            if ($$9 == null) {
               break;
            }

            if (!$$1 && $$9.gp()) {
               $$9.x(true);
               this.a($$2, $$9);
               $$1 = true;
            }

            this.a($$2, $$9, $$0, false);
            if ($$5.g == btq.aH) {
               cpd $$10 = null;
               if ($$2 == this.a(brh.c)) {
                  $$10 = btq.aC.a(this.D, btp.h);
               } else if ($$2 >= this.a(brh.d)) {
                  if ($$7 == 0) {
                     $$10 = btq.J.a(this.D, btp.h);
                  } else {
                     $$10 = btq.bk.a(this.D, btp.h);
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
      this.G();
   }

   public void a(int $$0, cpd $$1, @Nullable je $$2, boolean $$3) {
      boolean $$4 = this.b($$0, $$1);
      if ($$4) {
         $$1.a(this);
         $$1.b($$0);
         $$1.A(true);
         $$1.c(0);
         if (!$$3 && $$2 != null) {
            $$1.a_((double)$$2.u() + 0.5, (double)$$2.v() + 1.0, (double)$$2.w() + 0.5);
            $$1.a(this.D, this.D.d_($$2), btp.h, null);
            $$1.a(this.D, $$0, false);
            $$1.d(true);
            this.D.a_($$1);
         }
      }
   }

   public void p() {
      this.K.a(azc.a(this.q() / this.G, 0.0F, 1.0F));
   }

   public float q() {
      float $$0 = 0.0F;

      for (Set<cpd> $$1 : this.z.values()) {
         for (cpd $$2 : $$1) {
            $$0 += $$2.eA();
         }
      }

      return $$0;
   }

   private boolean F() {
      return this.M == 0 && (this.J < this.O || this.D()) && this.r() == 0;
   }

   public int r() {
      return this.z.values().stream().mapToInt(Set::size).sum();
   }

   public void a(cpd $$0, boolean $$1) {
      Set<cpd> $$2 = this.z.get($$0.gG());
      if ($$2 != null) {
         boolean $$3 = $$2.remove($$0);
         if ($$3) {
            if ($$1) {
               this.G = this.G - $$0.eA();
            }

            $$0.a(null);
            this.p();
            this.G();
         }
      }
   }

   private void G() {
      this.D.z().c();
   }

   public static cvl a(jo<dqu> $$0) {
      cvl $$1 = new cvl(cvo.uR);
      dqv $$2 = new dqv.a()
         .a($$0, dqw.z, cue.j)
         .a($$0, dqw.f, cue.i)
         .a($$0, dqw.j, cue.h)
         .a($$0, dqw.E, cue.i)
         .a($$0, dqw.k, cue.p)
         .a($$0, dqw.B, cue.i)
         .a($$0, dqw.y, cue.i)
         .a($$0, dqw.E, cue.p)
         .a();
      $$1.b(kr.aa, $$2);
      $$1.b(kr.p, bah.a);
      $$1.b(kr.h, o);
      $$1.b(kr.j, cwj.b);
      return $$1;
   }

   @Nullable
   public cpd b(int $$0) {
      return this.y.get($$0);
   }

   @Nullable
   private je a(int $$0, int $$1) {
      int $$2 = $$0 == 0 ? 2 : 2 - $$0;
      je.a $$3 = new je.a();
      buy $$4 = bva.a(btq.aH);

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         float $$6 = this.D.z.i() * (float) (Math.PI * 2);
         int $$7 = this.C.u() + azc.d(azc.b($$6) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$8 = this.C.w() + azc.d(azc.a($$6) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$9 = this.D.a(dzw.a.b, $$7, $$8);
         if (azc.a($$9 - this.C.v()) <= 32 * $$2) {
            $$3.d($$7, $$9, $$8);
            if (!this.D.c($$3) || $$0 >= 2) {
               int $$10 = 10;
               if (this.D.b($$3.u() - 10, $$3.w() - 10, $$3.u() + 10, $$3.w() + 10)
                  && this.D.f($$3)
                  && ($$4.isSpawnPositionOk(this.D, $$3, btq.aH) || this.D.a_($$3.e()).a(dgx.dN) && this.D.a_($$3).l())) {
                  return $$3;
               }
            }
         }
      }

      return null;
   }

   private boolean b(int $$0, cpd $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(int $$0, cpd $$1, boolean $$2) {
      this.z.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
      Set<cpd> $$3 = this.z.get($$0);
      cpd $$4 = null;

      for (cpd $$5 : $$3) {
         if ($$5.cD().equals($$1.cD())) {
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
         this.G = this.G + $$1.eA();
      }

      this.p();
      this.G();
      return true;
   }

   public void a(int $$0, cpd $$1) {
      this.y.put($$0, $$1);
      $$1.a(btr.f, a($$1.dU().b(lv.d)));
      $$1.a(btr.f, 2.0F);
   }

   public void c(int $$0) {
      this.y.remove($$0);
   }

   public je s() {
      return this.C;
   }

   private void c(je $$0) {
      this.C = $$0;
   }

   public int t() {
      return this.F;
   }

   private int a(cpc.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.O] : $$0.h[$$1];
   }

   private int a(cpc.b $$0, azk $$1, int $$2, bri $$3, boolean $$4) {
      brh $$5 = $$3.a();
      boolean $$6 = $$5 == brh.b;
      boolean $$7 = $$5 == brh.c;
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

   public uf a(uf $$0) {
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
      ul $$1 = new ul();

      for (UUID $$2 : this.A) {
         $$1.add(uu.a($$2));
      }

      $$0.a("HeroesOfTheVillage", $$1);
      return $$0;
   }

   public int a(brh $$0) {
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

   public void a(btj $$0) {
      this.A.add($$0.cD());
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final cpc.a[] e = values();

      static cpc.a a(String $$0) {
         for (cpc.a $$1 : e) {
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
      a(btq.bk, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(btq.J, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(btq.aC, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(btq.bo, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(btq.aH, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final cpc.b[] f = values();
      final btq<? extends cpd> g;
      final int[] h;

      private b(final btq<? extends cpd> $$0, final int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
