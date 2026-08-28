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

public class crv {
   public static final bxk a = bxm.a(bwb.aY);
   private static final int i = 7;
   private static final int j = 2;
   private static final int k = 32;
   private static final int l = 48000;
   private static final int m = 5;
   private static final wv n = wv.c("block.minecraft.ominous_banner");
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
   private static final wv t = wv.c("event.minecraft.raid");
   private static final wv u = wv.c("event.minecraft.raid.victory.full");
   private static final wv v = wv.c("event.minecraft.raid.defeat.full");
   private static final int w = 48000;
   private static final int x = 96;
   public static final int g = 9216;
   public static final int h = 12544;
   private final Map<Integer, crw> y = Maps.newHashMap();
   private final Map<Integer, Set<crw>> z = Maps.newHashMap();
   private final Set<UUID> A = Sets.newHashSet();
   private long B;
   private jj C;
   private final arn D;
   private boolean E;
   private final int F;
   private float G;
   private int H;
   private boolean I;
   private int J;
   private final arj K = new arj(t, btg.a.c, btg.b.c);
   private int L;
   private int M;
   private final azs N = azs.a();
   private final int O;
   private crv.a P;
   private int Q;
   private Optional<jj> R = Optional.empty();

   public crv(int $$0, arn $$1, jj $$2) {
      this.F = $$0;
      this.D = $$1;
      this.I = true;
      this.M = 300;
      this.K.a(0.0F);
      this.C = $$2;
      this.O = this.a($$1.an());
      this.P = crv.a.a;
   }

   public crv(arn $$0, tw $$1) {
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
      this.C = new jj($$1.h("CX"), $$1.h("CY"), $$1.h("CZ"));
      this.O = $$1.h("NumGroups");
      this.P = crv.a.a($$1.l("Status"));
      this.A.clear();
      if ($$1.b("HeroesOfTheVillage", 9)) {
         for (ut $$3 : $$1.c("HeroesOfTheVillage", 11)) {
            this.A.add(ul.a($$3));
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
      return this.P == crv.a.d;
   }

   public boolean e() {
      return this.P == crv.a.b;
   }

   public boolean f() {
      return this.P == crv.a.c;
   }

   public float g() {
      return this.G;
   }

   public Set<crw> h() {
      Set<crw> $$0 = Sets.newHashSet();

      for (Set<crw> $$1 : this.z.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public dhp i() {
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
         jj $$1 = $$0.dv();
         return $$0.bK() && this.D.d($$1) == this;
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
      buw $$1 = $$0.c(buy.I);
      if ($$1 == null) {
         return false;
      } else {
         this.H = this.H + $$1.e() + 1;
         this.H = azk.a(this.H, 0, this.l());
         if (!this.c()) {
            $$0.a(awu.aA);
            ap.J.a($$0);
         }

         return true;
      }
   }

   public void n() {
      this.I = false;
      this.K.b();
      this.P = crv.a.d;
   }

   public void o() {
      if (!this.d()) {
         if (this.P == crv.a.a) {
            boolean $$0 = this.I;
            this.I = this.D.B(this.C);
            if (this.D.an() == btn.a) {
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
                  this.P = crv.a.c;
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
                     this.K.a(t.f().f(" - ").b(wv.a("event.minecraft.raid.raiders_remaining", $$1)));
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
               jj $$6 = this.R.orElseGet(() -> this.d(20));
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
                  this.P = crv.a.b;

                  for (UUID $$7 : this.A) {
                     bvs $$8 = this.D.b($$7);
                     if ($$8 instanceof bwr) {
                        bwr $$9 = (bwr)$$8;
                        if (!$$8.U_()) {
                           $$9.a(new buw(buy.F, 48000, this.H - 1, false, false, true));
                           if ($$9 instanceof aro $$10) {
                              $$10.a(awu.aB);
                              ap.I.a($$10);
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
      Stream<kl> $$0 = kl.a(kl.a(this.C), 2);
      $$0.filter(this.D::a).map(kl::k).min(Comparator.comparingDouble($$0x -> $$0x.j(this.C))).ifPresent(this::c);
   }

   private Optional<jj> z() {
      jj $$0 = this.d(8);
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
      Iterator<Set<crw>> $$0 = this.z.values().iterator();
      Set<crw> $$1 = Sets.newHashSet();

      while ($$0.hasNext()) {
         Set<crw> $$2 = $$0.next();

         for (crw $$3 : $$2) {
            jj $$4 = $$3.dv();
            if ($$3.dQ() || $$3.dV().aj() != this.D.aj() || this.C.j($$4) >= 12544.0) {
               $$1.add($$3);
            } else if ($$3.af > 600) {
               if (this.D.b($$3.cG()) == null) {
                  $$1.add($$3);
               }

               if (!this.D.c($$4) && $$3.ev() > 2400) {
                  $$3.c($$3.gH() + 1);
               }

               if ($$3.gH() >= 30) {
                  $$1.add($$3);
               }
            }
         }
      }

      for (crw $$5 : $$1) {
         this.a($$5, true);
         if ($$5.gr()) {
            this.c($$5.gF());
         }
      }
   }

   private void a(jj $$0) {
      float $$1 = 13.0F;
      int $$2 = 64;
      Collection<aro> $$3 = this.K.g();
      long $$4 = this.N.g();

      for (aro $$5 : this.D.z()) {
         fcu $$6 = $$5.dt();
         fcu $$7 = fcu.b($$0);
         double $$8 = Math.sqrt(($$7.d - $$6.d) * ($$7.d - $$6.d) + ($$7.f - $$6.f) * ($$7.f - $$6.f));
         double $$9 = $$6.d + 13.0 / $$8 * ($$7.d - $$6.d);
         double $$10 = $$6.f + 13.0 / $$8 * ($$7.f - $$6.f);
         if ($$8 <= 64.0 || $$3.contains($$5)) {
            $$5.f.b(new afs(awk.vM, awl.g, $$9, $$5.dC(), $$10, 64.0F, 1.0F, $$4));
         }
      }
   }

   private void b(jj $$0) {
      boolean $$1 = false;
      int $$2 = this.J + 1;
      this.G = 0.0F;
      bto $$3 = this.D.d_($$0);
      boolean $$4 = this.E();

      for (crv.b $$5 : crv.b.f) {
         int $$6 = this.a($$5, $$2, $$4) + this.a($$5, this.N, $$2, $$3, $$4);
         int $$7 = 0;

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            crw $$9 = $$5.g.a(this.D, bwa.h);
            if ($$9 == null) {
               break;
            }

            if (!$$1 && $$9.t()) {
               $$9.w(true);
               this.a($$2, $$9);
               $$1 = true;
            }

            this.a($$2, $$9, $$0, false);
            if ($$5.g == bwb.aY) {
               crw $$10 = null;
               if ($$2 == this.a(btn.c)) {
                  $$10 = bwb.aT.a(this.D, bwa.h);
               } else if ($$2 >= this.a(btn.d)) {
                  if ($$7 == 0) {
                     $$10 = bwb.S.a(this.D, bwa.h);
                  } else {
                     $$10 = bwb.bD.a(this.D, bwa.h);
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

   public void a(int $$0, crw $$1, @Nullable jj $$2, boolean $$3) {
      boolean $$4 = this.b($$0, $$1);
      if ($$4) {
         $$1.a(this);
         $$1.b($$0);
         $$1.z(true);
         $$1.c(0);
         if (!$$3 && $$2 != null) {
            $$1.a_((double)$$2.u() + 0.5, (double)$$2.v() + 1.0, (double)$$2.w() + 0.5);
            $$1.a(this.D, this.D.d_($$2), bwa.h, null);
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

      for (Set<crw> $$1 : this.z.values()) {
         for (crw $$2 : $$1) {
            $$0 += $$2.eF();
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

   public void a(crw $$0, boolean $$1) {
      Set<crw> $$2 = this.z.get($$0.gF());
      if ($$2 != null) {
         boolean $$3 = $$2.remove($$0);
         if ($$3) {
            if ($$1) {
               this.G = this.G - $$0.eF();
            }

            $$0.a(null);
            this.p();
            this.H();
         }
      }
   }

   private void H() {
      this.D.B().g();
   }

   public static cxy a(jt<dva> $$0) {
      cxy $$1 = new cxy(cyc.vT);
      dvb $$2 = new dvb.a()
         .a($$0, dvc.z, cwv.j)
         .a($$0, dvc.f, cwv.i)
         .a($$0, dvc.j, cwv.h)
         .a($$0, dvc.E, cwv.i)
         .a($$0, dvc.k, cwv.p)
         .a($$0, dvc.B, cwv.i)
         .a($$0, dvc.y, cwv.i)
         .a($$0, dvc.E, cwv.p)
         .a();
      $$1.b(kx.ak, $$2);
      $$1.b(kx.q, baq.a);
      $$1.b(kx.h, n);
      $$1.b(kx.k, cyu.b);
      return $$1;
   }

   @Nullable
   public crw b(int $$0) {
      return this.y.get($$0);
   }

   @Nullable
   private jj d(int $$0) {
      int $$1 = this.M / 20;
      float $$2 = 0.22F * (float)$$1 - 0.24F;
      jj.a $$3 = new jj.a();
      float $$4 = this.D.A.i() * (float) (Math.PI * 2);

      for (int $$5 = 0; $$5 < $$0; $$5++) {
         float $$6 = $$4 + (float) Math.PI * (float)$$5 / 8.0F;
         int $$7 = this.C.u() + azk.d(azk.b($$6) * 32.0F * $$2) + this.D.A.a(3) * azk.d($$2);
         int $$8 = this.C.w() + azk.d(azk.a($$6) * 32.0F * $$2) + this.D.A.a(3) * azk.d($$2);
         int $$9 = this.D.a(eel.a.b, $$7, $$8);
         if (azk.a($$9 - this.C.v()) <= 96) {
            $$3.d($$7, $$9, $$8);
            if (!this.D.c($$3) || $$1 <= 7) {
               int $$10 = 10;
               if (this.D.b($$3.u() - 10, $$3.w() - 10, $$3.u() + 10, $$3.w() + 10)
                  && this.D.f($$3)
                  && (a.isSpawnPositionOk(this.D, $$3, bwb.aY) || this.D.a_($$3.e()).a(dkw.ea) && this.D.a_($$3).l())) {
                  return $$3;
               }
            }
         }
      }

      return null;
   }

   private boolean b(int $$0, crw $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(int $$0, crw $$1, boolean $$2) {
      this.z.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
      Set<crw> $$3 = this.z.get($$0);
      crw $$4 = null;

      for (crw $$5 : $$3) {
         if ($$5.cG().equals($$1.cG())) {
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
         this.G = this.G + $$1.eF();
      }

      this.p();
      this.H();
      return true;
   }

   public void a(int $$0, crw $$1) {
      this.y.put($$0, $$1);
      $$1.a(bwc.f, a($$1.dX().f(me.d)));
      $$1.a(bwc.f, 2.0F);
   }

   public void c(int $$0) {
      this.y.remove($$0);
   }

   public jj s() {
      return this.C;
   }

   private void c(jj $$0) {
      this.C = $$0;
   }

   public int t() {
      return this.F;
   }

   private int a(crv.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.O] : $$0.h[$$1];
   }

   private int a(crv.b $$0, azs $$1, int $$2, bto $$3, boolean $$4) {
      btn $$5 = $$3.a();
      boolean $$6 = $$5 == btn.b;
      boolean $$7 = $$5 == btn.c;
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

   public tw a(tw $$0) {
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
      uc $$1 = new uc();

      for (UUID $$2 : this.A) {
         $$1.add(ul.a($$2));
      }

      $$0.a("HeroesOfTheVillage", $$1);
      return $$0;
   }

   public int a(btn $$0) {
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

   public void a(bvs $$0) {
      this.A.add($$0.cG());
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final crv.a[] e = values();

      static crv.a a(String $$0) {
         for (crv.a $$1 : e) {
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
      a(bwb.bD, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(bwb.S, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(bwb.aT, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(bwb.bH, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(bwb.aY, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final crv.b[] f = values();
      final bwb<? extends crw> g;
      final int[] h;

      private b(final bwb<? extends crw> $$0, final int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
