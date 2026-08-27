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

public class dyq {
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
   private final List<dyq.a> l = Lists.newArrayList();
   private final List<dyq.d> m = Lists.newArrayList();
   private ia n = ia.g;
   private String o = "?";

   public ia a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(cpk $$0, gv $$1, ia $$2, boolean $$3, @Nullable csk $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         gv $$5 = $$1.a($$2).b(-1, -1, -1);
         List<dyq.c> $$6 = Lists.newArrayList();
         List<dyq.c> $$7 = Lists.newArrayList();
         List<dyq.c> $$8 = Lists.newArrayList();
         gv $$9 = new gv(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         gv $$10 = new gv(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (gv $$11 : gv.a($$9, $$10)) {
            gv $$12 = $$11.b($$9);
            dey $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dck $$14 = $$0.c_($$11);
               dyq.c $$15;
               if ($$14 != null) {
                  $$15 = new dyq.c($$12, $$13, $$14.n());
               } else {
                  $$15 = new dyq.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<dyq.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new dyq.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10.b(1, 1, 1));
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(dyq.c $$0, List<dyq.c> $$1, List<dyq.c> $$2, List<dyq.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(coz.a, gv.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<dyq.c> a(List<dyq.c> $$0, List<dyq.c> $$1, List<dyq.c> $$2) {
      Comparator<dyq.c> $$3 = Comparator.<dyq.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<dyq.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cpk $$0, gv $$1, gv $$2) {
      List<big> $$3 = $$0.a(big.class, new eha($$1, $$2), $$0x -> !($$0x instanceof cbl));
      this.m.clear();

      for (big $$4 : $$3) {
         ehf $$5 = new ehf($$4.dp() - (double)$$1.u(), $$4.dr() - (double)$$1.v(), $$4.dv() - (double)$$1.w());
         qs $$6 = new qs();
         $$4.e($$6);
         gv $$7;
         if ($$4 instanceof bxz) {
            $$7 = ((bxz)$$4).y().b($$1);
         } else {
            $$7 = gv.a($$5);
         }

         this.m.add(new dyq.d($$5, $$7, $$6.h()));
      }
   }

   public List<dyq.c> a(gv $$0, dym $$1, csk $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<dyq.c> a(gv $$0, dym $$1, csk $$2, boolean $$3) {
      ObjectArrayList<dyq.c> $$4 = new ObjectArrayList();
      dup $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (dyq.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            gv $$7 = $$3 ? a($$1, $$6.a).a((ia)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new dyq.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public gv a(dym $$0, gv $$1, dym $$2, gv $$3) {
      gv $$4 = a($$0, $$1);
      gv $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static gv a(dym $$0, gv $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(cpz $$0, gv $$1, gv $$2, dym $$3, art $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<dyq.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dup $$7 = $$3.g();
            List<gv> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<gv> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<gv, qs>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (dyq.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               gv $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eab $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dey $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dck $$22 = $$0.c_($$19);
                     bgf.a_($$22);
                     $$0.a($$19, csl.hW.n(), 20);
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
                        dck $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof ddn) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof cwy) {
                           ((cwy)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            hb[] $$25 = new hb[]{hb.b, hb.c, hb.f, hb.d, hb.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<gv> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  gv $$27 = $$26.next();
                  eab $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     gv $$30 = $$27.a($$25[$$29]);
                     eab $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dey $$32 = $$0.a_($$27);
                     csk $$33 = $$32.b();
                     if ($$33 instanceof cwy) {
                        ((cwy)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  eho $$34 = new ehi($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<gv, qs> $$38 : $$10) {
                     gv $$39 = (gv)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<gv, qs> $$40 : $$10) {
                  gv $$41 = (gv)$$40.getFirst();
                  if (!$$3.h()) {
                     dey $$42 = $$0.a_($$41);
                     dey $$43 = csk.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dck $$44 = $$0.c_($$41);
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

   public static void a(cpl $$0, int $$1, eho $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         gv $$9 = new gv($$3 + $$6, $$4 + $$7, $$5 + $$8);
         gv $$10 = $$9.a($$5x);
         dey $$11 = $$0.a_($$9);
         dey $$12 = $$0.a_($$10);
         dey $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dey $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<dyq.c> a(cpz $$0, gv $$1, gv $$2, dym $$3, List<dyq.c> $$4) {
      List<dyq.c> $$5 = new ArrayList<>();
      List<dyq.c> $$6 = new ArrayList<>();

      for (dyq.c $$7 : $$4) {
         gv $$8 = a($$3, $$7.a).a((ia)$$1);
         dyq.c $$9 = new dyq.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<dyn> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (dyn $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(cpz $$0, gv $$1, cxf $$2, cyw $$3, gv $$4, @Nullable dup $$5, boolean $$6) {
      for (dyq.d $$7 : this.m) {
         gv $$8 = a($$7.b, $$2, $$3, $$4).a((ia)$$1);
         if ($$5 == null || $$5.b($$8)) {
            qs $$9 = $$7.c.h();
            ehf $$10 = a($$7.a, $$2, $$3, $$4);
            ehf $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            qy $$12 = new qy();
            $$12.add(qt.a($$11.c));
            $$12.add(qt.a($$11.d));
            $$12.add(qt.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dA();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dC());
               if ($$6 && $$6x instanceof biy) {
                  ((biy)$$6x).a($$0, $$0.d_(gv.a($$11)), bja.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<big> a(cpz $$0, qs $$1) {
      try {
         return bik.a($$1, $$0.C());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public ia a(cyw $$0) {
      switch ($$0) {
         case d:
         case b:
            return new ia(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static gv a(gv $$0, cxf $$1, cyw $$2, gv $$3) {
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
            return new gv($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new gv($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new gv($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new gv($$4, $$5, $$6) : $$0;
      }
   }

   public static ehf a(ehf $$0, cxf $$1, cyw $$2, gv $$3) {
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
            return new ehf((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ehf((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ehf((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ehf($$4, $$5, $$6) : $$0;
      }
   }

   public gv a(gv $$0, cxf $$1, cyw $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static gv a(gv $$0, cxf $$1, cyw $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == cxf.c ? $$3 : 0;
      int $$6 = $$1 == cxf.b ? $$4 : 0;
      gv $$7 = $$0;
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

   public dup b(dym $$0, gv $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dup a(gv $$0, cyw $$1, gv $$2, cxf $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dup a(gv $$0, cyw $$1, gv $$2, cxf $$3, ia $$4) {
      ia $$5 = $$4.c(-1, -1, -1);
      gv $$6 = a(gv.b, $$3, $$1, $$2);
      gv $$7 = a(gv.b.a($$5), $$3, $$1, $$2);
      return dup.a($$6, $$7).a((ia)$$0);
   }

   public qs a(qs $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new qy());
         $$0.a("palette", new qy());
      } else {
         List<dyq.b> $$1 = Lists.newArrayList();
         dyq.b $$2 = new dyq.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new dyq.b());
         }

         qy $$4 = new qy();
         List<dyq.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            dyq.c $$7 = $$5.get($$6);
            qs $$8 = new qs();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               dyq.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            qy $$12 = new qy();

            for (dey $$13 : $$2) {
               $$12.add(re.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            qy $$14 = new qy();

            for (dyq.b $$15 : $$1) {
               qy $$16 = new qy();

               for (dey $$17 : $$15) {
                  $$16.add(re.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      qy $$18 = new qy();

      for (dyq.d $$19 : this.m) {
         qs $$20 = new qs();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return re.g($$0);
   }

   public void a(hg<csk> $$0, qs $$1) {
      this.l.clear();
      this.m.clear();
      qy $$2 = $$1.c("size", 3);
      this.n = new ia($$2.e(0), $$2.e(1), $$2.e(2));
      qy $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         qy $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      qy $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         qs $$8 = $$6.a($$7);
         qy $$9 = $$8.c("pos", 6);
         ehf $$10 = new ehf($$9.h(0), $$9.h(1), $$9.h(2));
         qy $$11 = $$8.c("blockPos", 3);
         gv $$12 = new gv($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            qs $$13 = $$8.p("nbt");
            this.m.add(new dyq.d($$10, $$12, $$13));
         }
      }
   }

   private void a(hg<csk> $$0, qy $$1, qy $$2) {
      dyq.b $$3 = new dyq.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(re.a($$0, $$1.a($$4)), $$4);
      }

      List<dyq.c> $$5 = Lists.newArrayList();
      List<dyq.c> $$6 = Lists.newArrayList();
      List<dyq.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         qs $$9 = $$2.a($$8);
         qy $$10 = $$9.c("pos", 3);
         gv $$11 = new gv($$10.e(0), $$10.e(1), $$10.e(2));
         dey $$12 = $$3.a($$9.h("state"));
         qs $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         dyq.c $$15 = new dyq.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<dyq.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new dyq.a($$16));
   }

   private qy a(int... $$0) {
      qy $$1 = new qy();

      for (int $$2 : $$0) {
         $$1.add(qx.a($$2));
      }

      return $$1;
   }

   private qy a(double... $$0) {
      qy $$1 = new qy();

      for (double $$2 : $$0) {
         $$1.add(qt.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<dyq.c> a;
      private final Map<csk, List<dyq.c>> b = Maps.newHashMap();

      a(List<dyq.c> $$0) {
         this.a = $$0;
      }

      public List<dyq.c> a() {
         return this.a;
      }

      public List<dyq.c> a(csk $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dey> {
      public static final dey a = csl.a.n();
      private final hl<dey> b = new hl<>(16);
      private int c;

      public int a(dey $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dey a(int $$0) {
         dey $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dey> iterator() {
         return this.b.iterator();
      }

      public void a(dey $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(gv a, dey b, @Nullable qs c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ehf a;
      public final gv b;
      public final qs c;

      public d(ehf $$0, gv $$1, qs $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
