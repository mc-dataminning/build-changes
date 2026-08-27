import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csl {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final vu e = vu.c("effect.none").a(n.h);

   public static List<bok> a(cqm $$0) {
      return a($$0.w());
   }

   public static List<bok> a(il<csj> $$0, Collection<bok> $$1) {
      List<bok> $$2 = new ArrayList<>();
      $$2.addAll($$0.a().a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bok> a(@Nullable ta $$0) {
      List<bok> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a().a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bok> b(cqm $$0) {
      return b($$0.w());
   }

   public static List<bok> b(@Nullable ta $$0) {
      List<bok> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable ta $$0, List<bok> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         tg $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            ta $$4 = $$2.a($$3);
            bok $$5 = bok.a($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(cqm $$0) {
      ta $$1 = $$0.w();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0).a(csm.b) ? 16253176 : a(a($$0));
      }
   }

   public static int a(il<csj> $$0) {
      return $$0.a(csm.b) ? 16253176 : a($$0.a().a());
   }

   public static int a(Collection<bok> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bok $$6 : $$0) {
            if ($$6.f()) {
               int $$7 = $$6.b().a().g();
               int $$8 = $$6.d() + 1;
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

   public static il<csj> d(cqm $$0) {
      return c($$0.w());
   }

   public static il<csj> c(@Nullable ta $$0) {
      return $$0 == null ? csm.b : csj.a($$0.l("Potion"));
   }

   public static cqm a(cqm $$0, il<csj> $$1) {
      Optional<ajg<csj>> $$2 = $$1.e();
      if (!$$2.isEmpty() && !$$1.a(csm.b)) {
         $$0.x().a("Potion", $$2.get().a().toString());
      } else {
         $$0.d("Potion");
      }

      return $$0;
   }

   public static cqm a(cqm $$0, Collection<bok> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         ta $$2 = $$0.x();
         tg $$3 = $$2.c("custom_potion_effects", 9);

         for (bok $$4 : $$1) {
            $$3.add($$4.i());
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(cqm $$0, List<vu> $$1, float $$2, float $$3) {
      a(a($$0), $$1, $$2, $$3);
   }

   public static void a(List<bok> $$0, List<vu> $$1, float $$2, float $$3) {
      List<Pair<il<bqr>, bqu>> $$4 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bok $$5 : $$0) {
            wi $$6 = vu.c($$5.h());
            il<boi> $$7 = $$5.b();
            $$7.a().a($$5.d(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
            if ($$5.d() > 0) {
               $$6 = vu.a("potion.withAmplifier", $$6, vu.c("potion.potency." + $$5.d()));
            }

            if (!$$5.a(20)) {
               $$6 = vu.a("potion.withDuration", $$6, bol.a($$5, $$2, $$3));
            }

            $$1.add($$6.a($$7.a().f().a()));
         }
      }

      if (!$$4.isEmpty()) {
         $$1.add(vt.a);
         $$1.add(vu.c("potion.whenDrank").a(n.f));

         for (Pair<il<bqr>, bqu> $$8 : $$4) {
            bqu $$9 = (bqu)$$8.getSecond();
            double $$10 = $$9.c();
            double $$12;
            if ($$9.b() != bqu.a.b && $$9.b() != bqu.a.c) {
               $$12 = $$9.c();
            } else {
               $$12 = $$9.c() * 100.0;
            }

            if ($$10 > 0.0) {
               $$1.add(vu.a("attribute.modifier.plus." + $$9.b().a(), cqm.i.format($$12), vu.c(((bqr)((il)$$8.getFirst()).a()).c())).a(n.j));
            } else if ($$10 < 0.0) {
               $$12 *= -1.0;
               $$1.add(vu.a("attribute.modifier.take." + $$9.b().a(), cqm.i.format($$12), vu.c(((bqr)((il)$$8.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }
}
