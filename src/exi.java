import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class exi {
   private static final agt b = new agt("icon/ping_unknown");
   private static final agt c = new agt("icon/ping_1");
   private static final agt d = new agt("icon/ping_2");
   private static final agt e = new agt("icon/ping_3");
   private static final agt f = new agt("icon/ping_4");
   private static final agt g = new agt("icon/ping_5");
   private static final agt h = new agt("hud/heart/container_blinking");
   private static final agt i = new agt("hud/heart/container");
   private static final agt j = new agt("hud/heart/full_blinking");
   private static final agt k = new agt("hud/heart/half_blinking");
   private static final agt l = new agt("hud/heart/absorbing_full_blinking");
   private static final agt m = new agt("hud/heart/full");
   private static final agt n = new agt("hud/heart/absorbing_half_blinking");
   private static final agt o = new agt("hud/heart/half");
   private static final Comparator<fnc> p = Comparator.<fnc>comparingInt($$0 -> $$0.e() == csv.d ? 1 : 0)
      .thenComparing($$0 -> x.a($$0.h(), ely::b, ""))
      .thenComparing($$0 -> $$0.a().getName(), String::compareToIgnoreCase);
   public static final int a = 20;
   private final euk q;
   private final evv r;
   @Nullable
   private vb s;
   @Nullable
   private vb t;
   private boolean u;
   private final Map<UUID, exi.a> v = new Object2ObjectOpenHashMap();

   public exi(euk $$0, evv $$1) {
      this.q = $$0;
      this.r = $$1;
   }

   public vb a(fnc $$0) {
      return $$0.i() != null ? this.a($$0, $$0.i().f()) : this.a($$0, ely.a($$0.h(), vb.b($$0.a().getName())));
   }

   private vb a(fnc $$0, vp $$1) {
      return $$0.e() == csv.d ? $$1.a(n.u) : $$1;
   }

   public void a(boolean $$0) {
      if (this.u != $$0) {
         this.v.clear();
         this.u = $$0;
         if ($$0) {
            vb $$1 = ve.a(this.b(), vb.b(", "), this::a);
            this.q.aU().c(vb.a("multiplayer.player.list.narration", $$1));
         }
      }
   }

   private List<fnc> b() {
      return this.q.s.cn.n().stream().sorted(p).limit(80L).toList();
   }

   public void a(evw $$0, int $$1, ema $$2, @Nullable elx $$3) {
      List<fnc> $$4 = this.b();
      int $$5 = 0;
      int $$6 = 0;

      for (fnc $$7 : $$4) {
         int $$8 = this.q.h.a(this.a($$7));
         $$5 = Math.max($$5, $$8);
         if ($$3 != null && $$3.f() != emd.a.b) {
            $$8 = this.q.h.b(" " + $$2.c($$7.a().getName(), $$3).b());
            $$6 = Math.max($$6, $$8);
         }
      }

      if (!this.v.isEmpty()) {
         Set<UUID> $$9 = $$4.stream().map($$0x -> $$0x.a().getId()).collect(Collectors.toSet());
         this.v.keySet().removeIf($$1x -> !$$9.contains($$1x));
      }

      int $$10 = $$4.size();
      int $$11 = $$10;

      int $$12;
      for ($$12 = 1; $$11 > 20; $$11 = ($$10 + $$12 - 1) / $$12) {
         $$12++;
      }

      boolean $$13 = this.q.Q() || this.q.I().m().j();
      int $$14;
      if ($$3 != null) {
         if ($$3.f() == emd.a.b) {
            $$14 = 90;
         } else {
            $$14 = $$6;
         }
      } else {
         $$14 = 0;
      }

      int $$17 = Math.min($$12 * (($$13 ? 9 : 0) + $$5 + $$14 + 13), $$1 - 50) / $$12;
      int $$18 = $$1 / 2 - ($$17 * $$12 + ($$12 - 1) * 5) / 2;
      int $$19 = 10;
      int $$20 = $$17 * $$12 + ($$12 - 1) * 5;
      List<atk> $$21 = null;
      if (this.t != null) {
         $$21 = this.q.h.c(this.t, $$1 - 50);

         for (atk $$22 : $$21) {
            $$20 = Math.max($$20, this.q.h.a($$22));
         }
      }

      List<atk> $$23 = null;
      if (this.s != null) {
         $$23 = this.q.h.c(this.s, $$1 - 50);

         for (atk $$24 : $$23) {
            $$20 = Math.max($$20, this.q.h.a($$24));
         }
      }

      if ($$21 != null) {
         $$0.a($$1 / 2 - $$20 / 2 - 1, $$19 - 1, $$1 / 2 + $$20 / 2 + 1, $$19 + $$21.size() * 9, Integer.MIN_VALUE);

         for (atk $$25 : $$21) {
            int $$26 = this.q.h.a($$25);
            $$0.b(this.q.h, $$25, $$1 / 2 - $$26 / 2, $$19, -1);
            $$19 += 9;
         }

         $$19++;
      }

      $$0.a($$1 / 2 - $$20 / 2 - 1, $$19 - 1, $$1 / 2 + $$20 / 2 + 1, $$19 + $$11 * 9, Integer.MIN_VALUE);
      int $$27 = this.q.m.a(553648127);

      for (int $$28 = 0; $$28 < $$10; $$28++) {
         int $$29 = $$28 / $$11;
         int $$30 = $$28 % $$11;
         int $$31 = $$18 + $$29 * $$17 + $$29 * 5;
         int $$32 = $$19 + $$30 * 9;
         $$0.a($$31, $$32, $$31 + $$17, $$32 + 8, $$27);
         RenderSystem.enableBlend();
         if ($$28 < $$4.size()) {
            fnc $$33 = $$4.get($$28);
            GameProfile $$34 = $$33.a();
            if ($$13) {
               cer $$35 = this.q.r.b($$34.getId());
               boolean $$36 = $$35 != null && fyp.e($$35);
               boolean $$37 = $$35 != null && $$35.a(ces.g);
               exg.a($$0, $$33.g().a(), $$31, $$32, 8, $$37, $$36);
               $$31 += 9;
            }

            $$0.b(this.q.h, this.a($$33), $$31, $$32, $$33.e() == csv.d ? -1862270977 : -1);
            if ($$3 != null && $$33.e() != csv.d) {
               int $$38 = $$31 + $$5 + 1;
               int $$39 = $$38 + $$14;
               if ($$39 - $$38 > 5) {
                  this.a($$3, $$32, $$34.getName(), $$38, $$39, $$34.getId(), $$0);
               }
            }

            this.a($$0, $$17, $$31 - ($$13 ? 9 : 0), $$32, $$33);
         }
      }

      if ($$23 != null) {
         $$19 += $$11 * 9 + 1;
         $$0.a($$1 / 2 - $$20 / 2 - 1, $$19 - 1, $$1 / 2 + $$20 / 2 + 1, $$19 + $$23.size() * 9, Integer.MIN_VALUE);

         for (atk $$40 : $$23) {
            int $$41 = this.q.h.a($$40);
            $$0.b(this.q.h, $$40, $$1 / 2 - $$41 / 2, $$19, -1);
            $$19 += 9;
         }
      }
   }

   protected void a(evw $$0, int $$1, int $$2, int $$3, fnc $$4) {
      agt $$5;
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
      $$0.a($$5, $$2 + $$1 - 11, $$3, 10, 8);
      $$0.c().b();
   }

   private void a(elx $$0, int $$1, String $$2, int $$3, int $$4, UUID $$5, evw $$6) {
      int $$7 = $$0.a().c($$2, $$0).b();
      if ($$0.f() == emd.a.b) {
         this.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else {
         String $$8 = "" + n.o + $$7;
         $$6.b(this.q.h, $$8, $$4 - this.q.h.b($$8), $$1, 16777215);
      }
   }

   private void a(int $$0, int $$1, int $$2, UUID $$3, evw $$4, int $$5) {
      exi.a $$6 = this.v.computeIfAbsent($$3, $$1x -> new exi.a($$5));
      $$6.a($$5, (long)this.r.e());
      int $$7 = aty.e(Math.max($$5, $$6.a()), 2);
      int $$8 = Math.max($$5, Math.max($$6.a(), 20)) / 2;
      boolean $$9 = $$6.a((long)this.r.e());
      if ($$7 > 0) {
         int $$10 = aty.d(Math.min((float)($$2 - $$1 - 4) / (float)$$8, 9.0F));
         if ($$10 <= 3) {
            float $$11 = aty.a((float)$$5 / 20.0F, 0.0F, 1.0F);
            int $$12 = (int)((1.0F - $$11) * 255.0F) << 16 | (int)($$11 * 255.0F) << 8;
            float $$13 = (float)$$5 / 2.0F;
            vb $$14 = vb.a("multiplayer.player.list.hp", $$13);
            vb $$15;
            if ($$2 - this.q.h.a($$14) >= $$1) {
               $$15 = $$14;
            } else {
               $$15 = vb.b($$13 + "");
            }

            $$4.b(this.q.h, $$15, ($$2 + $$1 - this.q.h.a($$15)) / 2, $$0, $$12);
         } else {
            agt $$17 = $$9 ? h : i;

            for (int $$18 = $$7; $$18 < $$8; $$18++) {
               $$4.a($$17, $$1 + $$18 * $$10, $$0, 9, 9);
            }

            for (int $$19 = 0; $$19 < $$7; $$19++) {
               $$4.a($$17, $$1 + $$19 * $$10, $$0, 9, 9);
               if ($$9) {
                  if ($$19 * 2 + 1 < $$6.a()) {
                     $$4.a(j, $$1 + $$19 * $$10, $$0, 9, 9);
                  }

                  if ($$19 * 2 + 1 == $$6.a()) {
                     $$4.a(k, $$1 + $$19 * $$10, $$0, 9, 9);
                  }
               }

               if ($$19 * 2 + 1 < $$5) {
                  $$4.a($$19 >= 10 ? l : m, $$1 + $$19 * $$10, $$0, 9, 9);
               }

               if ($$19 * 2 + 1 == $$5) {
                  $$4.a($$19 >= 10 ? n : o, $$1 + $$19 * $$10, $$0, 9, 9);
               }
            }
         }
      }
   }

   public void a(@Nullable vb $$0) {
      this.s = $$0;
   }

   public void b(@Nullable vb $$0) {
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
}
