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

public class efl {
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
   private final List<efl.a> l = Lists.newArrayList();
   private final List<efl.d> m = Lists.newArrayList();
   private jd n = jd.g;
   private String o = "?";

   public jd a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(cvr $$0, hz $$1, jd $$2, boolean $$3, @Nullable cys $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         hz $$5 = $$1.a($$2).b(-1, -1, -1);
         List<efl.c> $$6 = Lists.newArrayList();
         List<efl.c> $$7 = Lists.newArrayList();
         List<efl.c> $$8 = Lists.newArrayList();
         hz $$9 = new hz(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         hz $$10 = new hz(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (hz $$11 : hz.a($$9, $$10)) {
            hz $$12 = $$11.b($$9);
            dlj $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dix $$14 = $$0.c_($$11);
               efl.c $$15;
               if ($$14 != null) {
                  $$15 = new efl.c($$12, $$13, $$14.p());
               } else {
                  $$15 = new efl.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<efl.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new efl.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(efl.c $$0, List<efl.c> $$1, List<efl.c> $$2, List<efl.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(cvg.a, hz.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<efl.c> a(List<efl.c> $$0, List<efl.c> $$1, List<efl.c> $$2) {
      Comparator<efl.c> $$3 = Comparator.<efl.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<efl.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cvr $$0, hz $$1, hz $$2) {
      List<bnq> $$3 = $$0.a(bnq.class, enu.a($$1, $$2), $$0x -> !($$0x instanceof chl));
      this.m.clear();

      for (bnq $$4 : $$3) {
         enz $$5 = new enz($$4.dr() - (double)$$1.u(), $$4.dt() - (double)$$1.v(), $$4.dx() - (double)$$1.w());
         sw $$6 = new sw();
         $$4.e($$6);
         hz $$7;
         if ($$4 instanceof cdr) {
            $$7 = ((cdr)$$4).E().b($$1);
         } else {
            $$7 = hz.a($$5);
         }

         this.m.add(new efl.d($$5, $$7, $$6.h()));
      }
   }

   public List<efl.c> a(hz $$0, efh $$1, cys $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<efl.c> a(hz $$0, efh $$1, cys $$2, boolean $$3) {
      ObjectArrayList<efl.c> $$4 = new ObjectArrayList();
      ebd $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (efl.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            hz $$7 = $$3 ? a($$1, $$6.a).a((jd)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new efl.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public hz a(efh $$0, hz $$1, efh $$2, hz $$3) {
      hz $$4 = a($$0, $$1);
      hz $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static hz a(efh $$0, hz $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(cwg $$0, hz $$1, hz $$2, efh $$3, awp $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<efl.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            ebd $$7 = $$3.g();
            List<hz> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<hz> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<hz, sw>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (efl.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               hz $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  egw $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dlj $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dix $$22 = $$0.c_($$19);
                     bln.a_($$22);
                     $$0.a($$19, cyu.hW.o(), 20);
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
                        dix $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bme) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof ddi) {
                           ((ddi)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ie[] $$25 = new ie[]{ie.b, ie.c, ie.f, ie.d, ie.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<hz> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  hz $$27 = $$26.next();
                  egw $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     hz $$30 = $$27.a($$25[$$29]);
                     egw $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dlj $$32 = $$0.a_($$27);
                     cys $$33 = $$32.b();
                     if ($$33 instanceof ddi) {
                        ((ddi)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  eoi $$34 = new eoc($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<hz, sw> $$38 : $$10) {
                     hz $$39 = (hz)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<hz, sw> $$40 : $$10) {
                  hz $$41 = (hz)$$40.getFirst();
                  if (!$$3.h()) {
                     dlj $$42 = $$0.a_($$41);
                     dlj $$43 = cys.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dix $$44 = $$0.c_($$41);
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

   public static void a(cvs $$0, int $$1, eoi $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         hz $$9 = new hz($$3 + $$6, $$4 + $$7, $$5 + $$8);
         hz $$10 = $$9.a($$5x);
         dlj $$11 = $$0.a_($$9);
         dlj $$12 = $$0.a_($$10);
         dlj $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dlj $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<efl.c> a(cwg $$0, hz $$1, hz $$2, efh $$3, List<efl.c> $$4) {
      List<efl.c> $$5 = new ArrayList<>();
      List<efl.c> $$6 = new ArrayList<>();

      for (efl.c $$7 : $$4) {
         hz $$8 = a($$3, $$7.a).a((jd)$$1);
         efl.c $$9 = new efl.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<efi> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (efi $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(cwg $$0, hz $$1, ddo $$2, dfe $$3, hz $$4, @Nullable ebd $$5, boolean $$6) {
      for (efl.d $$7 : this.m) {
         hz $$8 = a($$7.b, $$2, $$3, $$4).a((jd)$$1);
         if ($$5 == null || $$5.b($$8)) {
            sw $$9 = $$7.c.h();
            enz $$10 = a($$7.a, $$2, $$3, $$4);
            enz $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            tc $$12 = new tc();
            $$12.add(sx.a($$11.c));
            $$12.add(sx.a($$11.d));
            $$12.add(sx.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dC();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dE());
               if ($$6 && $$6x instanceof bok) {
                  ((bok)$$6x).a($$0, $$0.d_(hz.a($$11)), bom.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<bnq> a(cwg $$0, sw $$1) {
      try {
         return bnw.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public jd a(dfe $$0) {
      switch ($$0) {
         case d:
         case b:
            return new jd(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static hz a(hz $$0, ddo $$1, dfe $$2, hz $$3) {
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
            return new hz($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new hz($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new hz($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new hz($$4, $$5, $$6) : $$0;
      }
   }

   public static enz a(enz $$0, ddo $$1, dfe $$2, hz $$3) {
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
            return new enz((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new enz((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new enz((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new enz($$4, $$5, $$6) : $$0;
      }
   }

   public hz a(hz $$0, ddo $$1, dfe $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static hz a(hz $$0, ddo $$1, dfe $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == ddo.c ? $$3 : 0;
      int $$6 = $$1 == ddo.b ? $$4 : 0;
      hz $$7 = $$0;
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

   public ebd b(efh $$0, hz $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public ebd a(hz $$0, dfe $$1, hz $$2, ddo $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static ebd a(hz $$0, dfe $$1, hz $$2, ddo $$3, jd $$4) {
      jd $$5 = $$4.c(-1, -1, -1);
      hz $$6 = a(hz.c, $$3, $$1, $$2);
      hz $$7 = a(hz.c.a($$5), $$3, $$1, $$2);
      return ebd.a($$6, $$7).a((jd)$$0);
   }

   public sw a(sw $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new tc());
         $$0.a("palette", new tc());
      } else {
         List<efl.b> $$1 = Lists.newArrayList();
         efl.b $$2 = new efl.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new efl.b());
         }

         tc $$4 = new tc();
         List<efl.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            efl.c $$7 = $$5.get($$6);
            sw $$8 = new sw();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               efl.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            tc $$12 = new tc();

            for (dlj $$13 : $$2) {
               $$12.add(tl.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            tc $$14 = new tc();

            for (efl.b $$15 : $$1) {
               tc $$16 = new tc();

               for (dlj $$17 : $$15) {
                  $$16.add(tl.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      tc $$18 = new tc();

      for (efl.d $$19 : this.m) {
         sw $$20 = new sw();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return tl.g($$0);
   }

   public void a(ik<cys> $$0, sw $$1) {
      this.l.clear();
      this.m.clear();
      tc $$2 = $$1.c("size", 3);
      this.n = new jd($$2.e(0), $$2.e(1), $$2.e(2));
      tc $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         tc $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      tc $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         sw $$8 = $$6.a($$7);
         tc $$9 = $$8.c("pos", 6);
         enz $$10 = new enz($$9.h(0), $$9.h(1), $$9.h(2));
         tc $$11 = $$8.c("blockPos", 3);
         hz $$12 = new hz($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            sw $$13 = $$8.p("nbt");
            this.m.add(new efl.d($$10, $$12, $$13));
         }
      }
   }

   private void a(ik<cys> $$0, tc $$1, tc $$2) {
      efl.b $$3 = new efl.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(tl.a($$0, $$1.a($$4)), $$4);
      }

      List<efl.c> $$5 = Lists.newArrayList();
      List<efl.c> $$6 = Lists.newArrayList();
      List<efl.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         sw $$9 = $$2.a($$8);
         tc $$10 = $$9.c("pos", 3);
         hz $$11 = new hz($$10.e(0), $$10.e(1), $$10.e(2));
         dlj $$12 = $$3.a($$9.h("state"));
         sw $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         efl.c $$15 = new efl.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<efl.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new efl.a($$16));
   }

   private tc a(int... $$0) {
      tc $$1 = new tc();

      for (int $$2 : $$0) {
         $$1.add(tb.a($$2));
      }

      return $$1;
   }

   private tc a(double... $$0) {
      tc $$1 = new tc();

      for (double $$2 : $$0) {
         $$1.add(sx.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<efl.c> a;
      private final Map<cys, List<efl.c>> b = Maps.newHashMap();

      a(List<efl.c> $$0) {
         this.a = $$0;
      }

      public List<efl.c> a() {
         return this.a;
      }

      public List<efl.c> a(cys $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dlj> {
      public static final dlj a = cyu.a.o();
      private final ip<dlj> b = new ip<>(16);
      private int c;

      public int a(dlj $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dlj a(int $$0) {
         dlj $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dlj> iterator() {
         return this.b.iterator();
      }

      public void a(dlj $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(hz a, dlj b, @Nullable sw c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final enz a;
      public final hz b;
      public final sw c;

      public d(enz $$0, hz $$1, sw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
