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

public class dzt {
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
   private final List<dzt.a> l = Lists.newArrayList();
   private final List<dzt.d> m = Lists.newArrayList();
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

   public void a(cqz $$0, ht $$1, iw $$2, boolean $$3, @Nullable cua $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ht $$5 = $$1.a($$2).b(-1, -1, -1);
         List<dzt.c> $$6 = Lists.newArrayList();
         List<dzt.c> $$7 = Lists.newArrayList();
         List<dzt.c> $$8 = Lists.newArrayList();
         ht $$9 = new ht(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ht $$10 = new ht(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ht $$11 : ht.a($$9, $$10)) {
            ht $$12 = $$11.b($$9);
            dgb $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               ddx $$14 = $$0.c_($$11);
               dzt.c $$15;
               if ($$14 != null) {
                  $$15 = new dzt.c($$12, $$13, $$14.n());
               } else {
                  $$15 = new dzt.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<dzt.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new dzt.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10.b(1, 1, 1));
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(dzt.c $$0, List<dzt.c> $$1, List<dzt.c> $$2, List<dzt.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(cqo.a, ht.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<dzt.c> a(List<dzt.c> $$0, List<dzt.c> $$1, List<dzt.c> $$2) {
      Comparator<dzt.c> $$3 = Comparator.<dzt.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<dzt.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cqz $$0, ht $$1, ht $$2) {
      List<bjt> $$3 = $$0.a(bjt.class, new eia($$1, $$2), $$0x -> !($$0x instanceof ccx));
      this.m.clear();

      for (bjt $$4 : $$3) {
         eif $$5 = new eif($$4.dq() - (double)$$1.u(), $$4.ds() - (double)$$1.v(), $$4.dw() - (double)$$1.w());
         rt $$6 = new rt();
         $$4.e($$6);
         ht $$7;
         if ($$4 instanceof bzl) {
            $$7 = ((bzl)$$4).E().b($$1);
         } else {
            $$7 = ht.a($$5);
         }

         this.m.add(new dzt.d($$5, $$7, $$6.h()));
      }
   }

   public List<dzt.c> a(ht $$0, dzp $$1, cua $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<dzt.c> a(ht $$0, dzp $$1, cua $$2, boolean $$3) {
      ObjectArrayList<dzt.c> $$4 = new ObjectArrayList();
      dvs $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (dzt.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            ht $$7 = $$3 ? a($$1, $$6.a).a((iw)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new dzt.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ht a(dzp $$0, ht $$1, dzp $$2, ht $$3) {
      ht $$4 = a($$0, $$1);
      ht $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ht a(dzp $$0, ht $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(cro $$0, ht $$1, ht $$2, dzp $$3, ate $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<dzt.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dvs $$7 = $$3.g();
            List<ht> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ht> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ht, rt>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (dzt.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ht $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  ebe $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dgb $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     ddx $$22 = $$0.c_($$19);
                     bhs.a_($$22);
                     $$0.a($$19, cuc.hW.o(), 20);
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
                        ddx $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof dfa) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof cyp) {
                           ((cyp)$$21.b()).a($$0, $$19, $$21, $$20);
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
                  ebe $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ht $$30 = $$27.a($$25[$$29]);
                     ebe $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dgb $$32 = $$0.a_($$27);
                     cua $$33 = $$32.b();
                     if ($$33 instanceof cyp) {
                        ((cyp)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  eio $$34 = new eii($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<ht, rt> $$38 : $$10) {
                     ht $$39 = (ht)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<ht, rt> $$40 : $$10) {
                  ht $$41 = (ht)$$40.getFirst();
                  if (!$$3.h()) {
                     dgb $$42 = $$0.a_($$41);
                     dgb $$43 = cua.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     ddx $$44 = $$0.c_($$41);
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

   public static void a(cra $$0, int $$1, eio $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         ht $$9 = new ht($$3 + $$6, $$4 + $$7, $$5 + $$8);
         ht $$10 = $$9.a($$5x);
         dgb $$11 = $$0.a_($$9);
         dgb $$12 = $$0.a_($$10);
         dgb $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dgb $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<dzt.c> a(cro $$0, ht $$1, ht $$2, dzp $$3, List<dzt.c> $$4) {
      List<dzt.c> $$5 = new ArrayList<>();
      List<dzt.c> $$6 = new ArrayList<>();

      for (dzt.c $$7 : $$4) {
         ht $$8 = a($$3, $$7.a).a((iw)$$1);
         dzt.c $$9 = new dzt.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<dzq> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (dzq $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(cro $$0, ht $$1, cyv $$2, dal $$3, ht $$4, @Nullable dvs $$5, boolean $$6) {
      for (dzt.d $$7 : this.m) {
         ht $$8 = a($$7.b, $$2, $$3, $$4).a((iw)$$1);
         if ($$5 == null || $$5.b($$8)) {
            rt $$9 = $$7.c.h();
            eif $$10 = a($$7.a, $$2, $$3, $$4);
            eif $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            rz $$12 = new rz();
            $$12.add(ru.a($$11.c));
            $$12.add(ru.a($$11.d));
            $$12.add(ru.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dB();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dD());
               if ($$6 && $$6x instanceof bkl) {
                  ((bkl)$$6x).a($$0, $$0.d_(ht.a($$11)), bkn.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<bjt> a(cro $$0, rt $$1) {
      try {
         return bjx.a($$1, $$0.C());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public iw a(dal $$0) {
      switch ($$0) {
         case d:
         case b:
            return new iw(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ht a(ht $$0, cyv $$1, dal $$2, ht $$3) {
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

   public static eif a(eif $$0, cyv $$1, dal $$2, ht $$3) {
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
            return new eif((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new eif((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new eif((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new eif($$4, $$5, $$6) : $$0;
      }
   }

   public ht a(ht $$0, cyv $$1, dal $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ht a(ht $$0, cyv $$1, dal $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == cyv.c ? $$3 : 0;
      int $$6 = $$1 == cyv.b ? $$4 : 0;
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

   public dvs b(dzp $$0, ht $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dvs a(ht $$0, dal $$1, ht $$2, cyv $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dvs a(ht $$0, dal $$1, ht $$2, cyv $$3, iw $$4) {
      iw $$5 = $$4.c(-1, -1, -1);
      ht $$6 = a(ht.b, $$3, $$1, $$2);
      ht $$7 = a(ht.b.a($$5), $$3, $$1, $$2);
      return dvs.a($$6, $$7).a((iw)$$0);
   }

   public rt a(rt $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new rz());
         $$0.a("palette", new rz());
      } else {
         List<dzt.b> $$1 = Lists.newArrayList();
         dzt.b $$2 = new dzt.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new dzt.b());
         }

         rz $$4 = new rz();
         List<dzt.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            dzt.c $$7 = $$5.get($$6);
            rt $$8 = new rt();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               dzt.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            rz $$12 = new rz();

            for (dgb $$13 : $$2) {
               $$12.add(sg.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            rz $$14 = new rz();

            for (dzt.b $$15 : $$1) {
               rz $$16 = new rz();

               for (dgb $$17 : $$15) {
                  $$16.add(sg.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      rz $$18 = new rz();

      for (dzt.d $$19 : this.m) {
         rt $$20 = new rt();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return sg.g($$0);
   }

   public void a(ic<cua> $$0, rt $$1) {
      this.l.clear();
      this.m.clear();
      rz $$2 = $$1.c("size", 3);
      this.n = new iw($$2.e(0), $$2.e(1), $$2.e(2));
      rz $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         rz $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      rz $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         rt $$8 = $$6.a($$7);
         rz $$9 = $$8.c("pos", 6);
         eif $$10 = new eif($$9.h(0), $$9.h(1), $$9.h(2));
         rz $$11 = $$8.c("blockPos", 3);
         ht $$12 = new ht($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            rt $$13 = $$8.p("nbt");
            this.m.add(new dzt.d($$10, $$12, $$13));
         }
      }
   }

   private void a(ic<cua> $$0, rz $$1, rz $$2) {
      dzt.b $$3 = new dzt.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(sg.a($$0, $$1.a($$4)), $$4);
      }

      List<dzt.c> $$5 = Lists.newArrayList();
      List<dzt.c> $$6 = Lists.newArrayList();
      List<dzt.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         rt $$9 = $$2.a($$8);
         rz $$10 = $$9.c("pos", 3);
         ht $$11 = new ht($$10.e(0), $$10.e(1), $$10.e(2));
         dgb $$12 = $$3.a($$9.h("state"));
         rt $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         dzt.c $$15 = new dzt.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<dzt.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new dzt.a($$16));
   }

   private rz a(int... $$0) {
      rz $$1 = new rz();

      for (int $$2 : $$0) {
         $$1.add(ry.a($$2));
      }

      return $$1;
   }

   private rz a(double... $$0) {
      rz $$1 = new rz();

      for (double $$2 : $$0) {
         $$1.add(ru.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<dzt.c> a;
      private final Map<cua, List<dzt.c>> b = Maps.newHashMap();

      a(List<dzt.c> $$0) {
         this.a = $$0;
      }

      public List<dzt.c> a() {
         return this.a;
      }

      public List<dzt.c> a(cua $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dgb> {
      public static final dgb a = cuc.a.o();
      private final ii<dgb> b = new ii<>(16);
      private int c;

      public int a(dgb $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dgb a(int $$0) {
         dgb $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dgb> iterator() {
         return this.b.iterator();
      }

      public void a(dgb $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(ht a, dgb b, @Nullable rt c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final eif a;
      public final ht b;
      public final rt c;

      public d(eif $$0, ht $$1, rt $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
