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

public class ciq {
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
   private static final vq u = vq.c("event.minecraft.raid");
   private static final vq v = vq.c("event.minecraft.raid.victory.full");
   private static final vq w = vq.c("event.minecraft.raid.defeat.full");
   private static final int x = 48000;
   public static final int f = 9216;
   public static final int g = 12544;
   private final Map<Integer, cir> y = Maps.newHashMap();
   private final Map<Integer, Set<cir>> z = Maps.newHashMap();
   private final Set<UUID> A = Sets.newHashSet();
   private long B;
   private hz C;
   private final aov D;
   private boolean E;
   private final int F;
   private float G;
   private int H;
   private boolean I;
   private int J;
   private final aos K = new aos(u, blk.a.c, blk.b.c);
   private int L;
   private int M;
   private final awo N = awo.a();
   private final int O;
   private ciq.a P;
   private int Q;
   private Optional<hz> R = Optional.empty();

   public ciq(int $$0, aov $$1, hz $$2) {
      this.F = $$0;
      this.D = $$1;
      this.I = true;
      this.M = 300;
      this.K.a(0.0F);
      this.C = $$2;
      this.O = this.a($$1.ak());
      this.P = ciq.a.a;
   }

   public ciq(aov $$0, sw $$1) {
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
      this.C = new hz($$1.h("CX"), $$1.h("CY"), $$1.h("CZ"));
      this.O = $$1.h("NumGroups");
      this.P = ciq.a.a($$1.l("Status"));
      this.A.clear();
      if ($$1.b("HeroesOfTheVillage", 9)) {
         for (tt $$3 : $$1.c("HeroesOfTheVillage", 11)) {
            this.A.add(tl.a($$3));
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
      return this.P == ciq.a.d;
   }

   public boolean e() {
      return this.P == ciq.a.b;
   }

   public boolean f() {
      return this.P == ciq.a.c;
   }

   public float g() {
      return this.G;
   }

   public Set<cir> h() {
      Set<cir> $$0 = Sets.newHashSet();

      for (Set<cir> $$1 : this.z.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public cvn i() {
      return this.D;
   }

   public boolean j() {
      return this.E;
   }

   public int k() {
      return this.J;
   }

   private Predicate<aow> x() {
      return $$0 -> {
         hz $$1 = $$0.dm();
         return $$0.bx() && this.D.d($$1) == this;
      };
   }

   private void y() {
      Set<aow> $$0 = Sets.newHashSet(this.K.h());
      List<aow> $$1 = this.D.a(this.x());

      for (aow $$2 : $$1) {
         if (!$$0.contains($$2)) {
            this.K.a($$2);
         }
      }

      for (aow $$3 : $$0) {
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

   public void a(chh $$0) {
      if ($$0.a(bnd.E)) {
         this.H = this.H + $$0.c(bnd.E).d() + 1;
         this.H = awh.a(this.H, 0, this.l());
      }

      $$0.e(bnd.E);
   }

   public void n() {
      this.I = false;
      this.K.b();
      this.P = ciq.a.d;
   }

   public void o() {
      if (!this.d()) {
         if (this.P == ciq.a.a) {
            boolean $$0 = this.I;
            this.I = this.D.B(this.C);
            if (this.D.ak() == blr.a) {
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
               this.z();
            }

            if (!this.D.c(this.C)) {
               if (this.J > 0) {
                  this.P = ciq.a.c;
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
                     this.y();
                  }

                  this.M--;
                  this.K.a(awh.a((float)(300 - this.M) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.B % 20L == 0L) {
               this.y();
               this.F();
               if ($$1 > 0) {
                  if ($$1 <= 2) {
                     this.K.a(u.f().f(" - ").b(vq.a("event.minecraft.raid.raiders_remaining", $$1)));
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
               hz $$7 = this.R.isPresent() ? this.R.get() : this.a($$6, 20);
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
                  this.P = ciq.a.b;

                  for (UUID $$8 : this.A) {
                     bno $$9 = this.D.a($$8);
                     if ($$9 instanceof bog) {
                        bog $$10 = (bog)$$9;
                        if (!$$9.P_()) {
                           $$10.b(new bnb(bnd.F, 48000, this.H - 1, false, false, true));
                           if ($$10 instanceof aow $$11) {
                              $$11.a(atu.aB);
                              am.I.a($$11);
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
      Stream<jb> $$0 = jb.a(jb.a(this.C), 2);
      $$0.filter(this.D::a).map(jb::q).min(Comparator.comparingDouble($$0x -> $$0x.j(this.C))).ifPresent(this::c);
   }

   private Optional<hz> d(int $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         hz $$2 = this.a($$0, 1);
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
      Iterator<Set<cir>> $$0 = this.z.values().iterator();
      Set<cir> $$1 = Sets.newHashSet();

      while ($$0.hasNext()) {
         Set<cir> $$2 = $$0.next();

         for (cir $$3 : $$2) {
            hz $$4 = $$3.dm();
            if ($$3.dH() || $$3.dM().ae() != this.D.ae() || this.C.j($$4) >= 12544.0) {
               $$1.add($$3);
            } else if ($$3.ag > 600) {
               if (this.D.a($$3.cw()) == null) {
                  $$1.add($$3);
               }

               if (!this.D.c($$4) && $$3.em() > 2400) {
                  $$3.c($$3.gy() + 1);
               }

               if ($$3.gy() >= 30) {
                  $$1.add($$3);
               }
            }
         }
      }

      for (cir $$5 : $$1) {
         this.a($$5, true);
      }
   }

   private void a(hz $$0) {
      float $$1 = 13.0F;
      int $$2 = 64;
      Collection<aow> $$3 = this.K.h();
      long $$4 = this.N.g();

      for (aow $$5 : this.D.x()) {
         ens $$6 = $$5.dk();
         ens $$7 = ens.b($$0);
         double $$8 = Math.sqrt(($$7.c - $$6.c) * ($$7.c - $$6.c) + ($$7.e - $$6.e) * ($$7.e - $$6.e));
         double $$9 = $$6.c + 13.0 / $$8 * ($$7.c - $$6.c);
         double $$10 = $$6.e + 13.0 / $$8 * ($$7.e - $$6.e);
         if ($$8 <= 64.0 || $$3.contains($$5)) {
            $$5.d.b(new adz(atk.uu, atl.g, $$9, $$5.dt(), $$10, 64.0F, 1.0F, $$4));
         }
      }
   }

   private void b(hz $$0) {
      boolean $$1 = false;
      int $$2 = this.J + 1;
      this.G = 0.0F;
      bls $$3 = this.D.d_($$0);
      boolean $$4 = this.E();

      for (ciq.b $$5 : ciq.b.f) {
         int $$6 = this.a($$5, $$2, $$4) + this.a($$5, this.N, $$2, $$3, $$4);
         int $$7 = 0;

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            cir $$9 = $$5.g.a((cvn)this.D);
            if ($$9 == null) {
               break;
            }

            if (!$$1 && $$9.gh()) {
               $$9.w(true);
               this.a($$2, $$9);
               $$1 = true;
            }

            this.a($$2, $$9, $$0, false);
            if ($$5.g == bnu.aF) {
               cir $$10 = null;
               if ($$2 == this.a(blr.c)) {
                  $$10 = bnu.aA.a((cvn)this.D);
               } else if ($$2 >= this.a(blr.d)) {
                  if ($$7 == 0) {
                     $$10 = bnu.I.a((cvn)this.D);
                  } else {
                     $$10 = bnu.bi.a((cvn)this.D);
                  }
               }

               $$7++;
               if ($$10 != null) {
                  this.a($$2, $$10, $$0, false);
                  $$10.a($$0, 0.0F, 0.0F);
                  $$10.m($$9);
               }
            }
         }
      }

      this.R = Optional.empty();
      this.J++;
      this.p();
      this.H();
   }

   public void a(int $$0, cir $$1, @Nullable hz $$2, boolean $$3) {
      boolean $$4 = this.b($$0, $$1);
      if ($$4) {
         $$1.a(this);
         $$1.b($$0);
         $$1.z(true);
         $$1.c(0);
         if (!$$3 && $$2 != null) {
            $$1.a_((double)$$2.u() + 0.5, (double)$$2.v() + 1.0, (double)$$2.w() + 0.5);
            $$1.a(this.D, this.D.d_($$2), bok.h, null, null);
            $$1.a($$0, false);
            $$1.c(true);
            this.D.a_($$1);
         }
      }
   }

   public void p() {
      this.K.a(awh.a(this.q() / this.G, 0.0F, 1.0F));
   }

   public float q() {
      float $$0 = 0.0F;

      for (Set<cir> $$1 : this.z.values()) {
         for (cir $$2 : $$1) {
            $$0 += $$2.ew();
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

   public void a(cir $$0, boolean $$1) {
      Set<cir> $$2 = this.z.get($$0.gw());
      if ($$2 != null) {
         boolean $$3 = $$2.remove($$0);
         if ($$3) {
            if ($$1) {
               this.G = this.G - $$0.ew();
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

   public static coz s() {
      coz $$0 = new coz(cpc.uL);
      sw $$1 = new sw();
      tc $$2 = new dik.a().a(dil.z, cnn.j).a(dil.f, cnn.i).a(dil.j, cnn.h).a(dil.E, cnn.i).a(dil.k, cnn.p).a(dil.B, cnn.i).a(dil.y, cnn.i).a(dil.E, cnn.p).a();
      $$1.a("Patterns", $$2);
      cms.a($$0, div.t, $$1);
      $$0.a(coz.a.f);
      $$0.a(vq.c("block.minecraft.ominous_banner").a(n.g));
      return $$0;
   }

   @Nullable
   public cir b(int $$0) {
      return this.y.get($$0);
   }

   @Nullable
   private hz a(int $$0, int $$1) {
      int $$2 = $$0 == 0 ? 2 : 2 - $$0;
      hz.a $$3 = new hz.a();

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         float $$5 = this.D.z.i() * (float) (Math.PI * 2);
         int $$6 = this.C.u() + awh.d(awh.b($$5) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$7 = this.C.w() + awh.d(awh.a($$5) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$8 = this.D.a(dqo.a.b, $$6, $$7);
         $$3.d($$6, $$8, $$7);
         if (!this.D.c($$3) || $$0 >= 2) {
            int $$9 = 10;
            if (this.D.b($$3.u() - 10, $$3.w() - 10, $$3.u() + 10, $$3.w() + 10)
               && this.D.f($$3)
               && (cvy.a(boz.c.a, this.D, $$3, bnu.aF) || this.D.a_($$3.d()).a(cyq.dN) && this.D.a_($$3).i())) {
               return $$3;
            }
         }
      }

      return null;
   }

   private boolean b(int $$0, cir $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(int $$0, cir $$1, boolean $$2) {
      this.z.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
      Set<cir> $$3 = this.z.get($$0);
      cir $$4 = null;

      for (cir $$5 : $$3) {
         if ($$5.cw().equals($$1.cw())) {
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
         this.G = this.G + $$1.ew();
      }

      this.p();
      this.H();
      return true;
   }

   public void a(int $$0, cir $$1) {
      this.y.put($$0, $$1);
      $$1.a(bnv.f, s());
      $$1.a(bnv.f, 2.0F);
   }

   public void c(int $$0) {
      this.y.remove($$0);
   }

   public hz t() {
      return this.C;
   }

   private void c(hz $$0) {
      this.C = $$0;
   }

   public int u() {
      return this.F;
   }

   private int a(ciq.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.O] : $$0.h[$$1];
   }

   private int a(ciq.b $$0, awo $$1, int $$2, bls $$3, boolean $$4) {
      blr $$5 = $$3.a();
      boolean $$6 = $$5 == blr.b;
      boolean $$7 = $$5 == blr.c;
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

   public sw a(sw $$0) {
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
      tc $$1 = new tc();

      for (UUID $$2 : this.A) {
         $$1.add(tl.a($$2));
      }

      $$0.a("HeroesOfTheVillage", $$1);
      return $$0;
   }

   public int a(blr $$0) {
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

   public void a(bno $$0) {
      this.A.add($$0.cw());
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final ciq.a[] e = values();

      static ciq.a a(String $$0) {
         for (ciq.a $$1 : e) {
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
      a(bnu.bi, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(bnu.I, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(bnu.aA, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(bnu.bm, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(bnu.aF, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final ciq.b[] f = values();
      final bnu<? extends cir> g;
      final int[] h;

      private b(bnu<? extends cir> $$0, int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
