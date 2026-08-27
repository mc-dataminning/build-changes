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

public class edo {
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
   private final List<edo.a> l = Lists.newArrayList();
   private final List<edo.d> m = Lists.newArrayList();
   private jb n = jb.g;
   private String o = "?";

   public jb a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(ctx $$0, hx $$1, jb $$2, boolean $$3, @Nullable cwy $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         hx $$5 = $$1.a($$2).b(-1, -1, -1);
         List<edo.c> $$6 = Lists.newArrayList();
         List<edo.c> $$7 = Lists.newArrayList();
         List<edo.c> $$8 = Lists.newArrayList();
         hx $$9 = new hx(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         hx $$10 = new hx(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (hx $$11 : hx.a($$9, $$10)) {
            hx $$12 = $$11.b($$9);
            djp $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dhd $$14 = $$0.c_($$11);
               edo.c $$15;
               if ($$14 != null) {
                  $$15 = new edo.c($$12, $$13, $$14.p());
               } else {
                  $$15 = new edo.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<edo.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new edo.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(edo.c $$0, List<edo.c> $$1, List<edo.c> $$2, List<edo.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(ctm.a, hx.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<edo.c> a(List<edo.c> $$0, List<edo.c> $$1, List<edo.c> $$2) {
      Comparator<edo.c> $$3 = Comparator.<edo.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<edo.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(ctx $$0, hx $$1, hx $$2) {
      List<blw> $$3 = $$0.a(blw.class, elx.a($$1, $$2), $$0x -> !($$0x instanceof cfq));
      this.m.clear();

      for (blw $$4 : $$3) {
         emc $$5 = new emc($$4.dq() - (double)$$1.u(), $$4.ds() - (double)$$1.v(), $$4.dw() - (double)$$1.w());
         so $$6 = new so();
         $$4.e($$6);
         hx $$7;
         if ($$4 instanceof cbw) {
            $$7 = ((cbw)$$4).E().b($$1);
         } else {
            $$7 = hx.a($$5);
         }

         this.m.add(new edo.d($$5, $$7, $$6.h()));
      }
   }

   public List<edo.c> a(hx $$0, edk $$1, cwy $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<edo.c> a(hx $$0, edk $$1, cwy $$2, boolean $$3) {
      ObjectArrayList<edo.c> $$4 = new ObjectArrayList();
      dzg $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (edo.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            hx $$7 = $$3 ? a($$1, $$6.a).a((jb)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new edo.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public hx a(edk $$0, hx $$1, edk $$2, hx $$3) {
      hx $$4 = a($$0, $$1);
      hx $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static hx a(edk $$0, hx $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(cum $$0, hx $$1, hx $$2, edk $$3, auw $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<edo.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dzg $$7 = $$3.g();
            List<hx> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<hx> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<hx, so>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (edo.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               hx $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eez $$20 = $$3.j() ? $$0.b_($$19) : null;
                  djp $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dhd $$22 = $$0.c_($$19);
                     bjt.a_($$22);
                     $$0.a($$19, cxa.hW.o(), 20);
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
                        dhd $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bkk) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dbo) {
                           ((dbo)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ic[] $$25 = new ic[]{ic.b, ic.c, ic.f, ic.d, ic.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<hx> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  hx $$27 = $$26.next();
                  eez $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     hx $$30 = $$27.a($$25[$$29]);
                     eez $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     djp $$32 = $$0.a_($$27);
                     cwy $$33 = $$32.b();
                     if ($$33 instanceof dbo) {
                        ((dbo)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  eml $$34 = new emf($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<hx, so> $$38 : $$10) {
                     hx $$39 = (hx)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<hx, so> $$40 : $$10) {
                  hx $$41 = (hx)$$40.getFirst();
                  if (!$$3.h()) {
                     djp $$42 = $$0.a_($$41);
                     djp $$43 = cwy.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dhd $$44 = $$0.c_($$41);
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

   public static void a(cty $$0, int $$1, eml $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         hx $$9 = new hx($$3 + $$6, $$4 + $$7, $$5 + $$8);
         hx $$10 = $$9.a($$5x);
         djp $$11 = $$0.a_($$9);
         djp $$12 = $$0.a_($$10);
         djp $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         djp $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<edo.c> a(cum $$0, hx $$1, hx $$2, edk $$3, List<edo.c> $$4) {
      List<edo.c> $$5 = new ArrayList<>();
      List<edo.c> $$6 = new ArrayList<>();

      for (edo.c $$7 : $$4) {
         hx $$8 = a($$3, $$7.a).a((jb)$$1);
         edo.c $$9 = new edo.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<edl> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (edl $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(cum $$0, hx $$1, dbu $$2, ddk $$3, hx $$4, @Nullable dzg $$5, boolean $$6) {
      for (edo.d $$7 : this.m) {
         hx $$8 = a($$7.b, $$2, $$3, $$4).a((jb)$$1);
         if ($$5 == null || $$5.b($$8)) {
            so $$9 = $$7.c.h();
            emc $$10 = a($$7.a, $$2, $$3, $$4);
            emc $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            su $$12 = new su();
            $$12.add(sp.a($$11.c));
            $$12.add(sp.a($$11.d));
            $$12.add(sp.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dB();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dD());
               if ($$6 && $$6x instanceof bmq) {
                  ((bmq)$$6x).a($$0, $$0.d_(hx.a($$11)), bms.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<blw> a(cum $$0, so $$1) {
      try {
         return bmc.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public jb a(ddk $$0) {
      switch ($$0) {
         case d:
         case b:
            return new jb(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static hx a(hx $$0, dbu $$1, ddk $$2, hx $$3) {
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
            return new hx($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new hx($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new hx($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new hx($$4, $$5, $$6) : $$0;
      }
   }

   public static emc a(emc $$0, dbu $$1, ddk $$2, hx $$3) {
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
            return new emc((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new emc((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new emc((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new emc($$4, $$5, $$6) : $$0;
      }
   }

   public hx a(hx $$0, dbu $$1, ddk $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static hx a(hx $$0, dbu $$1, ddk $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dbu.c ? $$3 : 0;
      int $$6 = $$1 == dbu.b ? $$4 : 0;
      hx $$7 = $$0;
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

   public dzg b(edk $$0, hx $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dzg a(hx $$0, ddk $$1, hx $$2, dbu $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dzg a(hx $$0, ddk $$1, hx $$2, dbu $$3, jb $$4) {
      jb $$5 = $$4.c(-1, -1, -1);
      hx $$6 = a(hx.b, $$3, $$1, $$2);
      hx $$7 = a(hx.b.a($$5), $$3, $$1, $$2);
      return dzg.a($$6, $$7).a((jb)$$0);
   }

   public so a(so $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new su());
         $$0.a("palette", new su());
      } else {
         List<edo.b> $$1 = Lists.newArrayList();
         edo.b $$2 = new edo.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new edo.b());
         }

         su $$4 = new su();
         List<edo.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            edo.c $$7 = $$5.get($$6);
            so $$8 = new so();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               edo.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            su $$12 = new su();

            for (djp $$13 : $$2) {
               $$12.add(td.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            su $$14 = new su();

            for (edo.b $$15 : $$1) {
               su $$16 = new su();

               for (djp $$17 : $$15) {
                  $$16.add(td.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      su $$18 = new su();

      for (edo.d $$19 : this.m) {
         so $$20 = new so();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return td.g($$0);
   }

   public void a(ii<cwy> $$0, so $$1) {
      this.l.clear();
      this.m.clear();
      su $$2 = $$1.c("size", 3);
      this.n = new jb($$2.e(0), $$2.e(1), $$2.e(2));
      su $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         su $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      su $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         so $$8 = $$6.a($$7);
         su $$9 = $$8.c("pos", 6);
         emc $$10 = new emc($$9.h(0), $$9.h(1), $$9.h(2));
         su $$11 = $$8.c("blockPos", 3);
         hx $$12 = new hx($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            so $$13 = $$8.p("nbt");
            this.m.add(new edo.d($$10, $$12, $$13));
         }
      }
   }

   private void a(ii<cwy> $$0, su $$1, su $$2) {
      edo.b $$3 = new edo.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(td.a($$0, $$1.a($$4)), $$4);
      }

      List<edo.c> $$5 = Lists.newArrayList();
      List<edo.c> $$6 = Lists.newArrayList();
      List<edo.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         so $$9 = $$2.a($$8);
         su $$10 = $$9.c("pos", 3);
         hx $$11 = new hx($$10.e(0), $$10.e(1), $$10.e(2));
         djp $$12 = $$3.a($$9.h("state"));
         so $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         edo.c $$15 = new edo.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<edo.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new edo.a($$16));
   }

   private su a(int... $$0) {
      su $$1 = new su();

      for (int $$2 : $$0) {
         $$1.add(st.a($$2));
      }

      return $$1;
   }

   private su a(double... $$0) {
      su $$1 = new su();

      for (double $$2 : $$0) {
         $$1.add(sp.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<edo.c> a;
      private final Map<cwy, List<edo.c>> b = Maps.newHashMap();

      a(List<edo.c> $$0) {
         this.a = $$0;
      }

      public List<edo.c> a() {
         return this.a;
      }

      public List<edo.c> a(cwy $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<djp> {
      public static final djp a = cxa.a.o();
      private final in<djp> b = new in<>(16);
      private int c;

      public int a(djp $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public djp a(int $$0) {
         djp $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<djp> iterator() {
         return this.b.iterator();
      }

      public void a(djp $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(hx a, djp b, @Nullable so c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final emc a;
      public final hx b;
      public final so c;

      public d(emc $$0, hx $$1, so $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
