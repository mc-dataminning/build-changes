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

public class eqd {
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
   private final List<eqd.a> l = Lists.newArrayList();
   private final List<eqd.d> m = Lists.newArrayList();
   private kl n = kl.g;
   private String o = "?";

   public kl a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dff $$0, jh $$1, kl $$2, boolean $$3, @Nullable dij $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jh $$5 = $$1.a($$2).b(-1, -1, -1);
         List<eqd.c> $$6 = Lists.newArrayList();
         List<eqd.c> $$7 = Lists.newArrayList();
         List<eqd.c> $$8 = Lists.newArrayList();
         jh $$9 = new jh(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jh $$10 = new jh(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (jh $$11 : jh.c($$9, $$10)) {
            jh $$12 = $$11.b($$9);
            dvo $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dsr $$14 = $$0.c_($$11);
               eqd.c $$15;
               if ($$14 != null) {
                  $$15 = new eqd.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new eqd.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<eqd.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new eqd.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(eqd.c $$0, List<eqd.c> $$1, List<eqd.c> $$2, List<eqd.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(deu.a, jh.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<eqd.c> a(List<eqd.c> $$0, List<eqd.c> $$1, List<eqd.c> $$2) {
      Comparator<eqd.c> $$3 = Comparator.<eqd.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<eqd.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dff $$0, jh $$1, jh $$2) {
      List<bui> $$3 = $$0.a(bui.class, ezm.a($$1, $$2), $$0x -> !($$0x instanceof cor));
      this.m.clear();

      for (bui $$4 : $$3) {
         ezr $$5 = new ezr($$4.dD() - (double)$$1.u(), $$4.dF() - (double)$$1.v(), $$4.dJ() - (double)$$1.w());
         un $$6 = new un();
         $$4.e($$6);
         jh $$7;
         if ($$4 instanceof cku) {
            $$7 = ((cku)$$4).q().b($$1);
         } else {
            $$7 = jh.a((ka)$$5);
         }

         this.m.add(new eqd.d($$5, $$7, $$6.i()));
      }
   }

   public List<eqd.c> a(jh $$0, epz $$1, dij $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<eqd.c> a(jh $$0, epz $$1, dij $$2, boolean $$3) {
      ObjectArrayList<eqd.c> $$4 = new ObjectArrayList();
      elt $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (eqd.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            jh $$7 = $$3 ? a($$1, $$6.a).a((kl)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new eqd.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jh a(epz $$0, jh $$1, epz $$2, jh $$3) {
      jh $$4 = a($$0, $$1);
      jh $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jh a(epz $$0, jh $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dfw $$0, jh $$1, jh $$2, epz $$3, azv $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<eqd.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            elt $$7 = $$3.g();
            List<jh> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jh> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jh, un>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (eqd.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               jh $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  ero $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dvo $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dsr $$22 = $$0.c_($$19);
                     bry.a_($$22);
                     $$0.a($$19, dil.hW.m(), 20);
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
                        dsr $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bsn) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dmz) {
                           ((dmz)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            jm[] $$25 = new jm[]{jm.b, jm.c, jm.f, jm.d, jm.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<jh> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  jh $$27 = $$26.next();
                  ero $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     jh $$30 = $$27.a($$25[$$29]);
                     ero $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dvo $$32 = $$0.a_($$27);
                     dij $$33 = $$32.b();
                     if ($$33 instanceof dmz) {
                        ((dmz)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  faa $$34 = new ezu($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<jh, un> $$38 : $$10) {
                     jh $$39 = (jh)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<jh, un> $$40 : $$10) {
                  jh $$41 = (jh)$$40.getFirst();
                  if (!$$3.h()) {
                     dvo $$42 = $$0.a_($$41);
                     dvo $$43 = dij.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dsr $$44 = $$0.c_($$41);
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

   public static void a(dfg $$0, int $$1, faa $$2, jh $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dfg $$0, int $$1, faa $$2, int $$3, int $$4, int $$5) {
      jh.a $$6 = new jh.a();
      jh.a $$7 = new jh.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dvo $$11 = $$0.a_($$6);
         dvo $$12 = $$0.a_($$7);
         dvo $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.E_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dvo $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.E_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<eqd.c> a(dfw $$0, jh $$1, jh $$2, epz $$3, List<eqd.c> $$4) {
      List<eqd.c> $$5 = new ArrayList<>();
      List<eqd.c> $$6 = new ArrayList<>();

      for (eqd.c $$7 : $$4) {
         jh $$8 = a($$3, $$7.a).a((kl)$$1);
         eqd.c $$9 = new eqd.c($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<eqa> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (eqa $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dfw $$0, jh $$1, dnf $$2, dow $$3, jh $$4, @Nullable elt $$5, boolean $$6) {
      for (eqd.d $$7 : this.m) {
         jh $$8 = a($$7.b, $$2, $$3, $$4).a((kl)$$1);
         if ($$5 == null || $$5.b($$8)) {
            un $$9 = $$7.c.i();
            ezr $$10 = a($$7.a, $$2, $$3, $$4);
            ezr $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ut $$12 = new ut();
            $$12.add(uo.a($$11.d));
            $$12.add(uo.a($$11.e));
            $$12.add(uo.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dO();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dQ());
               if ($$6 && $$5x instanceof bvg) {
                  ((bvg)$$5x).a($$0, $$0.d_(jh.a((ka)$$11)), buo.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bui> a(dfw $$0, un $$1) {
      try {
         return bup.a($$1, $$0.E(), buo.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kl a(dow $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kl(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static jh a(jh $$0, dnf $$1, dow $$2, jh $$3) {
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
            return new jh($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new jh($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new jh($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new jh($$4, $$5, $$6) : $$0;
      }
   }

   public static ezr a(ezr $$0, dnf $$1, dow $$2, jh $$3) {
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
            return new ezr((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ezr((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ezr((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ezr($$4, $$5, $$6) : $$0;
      }
   }

   public jh a(jh $$0, dnf $$1, dow $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jh a(jh $$0, dnf $$1, dow $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dnf.c ? $$3 : 0;
      int $$6 = $$1 == dnf.b ? $$4 : 0;
      jh $$7 = $$0;
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

   public elt b(epz $$0, jh $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public elt a(jh $$0, dow $$1, jh $$2, dnf $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static elt a(jh $$0, dow $$1, jh $$2, dnf $$3, kl $$4) {
      kl $$5 = $$4.c(-1, -1, -1);
      jh $$6 = a(jh.c, $$3, $$1, $$2);
      jh $$7 = a(jh.c.a($$5), $$3, $$1, $$2);
      return elt.a($$6, $$7).a((kl)$$0);
   }

   public un a(un $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ut());
         $$0.a("palette", new ut());
      } else {
         List<eqd.b> $$1 = Lists.newArrayList();
         eqd.b $$2 = new eqd.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new eqd.b());
         }

         ut $$4 = new ut();
         List<eqd.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            eqd.c $$7 = $$5.get($$6);
            un $$8 = new un();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               eqd.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ut $$12 = new ut();

            for (dvo $$13 : $$2) {
               $$12.add(vc.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ut $$14 = new ut();

            for (eqd.b $$15 : $$1) {
               ut $$16 = new ut();

               for (dvo $$17 : $$15) {
                  $$16.add(vc.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ut $$18 = new ut();

      for (eqd.d $$19 : this.m) {
         un $$20 = new un();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return vc.e($$0);
   }

   public void a(jr<dij> $$0, un $$1) {
      this.l.clear();
      this.m.clear();
      ut $$2 = $$1.c("size", 3);
      this.n = new kl($$2.e(0), $$2.e(1), $$2.e(2));
      ut $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ut $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ut $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         un $$8 = $$6.a($$7);
         ut $$9 = $$8.c("pos", 6);
         ezr $$10 = new ezr($$9.h(0), $$9.h(1), $$9.h(2));
         ut $$11 = $$8.c("blockPos", 3);
         jh $$12 = new jh($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            un $$13 = $$8.p("nbt");
            this.m.add(new eqd.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jr<dij> $$0, ut $$1, ut $$2) {
      eqd.b $$3 = new eqd.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(vc.a($$0, $$1.a($$4)), $$4);
      }

      List<eqd.c> $$5 = Lists.newArrayList();
      List<eqd.c> $$6 = Lists.newArrayList();
      List<eqd.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         un $$9 = $$2.a($$8);
         ut $$10 = $$9.c("pos", 3);
         jh $$11 = new jh($$10.e(0), $$10.e(1), $$10.e(2));
         dvo $$12 = $$3.a($$9.h("state"));
         un $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         eqd.c $$15 = new eqd.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<eqd.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new eqd.a($$16));
   }

   private ut a(int... $$0) {
      ut $$1 = new ut();

      for (int $$2 : $$0) {
         $$1.add(us.a($$2));
      }

      return $$1;
   }

   private ut a(double... $$0) {
      ut $$1 = new ut();

      for (double $$2 : $$0) {
         $$1.add(uo.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<eqd.c> a;
      private final Map<dij, List<eqd.c>> b = Maps.newHashMap();

      a(List<eqd.c> $$0) {
         this.a = $$0;
      }

      public List<eqd.c> a() {
         return this.a;
      }

      public List<eqd.c> a(dij $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dvo> {
      public static final dvo a = dil.a.m();
      private final jw<dvo> b = new jw<>(16);
      private int c;

      public int a(dvo $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dvo a(int $$0) {
         dvo $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dvo> iterator() {
         return this.b.iterator();
      }

      public void a(dvo $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(jh a, dvo b, @Nullable un c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ezr a;
      public final jh b;
      public final un c;

      public d(ezr $$0, jh $$1, un $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
