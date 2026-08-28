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

public class esl {
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
   private final List<esl.b> l = Lists.newArrayList();
   private final List<esl.e> m = Lists.newArrayList();
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

   public void a(dgz $$0, ji $$1, km $$2, boolean $$3, @Nullable dke $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ji $$5 = $$1.a($$2).b(-1, -1, -1);
         List<esl.d> $$6 = Lists.newArrayList();
         List<esl.d> $$7 = Lists.newArrayList();
         List<esl.d> $$8 = Lists.newArrayList();
         ji $$9 = new ji(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ji $$10 = new ji(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ji $$11 : ji.c($$9, $$10)) {
            ji $$12 = $$11.b($$9);
            dxq $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dus $$14 = $$0.c_($$11);
               esl.d $$15;
               if ($$14 != null) {
                  $$15 = new esl.d($$12, $$13, $$14.c($$0.F_()));
               } else {
                  $$15 = new esl.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<esl.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new esl.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(esl.d $$0, List<esl.d> $$1, List<esl.d> $$2, List<esl.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dgp.a, ji.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<esl.d> a(List<esl.d> $$0, List<esl.d> $$1, List<esl.d> $$2) {
      Comparator<esl.d> $$3 = Comparator.<esl.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<esl.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dgz $$0, ji $$1, ji $$2) {
      List<bva> $$3 = $$0.a(bva.class, fbs.a($$1, $$2), $$0x -> !($$0x instanceof cpr));
      this.m.clear();

      for (bva $$4 : $$3) {
         fbx $$5 = new fbx($$4.dz() - (double)$$1.u(), $$4.dB() - (double)$$1.v(), $$4.dF() - (double)$$1.w());
         tq $$6 = new tq();
         $$4.e($$6);
         ji $$7;
         if ($$4 instanceof clr) {
            $$7 = ((clr)$$4).j().b($$1);
         } else {
            $$7 = ji.a((kb)$$5);
         }

         this.m.add(new esl.e($$5, $$7, $$6.i()));
      }
   }

   public List<esl.d> a(ji $$0, esh $$1, dke $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<esl.a> a(ji $$0, dqw $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         esh $$2 = new esh().a($$1);
         List<esl.a> $$3 = $$2.a(this.l, $$0).a();
         List<esl.a> $$4 = new ArrayList<>($$3.size());

         for (esl.a $$5 : $$3) {
            esl.d $$6 = $$5.a;
            $$4.add($$5.b(new esl.d(a($$2, $$6.a()).a((km)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<esl.d> a(ji $$0, esh $$1, dke $$2, boolean $$3) {
      ObjectArrayList<esl.d> $$4 = new ObjectArrayList();
      eob $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (esl.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            ji $$7 = $$3 ? a($$1, $$6.a).a((km)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new esl.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ji a(esh $$0, ji $$1, esh $$2, ji $$3) {
      ji $$4 = a($$0, $$1);
      ji $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ji a(esh $$0, ji $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dhq $$0, ji $$1, ji $$2, esh $$3, azh $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<esl.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eob $$7 = $$3.g();
            List<ji> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ji> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ji, tq>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (esl.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ji $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  etw $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dxq $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     $$0.a($$19, dkg.iu.m(), 308);
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
                        dus $$22 = $$0.c_($$19);
                        if ($$22 != null) {
                           if ($$22 instanceof bte) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$22.c($$18.c, $$0.F_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof doz) {
                           ((doz)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$23 = true;
            jn[] $$24 = new jn[]{jn.b, jn.c, jn.f, jn.d, jn.e};

            while ($$23 && !$$8.isEmpty()) {
               $$23 = false;
               Iterator<ji> $$25 = $$8.iterator();

               while ($$25.hasNext()) {
                  ji $$26 = $$25.next();
                  etw $$27 = $$0.b_($$26);

                  for (int $$28 = 0; $$28 < $$24.length && !$$27.b(); $$28++) {
                     ji $$29 = $$26.a($$24[$$28]);
                     etw $$30 = $$0.b_($$29);
                     if ($$30.b() && !$$9.contains($$29)) {
                        $$27 = $$30;
                     }
                  }

                  if ($$27.b()) {
                     dxq $$31 = $$0.a_($$26);
                     dke $$32 = $$31.b();
                     if ($$32 instanceof doz) {
                        ((doz)$$32).a($$0, $$26, $$31, $$27);
                        $$23 = true;
                        $$25.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fcg $$33 = new fca($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$34 = $$11;
                  int $$35 = $$12;
                  int $$36 = $$13;

                  for (Pair<ji, tq> $$37 : $$10) {
                     ji $$38 = (ji)$$37.getFirst();
                     $$33.c($$38.u() - $$34, $$38.v() - $$35, $$38.w() - $$36);
                  }

                  a($$0, $$5, $$33, $$34, $$35, $$36);
               }

               for (Pair<ji, tq> $$39 : $$10) {
                  ji $$40 = (ji)$$39.getFirst();
                  if (!$$3.h()) {
                     dxq $$41 = $$0.a_($$40);
                     dxq $$42 = dke.b($$41, $$0, $$40);
                     if ($$41 != $$42) {
                        $$0.a($$40, $$42, $$5 & -2 | 16);
                     }

                     $$0.a($$40, $$42.b());
                  }

                  if ($$39.getSecond() != null) {
                     dus $$43 = $$0.c_($$40);
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

   public static void a(dha $$0, int $$1, fcg $$2, ji $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dha $$0, int $$1, fcg $$2, int $$3, int $$4, int $$5) {
      ji.a $$6 = new ji.a();
      ji.a $$7 = new ji.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dxq $$11 = $$0.a_($$6);
         dxq $$12 = $$0.a_($$7);
         dxq $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.C_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dxq $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.C_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<esl.d> a(dhq $$0, ji $$1, ji $$2, esh $$3, List<esl.d> $$4) {
      List<esl.d> $$5 = new ArrayList<>();
      List<esl.d> $$6 = new ArrayList<>();

      for (esl.d $$7 : $$4) {
         ji $$8 = a($$3, $$7.a).a((km)$$1);
         esl.d $$9 = new esl.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<esi> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (esi $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dhq $$0, ji $$1, dpf $$2, dqw $$3, ji $$4, @Nullable eob $$5, boolean $$6) {
      for (esl.e $$7 : this.m) {
         ji $$8 = a($$7.b, $$2, $$3, $$4).a((km)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tq $$9 = $$7.c.i();
            fbx $$10 = a($$7.a, $$2, $$3, $$4);
            fbx $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            tw $$12 = new tw();
            $$12.add(tr.a($$11.d));
            $$12.add(tr.a($$11.e));
            $$12.add(tr.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dK();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dM());
               if ($$6 && $$5x instanceof bwa) {
                  ((bwa)$$5x).a($$0, $$0.d_(ji.a((kb)$$11)), bvh.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bva> a(dhq $$0, tq $$1) {
      try {
         return bvi.a($$1, $$0.a(), bvh.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public km a(dqw $$0) {
      switch ($$0) {
         case d:
         case b:
            return new km(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ji a(ji $$0, dpf $$1, dqw $$2, ji $$3) {
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

   public static fbx a(fbx $$0, dpf $$1, dqw $$2, ji $$3) {
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
            return new fbx((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fbx((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fbx((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fbx($$4, $$5, $$6) : $$0;
      }
   }

   public ji a(ji $$0, dpf $$1, dqw $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ji a(ji $$0, dpf $$1, dqw $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dpf.c ? $$3 : 0;
      int $$6 = $$1 == dpf.b ? $$4 : 0;
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

   public eob b(esh $$0, ji $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eob a(ji $$0, dqw $$1, ji $$2, dpf $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eob a(ji $$0, dqw $$1, ji $$2, dpf $$3, km $$4) {
      km $$5 = $$4.c(-1, -1, -1);
      ji $$6 = a(ji.c, $$3, $$1, $$2);
      ji $$7 = a(ji.c.a($$5), $$3, $$1, $$2);
      return eob.a($$6, $$7).a((km)$$0);
   }

   public tq a(tq $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new tw());
         $$0.a("palette", new tw());
      } else {
         List<esl.c> $$1 = Lists.newArrayList();
         esl.c $$2 = new esl.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new esl.c());
         }

         tw $$4 = new tw();
         List<esl.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            esl.d $$7 = $$5.get($$6);
            tq $$8 = new tq();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               esl.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            tw $$12 = new tw();

            for (dxq $$13 : $$2) {
               $$12.add(uf.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            tw $$14 = new tw();

            for (esl.c $$15 : $$1) {
               tw $$16 = new tw();

               for (dxq $$17 : $$15) {
                  $$16.add(uf.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      tw $$18 = new tw();

      for (esl.e $$19 : this.m) {
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

   public void a(js<dke> $$0, tq $$1) {
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
         fbx $$10 = new fbx($$9.h(0), $$9.h(1), $$9.h(2));
         tw $$11 = $$8.c("blockPos", 3);
         ji $$12 = new ji($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            tq $$13 = $$8.p("nbt");
            this.m.add(new esl.e($$10, $$12, $$13));
         }
      }
   }

   private void a(js<dke> $$0, tw $$1, tw $$2) {
      esl.c $$3 = new esl.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uf.a($$0, $$1.a($$4)), $$4);
      }

      List<esl.d> $$5 = Lists.newArrayList();
      List<esl.d> $$6 = Lists.newArrayList();
      List<esl.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tq $$9 = $$2.a($$8);
         tw $$10 = $$9.c("pos", 3);
         ji $$11 = new ji($$10.e(0), $$10.e(1), $$10.e(2));
         dxq $$12 = $$3.a($$9.h("state"));
         tq $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         esl.d $$15 = new esl.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<esl.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new esl.b($$16));
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

   public static dvv.a a(tq $$0, dxq $$1) {
      return dvv.a.c.a($$0.l("joint"), () -> doj.o($$1).o().d() ? dvv.a.b : dvv.a.a);
   }

   public static record a(esl.d a, dvv.a b, aku c, aku d, aku e, int f, int g) {

      public static esl.a a(esl.d $$0) {
         tq $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new esl.a(
            $$0,
            esl.a($$1, $$0.b()),
            aku.a($$1.l("name")),
            aku.a($$1.l("pool")),
            aku.a($$1.l("target")),
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

      public esl.a b(esl.d $$0) {
         return new esl.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<esl.d> a;
      private final Map<dke, List<esl.d>> b = Maps.newHashMap();
      @Nullable
      private List<esl.a> c;

      b(List<esl.d> $$0) {
         this.a = $$0;
      }

      public List<esl.a> a() {
         if (this.c == null) {
            this.c = this.a(dkg.pD).stream().map(esl.a::a).toList();
         }

         return this.c;
      }

      public List<esl.d> b() {
         return this.a;
      }

      public List<esl.d> a(dke $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<dxq> {
      public static final dxq a = dkg.a.m();
      private final jx<dxq> b = new jx<>(16);
      private int c;

      public int a(dxq $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dxq a(int $$0) {
         dxq $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dxq> iterator() {
         return this.b.iterator();
      }

      public void a(dxq $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(ji a, dxq b, @Nullable tq c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fbx a;
      public final ji b;
      public final tq c;

      public e(fbx $$0, ji $$1, tq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
