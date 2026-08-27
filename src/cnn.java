import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class cnn {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final uv e = uv.c("effect.none").a(n.h);

   public static List<bki> a(clo $$0) {
      return a($$0.v());
   }

   public static List<bki> a(cnl $$0, Collection<bki> $$1) {
      List<bki> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bki> a(@Nullable sd $$0) {
      List<bki> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bki> b(clo $$0) {
      return b($$0.v());
   }

   public static List<bki> b(@Nullable sd $$0) {
      List<bki> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable sd $$0, List<bki> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         sj $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sd $$4 = $$2.a($$3);
            bki $$5 = bki.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(clo $$0) {
      sd $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == cno.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(cnl $$0) {
      return $$0 == cno.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bki> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bki $$6 : $$0) {
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

   public static cnl d(clo $$0) {
      return c($$0.v());
   }

   public static cnl c(@Nullable sd $$0) {
      return $$0 == null ? cno.b : cnl.a($$0.l("Potion"));
   }

   public static clo a(clo $$0, cnl $$1) {
      agm $$2 = kc.j.b($$1);
      if ($$1 == cno.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static clo a(clo $$0, Collection<bki> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         sd $$2 = $$0.w();
         sj $$3 = $$2.c("custom_potion_effects", 9);

         for (bki $$4 : $$1) {
            $$3.add($$4.a(new sd()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(clo $$0, List<uv> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bki> $$0, List<uv> $$1, float $$2) {
      List<Pair<bmm, bmp>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bki $$4 : $$0) {
            vj $$5 = uv.c($$4.i());
            bkg $$6 = $$4.c();
            Map<bmm, bkb> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bmm, bkb> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = uv.a("potion.withAmplifier", $$5, uv.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = uv.a("potion.withDuration", $$5, bkj.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(uu.a);
         $$1.add(uv.c("potion.whenDrank").a(n.f));

         for (Pair<bmm, bmp> $$9 : $$3) {
            bmp $$10 = (bmp)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.b() != bmp.a.b && $$10.b() != bmp.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(uv.a("attribute.modifier.plus." + $$10.b().a(), clo.c.format($$13), uv.c(((bmm)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(uv.a("attribute.modifier.take." + $$10.b().a(), clo.c.format($$13), uv.c(((bmm)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
