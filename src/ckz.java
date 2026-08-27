import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ckz {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final ti e = ti.c("effect.none").a(n.h);

   public static List<bhy> a(cja $$0) {
      return a($$0.v());
   }

   public static List<bhy> a(ckx $$0, Collection<bhy> $$1) {
      List<bhy> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bhy> a(@Nullable qu $$0) {
      List<bhy> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bhy> b(cja $$0) {
      return b($$0.v());
   }

   public static List<bhy> b(@Nullable qu $$0) {
      List<bhy> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable qu $$0, List<bhy> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         ra $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qu $$4 = $$2.a($$3);
            bhy $$5 = bhy.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(cja $$0) {
      qu $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == cla.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(ckx $$0) {
      return $$0 == cla.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bhy> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bhy $$6 : $$0) {
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

   public static ckx d(cja $$0) {
      return c($$0.v());
   }

   public static ckx c(@Nullable qu $$0) {
      return $$0 == null ? cla.b : ckx.a($$0.l("Potion"));
   }

   public static cja a(cja $$0, ckx $$1) {
      aeu $$2 = jd.j.b($$1);
      if ($$1 == cla.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static cja a(cja $$0, Collection<bhy> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         qu $$2 = $$0.w();
         ra $$3 = $$2.c("custom_potion_effects", 9);

         for (bhy $$4 : $$1) {
            $$3.add($$4.a(new qu()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(cja $$0, List<ti> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bhy> $$0, List<ti> $$1, float $$2) {
      List<Pair<bkc, bkf>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bhy $$4 : $$0) {
            tv $$5 = ti.c($$4.i());
            bhw $$6 = $$4.c();
            Map<bkc, bhr> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bkc, bhr> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = ti.a("potion.withAmplifier", $$5, ti.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = ti.a("potion.withDuration", $$5, bhz.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(th.a);
         $$1.add(ti.c("potion.whenDrank").a(n.f));

         for (Pair<bkc, bkf> $$9 : $$3) {
            bkf $$10 = (bkf)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.c() != bkf.a.b && $$10.c() != bkf.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(ti.a("attribute.modifier.plus." + $$10.c().a(), cja.c.format($$13), ti.c(((bkc)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(ti.a("attribute.modifier.take." + $$10.c().a(), cja.c.format($$13), ti.c(((bkc)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
