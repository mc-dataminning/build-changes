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

public class enn {
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
   private final List<enn.a> l = Lists.newArrayList();
   private final List<enn.d> m = Lists.newArrayList();
   private kh n = kh.g;
   private String o = "?";

   public kh a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dcu $$0, jd $$1, kh $$2, boolean $$3, @Nullable dfw $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jd $$5 = $$1.a($$2).b(-1, -1, -1);
         List<enn.c> $$6 = Lists.newArrayList();
         List<enn.c> $$7 = Lists.newArrayList();
         List<enn.c> $$8 = Lists.newArrayList();
         jd $$9 = new jd(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jd $$10 = new jd(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (jd $$11 : jd.c($$9, $$10)) {
            jd $$12 = $$11.b($$9);
            dta $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dqf $$14 = $$0.c_($$11);
               enn.c $$15;
               if ($$14 != null) {
                  $$15 = new enn.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new enn.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<enn.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new enn.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(enn.c $$0, List<enn.c> $$1, List<enn.c> $$2, List<enn.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(dcj.a, jd.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<enn.c> a(List<enn.c> $$0, List<enn.c> $$1, List<enn.c> $$2) {
      Comparator<enn.c> $$3 = Comparator.<enn.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<enn.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dcu $$0, jd $$1, jd $$2) {
      List<bsq> $$3 = $$0.a(bsq.class, ewr.a($$1, $$2), $$0x -> !($$0x instanceof cmv));
      this.m.clear();

      for (bsq $$4 : $$3) {
         eww $$5 = new eww($$4.dv() - (double)$$1.u(), $$4.dx() - (double)$$1.v(), $$4.dB() - (double)$$1.w());
         ua $$6 = new ua();
         $$4.e($$6);
         jd $$7;
         if ($$4 instanceof cja) {
            $$7 = ((cja)$$4).t().b($$1);
         } else {
            $$7 = jd.a((jw)$$5);
         }

         this.m.add(new enn.d($$5, $$7, $$6.i()));
      }
   }

   public List<enn.c> a(jd $$0, enj $$1, dfw $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<enn.c> a(jd $$0, enj $$1, dfw $$2, boolean $$3) {
      ObjectArrayList<enn.c> $$4 = new ObjectArrayList();
      eje $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (enn.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            jd $$7 = $$3 ? a($$1, $$6.a).a((kh)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new enn.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jd a(enj $$0, jd $$1, enj $$2, jd $$3) {
      jd $$4 = a($$0, $$1);
      jd $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jd a(enj $$0, jd $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(ddj $$0, jd $$1, jd $$2, enj $$3, ayv $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<enn.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eje $$7 = $$3.g();
            List<jd> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jd> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jd, ua>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (enn.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               jd $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eoy $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dta $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dqf $$22 = $$0.c_($$19);
                     bqh.a_($$22);
                     $$0.a($$19, dfy.hW.o(), 20);
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
                        dqf $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bqy) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dkn) {
                           ((dkn)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ji[] $$25 = new ji[]{ji.b, ji.c, ji.f, ji.d, ji.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<jd> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  jd $$27 = $$26.next();
                  eoy $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     jd $$30 = $$27.a($$25[$$29]);
                     eoy $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dta $$32 = $$0.a_($$27);
                     dfw $$33 = $$32.b();
                     if ($$33 instanceof dkn) {
                        ((dkn)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  exf $$34 = new ewz($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<jd, ua> $$38 : $$10) {
                     jd $$39 = (jd)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<jd, ua> $$40 : $$10) {
                  jd $$41 = (jd)$$40.getFirst();
                  if (!$$3.h()) {
                     dta $$42 = $$0.a_($$41);
                     dta $$43 = dfw.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dqf $$44 = $$0.c_($$41);
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

   public static void a(dcv $$0, int $$1, exf $$2, jd $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dcv $$0, int $$1, exf $$2, int $$3, int $$4, int $$5) {
      jd.a $$6 = new jd.a();
      jd.a $$7 = new jd.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dta $$11 = $$0.a_($$6);
         dta $$12 = $$0.a_($$7);
         dta $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dta $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<enn.c> a(ddj $$0, jd $$1, jd $$2, enj $$3, List<enn.c> $$4) {
      List<enn.c> $$5 = new ArrayList<>();
      List<enn.c> $$6 = new ArrayList<>();

      for (enn.c $$7 : $$4) {
         jd $$8 = a($$3, $$7.a).a((kh)$$1);
         enn.c $$9 = new enn.c($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<enk> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (enk $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(ddj $$0, jd $$1, dkt $$2, dmk $$3, jd $$4, @Nullable eje $$5, boolean $$6) {
      for (enn.d $$7 : this.m) {
         jd $$8 = a($$7.b, $$2, $$3, $$4).a((kh)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ua $$9 = $$7.c.i();
            eww $$10 = a($$7.a, $$2, $$3, $$4);
            eww $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ug $$12 = new ug();
            $$12.add(ub.a($$11.c));
            $$12.add(ub.a($$11.d));
            $$12.add(ub.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dG();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dI());
               if ($$6 && $$5x instanceof btn) {
                  ((btn)$$5x).a($$0, $$0.d_(jd.a((jw)$$11)), btp.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bsq> a(ddj $$0, ua $$1) {
      try {
         return bsw.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kh a(dmk $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kh(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static jd a(jd $$0, dkt $$1, dmk $$2, jd $$3) {
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
            return new jd($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new jd($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new jd($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new jd($$4, $$5, $$6) : $$0;
      }
   }

   public static eww a(eww $$0, dkt $$1, dmk $$2, jd $$3) {
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
            return new eww((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new eww((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new eww((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new eww($$4, $$5, $$6) : $$0;
      }
   }

   public jd a(jd $$0, dkt $$1, dmk $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jd a(jd $$0, dkt $$1, dmk $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dkt.c ? $$3 : 0;
      int $$6 = $$1 == dkt.b ? $$4 : 0;
      jd $$7 = $$0;
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

   public eje b(enj $$0, jd $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eje a(jd $$0, dmk $$1, jd $$2, dkt $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eje a(jd $$0, dmk $$1, jd $$2, dkt $$3, kh $$4) {
      kh $$5 = $$4.c(-1, -1, -1);
      jd $$6 = a(jd.c, $$3, $$1, $$2);
      jd $$7 = a(jd.c.a($$5), $$3, $$1, $$2);
      return eje.a($$6, $$7).a((kh)$$0);
   }

   public ua a(ua $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ug());
         $$0.a("palette", new ug());
      } else {
         List<enn.b> $$1 = Lists.newArrayList();
         enn.b $$2 = new enn.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new enn.b());
         }

         ug $$4 = new ug();
         List<enn.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            enn.c $$7 = $$5.get($$6);
            ua $$8 = new ua();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               enn.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ug $$12 = new ug();

            for (dta $$13 : $$2) {
               $$12.add(up.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ug $$14 = new ug();

            for (enn.b $$15 : $$1) {
               ug $$16 = new ug();

               for (dta $$17 : $$15) {
                  $$16.add(up.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ug $$18 = new ug();

      for (enn.d $$19 : this.m) {
         ua $$20 = new ua();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return up.e($$0);
   }

   public void a(jn<dfw> $$0, ua $$1) {
      this.l.clear();
      this.m.clear();
      ug $$2 = $$1.c("size", 3);
      this.n = new kh($$2.e(0), $$2.e(1), $$2.e(2));
      ug $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ug $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ug $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         ua $$8 = $$6.a($$7);
         ug $$9 = $$8.c("pos", 6);
         eww $$10 = new eww($$9.h(0), $$9.h(1), $$9.h(2));
         ug $$11 = $$8.c("blockPos", 3);
         jd $$12 = new jd($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ua $$13 = $$8.p("nbt");
            this.m.add(new enn.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jn<dfw> $$0, ug $$1, ug $$2) {
      enn.b $$3 = new enn.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(up.a($$0, $$1.a($$4)), $$4);
      }

      List<enn.c> $$5 = Lists.newArrayList();
      List<enn.c> $$6 = Lists.newArrayList();
      List<enn.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ua $$9 = $$2.a($$8);
         ug $$10 = $$9.c("pos", 3);
         jd $$11 = new jd($$10.e(0), $$10.e(1), $$10.e(2));
         dta $$12 = $$3.a($$9.h("state"));
         ua $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         enn.c $$15 = new enn.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<enn.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new enn.a($$16));
   }

   private ug a(int... $$0) {
      ug $$1 = new ug();

      for (int $$2 : $$0) {
         $$1.add(uf.a($$2));
      }

      return $$1;
   }

   private ug a(double... $$0) {
      ug $$1 = new ug();

      for (double $$2 : $$0) {
         $$1.add(ub.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<enn.c> a;
      private final Map<dfw, List<enn.c>> b = Maps.newHashMap();

      a(List<enn.c> $$0) {
         this.a = $$0;
      }

      public List<enn.c> a() {
         return this.a;
      }

      public List<enn.c> a(dfw $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dta> {
      public static final dta a = dfy.a.o();
      private final js<dta> b = new js<>(16);
      private int c;

      public int a(dta $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dta a(int $$0) {
         dta $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dta> iterator() {
         return this.b.iterator();
      }

      public void a(dta $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(jd a, dta b, @Nullable ua c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final eww a;
      public final jd b;
      public final ua c;

      public d(eww $$0, jd $$1, ua $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
