import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cty {
   public static final byy a = bza.a(bxn.ba);
   public static final MapCodec<cty> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("started").forGetter($$0x -> $$0x.E),
               Codec.BOOL.fieldOf("active").forGetter($$0x -> $$0x.H),
               Codec.LONG.fieldOf("ticks_active").forGetter($$0x -> $$0x.C),
               Codec.INT.fieldOf("raid_omen_level").forGetter($$0x -> $$0x.G),
               Codec.INT.fieldOf("groups_spawned").forGetter($$0x -> $$0x.I),
               Codec.INT.fieldOf("cooldown_ticks").forGetter($$0x -> $$0x.L),
               Codec.INT.fieldOf("post_raid_ticks").forGetter($$0x -> $$0x.K),
               Codec.FLOAT.fieldOf("total_health").forGetter($$0x -> $$0x.F),
               Codec.INT.fieldOf("group_count").forGetter($$0x -> $$0x.N),
               cty.a.e.fieldOf("status").forGetter($$0x -> $$0x.O),
               iw.a.fieldOf("center").forGetter($$0x -> $$0x.D),
               ka.b.fieldOf("heroes_of_the_village").forGetter($$0x -> $$0x.B)
            )
            .apply($$0, cty::new)
   );
   private static final int j = 7;
   private static final int k = 2;
   private static final int l = 32;
   private static final int m = 48000;
   private static final int n = 5;
   private static final xg o = xg.c("block.minecraft.ominous_banner");
   private static final String p = "event.minecraft.raid.raiders_remaining";
   public static final int c = 16;
   private static final int q = 40;
   private static final int r = 300;
   public static final int d = 2400;
   public static final int e = 600;
   private static final int s = 30;
   public static final int f = 24000;
   public static final int g = 5;
   private static final int t = 2;
   private static final xg u = xg.c("event.minecraft.raid");
   private static final xg v = xg.c("event.minecraft.raid.victory.full");
   private static final xg w = xg.c("event.minecraft.raid.defeat.full");
   private static final int x = 48000;
   private static final int y = 96;
   public static final int h = 9216;
   public static final int i = 12544;
   private final Map<Integer, ctz> z = Maps.newHashMap();
   private final Map<Integer, Set<ctz>> A = Maps.newHashMap();
   private final Set<UUID> B = Sets.newHashSet();
   private long C;
   private iw D;
   private boolean E;
   private float F;
   private int G;
   private boolean H;
   private int I;
   private final arx J = new arx(u, bus.a.c, bus.b.c);
   private int K;
   private int L;
   private final bai M = bai.a();
   private final int N;
   private cty.a O;
   private int P;
   private Optional<iw> Q = Optional.empty();

   public cty(iw $$0, buz $$1) {
      this.H = true;
      this.L = 300;
      this.J.a(0.0F);
      this.D = $$0;
      this.N = this.a($$1);
      this.O = cty.a.a;
   }

   private cty(boolean $$0, boolean $$1, long $$2, int $$3, int $$4, int $$5, int $$6, float $$7, int $$8, cty.a $$9, iw $$10, Set<UUID> $$11) {
      this.E = $$0;
      this.H = $$1;
      this.C = $$2;
      this.G = $$3;
      this.I = $$4;
      this.L = $$5;
      this.K = $$6;
      this.F = $$7;
      this.D = $$10;
      this.N = $$8;
      this.O = $$9;
      this.B.addAll($$11);
   }

   public boolean a() {
      return this.e() || this.f();
   }

   public boolean b() {
      return this.c() && this.p() == 0 && this.L > 0;
   }

   public boolean c() {
      return this.I > 0;
   }

   public boolean d() {
      return this.O == cty.a.d;
   }

   public boolean e() {
      return this.O == cty.a.b;
   }

   public boolean f() {
      return this.O == cty.a.c;
   }

   public float g() {
      return this.F;
   }

   public Set<ctz> h() {
      Set<ctz> $$0 = Sets.newHashSet();

      for (Set<ctz> $$1 : this.A.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public boolean i() {
      return this.E;
   }

   public int j() {
      return this.I;
   }

   private Predicate<asc> t() {
      return $$0 -> {
         iw $$1 = $$0.dv();
         return $$0.bJ() && $$0.y().d($$1) == this;
      };
   }

   private void b(asb $$0) {
      Set<asc> $$1 = Sets.newHashSet(this.J.h());
      List<asc> $$2 = $$0.a(this.t());

      for (asc $$3 : $$2) {
         if (!$$1.contains($$3)) {
            this.J.a($$3);
         }
      }

      for (asc $$4 : $$1) {
         if (!$$2.contains($$4)) {
            this.J.b($$4);
         }
      }
   }

   public int k() {
      return 5;
   }

   public int l() {
      return this.G;
   }

   public void a(int $$0) {
      this.G = $$0;
   }

   public boolean a(asc $$0) {
      bwi $$1 = $$0.c(bwk.I);
      if ($$1 == null) {
         return false;
      } else {
         this.G = this.G + $$1.e() + 1;
         this.G = azz.a(this.G, 0, this.k());
         if (!this.c()) {
            $$0.a(axi.aA);
            aq.J.a($$0);
         }

         return true;
      }
   }

   public void m() {
      this.H = false;
      this.J.b();
      this.O = cty.a.d;
   }

   public void a(asb $$0) {
      if (!this.d()) {
         if (this.O == cty.a.a) {
            boolean $$1 = this.H;
            this.H = $$0.C(this.D);
            if ($$0.an() == buz.a) {
               this.m();
               return;
            }

            if ($$1 != this.H) {
               this.J.d(this.H);
            }

            if (!this.H) {
               return;
            }

            if (!$$0.c(this.D)) {
               this.c($$0);
            }

            if (!$$0.c(this.D)) {
               if (this.I > 0) {
                  this.O = cty.a.c;
               } else {
                  this.m();
               }
            }

            this.C++;
            if (this.C >= 48000L) {
               this.m();
               return;
            }

            int $$2 = this.p();
            if ($$2 == 0 && this.u()) {
               if (this.L <= 0) {
                  if (this.L == 0 && this.I > 0) {
                     this.L = 300;
                     this.J.a(u);
                     return;
                  }
               } else {
                  boolean $$3 = this.Q.isPresent();
                  boolean $$4 = !$$3 && this.L % 5 == 0;
                  if ($$3 && !$$0.f(this.Q.get())) {
                     $$4 = true;
                  }

                  if ($$4) {
                     this.Q = this.d($$0);
                  }

                  if (this.L == 300 || this.L % 20 == 0) {
                     this.b($$0);
                  }

                  this.L--;
                  this.J.a(azz.a((float)(300 - this.L) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.C % 20L == 0L) {
               this.b($$0);
               this.e($$0);
               if ($$2 > 0) {
                  if ($$2 <= 2) {
                     this.J.a(u.f().f(" - ").b(xg.a("event.minecraft.raid.raiders_remaining", $$2)));
                  } else {
                     this.J.a(u);
                  }
               } else {
                  this.J.a(u);
               }
            }

            boolean $$5 = false;
            int $$6 = 0;

            while (this.z()) {
               iw $$7 = this.Q.orElseGet(() -> this.a($$0, 20));
               if ($$7 != null) {
                  this.E = true;
                  this.b($$0, $$7);
                  if (!$$5) {
                     this.a($$0, $$7);
                     $$5 = true;
                  }
               } else {
                  $$6++;
               }

               if ($$6 > 5) {
                  this.m();
                  break;
               }
            }

            if (this.i() && !this.u() && $$2 == 0) {
               if (this.K < 40) {
                  this.K++;
               } else {
                  this.O = cty.a.b;

                  for (UUID $$8 : this.B) {
                     bxe $$9 = $$0.b($$8);
                     if ($$9 instanceof byf) {
                        byf $$10 = (byf)$$9;
                        if (!$$9.aa_()) {
                           $$10.a(new bwi(bwk.F, 48000, this.G - 1, false, false, true));
                           if ($$10 instanceof asc $$11) {
                              $$11.a(axi.aB);
                              aq.I.a($$11);
                           }
                        }
                     }
                  }
               }
            }

            this.f($$0);
         } else if (this.a()) {
            this.P++;
            if (this.P >= 600) {
               this.m();
               return;
            }

            if (this.P % 20 == 0) {
               this.b($$0);
               this.J.d(true);
               if (this.e()) {
                  this.J.a(0.0F);
                  this.J.a(v);
               } else {
                  this.J.a(w);
               }
            }
         }
      }
   }

   private void c(asb $$0) {
      Stream<jz> $$1 = jz.a(jz.a(this.D), 2);
      $$1.filter($$0::a).map(jz::k).min(Comparator.comparingDouble($$0x -> $$0x.j(this.D))).ifPresent(this::a);
   }

   private Optional<iw> d(asb $$0) {
      iw $$1 = this.a($$0, 8);
      return $$1 != null ? Optional.of($$1) : Optional.empty();
   }

   private boolean u() {
      return this.w() ? !this.x() : !this.v();
   }

   private boolean v() {
      return this.j() == this.N;
   }

   private boolean w() {
      return this.G > 1;
   }

   private boolean x() {
      return this.j() > this.N;
   }

   private boolean y() {
      return this.v() && this.p() == 0 && this.w();
   }

   private void e(asb $$0) {
      Iterator<Set<ctz>> $$1 = this.A.values().iterator();
      Set<ctz> $$2 = Sets.newHashSet();

      while ($$1.hasNext()) {
         Set<ctz> $$3 = $$1.next();

         for (ctz $$4 : $$3) {
            iw $$5 = $$4.dv();
            if ($$4.dQ() || $$4.dV().aj() != $$0.aj() || this.D.j($$5) >= 12544.0) {
               $$2.add($$4);
            } else if ($$4.af > 600) {
               if ($$0.b($$4.cG()) == null) {
                  $$2.add($$4);
               }

               if (!$$0.c($$5) && $$4.ew() > 2400) {
                  $$4.c($$4.gL() + 1);
               }

               if ($$4.gL() >= 30) {
                  $$2.add($$4);
               }
            }
         }
      }

      for (ctz $$6 : $$2) {
         this.a($$0, $$6, true);
         if ($$6.gv()) {
            this.c($$6.gJ());
         }
      }
   }

   private void a(asb $$0, iw $$1) {
      float $$2 = 13.0F;
      int $$3 = 64;
      Collection<asc> $$4 = this.J.h();
      long $$5 = this.M.g();

      for (asc $$6 : $$0.z()) {
         fgc $$7 = $$6.dt();
         fgc $$8 = fgc.b($$1);
         double $$9 = Math.sqrt(($$8.d - $$7.d) * ($$8.d - $$7.d) + ($$8.f - $$7.f) * ($$8.f - $$7.f));
         double $$10 = $$7.d + 13.0 / $$9 * ($$8.d - $$7.d);
         double $$11 = $$7.f + 13.0 / $$9 * ($$8.f - $$7.f);
         if ($$9 <= 64.0 || $$4.contains($$6)) {
            $$6.f.b(new agg(awy.vQ, awz.g, $$10, $$6.dC(), $$11, 64.0F, 1.0F, $$5));
         }
      }
   }

   private void b(asb $$0, iw $$1) {
      boolean $$2 = false;
      int $$3 = this.I + 1;
      this.F = 0.0F;
      bva $$4 = $$0.d_($$1);
      boolean $$5 = this.y();

      for (cty.b $$6 : cty.b.f) {
         int $$7 = this.a($$6, $$3, $$5) + this.a($$6, this.M, $$3, $$4, $$5);
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$7; $$9++) {
            ctz $$10 = $$6.g.a($$0, bxm.h);
            if ($$10 == null) {
               break;
            }

            if (!$$2 && $$10.t()) {
               $$10.w(true);
               this.a($$3, $$10);
               $$2 = true;
            }

            this.a($$0, $$3, $$10, $$1, false);
            if ($$6.g == bxn.ba) {
               ctz $$11 = null;
               if ($$3 == this.a(buz.c)) {
                  $$11 = bxn.aU.a($$0, bxm.h);
               } else if ($$3 >= this.a(buz.d)) {
                  if ($$8 == 0) {
                     $$11 = bxn.T.a($$0, bxm.h);
                  } else {
                     $$11 = bxn.bF.a($$0, bxm.h);
                  }
               }

               $$8++;
               if ($$11 != null) {
                  this.a($$0, $$3, $$11, $$1, false);
                  $$11.a($$1, 0.0F, 0.0F);
                  $$11.n($$10);
               }
            }
         }
      }

      this.Q = Optional.empty();
      this.I++;
      this.n();
      this.f($$0);
   }

   public void a(asb $$0, int $$1, ctz $$2, @Nullable iw $$3, boolean $$4) {
      boolean $$5 = this.a($$0, $$1, $$2);
      if ($$5) {
         $$2.a(this);
         $$2.b($$1);
         $$2.z(true);
         $$2.c(0);
         if (!$$4 && $$3 != null) {
            $$2.a_((double)$$3.u() + 0.5, (double)$$3.v() + 1.0, (double)$$3.w() + 0.5);
            $$2.a($$0, $$0.d_($$3), bxm.h, null);
            $$2.a($$0, $$1, false);
            $$2.d(true);
            $$0.a_($$2);
         }
      }
   }

   public void n() {
      this.J.a(azz.a(this.o() / this.F, 0.0F, 1.0F));
   }

   public float o() {
      float $$0 = 0.0F;

      for (Set<ctz> $$1 : this.A.values()) {
         for (ctz $$2 : $$1) {
            $$0 += $$2.eG();
         }
      }

      return $$0;
   }

   private boolean z() {
      return this.L == 0 && (this.I < this.N || this.y()) && this.p() == 0;
   }

   public int p() {
      return this.A.values().stream().mapToInt(Set::size).sum();
   }

   public void a(asb $$0, ctz $$1, boolean $$2) {
      Set<ctz> $$3 = this.A.get($$1.gJ());
      if ($$3 != null) {
         boolean $$4 = $$3.remove($$1);
         if ($$4) {
            if ($$2) {
               this.F = this.F - $$1.eG();
            }

            $$1.a(null);
            this.n();
            this.f($$0);
         }
      }
   }

   private void f(asb $$0) {
      $$0.B().f();
   }

   public static dak a(jh<dyd> $$0) {
      dak $$1 = new dak(dao.wa);
      dye $$2 = new dye.a()
         .a($$0, dyf.z, czi.j)
         .a($$0, dyf.f, czi.i)
         .a($$0, dyf.j, czi.h)
         .a($$0, dyf.E, czi.i)
         .a($$0, dyf.k, czi.p)
         .a($$0, dyf.B, czi.i)
         .a($$0, dyf.y, czi.i)
         .a($$0, dyf.E, czi.p)
         .a();
      $$1.b(kl.am, $$2);
      $$1.b(kl.q, ddo.c.a(kl.am, true));
      $$1.b(kl.h, o);
      $$1.b(kl.k, dbg.b);
      return $$1;
   }

   @Nullable
   public ctz b(int $$0) {
      return this.z.get($$0);
   }

   @Nullable
   private iw a(asb $$0, int $$1) {
      int $$2 = this.L / 20;
      float $$3 = 0.22F * (float)$$2 - 0.24F;
      iw.a $$4 = new iw.a();
      float $$5 = $$0.A.i() * (float) (Math.PI * 2);

      for (int $$6 = 0; $$6 < $$1; $$6++) {
         float $$7 = $$5 + (float) Math.PI * (float)$$6 / 8.0F;
         int $$8 = this.D.u() + azz.d(azz.b($$7) * 32.0F * $$3) + $$0.A.a(3) * azz.d($$3);
         int $$9 = this.D.w() + azz.d(azz.a($$7) * 32.0F * $$3) + $$0.A.a(3) * azz.d($$3);
         int $$10 = $$0.a(ehp.a.b, $$8, $$9);
         if (azz.a($$10 - this.D.v()) <= 96) {
            $$4.d($$8, $$10, $$9);
            if (!$$0.c($$4) || $$2 <= 7) {
               int $$11 = 10;
               if ($$0.b($$4.u() - 10, $$4.w() - 10, $$4.u() + 10, $$4.w() + 10)
                  && $$0.f($$4)
                  && (a.isSpawnPositionOk($$0, $$4, bxn.ba) || $$0.a_($$4.e()).a(dnq.ed) && $$0.a_($$4).l())) {
                  return $$4;
               }
            }
         }
      }

      return null;
   }

   private boolean a(asb $$0, int $$1, ctz $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public boolean a(asb $$0, int $$1, ctz $$2, boolean $$3) {
      this.A.computeIfAbsent($$1, $$0x -> Sets.newHashSet());
      Set<ctz> $$4 = this.A.get($$1);
      ctz $$5 = null;

      for (ctz $$6 : $$4) {
         if ($$6.cG().equals($$2.cG())) {
            $$5 = $$6;
            break;
         }
      }

      if ($$5 != null) {
         $$4.remove($$5);
         $$4.add($$2);
      }

      $$4.add($$2);
      if ($$3) {
         this.F = this.F + $$2.eG();
      }

      this.n();
      this.f($$0);
      return true;
   }

   public void a(int $$0, ctz $$1) {
      this.z.put($$0, $$1);
      $$1.a(bxo.f, a($$1.dX().f(mi.aF)));
      $$1.a(bxo.f, 2.0F);
   }

   public void c(int $$0) {
      this.z.remove($$0);
   }

   public iw q() {
      return this.D;
   }

   private void a(iw $$0) {
      this.D = $$0;
   }

   private int a(cty.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.N] : $$0.h[$$1];
   }

   private int a(cty.b $$0, bai $$1, int $$2, bva $$3, boolean $$4) {
      buz $$5 = $$3.a();
      boolean $$6 = $$5 == buz.b;
      boolean $$7 = $$5 == buz.c;
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

   public boolean r() {
      return this.H;
   }

   public int a(buz $$0) {
      return switch ($$0) {
         case a -> 0;
         case b -> 3;
         case c -> 5;
         case d -> 7;
      };
   }

   public float s() {
      int $$0 = this.l();
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

   public void a(bxe $$0) {
      this.B.add($$0.cG());
   }

   static enum a implements bax {
      a("ongoing"),
      b("victory"),
      c("loss"),
      d("stopped");

      public static final Codec<cty.a> e = bax.a(cty.a::values);
      private final String f;

      private a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   static enum b {
      a(bxn.bF, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(bxn.T, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(bxn.aU, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(bxn.bJ, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(bxn.ba, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final cty.b[] f = values();
      final bxn<? extends ctz> g;
      final int[] h;

      private b(final bxn<? extends ctz> $$0, final int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
