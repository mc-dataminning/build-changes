import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fpr {
   private static final aku b = aku.b("icon/ping_unknown");
   private static final aku c = aku.b("icon/ping_1");
   private static final aku d = aku.b("icon/ping_2");
   private static final aku e = aku.b("icon/ping_3");
   private static final aku f = aku.b("icon/ping_4");
   private static final aku g = aku.b("icon/ping_5");
   private static final aku h = aku.b("hud/heart/container_blinking");
   private static final aku i = aku.b("hud/heart/container");
   private static final aku j = aku.b("hud/heart/full_blinking");
   private static final aku k = aku.b("hud/heart/half_blinking");
   private static final aku l = aku.b("hud/heart/absorbing_full_blinking");
   private static final aku m = aku.b("hud/heart/full");
   private static final aku n = aku.b("hud/heart/absorbing_half_blinking");
   private static final aku o = aku.b("hud/heart/half");
   private static final Comparator<ggi> p = Comparator.<ggi>comparingInt($$0 -> -$$0.k())
      .thenComparingInt($$0 -> $$0.e() == dgd.d ? 1 : 0)
      .thenComparing($$0 -> x.a($$0.h(), fby::b, ""))
      .thenComparing($$0 -> $$0.a().getName(), String::compareToIgnoreCase);
   public static final int a = 20;
   private final flh q;
   private final foa r;
   @Nullable
   private wo s;
   @Nullable
   private wo t;
   private boolean u;
   private final Map<UUID, fpr.a> v = new Object2ObjectOpenHashMap();

   public fpr(flh $$0, foa $$1) {
      this.q = $$0;
      this.r = $$1;
   }

   public wo a(ggi $$0) {
      return $$0.i() != null ? this.a($$0, $$0.i().f()) : this.a($$0, fby.a($$0.h(), wo.b($$0.a().getName())));
   }

   private wo a(ggi $$0, xc $$1) {
      return $$0.e() == dgd.d ? $$1.a(n.u) : $$1;
   }

   public void a(boolean $$0) {
      if (this.u != $$0) {
         this.v.clear();
         this.u = $$0;
         if ($$0) {
            wo $$1 = wr.a(this.b(), wo.b(", "), this::a);
            this.q.aY().c(wo.a("multiplayer.player.list.narration", $$1));
         }
      }
   }

   private List<ggi> b() {
      return this.q.t.j.l().stream().sorted(p).limit(80L).toList();
   }

   public void a(fob $$0, int $$1, fcd $$2, @Nullable fbv $$3) {
      List<ggi> $$4 = this.b();
      List<fpr.b> $$5 = new ArrayList<>($$4.size());
      int $$6 = this.q.h.b(" ");
      int $$7 = 0;
      int $$8 = 0;

      for (ggi $$9 : $$4) {
         wo $$10 = this.a($$9);
         $$7 = Math.max($$7, this.q.h.a($$10));
         int $$11 = 0;
         wo $$12 = null;
         int $$13 = 0;
         if ($$3 != null) {
            fcc $$14 = fcc.a($$9.a());
            fbz $$15 = $$2.d($$14, $$3);
            if ($$15 != null) {
               $$11 = $$15.a();
            }

            if ($$3.h() != fcg.a.b) {
               ye $$16 = $$3.a(yh.d);
               $$12 = fbz.a($$15, $$16);
               $$13 = this.q.h.a($$12);
               $$8 = Math.max($$8, $$13 > 0 ? $$6 + $$13 : 0);
            }
         }

         $$5.add(new fpr.b($$10, $$11, $$12, $$13));
      }

      if (!this.v.isEmpty()) {
         Set<UUID> $$17 = $$4.stream().map($$0x -> $$0x.a().getId()).collect(Collectors.toSet());
         this.v.keySet().removeIf($$1x -> !$$17.contains($$1x));
      }

      int $$18 = $$4.size();
      int $$19 = $$18;

      int $$20;
      for ($$20 = 1; $$19 > 20; $$19 = ($$18 + $$20 - 1) / $$20) {
         $$20++;
      }

      boolean $$21 = this.q.T() || this.q.L().k().h();
      int $$22;
      if ($$3 != null) {
         if ($$3.h() == fcg.a.b) {
            $$22 = 90;
         } else {
            $$22 = $$8;
         }
      } else {
         $$22 = 0;
      }

      int $$25 = Math.min($$20 * (($$21 ? 9 : 0) + $$7 + $$22 + 13), $$1 - 50) / $$20;
      int $$26 = $$1 / 2 - ($$25 * $$20 + ($$20 - 1) * 5) / 2;
      int $$27 = 10;
      int $$28 = $$25 * $$20 + ($$20 - 1) * 5;
      List<ayk> $$29 = null;
      if (this.t != null) {
         $$29 = this.q.h.c(this.t, $$1 - 50);

         for (ayk $$30 : $$29) {
            $$28 = Math.max($$28, this.q.h.a($$30));
         }
      }

      List<ayk> $$31 = null;
      if (this.s != null) {
         $$31 = this.q.h.c(this.s, $$1 - 50);

         for (ayk $$32 : $$31) {
            $$28 = Math.max($$28, this.q.h.a($$32));
         }
      }

      if ($$29 != null) {
         $$0.a($$1 / 2 - $$28 / 2 - 1, $$27 - 1, $$1 / 2 + $$28 / 2 + 1, $$27 + $$29.size() * 9, Integer.MIN_VALUE);

         for (ayk $$33 : $$29) {
            int $$34 = this.q.h.a($$33);
            $$0.b(this.q.h, $$33, $$1 / 2 - $$34 / 2, $$27, -1);
            $$27 += 9;
         }

         $$27++;
      }

      $$0.a($$1 / 2 - $$28 / 2 - 1, $$27 - 1, $$1 / 2 + $$28 / 2 + 1, $$27 + $$19 * 9, Integer.MIN_VALUE);
      int $$35 = this.q.n.a(553648127);

      for (int $$36 = 0; $$36 < $$18; $$36++) {
         int $$37 = $$36 / $$19;
         int $$38 = $$36 % $$19;
         int $$39 = $$26 + $$37 * $$25 + $$37 * 5;
         int $$40 = $$27 + $$38 * 9;
         $$0.a($$39, $$40, $$39 + $$25, $$40 + 8, $$35);
         if ($$36 < $$4.size()) {
            ggi $$41 = $$4.get($$36);
            fpr.b $$42 = $$5.get($$36);
            GameProfile $$43 = $$41.a();
            if ($$21) {
               cov $$44 = this.q.s.b($$43.getId());
               boolean $$45 = $$44 != null && gtc.b($$44);
               fpp.a($$0, $$41.g().a(), $$39, $$40, 8, $$41.j(), $$45, -1);
               $$39 += 9;
            }

            $$0.b(this.q.h, $$42.a, $$39, $$40, $$41.e() == dgd.d ? -1862270977 : -1);
            if ($$3 != null && $$41.e() != dgd.d) {
               int $$46 = $$39 + $$7 + 1;
               int $$47 = $$46 + $$22;
               if ($$47 - $$46 > 5) {
                  this.a($$3, $$40, $$42, $$46, $$47, $$43.getId(), $$0);
               }
            }

            this.a($$0, $$25, $$39 - ($$21 ? 9 : 0), $$40, $$41);
         }
      }

      if ($$31 != null) {
         $$27 += $$19 * 9 + 1;
         $$0.a($$1 / 2 - $$28 / 2 - 1, $$27 - 1, $$1 / 2 + $$28 / 2 + 1, $$27 + $$31.size() * 9, Integer.MIN_VALUE);

         for (ayk $$48 : $$31) {
            int $$49 = this.q.h.a($$48);
            $$0.b(this.q.h, $$48, $$1 / 2 - $$49 / 2, $$27, -1);
            $$27 += 9;
         }
      }
   }

   protected void a(fob $$0, int $$1, int $$2, int $$3, ggi $$4) {
      aku $$5;
      if ($$4.f() < 0) {
         $$5 = b;
      } else if ($$4.f() < 150) {
         $$5 = g;
      } else if ($$4.f() < 300) {
         $$5 = f;
      } else if ($$4.f() < 600) {
         $$5 = e;
      } else if ($$4.f() < 1000) {
         $$5 = d;
      } else {
         $$5 = c;
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(gmf::H, $$5, $$2 + $$1 - 11, $$3, 10, 8);
      $$0.c().b();
   }

   private void a(fbv $$0, int $$1, fpr.b $$2, int $$3, int $$4, UUID $$5, fob $$6) {
      if ($$0.h() == fcg.a.b) {
         this.a($$1, $$3, $$4, $$5, $$6, $$2.b);
      } else if ($$2.c != null) {
         $$6.b(this.q.h, $$2.c, $$4 - $$2.d, $$1, 16777215);
      }
   }

   private void a(int $$0, int $$1, int $$2, UUID $$3, fob $$4, int $$5) {
      fpr.a $$6 = this.v.computeIfAbsent($$3, $$1x -> new fpr.a($$5));
      $$6.a($$5, (long)this.r.e());
      int $$7 = ayy.e(Math.max($$5, $$6.a()), 2);
      int $$8 = Math.max($$5, Math.max($$6.a(), 20)) / 2;
      boolean $$9 = $$6.a((long)this.r.e());
      if ($$7 > 0) {
         int $$10 = ayy.d(Math.min((float)($$2 - $$1 - 4) / (float)$$8, 9.0F));
         if ($$10 <= 3) {
            float $$11 = ayy.a((float)$$5 / 20.0F, 0.0F, 1.0F);
            int $$12 = (int)((1.0F - $$11) * 255.0F) << 16 | (int)($$11 * 255.0F) << 8;
            float $$13 = (float)$$5 / 2.0F;
            wo $$14 = wo.a("multiplayer.player.list.hp", $$13);
            wo $$15;
            if ($$2 - this.q.h.a($$14) >= $$1) {
               $$15 = $$14;
            } else {
               $$15 = wo.b(Float.toString($$13));
            }

            $$4.b(this.q.h, $$15, ($$2 + $$1 - this.q.h.a($$15)) / 2, $$0, $$12);
         } else {
            aku $$17 = $$9 ? h : i;

            for (int $$18 = $$7; $$18 < $$8; $$18++) {
               $$4.a(gmf::H, $$17, $$1 + $$18 * $$10, $$0, 9, 9);
            }

            for (int $$19 = 0; $$19 < $$7; $$19++) {
               $$4.a(gmf::H, $$17, $$1 + $$19 * $$10, $$0, 9, 9);
               if ($$9) {
                  if ($$19 * 2 + 1 < $$6.a()) {
                     $$4.a(gmf::H, j, $$1 + $$19 * $$10, $$0, 9, 9);
                  }

                  if ($$19 * 2 + 1 == $$6.a()) {
                     $$4.a(gmf::H, k, $$1 + $$19 * $$10, $$0, 9, 9);
                  }
               }

               if ($$19 * 2 + 1 < $$5) {
                  $$4.a(gmf::H, $$19 >= 10 ? l : m, $$1 + $$19 * $$10, $$0, 9, 9);
               }

               if ($$19 * 2 + 1 == $$5) {
                  $$4.a(gmf::H, $$19 >= 10 ? n : o, $$1 + $$19 * $$10, $$0, 9, 9);
               }
            }
         }
      }
   }

   public void a(@Nullable wo $$0) {
      this.s = $$0;
   }

   public void b(@Nullable wo $$0) {
      this.t = $$0;
   }

   public void a() {
      this.t = null;
      this.s = null;
   }

   static class a {
      private static final long a = 20L;
      private static final long b = 20L;
      private static final long c = 10L;
      private int d;
      private int e;
      private long f;
      private long g;

      public a(int $$0) {
         this.e = $$0;
         this.d = $$0;
      }

      public void a(int $$0, long $$1) {
         if ($$0 != this.d) {
            long $$2 = $$0 < this.d ? 20L : 10L;
            this.g = $$1 + $$2;
            this.d = $$0;
            this.f = $$1;
         }

         if ($$1 - this.f > 20L) {
            this.e = $$0;
         }
      }

      public int a() {
         return this.e;
      }

      public boolean a(long $$0) {
         return this.g > $$0 && (this.g - $$0) % 6L >= 3L;
      }
   }

   static record b(wo a, int b, @Nullable wo c, int d) {
   }
}
