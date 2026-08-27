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

public class eqg {
   private static final Comparator<ffb> j = Comparator.<ffb>comparingInt($$0 -> $$0.e() == cmj.d ? 1 : 0)
      .thenComparing($$0 -> x.a($$0.m(), efe::b, ""))
      .thenComparing($$0 -> $$0.a().getName(), String::compareToIgnoreCase);
   private static final acq k = new acq("textures/gui/icons.png");
   public static final int a = 20;
   public static final int b = 16;
   public static final int c = 25;
   public static final int d = 52;
   public static final int e = 61;
   public static final int f = 160;
   public static final int g = 169;
   public static final int h = 70;
   public static final int i = 79;
   private final enn l;
   private final eow m;
   @Nullable
   private sw n;
   @Nullable
   private sw o;
   private boolean p;
   private final Map<UUID, eqg.a> q = new Object2ObjectOpenHashMap();

   public eqg(enn $$0, eow $$1) {
      this.l = $$0;
      this.m = $$1;
   }

   public sw a(ffb $$0) {
      return $$0.o() != null ? this.a($$0, $$0.o().e()) : this.a($$0, efe.a($$0.m(), sw.b($$0.a().getName())));
   }

   private sw a(ffb $$0, tj $$1) {
      return $$0.e() == cmj.d ? $$1.a(n.u) : $$1;
   }

   public void a(boolean $$0) {
      if (this.p != $$0) {
         this.q.clear();
         this.p = $$0;
         if ($$0) {
            sw $$1 = sy.a(this.b(), sw.b(", "), this::a);
            this.l.aU().c(sw.a("multiplayer.player.list.narration", $$1));
         }
      }
   }

   private List<ffb> b() {
      return this.l.t.cl.h().stream().sorted(j).limit(80L).toList();
   }

   public void a(eox $$0, int $$1, efg $$2, @Nullable efd $$3) {
      List<ffb> $$4 = this.b();
      int $$5 = 0;
      int $$6 = 0;

      for (ffb $$7 : $$4) {
         int $$8 = this.l.h.a(this.a($$7));
         $$5 = Math.max($$5, $$8);
         if ($$3 != null && $$3.f() != efj.a.b) {
            $$8 = this.l.h.b(" " + $$2.c($$7.a().getName(), $$3).b());
            $$6 = Math.max($$6, $$8);
         }
      }

      if (!this.q.isEmpty()) {
         Set<UUID> $$9 = $$4.stream().map($$0x -> $$0x.a().getId()).collect(Collectors.toSet());
         this.q.keySet().removeIf($$1x -> !$$9.contains($$1x));
      }

      int $$10 = $$4.size();
      int $$11 = $$10;

      int $$12;
      for ($$12 = 1; $$11 > 20; $$11 = ($$10 + $$12 - 1) / $$12) {
         $$12++;
      }

      boolean $$13 = this.l.Q() || this.l.I().g().g();
      int $$14;
      if ($$3 != null) {
         if ($$3.f() == efj.a.b) {
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
      List<aom> $$21 = null;
      if (this.o != null) {
         $$21 = this.l.h.c(this.o, $$1 - 50);

         for (aom $$22 : $$21) {
            $$20 = Math.max($$20, this.l.h.a($$22));
         }
      }

      List<aom> $$23 = null;
      if (this.n != null) {
         $$23 = this.l.h.c(this.n, $$1 - 50);

         for (aom $$24 : $$23) {
            $$20 = Math.max($$20, this.l.h.a($$24));
         }
      }

      if ($$21 != null) {
         $$0.a($$1 / 2 - $$20 / 2 - 1, $$19 - 1, $$1 / 2 + $$20 / 2 + 1, $$19 + $$21.size() * 9, Integer.MIN_VALUE);

         for (aom $$25 : $$21) {
            int $$26 = this.l.h.a($$25);
            $$0.b(this.l.h, $$25, $$1 / 2 - $$26 / 2, $$19, -1);
            $$19 += 9;
         }

         $$19++;
      }

      $$0.a($$1 / 2 - $$20 / 2 - 1, $$19 - 1, $$1 / 2 + $$20 / 2 + 1, $$19 + $$11 * 9, Integer.MIN_VALUE);
      int $$27 = this.l.m.a(553648127);

      for (int $$28 = 0; $$28 < $$10; $$28++) {
         int $$29 = $$28 / $$11;
         int $$30 = $$28 % $$11;
         int $$31 = $$18 + $$29 * $$17 + $$29 * 5;
         int $$32 = $$19 + $$30 * 9;
         $$0.a($$31, $$32, $$31 + $$17, $$32 + 8, $$27);
         RenderSystem.enableBlend();
         if ($$28 < $$4.size()) {
            ffb $$33 = $$4.get($$28);
            GameProfile $$34 = $$33.a();
            if ($$13) {
               byo $$35 = this.l.s.b($$34.getId());
               boolean $$36 = $$35 != null && fpz.e($$35);
               boolean $$37 = $$35 != null && $$35.a(byp.g);
               eqf.a($$0, $$33.j(), $$31, $$32, 8, $$37, $$36);
               $$31 += 9;
            }

            $$0.b(this.l.h, this.a($$33), $$31, $$32, $$33.e() == cmj.d ? -1862270977 : -1);
            if ($$3 != null && $$33.e() != cmj.d) {
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

         for (aom $$40 : $$23) {
            int $$41 = this.l.h.a($$40);
            $$0.b(this.l.h, $$40, $$1 / 2 - $$41 / 2, $$19, -1);
            $$19 += 9;
         }
      }
   }

   protected void a(eox $$0, int $$1, int $$2, int $$3, ffb $$4) {
      int $$5 = 0;
      int $$6;
      if ($$4.f() < 0) {
         $$6 = 5;
      } else if ($$4.f() < 150) {
         $$6 = 0;
      } else if ($$4.f() < 300) {
         $$6 = 1;
      } else if ($$4.f() < 600) {
         $$6 = 2;
      } else if ($$4.f() < 1000) {
         $$6 = 3;
      } else {
         $$6 = 4;
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(k, $$2 + $$1 - 11, $$3, 0, 176 + $$6 * 8, 10, 8);
      $$0.c().b();
   }

   private void a(efd $$0, int $$1, String $$2, int $$3, int $$4, UUID $$5, eox $$6) {
      int $$7 = $$0.a().c($$2, $$0).b();
      if ($$0.f() == efj.a.b) {
         this.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else {
         String $$8 = "" + n.o + $$7;
         $$6.b(this.l.h, $$8, $$4 - this.l.h.b($$8), $$1, 16777215);
      }
   }

   private void a(int $$0, int $$1, int $$2, UUID $$3, eox $$4, int $$5) {
      eqg.a $$6 = this.q.computeIfAbsent($$3, $$1x -> new eqg.a($$5));
      $$6.a($$5, (long)this.m.e());
      int $$7 = apa.e(Math.max($$5, $$6.a()), 2);
      int $$8 = Math.max($$5, Math.max($$6.a(), 20)) / 2;
      boolean $$9 = $$6.a((long)this.m.e());
      if ($$7 > 0) {
         int $$10 = apa.d(Math.min((float)($$2 - $$1 - 4) / (float)$$8, 9.0F));
         if ($$10 <= 3) {
            float $$11 = apa.a((float)$$5 / 20.0F, 0.0F, 1.0F);
            int $$12 = (int)((1.0F - $$11) * 255.0F) << 16 | (int)($$11 * 255.0F) << 8;
            String $$13 = (float)$$5 / 2.0F + "";
            if ($$2 - this.l.h.b($$13 + "hp") >= $$1) {
               $$13 = $$13 + "hp";
            }

            $$4.b(this.l.h, $$13, ($$2 + $$1 - this.l.h.b($$13)) / 2, $$0, $$12);
         } else {
            for (int $$14 = $$7; $$14 < $$8; $$14++) {
               $$4.a(k, $$1 + $$14 * $$10, $$0, $$9 ? 25 : 16, 0, 9, 9);
            }

            for (int $$15 = 0; $$15 < $$7; $$15++) {
               $$4.a(k, $$1 + $$15 * $$10, $$0, $$9 ? 25 : 16, 0, 9, 9);
               if ($$9) {
                  if ($$15 * 2 + 1 < $$6.a()) {
                     $$4.a(k, $$1 + $$15 * $$10, $$0, 70, 0, 9, 9);
                  }

                  if ($$15 * 2 + 1 == $$6.a()) {
                     $$4.a(k, $$1 + $$15 * $$10, $$0, 79, 0, 9, 9);
                  }
               }

               if ($$15 * 2 + 1 < $$5) {
                  $$4.a(k, $$1 + $$15 * $$10, $$0, $$15 >= 10 ? 160 : 52, 0, 9, 9);
               }

               if ($$15 * 2 + 1 == $$5) {
                  $$4.a(k, $$1 + $$15 * $$10, $$0, $$15 >= 10 ? 169 : 61, 0, 9, 9);
               }
            }
         }
      }
   }

   public void a(@Nullable sw $$0) {
      this.n = $$0;
   }

   public void b(@Nullable sw $$0) {
      this.o = $$0;
   }

   public void a() {
      this.o = null;
      this.n = null;
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
