import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;

public class emi extends ekw<enx> {
   private static final int a = 19;

   public emi(Codec<enx> $$0) {
      super($$0);
   }

   public static boolean b(dkp $$0, iw $$1) {
      return $$0.a($$1, $$0x -> $$0x.a(dnq.fx));
   }

   public static boolean c(dkp $$0, iw $$1) {
      return $$0.a($$1, $$0x -> $$0x.l() || $$0x.a(axn.Q));
   }

   private static void b(dkr $$0, iw $$1, ebq $$2) {
      $$0.a($$1, $$2, 19);
   }

   public static boolean d(dkp $$0, iw $$1) {
      return $$0.a($$1, $$0x -> $$0x.l() || $$0x.a(axn.ct));
   }

   private boolean a(dli $$0, bai $$1, iw $$2, BiConsumer<iw, ebq> $$3, BiConsumer<iw, ebq> $$4, eon.b $$5, enx $$6) {
      int $$7 = $$6.d.a($$1);
      int $$8 = $$6.f.a($$1, $$7, $$6);
      int $$9 = $$7 - $$8;
      int $$10 = $$6.f.a($$1, $$9);
      iw $$11 = $$6.g.<iw>map($$2x -> $$2x.a($$2, $$1)).orElse($$2);
      int $$12 = Math.min($$2.v(), $$11.v());
      int $$13 = Math.max($$2.v(), $$11.v()) + $$7 + 1;
      if ($$12 >= $$0.K_() + 1 && $$13 <= $$0.ao() + 1) {
         OptionalInt $$14 = $$6.h.c();
         int $$15 = this.a($$0, $$7, $$11, $$6);
         if ($$15 >= $$7 || !$$14.isEmpty() && $$15 >= $$14.getAsInt()) {
            if ($$6.g.isPresent() && !$$6.g.get().a($$0, $$3, $$1, $$2, $$11, $$6)) {
               return false;
            } else {
               List<eon.a> $$16 = $$6.d.a($$0, $$4, $$1, $$15, $$11, $$6);
               $$16.forEach($$7x -> $$6.f.a($$0, $$5, $$1, $$6, $$15, $$7x, $$8, $$10));
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int a(dkp $$0, int $$1, iw $$2, enx $$3) {
      iw.a $$4 = new iw.a();

      for (int $$5 = 0; $$5 <= $$1 + 1; $$5++) {
         int $$6 = $$3.h.a($$1, $$5);

         for (int $$7 = -$$6; $$7 <= $$6; $$7++) {
            for (int $$8 = -$$6; $$8 <= $$6; $$8++) {
               $$4.a($$2, $$7, $$5, $$8);
               if (!$$3.d.b($$0, $$4) || !$$3.j && b($$0, $$4)) {
                  return $$5 - 2;
               }
            }
         }
      }

      return $$1;
   }

   @Override
   protected void a(dkr $$0, iw $$1, ebq $$2) {
      b($$0, $$1, $$2);
   }

   @Override
   public final boolean a(eky<enx> $$0) {
      final dli $$1 = $$0.b();
      bai $$2 = $$0.d();
      iw $$3 = $$0.e();
      enx $$4 = $$0.f();
      Set<iw> $$5 = Sets.newHashSet();
      Set<iw> $$6 = Sets.newHashSet();
      final Set<iw> $$7 = Sets.newHashSet();
      Set<iw> $$8 = Sets.newHashSet();
      BiConsumer<iw, ebq> $$9 = ($$2x, $$3x) -> {
         $$5.add($$2x.j());
         $$1.a($$2x, $$3x, 19);
      };
      BiConsumer<iw, ebq> $$10 = ($$2x, $$3x) -> {
         $$6.add($$2x.j());
         $$1.a($$2x, $$3x, 19);
      };
      eon.b $$11 = new eon.b() {
         @Override
         public void a(iw $$0, ebq $$1x) {
            $$7.add($$0.j());
            $$1.a($$0, $$1, 19);
         }

         @Override
         public boolean a(iw $$0) {
            return $$7.contains($$0);
         }
      };
      BiConsumer<iw, ebq> $$12 = ($$2x, $$3x) -> {
         $$8.add($$2x.j());
         $$1.a($$2x, $$3x, 19);
      };
      boolean $$13 = this.a($$1, $$2, $$3, $$9, $$10, $$11, $$4);
      if ($$13 && (!$$6.isEmpty() || !$$7.isEmpty())) {
         if (!$$4.i.isEmpty()) {
            epx.a $$14 = new epx.a($$1, $$12, $$2, $$6, $$7, $$5);
            $$4.i.forEach($$1x -> $$1x.a($$14));
         }

         return esf.a(Iterables.concat($$5, $$6, $$7, $$8)).map($$4x -> {
            fgl $$5x = a($$1, $$4x, $$6, $$8, $$5);
            ewp.a($$1, 3, $$5x, $$4x.h(), $$4x.i(), $$4x.j());
            return true;
         }).orElse(false);
      } else {
         return false;
      }
   }

   private static fgl a(dkk $$0, esf $$1, Set<iw> $$2, Set<iw> $$3, Set<iw> $$4) {
      fgl $$5 = new fgf($$1.d(), $$1.e(), $$1.f());
      int $$6 = 7;
      List<Set<iw>> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < 7; $$8++) {
         $$7.add(Sets.newHashSet());
      }

      for (iw $$9 : Lists.newArrayList(Sets.union($$3, $$4))) {
         if ($$1.b($$9)) {
            $$5.c($$9.u() - $$1.h(), $$9.v() - $$1.i(), $$9.w() - $$1.j());
         }
      }

      iw.a $$10 = new iw.a();
      int $$11 = 0;
      $$7.get(0).addAll($$2);

      while (true) {
         while ($$11 >= 7 || !$$7.get($$11).isEmpty()) {
            if ($$11 >= 7) {
               return $$5;
            }

            Iterator<iw> $$12 = $$7.get($$11).iterator();
            iw $$13 = $$12.next();
            $$12.remove();
            if ($$1.b($$13)) {
               if ($$11 != 0) {
                  ebq $$14 = $$0.a_($$13);
                  b($$0, $$13, $$14.b(ecg.aF, Integer.valueOf($$11)));
               }

               $$5.c($$13.u() - $$1.h(), $$13.v() - $$1.i(), $$13.w() - $$1.j());

               for (jc $$15 : jc.values()) {
                  $$10.a($$13, $$15);
                  if ($$1.b($$10)) {
                     int $$16 = $$10.u() - $$1.h();
                     int $$17 = $$10.v() - $$1.i();
                     int $$18 = $$10.w() - $$1.j();
                     if (!$$5.b($$16, $$17, $$18)) {
                        ebq $$19 = $$0.a_($$10);
                        OptionalInt $$20 = dse.q($$19);
                        if (!$$20.isEmpty()) {
                           int $$21 = Math.min($$20.getAsInt(), $$11 + 1);
                           if ($$21 < 7) {
                              $$7.get($$21).add($$10.j());
                              $$11 = Math.min($$11, $$21);
                           }
                        }
                     }
                  }
               }
            }
         }

         $$11++;
      }
   }

   public static List<iw> a(epx.a $$0) {
      List<iw> $$1 = Lists.newArrayList();
      List<iw> $$2 = $$0.e();
      List<iw> $$3 = $$0.c();
      if ($$2.isEmpty()) {
         $$1.addAll($$3);
      } else if (!$$3.isEmpty() && $$2.get(0).v() == $$3.get(0).v()) {
         $$1.addAll($$3);
         $$1.addAll($$2);
      } else {
         $$1.addAll($$2);
      }

      return $$1;
   }
}
