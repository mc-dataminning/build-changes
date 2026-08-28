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

public class coj {
   private static final int h = 2;
   private static final int i = 0;
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 32;
   private static final int m = 48000;
   private static final int n = 3;
   private static final xp o = xp.c("block.minecraft.ominous_banner").a(n.g);
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
   private static final xp u = xp.c("event.minecraft.raid");
   private static final xp v = xp.c("event.minecraft.raid.victory.full");
   private static final xp w = xp.c("event.minecraft.raid.defeat.full");
   private static final int x = 48000;
   public static final int f = 9216;
   public static final int g = 12544;
   private final Map<Integer, cok> y = Maps.newHashMap();
   private final Map<Integer, Set<cok>> z = Maps.newHashMap();
   private final Set<UUID> A = Sets.newHashSet();
   private long B;
   private iz C;
   private final arf D;
   private boolean E;
   private final int F;
   private float G;
   private int H;
   private boolean I;
   private int J;
   private final arc K = new arc(u, bql.a.c, bql.b.c);
   private int L;
   private int M;
   private final azh N = azh.a();
   private final int O;
   private coj.a P;
   private int Q;
   private Optional<iz> R = Optional.empty();

   public coj(int $$0, arf $$1, iz $$2) {
      this.F = $$0;
      this.D = $$1;
      this.I = true;
      this.M = 300;
      this.K.a(0.0F);
      this.C = $$2;
      this.O = this.a($$1.al());
      this.P = coj.a.a;
   }

   public coj(arf $$0, us $$1) {
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
      this.C = new iz($$1.h("CX"), $$1.h("CY"), $$1.h("CZ"));
      this.O = $$1.h("NumGroups");
      this.P = coj.a.a($$1.l("Status"));
      this.A.clear();
      if ($$1.b("HeroesOfTheVillage", 9)) {
         for (vp $$3 : $$1.c("HeroesOfTheVillage", 11)) {
            this.A.add(vh.a($$3));
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
      return this.P == coj.a.d;
   }

   public boolean e() {
      return this.P == coj.a.b;
   }

   public boolean f() {
      return this.P == coj.a.c;
   }

   public float g() {
      return this.G;
   }

   public Set<cok> h() {
      Set<cok> $$0 = Sets.newHashSet();

      for (Set<cok> $$1 : this.z.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public dbz i() {
      return this.D;
   }

   public boolean j() {
      return this.E;
   }

   public int k() {
      return this.J;
   }

   private Predicate<arg> w() {
      return $$0 -> {
         iz $$1 = $$0.dp();
         return $$0.bD() && this.D.d($$1) == this;
      };
   }

   private void x() {
      Set<arg> $$0 = Sets.newHashSet(this.K.g());
      List<arg> $$1 = this.D.a(this.w());

      for (arg $$2 : $$1) {
         if (!$$0.contains($$2)) {
            this.K.a($$2);
         }
      }

      for (arg $$3 : $$0) {
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

   public boolean a(arg $$0) {
      ji<bsb> $$1 = this.D.J().b(cpo.c) ? bsf.I : bsf.E;
      if (!$$0.b($$1)) {
         return false;
      } else {
         this.H = this.H + $$0.c($$1).e() + 1;
         this.H = ayz.a(this.H, 0, this.l());
         if (!this.c()) {
            $$0.a(awk.aA);
            am.J.a($$0);
         }

         return true;
      }
   }

   public void n() {
      this.I = false;
      this.K.b();
      this.P = coj.a.d;
   }

   public void o() {
      if (!this.d()) {
         if (this.P == coj.a.a) {
            boolean $$0 = this.I;
            this.I = this.D.B(this.C);
            if (this.D.al() == bqs.a) {
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
                  this.P = coj.a.c;
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
                  this.K.a(ayz.a((float)(300 - this.M) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.B % 20L == 0L) {
               this.x();
               this.E();
               if ($$1 > 0) {
                  if ($$1 <= 2) {
                     this.K.a(u.f().f(" - ").b(xp.a("event.minecraft.raid.raiders_remaining", $$1)));
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
               iz $$7 = this.R.isPresent() ? this.R.get() : this.a($$6, 20);
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
                  this.P = coj.a.b;

                  for (UUID $$8 : this.A) {
                     bsv $$9 = this.D.a($$8);
                     if ($$9 instanceof btq) {
                        btq $$10 = (btq)$$9;
                        if (!$$9.N_()) {
                           $$10.b(new bsd(bsf.F, 48000, this.H - 1, false, false, true));
                           if ($$10 instanceof arg $$11) {
                              $$11.a(awk.aB);
                              am.I.a($$11);
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
      Stream<kb> $$0 = kb.a(kb.a(this.C), 2);
      $$0.filter(this.D::a).map(kb::q).min(Comparator.comparingDouble($$0x -> $$0x.j(this.C))).ifPresent(this::c);
   }

   private Optional<iz> d(int $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         iz $$2 = this.a($$0, 1);
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
      Iterator<Set<cok>> $$0 = this.z.values().iterator();
      Set<cok> $$1 = Sets.newHashSet();

      while ($$0.hasNext()) {
         Set<cok> $$2 = $$0.next();

         for (cok $$3 : $$2) {
            iz $$4 = $$3.dp();
            if ($$3.dK() || $$3.dP().af() != this.D.af() || this.C.j($$4) >= 12544.0) {
               $$1.add($$3);
            } else if ($$3.ai > 600) {
               if (this.D.a($$3.cz()) == null) {
                  $$1.add($$3);
               }

               if (!this.D.c($$4) && $$3.eq() > 2400) {
                  $$3.c($$3.gK() + 1);
               }

               if ($$3.gK() >= 30) {
                  $$1.add($$3);
               }
            }
         }
      }

      for (cok $$5 : $$1) {
         this.a($$5, true);
      }
   }

   private void a(iz $$0) {
      float $$1 = 13.0F;
      int $$2 = 64;
      Collection<arg> $$3 = this.K.g();
      long $$4 = this.N.g();

      for (arg $$5 : this.D.x()) {
         evs $$6 = $$5.dn();
         evs $$7 = evs.b($$0);
         double $$8 = Math.sqrt(($$7.c - $$6.c) * ($$7.c - $$6.c) + ($$7.e - $$6.e) * ($$7.e - $$6.e));
         double $$9 = $$6.c + 13.0 / $$8 * ($$7.c - $$6.c);
         double $$10 = $$6.e + 13.0 / $$8 * ($$7.e - $$6.e);
         if ($$8 <= 64.0 || $$3.contains($$5)) {
            $$5.c.b(new agd(awa.uZ, awb.g, $$9, $$5.dw(), $$10, 64.0F, 1.0F, $$4));
         }
      }
   }

   private void b(iz $$0) {
      boolean $$1 = false;
      int $$2 = this.J + 1;
      this.G = 0.0F;
      bqt $$3 = this.D.d_($$0);
      boolean $$4 = this.D();

      for (coj.b $$5 : coj.b.f) {
         int $$6 = this.a($$5, $$2, $$4) + this.a($$5, this.N, $$2, $$3, $$4);
         int $$7 = 0;

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            cok $$9 = $$5.g.a((dbz)this.D);
            if ($$9 == null) {
               break;
            }

            if (!$$1 && $$9.gr()) {
               $$9.w(true);
               this.a($$2, $$9);
               $$1 = true;
            }

            this.a($$2, $$9, $$0, false);
            if ($$5.g == btb.aH) {
               cok $$10 = null;
               if ($$2 == this.a(bqs.c)) {
                  $$10 = btb.aC.a((dbz)this.D);
               } else if ($$2 >= this.a(bqs.d)) {
                  if ($$7 == 0) {
                     $$10 = btb.J.a((dbz)this.D);
                  } else {
                     $$10 = btb.bk.a((dbz)this.D);
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

   public void a(int $$0, cok $$1, @Nullable iz $$2, boolean $$3) {
      boolean $$4 = this.b($$0, $$1);
      if ($$4) {
         $$1.a(this);
         $$1.b($$0);
         $$1.z(true);
         $$1.c(0);
         if (!$$3 && $$2 != null) {
            $$1.a_((double)$$2.u() + 0.5, (double)$$2.v() + 1.0, (double)$$2.w() + 0.5);
            $$1.a(this.D, this.D.d_($$2), btu.h, null);
            $$1.a($$0, false);
            $$1.d(true);
            this.D.a_($$1);
         }
      }
   }

   public void p() {
      this.K.a(ayz.a(this.q() / this.G, 0.0F, 1.0F));
   }

   public float q() {
      float $$0 = 0.0F;

      for (Set<cok> $$1 : this.z.values()) {
         for (cok $$2 : $$1) {
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

   public void a(cok $$0, boolean $$1) {
      Set<cok> $$2 = this.z.get($$0.gI());
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

   public static cuq a(jj<doy> $$0) {
      cuq $$1 = new cuq(cut.uP);
      doz $$2 = new doz.a()
         .a($$0, dpa.z, ctj.j)
         .a($$0, dpa.f, ctj.i)
         .a($$0, dpa.j, ctj.h)
         .a($$0, dpa.E, ctj.i)
         .a($$0, dpa.k, ctj.p)
         .a($$0, dpa.B, ctj.i)
         .a($$0, dpa.y, ctj.i)
         .a($$0, dpa.E, ctj.p)
         .a();
      $$1.b(km.X, $$2);
      $$1.b(km.p, bac.a);
      $$1.b(km.h, o);
      return $$1;
   }

   @Nullable
   public cok b(int $$0) {
      return this.y.get($$0);
   }

   @Nullable
   private iz a(int $$0, int $$1) {
      int $$2 = $$0 == 0 ? 2 : 2 - $$0;
      iz.a $$3 = new iz.a();
      buk $$4 = bum.a(btb.aH);

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         float $$6 = this.D.z.i() * (float) (Math.PI * 2);
         int $$7 = this.C.u() + ayz.d(ayz.b($$6) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$8 = this.C.w() + ayz.d(ayz.a($$6) * 32.0F * (float)$$2) + this.D.z.a(5);
         int $$9 = this.D.a(dxv.a.b, $$7, $$8);
         $$3.d($$7, $$9, $$8);
         if (!this.D.c($$3) || $$0 >= 2) {
            int $$10 = 10;
            if (this.D.b($$3.u() - 10, $$3.w() - 10, $$3.u() + 10, $$3.w() + 10)
               && this.D.f($$3)
               && ($$4.isSpawnPositionOk(this.D, $$3, btb.aH) || this.D.a_($$3.d()).a(dfc.dN) && this.D.a_($$3).i())) {
               return $$3;
            }
         }
      }

      return null;
   }

   private boolean b(int $$0, cok $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(int $$0, cok $$1, boolean $$2) {
      this.z.computeIfAbsent($$0, $$0x -> Sets.newHashSet());
      Set<cok> $$3 = this.z.get($$0);
      cok $$4 = null;

      for (cok $$5 : $$3) {
         if ($$5.cz().equals($$1.cz())) {
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

   public void a(int $$0, cok $$1) {
      this.y.put($$0, $$1);
      $$1.a(btc.f, a($$1.dR().b(lq.d)));
      $$1.a(btc.f, 2.0F);
   }

   public void c(int $$0) {
      this.y.remove($$0);
   }

   public iz s() {
      return this.C;
   }

   private void c(iz $$0) {
      this.C = $$0;
   }

   public int t() {
      return this.F;
   }

   private int a(coj.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.O] : $$0.h[$$1];
   }

   private int a(coj.b $$0, azh $$1, int $$2, bqt $$3, boolean $$4) {
      bqs $$5 = $$3.a();
      boolean $$6 = $$5 == bqs.b;
      boolean $$7 = $$5 == bqs.c;
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

   public us a(us $$0) {
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
      uy $$1 = new uy();

      for (UUID $$2 : this.A) {
         $$1.add(vh.a($$2));
      }

      $$0.a("HeroesOfTheVillage", $$1);
      return $$0;
   }

   public int a(bqs $$0) {
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

   public void a(bsv $$0) {
      this.A.add($$0.cz());
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final coj.a[] e = values();

      static coj.a a(String $$0) {
         for (coj.a $$1 : e) {
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
      a(btb.bk, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(btb.J, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(btb.aC, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(btb.bo, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(btb.aH, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final coj.b[] f = values();
      final btb<? extends cok> g;
      final int[] h;

      private b(final btb<? extends cok> $$0, final int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
