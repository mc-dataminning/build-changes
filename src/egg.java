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

public class egg {
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
   private final List<egg.a> l = Lists.newArrayList();
   private final List<egg.d> m = Lists.newArrayList();
   private jf n = jf.g;
   private String o = "?";

   public jf a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(cwe $$0, ib $$1, jf $$2, boolean $$3, @Nullable czf $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ib $$5 = $$1.a($$2).b(-1, -1, -1);
         List<egg.c> $$6 = Lists.newArrayList();
         List<egg.c> $$7 = Lists.newArrayList();
         List<egg.c> $$8 = Lists.newArrayList();
         ib $$9 = new ib(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ib $$10 = new ib(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ib $$11 : ib.a($$9, $$10)) {
            ib $$12 = $$11.b($$9);
            dme $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               djl $$14 = $$0.c_($$11);
               egg.c $$15;
               if ($$14 != null) {
                  $$15 = new egg.c($$12, $$13, $$14.c($$0.I_()));
               } else {
                  $$15 = new egg.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<egg.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new egg.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(egg.c $$0, List<egg.c> $$1, List<egg.c> $$2, List<egg.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(cvt.a, ib.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<egg.c> a(List<egg.c> $$0, List<egg.c> $$1, List<egg.c> $$2) {
      Comparator<egg.c> $$3 = Comparator.<egg.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<egg.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cwe $$0, ib $$1, ib $$2) {
      List<bof> $$3 = $$0.a(bof.class, eoq.a($$1, $$2), $$0x -> !($$0x instanceof cia));
      this.m.clear();

      for (bof $$4 : $$3) {
         eov $$5 = new eov($$4.do() - (double)$$1.u(), $$4.dq() - (double)$$1.v(), $$4.du() - (double)$$1.w());
         sy $$6 = new sy();
         $$4.e($$6);
         ib $$7;
         if ($$4 instanceof ceg) {
            $$7 = ((ceg)$$4).E().b($$1);
         } else {
            $$7 = ib.a($$5);
         }

         this.m.add(new egg.d($$5, $$7, $$6.h()));
      }
   }

   public List<egg.c> a(ib $$0, egc $$1, czf $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<egg.c> a(ib $$0, egc $$1, czf $$2, boolean $$3) {
      ObjectArrayList<egg.c> $$4 = new ObjectArrayList();
      eby $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (egg.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            ib $$7 = $$3 ? a($$1, $$6.a).a((jf)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new egg.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ib a(egc $$0, ib $$1, egc $$2, ib $$3) {
      ib $$4 = a($$0, $$1);
      ib $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ib a(egc $$0, ib $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(cwt $$0, ib $$1, ib $$2, egc $$3, awt $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<egg.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eby $$7 = $$3.g();
            List<ib> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ib> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ib, sy>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (egg.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ib $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  ehr $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dme $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     djl $$22 = $$0.c_($$19);
                     bmc.a_($$22);
                     $$0.a($$19, czh.hW.o(), 20);
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
                        djl $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bmt) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c, $$0.I_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof ddv) {
                           ((ddv)$$21.b()).a($$0, $$19, $$21, $$20);
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
                  ehr $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ib $$30 = $$27.a($$25[$$29]);
                     ehr $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dme $$32 = $$0.a_($$27);
                     czf $$33 = $$32.b();
                     if ($$33 instanceof ddv) {
                        ((ddv)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  epe $$34 = new eoy($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<ib, sy> $$38 : $$10) {
                     ib $$39 = (ib)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<ib, sy> $$40 : $$10) {
                  ib $$41 = (ib)$$40.getFirst();
                  if (!$$3.h()) {
                     dme $$42 = $$0.a_($$41);
                     dme $$43 = czf.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     djl $$44 = $$0.c_($$41);
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

   public static void a(cwf $$0, int $$1, epe $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         ib $$9 = new ib($$3 + $$6, $$4 + $$7, $$5 + $$8);
         ib $$10 = $$9.a($$5x);
         dme $$11 = $$0.a_($$9);
         dme $$12 = $$0.a_($$10);
         dme $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dme $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<egg.c> a(cwt $$0, ib $$1, ib $$2, egc $$3, List<egg.c> $$4) {
      List<egg.c> $$5 = new ArrayList<>();
      List<egg.c> $$6 = new ArrayList<>();

      for (egg.c $$7 : $$4) {
         ib $$8 = a($$3, $$7.a).a((jf)$$1);
         egg.c $$9 = new egg.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<egd> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (egd $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(cwt $$0, ib $$1, deb $$2, dfr $$3, ib $$4, @Nullable eby $$5, boolean $$6) {
      for (egg.d $$7 : this.m) {
         ib $$8 = a($$7.b, $$2, $$3, $$4).a((jf)$$1);
         if ($$5 == null || $$5.b($$8)) {
            sy $$9 = $$7.c.h();
            eov $$10 = a($$7.a, $$2, $$3, $$4);
            eov $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            te $$12 = new te();
            $$12.add(sz.a($$11.c));
            $$12.add(sz.a($$11.d));
            $$12.add(sz.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dz();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dB());
               if ($$6 && $$5x instanceof boz) {
                  ((boz)$$5x).a($$0, $$0.d_(ib.a($$11)), bpb.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bof> a(cwt $$0, sy $$1) {
      try {
         return bol.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public jf a(dfr $$0) {
      switch ($$0) {
         case d:
         case b:
            return new jf(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ib a(ib $$0, deb $$1, dfr $$2, ib $$3) {
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

   public static eov a(eov $$0, deb $$1, dfr $$2, ib $$3) {
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
            return new eov((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new eov((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new eov((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new eov($$4, $$5, $$6) : $$0;
      }
   }

   public ib a(ib $$0, deb $$1, dfr $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ib a(ib $$0, deb $$1, dfr $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == deb.c ? $$3 : 0;
      int $$6 = $$1 == deb.b ? $$4 : 0;
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

   public eby b(egc $$0, ib $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eby a(ib $$0, dfr $$1, ib $$2, deb $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eby a(ib $$0, dfr $$1, ib $$2, deb $$3, jf $$4) {
      jf $$5 = $$4.c(-1, -1, -1);
      ib $$6 = a(ib.c, $$3, $$1, $$2);
      ib $$7 = a(ib.c.a($$5), $$3, $$1, $$2);
      return eby.a($$6, $$7).a((jf)$$0);
   }

   public sy a(sy $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new te());
         $$0.a("palette", new te());
      } else {
         List<egg.b> $$1 = Lists.newArrayList();
         egg.b $$2 = new egg.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new egg.b());
         }

         te $$4 = new te();
         List<egg.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            egg.c $$7 = $$5.get($$6);
            sy $$8 = new sy();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               egg.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            te $$12 = new te();

            for (dme $$13 : $$2) {
               $$12.add(tn.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            te $$14 = new te();

            for (egg.b $$15 : $$1) {
               te $$16 = new te();

               for (dme $$17 : $$15) {
                  $$16.add(tn.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      te $$18 = new te();

      for (egg.d $$19 : this.m) {
         sy $$20 = new sy();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return tn.g($$0);
   }

   public void a(im<czf> $$0, sy $$1) {
      this.l.clear();
      this.m.clear();
      te $$2 = $$1.c("size", 3);
      this.n = new jf($$2.e(0), $$2.e(1), $$2.e(2));
      te $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         te $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      te $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         sy $$8 = $$6.a($$7);
         te $$9 = $$8.c("pos", 6);
         eov $$10 = new eov($$9.h(0), $$9.h(1), $$9.h(2));
         te $$11 = $$8.c("blockPos", 3);
         ib $$12 = new ib($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            sy $$13 = $$8.p("nbt");
            this.m.add(new egg.d($$10, $$12, $$13));
         }
      }
   }

   private void a(im<czf> $$0, te $$1, te $$2) {
      egg.b $$3 = new egg.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(tn.a($$0, $$1.a($$4)), $$4);
      }

      List<egg.c> $$5 = Lists.newArrayList();
      List<egg.c> $$6 = Lists.newArrayList();
      List<egg.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         sy $$9 = $$2.a($$8);
         te $$10 = $$9.c("pos", 3);
         ib $$11 = new ib($$10.e(0), $$10.e(1), $$10.e(2));
         dme $$12 = $$3.a($$9.h("state"));
         sy $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         egg.c $$15 = new egg.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<egg.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new egg.a($$16));
   }

   private te a(int... $$0) {
      te $$1 = new te();

      for (int $$2 : $$0) {
         $$1.add(td.a($$2));
      }

      return $$1;
   }

   private te a(double... $$0) {
      te $$1 = new te();

      for (double $$2 : $$0) {
         $$1.add(sz.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<egg.c> a;
      private final Map<czf, List<egg.c>> b = Maps.newHashMap();

      a(List<egg.c> $$0) {
         this.a = $$0;
      }

      public List<egg.c> a() {
         return this.a;
      }

      public List<egg.c> a(czf $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dme> {
      public static final dme a = czh.a.o();
      private final ir<dme> b = new ir<>(16);
      private int c;

      public int a(dme $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dme a(int $$0) {
         dme $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dme> iterator() {
         return this.b.iterator();
      }

      public void a(dme $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(ib a, dme b, @Nullable sy c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final eov a;
      public final ib b;
      public final sy c;

      public d(eov $$0, ib $$1, sy $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
