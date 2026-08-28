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

public class euk {
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
   private final List<euk.b> l = Lists.newArrayList();
   private final List<euk.e> m = Lists.newArrayList();
   private jz n = jz.i;
   private String o = "?";

   public jz a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dip $$0, iu $$1, jz $$2, boolean $$3, @Nullable dlu $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         iu $$5 = $$1.a($$2).b(-1, -1, -1);
         List<euk.d> $$6 = Lists.newArrayList();
         List<euk.d> $$7 = Lists.newArrayList();
         List<euk.d> $$8 = Lists.newArrayList();
         iu $$9 = new iu(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         iu $$10 = new iu(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (iu $$11 : iu.c($$9, $$10)) {
            iu $$12 = $$11.b($$9);
            dzo $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dwn $$14 = $$0.c_($$11);
               euk.d $$15;
               if ($$14 != null) {
                  $$15 = new euk.d($$12, $$13, $$14.c($$0.F_()));
               } else {
                  $$15 = new euk.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<euk.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new euk.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(euk.d $$0, List<euk.d> $$1, List<euk.d> $$2, List<euk.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dif.a, iu.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<euk.d> a(List<euk.d> $$0, List<euk.d> $$1, List<euk.d> $$2) {
      Comparator<euk.d> $$3 = Comparator.<euk.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<euk.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dip $$0, iu $$1, iu $$2) {
      List<bwa> $$3 = $$0.a(bwa.class, fdr.a($$1, $$2), $$0x -> !($$0x instanceof cqs));
      this.m.clear();

      for (bwa $$4 : $$3) {
         fdw $$5 = new fdw($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         tx $$6 = new tx();
         $$4.e($$6);
         iu $$7;
         if ($$4 instanceof cms) {
            $$7 = ((cms)$$4).j().b($$1);
         } else {
            $$7 = iu.a((jo)$$5);
         }

         this.m.add(new euk.e($$5, $$7, $$6.i()));
      }
   }

   public List<euk.d> a(iu $$0, eug $$1, dlu $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<euk.a> a(iu $$0, dsm $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         eug $$2 = new eug().a($$1);
         List<euk.a> $$3 = $$2.a(this.l, $$0).a();
         List<euk.a> $$4 = new ArrayList<>($$3.size());

         for (euk.a $$5 : $$3) {
            euk.d $$6 = $$5.a;
            $$4.add($$5.b(new euk.d(a($$2, $$6.a()).a((jz)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<euk.d> a(iu $$0, eug $$1, dlu $$2, boolean $$3) {
      ObjectArrayList<euk.d> $$4 = new ObjectArrayList();
      eqa $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (euk.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            iu $$7 = $$3 ? a($$1, $$6.a).a((jz)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new euk.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public iu a(eug $$0, iu $$1, eug $$2, iu $$3) {
      iu $$4 = a($$0, $$1);
      iu $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static iu a(eug $$0, iu $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(djg $$0, iu $$1, iu $$2, eug $$3, azt $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<euk.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eqa $$7 = $$3.g();
            List<iu> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<iu> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<iu, tx>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (euk.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               iu $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  evv $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dzo $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     $$0.a($$19, dlw.iu.m(), 308);
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
                        dwn $$22 = $$0.c_($$19);
                        if ($$22 != null) {
                           if ($$22 instanceof bue) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$22.c($$18.c, $$0.F_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dqp) {
                           ((dqp)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$23 = true;
            ja[] $$24 = new ja[]{ja.b, ja.c, ja.f, ja.d, ja.e};

            while ($$23 && !$$8.isEmpty()) {
               $$23 = false;
               Iterator<iu> $$25 = $$8.iterator();

               while ($$25.hasNext()) {
                  iu $$26 = $$25.next();
                  evv $$27 = $$0.b_($$26);

                  for (int $$28 = 0; $$28 < $$24.length && !$$27.b(); $$28++) {
                     iu $$29 = $$26.a($$24[$$28]);
                     evv $$30 = $$0.b_($$29);
                     if ($$30.b() && !$$9.contains($$29)) {
                        $$27 = $$30;
                     }
                  }

                  if ($$27.b()) {
                     dzo $$31 = $$0.a_($$26);
                     dlu $$32 = $$31.b();
                     if ($$32 instanceof dqp) {
                        ((dqp)$$32).a($$0, $$26, $$31, $$27);
                        $$23 = true;
                        $$25.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fef $$33 = new fdz($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$34 = $$11;
                  int $$35 = $$12;
                  int $$36 = $$13;

                  for (Pair<iu, tx> $$37 : $$10) {
                     iu $$38 = (iu)$$37.getFirst();
                     $$33.c($$38.u() - $$34, $$38.v() - $$35, $$38.w() - $$36);
                  }

                  a($$0, $$5, $$33, $$34, $$35, $$36);
               }

               for (Pair<iu, tx> $$39 : $$10) {
                  iu $$40 = (iu)$$39.getFirst();
                  if (!$$3.h()) {
                     dzo $$41 = $$0.a_($$40);
                     dzo $$42 = dlu.b($$41, $$0, $$40);
                     if ($$41 != $$42) {
                        $$0.a($$40, $$42, $$5 & -2 | 16);
                     }

                     $$0.a($$40, $$42.b());
                  }

                  if ($$39.getSecond() != null) {
                     dwn $$43 = $$0.c_($$40);
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

   public static void a(diq $$0, int $$1, fef $$2, iu $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(diq $$0, int $$1, fef $$2, int $$3, int $$4, int $$5) {
      iu.a $$6 = new iu.a();
      iu.a $$7 = new iu.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dzo $$11 = $$0.a_($$6);
         dzo $$12 = $$0.a_($$7);
         dzo $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.C_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dzo $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.C_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<euk.d> a(djg $$0, iu $$1, iu $$2, eug $$3, List<euk.d> $$4) {
      List<euk.d> $$5 = new ArrayList<>();
      List<euk.d> $$6 = new ArrayList<>();

      for (euk.d $$7 : $$4) {
         iu $$8 = a($$3, $$7.a).a((jz)$$1);
         euk.d $$9 = new euk.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<euh> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (euh $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(djg $$0, iu $$1, dqv $$2, dsm $$3, iu $$4, @Nullable eqa $$5, boolean $$6) {
      for (euk.e $$7 : this.m) {
         iu $$8 = a($$7.b, $$2, $$3, $$4).a((jz)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tx $$9 = $$7.c.i();
            fdw $$10 = a($$7.a, $$2, $$3, $$4);
            fdw $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ud $$12 = new ud();
            $$12.add(ty.a($$11.d));
            $$12.add(ty.a($$11.e));
            $$12.add(ty.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dL();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dN());
               if ($$6 && $$5x instanceof bxb) {
                  ((bxb)$$5x).a($$0, $$0.d_(iu.a((jo)$$11)), bwi.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bwa> a(djg $$0, tx $$1) {
      try {
         return bwj.a($$1, $$0.a(), bwi.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public jz a(dsm $$0) {
      switch ($$0) {
         case d:
         case b:
            return new jz(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static iu a(iu $$0, dqv $$1, dsm $$2, iu $$3) {
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
            return new iu($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new iu($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new iu($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new iu($$4, $$5, $$6) : $$0;
      }
   }

   public static fdw a(fdw $$0, dqv $$1, dsm $$2, iu $$3) {
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
            return new fdw((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fdw((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fdw((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fdw($$4, $$5, $$6) : $$0;
      }
   }

   public iu a(iu $$0, dqv $$1, dsm $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static iu a(iu $$0, dqv $$1, dsm $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dqv.c ? $$3 : 0;
      int $$6 = $$1 == dqv.b ? $$4 : 0;
      iu $$7 = $$0;
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

   public eqa b(eug $$0, iu $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eqa a(iu $$0, dsm $$1, iu $$2, dqv $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eqa a(iu $$0, dsm $$1, iu $$2, dqv $$3, jz $$4) {
      jz $$5 = $$4.c(-1, -1, -1);
      iu $$6 = a(iu.c, $$3, $$1, $$2);
      iu $$7 = a(iu.c.a($$5), $$3, $$1, $$2);
      return eqa.a($$6, $$7).a((jz)$$0);
   }

   public tx a(tx $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ud());
         $$0.a("palette", new ud());
      } else {
         List<euk.c> $$1 = Lists.newArrayList();
         euk.c $$2 = new euk.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new euk.c());
         }

         ud $$4 = new ud();
         List<euk.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            euk.d $$7 = $$5.get($$6);
            tx $$8 = new tx();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               euk.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ud $$12 = new ud();

            for (dzo $$13 : $$2) {
               $$12.add(um.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ud $$14 = new ud();

            for (euk.c $$15 : $$1) {
               ud $$16 = new ud();

               for (dzo $$17 : $$15) {
                  $$16.add(um.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ud $$18 = new ud();

      for (euk.e $$19 : this.m) {
         tx $$20 = new tx();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return um.e($$0);
   }

   public void a(jf<dlu> $$0, tx $$1) {
      this.l.clear();
      this.m.clear();
      ud $$2 = $$1.c("size", 3);
      this.n = new jz($$2.e(0), $$2.e(1), $$2.e(2));
      ud $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ud $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ud $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         tx $$8 = $$6.a($$7);
         ud $$9 = $$8.c("pos", 6);
         fdw $$10 = new fdw($$9.h(0), $$9.h(1), $$9.h(2));
         ud $$11 = $$8.c("blockPos", 3);
         iu $$12 = new iu($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            tx $$13 = $$8.p("nbt");
            this.m.add(new euk.e($$10, $$12, $$13));
         }
      }
   }

   private void a(jf<dlu> $$0, ud $$1, ud $$2) {
      euk.c $$3 = new euk.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(um.a($$0, $$1.a($$4)), $$4);
      }

      List<euk.d> $$5 = Lists.newArrayList();
      List<euk.d> $$6 = Lists.newArrayList();
      List<euk.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tx $$9 = $$2.a($$8);
         ud $$10 = $$9.c("pos", 3);
         iu $$11 = new iu($$10.e(0), $$10.e(1), $$10.e(2));
         dzo $$12 = $$3.a($$9.h("state"));
         tx $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         euk.d $$15 = new euk.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<euk.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new euk.b($$16));
   }

   private ud a(int... $$0) {
      ud $$1 = new ud();

      for (int $$2 : $$0) {
         $$1.add(uc.a($$2));
      }

      return $$1;
   }

   private ud a(double... $$0) {
      ud $$1 = new ud();

      for (double $$2 : $$0) {
         $$1.add(ty.a($$2));
      }

      return $$1;
   }

   public static dxr.a a(tx $$0, dzo $$1) {
      return dxr.a.c.a($$0.l("joint"), () -> dpz.o($$1).o().d() ? dxr.a.b : dxr.a.a);
   }

   public static record a(euk.d a, dxr.a b, ale c, ale d, ale e, int f, int g) {

      public static euk.a a(euk.d $$0) {
         tx $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new euk.a(
            $$0,
            euk.a($$1, $$0.b()),
            ale.a($$1.l("name")),
            ale.a($$1.l("pool")),
            ale.a($$1.l("target")),
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

      public euk.a b(euk.d $$0) {
         return new euk.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<euk.d> a;
      private final Map<dlu, List<euk.d>> b = Maps.newHashMap();
      @Nullable
      private List<euk.a> c;

      b(List<euk.d> $$0) {
         this.a = $$0;
      }

      public List<euk.a> a() {
         if (this.c == null) {
            this.c = this.a(dlw.pD).stream().map(euk.a::a).toList();
         }

         return this.c;
      }

      public List<euk.d> b() {
         return this.a;
      }

      public List<euk.d> a(dlu $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<dzo> {
      public static final dzo a = dlw.a.m();
      private final jk<dzo> b = new jk<>(16);
      private int c;

      public int a(dzo $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dzo a(int $$0) {
         dzo $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dzo> iterator() {
         return this.b.iterator();
      }

      public void a(dzo $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(iu a, dzo b, @Nullable tx c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fdw a;
      public final iu b;
      public final tx c;

      public e(fdw $$0, iu $$1, tx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
