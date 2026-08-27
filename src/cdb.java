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

public class cdb {
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
   private static final tl u = tl.c("event.minecraft.raid");
   private static final tl v = tl.c("event.minecraft.raid.victory.full");
   private static final tl w = tl.c("event.minecraft.raid.defeat.full");
   private static final int x = 48000;
   public static final int f = 9216;
   public static final int g = 12544;
   private final Map<Integer, cdc> y = Maps.newHashMap();
   private final Map<Integer, Set<cdc>> z = Maps.newHashMap();
   private final Set<UUID> A = Sets.newHashSet();
   private long B;
   private gw C;
   private final akq D;
   private boolean E;
   private final int F;
   private float G;
   private int H;
   private boolean I;
   private int J;
   private final akn K = new akn(u, bgo.a.c, bgo.b.c);
   private int L;
   private int M;
   private final asc N = asc.a();
   private final int O;
   private cdb.a P;
   private int Q;
   private Optional<gw> R = Optional.empty();

   public cdb(int $$0, akq $$1, gw $$2) {
      this.F = $$0;
      this.D = $$1;
      this.I = true;
      this.M = 300;
      this.K.a(0.0F);
      this.C = $$2;
      this.O = this.a($$1.ai());
      this.P = cdb.a.a;
   }

   public cdb(akq $$0, qw $$1) {
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
      this.C = new gw($$1.h("CX"), $$1.h("CY"), $$1.h("CZ"));
      this.O = $$1.h("NumGroups");
      this.P = cdb.a.a($$1.l("Status"));
      this.A.clear();
      if ($$1.b("HeroesOfTheVillage", 9)) {
         for (rq $$3 : $$1.c("HeroesOfTheVillage", 11)) {
            this.A.add(rj.a($$3));
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
      return this.P == cdb.a.d;
   }

   public boolean e() {
      return this.P == cdb.a.b;
   }

   public boolean f() {
      return this.P == cdb.a.c;
   }

   public float g() {
      return this.G;
   }

   public Set<cdc> h() {
      Set<cdc> $$0 = Sets.newHashSet();

      for (Set<cdc> $$1 : this.z.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public cpv i() {
      return this.D;
   }

   public boolean j() {
      return this.E;
   }

   public int k() {
      return this.J;
   }

   private Predicate<akr> x() {
      return $$0 -> {
         gw $$1 = $$0.dl();
         return $$0.bv() && this.D.c($$1) == this;
      };
   }

   private void y() {
      Set<akr> $$0 = Sets.newHashSet(this.K.h());
      List<akr> $$1 = this.D.a(this.x());

      for (akr $$2 : $$1) {
         if (!$$0.contains($$2)) {
            this.K.a($$2);
         }
      }

      for (akr $$3 : $$0) {
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

   public void a(cbu $$0) {
      if ($$0.a(bif.E)) {
         this.H = this.H + $$0.b(bif.E).e() + 1;
         this.H = arw.a(this.H, 0, this.l());
      }

      $$0.d(bif.E);
   }

   public void n() {
      this.I = false;
      this.K.b();
      this.P = cdb.a.d;
   }

   public void o() {
      if (!this.d()) {
         if (this.P == cdb.a.a) {
            boolean $$0 = this.I;
            this.I = this.D.A(this.C);
            if (this.D.ai() == bgv.a) {
               this.n();
               return;
            }

            if ($$0 != this.I) {
               this.K.d(this.I);
            }

            if (!this.I) {
               return;
            }

            if (!this.D.b(this.C)) {
               this.z();
            }

            if (!this.D.b(this.C)) {
               if (this.J > 0) {
                  this.P = cdb.a.c;
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
                     this.K.a(u);
                     return;
                  }
               } else {
                  boolean $$2 = this.R.isPresent();
                  boolean $$3 = !$$2 && this.M % 5 == 0;
                  if ($$2 && !this.D.e(this.R.get())) {
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
                     this.y();
                  }

                  this.M--;
                  this.K.a(arw.a((float)(300 - this.M) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.B % 20L == 0L) {
               this.y();
               this.F();
               if ($$1 > 0) {
                  if ($$1 <= 2) {
                     this.K.a(u.e().f(" - ").b(tl.a("event.minecraft.raid.raiders_remaining", $$1)));
                  } else {
                     this.K.a(u);
                  }
               } else {
                  this.K.a(u);
               }
            }

            boolean $$5 = false;
            int $$6 = 0;

            while (this.G()) {
               gw $$7 = this.R.isPresent() ? this.R.get() : this.a($$6, 20);
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

            if (this.j() && !this.A() && $$1 == 0) {
               if (this.L < 40) {
                  this.L++;
               } else {
                  this.P = cdb.a.b;

                  for (UUID $$8 : this.A) {
                     biq $$9 = this.D.a($$8);
                     if ($$9 instanceof bjg) {
                        bjg $$10 = (bjg)$$9;
                        if (!$$9.M_()) {
                           $$10.b(new bid(bif.F, 48000, this.H - 1, false, false, true));
                           if ($$10 instanceof akr $$11) {
                              $$11.a(apn.aB);
                              al.H.a($$11);
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
               this.y();
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

   private void z() {
      Stream<hw> $$0 = hw.a(hw.a(this.C), 2);
      $$0.filter(this.D::a).map(hw::q).min(Comparator.comparingDouble($$0x -> $$0x.j(this.C))).ifPresent(this::c);
   }

   private Optional<gw> d(int $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         gw $$2 = this.a($$0, 1);
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
      Iterator<Set<cdc>> $$0 = this.z.values().iterator();
      Set<cdc> $$1 = Sets.newHashSet();

      while ($$0.hasNext()) {
         Set<cdc> $$2 = $$0.next();

         for (cdc $$3 : $$2) {
            gw $$4 = $$3.dl();
            if ($$3.dG() || $$3.dL().ac() != this.D.ac() || this.C.j($$4) >= 12544.0) {
               $$1.add($$3);
            } else if ($$3.ah > 600) {
               if (this.D.a($$3.cv()) == null) {
                  $$1.add($$3);
               }

               if (!this.D.b($$4) && $$3.ek() > 2400) {
                  $$3.c($$3.gv() + 1);
               }

               if ($$3.gv() >= 30) {
                  $$1.add($$3);
               }
            }
         }
      }

      for (cdc $$5 : $$1) {
         this.a($$5, true);
      }
   }

   private void a(gw $$0) {
      float $$1 = 13.0F;
      int $$2 = 64;
      Collection<akr> $$3 = this.K.h();
      long $$4 = this.N.g();

      for (akr $$5 : this.D.v()) {
         ehn $$6 = $$5.dj();
         ehn $$7 = ehn.b($$0);
         double $$8 = Math.sqrt(($$7.c - $$6.c) * ($$7.c - $$6.c) + ($$7.e - $$6.e) * ($$7.e - $$6.e));
         double $$9 = $$6.c + 13.0 / $$8 * ($$7.c - $$6.c);
         double $$10 = $$6.e + 13.0 / $$8 * ($$7.e - $$6.e);
         if ($$8 <= 64.0 || $$3.contains($$5)) {
            $$5.c.b(new aan(apd.tp, ape.g, $$9, $$5.ds(), $$10, 64.0F, 1.0F, $$4));
         }
      }
   }

   private void b(gw $$0) {
      boolean $$1 = false;
      int $$2 = this.J + 1;
      this.G = 0.0F;
      bgw $$3 = this.D.d_($$0);
      boolean $$4 = this.E();

      for (cdb.b $$5 : cdb.b.f) {
         int $$6 = this.a($$5, $$2, $$4) + this.a($$5, this.N, $$2, $$3, $$4);
         int $$7 = 0;

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            cdc $$9 = $$5.g.a((cpv)this.D);
            if ($$9 == null) {
               break;
            }

            if (!$$1 && $$9.ge()) {
               $$9.w(true);
               this.a($$2, $$9);
               $$1 = true;
            }

            this.a($$2, $$9, $$0, false);
            if ($$5.g == biu.aD) {
               cdc $$10 = null;
               if ($$2 == this.a(bgv.c)) {
                  $$10 = biu.ay.a((cpv)this.D);
               } else if ($$2 >= this.a(bgv.d)) {
                  if ($$7 == 0) {
                     $$10 = biu.G.a((cpv)this.D);
                  } else {
                     $$10 = biu.bg.a((cpv)this.D);
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

   public void a(int $$0, cdc $$1, @Nullable gw $$2, boolean $$3) {
      boolean $$4 = this.b($$0, $$1);
      if ($$4) {
         $$1.a(this);
         $$1.b($$0);
         $$1.z(true);
         $$1.c(0);
         if (!$$3 && $$2 != null) {
            $$1.e((double)$$2.u() + 0.5, (double)$$2.v() + 1.0, (double)$$2.w() + 0.5);
            $$1.a(this.D, this.D.d_($$2), bjk.h, null, null);
            $$1.a($$0, false);
            $$1.c(true);
            this.D.a_($$1);
         }
      }
   }

   public void p() {
      this.K.a(arw.a(this.q() / this.G, 0.0F, 1.0F));
   }

   public float q() {
      float $$0 = 0.0F;

      for (Set<cdc> $$1 : this.z.values()) {
         for (cdc $$2 : $$1) {
            $$0 += $$2.eu();
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

   public void a(cdc $$0, boolean $$1) {
      Set<cdc> $$2 = this.z.get($$0.gt());
      if ($$2 != null) {
         boolean $$3 = $$2.remove($$0);
         if ($$3) {
            if ($$1) {
               this.G = this.G - $$0.eu();
            }

            $$0.a(null);
            this.p();
            this.H();
         }
      }
   }

   private void H() {
      this.D.x().c();
   }

   public static cjf s() {
      cjf $$0 = new cjf(cji.tV);
      qw $$1 = new qw();
      rc $$2 = new dcm.a().a(dcn.z, cht.j).a(dcn.f, cht.i).a(dcn.j, cht.h).a(dcn.E, cht.i).a(dcn.k, cht.p).a(dcn.B, cht.i).a(dcn.y, cht.i).a(dcn.E, cht.p).a();
      $$1.a("Patterns", $$2);
      cgy.a($$0, dcx.t, $$1);
      $$0.a(cjf.a.f);
      $$0.a(tl.c("block.minecraft.ominous_banner").a(n.g));
      return $$0;
   }

   @Nullable
   public cdc b(int $$0) {
      return this.y.get($$0);
   }

   @Nullable
   private gw a(int $$0, int $$1) {
      int $$2 = $$0 == 0 ? 2 : 2 - $$0;
      gw.a $$3 = new gw.a();

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         float $$5 = this.D.z.i() * (float) (Math.PI * 2);
         int $$6 = this.C.u() + arw.d(arw.b($$5) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$7 = this.C.w() + arw.d(arw.a($$5) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$8 = this.D.a(dks.a.b, $$6, $$7);
         $$3.d($$6, $$8, $$7);
         if (!this.D.b($$3) || $$0 >= 2) {
            int $$9 = 10;
            if (this.D.b($$3.u() - 10, $$3.w() - 10, $$3.u() + 10, $$3.w() + 10)
               && this.D.e($$3)
               && (cqg.a(bka.c.a, this.D, $$3, biu.aD) || this.D.a_($$3.d()).a(csw.dN) && this.D.a_($$3).i())) {
               return $$3;
            }
         }
      }

      return null;
   }

   private boolean b(int $$0, cdc $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(int $$0, cdc $$1, boolean $$2) {
      this.z.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
      Set<cdc> $$3 = this.z.get($$0);
      cdc $$4 = null;

      for (cdc $$5 : $$3) {
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
         this.G = this.G + $$1.eu();
      }

      this.p();
      this.H();
      return true;
   }

   public void a(int $$0, cdc $$1) {
      this.y.put($$0, $$1);
      $$1.a(biv.f, s());
      $$1.a(biv.f, 2.0F);
   }

   public void c(int $$0) {
      this.y.remove($$0);
   }

   public gw t() {
      return this.C;
   }

   private void c(gw $$0) {
      this.C = $$0;
   }

   public int u() {
      return this.F;
   }

   private int a(cdb.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.O] : $$0.h[$$1];
   }

   private int a(cdb.b $$0, asc $$1, int $$2, bgw $$3, boolean $$4) {
      bgv $$5 = $$3.a();
      boolean $$6 = $$5 == bgv.b;
      boolean $$7 = $$5 == bgv.c;
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
      return this.I;
   }

   public qw a(qw $$0) {
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
      rc $$1 = new rc();

      for (UUID $$2 : this.A) {
         $$1.add(rj.a($$2));
      }

      $$0.a("HeroesOfTheVillage", $$1);
      return $$0;
   }

   public int a(bgv $$0) {
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

   public void a(biq $$0) {
      this.A.add($$0.cv());
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final cdb.a[] e = values();

      static cdb.a a(String $$0) {
         for (cdb.a $$1 : e) {
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
      a(biu.bg, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(biu.G, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(biu.ay, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(biu.bj, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(biu.aD, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final cdb.b[] f = values();
      final biu<? extends cdc> g;
      final int[] h;

      private b(biu<? extends cdc> $$0, int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
