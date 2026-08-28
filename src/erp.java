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

public class erp {
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
   private final List<erp.b> l = Lists.newArrayList();
   private final List<erp.e> m = Lists.newArrayList();
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

   public void a(dgj $$0, ji $$1, km $$2, boolean $$3, @Nullable djn $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ji $$5 = $$1.a($$2).b(-1, -1, -1);
         List<erp.d> $$6 = Lists.newArrayList();
         List<erp.d> $$7 = Lists.newArrayList();
         List<erp.d> $$8 = Lists.newArrayList();
         ji $$9 = new ji(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ji $$10 = new ji(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ji $$11 : ji.c($$9, $$10)) {
            ji $$12 = $$11.b($$9);
            dwy $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dua $$14 = $$0.c_($$11);
               erp.d $$15;
               if ($$14 != null) {
                  $$15 = new erp.d($$12, $$13, $$14.c($$0.K_()));
               } else {
                  $$15 = new erp.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<erp.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new erp.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(erp.d $$0, List<erp.d> $$1, List<erp.d> $$2, List<erp.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dfy.a, ji.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<erp.d> a(List<erp.d> $$0, List<erp.d> $$1, List<erp.d> $$2) {
      Comparator<erp.d> $$3 = Comparator.<erp.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<erp.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dgj $$0, ji $$1, ji $$2) {
      List<bum> $$3 = $$0.a(bum.class, faw.a($$1, $$2), $$0x -> !($$0x instanceof coy));
      this.m.clear();

      for (bum $$4 : $$3) {
         fbb $$5 = new fbb($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         tq $$6 = new tq();
         $$4.e($$6);
         ji $$7;
         if ($$4 instanceof cky) {
            $$7 = ((cky)$$4).p().b($$1);
         } else {
            $$7 = ji.a((kb)$$5);
         }

         this.m.add(new erp.e($$5, $$7, $$6.i()));
      }
   }

   public List<erp.d> a(ji $$0, erl $$1, djn $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<erp.a> a(ji $$0, dqf $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         erl $$2 = new erl().a($$1);
         List<erp.a> $$3 = $$2.a(this.l, $$0).a();
         List<erp.a> $$4 = new ArrayList<>($$3.size());

         for (erp.a $$5 : $$3) {
            erp.d $$6 = $$5.a;
            $$4.add($$5.b(new erp.d(a($$2, $$6.a()).a((km)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<erp.d> a(ji $$0, erl $$1, djn $$2, boolean $$3) {
      ObjectArrayList<erp.d> $$4 = new ObjectArrayList();
      enf $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (erp.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            ji $$7 = $$3 ? a($$1, $$6.a).a((km)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new erp.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ji a(erl $$0, ji $$1, erl $$2, ji $$3) {
      ji $$4 = a($$0, $$1);
      ji $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ji a(erl $$0, ji $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dha $$0, ji $$1, ji $$2, erl $$3, azh $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<erp.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            enf $$7 = $$3.g();
            List<ji> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ji> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ji, tq>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (erp.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ji $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eta $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dwy $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dua $$22 = $$0.c_($$19);
                     bsc.a($$22);
                     $$0.a($$19, djp.iu.m(), 20);
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
                        dua $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bsr) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.K_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dog) {
                           ((dog)$$21.b()).a($$0, $$19, $$21, $$20);
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
                  eta $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ji $$30 = $$27.a($$25[$$29]);
                     eta $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dwy $$32 = $$0.a_($$27);
                     djn $$33 = $$32.b();
                     if ($$33 instanceof dog) {
                        ((dog)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fbk $$34 = new fbe($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
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
                     dwy $$42 = $$0.a_($$41);
                     dwy $$43 = djn.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dua $$44 = $$0.c_($$41);
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

   public static void a(dgk $$0, int $$1, fbk $$2, ji $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dgk $$0, int $$1, fbk $$2, int $$3, int $$4, int $$5) {
      ji.a $$6 = new ji.a();
      ji.a $$7 = new ji.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dwy $$11 = $$0.a_($$6);
         dwy $$12 = $$0.a_($$7);
         dwy $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.H_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dwy $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.H_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<erp.d> a(dha $$0, ji $$1, ji $$2, erl $$3, List<erp.d> $$4) {
      List<erp.d> $$5 = new ArrayList<>();
      List<erp.d> $$6 = new ArrayList<>();

      for (erp.d $$7 : $$4) {
         ji $$8 = a($$3, $$7.a).a((km)$$1);
         erp.d $$9 = new erp.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<erm> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (erm $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dha $$0, ji $$1, dom $$2, dqf $$3, ji $$4, @Nullable enf $$5, boolean $$6) {
      for (erp.e $$7 : this.m) {
         ji $$8 = a($$7.b, $$2, $$3, $$4).a((km)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tq $$9 = $$7.c.i();
            fbb $$10 = a($$7.a, $$2, $$3, $$4);
            fbb $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
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
               if ($$6 && $$5x instanceof bvk) {
                  ((bvk)$$5x).a($$0, $$0.d_(ji.a((kb)$$11)), bus.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bum> a(dha $$0, tq $$1) {
      try {
         return but.a($$1, $$0.a(), bus.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public km a(dqf $$0) {
      switch ($$0) {
         case d:
         case b:
            return new km(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ji a(ji $$0, dom $$1, dqf $$2, ji $$3) {
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

   public static fbb a(fbb $$0, dom $$1, dqf $$2, ji $$3) {
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
            return new fbb((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fbb((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fbb((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fbb($$4, $$5, $$6) : $$0;
      }
   }

   public ji a(ji $$0, dom $$1, dqf $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ji a(ji $$0, dom $$1, dqf $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dom.c ? $$3 : 0;
      int $$6 = $$1 == dom.b ? $$4 : 0;
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

   public enf b(erl $$0, ji $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public enf a(ji $$0, dqf $$1, ji $$2, dom $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static enf a(ji $$0, dqf $$1, ji $$2, dom $$3, km $$4) {
      km $$5 = $$4.c(-1, -1, -1);
      ji $$6 = a(ji.c, $$3, $$1, $$2);
      ji $$7 = a(ji.c.a($$5), $$3, $$1, $$2);
      return enf.a($$6, $$7).a((km)$$0);
   }

   public tq a(tq $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new tw());
         $$0.a("palette", new tw());
      } else {
         List<erp.c> $$1 = Lists.newArrayList();
         erp.c $$2 = new erp.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new erp.c());
         }

         tw $$4 = new tw();
         List<erp.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            erp.d $$7 = $$5.get($$6);
            tq $$8 = new tq();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               erp.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            tw $$12 = new tw();

            for (dwy $$13 : $$2) {
               $$12.add(uf.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            tw $$14 = new tw();

            for (erp.c $$15 : $$1) {
               tw $$16 = new tw();

               for (dwy $$17 : $$15) {
                  $$16.add(uf.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      tw $$18 = new tw();

      for (erp.e $$19 : this.m) {
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

   public void a(js<djn> $$0, tq $$1) {
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
         fbb $$10 = new fbb($$9.h(0), $$9.h(1), $$9.h(2));
         tw $$11 = $$8.c("blockPos", 3);
         ji $$12 = new ji($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            tq $$13 = $$8.p("nbt");
            this.m.add(new erp.e($$10, $$12, $$13));
         }
      }
   }

   private void a(js<djn> $$0, tw $$1, tw $$2) {
      erp.c $$3 = new erp.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uf.a($$0, $$1.a($$4)), $$4);
      }

      List<erp.d> $$5 = Lists.newArrayList();
      List<erp.d> $$6 = Lists.newArrayList();
      List<erp.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tq $$9 = $$2.a($$8);
         tw $$10 = $$9.c("pos", 3);
         ji $$11 = new ji($$10.e(0), $$10.e(1), $$10.e(2));
         dwy $$12 = $$3.a($$9.h("state"));
         tq $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         erp.d $$15 = new erp.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<erp.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new erp.b($$16));
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

   public static dvd.a a(tq $$0, dwy $$1) {
      return dvd.a.c.a($$0.l("joint"), () -> dnr.o($$1).o().d() ? dvd.a.b : dvd.a.a);
   }

   public static record a(erp.d a, dvd.a b, akv c, akv d, akv e, int f, int g) {

      public static erp.a a(erp.d $$0) {
         tq $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new erp.a(
            $$0,
            erp.a($$1, $$0.b()),
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

      public erp.a b(erp.d $$0) {
         return new erp.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<erp.d> a;
      private final Map<djn, List<erp.d>> b = Maps.newHashMap();
      @Nullable
      private List<erp.a> c;

      b(List<erp.d> $$0) {
         this.a = $$0;
      }

      public List<erp.a> a() {
         if (this.c == null) {
            this.c = this.a(djp.pD).stream().map(erp.a::a).toList();
         }

         return this.c;
      }

      public List<erp.d> b() {
         return this.a;
      }

      public List<erp.d> a(djn $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<dwy> {
      public static final dwy a = djp.a.m();
      private final jx<dwy> b = new jx<>(16);
      private int c;

      public int a(dwy $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dwy a(int $$0) {
         dwy $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dwy> iterator() {
         return this.b.iterator();
      }

      public void a(dwy $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(ji a, dwy b, @Nullable tq c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fbb a;
      public final ji b;
      public final tq c;

      public e(fbb $$0, ji $$1, tq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
