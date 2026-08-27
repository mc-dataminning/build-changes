import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class coy {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final vf e = vf.c("effect.none").a(n.h);

   public static List<bli> a(cmy $$0) {
      return a($$0.v());
   }

   public static List<bli> a(cow $$0, Collection<bli> $$1) {
      List<bli> $$2 = Lists.newArrayList();
      $$2.addAll($$0.a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bli> a(@Nullable sn $$0) {
      List<bli> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bli> b(cmy $$0) {
      return b($$0.v());
   }

   public static List<bli> b(@Nullable sn $$0) {
      List<bli> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable sn $$0, List<bli> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         st $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sn $$4 = $$2.a($$3);
            bli $$5 = bli.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(cmy $$0) {
      sn $$1 = $$0.v();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0) == coz.b ? 16253176 : a(a($$0));
      }
   }

   public static int a(cow $$0) {
      return $$0 == coz.b ? 16253176 : a($$0.a());
   }

   public static int a(Collection<bli> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bli $$6 : $$0) {
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

   public static cow d(cmy $$0) {
      return c($$0.v());
   }

   public static cow c(@Nullable sn $$0) {
      return $$0 == null ? coz.b : cow.a($$0.l("Potion"));
   }

   public static cmy a(cmy $$0, cow $$1) {
      ahg $$2 = kd.i.b($$1);
      if ($$1 == coz.b) {
         $$0.c("Potion");
      } else {
         $$0.w().a("Potion", $$2.toString());
      }

      return $$0;
   }

   public static cmy a(cmy $$0, Collection<bli> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         sn $$2 = $$0.w();
         st $$3 = $$2.c("custom_potion_effects", 9);

         for (bli $$4 : $$1) {
            $$3.add($$4.a(new sn()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(cmy $$0, List<vf> $$1, float $$2, float $$3) {
      a(a($$0), $$1, $$2, $$3);
   }

   public static void a(List<bli> $$0, List<vf> $$1, float $$2, float $$3) {
      List<Pair<bnm, bnp>> $$4 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bli $$5 : $$0) {
            vt $$6 = vf.c($$5.i());
            blg $$7 = $$5.c();
            Map<bnm, blb> $$8 = $$7.h();
            if (!$$8.isEmpty()) {
               for (Entry<bnm, blb> $$9 : $$8.entrySet()) {
                  $$4.add(new Pair($$9.getKey(), $$9.getValue().a($$5.e())));
               }
            }

            if ($$5.e() > 0) {
               $$6 = vf.a("potion.withAmplifier", $$6, vf.c("potion.potency." + $$5.e()));
            }

            if (!$$5.a(20)) {
               $$6 = vf.a("potion.withDuration", $$6, blj.a($$5, $$2, $$3));
            }

            $$1.add($$6.a($$7.f().a()));
         }
      }

      if (!$$4.isEmpty()) {
         $$1.add(ve.a);
         $$1.add(vf.c("potion.whenDrank").a(n.f));

         for (Pair<bnm, bnp> $$10 : $$4) {
            bnp $$11 = (bnp)$$10.getSecond();
            double $$12 = $$11.c();
            double $$14;
            if ($$11.b() != bnp.a.b && $$11.b() != bnp.a.c) {
               $$14 = $$11.c();
            } else {
               $$14 = $$11.c() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.add(vf.a("attribute.modifier.plus." + $$11.b().a(), cmy.g.format($$14), vf.c(((bnm)$$10.getFirst()).c())).a(n.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.add(vf.a("attribute.modifier.take." + $$11.b().a(), cmy.g.format($$14), vf.c(((bnm)$$10.getFirst()).c())).a(n.m));
            }
         }
      }
   }
}
