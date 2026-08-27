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

public class dys {
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
   private final List<dys.a> l = Lists.newArrayList();
   private final List<dys.d> m = Lists.newArrayList();
   private hz n = hz.g;
   private String o = "?";

   public hz a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(cpm $$0, gu $$1, hz $$2, boolean $$3, @Nullable csm $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         gu $$5 = $$1.a($$2).b(-1, -1, -1);
         List<dys.c> $$6 = Lists.newArrayList();
         List<dys.c> $$7 = Lists.newArrayList();
         List<dys.c> $$8 = Lists.newArrayList();
         gu $$9 = new gu(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         gu $$10 = new gu(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (gu $$11 : gu.a($$9, $$10)) {
            gu $$12 = $$11.b($$9);
            dfa $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dcm $$14 = $$0.c_($$11);
               dys.c $$15;
               if ($$14 != null) {
                  $$15 = new dys.c($$12, $$13, $$14.n());
               } else {
                  $$15 = new dys.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<dys.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new dys.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10.b(1, 1, 1));
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(dys.c $$0, List<dys.c> $$1, List<dys.c> $$2, List<dys.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(cpb.a, gu.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<dys.c> a(List<dys.c> $$0, List<dys.c> $$1, List<dys.c> $$2) {
      Comparator<dys.c> $$3 = Comparator.<dys.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<dys.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cpm $$0, gu $$1, gu $$2) {
      List<bii> $$3 = $$0.a(bii.class, new egz($$1, $$2), $$0x -> !($$0x instanceof cbn));
      this.m.clear();

      for (bii $$4 : $$3) {
         ehe $$5 = new ehe($$4.dp() - (double)$$1.u(), $$4.dr() - (double)$$1.v(), $$4.dv() - (double)$$1.w());
         qr $$6 = new qr();
         $$4.e($$6);
         gu $$7;
         if ($$4 instanceof byb) {
            $$7 = ((byb)$$4).y().b($$1);
         } else {
            $$7 = gu.a($$5);
         }

         this.m.add(new dys.d($$5, $$7, $$6.h()));
      }
   }

   public List<dys.c> a(gu $$0, dyo $$1, csm $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<dys.c> a(gu $$0, dyo $$1, csm $$2, boolean $$3) {
      ObjectArrayList<dys.c> $$4 = new ObjectArrayList();
      dur $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (dys.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            gu $$7 = $$3 ? a($$1, $$6.a).a((hz)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new dys.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public gu a(dyo $$0, gu $$1, dyo $$2, gu $$3) {
      gu $$4 = a($$0, $$1);
      gu $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static gu a(dyo $$0, gu $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(cqb $$0, gu $$1, gu $$2, dyo $$3, aru $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<dys.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dur $$7 = $$3.g();
            List<gu> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<gu> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<gu, qr>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (dys.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               gu $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  ead $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dfa $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dcm $$22 = $$0.c_($$19);
                     bgh.a_($$22);
                     $$0.a($$19, csn.hW.n(), 20);
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
                        dcm $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof ddp) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof cxa) {
                           ((cxa)$$21.b()).a($$0, $$19, $$21, $$20);
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
               Iterator<gu> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  gu $$27 = $$26.next();
                  ead $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     gu $$30 = $$27.a($$25[$$29]);
                     ead $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dfa $$32 = $$0.a_($$27);
                     csm $$33 = $$32.b();
                     if ($$33 instanceof cxa) {
                        ((cxa)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ehn $$34 = new ehh($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<gu, qr> $$38 : $$10) {
                     gu $$39 = (gu)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<gu, qr> $$40 : $$10) {
                  gu $$41 = (gu)$$40.getFirst();
                  if (!$$3.h()) {
                     dfa $$42 = $$0.a_($$41);
                     dfa $$43 = csm.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dcm $$44 = $$0.c_($$41);
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

   public static void a(cpn $$0, int $$1, ehn $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         gu $$9 = new gu($$3 + $$6, $$4 + $$7, $$5 + $$8);
         gu $$10 = $$9.a($$5x);
         dfa $$11 = $$0.a_($$9);
         dfa $$12 = $$0.a_($$10);
         dfa $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dfa $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<dys.c> a(cqb $$0, gu $$1, gu $$2, dyo $$3, List<dys.c> $$4) {
      List<dys.c> $$5 = new ArrayList<>();
      List<dys.c> $$6 = new ArrayList<>();

      for (dys.c $$7 : $$4) {
         gu $$8 = a($$3, $$7.a).a((hz)$$1);
         dys.c $$9 = new dys.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<dyp> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (dyp $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(cqb $$0, gu $$1, cxh $$2, cyy $$3, gu $$4, @Nullable dur $$5, boolean $$6) {
      for (dys.d $$7 : this.m) {
         gu $$8 = a($$7.b, $$2, $$3, $$4).a((hz)$$1);
         if ($$5 == null || $$5.b($$8)) {
            qr $$9 = $$7.c.h();
            ehe $$10 = a($$7.a, $$2, $$3, $$4);
            ehe $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            qx $$12 = new qx();
            $$12.add(qs.a($$11.c));
            $$12.add(qs.a($$11.d));
            $$12.add(qs.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dA();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dC());
               if ($$6 && $$6x instanceof bja) {
                  ((bja)$$6x).a($$0, $$0.d_(gu.a($$11)), bjc.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<bii> a(cqb $$0, qr $$1) {
      try {
         return bim.a($$1, $$0.C());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public hz a(cyy $$0) {
      switch ($$0) {
         case d:
         case b:
            return new hz(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static gu a(gu $$0, cxh $$1, cyy $$2, gu $$3) {
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
            return new gu($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new gu($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new gu($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new gu($$4, $$5, $$6) : $$0;
      }
   }

   public static ehe a(ehe $$0, cxh $$1, cyy $$2, gu $$3) {
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
            return new ehe((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ehe((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ehe((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ehe($$4, $$5, $$6) : $$0;
      }
   }

   public gu a(gu $$0, cxh $$1, cyy $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static gu a(gu $$0, cxh $$1, cyy $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == cxh.c ? $$3 : 0;
      int $$6 = $$1 == cxh.b ? $$4 : 0;
      gu $$7 = $$0;
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

   public dur b(dyo $$0, gu $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dur a(gu $$0, cyy $$1, gu $$2, cxh $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dur a(gu $$0, cyy $$1, gu $$2, cxh $$3, hz $$4) {
      hz $$5 = $$4.c(-1, -1, -1);
      gu $$6 = a(gu.b, $$3, $$1, $$2);
      gu $$7 = a(gu.b.a($$5), $$3, $$1, $$2);
      return dur.a($$6, $$7).a((hz)$$0);
   }

   public qr a(qr $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new qx());
         $$0.a("palette", new qx());
      } else {
         List<dys.b> $$1 = Lists.newArrayList();
         dys.b $$2 = new dys.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new dys.b());
         }

         qx $$4 = new qx();
         List<dys.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            dys.c $$7 = $$5.get($$6);
            qr $$8 = new qr();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               dys.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            qx $$12 = new qx();

            for (dfa $$13 : $$2) {
               $$12.add(rd.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            qx $$14 = new qx();

            for (dys.b $$15 : $$1) {
               qx $$16 = new qx();

               for (dfa $$17 : $$15) {
                  $$16.add(rd.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      qx $$18 = new qx();

      for (dys.d $$19 : this.m) {
         qr $$20 = new qr();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return rd.g($$0);
   }

   public void a(hf<csm> $$0, qr $$1) {
      this.l.clear();
      this.m.clear();
      qx $$2 = $$1.c("size", 3);
      this.n = new hz($$2.e(0), $$2.e(1), $$2.e(2));
      qx $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         qx $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      qx $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         qr $$8 = $$6.a($$7);
         qx $$9 = $$8.c("pos", 6);
         ehe $$10 = new ehe($$9.h(0), $$9.h(1), $$9.h(2));
         qx $$11 = $$8.c("blockPos", 3);
         gu $$12 = new gu($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            qr $$13 = $$8.p("nbt");
            this.m.add(new dys.d($$10, $$12, $$13));
         }
      }
   }

   private void a(hf<csm> $$0, qx $$1, qx $$2) {
      dys.b $$3 = new dys.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(rd.a($$0, $$1.a($$4)), $$4);
      }

      List<dys.c> $$5 = Lists.newArrayList();
      List<dys.c> $$6 = Lists.newArrayList();
      List<dys.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         qr $$9 = $$2.a($$8);
         qx $$10 = $$9.c("pos", 3);
         gu $$11 = new gu($$10.e(0), $$10.e(1), $$10.e(2));
         dfa $$12 = $$3.a($$9.h("state"));
         qr $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         dys.c $$15 = new dys.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<dys.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new dys.a($$16));
   }

   private qx a(int... $$0) {
      qx $$1 = new qx();

      for (int $$2 : $$0) {
         $$1.add(qw.a($$2));
      }

      return $$1;
   }

   private qx a(double... $$0) {
      qx $$1 = new qx();

      for (double $$2 : $$0) {
         $$1.add(qs.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<dys.c> a;
      private final Map<csm, List<dys.c>> b = Maps.newHashMap();

      a(List<dys.c> $$0) {
         this.a = $$0;
      }

      public List<dys.c> a() {
         return this.a;
      }

      public List<dys.c> a(csm $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dfa> {
      public static final dfa a = csn.a.n();
      private final hk<dfa> b = new hk<>(16);
      private int c;

      public int a(dfa $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dfa a(int $$0) {
         dfa $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dfa> iterator() {
         return this.b.iterator();
      }

      public void a(dfa $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(gu a, dfa b, @Nullable qr c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ehe a;
      public final gu b;
      public final qr c;

      public d(ehe $$0, gu $$1, qr $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
