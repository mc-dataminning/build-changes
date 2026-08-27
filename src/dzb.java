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

public class dzb {
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
   private final List<dzb.a> l = Lists.newArrayList();
   private final List<dzb.d> m = Lists.newArrayList();
   private hy n = hy.g;
   private String o = "?";

   public hy a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(cpv $$0, gw $$1, hy $$2, boolean $$3, @Nullable csv $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         gw $$5 = $$1.a($$2).b(-1, -1, -1);
         List<dzb.c> $$6 = Lists.newArrayList();
         List<dzb.c> $$7 = Lists.newArrayList();
         List<dzb.c> $$8 = Lists.newArrayList();
         gw $$9 = new gw(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         gw $$10 = new gw(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (gw $$11 : gw.a($$9, $$10)) {
            gw $$12 = $$11.b($$9);
            dfj $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dcv $$14 = $$0.c_($$11);
               dzb.c $$15;
               if ($$14 != null) {
                  $$15 = new dzb.c($$12, $$13, $$14.n());
               } else {
                  $$15 = new dzb.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<dzb.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new dzb.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10.b(1, 1, 1));
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(dzb.c $$0, List<dzb.c> $$1, List<dzb.c> $$2, List<dzb.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(cpk.a, gw.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<dzb.c> a(List<dzb.c> $$0, List<dzb.c> $$1, List<dzb.c> $$2) {
      Comparator<dzb.c> $$3 = Comparator.<dzb.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<dzb.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cpv $$0, gw $$1, gw $$2) {
      List<biq> $$3 = $$0.a(biq.class, new ehi($$1, $$2), $$0x -> !($$0x instanceof cbu));
      this.m.clear();

      for (biq $$4 : $$3) {
         ehn $$5 = new ehn($$4.dq() - (double)$$1.u(), $$4.ds() - (double)$$1.v(), $$4.dw() - (double)$$1.w());
         qw $$6 = new qw();
         $$4.e($$6);
         gw $$7;
         if ($$4 instanceof byi) {
            $$7 = ((byi)$$4).E().b($$1);
         } else {
            $$7 = gw.a($$5);
         }

         this.m.add(new dzb.d($$5, $$7, $$6.h()));
      }
   }

   public List<dzb.c> a(gw $$0, dyx $$1, csv $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<dzb.c> a(gw $$0, dyx $$1, csv $$2, boolean $$3) {
      ObjectArrayList<dzb.c> $$4 = new ObjectArrayList();
      dva $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (dzb.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            gw $$7 = $$3 ? a($$1, $$6.a).a((hy)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new dzb.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public gw a(dyx $$0, gw $$1, dyx $$2, gw $$3) {
      gw $$4 = a($$0, $$1);
      gw $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static gw a(dyx $$0, gw $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(cqk $$0, gw $$1, gw $$2, dyx $$3, asc $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<dzb.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dva $$7 = $$3.g();
            List<gw> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<gw> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<gw, qw>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (dzb.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               gw $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eam $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dfj $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dcv $$22 = $$0.c_($$19);
                     bgp.a_($$22);
                     $$0.a($$19, csw.hW.n(), 20);
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
                        dcv $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof ddy) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof cxj) {
                           ((cxj)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ha[] $$25 = new ha[]{ha.b, ha.c, ha.f, ha.d, ha.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<gw> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  gw $$27 = $$26.next();
                  eam $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     gw $$30 = $$27.a($$25[$$29]);
                     eam $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dfj $$32 = $$0.a_($$27);
                     csv $$33 = $$32.b();
                     if ($$33 instanceof cxj) {
                        ((cxj)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ehw $$34 = new ehq($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<gw, qw> $$38 : $$10) {
                     gw $$39 = (gw)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<gw, qw> $$40 : $$10) {
                  gw $$41 = (gw)$$40.getFirst();
                  if (!$$3.h()) {
                     dfj $$42 = $$0.a_($$41);
                     dfj $$43 = csv.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dcv $$44 = $$0.c_($$41);
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

   public static void a(cpw $$0, int $$1, ehw $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         gw $$9 = new gw($$3 + $$6, $$4 + $$7, $$5 + $$8);
         gw $$10 = $$9.a($$5x);
         dfj $$11 = $$0.a_($$9);
         dfj $$12 = $$0.a_($$10);
         dfj $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dfj $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<dzb.c> a(cqk $$0, gw $$1, gw $$2, dyx $$3, List<dzb.c> $$4) {
      List<dzb.c> $$5 = new ArrayList<>();
      List<dzb.c> $$6 = new ArrayList<>();

      for (dzb.c $$7 : $$4) {
         gw $$8 = a($$3, $$7.a).a((hy)$$1);
         dzb.c $$9 = new dzb.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<dyy> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (dyy $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(cqk $$0, gw $$1, cxq $$2, czh $$3, gw $$4, @Nullable dva $$5, boolean $$6) {
      for (dzb.d $$7 : this.m) {
         gw $$8 = a($$7.b, $$2, $$3, $$4).a((hy)$$1);
         if ($$5 == null || $$5.b($$8)) {
            qw $$9 = $$7.c.h();
            ehn $$10 = a($$7.a, $$2, $$3, $$4);
            ehn $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            rc $$12 = new rc();
            $$12.add(qx.a($$11.c));
            $$12.add(qx.a($$11.d));
            $$12.add(qx.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dB();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dD());
               if ($$6 && $$6x instanceof bji) {
                  ((bji)$$6x).a($$0, $$0.d_(gw.a($$11)), bjk.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<biq> a(cqk $$0, qw $$1) {
      try {
         return biu.a($$1, $$0.C());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public hy a(czh $$0) {
      switch ($$0) {
         case d:
         case b:
            return new hy(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static gw a(gw $$0, cxq $$1, czh $$2, gw $$3) {
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
            return new gw($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new gw($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new gw($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new gw($$4, $$5, $$6) : $$0;
      }
   }

   public static ehn a(ehn $$0, cxq $$1, czh $$2, gw $$3) {
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
            return new ehn((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ehn((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ehn((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ehn($$4, $$5, $$6) : $$0;
      }
   }

   public gw a(gw $$0, cxq $$1, czh $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static gw a(gw $$0, cxq $$1, czh $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == cxq.c ? $$3 : 0;
      int $$6 = $$1 == cxq.b ? $$4 : 0;
      gw $$7 = $$0;
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

   public dva b(dyx $$0, gw $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dva a(gw $$0, czh $$1, gw $$2, cxq $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dva a(gw $$0, czh $$1, gw $$2, cxq $$3, hy $$4) {
      hy $$5 = $$4.c(-1, -1, -1);
      gw $$6 = a(gw.b, $$3, $$1, $$2);
      gw $$7 = a(gw.b.a($$5), $$3, $$1, $$2);
      return dva.a($$6, $$7).a((hy)$$0);
   }

   public qw a(qw $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new rc());
         $$0.a("palette", new rc());
      } else {
         List<dzb.b> $$1 = Lists.newArrayList();
         dzb.b $$2 = new dzb.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new dzb.b());
         }

         rc $$4 = new rc();
         List<dzb.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            dzb.c $$7 = $$5.get($$6);
            qw $$8 = new qw();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               dzb.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            rc $$12 = new rc();

            for (dfj $$13 : $$2) {
               $$12.add(rj.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            rc $$14 = new rc();

            for (dzb.b $$15 : $$1) {
               rc $$16 = new rc();

               for (dfj $$17 : $$15) {
                  $$16.add(rj.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      rc $$18 = new rc();

      for (dzb.d $$19 : this.m) {
         qw $$20 = new qw();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return rj.g($$0);
   }

   public void a(hf<csv> $$0, qw $$1) {
      this.l.clear();
      this.m.clear();
      rc $$2 = $$1.c("size", 3);
      this.n = new hy($$2.e(0), $$2.e(1), $$2.e(2));
      rc $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         rc $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      rc $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         qw $$8 = $$6.a($$7);
         rc $$9 = $$8.c("pos", 6);
         ehn $$10 = new ehn($$9.h(0), $$9.h(1), $$9.h(2));
         rc $$11 = $$8.c("blockPos", 3);
         gw $$12 = new gw($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            qw $$13 = $$8.p("nbt");
            this.m.add(new dzb.d($$10, $$12, $$13));
         }
      }
   }

   private void a(hf<csv> $$0, rc $$1, rc $$2) {
      dzb.b $$3 = new dzb.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(rj.a($$0, $$1.a($$4)), $$4);
      }

      List<dzb.c> $$5 = Lists.newArrayList();
      List<dzb.c> $$6 = Lists.newArrayList();
      List<dzb.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         qw $$9 = $$2.a($$8);
         rc $$10 = $$9.c("pos", 3);
         gw $$11 = new gw($$10.e(0), $$10.e(1), $$10.e(2));
         dfj $$12 = $$3.a($$9.h("state"));
         qw $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         dzb.c $$15 = new dzb.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<dzb.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new dzb.a($$16));
   }

   private rc a(int... $$0) {
      rc $$1 = new rc();

      for (int $$2 : $$0) {
         $$1.add(rb.a($$2));
      }

      return $$1;
   }

   private rc a(double... $$0) {
      rc $$1 = new rc();

      for (double $$2 : $$0) {
         $$1.add(qx.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<dzb.c> a;
      private final Map<csv, List<dzb.c>> b = Maps.newHashMap();

      a(List<dzb.c> $$0) {
         this.a = $$0;
      }

      public List<dzb.c> a() {
         return this.a;
      }

      public List<dzb.c> a(csv $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dfj> {
      public static final dfj a = csw.a.n();
      private final hk<dfj> b = new hk<>(16);
      private int c;

      public int a(dfj $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dfj a(int $$0) {
         dfj $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dfj> iterator() {
         return this.b.iterator();
      }

      public void a(dfj $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(gw a, dfj b, @Nullable qw c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ehn a;
      public final gw b;
      public final qw c;

      public d(ehn $$0, gw $$1, qw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
