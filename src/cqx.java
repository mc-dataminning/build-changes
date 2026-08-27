import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqx {
   public static final String a = "custom_potion_effects";
   public static final String b = "CustomPotionColor";
   public static final String c = "Potion";
   private static final int d = 16253176;
   private static final vq e = vq.c("effect.none").a(n.h);

   public static List<bnb> a(coz $$0) {
      return a($$0.w());
   }

   public static List<bnb> a(ij<cqv> $$0, Collection<bnb> $$1) {
      List<bnb> $$2 = new ArrayList<>();
      $$2.addAll($$0.a().a());
      $$2.addAll($$1);
      return $$2;
   }

   public static List<bnb> a(@Nullable sw $$0) {
      List<bnb> $$1 = Lists.newArrayList();
      $$1.addAll(c($$0).a().a());
      a($$0, $$1);
      return $$1;
   }

   public static List<bnb> b(coz $$0) {
      return b($$0.w());
   }

   public static List<bnb> b(@Nullable sw $$0) {
      List<bnb> $$1 = Lists.newArrayList();
      a($$0, $$1);
      return $$1;
   }

   public static void a(@Nullable sw $$0, List<bnb> $$1) {
      if ($$0 != null && $$0.b("custom_potion_effects", 9)) {
         tc $$2 = $$0.c("custom_potion_effects", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sw $$4 = $$2.a($$3);
            bnb $$5 = bnb.b($$4);
            if ($$5 != null) {
               $$1.add($$5);
            }
         }
      }
   }

   public static int c(coz $$0) {
      sw $$1 = $$0.w();
      if ($$1 != null && $$1.b("CustomPotionColor", 99)) {
         return $$1.h("CustomPotionColor");
      } else {
         return d($$0).a(cqy.b) ? 16253176 : a(a($$0));
      }
   }

   public static int a(ij<cqv> $$0) {
      return $$0.a(cqy.b) ? 16253176 : a($$0.a().a());
   }

   public static int a(Collection<bnb> $$0) {
      int $$1 = 3694022;
      if ($$0.isEmpty()) {
         return 3694022;
      } else {
         float $$2 = 0.0F;
         float $$3 = 0.0F;
         float $$4 = 0.0F;
         int $$5 = 0;

         for (bnb $$6 : $$0) {
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

   public static ij<cqv> d(coz $$0) {
      return c($$0.w());
   }

   public static ij<cqv> c(@Nullable sw $$0) {
      return $$0 == null ? cqy.b : cqv.a($$0.l("Potion"));
   }

   public static coz a(coz $$0, ij<cqv> $$1) {
      Optional<aix<cqv>> $$2 = $$1.e();
      if (!$$2.isEmpty() && !$$1.a(cqy.b)) {
         $$0.x().a("Potion", $$2.get().a().toString());
      } else {
         $$0.c("Potion");
      }

      return $$0;
   }

   public static coz a(coz $$0, Collection<bnb> $$1) {
      if ($$1.isEmpty()) {
         return $$0;
      } else {
         sw $$2 = $$0.x();
         tc $$3 = $$2.c("custom_potion_effects", 9);

         for (bnb $$4 : $$1) {
            $$3.add($$4.a(new sw()));
         }

         $$2.a("custom_potion_effects", $$3);
         return $$0;
      }
   }

   public static void a(coz $$0, List<vq> $$1, float $$2, float $$3) {
      a(a($$0), $$1, $$2, $$3);
   }

   public static void a(List<bnb> $$0, List<vq> $$1, float $$2, float $$3) {
      List<Pair<ij<bpg>, bpj>> $$4 = Lists.newArrayList();
      if ($$0.isEmpty()) {
         $$1.add(e);
      } else {
         for (bnb $$5 : $$0) {
            we $$6 = vq.c($$5.h());
            ij<bmz> $$7 = $$5.b();
            $$7.a().a($$5.d(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
            if ($$5.d() > 0) {
               $$6 = vq.a("potion.withAmplifier", $$6, vq.c("potion.potency." + $$5.d()));
            }

            if (!$$5.a(20)) {
               $$6 = vq.a("potion.withDuration", $$6, bnc.a($$5, $$2, $$3));
            }

            $$1.add($$6.a($$7.a().f().a()));
         }
      }

      if (!$$4.isEmpty()) {
         $$1.add(vp.a);
         $$1.add(vq.c("potion.whenDrank").a(n.f));

         for (Pair<ij<bpg>, bpj> $$8 : $$4) {
            bpj $$9 = (bpj)$$8.getSecond();
            double $$10 = $$9.c();
            double $$12;
            if ($$9.b() != bpj.a.b && $$9.b() != bpj.a.c) {
               $$12 = $$9.c();
            } else {
               $$12 = $$9.c() * 100.0;
            }

            if ($$10 > 0.0) {
               $$1.add(vq.a("attribute.modifier.plus." + $$9.b().a(), coz.i.format($$12), vq.c(((bpg)((ij)$$8.getFirst()).a()).c())).a(n.j));
            } else if ($$10 < 0.0) {
               $$12 *= -1.0;
               $$1.add(vq.a("attribute.modifier.take." + $$9.b().a(), coz.i.format($$12), vq.c(((bpg)((ij)$$8.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }
}
