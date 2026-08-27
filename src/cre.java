import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class cre {
   private static final String a = "id";
   private static final String b = "lvl";
   private static final float c = 0.15F;

   public static sl a(@Nullable ahd $$0, int $$1) {
      sl $$2 = new sl();
      $$2.a("id", String.valueOf($$0));
      $$2.a("lvl", (short)$$1);
      return $$2;
   }

   public static void a(sl $$0, int $$1) {
      $$0.a("lvl", (short)$$1);
   }

   public static int a(sl $$0) {
      return aui.a($$0.h("lvl"), 0, 255);
   }

   @Nullable
   public static ahd b(sl $$0) {
      return ahd.a($$0.l("id"));
   }

   @Nullable
   public static ahd a(crc $$0) {
      return kd.f.b($$0);
   }

   public static int a(crc $$0, cmr $$1) {
      if ($$1.b()) {
         return 0;
      } else {
         ahd $$2 = a($$0);
         sr $$3 = $$1.x();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            sl $$5 = $$3.a($$4);
            ahd $$6 = b($$5);
            if ($$6 != null && $$6.equals($$2)) {
               return a($$5);
            }
         }

         return 0;
      }
   }

   public static Map<crc, Integer> a(cmr $$0) {
      sr $$1 = $$0.a(cmu.up) ? cln.d($$0) : $$0.x();
      return a($$1);
   }

   public static Map<crc, Integer> a(sr $$0) {
      Map<crc, Integer> $$1 = Maps.newLinkedHashMap();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         sl $$3 = $$0.a($$2);
         kd.f.b(b($$3)).ifPresent($$2x -> $$1.put($$2x, a($$3)));
      }

      return $$1;
   }

   public static void a(Map<crc, Integer> $$0, cmr $$1) {
      sr $$2 = new sr();

      for (Entry<crc, Integer> $$3 : $$0.entrySet()) {
         crc $$4 = $$3.getKey();
         if ($$4 != null) {
            int $$5 = $$3.getValue();
            $$2.add(a(a($$4), $$5));
            if ($$1.a(cmu.up)) {
               cln.a($$1, new crf($$4, $$5));
            }
         }
      }

      if ($$2.isEmpty()) {
         $$1.c("Enchantments");
      } else if (!$$1.a(cmu.up)) {
         $$1.a("Enchantments", $$2);
      }
   }

   private static void a(cre.a $$0, cmr $$1) {
      if (!$$1.b()) {
         sr $$2 = $$1.x();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sl $$4 = $$2.a($$3);
            kd.f.b(b($$4)).ifPresent($$2x -> $$0.accept($$2x, a($$4)));
         }
      }
   }

   private static void a(cre.a $$0, Iterable<cmr> $$1) {
      for (cmr $$2 : $$1) {
         a($$0, $$2);
      }
   }

   public static int a(Iterable<cmr> $$0, bkn $$1) {
      MutableInt $$2 = new MutableInt();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.intValue();
   }

   public static float a(cmr $$0, bmk $$1) {
      MutableFloat $$2 = new MutableFloat();
      a(($$2x, $$3) -> $$2.add($$2x.a($$3, $$1)), $$0);
      return $$2.floatValue();
   }

   public static float a(bmf $$0) {
      int $$1 = a(crg.t, $$0);
      return $$1 > 0 ? crs.e($$1) : 0.0F;
   }

   public static void a(bmf $$0, blp $$1) {
      cre.a $$2 = ($$2x, $$3) -> $$2x.b($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$1 instanceof cfb) {
         a($$2, $$0.eT());
      }
   }

   public static void b(bmf $$0, blp $$1) {
      cre.a $$2 = ($$2x, $$3) -> $$2x.a($$0, $$1, $$3);
      if ($$0 != null) {
         a($$2, $$0.bM());
      }

      if ($$0 instanceof cfb) {
         a($$2, $$0.eT());
      }
   }

   public static int a(crc $$0, bmf $$1) {
      Iterable<cmr> $$2 = $$0.a($$1).values();
      if ($$2 == null) {
         return 0;
      } else {
         int $$3 = 0;

         for (cmr $$4 : $$2) {
            int $$5 = a($$0, $$4);
            if ($$5 > $$3) {
               $$3 = $$5;
            }
         }

         return $$3;
      }
   }

   public static float b(bmf $$0) {
      return (float)a(crg.m, $$0) * 0.15F;
   }

   public static int c(bmf $$0) {
      return a(crg.q, $$0);
   }

   public static int d(bmf $$0) {
      return a(crg.r, $$0);
   }

   public static int e(bmf $$0) {
      return a(crg.f, $$0);
   }

   public static int f(bmf $$0) {
      return a(crg.i, $$0);
   }

   public static int g(bmf $$0) {
      return a(crg.u, $$0);
   }

   public static int b(cmr $$0) {
      return a(crg.C, $$0);
   }

   public static int c(cmr $$0) {
      return a(crg.D, $$0);
   }

   public static int h(bmf $$0) {
      return a(crg.s, $$0);
   }

   public static boolean i(bmf $$0) {
      return a(crg.g, $$0) > 0;
   }

   public static boolean j(bmf $$0) {
      return a(crg.j, $$0) > 0;
   }

   public static boolean k(bmf $$0) {
      return a(crg.l, $$0) > 0;
   }

   public static boolean d(cmr $$0) {
      return a(crg.k, $$0) > 0;
   }

   public static boolean e(cmr $$0) {
      return a(crg.M, $$0) > 0;
   }

   public static boolean f(cmr $$0) {
      return a(crg.v, $$0) > 0;
   }

   public static int g(cmr $$0) {
      return a(crg.E, $$0);
   }

   public static int h(cmr $$0) {
      return a(crg.G, $$0);
   }

   public static boolean i(cmr $$0) {
      return a(crg.H, $$0) > 0;
   }

   @Nullable
   public static Entry<blu, cmr> b(crc $$0, bmf $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   @Nullable
   public static Entry<blu, cmr> a(crc $$0, bmf $$1, Predicate<cmr> $$2) {
      Map<blu, cmr> $$3 = $$0.a($$1);
      if ($$3.isEmpty()) {
         return null;
      } else {
         List<Entry<blu, cmr>> $$4 = Lists.newArrayList();

         for (Entry<blu, cmr> $$5 : $$3.entrySet()) {
            cmr $$6 = $$5.getValue();
            if (!$$6.b() && a($$0, $$6) > 0 && $$2.test($$6)) {
               $$4.add($$5);
            }
         }

         return $$4.isEmpty() ? null : $$4.get($$1.eg().a($$4.size()));
      }
   }

   public static int a(aup $$0, int $$1, int $$2, cmr $$3) {
      cmm $$4 = $$3.d();
      int $$5 = $$4.c();
      if ($$5 <= 0) {
         return 0;
      } else {
         if ($$2 > 15) {
            $$2 = 15;
         }

         int $$6 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
         if ($$1 == 0) {
            return Math.max($$6 / 3, 1);
         } else {
            return $$1 == 1 ? $$6 * 2 / 3 + 1 : Math.max($$6, $$2 * 2);
         }
      }
   }

   public static cmr a(aup $$0, cmr $$1, int $$2, boolean $$3) {
      List<crf> $$4 = b($$0, $$1, $$2, $$3);
      boolean $$5 = $$1.a(cmu.qM);
      if ($$5) {
         $$1 = new cmr(cmu.up);
      }

      for (crf $$6 : $$4) {
         if ($$5) {
            cln.a($$1, $$6);
         } else {
            $$1.a($$6.a, $$6.b);
         }
      }

      return $$1;
   }

   public static List<crf> b(aup $$0, cmr $$1, int $$2, boolean $$3) {
      List<crf> $$4 = Lists.newArrayList();
      cmm $$5 = $$1.d();
      int $$6 = $$5.c();
      if ($$6 <= 0) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$6 / 4 + 1) + $$0.a($$6 / 4 + 1);
         float $$7 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = aui.a(Math.round((float)$$2 + (float)$$2 * $$7), 1, Integer.MAX_VALUE);
         List<crf> $$8 = a($$2, $$1, $$3);
         if (!$$8.isEmpty()) {
            bii.a($$0, $$8).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$8, ac.a($$4));
               }

               if ($$8.isEmpty()) {
                  break;
               }

               bii.a($$0, $$8).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<crf> $$0, crf $$1) {
      Iterator<crf> $$2 = $$0.iterator();

      while ($$2.hasNext()) {
         if (!$$1.a.b($$2.next().a)) {
            $$2.remove();
         }
      }
   }

   public static boolean a(Collection<crc> $$0, crc $$1) {
      for (crc $$2 : $$0) {
         if (!$$2.b($$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<crf> a(int $$0, cmr $$1, boolean $$2) {
      List<crf> $$3 = Lists.newArrayList();
      cmm $$4 = $$1.d();
      boolean $$5 = $$1.a(cmu.qM);

      for (crc $$6 : kd.f) {
         if ((!$$6.b() || $$2) && $$6.i() && ($$6.e.a($$4) || $$5)) {
            for (int $$7 = $$6.a(); $$7 > $$6.e() - 1; $$7--) {
               if ($$0 >= $$6.a($$7) && $$0 <= $$6.b($$7)) {
                  $$3.add(new crf($$6, $$7));
                  break;
               }
            }
         }
      }

      return $$3;
   }

   @FunctionalInterface
   interface a {
      void accept(crc var1, int var2);
   }
}
