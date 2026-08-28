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

public class ern {
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
   private final List<ern.b> l = Lists.newArrayList();
   private final List<ern.e> m = Lists.newArrayList();
   private km n = km.h;
   private String o = "?";

   public km a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dgh $$0, ji $$1, km $$2, boolean $$3, @Nullable djl $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ji $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ern.d> $$6 = Lists.newArrayList();
         List<ern.d> $$7 = Lists.newArrayList();
         List<ern.d> $$8 = Lists.newArrayList();
         ji $$9 = new ji(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ji $$10 = new ji(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ji $$11 : ji.c($$9, $$10)) {
            ji $$12 = $$11.b($$9);
            dww $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dty $$14 = $$0.c_($$11);
               ern.d $$15;
               if ($$14 != null) {
                  $$15 = new ern.d($$12, $$13, $$14.c($$0.K_()));
               } else {
                  $$15 = new ern.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ern.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ern.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ern.d $$0, List<ern.d> $$1, List<ern.d> $$2, List<ern.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dfw.a, ji.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ern.d> a(List<ern.d> $$0, List<ern.d> $$1, List<ern.d> $$2) {
      Comparator<ern.d> $$3 = Comparator.<ern.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ern.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dgh $$0, ji $$1, ji $$2) {
      List<buk> $$3 = $$0.a(buk.class, fau.a($$1, $$2), $$0x -> !($$0x instanceof cow));
      this.m.clear();

      for (buk $$4 : $$3) {
         faz $$5 = new faz($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         tq $$6 = new tq();
         $$4.e($$6);
         ji $$7;
         if ($$4 instanceof ckw) {
            $$7 = ((ckw)$$4).p().b($$1);
         } else {
            $$7 = ji.a((kb)$$5);
         }

         this.m.add(new ern.e($$5, $$7, $$6.i()));
      }
   }

   public List<ern.d> a(ji $$0, erj $$1, djl $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<ern.a> a(ji $$0, dqd $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         erj $$2 = new erj().a($$1);
         List<ern.a> $$3 = $$2.a(this.l, $$0).a();
         List<ern.a> $$4 = new ArrayList<>($$3.size());

         for (ern.a $$5 : $$3) {
            ern.d $$6 = $$5.a;
            $$4.add($$5.b(new ern.d(a($$2, $$6.a()).a((km)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<ern.d> a(ji $$0, erj $$1, djl $$2, boolean $$3) {
      ObjectArrayList<ern.d> $$4 = new ObjectArrayList();
      end $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ern.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            ji $$7 = $$3 ? a($$1, $$6.a).a((km)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ern.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ji a(erj $$0, ji $$1, erj $$2, ji $$3) {
      ji $$4 = a($$0, $$1);
      ji $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ji a(erj $$0, ji $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dgy $$0, ji $$1, ji $$2, erj $$3, azh $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ern.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            end $$7 = $$3.g();
            List<ji> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ji> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ji, tq>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ern.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ji $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  esy $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dww $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dty $$22 = $$0.c_($$19);
                     bsa.a($$22);
                     $$0.a($$19, djn.iu.m(), 20);
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
                        dty $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bsp) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.K_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof doe) {
                           ((doe)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            jn[] $$25 = new jn[]{jn.b, jn.c, jn.f, jn.d, jn.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<ji> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  ji $$27 = $$26.next();
                  esy $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ji $$30 = $$27.a($$25[$$29]);
                     esy $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dww $$32 = $$0.a_($$27);
                     djl $$33 = $$32.b();
                     if ($$33 instanceof doe) {
                        ((doe)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fbi $$34 = new fbc($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<ji, tq> $$38 : $$10) {
                     ji $$39 = (ji)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<ji, tq> $$40 : $$10) {
                  ji $$41 = (ji)$$40.getFirst();
                  if (!$$3.h()) {
                     dww $$42 = $$0.a_($$41);
                     dww $$43 = djl.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dty $$44 = $$0.c_($$41);
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

   public static void a(dgi $$0, int $$1, fbi $$2, ji $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dgi $$0, int $$1, fbi $$2, int $$3, int $$4, int $$5) {
      ji.a $$6 = new ji.a();
      ji.a $$7 = new ji.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dww $$11 = $$0.a_($$6);
         dww $$12 = $$0.a_($$7);
         dww $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.H_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dww $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.H_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<ern.d> a(dgy $$0, ji $$1, ji $$2, erj $$3, List<ern.d> $$4) {
      List<ern.d> $$5 = new ArrayList<>();
      List<ern.d> $$6 = new ArrayList<>();

      for (ern.d $$7 : $$4) {
         ji $$8 = a($$3, $$7.a).a((km)$$1);
         ern.d $$9 = new ern.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<erk> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (erk $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dgy $$0, ji $$1, dok $$2, dqd $$3, ji $$4, @Nullable end $$5, boolean $$6) {
      for (ern.e $$7 : this.m) {
         ji $$8 = a($$7.b, $$2, $$3, $$4).a((km)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tq $$9 = $$7.c.i();
            faz $$10 = a($$7.a, $$2, $$3, $$4);
            faz $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            tw $$12 = new tw();
            $$12.add(tr.a($$11.d));
            $$12.add(tr.a($$11.e));
            $$12.add(tr.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dL();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dN());
               if ($$6 && $$5x instanceof bvi) {
                  ((bvi)$$5x).a($$0, $$0.d_(ji.a((kb)$$11)), buq.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<buk> a(dgy $$0, tq $$1) {
      try {
         return bur.a($$1, $$0.a(), buq.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public km a(dqd $$0) {
      switch ($$0) {
         case d:
         case b:
            return new km(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ji a(ji $$0, dok $$1, dqd $$2, ji $$3) {
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
            return new ji($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new ji($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new ji($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new ji($$4, $$5, $$6) : $$0;
      }
   }

   public static faz a(faz $$0, dok $$1, dqd $$2, ji $$3) {
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
            return new faz((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new faz((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new faz((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new faz($$4, $$5, $$6) : $$0;
      }
   }

   public ji a(ji $$0, dok $$1, dqd $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ji a(ji $$0, dok $$1, dqd $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dok.c ? $$3 : 0;
      int $$6 = $$1 == dok.b ? $$4 : 0;
      ji $$7 = $$0;
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

   public end b(erj $$0, ji $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public end a(ji $$0, dqd $$1, ji $$2, dok $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static end a(ji $$0, dqd $$1, ji $$2, dok $$3, km $$4) {
      km $$5 = $$4.c(-1, -1, -1);
      ji $$6 = a(ji.c, $$3, $$1, $$2);
      ji $$7 = a(ji.c.a($$5), $$3, $$1, $$2);
      return end.a($$6, $$7).a((km)$$0);
   }

   public tq a(tq $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new tw());
         $$0.a("palette", new tw());
      } else {
         List<ern.c> $$1 = Lists.newArrayList();
         ern.c $$2 = new ern.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ern.c());
         }

         tw $$4 = new tw();
         List<ern.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ern.d $$7 = $$5.get($$6);
            tq $$8 = new tq();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ern.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            tw $$12 = new tw();

            for (dww $$13 : $$2) {
               $$12.add(uf.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            tw $$14 = new tw();

            for (ern.c $$15 : $$1) {
               tw $$16 = new tw();

               for (dww $$17 : $$15) {
                  $$16.add(uf.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      tw $$18 = new tw();

      for (ern.e $$19 : this.m) {
         tq $$20 = new tq();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return uf.e($$0);
   }

   public void a(js<djl> $$0, tq $$1) {
      this.l.clear();
      this.m.clear();
      tw $$2 = $$1.c("size", 3);
      this.n = new km($$2.e(0), $$2.e(1), $$2.e(2));
      tw $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         tw $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      tw $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         tq $$8 = $$6.a($$7);
         tw $$9 = $$8.c("pos", 6);
         faz $$10 = new faz($$9.h(0), $$9.h(1), $$9.h(2));
         tw $$11 = $$8.c("blockPos", 3);
         ji $$12 = new ji($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            tq $$13 = $$8.p("nbt");
            this.m.add(new ern.e($$10, $$12, $$13));
         }
      }
   }

   private void a(js<djl> $$0, tw $$1, tw $$2) {
      ern.c $$3 = new ern.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uf.a($$0, $$1.a($$4)), $$4);
      }

      List<ern.d> $$5 = Lists.newArrayList();
      List<ern.d> $$6 = Lists.newArrayList();
      List<ern.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tq $$9 = $$2.a($$8);
         tw $$10 = $$9.c("pos", 3);
         ji $$11 = new ji($$10.e(0), $$10.e(1), $$10.e(2));
         dww $$12 = $$3.a($$9.h("state"));
         tq $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ern.d $$15 = new ern.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ern.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new ern.b($$16));
   }

   private tw a(int... $$0) {
      tw $$1 = new tw();

      for (int $$2 : $$0) {
         $$1.add(tv.a($$2));
      }

      return $$1;
   }

   private tw a(double... $$0) {
      tw $$1 = new tw();

      for (double $$2 : $$0) {
         $$1.add(tr.a($$2));
      }

      return $$1;
   }

   public static dvb.a a(tq $$0, dww $$1) {
      return dvb.a.c.a($$0.l("joint"), () -> dnp.o($$1).o().d() ? dvb.a.b : dvb.a.a);
   }

   public static record a(ern.d a, dvb.a b, akv c, akv d, akv e, int f, int g) {

      public static ern.a a(ern.d $$0) {
         tq $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new ern.a(
            $$0,
            ern.a($$1, $$0.b()),
            akv.a($$1.l("name")),
            akv.a($$1.l("pool")),
            akv.a($$1.l("target")),
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

      public ern.a b(ern.d $$0) {
         return new ern.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<ern.d> a;
      private final Map<djl, List<ern.d>> b = Maps.newHashMap();
      @Nullable
      private List<ern.a> c;

      b(List<ern.d> $$0) {
         this.a = $$0;
      }

      public List<ern.a> a() {
         if (this.c == null) {
            this.c = this.a(djn.pD).stream().map(ern.a::a).toList();
         }

         return this.c;
      }

      public List<ern.d> b() {
         return this.a;
      }

      public List<ern.d> a(djl $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<dww> {
      public static final dww a = djn.a.m();
      private final jx<dww> b = new jx<>(16);
      private int c;

      public int a(dww $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dww a(int $$0) {
         dww $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dww> iterator() {
         return this.b.iterator();
      }

      public void a(dww $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(ji a, dww b, @Nullable tq c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final faz a;
      public final ji b;
      public final tq c;

      public e(faz $$0, ji $$1, tq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
