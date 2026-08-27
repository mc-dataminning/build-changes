import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ckx {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final tf e = tf.c("effect.none").a(n.h);

   public static List<bhv> a(ciy $$0) {
      return a($$0.v());
   }

   public static List<bhv> a(ckv $$0, Collection<bhv> $$1) {
      List<bhv> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bhv> a(@Nullable qr $$0) {
      List<bhv> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bhv> b(ciy $$0) {
      return b($$0.v());
   }

   public static List<bhv> b(@Nullable qr $$0) {
      List<bhv> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable qr $$0, List<bhv> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         qx $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qr $$4 = $$2.a($$3);
            bhv $$5 = bhv.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(ciy $$0) {
      qr $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == cky.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(ckv $$0) {
      return $$0 == cky.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bhv> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bhv $$6 : $$0) {
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

   public static ckv d(ciy $$0) {
      return c($$0.v());
   }

   public static ckv c(@Nullable qr $$0) {
      return $$0 == null ? cky.b : ckv.a($$0.l("Potion"));
   }

   public static ciy a(ciy $$0, ckv $$1) {
      aer $$2 = jb.j.b($$1);
      if ($$1 == cky.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static ciy a(ciy $$0, Collection<bhv> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         qr $$2 = $$0.w();
         qx $$3 = $$2.c("custom_potion_effects", 9);

         for (bhv $$4 : $$1) {
            $$3.add($$4.a(new qr()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(ciy $$0, List<tf> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bhv> $$0, List<tf> $$1, float $$2) {
      List<Pair<bka, bkd>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bhv $$4 : $$0) {
            ts $$5 = tf.c($$4.i());
            bht $$6 = $$4.c();
            Map<bka, bho> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bka, bho> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = tf.a("potion.withAmplifier", $$5, tf.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = tf.a("potion.withDuration", $$5, bhw.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(te.a);
         $$1.add(tf.c("potion.whenDrank").a(n.f));

         for (Pair<bka, bkd> $$9 : $$3) {
            bkd $$10 = (bkd)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.c() != bkd.a.b && $$10.c() != bkd.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(tf.a("attribute.modifier.plus." + $$10.c().a(), ciy.c.format($$13), tf.c(((bka)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(tf.a("attribute.modifier.take." + $$10.c().a(), ciy.c.format($$13), tf.c(((bka)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
