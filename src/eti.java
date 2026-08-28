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

public class eti {
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
   private final List<eti.b> l = Lists.newArrayList();
   private final List<eti.e> m = Lists.newArrayList();
   private kn n = kn.i;
   private String o = "?";

   public kn a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dhp $$0, jj $$1, kn $$2, boolean $$3, @Nullable dku $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jj $$5 = $$1.a($$2).b(-1, -1, -1);
         List<eti.d> $$6 = Lists.newArrayList();
         List<eti.d> $$7 = Lists.newArrayList();
         List<eti.d> $$8 = Lists.newArrayList();
         jj $$9 = new jj(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jj $$10 = new jj(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (jj $$11 : jj.c($$9, $$10)) {
            jj $$12 = $$11.b($$9);
            dym $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dvl $$14 = $$0.c_($$11);
               eti.d $$15;
               if ($$14 != null) {
                  $$15 = new eti.d($$12, $$13, $$14.c($$0.F_()));
               } else {
                  $$15 = new eti.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<eti.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new eti.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(eti.d $$0, List<eti.d> $$1, List<eti.d> $$2, List<eti.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dhf.a, jj.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<eti.d> a(List<eti.d> $$0, List<eti.d> $$1, List<eti.d> $$2) {
      Comparator<eti.d> $$3 = Comparator.<eti.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<eti.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dhp $$0, jj $$1, jj $$2) {
      List<bvs> $$3 = $$0.a(bvs.class, fcp.a($$1, $$2), $$0x -> !($$0x instanceof cqi));
      this.m.clear();

      for (bvs $$4 : $$3) {
         fcu $$5 = new fcu($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         tw $$6 = new tw();
         $$4.e($$6);
         jj $$7;
         if ($$4 instanceof cmi) {
            $$7 = ((cmi)$$4).j().b($$1);
         } else {
            $$7 = jj.a((kc)$$5);
         }

         this.m.add(new eti.e($$5, $$7, $$6.i()));
      }
   }

   public List<eti.d> a(jj $$0, ete $$1, dku $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<eti.a> a(jj $$0, drm $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         ete $$2 = new ete().a($$1);
         List<eti.a> $$3 = $$2.a(this.l, $$0).a();
         List<eti.a> $$4 = new ArrayList<>($$3.size());

         for (eti.a $$5 : $$3) {
            eti.d $$6 = $$5.a;
            $$4.add($$5.b(new eti.d(a($$2, $$6.a()).a((kn)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<eti.d> a(jj $$0, ete $$1, dku $$2, boolean $$3) {
      ObjectArrayList<eti.d> $$4 = new ObjectArrayList();
      eoy $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (eti.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            jj $$7 = $$3 ? a($$1, $$6.a).a((kn)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new eti.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jj a(ete $$0, jj $$1, ete $$2, jj $$3) {
      jj $$4 = a($$0, $$1);
      jj $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jj a(ete $$0, jj $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dig $$0, jj $$1, jj $$2, ete $$3, azs $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<eti.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eoy $$7 = $$3.g();
            List<jj> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jj> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jj, tw>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (eti.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               jj $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eut $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dym $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     $$0.a($$19, dkw.iu.m(), 308);
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
                        dvl $$22 = $$0.c_($$19);
                        if ($$22 != null) {
                           if ($$22 instanceof btw) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$22.c($$18.c, $$0.F_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dpp) {
                           ((dpp)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$23 = true;
            jo[] $$24 = new jo[]{jo.b, jo.c, jo.f, jo.d, jo.e};

            while ($$23 && !$$8.isEmpty()) {
               $$23 = false;
               Iterator<jj> $$25 = $$8.iterator();

               while ($$25.hasNext()) {
                  jj $$26 = $$25.next();
                  eut $$27 = $$0.b_($$26);

                  for (int $$28 = 0; $$28 < $$24.length && !$$27.b(); $$28++) {
                     jj $$29 = $$26.a($$24[$$28]);
                     eut $$30 = $$0.b_($$29);
                     if ($$30.b() && !$$9.contains($$29)) {
                        $$27 = $$30;
                     }
                  }

                  if ($$27.b()) {
                     dym $$31 = $$0.a_($$26);
                     dku $$32 = $$31.b();
                     if ($$32 instanceof dpp) {
                        ((dpp)$$32).a($$0, $$26, $$31, $$27);
                        $$23 = true;
                        $$25.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fdd $$33 = new fcx($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$34 = $$11;
                  int $$35 = $$12;
                  int $$36 = $$13;

                  for (Pair<jj, tw> $$37 : $$10) {
                     jj $$38 = (jj)$$37.getFirst();
                     $$33.c($$38.u() - $$34, $$38.v() - $$35, $$38.w() - $$36);
                  }

                  a($$0, $$5, $$33, $$34, $$35, $$36);
               }

               for (Pair<jj, tw> $$39 : $$10) {
                  jj $$40 = (jj)$$39.getFirst();
                  if (!$$3.h()) {
                     dym $$41 = $$0.a_($$40);
                     dym $$42 = dku.b($$41, $$0, $$40);
                     if ($$41 != $$42) {
                        $$0.a($$40, $$42, $$5 & -2 | 16);
                     }

                     $$0.a($$40, $$42.b());
                  }

                  if ($$39.getSecond() != null) {
                     dvl $$43 = $$0.c_($$40);
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

   public static void a(dhq $$0, int $$1, fdd $$2, jj $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dhq $$0, int $$1, fdd $$2, int $$3, int $$4, int $$5) {
      jj.a $$6 = new jj.a();
      jj.a $$7 = new jj.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dym $$11 = $$0.a_($$6);
         dym $$12 = $$0.a_($$7);
         dym $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.C_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dym $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.C_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<eti.d> a(dig $$0, jj $$1, jj $$2, ete $$3, List<eti.d> $$4) {
      List<eti.d> $$5 = new ArrayList<>();
      List<eti.d> $$6 = new ArrayList<>();

      for (eti.d $$7 : $$4) {
         jj $$8 = a($$3, $$7.a).a((kn)$$1);
         eti.d $$9 = new eti.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<etf> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (etf $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dig $$0, jj $$1, dpv $$2, drm $$3, jj $$4, @Nullable eoy $$5, boolean $$6) {
      for (eti.e $$7 : this.m) {
         jj $$8 = a($$7.b, $$2, $$3, $$4).a((kn)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tw $$9 = $$7.c.i();
            fcu $$10 = a($$7.a, $$2, $$3, $$4);
            fcu $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            uc $$12 = new uc();
            $$12.add(tx.a($$11.d));
            $$12.add(tx.a($$11.e));
            $$12.add(tx.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dL();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dN());
               if ($$6 && $$5x instanceof bwt) {
                  ((bwt)$$5x).a($$0, $$0.d_(jj.a((kc)$$11)), bwa.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bvs> a(dig $$0, tw $$1) {
      try {
         return bwb.a($$1, $$0.a(), bwa.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kn a(drm $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kn(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static jj a(jj $$0, dpv $$1, drm $$2, jj $$3) {
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
            return new jj($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new jj($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new jj($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new jj($$4, $$5, $$6) : $$0;
      }
   }

   public static fcu a(fcu $$0, dpv $$1, drm $$2, jj $$3) {
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
            return new fcu((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fcu((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fcu((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fcu($$4, $$5, $$6) : $$0;
      }
   }

   public jj a(jj $$0, dpv $$1, drm $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jj a(jj $$0, dpv $$1, drm $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dpv.c ? $$3 : 0;
      int $$6 = $$1 == dpv.b ? $$4 : 0;
      jj $$7 = $$0;
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

   public eoy b(ete $$0, jj $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eoy a(jj $$0, drm $$1, jj $$2, dpv $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eoy a(jj $$0, drm $$1, jj $$2, dpv $$3, kn $$4) {
      kn $$5 = $$4.c(-1, -1, -1);
      jj $$6 = a(jj.c, $$3, $$1, $$2);
      jj $$7 = a(jj.c.a($$5), $$3, $$1, $$2);
      return eoy.a($$6, $$7).a((kn)$$0);
   }

   public tw a(tw $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new uc());
         $$0.a("palette", new uc());
      } else {
         List<eti.c> $$1 = Lists.newArrayList();
         eti.c $$2 = new eti.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new eti.c());
         }

         uc $$4 = new uc();
         List<eti.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            eti.d $$7 = $$5.get($$6);
            tw $$8 = new tw();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               eti.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            uc $$12 = new uc();

            for (dym $$13 : $$2) {
               $$12.add(ul.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            uc $$14 = new uc();

            for (eti.c $$15 : $$1) {
               uc $$16 = new uc();

               for (dym $$17 : $$15) {
                  $$16.add(ul.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      uc $$18 = new uc();

      for (eti.e $$19 : this.m) {
         tw $$20 = new tw();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return ul.e($$0);
   }

   public void a(jt<dku> $$0, tw $$1) {
      this.l.clear();
      this.m.clear();
      uc $$2 = $$1.c("size", 3);
      this.n = new kn($$2.e(0), $$2.e(1), $$2.e(2));
      uc $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         uc $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      uc $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         tw $$8 = $$6.a($$7);
         uc $$9 = $$8.c("pos", 6);
         fcu $$10 = new fcu($$9.h(0), $$9.h(1), $$9.h(2));
         uc $$11 = $$8.c("blockPos", 3);
         jj $$12 = new jj($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            tw $$13 = $$8.p("nbt");
            this.m.add(new eti.e($$10, $$12, $$13));
         }
      }
   }

   private void a(jt<dku> $$0, uc $$1, uc $$2) {
      eti.c $$3 = new eti.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(ul.a($$0, $$1.a($$4)), $$4);
      }

      List<eti.d> $$5 = Lists.newArrayList();
      List<eti.d> $$6 = Lists.newArrayList();
      List<eti.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tw $$9 = $$2.a($$8);
         uc $$10 = $$9.c("pos", 3);
         jj $$11 = new jj($$10.e(0), $$10.e(1), $$10.e(2));
         dym $$12 = $$3.a($$9.h("state"));
         tw $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         eti.d $$15 = new eti.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<eti.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new eti.b($$16));
   }

   private uc a(int... $$0) {
      uc $$1 = new uc();

      for (int $$2 : $$0) {
         $$1.add(ub.a($$2));
      }

      return $$1;
   }

   private uc a(double... $$0) {
      uc $$1 = new uc();

      for (double $$2 : $$0) {
         $$1.add(tx.a($$2));
      }

      return $$1;
   }

   public static dwp.a a(tw $$0, dym $$1) {
      return dwp.a.c.a($$0.l("joint"), () -> doz.o($$1).o().d() ? dwp.a.b : dwp.a.a);
   }

   public static record a(eti.d a, dwp.a b, ald c, ald d, ald e, int f, int g) {

      public static eti.a a(eti.d $$0) {
         tw $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new eti.a(
            $$0,
            eti.a($$1, $$0.b()),
            ald.a($$1.l("name")),
            ald.a($$1.l("pool")),
            ald.a($$1.l("target")),
            $$1.h("placement_priority"),
            $$1.h("selection_priority")
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

      public eti.a b(eti.d $$0) {
         return new eti.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<eti.d> a;
      private final Map<dku, List<eti.d>> b = Maps.newHashMap();
      @Nullable
      private List<eti.a> c;

      b(List<eti.d> $$0) {
         this.a = $$0;
      }

      public List<eti.a> a() {
         if (this.c == null) {
            this.c = this.a(dkw.pD).stream().map(eti.a::a).toList();
         }

         return this.c;
      }

      public List<eti.d> b() {
         return this.a;
      }

      public List<eti.d> a(dku $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<dym> {
      public static final dym a = dkw.a.m();
      private final jy<dym> b = new jy<>(16);
      private int c;

      public int a(dym $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dym a(int $$0) {
         dym $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dym> iterator() {
         return this.b.iterator();
      }

      public void a(dym $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(jj a, dym b, @Nullable tw c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fcu a;
      public final jj b;
      public final tw c;

      public e(fcu $$0, jj $$1, tw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
