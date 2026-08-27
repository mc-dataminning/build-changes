import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class cni {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final ur e = ur.c("effect.none").a(n.h);

   public static List<bkd> a(clj $$0) {
      return a($$0.v());
   }

   public static List<bkd> a(cng $$0, Collection<bkd> $$1) {
      List<bkd> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bkd> a(@Nullable rz $$0) {
      List<bkd> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bkd> b(clj $$0) {
      return b($$0.v());
   }

   public static List<bkd> b(@Nullable rz $$0) {
      List<bkd> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable rz $$0, List<bkd> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         sf $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            rz $$4 = $$2.a($$3);
            bkd $$5 = bkd.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(clj $$0) {
      rz $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == cnj.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(cng $$0) {
      return $$0 == cnj.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bkd> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bkd $$6 : $$0) {
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

   public static cng d(clj $$0) {
      return c($$0.v());
   }

   public static cng c(@Nullable rz $$0) {
      return $$0 == null ? cnj.b : cng.a($$0.l("Potion"));
   }

   public static clj a(clj $$0, cng $$1) {
      agi $$2 = jy.j.b($$1);
      if ($$1 == cnj.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static clj a(clj $$0, Collection<bkd> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         rz $$2 = $$0.w();
         sf $$3 = $$2.c("custom_potion_effects", 9);

         for (bkd $$4 : $$1) {
            $$3.add($$4.a(new rz()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(clj $$0, List<ur> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bkd> $$0, List<ur> $$1, float $$2) {
      List<Pair<bmh, bmk>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bkd $$4 : $$0) {
            vf $$5 = ur.c($$4.i());
            bkb $$6 = $$4.c();
            Map<bmh, bjw> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bmh, bjw> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = ur.a("potion.withAmplifier", $$5, ur.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = ur.a("potion.withDuration", $$5, bke.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(uq.a);
         $$1.add(ur.c("potion.whenDrank").a(n.f));

         for (Pair<bmh, bmk> $$9 : $$3) {
            bmk $$10 = (bmk)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.b() != bmk.a.b && $$10.b() != bmk.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(ur.a("attribute.modifier.plus." + $$10.b().a(), clj.c.format($$13), ur.c(((bmh)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(ur.a("attribute.modifier.take." + $$10.b().a(), clj.c.format($$13), ur.c(((bmh)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
