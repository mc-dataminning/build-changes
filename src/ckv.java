import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ckv {
   public static final String a = "CustomPotionEffects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final te e = te.c("effect.none").a(n.h);

   public static List<bht> a(ciw $$0) {
      return a($$0.v());
   }

   public static List<bht> a(ckt $$0, Collection<bht> $$1) {
      List<bht> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bht> a(@Nullable qs $$0) {
      List<bht> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bht> b(ciw $$0) {
      return b($$0.v());
   }

   public static List<bht> b(@Nullable qs $$0) {
      List<bht> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable qs $$0, List<bht> $$1) {
      if ($$0 != null && $$0.b("CustomPotionEffects", 9)) {
         qy $$2 = $$0.c("CustomPotionEffects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qs $$4 = $$2.a($$3);
            bht $$5 = bht.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(ciw $$0) {
      qs $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == ckw.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(ckt $$0) {
      return $$0 == ckw.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bht> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bht $$6 : $$0) {
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

   public static ckt d(ciw $$0) {
      return c($$0.v());
   }

   public static ckt c(@Nullable qs $$0) {
      return $$0 == null ? ckw.b : ckt.a($$0.l("Potion"));
   }

   public static ciw a(ciw $$0, ckt $$1) {
      aep $$2 = jc.j.b($$1);
      if ($$1 == ckw.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static ciw a(ciw $$0, Collection<bht> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         qs $$2 = $$0.w();
         qy $$3 = $$2.c("CustomPotionEffects", 9);

         for (bht $$4 : $$1) {
            $$3.add($$4.a(new qs()));
         }

         $$2.a("CustomPotionEffects", $$3);
         return $$0;
      }
   }

   public static void a(ciw $$0, List<te> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bht> $$0, List<te> $$1, float $$2) {
      List<Pair<bjy, bkb>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bht $$4 : $$0) {
            tr $$5 = te.c($$4.i());
            bhr $$6 = $$4.c();
            Map<bjy, bhm> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bjy, bhm> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = te.a("potion.withAmplifier", $$5, te.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = te.a("potion.withDuration", $$5, bhu.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(td.a);
         $$1.add(te.c("potion.whenDrank").a(n.f));

         for (Pair<bjy, bkb> $$9 : $$3) {
            bkb $$10 = (bkb)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.c() != bkb.a.b && $$10.c() != bkb.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(te.a("attribute.modifier.plus." + $$10.c().a(), ciw.c.format($$13), te.c(((bjy)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(te.a("attribute.modifier.take." + $$10.c().a(), ciw.c.format($$13), te.c(((bjy)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
