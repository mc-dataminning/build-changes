import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fap {
   private static final aiy b = new aiy("icon/ping_unknown");
   private static final aiy c = new aiy("icon/ping_1");
   private static final aiy d = new aiy("icon/ping_2");
   private static final aiy e = new aiy("icon/ping_3");
   private static final aiy f = new aiy("icon/ping_4");
   private static final aiy g = new aiy("icon/ping_5");
   private static final aiy h = new aiy("hud/heart/container_blinking");
   private static final aiy i = new aiy("hud/heart/container");
   private static final aiy j = new aiy("hud/heart/full_blinking");
   private static final aiy k = new aiy("hud/heart/half_blinking");
   private static final aiy l = new aiy("hud/heart/absorbing_full_blinking");
   private static final aiy m = new aiy("hud/heart/full");
   private static final aiy n = new aiy("hud/heart/absorbing_half_blinking");
   private static final aiy o = new aiy("hud/heart/half");
   private static final Comparator<fqn> p = Comparator.<fqn>comparingInt($$0 -> $$0.e() == cvo.d ? 1 : 0)
      .thenComparing($$0 -> x.a($$0.h(), eoy::b, ""))
      .thenComparing($$0 -> $$0.a().getName(), String::compareToIgnoreCase);
   public static final int a = 20;
   private final exo q;
   private final eza r;
   @Nullable
   private vq s;
   @Nullable
   private vq t;
   private boolean u;
   private final Map<UUID, fap.a> v = new Object2ObjectOpenHashMap();

   public fap(exo $$0, eza $$1) {
      this.q = $$0;
      this.r = $$1;
   }

   public vq a(fqn $$0) {
      return $$0.i() != null ? this.a($$0, $$0.i().f()) : this.a($$0, eoy.a($$0.h(), vq.b($$0.a().getName())));
   }

   private vq a(fqn $$0, we $$1) {
      return $$0.e() == cvo.d ? $$1.a(n.u) : $$1;
   }

   public void a(boolean $$0) {
      if (this.u != $$0) {
         this.v.clear();
         this.u = $$0;
         if ($$0) {
            vq $$1 = vt.a(this.b(), vq.b(", "), this::a);
            this.q.aX().c(vq.a("multiplayer.player.list.narration", $$1));
         }
      }
   }

   private List<fqn> b() {
      return this.q.s.cq.m().stream().sorted(p).limit(80L).toList();
   }

   public void a(ezb $$0, int $$1, epd $$2, @Nullable eov $$3) {
      List<fqn> $$4 = this.b();
      List<fap.b> $$5 = new ArrayList<>($$4.size());
      int $$6 = this.q.h.b(" ");
      int $$7 = 0;
      int $$8 = 0;

      for (fqn $$9 : $$4) {
         vq $$10 = this.a($$9);
         $$7 = Math.max($$7, this.q.h.a($$10));
         int $$11 = 0;
         vq $$12 = null;
         int $$13 = 0;
         if ($$3 != null) {
            epc $$14 = epc.a($$9.a());
            eoz $$15 = $$2.d($$14, $$3);
            if ($$15 != null) {
               $$11 = $$15.a();
            }

            if ($$3.h() != epg.a.b) {
               xg $$16 = $$3.a(xj.d);
               $$12 = eoz.a($$15, $$16);
               $$13 = this.q.h.a($$12);
               $$8 = Math.max($$8, $$13 > 0 ? $$6 + $$13 : 0);
            }
         }

         $$5.add(new fap.b($$10, $$11, $$12, $$13));
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

      boolean $$21 = this.q.S() || this.q.K().l().h();
      int $$22;
      if ($$3 != null) {
         if ($$3.h() == epg.a.b) {
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
      List<avu> $$29 = null;
      if (this.t != null) {
         $$29 = this.q.h.c(this.t, $$1 - 50);

         for (avu $$30 : $$29) {
            $$28 = Math.max($$28, this.q.h.a($$30));
         }
      }

      List<avu> $$31 = null;
      if (this.s != null) {
         $$31 = this.q.h.c(this.s, $$1 - 50);

         for (avu $$32 : $$31) {
            $$28 = Math.max($$28, this.q.h.a($$32));
         }
      }

      if ($$29 != null) {
         $$0.a($$1 / 2 - $$28 / 2 - 1, $$27 - 1, $$1 / 2 + $$28 / 2 + 1, $$27 + $$29.size() * 9, Integer.MIN_VALUE);

         for (avu $$33 : $$29) {
            int $$34 = this.q.h.a($$33);
            $$0.b(this.q.h, $$33, $$1 / 2 - $$34 / 2, $$27, -1);
            $$27 += 9;
         }

         $$27++;
      }

      $$0.a($$1 / 2 - $$28 / 2 - 1, $$27 - 1, $$1 / 2 + $$28 / 2 + 1, $$27 + $$19 * 9, Integer.MIN_VALUE);
      int $$35 = this.q.m.a(553648127);

      for (int $$36 = 0; $$36 < $$18; $$36++) {
         int $$37 = $$36 / $$19;
         int $$38 = $$36 % $$19;
         int $$39 = $$26 + $$37 * $$25 + $$37 * 5;
         int $$40 = $$27 + $$38 * 9;
         $$0.a($$39, $$40, $$39 + $$25, $$40 + 8, $$35);
         RenderSystem.enableBlend();
         if ($$36 < $$4.size()) {
            fqn $$41 = $$4.get($$36);
            fap.b $$42 = $$5.get($$36);
            GameProfile $$43 = $$41.a();
            if ($$21) {
               chl $$44 = this.q.r.b($$43.getId());
               boolean $$45 = $$44 != null && gcb.e($$44);
               boolean $$46 = $$44 != null && $$44.a(chm.g);
               fan.a($$0, $$41.g().a(), $$39, $$40, 8, $$46, $$45);
               $$39 += 9;
            }

            $$0.b(this.q.h, $$42.a, $$39, $$40, $$41.e() == cvo.d ? -1862270977 : -1);
            if ($$3 != null && $$41.e() != cvo.d) {
               int $$47 = $$39 + $$7 + 1;
               int $$48 = $$47 + $$22;
               if ($$48 - $$47 > 5) {
                  this.a($$3, $$40, $$42, $$47, $$48, $$43.getId(), $$0);
               }
            }

            this.a($$0, $$25, $$39 - ($$21 ? 9 : 0), $$40, $$41);
         }
      }

      if ($$31 != null) {
         $$27 += $$19 * 9 + 1;
         $$0.a($$1 / 2 - $$28 / 2 - 1, $$27 - 1, $$1 / 2 + $$28 / 2 + 1, $$27 + $$31.size() * 9, Integer.MIN_VALUE);

         for (avu $$49 : $$31) {
            int $$50 = this.q.h.a($$49);
            $$0.b(this.q.h, $$49, $$1 / 2 - $$50 / 2, $$27, -1);
            $$27 += 9;
         }
      }
   }

   protected void a(ezb $$0, int $$1, int $$2, int $$3, fqn $$4) {
      aiy $$5;
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

   private void a(eov $$0, int $$1, fap.b $$2, int $$3, int $$4, UUID $$5, ezb $$6) {
      if ($$0.h() == epg.a.b) {
         this.a($$1, $$3, $$4, $$5, $$6, $$2.b);
      } else if ($$2.c != null) {
         $$6.b(this.q.h, $$2.c, $$4 - $$2.d, $$1, 16777215);
      }
   }

   private void a(int $$0, int $$1, int $$2, UUID $$3, ezb $$4, int $$5) {
      fap.a $$6 = this.v.computeIfAbsent($$3, $$1x -> new fap.a($$5));
      $$6.a($$5, (long)this.r.e());
      int $$7 = awi.e(Math.max($$5, $$6.a()), 2);
      int $$8 = Math.max($$5, Math.max($$6.a(), 20)) / 2;
      boolean $$9 = $$6.a((long)this.r.e());
      if ($$7 > 0) {
         int $$10 = awi.d(Math.min((float)($$2 - $$1 - 4) / (float)$$8, 9.0F));
         if ($$10 <= 3) {
            float $$11 = awi.a((float)$$5 / 20.0F, 0.0F, 1.0F);
            int $$12 = (int)((1.0F - $$11) * 255.0F) << 16 | (int)($$11 * 255.0F) << 8;
            float $$13 = (float)$$5 / 2.0F;
            vq $$14 = vq.a("multiplayer.player.list.hp", $$13);
            vq $$15;
            if ($$2 - this.q.h.a($$14) >= $$1) {
               $$15 = $$14;
            } else {
               $$15 = vq.b(Float.toString($$13));
            }

            $$4.b(this.q.h, $$15, ($$2 + $$1 - this.q.h.a($$15)) / 2, $$0, $$12);
         } else {
            aiy $$17 = $$9 ? h : i;

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

   public void a(@Nullable vq $$0) {
      this.s = $$0;
   }

   public void b(@Nullable vq $$0) {
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

   static record b(vq a, int b, @Nullable vq c, int d) {
   }
}
