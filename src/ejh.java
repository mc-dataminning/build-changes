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

public class ejh {
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
   private final List<ejh.a> l = Lists.newArrayList();
   private final List<ejh.d> m = Lists.newArrayList();
   private jg n = jg.g;
   private String o = "?";

   public jg a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(cyx $$0, ib $$1, jg $$2, boolean $$3, @Nullable dby $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ib $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ejh.c> $$6 = Lists.newArrayList();
         List<ejh.c> $$7 = Lists.newArrayList();
         List<ejh.c> $$8 = Lists.newArrayList();
         ib $$9 = new ib(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ib $$10 = new ib(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ib $$11 : ib.a($$9, $$10)) {
            ib $$12 = $$11.b($$9);
            doz $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dmf $$14 = $$0.c_($$11);
               ejh.c $$15;
               if ($$14 != null) {
                  $$15 = new ejh.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new ejh.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ejh.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ejh.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ejh.c $$0, List<ejh.c> $$1, List<ejh.c> $$2, List<ejh.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(cym.a, ib.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ejh.c> a(List<ejh.c> $$0, List<ejh.c> $$1, List<ejh.c> $$2) {
      Comparator<ejh.c> $$3 = Comparator.<ejh.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ejh.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cyx $$0, ib $$1, ib $$2) {
      List<bpv> $$3 = $$0.a(bpv.class, erv.a($$1, $$2), $$0x -> !($$0x instanceof cjt));
      this.m.clear();

      for (bpv $$4 : $$3) {
         esa $$5 = new esa($$4.dr() - (double)$$1.u(), $$4.dt() - (double)$$1.v(), $$4.dx() - (double)$$1.w());
         tm $$6 = new tm();
         $$4.e($$6);
         ib $$7;
         if ($$4 instanceof cfy) {
            $$7 = ((cfy)$$4).D().b($$1);
         } else {
            $$7 = ib.a($$5);
         }

         this.m.add(new ejh.d($$5, $$7, $$6.h()));
      }
   }

   public List<ejh.c> a(ib $$0, ejd $$1, dby $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<ejh.c> a(ib $$0, ejd $$1, dby $$2, boolean $$3) {
      ObjectArrayList<ejh.c> $$4 = new ObjectArrayList();
      eez $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ejh.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            ib $$7 = $$3 ? a($$1, $$6.a).a((jg)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ejh.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ib a(ejd $$0, ib $$1, ejd $$2, ib $$3) {
      ib $$4 = a($$0, $$1);
      ib $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ib a(ejd $$0, ib $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(czm $$0, ib $$1, ib $$2, ejd $$3, axr $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ejh.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eez $$7 = $$3.g();
            List<ib> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ib> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ib, tm>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ejh.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ib $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eks $$20 = $$3.j() ? $$0.b_($$19) : null;
                  doz $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dmf $$22 = $$0.c_($$19);
                     bnr.a_($$22);
                     $$0.a($$19, dca.hW.n(), 20);
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
                        dmf $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof boi) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dgo) {
                           ((dgo)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ih[] $$25 = new ih[]{ih.b, ih.c, ih.f, ih.d, ih.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<ib> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  ib $$27 = $$26.next();
                  eks $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ib $$30 = $$27.a($$25[$$29]);
                     eks $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     doz $$32 = $$0.a_($$27);
                     dby $$33 = $$32.b();
                     if ($$33 instanceof dgo) {
                        ((dgo)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  esj $$34 = new esd($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<ib, tm> $$38 : $$10) {
                     ib $$39 = (ib)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<ib, tm> $$40 : $$10) {
                  ib $$41 = (ib)$$40.getFirst();
                  if (!$$3.h()) {
                     doz $$42 = $$0.a_($$41);
                     doz $$43 = dby.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dmf $$44 = $$0.c_($$41);
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

   public static void a(cyy $$0, int $$1, esj $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         ib $$9 = new ib($$3 + $$6, $$4 + $$7, $$5 + $$8);
         ib $$10 = $$9.a($$5x);
         doz $$11 = $$0.a_($$9);
         doz $$12 = $$0.a_($$10);
         doz $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         doz $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<ejh.c> a(czm $$0, ib $$1, ib $$2, ejd $$3, List<ejh.c> $$4) {
      List<ejh.c> $$5 = new ArrayList<>();
      List<ejh.c> $$6 = new ArrayList<>();

      for (ejh.c $$7 : $$4) {
         ib $$8 = a($$3, $$7.a).a((jg)$$1);
         ejh.c $$9 = new ejh.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<eje> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (eje $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(czm $$0, ib $$1, dgu $$2, dik $$3, ib $$4, @Nullable eez $$5, boolean $$6) {
      for (ejh.d $$7 : this.m) {
         ib $$8 = a($$7.b, $$2, $$3, $$4).a((jg)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tm $$9 = $$7.c.h();
            esa $$10 = a($$7.a, $$2, $$3, $$4);
            esa $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ts $$12 = new ts();
            $$12.add(tn.a($$11.c));
            $$12.add(tn.a($$11.d));
            $$12.add(tn.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dC();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dE());
               if ($$6 && $$5x instanceof bqq) {
                  ((bqq)$$5x).a($$0, $$0.d_(ib.a($$11)), bqs.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bpv> a(czm $$0, tm $$1) {
      try {
         return bqb.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public jg a(dik $$0) {
      switch ($$0) {
         case d:
         case b:
            return new jg(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ib a(ib $$0, dgu $$1, dik $$2, ib $$3) {
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
            return new ib($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new ib($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new ib($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new ib($$4, $$5, $$6) : $$0;
      }
   }

   public static esa a(esa $$0, dgu $$1, dik $$2, ib $$3) {
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
            return new esa((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new esa((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new esa((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new esa($$4, $$5, $$6) : $$0;
      }
   }

   public ib a(ib $$0, dgu $$1, dik $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ib a(ib $$0, dgu $$1, dik $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dgu.c ? $$3 : 0;
      int $$6 = $$1 == dgu.b ? $$4 : 0;
      ib $$7 = $$0;
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

   public eez b(ejd $$0, ib $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eez a(ib $$0, dik $$1, ib $$2, dgu $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eez a(ib $$0, dik $$1, ib $$2, dgu $$3, jg $$4) {
      jg $$5 = $$4.c(-1, -1, -1);
      ib $$6 = a(ib.c, $$3, $$1, $$2);
      ib $$7 = a(ib.c.a($$5), $$3, $$1, $$2);
      return eez.a($$6, $$7).a((jg)$$0);
   }

   public tm a(tm $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ts());
         $$0.a("palette", new ts());
      } else {
         List<ejh.b> $$1 = Lists.newArrayList();
         ejh.b $$2 = new ejh.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ejh.b());
         }

         ts $$4 = new ts();
         List<ejh.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ejh.c $$7 = $$5.get($$6);
            tm $$8 = new tm();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ejh.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ts $$12 = new ts();

            for (doz $$13 : $$2) {
               $$12.add(ub.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ts $$14 = new ts();

            for (ejh.b $$15 : $$1) {
               ts $$16 = new ts();

               for (doz $$17 : $$15) {
                  $$16.add(ub.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ts $$18 = new ts();

      for (ejh.d $$19 : this.m) {
         tm $$20 = new tm();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return ub.f($$0);
   }

   public void a(im<dby> $$0, tm $$1) {
      this.l.clear();
      this.m.clear();
      ts $$2 = $$1.c("size", 3);
      this.n = new jg($$2.e(0), $$2.e(1), $$2.e(2));
      ts $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ts $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ts $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         tm $$8 = $$6.a($$7);
         ts $$9 = $$8.c("pos", 6);
         esa $$10 = new esa($$9.h(0), $$9.h(1), $$9.h(2));
         ts $$11 = $$8.c("blockPos", 3);
         ib $$12 = new ib($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            tm $$13 = $$8.p("nbt");
            this.m.add(new ejh.d($$10, $$12, $$13));
         }
      }
   }

   private void a(im<dby> $$0, ts $$1, ts $$2) {
      ejh.b $$3 = new ejh.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(ub.a($$0, $$1.a($$4)), $$4);
      }

      List<ejh.c> $$5 = Lists.newArrayList();
      List<ejh.c> $$6 = Lists.newArrayList();
      List<ejh.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tm $$9 = $$2.a($$8);
         ts $$10 = $$9.c("pos", 3);
         ib $$11 = new ib($$10.e(0), $$10.e(1), $$10.e(2));
         doz $$12 = $$3.a($$9.h("state"));
         tm $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ejh.c $$15 = new ejh.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ejh.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new ejh.a($$16));
   }

   private ts a(int... $$0) {
      ts $$1 = new ts();

      for (int $$2 : $$0) {
         $$1.add(tr.a($$2));
      }

      return $$1;
   }

   private ts a(double... $$0) {
      ts $$1 = new ts();

      for (double $$2 : $$0) {
         $$1.add(tn.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<ejh.c> a;
      private final Map<dby, List<ejh.c>> b = Maps.newHashMap();

      a(List<ejh.c> $$0) {
         this.a = $$0;
      }

      public List<ejh.c> a() {
         return this.a;
      }

      public List<ejh.c> a(dby $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<doz> {
      public static final doz a = dca.a.n();
      private final ir<doz> b = new ir<>(16);
      private int c;

      public int a(doz $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public doz a(int $$0) {
         doz $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<doz> iterator() {
         return this.b.iterator();
      }

      public void a(doz $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(ib a, doz b, @Nullable tm c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final esa a;
      public final ib b;
      public final tm c;

      public d(esa $$0, ib $$1, tm $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
