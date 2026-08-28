import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class emj {
   public static final String a = "palette";
   public static final String b = "palettes";
   public static final String c = "entities";
   public static final String d = "blocks";
   public static final String e = "pos";
   public static final String f = "state";
   public static final String g = "nbt";
   public static final String h = "pos";
   public static final String i = "blockPos";
   public static final String j = "nbt";
   public static final String k = "size";
   private final List<emj.a> l = Lists.newArrayList();
   private final List<emj.d> m = Lists.newArrayList();
   private kd n = kd.g;
   private String o = "?";

   public kd a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dbx $$0, iz $$1, kd $$2, boolean $$3, @Nullable dey $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         iz $$5 = $$1.a($$2).b(-1, -1, -1);
         List<emj.c> $$6 = Lists.newArrayList();
         List<emj.c> $$7 = Lists.newArrayList();
         List<emj.c> $$8 = Lists.newArrayList();
         iz $$9 = new iz(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         iz $$10 = new iz(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (iz $$11 : iz.c($$9, $$10)) {
            iz $$12 = $$11.b($$9);
            dsb $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dpg $$14 = $$0.c_($$11);
               emj.c $$15;
               if ($$14 != null) {
                  $$15 = new emj.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new emj.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<emj.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new emj.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(emj.c $$0, List<emj.c> $$1, List<emj.c> $$2, List<emj.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(dbm.a, iz.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<emj.c> a(List<emj.c> $$0, List<emj.c> $$1, List<emj.c> $$2) {
      Comparator<emj.c> $$3 = Comparator.<emj.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<emj.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dbx $$0, iz $$1, iz $$2) {
      List<bst> $$3 = $$0.a(bst.class, evl.a($$1, $$2), $$0x -> !($$0x instanceof cmw));
      this.m.clear();

      for (bst $$4 : $$3) {
         evq $$5 = new evq($$4.du() - (double)$$1.u(), $$4.dw() - (double)$$1.v(), $$4.dA() - (double)$$1.w());
         ur $$6 = new ur();
         $$4.e($$6);
         iz $$7;
         if ($$4 instanceof cjb) {
            $$7 = ((cjb)$$4).D().b($$1);
         } else {
            $$7 = iz.a($$5);
         }

         this.m.add(new emj.d($$5, $$7, $$6.i()));
      }
   }

   public List<emj.c> a(iz $$0, emf $$1, dey $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<emj.c> a(iz $$0, emf $$1, dey $$2, boolean $$3) {
      ObjectArrayList<emj.c> $$4 = new ObjectArrayList();
      eib $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (emj.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            iz $$7 = $$3 ? a($$1, $$6.a).a((kd)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new emj.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public iz a(emf $$0, iz $$1, emf $$2, iz $$3) {
      iz $$4 = a($$0, $$1);
      iz $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static iz a(emf $$0, iz $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dcm $$0, iz $$1, iz $$2, emf $$3, azg $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<emj.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eib $$7 = $$3.g();
            List<iz> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<iz> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<iz, ur>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (emj.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               iz $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  enu $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dsb $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dpg $$22 = $$0.c_($$19);
                     bqk.a_($$22);
                     $$0.a($$19, dfa.hW.o(), 20);
                  }

                  if ($$0.a($$19, $$21, $$5)) {
                     $$11 = Math.min($$11, $$19.u());
                     $$12 = Math.min($$12, $$19.v());
                     $$13 = Math.min($$13, $$19.w());
                     $$14 = Math.max($$14, $$19.u());
                     $$15 = Math.max($$15, $$19.v());
                     $$16 = Math.max($$16, $$19.w());
                     $$10.add(Pair.of($$19, $$18.c));
                     if ($$18.c != null) {
                        dpg $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof brb) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof djp) {
                           ((djp)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            je[] $$25 = new je[]{je.b, je.c, je.f, je.d, je.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<iz> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  iz $$27 = $$26.next();
                  enu $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     iz $$30 = $$27.a($$25[$$29]);
                     enu $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dsb $$32 = $$0.a_($$27);
                     dey $$33 = $$32.b();
                     if ($$33 instanceof djp) {
                        ((djp)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  evz $$34 = new evt($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<iz, ur> $$38 : $$10) {
                     iz $$39 = (iz)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<iz, ur> $$40 : $$10) {
                  iz $$41 = (iz)$$40.getFirst();
                  if (!$$3.h()) {
                     dsb $$42 = $$0.a_($$41);
                     dsb $$43 = dey.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dpg $$44 = $$0.c_($$41);
                     if ($$44 != null) {
                        $$44.e();
                     }
                  }
               }
            }

            if (!$$3.f()) {
               this.a($$0, $$1, $$3.c(), $$3.d(), $$3.e(), $$7, $$3.k());
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void a(dby $$0, int $$1, evz $$2, iz $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dby $$0, int $$1, evz $$2, int $$3, int $$4, int $$5) {
      iz.a $$6 = new iz.a();
      iz.a $$7 = new iz.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dsb $$11 = $$0.a_($$6);
         dsb $$12 = $$0.a_($$7);
         dsb $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dsb $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<emj.c> a(dcm $$0, iz $$1, iz $$2, emf $$3, List<emj.c> $$4) {
      List<emj.c> $$5 = new ArrayList<>();
      List<emj.c> $$6 = new ArrayList<>();

      for (emj.c $$7 : $$4) {
         iz $$8 = a($$3, $$7.a).a((kd)$$1);
         emj.c $$9 = new emj.c($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<emg> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (emg $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dcm $$0, iz $$1, djv $$2, dll $$3, iz $$4, @Nullable eib $$5, boolean $$6) {
      for (emj.d $$7 : this.m) {
         iz $$8 = a($$7.b, $$2, $$3, $$4).a((kd)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ur $$9 = $$7.c.i();
            evq $$10 = a($$7.a, $$2, $$3, $$4);
            evq $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ux $$12 = new ux();
            $$12.add(us.a($$11.c));
            $$12.add(us.a($$11.d));
            $$12.add(us.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dF();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dH());
               if ($$6 && $$5x instanceof btq) {
                  ((btq)$$5x).a($$0, $$0.d_(iz.a($$11)), bts.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bst> a(dcm $$0, ur $$1) {
      try {
         return bsz.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kd a(dll $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kd(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static iz a(iz $$0, djv $$1, dll $$2, iz $$3) {
      int $$4 = $$0.u();
      int $$5 = $$0.v();
      int $$6 = $$0.w();
      boolean $$7 = true;
      switch ($$1) {
         case b:
            $$6 = -$$6;
            break;
         case c:
            $$4 = -$$4;
            break;
         default:
            $$7 = false;
      }

      int $$8 = $$3.u();
      int $$9 = $$3.w();
      switch ($$2) {
         case d:
            return new iz($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new iz($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new iz($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new iz($$4, $$5, $$6) : $$0;
      }
   }

   public static evq a(evq $$0, djv $$1, dll $$2, iz $$3) {
      double $$4 = $$0.c;
      double $$5 = $$0.d;
      double $$6 = $$0.e;
      boolean $$7 = true;
      switch ($$1) {
         case b:
            $$6 = 1.0 - $$6;
            break;
         case c:
            $$4 = 1.0 - $$4;
            break;
         default:
            $$7 = false;
      }

      int $$8 = $$3.u();
      int $$9 = $$3.w();
      switch ($$2) {
         case d:
            return new evq((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new evq((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new evq((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new evq($$4, $$5, $$6) : $$0;
      }
   }

   public iz a(iz $$0, djv $$1, dll $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static iz a(iz $$0, djv $$1, dll $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == djv.c ? $$3 : 0;
      int $$6 = $$1 == djv.b ? $$4 : 0;
      iz $$7 = $$0;
      switch ($$2) {
         case d:
            $$7 = $$0.b($$6, 0, $$3 - $$5);
            break;
         case b:
            $$7 = $$0.b($$4 - $$6, 0, $$5);
            break;
         case c:
            $$7 = $$0.b($$3 - $$5, 0, $$4 - $$6);
            break;
         case a:
            $$7 = $$0.b($$5, 0, $$6);
      }

      return $$7;
   }

   public eib b(emf $$0, iz $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eib a(iz $$0, dll $$1, iz $$2, djv $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eib a(iz $$0, dll $$1, iz $$2, djv $$3, kd $$4) {
      kd $$5 = $$4.c(-1, -1, -1);
      iz $$6 = a(iz.c, $$3, $$1, $$2);
      iz $$7 = a(iz.c.a($$5), $$3, $$1, $$2);
      return eib.a($$6, $$7).a((kd)$$0);
   }

   public ur a(ur $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ux());
         $$0.a("palette", new ux());
      } else {
         List<emj.b> $$1 = Lists.newArrayList();
         emj.b $$2 = new emj.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new emj.b());
         }

         ux $$4 = new ux();
         List<emj.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            emj.c $$7 = $$5.get($$6);
            ur $$8 = new ur();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               emj.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ux $$12 = new ux();

            for (dsb $$13 : $$2) {
               $$12.add(vg.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ux $$14 = new ux();

            for (emj.b $$15 : $$1) {
               ux $$16 = new ux();

               for (dsb $$17 : $$15) {
                  $$16.add(vg.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ux $$18 = new ux();

      for (emj.d $$19 : this.m) {
         ur $$20 = new ur();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return vg.e($$0);
   }

   public void a(jj<dey> $$0, ur $$1) {
      this.l.clear();
      this.m.clear();
      ux $$2 = $$1.c("size", 3);
      this.n = new kd($$2.e(0), $$2.e(1), $$2.e(2));
      ux $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ux $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ux $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         ur $$8 = $$6.a($$7);
         ux $$9 = $$8.c("pos", 6);
         evq $$10 = new evq($$9.h(0), $$9.h(1), $$9.h(2));
         ux $$11 = $$8.c("blockPos", 3);
         iz $$12 = new iz($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ur $$13 = $$8.p("nbt");
            this.m.add(new emj.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jj<dey> $$0, ux $$1, ux $$2) {
      emj.b $$3 = new emj.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(vg.a($$0, $$1.a($$4)), $$4);
      }

      List<emj.c> $$5 = Lists.newArrayList();
      List<emj.c> $$6 = Lists.newArrayList();
      List<emj.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ur $$9 = $$2.a($$8);
         ux $$10 = $$9.c("pos", 3);
         iz $$11 = new iz($$10.e(0), $$10.e(1), $$10.e(2));
         dsb $$12 = $$3.a($$9.h("state"));
         ur $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         emj.c $$15 = new emj.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<emj.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new emj.a($$16));
   }

   private ux a(int... $$0) {
      ux $$1 = new ux();

      for (int $$2 : $$0) {
         $$1.add(uw.a($$2));
      }

      return $$1;
   }

   private ux a(double... $$0) {
      ux $$1 = new ux();

      for (double $$2 : $$0) {
         $$1.add(us.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<emj.c> a;
      private final Map<dey, List<emj.c>> b = Maps.newHashMap();

      a(List<emj.c> $$0) {
         this.a = $$0;
      }

      public List<emj.c> a() {
         return this.a;
      }

      public List<emj.c> a(dey $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dsb> {
      public static final dsb a = dfa.a.o();
      private final jo<dsb> b = new jo<>(16);
      private int c;

      public int a(dsb $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dsb a(int $$0) {
         dsb $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dsb> iterator() {
         return this.b.iterator();
      }

      public void a(dsb $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(iz a, dsb b, @Nullable ur c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final evq a;
      public final iz b;
      public final ur c;

      public d(evq $$0, iz $$1, ur $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
