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

public class ent {
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
   private final List<ent.a> l = Lists.newArrayList();
   private final List<ent.d> m = Lists.newArrayList();
   private jv n = jv.g;
   private String o = "?";

   public jv a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dca $$0, ir $$1, jv $$2, boolean $$3, @Nullable dfc $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ir $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ent.c> $$6 = Lists.newArrayList();
         List<ent.c> $$7 = Lists.newArrayList();
         List<ent.c> $$8 = Lists.newArrayList();
         ir $$9 = new ir(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ir $$10 = new ir(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ir $$11 : ir.c($$9, $$10)) {
            ir $$12 = $$11.b($$9);
            dtc $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dqc $$14 = $$0.c_($$11);
               ent.c $$15;
               if ($$14 != null) {
                  $$15 = new ent.c($$12, $$13, $$14.c($$0.I_()));
               } else {
                  $$15 = new ent.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ent.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ent.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ent.c $$0, List<ent.c> $$1, List<ent.c> $$2, List<ent.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(dbp.a, ir.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ent.c> a(List<ent.c> $$0, List<ent.c> $$1, List<ent.c> $$2) {
      Comparator<ent.c> $$3 = Comparator.<ent.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ent.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dca $$0, ir $$1, ir $$2) {
      List<brv> $$3 = $$0.a(brv.class, ewp.a($$1, $$2), $$0x -> !($$0x instanceof cly));
      this.m.clear();

      for (brv $$4 : $$3) {
         ewu $$5 = new ewu($$4.dz() - (double)$$1.u(), $$4.dB() - (double)$$1.v(), $$4.dF() - (double)$$1.w());
         uk $$6 = new uk();
         $$4.e($$6);
         ir $$7;
         if ($$4 instanceof cib) {
            $$7 = ((cib)$$4).D().b($$1);
         } else {
            $$7 = ir.a($$5);
         }

         this.m.add(new ent.d($$5, $$7, $$6.h()));
      }
   }

   public List<ent.c> a(ir $$0, enp $$1, dfc $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<ent.c> a(ir $$0, enp $$1, dfc $$2, boolean $$3) {
      ObjectArrayList<ent.c> $$4 = new ObjectArrayList();
      ejl $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ent.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            ir $$7 = $$3 ? a($$1, $$6.a).a((jv)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ent.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ir a(enp $$0, ir $$1, enp $$2, ir $$3) {
      ir $$4 = a($$0, $$1);
      ir $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ir a(enp $$0, ir $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dcp $$0, ir $$1, ir $$2, enp $$3, ayt $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ent.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            ejl $$7 = $$3.g();
            List<ir> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ir> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ir, uk>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ent.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ir $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  epe $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dtc $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dqc $$22 = $$0.c_($$19);
                     bpr.a_($$22);
                     $$0.a($$19, dfe.iQ.n(), 20);
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
                        dqc $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bqi) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c, $$0.I_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof djx) {
                           ((djx)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            iw[] $$25 = new iw[]{iw.b, iw.c, iw.f, iw.d, iw.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<ir> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  ir $$27 = $$26.next();
                  epe $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ir $$30 = $$27.a($$25[$$29]);
                     epe $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dtc $$32 = $$0.a_($$27);
                     dfc $$33 = $$32.b();
                     if ($$33 instanceof djx) {
                        ((djx)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  exd $$34 = new ewx($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<ir, uk> $$38 : $$10) {
                     ir $$39 = (ir)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<ir, uk> $$40 : $$10) {
                  ir $$41 = (ir)$$40.getFirst();
                  if (!$$3.h()) {
                     dtc $$42 = $$0.a_($$41);
                     dtc $$43 = dfc.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dqc $$44 = $$0.c_($$41);
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

   public static void a(dcb $$0, int $$1, exd $$2, ir $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dcb $$0, int $$1, exd $$2, int $$3, int $$4, int $$5) {
      ir.a $$6 = new ir.a();
      ir.a $$7 = new ir.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dtc $$11 = $$0.a_($$6);
         dtc $$12 = $$0.a_($$7);
         dtc $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dtc $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<ent.c> a(dcp $$0, ir $$1, ir $$2, enp $$3, List<ent.c> $$4) {
      List<ent.c> $$5 = new ArrayList<>();
      List<ent.c> $$6 = new ArrayList<>();

      for (ent.c $$7 : $$4) {
         ir $$8 = a($$3, $$7.a).a((jv)$$1);
         ent.c $$9 = new ent.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<enq> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (enq $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dcp $$0, ir $$1, dke $$2, dmd $$3, ir $$4, @Nullable ejl $$5, boolean $$6) {
      for (ent.d $$7 : this.m) {
         ir $$8 = a($$7.b, $$2, $$3, $$4).a((jv)$$1);
         if ($$5 == null || $$5.b($$8)) {
            uk $$9 = $$7.c.h();
            ewu $$10 = a($$7.a, $$2, $$3, $$4);
            ewu $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            uq $$12 = new uq();
            $$12.add(ul.a($$11.c));
            $$12.add(ul.a($$11.d));
            $$12.add(ul.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dK();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dM());
               if ($$6 && $$5x instanceof bsq) {
                  ((bsq)$$5x).a($$0, $$0.d_(ir.a($$11)), bss.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<brv> a(dcp $$0, uk $$1) {
      try {
         return bsb.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public jv a(dmd $$0) {
      switch ($$0) {
         case d:
         case b:
            return new jv(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ir a(ir $$0, dke $$1, dmd $$2, ir $$3) {
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
            return new ir($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new ir($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new ir($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new ir($$4, $$5, $$6) : $$0;
      }
   }

   public static ewu a(ewu $$0, dke $$1, dmd $$2, ir $$3) {
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
            return new ewu((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ewu((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ewu((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ewu($$4, $$5, $$6) : $$0;
      }
   }

   public ir a(ir $$0, dke $$1, dmd $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ir a(ir $$0, dke $$1, dmd $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dke.c ? $$3 : 0;
      int $$6 = $$1 == dke.b ? $$4 : 0;
      ir $$7 = $$0;
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

   public ejl b(enp $$0, ir $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public ejl a(ir $$0, dmd $$1, ir $$2, dke $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static ejl a(ir $$0, dmd $$1, ir $$2, dke $$3, jv $$4) {
      jv $$5 = $$4.c(-1, -1, -1);
      ir $$6 = a(ir.c, $$3, $$1, $$2);
      ir $$7 = a(ir.c.a($$5), $$3, $$1, $$2);
      return ejl.a($$6, $$7).a((jv)$$0);
   }

   public uk a(uk $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new uq());
         $$0.a("palette", new uq());
      } else {
         List<ent.b> $$1 = Lists.newArrayList();
         ent.b $$2 = new ent.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ent.b());
         }

         uq $$4 = new uq();
         List<ent.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ent.c $$7 = $$5.get($$6);
            uk $$8 = new uk();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ent.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            uq $$12 = new uq();

            for (dtc $$13 : $$2) {
               $$12.add(uz.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            uq $$14 = new uq();

            for (ent.b $$15 : $$1) {
               uq $$16 = new uq();

               for (dtc $$17 : $$15) {
                  $$16.add(uz.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      uq $$18 = new uq();

      for (ent.d $$19 : this.m) {
         uk $$20 = new uk();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return uz.e($$0);
   }

   public void a(jb<dfc> $$0, uk $$1) {
      this.l.clear();
      this.m.clear();
      uq $$2 = $$1.c("size", 3);
      this.n = new jv($$2.e(0), $$2.e(1), $$2.e(2));
      uq $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         uq $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      uq $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         uk $$8 = $$6.a($$7);
         uq $$9 = $$8.c("pos", 6);
         ewu $$10 = new ewu($$9.h(0), $$9.h(1), $$9.h(2));
         uq $$11 = $$8.c("blockPos", 3);
         ir $$12 = new ir($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            uk $$13 = $$8.p("nbt");
            this.m.add(new ent.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jb<dfc> $$0, uq $$1, uq $$2) {
      ent.b $$3 = new ent.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uz.a($$0, $$1.a($$4)), $$4);
      }

      List<ent.c> $$5 = Lists.newArrayList();
      List<ent.c> $$6 = Lists.newArrayList();
      List<ent.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         uk $$9 = $$2.a($$8);
         uq $$10 = $$9.c("pos", 3);
         ir $$11 = new ir($$10.e(0), $$10.e(1), $$10.e(2));
         dtc $$12 = $$3.a($$9.h("state"));
         uk $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ent.c $$15 = new ent.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ent.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new ent.a($$16));
   }

   private uq a(int... $$0) {
      uq $$1 = new uq();

      for (int $$2 : $$0) {
         $$1.add(up.a($$2));
      }

      return $$1;
   }

   private uq a(double... $$0) {
      uq $$1 = new uq();

      for (double $$2 : $$0) {
         $$1.add(ul.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<ent.c> a;
      private final Map<dfc, List<ent.c>> b = Maps.newHashMap();

      a(List<ent.c> $$0) {
         this.a = $$0;
      }

      public List<ent.c> a() {
         return this.a;
      }

      public List<ent.c> a(dfc $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dtc> {
      public static final dtc a = dfe.a.n();
      private final jg<dtc> b = new jg<>(16);
      private int c;

      public int a(dtc $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dtc a(int $$0) {
         dtc $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dtc> iterator() {
         return this.b.iterator();
      }

      public void a(dtc $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(ir a, dtc b, @Nullable uk c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ewu a;
      public final ir b;
      public final uk c;

      public d(ewu $$0, ir $$1, uk $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
