import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class clk {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final tl e = tl.c("effect.none").a(n.h);

   public static List<bij> a(cjl $$0) {
      return a($$0.v());
   }

   public static List<bij> a(cli $$0, Collection<bij> $$1) {
      List<bij> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bij> a(@Nullable qw $$0) {
      List<bij> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bij> b(cjl $$0) {
      return b($$0.v());
   }

   public static List<bij> b(@Nullable qw $$0) {
      List<bij> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable qw $$0, List<bij> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         rc $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qw $$4 = $$2.a($$3);
            bij $$5 = bij.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(cjl $$0) {
      qw $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == cll.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(cli $$0) {
      return $$0 == cll.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bij> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bij $$6 : $$0) {
            if ($$6.g()) {
               int $$7 = $$6.c().g();
               int $$8 = $$6.e() + 1;
               $$2 += (float)($$8 * ($$7 >> 16 & 0xFF)) / 255.0F;
               $$3 += (float)($$8 * ($$7 >> 8 & 0xFF)) / 255.0F;
               $$4 += (float)($$8 * ($$7 >> 0 & 0xFF)) / 255.0F;
               $$5 += $$8;
            }
         }

         if ($$5 == 0) {
            return 0;
         } else {
            $$2 = $$2 / (float)$$5 * 255.0F;
            $$3 = $$3 / (float)$$5 * 255.0F;
            $$4 = $$4 / (float)$$5 * 255.0F;
            return (int)$$2 << 16 | (int)$$3 << 8 | (int)$$4;
         }
      }
   }

   public static cli d(cjl $$0) {
      return c($$0.v());
   }

   public static cli c(@Nullable qw $$0) {
      return $$0 == null ? cll.b : cli.a($$0.l("Potion"));
   }

   public static cjl a(cjl $$0, cli $$1) {
      aez $$2 = jb.j.b($$1);
      if ($$1 == cll.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static cjl a(cjl $$0, Collection<bij> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         qw $$2 = $$0.w();
         rc $$3 = $$2.c("custom_potion_effects", 9);

         for (bij $$4 : $$1) {
            $$3.add($$4.a(new qw()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(cjl $$0, List<tl> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bij> $$0, List<tl> $$1, float $$2) {
      List<Pair<bkn, bkq>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bij $$4 : $$0) {
            tz $$5 = tl.c($$4.i());
            bih $$6 = $$4.c();
            Map<bkn, bic> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bkn, bic> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = tl.a("potion.withAmplifier", $$5, tl.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = tl.a("potion.withDuration", $$5, bik.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(tk.a);
         $$1.add(tl.c("potion.whenDrank").a(n.f));

         for (Pair<bkn, bkq> $$9 : $$3) {
            bkq $$10 = (bkq)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.b() != bkq.a.b && $$10.b() != bkq.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(tl.a("attribute.modifier.plus." + $$10.b().a(), cjl.c.format($$13), tl.c(((bkn)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(tl.a("attribute.modifier.take." + $$10.b().a(), cjl.c.format($$13), tl.c(((bkn)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
