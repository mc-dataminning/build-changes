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
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class evk {
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
   private final List<evk.b> l = Lists.newArrayList();
   private final List<evk.e> m = Lists.newArrayList();
   private ka n = ka.i;
   private String o = "?";

   public ka a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(djh $$0, iv $$1, ka $$2, boolean $$3, @Nullable dmm $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         iv $$5 = $$1.a($$2).b(-1, -1, -1);
         List<evk.d> $$6 = Lists.newArrayList();
         List<evk.d> $$7 = Lists.newArrayList();
         List<evk.d> $$8 = Lists.newArrayList();
         iv $$9 = new iv(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         iv $$10 = new iv(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (iv $$11 : iv.c($$9, $$10)) {
            iv $$12 = $$11.b($$9);
            eao $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dxm $$14 = $$0.c_($$11);
               evk.d $$15;
               if ($$14 != null) {
                  $$15 = new evk.d($$12, $$13, $$14.c($$0.F_()));
               } else {
                  $$15 = new evk.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<evk.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new evk.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(evk.d $$0, List<evk.d> $$1, List<evk.d> $$2, List<evk.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dix.a, iv.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<evk.d> a(List<evk.d> $$0, List<evk.d> $$1, List<evk.d> $$2) {
      Comparator<evk.d> $$3 = Comparator.<evk.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<evk.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(djh $$0, iv $$1, iv $$2) {
      List<bwi> $$3 = $$0.a(bwi.class, fes.a($$1, $$2), $$0x -> !($$0x instanceof crj));
      this.m.clear();

      for (bwi $$4 : $$3) {
         fex $$5 = new fex($$4.dz() - (double)$$1.u(), $$4.dB() - (double)$$1.v(), $$4.dF() - (double)$$1.w());
         tz $$6 = new tz();
         $$4.e($$6);
         iv $$7;
         if ($$4 instanceof cnj) {
            $$7 = ((cnj)$$4).j().b($$1);
         } else {
            $$7 = iv.a((jp)$$5);
         }

         this.m.add(new evk.e($$5, $$7, $$6.i()));
      }
   }

   public List<evk.d> a(iv $$0, evg $$1, dmm $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<evk.a> a(iv $$0, dtg $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         evg $$2 = new evg().a($$1);
         List<evk.a> $$3 = $$2.a(this.l, $$0).a();
         List<evk.a> $$4 = new ArrayList<>($$3.size());

         for (evk.a $$5 : $$3) {
            evk.d $$6 = $$5.a;
            $$4.add($$5.b(new evk.d(a($$2, $$6.a()).a((ka)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<evk.d> a(iv $$0, evg $$1, dmm $$2, boolean $$3) {
      ObjectArrayList<evk.d> $$4 = new ObjectArrayList();
      era $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (evk.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            iv $$7 = $$3 ? a($$1, $$6.a).a((ka)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new evk.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public iv a(evg $$0, iv $$1, evg $$2, iv $$3) {
      iv $$4 = a($$0, $$1);
      iv $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static iv a(evg $$0, iv $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(djy $$0, iv $$1, iv $$2, evg $$3, azv $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<evk.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            era $$7 = $$3.g();
            List<iv> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<iv> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<iv, tz>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (evk.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               iv $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  ewv $$20 = $$3.j() ? $$0.b_($$19) : null;
                  eao $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     $$0.a($$19, dmo.iy.m(), 820);
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
                        dxm $$22 = $$0.c_($$19);
                        if ($$22 != null) {
                           if ($$22 instanceof bum) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$22.c($$18.c, $$0.F_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof drj) {
                           ((drj)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$23 = true;
            jb[] $$24 = new jb[]{jb.b, jb.c, jb.f, jb.d, jb.e};

            while ($$23 && !$$8.isEmpty()) {
               $$23 = false;
               Iterator<iv> $$25 = $$8.iterator();

               while ($$25.hasNext()) {
                  iv $$26 = $$25.next();
                  ewv $$27 = $$0.b_($$26);

                  for (int $$28 = 0; $$28 < $$24.length && !$$27.b(); $$28++) {
                     iv $$29 = $$26.a($$24[$$28]);
                     ewv $$30 = $$0.b_($$29);
                     if ($$30.b() && !$$9.contains($$29)) {
                        $$27 = $$30;
                     }
                  }

                  if ($$27.b()) {
                     eao $$31 = $$0.a_($$26);
                     dmm $$32 = $$31.b();
                     if ($$32 instanceof drj) {
                        ((drj)$$32).a($$0, $$26, $$31, $$27);
                        $$23 = true;
                        $$25.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ffg $$33 = new ffa($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$34 = $$11;
                  int $$35 = $$12;
                  int $$36 = $$13;

                  for (Pair<iv, tz> $$37 : $$10) {
                     iv $$38 = (iv)$$37.getFirst();
                     $$33.c($$38.u() - $$34, $$38.v() - $$35, $$38.w() - $$36);
                  }

                  a($$0, $$5, $$33, $$34, $$35, $$36);
               }

               for (Pair<iv, tz> $$39 : $$10) {
                  iv $$40 = (iv)$$39.getFirst();
                  if (!$$3.h()) {
                     eao $$41 = $$0.a_($$40);
                     eao $$42 = dmm.b($$41, $$0, $$40);
                     if ($$41 != $$42) {
                        $$0.a($$40, $$42, $$5 & -2 | 16);
                     }

                     $$0.a($$40, $$42.b());
                  }

                  if ($$39.getSecond() != null) {
                     dxm $$43 = $$0.c_($$40);
                     if ($$43 != null) {
                        $$43.e();
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

   public static void a(dji $$0, int $$1, ffg $$2, iv $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dji $$0, int $$1, ffg $$2, int $$3, int $$4, int $$5) {
      iv.a $$6 = new iv.a();
      iv.a $$7 = new iv.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         eao $$11 = $$0.a_($$6);
         eao $$12 = $$0.a_($$7);
         eao $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.C_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         eao $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.C_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<evk.d> a(djy $$0, iv $$1, iv $$2, evg $$3, List<evk.d> $$4) {
      List<evk.d> $$5 = new ArrayList<>();
      List<evk.d> $$6 = new ArrayList<>();

      for (evk.d $$7 : $$4) {
         iv $$8 = a($$3, $$7.a).a((ka)$$1);
         evk.d $$9 = new evk.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<evh> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (evh $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(djy $$0, iv $$1, drp $$2, dtg $$3, iv $$4, @Nullable era $$5, boolean $$6) {
      for (evk.e $$7 : this.m) {
         iv $$8 = a($$7.b, $$2, $$3, $$4).a((ka)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tz $$9 = $$7.c.i();
            fex $$10 = a($$7.a, $$2, $$3, $$4);
            fex $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            uf $$12 = new uf();
            $$12.add(ua.a($$11.d));
            $$12.add(ua.a($$11.e));
            $$12.add(ua.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.p("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dK();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dM());
               if ($$6 && $$5x instanceof bxl) {
                  ((bxl)$$5x).a($$0, $$0.d_(iv.a((jp)$$11)), bwq.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bwi> a(djy $$0, tz $$1) {
      try {
         return bwr.a($$1, $$0.a(), bwq.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public ka a(dtg $$0) {
      switch ($$0) {
         case d:
         case b:
            return new ka(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static iv a(iv $$0, drp $$1, dtg $$2, iv $$3) {
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
            return new iv($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new iv($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new iv($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new iv($$4, $$5, $$6) : $$0;
      }
   }

   public static fex a(fex $$0, drp $$1, dtg $$2, iv $$3) {
      double $$4 = $$0.d;
      double $$5 = $$0.e;
      double $$6 = $$0.f;
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
            return new fex((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fex((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fex((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fex($$4, $$5, $$6) : $$0;
      }
   }

   public iv a(iv $$0, drp $$1, dtg $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static iv a(iv $$0, drp $$1, dtg $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == drp.c ? $$3 : 0;
      int $$6 = $$1 == drp.b ? $$4 : 0;
      iv $$7 = $$0;
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

   public era b(evg $$0, iv $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public era a(iv $$0, dtg $$1, iv $$2, drp $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static era a(iv $$0, dtg $$1, iv $$2, drp $$3, ka $$4) {
      ka $$5 = $$4.c(-1, -1, -1);
      iv $$6 = a(iv.c, $$3, $$1, $$2);
      iv $$7 = a(iv.c.a($$5), $$3, $$1, $$2);
      return era.a($$6, $$7).a((ka)$$0);
   }

   public tz a(tz $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new uf());
         $$0.a("palette", new uf());
      } else {
         List<evk.c> $$1 = Lists.newArrayList();
         evk.c $$2 = new evk.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new evk.c());
         }

         uf $$4 = new uf();
         List<evk.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            evk.d $$7 = $$5.get($$6);
            tz $$8 = new tz();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               evk.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            uf $$12 = new uf();

            for (eao $$13 : $$2) {
               $$12.add(uo.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            uf $$14 = new uf();

            for (evk.c $$15 : $$1) {
               uf $$16 = new uf();

               for (eao $$17 : $$15) {
                  $$16.add(uo.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      uf $$18 = new uf();

      for (evk.e $$19 : this.m) {
         tz $$20 = new tz();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return uo.e($$0);
   }

   public void a(jg<dmm> $$0, tz $$1) {
      this.l.clear();
      this.m.clear();
      uf $$2 = $$1.d("size", 3);
      this.n = new ka($$2.e(0), $$2.e(1), $$2.e(2));
      uf $$3 = $$1.d("blocks", 10);
      if ($$1.b("palettes", 9)) {
         uf $$4 = $$1.d("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.d("palette", 10), $$3);
      }

      uf $$6 = $$1.d("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         tz $$8 = $$6.a($$7);
         uf $$9 = $$8.d("pos", 6);
         fex $$10 = new fex($$9.h(0), $$9.h(1), $$9.h(2));
         uf $$11 = $$8.d("blockPos", 3);
         iv $$12 = new iv($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.c("nbt")) {
            tz $$13 = $$8.n("nbt");
            this.m.add(new evk.e($$10, $$12, $$13));
         }
      }
   }

   private void a(jg<dmm> $$0, uf $$1, uf $$2) {
      evk.c $$3 = new evk.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uo.a($$0, $$1.a($$4)), $$4);
      }

      List<evk.d> $$5 = Lists.newArrayList();
      List<evk.d> $$6 = Lists.newArrayList();
      List<evk.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tz $$9 = $$2.a($$8);
         uf $$10 = $$9.d("pos", 3);
         iv $$11 = new iv($$10.e(0), $$10.e(1), $$10.e(2));
         eao $$12 = $$3.a($$9.f("state"));
         tz $$13;
         if ($$9.c("nbt")) {
            $$13 = $$9.n("nbt");
         } else {
            $$13 = null;
         }

         evk.d $$15 = new evk.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<evk.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new evk.b($$16));
   }

   private uf a(int... $$0) {
      uf $$1 = new uf();

      for (int $$2 : $$0) {
         $$1.add(ue.a($$2));
      }

      return $$1;
   }

   private uf a(double... $$0) {
      uf $$1 = new uf();

      for (double $$2 : $$0) {
         $$1.add(ua.a($$2));
      }

      return $$1;
   }

   public static dyq.a a(tz $$0, eao $$1) {
      return $$0.<dyq.a>a("joint", dyq.a.c).orElseGet(() -> a($$1));
   }

   public static dyq.a a(eao $$0) {
      return dqt.o($$0).o().d() ? dyq.a.b : dyq.a.a;
   }

   public static record a(evk.d a, dyq.a b, alg c, alg d, alg e, int f, int g) {

      public static evk.a a(evk.d $$0) {
         tz $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new evk.a(
            $$0,
            evk.a($$1, $$0.b()),
            alg.a($$1.j("name")),
            alg.a($$1.j("pool")),
            alg.a($$1.j("target")),
            $$1.f("placement_priority"),
            $$1.f("selection_priority")
         );
      }

      @Override
      public String toString() {
         return String.format(
            Locale.ROOT,
            "<JigsawBlockInfo | %s | %s | name: %s | pool: %s | target: %s | placement: %d | selection: %d | %s>",
            this.a.a,
            this.a.b,
            this.c,
            this.d,
            this.e,
            this.f,
            this.g,
            this.a.c
         );
      }

      public evk.a b(evk.d $$0) {
         return new evk.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<evk.d> a;
      private final Map<dmm, List<evk.d>> b = Maps.newHashMap();
      @Nullable
      private List<evk.a> c;

      b(List<evk.d> $$0) {
         this.a = $$0;
      }

      public List<evk.a> a() {
         if (this.c == null) {
            this.c = this.a(dmo.pH).stream().map(evk.a::a).toList();
         }

         return this.c;
      }

      public List<evk.d> b() {
         return this.a;
      }

      public List<evk.d> a(dmm $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<eao> {
      public static final eao a = dmo.a.m();
      private final jl<eao> b = new jl<>(16);
      private int c;

      public int a(eao $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public eao a(int $$0) {
         eao $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<eao> iterator() {
         return this.b.iterator();
      }

      public void a(eao $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(iv a, eao b, @Nullable tz c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fex a;
      public final iv b;
      public final tz c;

      public e(fex $$0, iv $$1, tz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
