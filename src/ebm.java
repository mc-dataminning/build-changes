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

public class ebm {
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
   private final List<ebm.a> l = Lists.newArrayList();
   private final List<ebm.d> m = Lists.newArrayList();
   private ja n = ja.g;
   private String o = "?";

   public ja a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(csf $$0, hx $$1, ja $$2, boolean $$3, @Nullable cvf $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         hx $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ebm.c> $$6 = Lists.newArrayList();
         List<ebm.c> $$7 = Lists.newArrayList();
         List<ebm.c> $$8 = Lists.newArrayList();
         hx $$9 = new hx(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         hx $$10 = new hx(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (hx $$11 : hx.a($$9, $$10)) {
            hx $$12 = $$11.b($$9);
            dhn $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dfi $$14 = $$0.c_($$11);
               ebm.c $$15;
               if ($$14 != null) {
                  $$15 = new ebm.c($$12, $$13, $$14.p());
               } else {
                  $$15 = new ebm.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ebm.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ebm.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ebm.c $$0, List<ebm.c> $$1, List<ebm.c> $$2, List<ebm.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(cru.a, hx.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ebm.c> a(List<ebm.c> $$0, List<ebm.c> $$1, List<ebm.c> $$2) {
      Comparator<ebm.c> $$3 = Comparator.<ebm.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ebm.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(csf $$0, hx $$1, hx $$2) {
      List<bkv> $$3 = $$0.a(bkv.class, eju.a($$1, $$2), $$0x -> !($$0x instanceof cdz));
      this.m.clear();

      for (bkv $$4 : $$3) {
         ejz $$5 = new ejz($$4.ds() - (double)$$1.u(), $$4.du() - (double)$$1.v(), $$4.dy() - (double)$$1.w());
         sd $$6 = new sd();
         $$4.e($$6);
         hx $$7;
         if ($$4 instanceof can) {
            $$7 = ((can)$$4).E().b($$1);
         } else {
            $$7 = hx.a($$5);
         }

         this.m.add(new ebm.d($$5, $$7, $$6.h()));
      }
   }

   public List<ebm.c> a(hx $$0, ebi $$1, cvf $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<ebm.c> a(hx $$0, ebi $$1, cvf $$2, boolean $$3) {
      ObjectArrayList<ebm.c> $$4 = new ObjectArrayList();
      dxe $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ebm.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            hx $$7 = $$3 ? a($$1, $$6.a).a((ja)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ebm.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public hx a(ebi $$0, hx $$1, ebi $$2, hx $$3) {
      hx $$4 = a($$0, $$1);
      hx $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static hx a(ebi $$0, hx $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(csu $$0, hx $$1, hx $$2, ebi $$3, atw $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ebm.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dxe $$7 = $$3.g();
            List<hx> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<hx> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<hx, sd>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ebm.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               hx $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  ecx $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dhn $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dfi $$22 = $$0.c_($$19);
                     bis.a_($$22);
                     $$0.a($$19, cvh.hW.o(), 20);
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
                        dfi $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bji) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof czv) {
                           ((czv)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ib[] $$25 = new ib[]{ib.b, ib.c, ib.f, ib.d, ib.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<hx> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  hx $$27 = $$26.next();
                  ecx $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     hx $$30 = $$27.a($$25[$$29]);
                     ecx $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dhn $$32 = $$0.a_($$27);
                     cvf $$33 = $$32.b();
                     if ($$33 instanceof czv) {
                        ((czv)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  eki $$34 = new ekc($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<hx, sd> $$38 : $$10) {
                     hx $$39 = (hx)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<hx, sd> $$40 : $$10) {
                  hx $$41 = (hx)$$40.getFirst();
                  if (!$$3.h()) {
                     dhn $$42 = $$0.a_($$41);
                     dhn $$43 = cvf.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dfi $$44 = $$0.c_($$41);
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

   public static void a(csg $$0, int $$1, eki $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         hx $$9 = new hx($$3 + $$6, $$4 + $$7, $$5 + $$8);
         hx $$10 = $$9.a($$5x);
         dhn $$11 = $$0.a_($$9);
         dhn $$12 = $$0.a_($$10);
         dhn $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dhn $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<ebm.c> a(csu $$0, hx $$1, hx $$2, ebi $$3, List<ebm.c> $$4) {
      List<ebm.c> $$5 = new ArrayList<>();
      List<ebm.c> $$6 = new ArrayList<>();

      for (ebm.c $$7 : $$4) {
         hx $$8 = a($$3, $$7.a).a((ja)$$1);
         ebm.c $$9 = new ebm.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<ebj> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ebj $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(csu $$0, hx $$1, dab $$2, dbr $$3, hx $$4, @Nullable dxe $$5, boolean $$6) {
      for (ebm.d $$7 : this.m) {
         hx $$8 = a($$7.b, $$2, $$3, $$4).a((ja)$$1);
         if ($$5 == null || $$5.b($$8)) {
            sd $$9 = $$7.c.h();
            ejz $$10 = a($$7.a, $$2, $$3, $$4);
            ejz $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            sj $$12 = new sj();
            $$12.add(se.a($$11.c));
            $$12.add(se.a($$11.d));
            $$12.add(se.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dD();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dF());
               if ($$6 && $$6x instanceof bln) {
                  ((bln)$$6x).a($$0, $$0.d_(hx.a($$11)), blp.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<bkv> a(csu $$0, sd $$1) {
      try {
         return bkz.a($$1, $$0.D());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public ja a(dbr $$0) {
      switch ($$0) {
         case d:
         case b:
            return new ja(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static hx a(hx $$0, dab $$1, dbr $$2, hx $$3) {
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

   public static ejz a(ejz $$0, dab $$1, dbr $$2, hx $$3) {
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
            return new ejz((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ejz((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ejz((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ejz($$4, $$5, $$6) : $$0;
      }
   }

   public hx a(hx $$0, dab $$1, dbr $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static hx a(hx $$0, dab $$1, dbr $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dab.c ? $$3 : 0;
      int $$6 = $$1 == dab.b ? $$4 : 0;
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

   public dxe b(ebi $$0, hx $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dxe a(hx $$0, dbr $$1, hx $$2, dab $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dxe a(hx $$0, dbr $$1, hx $$2, dab $$3, ja $$4) {
      ja $$5 = $$4.c(-1, -1, -1);
      hx $$6 = a(hx.b, $$3, $$1, $$2);
      hx $$7 = a(hx.b.a($$5), $$3, $$1, $$2);
      return dxe.a($$6, $$7).a((ja)$$0);
   }

   public sd a(sd $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new sj());
         $$0.a("palette", new sj());
      } else {
         List<ebm.b> $$1 = Lists.newArrayList();
         ebm.b $$2 = new ebm.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ebm.b());
         }

         sj $$4 = new sj();
         List<ebm.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ebm.c $$7 = $$5.get($$6);
            sd $$8 = new sd();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ebm.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            sj $$12 = new sj();

            for (dhn $$13 : $$2) {
               $$12.add(ss.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            sj $$14 = new sj();

            for (ebm.b $$15 : $$1) {
               sj $$16 = new sj();

               for (dhn $$17 : $$15) {
                  $$16.add(ss.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      sj $$18 = new sj();

      for (ebm.d $$19 : this.m) {
         sd $$20 = new sd();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return ss.g($$0);
   }

   public void a(ih<cvf> $$0, sd $$1) {
      this.l.clear();
      this.m.clear();
      sj $$2 = $$1.c("size", 3);
      this.n = new ja($$2.e(0), $$2.e(1), $$2.e(2));
      sj $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         sj $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      sj $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         sd $$8 = $$6.a($$7);
         sj $$9 = $$8.c("pos", 6);
         ejz $$10 = new ejz($$9.h(0), $$9.h(1), $$9.h(2));
         sj $$11 = $$8.c("blockPos", 3);
         hx $$12 = new hx($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            sd $$13 = $$8.p("nbt");
            this.m.add(new ebm.d($$10, $$12, $$13));
         }
      }
   }

   private void a(ih<cvf> $$0, sj $$1, sj $$2) {
      ebm.b $$3 = new ebm.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(ss.a($$0, $$1.a($$4)), $$4);
      }

      List<ebm.c> $$5 = Lists.newArrayList();
      List<ebm.c> $$6 = Lists.newArrayList();
      List<ebm.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         sd $$9 = $$2.a($$8);
         sj $$10 = $$9.c("pos", 3);
         hx $$11 = new hx($$10.e(0), $$10.e(1), $$10.e(2));
         dhn $$12 = $$3.a($$9.h("state"));
         sd $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ebm.c $$15 = new ebm.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ebm.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new ebm.a($$16));
   }

   private sj a(int... $$0) {
      sj $$1 = new sj();

      for (int $$2 : $$0) {
         $$1.add(si.a($$2));
      }

      return $$1;
   }

   private sj a(double... $$0) {
      sj $$1 = new sj();

      for (double $$2 : $$0) {
         $$1.add(se.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<ebm.c> a;
      private final Map<cvf, List<ebm.c>> b = Maps.newHashMap();

      a(List<ebm.c> $$0) {
         this.a = $$0;
      }

      public List<ebm.c> a() {
         return this.a;
      }

      public List<ebm.c> a(cvf $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dhn> {
      public static final dhn a = cvh.a.o();
      private final im<dhn> b = new im<>(16);
      private int c;

      public int a(dhn $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dhn a(int $$0) {
         dhn $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dhn> iterator() {
         return this.b.iterator();
      }

      public void a(dhn $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(hx a, dhn b, @Nullable sd c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ejz a;
      public final hx b;
      public final sd c;

      public d(ejz $$0, hx $$1, sd $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
