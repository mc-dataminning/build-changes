import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class clg {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final tn e = tn.c("effect.none").a(n.h);

   public static List<bif> a(cjh $$0) {
      return a($$0.v());
   }

   public static List<bif> a(cle $$0, Collection<bif> $$1) {
      List<bif> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bif> a(@Nullable qy $$0) {
      List<bif> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bif> b(cjh $$0) {
      return b($$0.v());
   }

   public static List<bif> b(@Nullable qy $$0) {
      List<bif> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable qy $$0, List<bif> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         re $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qy $$4 = $$2.a($$3);
            bif $$5 = bif.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(cjh $$0) {
      qy $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == clh.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(cle $$0) {
      return $$0 == clh.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bif> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bif $$6 : $$0) {
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

   public static cle d(cjh $$0) {
      return c($$0.v());
   }

   public static cle c(@Nullable qy $$0) {
      return $$0 == null ? clh.b : cle.a($$0.l("Potion"));
   }

   public static cjh a(cjh $$0, cle $$1) {
      aey $$2 = jd.j.b($$1);
      if ($$1 == clh.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static cjh a(cjh $$0, Collection<bif> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         qy $$2 = $$0.w();
         re $$3 = $$2.c("custom_potion_effects", 9);

         for (bif $$4 : $$1) {
            $$3.add($$4.a(new qy()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(cjh $$0, List<tn> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bif> $$0, List<tn> $$1, float $$2) {
      List<Pair<bkj, bkm>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bif $$4 : $$0) {
            ua $$5 = tn.c($$4.i());
            bid $$6 = $$4.c();
            Map<bkj, bhy> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bkj, bhy> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = tn.a("potion.withAmplifier", $$5, tn.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = tn.a("potion.withDuration", $$5, big.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(tm.a);
         $$1.add(tn.c("potion.whenDrank").a(n.f));

         for (Pair<bkj, bkm> $$9 : $$3) {
            bkm $$10 = (bkm)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.c() != bkm.a.b && $$10.c() != bkm.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(tn.a("attribute.modifier.plus." + $$10.c().a(), cjh.c.format($$13), tn.c(((bkj)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(tn.a("attribute.modifier.take." + $$10.c().a(), cjh.c.format($$13), tn.c(((bkj)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
