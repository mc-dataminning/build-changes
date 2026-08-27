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

public class ebh {
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
   private final List<ebh.a> l = Lists.newArrayList();
   private final List<ebh.d> m = Lists.newArrayList();
   private iw n = iw.g;
   private String o = "?";

   public iw a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(csa $$0, ht $$1, iw $$2, boolean $$3, @Nullable cva $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ht $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ebh.c> $$6 = Lists.newArrayList();
         List<ebh.c> $$7 = Lists.newArrayList();
         List<ebh.c> $$8 = Lists.newArrayList();
         ht $$9 = new ht(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ht $$10 = new ht(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ht $$11 : ht.a($$9, $$10)) {
            ht $$12 = $$11.b($$9);
            dhi $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dfd $$14 = $$0.c_($$11);
               ebh.c $$15;
               if ($$14 != null) {
                  $$15 = new ebh.c($$12, $$13, $$14.n());
               } else {
                  $$15 = new ebh.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ebh.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ebh.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ebh.c $$0, List<ebh.c> $$1, List<ebh.c> $$2, List<ebh.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(crp.a, ht.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ebh.c> a(List<ebh.c> $$0, List<ebh.c> $$1, List<ebh.c> $$2) {
      Comparator<ebh.c> $$3 = Comparator.<ebh.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ebh.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(csa $$0, ht $$1, ht $$2) {
      List<bkq> $$3 = $$0.a(bkq.class, ejp.a($$1, $$2), $$0x -> !($$0x instanceof cdu));
      this.m.clear();

      for (bkq $$4 : $$3) {
         eju $$5 = new eju($$4.ds() - (double)$$1.u(), $$4.du() - (double)$$1.v(), $$4.dy() - (double)$$1.w());
         rz $$6 = new rz();
         $$4.e($$6);
         ht $$7;
         if ($$4 instanceof cai) {
            $$7 = ((cai)$$4).E().b($$1);
         } else {
            $$7 = ht.a($$5);
         }

         this.m.add(new ebh.d($$5, $$7, $$6.h()));
      }
   }

   public List<ebh.c> a(ht $$0, ebd $$1, cva $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<ebh.c> a(ht $$0, ebd $$1, cva $$2, boolean $$3) {
      ObjectArrayList<ebh.c> $$4 = new ObjectArrayList();
      dwz $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ebh.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            ht $$7 = $$3 ? a($$1, $$6.a).a((iw)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ebh.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ht a(ebd $$0, ht $$1, ebd $$2, ht $$3) {
      ht $$4 = a($$0, $$1);
      ht $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ht a(ebd $$0, ht $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(csp $$0, ht $$1, ht $$2, ebd $$3, ats $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ebh.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dwz $$7 = $$3.g();
            List<ht> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ht> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ht, rz>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ebh.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ht $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  ecs $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dhi $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dfd $$22 = $$0.c_($$19);
                     bio.a_($$22);
                     $$0.a($$19, cvc.hW.o(), 20);
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
                        dfd $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof dgh) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof czq) {
                           ((czq)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            hx[] $$25 = new hx[]{hx.b, hx.c, hx.f, hx.d, hx.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<ht> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  ht $$27 = $$26.next();
                  ecs $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ht $$30 = $$27.a($$25[$$29]);
                     ecs $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dhi $$32 = $$0.a_($$27);
                     cva $$33 = $$32.b();
                     if ($$33 instanceof czq) {
                        ((czq)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ekd $$34 = new ejx($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<ht, rz> $$38 : $$10) {
                     ht $$39 = (ht)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<ht, rz> $$40 : $$10) {
                  ht $$41 = (ht)$$40.getFirst();
                  if (!$$3.h()) {
                     dhi $$42 = $$0.a_($$41);
                     dhi $$43 = cva.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dfd $$44 = $$0.c_($$41);
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

   public static void a(csb $$0, int $$1, ekd $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         ht $$9 = new ht($$3 + $$6, $$4 + $$7, $$5 + $$8);
         ht $$10 = $$9.a($$5x);
         dhi $$11 = $$0.a_($$9);
         dhi $$12 = $$0.a_($$10);
         dhi $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dhi $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<ebh.c> a(csp $$0, ht $$1, ht $$2, ebd $$3, List<ebh.c> $$4) {
      List<ebh.c> $$5 = new ArrayList<>();
      List<ebh.c> $$6 = new ArrayList<>();

      for (ebh.c $$7 : $$4) {
         ht $$8 = a($$3, $$7.a).a((iw)$$1);
         ebh.c $$9 = new ebh.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<ebe> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ebe $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(csp $$0, ht $$1, czw $$2, dbm $$3, ht $$4, @Nullable dwz $$5, boolean $$6) {
      for (ebh.d $$7 : this.m) {
         ht $$8 = a($$7.b, $$2, $$3, $$4).a((iw)$$1);
         if ($$5 == null || $$5.b($$8)) {
            rz $$9 = $$7.c.h();
            eju $$10 = a($$7.a, $$2, $$3, $$4);
            eju $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            sf $$12 = new sf();
            $$12.add(sa.a($$11.c));
            $$12.add(sa.a($$11.d));
            $$12.add(sa.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dD();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dF());
               if ($$6 && $$6x instanceof bli) {
                  ((bli)$$6x).a($$0, $$0.d_(ht.a($$11)), blk.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<bkq> a(csp $$0, rz $$1) {
      try {
         return bku.a($$1, $$0.D());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public iw a(dbm $$0) {
      switch ($$0) {
         case d:
         case b:
            return new iw(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ht a(ht $$0, czw $$1, dbm $$2, ht $$3) {
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
            return new ht($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new ht($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new ht($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new ht($$4, $$5, $$6) : $$0;
      }
   }

   public static eju a(eju $$0, czw $$1, dbm $$2, ht $$3) {
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
            return new eju((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new eju((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new eju((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new eju($$4, $$5, $$6) : $$0;
      }
   }

   public ht a(ht $$0, czw $$1, dbm $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ht a(ht $$0, czw $$1, dbm $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == czw.c ? $$3 : 0;
      int $$6 = $$1 == czw.b ? $$4 : 0;
      ht $$7 = $$0;
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

   public dwz b(ebd $$0, ht $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dwz a(ht $$0, dbm $$1, ht $$2, czw $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dwz a(ht $$0, dbm $$1, ht $$2, czw $$3, iw $$4) {
      iw $$5 = $$4.c(-1, -1, -1);
      ht $$6 = a(ht.b, $$3, $$1, $$2);
      ht $$7 = a(ht.b.a($$5), $$3, $$1, $$2);
      return dwz.a($$6, $$7).a((iw)$$0);
   }

   public rz a(rz $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new sf());
         $$0.a("palette", new sf());
      } else {
         List<ebh.b> $$1 = Lists.newArrayList();
         ebh.b $$2 = new ebh.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ebh.b());
         }

         sf $$4 = new sf();
         List<ebh.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ebh.c $$7 = $$5.get($$6);
            rz $$8 = new rz();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ebh.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            sf $$12 = new sf();

            for (dhi $$13 : $$2) {
               $$12.add(so.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            sf $$14 = new sf();

            for (ebh.b $$15 : $$1) {
               sf $$16 = new sf();

               for (dhi $$17 : $$15) {
                  $$16.add(so.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      sf $$18 = new sf();

      for (ebh.d $$19 : this.m) {
         rz $$20 = new rz();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return so.g($$0);
   }

   public void a(ic<cva> $$0, rz $$1) {
      this.l.clear();
      this.m.clear();
      sf $$2 = $$1.c("size", 3);
      this.n = new iw($$2.e(0), $$2.e(1), $$2.e(2));
      sf $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         sf $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      sf $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         rz $$8 = $$6.a($$7);
         sf $$9 = $$8.c("pos", 6);
         eju $$10 = new eju($$9.h(0), $$9.h(1), $$9.h(2));
         sf $$11 = $$8.c("blockPos", 3);
         ht $$12 = new ht($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            rz $$13 = $$8.p("nbt");
            this.m.add(new ebh.d($$10, $$12, $$13));
         }
      }
   }

   private void a(ic<cva> $$0, sf $$1, sf $$2) {
      ebh.b $$3 = new ebh.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(so.a($$0, $$1.a($$4)), $$4);
      }

      List<ebh.c> $$5 = Lists.newArrayList();
      List<ebh.c> $$6 = Lists.newArrayList();
      List<ebh.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         rz $$9 = $$2.a($$8);
         sf $$10 = $$9.c("pos", 3);
         ht $$11 = new ht($$10.e(0), $$10.e(1), $$10.e(2));
         dhi $$12 = $$3.a($$9.h("state"));
         rz $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ebh.c $$15 = new ebh.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ebh.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new ebh.a($$16));
   }

   private sf a(int... $$0) {
      sf $$1 = new sf();

      for (int $$2 : $$0) {
         $$1.add(se.a($$2));
      }

      return $$1;
   }

   private sf a(double... $$0) {
      sf $$1 = new sf();

      for (double $$2 : $$0) {
         $$1.add(sa.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<ebh.c> a;
      private final Map<cva, List<ebh.c>> b = Maps.newHashMap();

      a(List<ebh.c> $$0) {
         this.a = $$0;
      }

      public List<ebh.c> a() {
         return this.a;
      }

      public List<ebh.c> a(cva $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dhi> {
      public static final dhi a = cvc.a.o();
      private final ii<dhi> b = new ii<>(16);
      private int c;

      public int a(dhi $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dhi a(int $$0) {
         dhi $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dhi> iterator() {
         return this.b.iterator();
      }

      public void a(dhi $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(ht a, dhi b, @Nullable rz c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final eju a;
      public final ht b;
      public final rz c;

      public d(eju $$0, ht $$1, rz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
