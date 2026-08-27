import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class cog {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final vb e = vb.c("effect.none").a(n.h);

   public static List<bks> a(cmh $$0) {
      return a($$0.v());
   }

   public static List<bks> a(coe $$0, Collection<bks> $$1) {
      List<bks> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bks> a(@Nullable sj $$0) {
      List<bks> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bks> b(cmh $$0) {
      return b($$0.v());
   }

   public static List<bks> b(@Nullable sj $$0) {
      List<bks> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable sj $$0, List<bks> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         sp $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sj $$4 = $$2.a($$3);
            bks $$5 = bks.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(cmh $$0) {
      sj $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == coh.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(coe $$0) {
      return $$0 == coh.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bks> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bks $$6 : $$0) {
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

   public static coe d(cmh $$0) {
      return c($$0.v());
   }

   public static coe c(@Nullable sj $$0) {
      return $$0 == null ? coh.b : coe.a($$0.l("Potion"));
   }

   public static cmh a(cmh $$0, coe $$1) {
      agt $$2 = kb.i.b($$1);
      if ($$1 == coh.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static cmh a(cmh $$0, Collection<bks> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         sj $$2 = $$0.w();
         sp $$3 = $$2.c("custom_potion_effects", 9);

         for (bks $$4 : $$1) {
            $$3.add($$4.a(new sj()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(cmh $$0, List<vb> $$1, float $$2) {
      a(a($$0), $$1, $$2);
   }

   public static void a(List<bks> $$0, List<vb> $$1, float $$2) {
      List<Pair<bmw, bmz>> $$3 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bks $$4 : $$0) {
            vp $$5 = vb.c($$4.i());
            bkq $$6 = $$4.c();
            Map<bmw, bkl> $$7 = $$6.h();
            if (!$$7.isEmpty()) {
               for (Entry<bmw, bkl> $$8 : $$7.entrySet()) {
                  $$3.add(new Pair($$8.getKey(), $$8.getValue().a($$4.e())));
               }
            }

            if ($$4.e() > 0) {
               $$5 = vb.a("potion.withAmplifier", $$5, vb.c("potion.potency." + $$4.e()));
            }

            if (!$$4.a(20)) {
               $$5 = vb.a("potion.withDuration", $$5, bkt.a($$4, $$2));
            }

            $$1.add($$5.a($$6.f().a()));
         }
      }

      if (!$$3.isEmpty()) {
         $$1.add(va.a);
         $$1.add(vb.c("potion.whenDrank").a(n.f));

         for (Pair<bmw, bmz> $$9 : $$3) {
            bmz $$10 = (bmz)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.b() != bmz.a.b && $$10.b() != bmz.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.add(vb.a("attribute.modifier.plus." + $$10.b().a(), cmh.g.format($$13), vb.c(((bmw)$$9.getFirst()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.add(vb.a("attribute.modifier.take." + $$10.b().a(), cmh.g.format($$13), vb.c(((bmw)$$9.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
