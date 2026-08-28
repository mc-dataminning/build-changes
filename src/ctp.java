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

public class ctp {
   public static final byp a = byr.a(bxe.ba);
   public static final MapCodec<ctp> b = RecordCodecBuilder.mapCodec(
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
               ctp.a.e.fieldOf("status").forGetter($$0x -> $$0x.O),
               iw.a.fieldOf("center").forGetter($$0x -> $$0x.D),
               ka.b.fieldOf("heroes_of_the_village").forGetter($$0x -> $$0x.B)
            )
            .apply($$0, ctp::new)
   );
   private static final int j = 7;
   private static final int k = 2;
   private static final int l = 32;
   private static final int m = 48000;
   private static final int n = 5;
   private static final xc o = xc.c("block.minecraft.ominous_banner");
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
   private static final xc u = xc.c("event.minecraft.raid");
   private static final xc v = xc.c("event.minecraft.raid.victory.full");
   private static final xc w = xc.c("event.minecraft.raid.defeat.full");
   private static final int x = 48000;
   private static final int y = 96;
   public static final int h = 9216;
   public static final int i = 12544;
   private final Map<Integer, ctq> z = Maps.newHashMap();
   private final Map<Integer, Set<ctq>> A = Maps.newHashMap();
   private final Set<UUID> B = Sets.newHashSet();
   private long C;
   private iw D;
   private boolean E;
   private float F;
   private int G;
   private boolean H;
   private int I;
   private final arq J = new arq(u, buj.a.c, buj.b.c);
   private int K;
   private int L;
   private final azz M = azz.a();
   private final int N;
   private ctp.a O;
   private int P;
   private Optional<iw> Q = Optional.empty();

   public ctp(iw $$0, buq $$1) {
      this.H = true;
      this.L = 300;
      this.J.a(0.0F);
      this.D = $$0;
      this.N = this.a($$1);
      this.O = ctp.a.a;
   }

   private ctp(boolean $$0, boolean $$1, long $$2, int $$3, int $$4, int $$5, int $$6, float $$7, int $$8, ctp.a $$9, iw $$10, Set<UUID> $$11) {
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
      return this.O == ctp.a.d;
   }

   public boolean e() {
      return this.O == ctp.a.b;
   }

   public boolean f() {
      return this.O == ctp.a.c;
   }

   public float g() {
      return this.F;
   }

   public Set<ctq> h() {
      Set<ctq> $$0 = Sets.newHashSet();

      for (Set<ctq> $$1 : this.A.values()) {
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

   private Predicate<arv> t() {
      return $$0 -> {
         iw $$1 = $$0.dv();
         return $$0.bJ() && $$0.y().d($$1) == this;
      };
   }

   private void b(aru $$0) {
      Set<arv> $$1 = Sets.newHashSet(this.J.h());
      List<arv> $$2 = $$0.a(this.t());

      for (arv $$3 : $$2) {
         if (!$$1.contains($$3)) {
            this.J.a($$3);
         }
      }

      for (arv $$4 : $$1) {
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

   public boolean a(arv $$0) {
      bvz $$1 = $$0.c(bwb.I);
      if ($$1 == null) {
         return false;
      } else {
         this.G = this.G + $$1.e() + 1;
         this.G = azq.a(this.G, 0, this.k());
         if (!this.c()) {
            $$0.a(axb.aA);
            aq.J.a($$0);
         }

         return true;
      }
   }

   public void m() {
      this.H = false;
      this.J.b();
      this.O = ctp.a.d;
   }

   public void a(aru $$0) {
      if (!this.d()) {
         if (this.O == ctp.a.a) {
            boolean $$1 = this.H;
            this.H = $$0.C(this.D);
            if ($$0.an() == buq.a) {
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
                  this.O = ctp.a.c;
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
                  this.J.a(azq.a((float)(300 - this.L) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.C % 20L == 0L) {
               this.b($$0);
               this.e($$0);
               if ($$2 > 0) {
                  if ($$2 <= 2) {
                     this.J.a(u.f().f(" - ").b(xc.a("event.minecraft.raid.raiders_remaining", $$2)));
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
                  this.O = ctp.a.b;

                  for (UUID $$8 : this.B) {
                     bwv $$9 = $$0.b($$8);
                     if ($$9 instanceof bxw) {
                        bxw $$10 = (bxw)$$9;
                        if (!$$9.Z_()) {
                           $$10.a(new bvz(bwb.F, 48000, this.G - 1, false, false, true));
                           if ($$10 instanceof arv $$11) {
                              $$11.a(axb.aB);
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

   private void c(aru $$0) {
      Stream<jz> $$1 = jz.a(jz.a(this.D), 2);
      $$1.filter($$0::a).map(jz::k).min(Comparator.comparingDouble($$0x -> $$0x.j(this.D))).ifPresent(this::a);
   }

   private Optional<iw> d(aru $$0) {
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

   private void e(aru $$0) {
      Iterator<Set<ctq>> $$1 = this.A.values().iterator();
      Set<ctq> $$2 = Sets.newHashSet();

      while ($$1.hasNext()) {
         Set<ctq> $$3 = $$1.next();

         for (ctq $$4 : $$3) {
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

      for (ctq $$6 : $$2) {
         this.a($$0, $$6, true);
         if ($$6.gv()) {
            this.c($$6.gJ());
         }
      }
   }

   private void a(aru $$0, iw $$1) {
      float $$2 = 13.0F;
      int $$3 = 64;
      Collection<arv> $$4 = this.J.h();
      long $$5 = this.M.g();

      for (arv $$6 : $$0.z()) {
         ffs $$7 = $$6.dt();
         ffs $$8 = ffs.b($$1);
         double $$9 = Math.sqrt(($$8.d - $$7.d) * ($$8.d - $$7.d) + ($$8.f - $$7.f) * ($$8.f - $$7.f));
         double $$10 = $$7.d + 13.0 / $$9 * ($$8.d - $$7.d);
         double $$11 = $$7.f + 13.0 / $$9 * ($$8.f - $$7.f);
         if ($$9 <= 64.0 || $$4.contains($$6)) {
            $$6.f.b(new afz(awr.vQ, aws.g, $$10, $$6.dC(), $$11, 64.0F, 1.0F, $$5));
         }
      }
   }

   private void b(aru $$0, iw $$1) {
      boolean $$2 = false;
      int $$3 = this.I + 1;
      this.F = 0.0F;
      bur $$4 = $$0.d_($$1);
      boolean $$5 = this.y();

      for (ctp.b $$6 : ctp.b.f) {
         int $$7 = this.a($$6, $$3, $$5) + this.a($$6, this.M, $$3, $$4, $$5);
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$7; $$9++) {
            ctq $$10 = $$6.g.a($$0, bxd.h);
            if ($$10 == null) {
               break;
            }

            if (!$$2 && $$10.t()) {
               $$10.w(true);
               this.a($$3, $$10);
               $$2 = true;
            }

            this.a($$0, $$3, $$10, $$1, false);
            if ($$6.g == bxe.ba) {
               ctq $$11 = null;
               if ($$3 == this.a(buq.c)) {
                  $$11 = bxe.aU.a($$0, bxd.h);
               } else if ($$3 >= this.a(buq.d)) {
                  if ($$8 == 0) {
                     $$11 = bxe.T.a($$0, bxd.h);
                  } else {
                     $$11 = bxe.bF.a($$0, bxd.h);
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

   public void a(aru $$0, int $$1, ctq $$2, @Nullable iw $$3, boolean $$4) {
      boolean $$5 = this.a($$0, $$1, $$2);
      if ($$5) {
         $$2.a(this);
         $$2.b($$1);
         $$2.z(true);
         $$2.c(0);
         if (!$$4 && $$3 != null) {
            $$2.a_((double)$$3.u() + 0.5, (double)$$3.v() + 1.0, (double)$$3.w() + 0.5);
            $$2.a($$0, $$0.d_($$3), bxd.h, null);
            $$2.a($$0, $$1, false);
            $$2.d(true);
            $$0.a_($$2);
         }
      }
   }

   public void n() {
      this.J.a(azq.a(this.o() / this.F, 0.0F, 1.0F));
   }

   public float o() {
      float $$0 = 0.0F;

      for (Set<ctq> $$1 : this.A.values()) {
         for (ctq $$2 : $$1) {
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

   public void a(aru $$0, ctq $$1, boolean $$2) {
      Set<ctq> $$3 = this.A.get($$1.gJ());
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

   private void f(aru $$0) {
      $$0.B().f();
   }

   public static daa a(jh<dxt> $$0) {
      daa $$1 = new daa(dae.wa);
      dxu $$2 = new dxu.a()
         .a($$0, dxv.z, cyy.j)
         .a($$0, dxv.f, cyy.i)
         .a($$0, dxv.j, cyy.h)
         .a($$0, dxv.E, cyy.i)
         .a($$0, dxv.k, cyy.p)
         .a($$0, dxv.B, cyy.i)
         .a($$0, dxv.y, cyy.i)
         .a($$0, dxv.E, cyy.p)
         .a();
      $$1.b(kl.am, $$2);
      $$1.b(kl.q, dde.c.a(kl.am, true));
      $$1.b(kl.h, o);
      $$1.b(kl.k, daw.b);
      return $$1;
   }

   @Nullable
   public ctq b(int $$0) {
      return this.z.get($$0);
   }

   @Nullable
   private iw a(aru $$0, int $$1) {
      int $$2 = this.L / 20;
      float $$3 = 0.22F * (float)$$2 - 0.24F;
      iw.a $$4 = new iw.a();
      float $$5 = $$0.A.i() * (float) (Math.PI * 2);

      for (int $$6 = 0; $$6 < $$1; $$6++) {
         float $$7 = $$5 + (float) Math.PI * (float)$$6 / 8.0F;
         int $$8 = this.D.u() + azq.d(azq.b($$7) * 32.0F * $$3) + $$0.A.a(3) * azq.d($$3);
         int $$9 = this.D.w() + azq.d(azq.a($$7) * 32.0F * $$3) + $$0.A.a(3) * azq.d($$3);
         int $$10 = $$0.a(ehf.a.b, $$8, $$9);
         if (azq.a($$10 - this.D.v()) <= 96) {
            $$4.d($$8, $$10, $$9);
            if (!$$0.c($$4) || $$2 <= 7) {
               int $$11 = 10;
               if ($$0.b($$4.u() - 10, $$4.w() - 10, $$4.u() + 10, $$4.w() + 10)
                  && $$0.f($$4)
                  && (a.isSpawnPositionOk($$0, $$4, bxe.ba) || $$0.a_($$4.e()).a(dng.ed) && $$0.a_($$4).l())) {
                  return $$4;
               }
            }
         }
      }

      return null;
   }

   private boolean a(aru $$0, int $$1, ctq $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public boolean a(aru $$0, int $$1, ctq $$2, boolean $$3) {
      this.A.computeIfAbsent($$1, $$0x -> Sets.newHashSet());
      Set<ctq> $$4 = this.A.get($$1);
      ctq $$5 = null;

      for (ctq $$6 : $$4) {
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

   public void a(int $$0, ctq $$1) {
      this.z.put($$0, $$1);
      $$1.a(bxf.f, a($$1.dX().f(mi.aF)));
      $$1.a(bxf.f, 2.0F);
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

   private int a(ctp.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.N] : $$0.h[$$1];
   }

   private int a(ctp.b $$0, azz $$1, int $$2, bur $$3, boolean $$4) {
      buq $$5 = $$3.a();
      boolean $$6 = $$5 == buq.b;
      boolean $$7 = $$5 == buq.c;
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

   public int a(buq $$0) {
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

   public void a(bwv $$0) {
      this.B.add($$0.cG());
   }

   static enum a implements bao {
      a("ongoing"),
      b("victory"),
      c("loss"),
      d("stopped");

      public static final Codec<ctp.a> e = bao.a(ctp.a::values);
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
      a(bxe.bF, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(bxe.T, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(bxe.aU, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(bxe.bJ, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(bxe.ba, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final ctp.b[] f = values();
      final bxe<? extends ctq> g;
      final int[] h;

      private b(final bxe<? extends ctq> $$0, final int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
