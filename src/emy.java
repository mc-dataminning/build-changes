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

public class emy {
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
   private final List<emy.a> l = Lists.newArrayList();
   private final List<emy.d> m = Lists.newArrayList();
   private ke n = ke.g;
   private String o = "?";

   public ke a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dcg $$0, ja $$1, ke $$2, boolean $$3, @Nullable dfi $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         ja $$5 = $$1.a($$2).b(-1, -1, -1);
         List<emy.c> $$6 = Lists.newArrayList();
         List<emy.c> $$7 = Lists.newArrayList();
         List<emy.c> $$8 = Lists.newArrayList();
         ja $$9 = new ja(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         ja $$10 = new ja(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (ja $$11 : ja.c($$9, $$10)) {
            ja $$12 = $$11.b($$9);
            dsl $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dpq $$14 = $$0.c_($$11);
               emy.c $$15;
               if ($$14 != null) {
                  $$15 = new emy.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new emy.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<emy.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new emy.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(emy.c $$0, List<emy.c> $$1, List<emy.c> $$2, List<emy.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(dbv.a, ja.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<emy.c> a(List<emy.c> $$0, List<emy.c> $$1, List<emy.c> $$2) {
      Comparator<emy.c> $$3 = Comparator.<emy.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<emy.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dcg $$0, ja $$1, ja $$2) {
      List<bsh> $$3 = $$0.a(bsh.class, ewc.a($$1, $$2), $$0x -> !($$0x instanceof cml));
      this.m.clear();

      for (bsh $$4 : $$3) {
         ewh $$5 = new ewh($$4.dw() - (double)$$1.u(), $$4.dy() - (double)$$1.v(), $$4.dC() - (double)$$1.w());
         tx $$6 = new tx();
         $$4.e($$6);
         ja $$7;
         if ($$4 instanceof ciq) {
            $$7 = ((ciq)$$4).t().b($$1);
         } else {
            $$7 = ja.a($$5);
         }

         this.m.add(new emy.d($$5, $$7, $$6.i()));
      }
   }

   public List<emy.c> a(ja $$0, emu $$1, dfi $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<emy.c> a(ja $$0, emu $$1, dfi $$2, boolean $$3) {
      ObjectArrayList<emy.c> $$4 = new ObjectArrayList();
      eip $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (emy.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            ja $$7 = $$3 ? a($$1, $$6.a).a((ke)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new emy.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public ja a(emu $$0, ja $$1, emu $$2, ja $$3) {
      ja $$4 = a($$0, $$1);
      ja $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static ja a(emu $$0, ja $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dcv $$0, ja $$1, ja $$2, emu $$3, ayo $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<emy.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eip $$7 = $$3.g();
            List<ja> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<ja> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<ja, tx>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (emy.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               ja $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eoj $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dsl $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dpq $$22 = $$0.c_($$19);
                     bpy.a_($$22);
                     $$0.a($$19, dfk.hW.o(), 20);
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
                        dpq $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bqp) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof djz) {
                           ((djz)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            jf[] $$25 = new jf[]{jf.b, jf.c, jf.f, jf.d, jf.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<ja> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  ja $$27 = $$26.next();
                  eoj $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     ja $$30 = $$27.a($$25[$$29]);
                     eoj $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dsl $$32 = $$0.a_($$27);
                     dfi $$33 = $$32.b();
                     if ($$33 instanceof djz) {
                        ((djz)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ewq $$34 = new ewk($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<ja, tx> $$38 : $$10) {
                     ja $$39 = (ja)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<ja, tx> $$40 : $$10) {
                  ja $$41 = (ja)$$40.getFirst();
                  if (!$$3.h()) {
                     dsl $$42 = $$0.a_($$41);
                     dsl $$43 = dfi.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dpq $$44 = $$0.c_($$41);
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

   public static void a(dch $$0, int $$1, ewq $$2, ja $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dch $$0, int $$1, ewq $$2, int $$3, int $$4, int $$5) {
      ja.a $$6 = new ja.a();
      ja.a $$7 = new ja.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dsl $$11 = $$0.a_($$6);
         dsl $$12 = $$0.a_($$7);
         dsl $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dsl $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<emy.c> a(dcv $$0, ja $$1, ja $$2, emu $$3, List<emy.c> $$4) {
      List<emy.c> $$5 = new ArrayList<>();
      List<emy.c> $$6 = new ArrayList<>();

      for (emy.c $$7 : $$4) {
         ja $$8 = a($$3, $$7.a).a((ke)$$1);
         emy.c $$9 = new emy.c($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<emv> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (emv $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dcv $$0, ja $$1, dkf $$2, dlv $$3, ja $$4, @Nullable eip $$5, boolean $$6) {
      for (emy.d $$7 : this.m) {
         ja $$8 = a($$7.b, $$2, $$3, $$4).a((ke)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tx $$9 = $$7.c.i();
            ewh $$10 = a($$7.a, $$2, $$3, $$4);
            ewh $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ud $$12 = new ud();
            $$12.add(ty.a($$11.c));
            $$12.add(ty.a($$11.d));
            $$12.add(ty.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dH();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dJ());
               if ($$6 && $$5x instanceof bte) {
                  ((bte)$$5x).a($$0, $$0.d_(ja.a($$11)), btg.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bsh> a(dcv $$0, tx $$1) {
      try {
         return bsn.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public ke a(dlv $$0) {
      switch ($$0) {
         case d:
         case b:
            return new ke(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static ja a(ja $$0, dkf $$1, dlv $$2, ja $$3) {
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
            return new ja($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new ja($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new ja($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new ja($$4, $$5, $$6) : $$0;
      }
   }

   public static ewh a(ewh $$0, dkf $$1, dlv $$2, ja $$3) {
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
            return new ewh((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ewh((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ewh((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ewh($$4, $$5, $$6) : $$0;
      }
   }

   public ja a(ja $$0, dkf $$1, dlv $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static ja a(ja $$0, dkf $$1, dlv $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dkf.c ? $$3 : 0;
      int $$6 = $$1 == dkf.b ? $$4 : 0;
      ja $$7 = $$0;
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

   public eip b(emu $$0, ja $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eip a(ja $$0, dlv $$1, ja $$2, dkf $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eip a(ja $$0, dlv $$1, ja $$2, dkf $$3, ke $$4) {
      ke $$5 = $$4.c(-1, -1, -1);
      ja $$6 = a(ja.c, $$3, $$1, $$2);
      ja $$7 = a(ja.c.a($$5), $$3, $$1, $$2);
      return eip.a($$6, $$7).a((ke)$$0);
   }

   public tx a(tx $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ud());
         $$0.a("palette", new ud());
      } else {
         List<emy.b> $$1 = Lists.newArrayList();
         emy.b $$2 = new emy.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new emy.b());
         }

         ud $$4 = new ud();
         List<emy.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            emy.c $$7 = $$5.get($$6);
            tx $$8 = new tx();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               emy.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ud $$12 = new ud();

            for (dsl $$13 : $$2) {
               $$12.add(um.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ud $$14 = new ud();

            for (emy.b $$15 : $$1) {
               ud $$16 = new ud();

               for (dsl $$17 : $$15) {
                  $$16.add(um.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ud $$18 = new ud();

      for (emy.d $$19 : this.m) {
         tx $$20 = new tx();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
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

   public void a(jk<dfi> $$0, tx $$1) {
      this.l.clear();
      this.m.clear();
      ud $$2 = $$1.c("size", 3);
      this.n = new ke($$2.e(0), $$2.e(1), $$2.e(2));
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
         ewh $$10 = new ewh($$9.h(0), $$9.h(1), $$9.h(2));
         ud $$11 = $$8.c("blockPos", 3);
         ja $$12 = new ja($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            tx $$13 = $$8.p("nbt");
            this.m.add(new emy.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jk<dfi> $$0, ud $$1, ud $$2) {
      emy.b $$3 = new emy.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(um.a($$0, $$1.a($$4)), $$4);
      }

      List<emy.c> $$5 = Lists.newArrayList();
      List<emy.c> $$6 = Lists.newArrayList();
      List<emy.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         tx $$9 = $$2.a($$8);
         ud $$10 = $$9.c("pos", 3);
         ja $$11 = new ja($$10.e(0), $$10.e(1), $$10.e(2));
         dsl $$12 = $$3.a($$9.h("state"));
         tx $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         emy.c $$15 = new emy.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<emy.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new emy.a($$16));
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

   public static final class a {
      private final List<emy.c> a;
      private final Map<dfi, List<emy.c>> b = Maps.newHashMap();

      a(List<emy.c> $$0) {
         this.a = $$0;
      }

      public List<emy.c> a() {
         return this.a;
      }

      public List<emy.c> a(dfi $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dsl> {
      public static final dsl a = dfk.a.o();
      private final jp<dsl> b = new jp<>(16);
      private int c;

      public int a(dsl $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dsl a(int $$0) {
         dsl $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dsl> iterator() {
         return this.b.iterator();
      }

      public void a(dsl $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(ja a, dsl b, @Nullable tx c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ewh a;
      public final ja b;
      public final tx c;

      public d(ewh $$0, ja $$1, tx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
