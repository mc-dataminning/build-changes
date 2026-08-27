import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cro {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final vs e = vs.c("effect.none").a(n.h);

   public static List<bns> a(cpq $$0) {
      return a($$0.w());
   }

   public static List<bns> a(il<crm> $$0, Collection<bns> $$1) {
      List<bns> $$2 = new ArrayList<>();
      $$2.addAll($$0.a().a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bns> a(@Nullable sy $$0) {
      List<bns> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a().a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bns> b(cpq $$0) {
      return b($$0.w());
   }

   public static List<bns> b(@Nullable sy $$0) {
      List<bns> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable sy $$0, List<bns> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         te $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sy $$4 = $$2.a($$3);
            bns $$5 = bns.a($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(cpq $$0) {
      sy $$1 = $$0.w();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0).a(crp.b) ? 16253176 : a(a($$0));
      }
   }

   public static int a(il<crm> $$0) {
      return $$0.a(crp.b) ? 16253176 : a($$0.a().a());
   }

   public static int a(Collection<bns> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bns $$6 : $$0) {
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

   public static il<crm> d(cpq $$0) {
      return c($$0.w());
   }

   public static il<crm> c(@Nullable sy $$0) {
      return $$0 == null ? crp.b : crm.a($$0.l("Potion"));
   }

   public static cpq a(cpq $$0, il<crm> $$1) {
      Optional<ajb<crm>> $$2 = $$1.e();
      if (!$$2.isEmpty() && !$$1.a(crp.b)) {
         $$0.x().a("Potion", $$2.get().a().toString());
      } else {
         $$0.d("Potion");
      }

      return $$0;
   }

   public static cpq a(cpq $$0, Collection<bns> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         sy $$2 = $$0.x();
         te $$3 = $$2.c("custom_potion_effects", 9);

         for (bns $$4 : $$1) {
            $$3.add($$4.i());
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(cpq $$0, List<vs> $$1, float $$2, float $$3) {
      a(a($$0), $$1, $$2, $$3);
   }

   public static void a(List<bns> $$0, List<vs> $$1, float $$2, float $$3) {
      List<Pair<il<bpz>, bqc>> $$4 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bns $$5 : $$0) {
            wg $$6 = vs.c($$5.h());
            il<bnq> $$7 = $$5.b();
            $$7.a().a($$5.d(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
            if ($$5.d() > 0) {
               $$6 = vs.a("potion.withAmplifier", $$6, vs.c("potion.potency." + $$5.d()));
            }

            if (!$$5.a(20)) {
               $$6 = vs.a("potion.withDuration", $$6, bnt.a($$5, $$2, $$3));
            }

            $$1.add($$6.a($$7.a().f().a()));
         }
      }

      if (!$$4.isEmpty()) {
         $$1.add(vr.a);
         $$1.add(vs.c("potion.whenDrank").a(n.f));

         for (Pair<il<bpz>, bqc> $$8 : $$4) {
            bqc $$9 = (bqc)$$8.getSecond();
            double $$10 = $$9.c();
            double $$12;
            if ($$9.b() != bqc.a.b && $$9.b() != bqc.a.c) {
               $$12 = $$9.c();
            } else {
               $$12 = $$9.c() * 100.0;
            }

            if ($$10 > 0.0) {
               $$1.add(vs.a("attribute.modifier.plus." + $$9.b().a(), cpq.i.format($$12), vs.c(((bpz)((il)$$8.getFirst()).a()).c())).a(n.j));
            } else if ($$10 < 0.0) {
               $$12 *= -1.0;
               $$1.add(vs.a("attribute.modifier.take." + $$9.b().a(), cpq.i.format($$12), vs.c(((bpz)((il)$$8.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }
}
