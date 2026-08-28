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

public class eqk {
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
   private final List<eqk.a> l = Lists.newArrayList();
   private final List<eqk.d> m = Lists.newArrayList();
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

   public void a(dfm $$0, jh $$1, kl $$2, boolean $$3, @Nullable diq $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jh $$5 = $$1.a($$2).b(-1, -1, -1);
         List<eqk.c> $$6 = Lists.newArrayList();
         List<eqk.c> $$7 = Lists.newArrayList();
         List<eqk.c> $$8 = Lists.newArrayList();
         jh $$9 = new jh(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jh $$10 = new jh(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (jh $$11 : jh.c($$9, $$10)) {
            jh $$12 = $$11.b($$9);
            dvv $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dsy $$14 = $$0.c_($$11);
               eqk.c $$15;
               if ($$14 != null) {
                  $$15 = new eqk.c($$12, $$13, $$14.c($$0.J_()));
               } else {
                  $$15 = new eqk.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<eqk.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new eqk.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(eqk.c $$0, List<eqk.c> $$1, List<eqk.c> $$2, List<eqk.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dfb.a, jh.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<eqk.c> a(List<eqk.c> $$0, List<eqk.c> $$1, List<eqk.c> $$2) {
      Comparator<eqk.c> $$3 = Comparator.<eqk.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<eqk.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dfm $$0, jh $$1, jh $$2) {
      List<bul> $$3 = $$0.a(bul.class, ezt.a($$1, $$2), $$0x -> !($$0x instanceof cou));
      this.m.clear();

      for (bul $$4 : $$3) {
         ezy $$5 = new ezy($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         ul $$6 = new ul();
         $$4.e($$6);
         jh $$7;
         if ($$4 instanceof ckx) {
            $$7 = ((ckx)$$4).n().b($$1);
         } else {
            $$7 = jh.a((ka)$$5);
         }

         this.m.add(new eqk.d($$5, $$7, $$6.i()));
      }
   }

   public List<eqk.c> a(jh $$0, eqg $$1, diq $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<eqk.c> a(jh $$0, eqg $$1, diq $$2, boolean $$3) {
      ObjectArrayList<eqk.c> $$4 = new ObjectArrayList();
      ema $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (eqk.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            jh $$7 = $$3 ? a($$1, $$6.a).a((kl)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new eqk.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jh a(eqg $$0, jh $$1, eqg $$2, jh $$3) {
      jh $$4 = a($$0, $$1);
      jh $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jh a(eqg $$0, jh $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dgd $$0, jh $$1, jh $$2, eqg $$3, azu $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<eqk.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            ema $$7 = $$3.g();
            List<jh> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jh> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jh, ul>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (eqk.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               jh $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  erv $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dvv $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dsy $$22 = $$0.c_($$19);
                     bsb.a($$22);
                     $$0.a($$19, dis.hW.m(), 20);
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
                        dsy $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bsq) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.J_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dng) {
                           ((dng)$$21.b()).a($$0, $$19, $$21, $$20);
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
                  erv $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     jh $$30 = $$27.a($$25[$$29]);
                     erv $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dvv $$32 = $$0.a_($$27);
                     diq $$33 = $$32.b();
                     if ($$33 instanceof dng) {
                        ((dng)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fah $$34 = new fab($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<jh, ul> $$38 : $$10) {
                     jh $$39 = (jh)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<jh, ul> $$40 : $$10) {
                  jh $$41 = (jh)$$40.getFirst();
                  if (!$$3.h()) {
                     dvv $$42 = $$0.a_($$41);
                     dvv $$43 = diq.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dsy $$44 = $$0.c_($$41);
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

   public static void a(dfn $$0, int $$1, fah $$2, jh $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dfn $$0, int $$1, fah $$2, int $$3, int $$4, int $$5) {
      jh.a $$6 = new jh.a();
      jh.a $$7 = new jh.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dvv $$11 = $$0.a_($$6);
         dvv $$12 = $$0.a_($$7);
         dvv $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.G_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dvv $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.G_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<eqk.c> a(dgd $$0, jh $$1, jh $$2, eqg $$3, List<eqk.c> $$4) {
      List<eqk.c> $$5 = new ArrayList<>();
      List<eqk.c> $$6 = new ArrayList<>();

      for (eqk.c $$7 : $$4) {
         jh $$8 = a($$3, $$7.a).a((kl)$$1);
         eqk.c $$9 = new eqk.c($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<eqh> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (eqh $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dgd $$0, jh $$1, dnm $$2, dpd $$3, jh $$4, @Nullable ema $$5, boolean $$6) {
      for (eqk.d $$7 : this.m) {
         jh $$8 = a($$7.b, $$2, $$3, $$4).a((kl)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ul $$9 = $$7.c.i();
            ezy $$10 = a($$7.a, $$2, $$3, $$4);
            ezy $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ur $$12 = new ur();
            $$12.add(um.a($$11.d));
            $$12.add(um.a($$11.e));
            $$12.add(um.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dL();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dN());
               if ($$6 && $$5x instanceof bvj) {
                  ((bvj)$$5x).a($$0, $$0.d_(jh.a((ka)$$11)), bur.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bul> a(dgd $$0, ul $$1) {
      try {
         return bus.a($$1, $$0.a(), bur.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kl a(dpd $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kl(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static jh a(jh $$0, dnm $$1, dpd $$2, jh $$3) {
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

   public static ezy a(ezy $$0, dnm $$1, dpd $$2, jh $$3) {
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
            return new ezy((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ezy((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ezy((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ezy($$4, $$5, $$6) : $$0;
      }
   }

   public jh a(jh $$0, dnm $$1, dpd $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jh a(jh $$0, dnm $$1, dpd $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dnm.c ? $$3 : 0;
      int $$6 = $$1 == dnm.b ? $$4 : 0;
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

   public ema b(eqg $$0, jh $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public ema a(jh $$0, dpd $$1, jh $$2, dnm $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static ema a(jh $$0, dpd $$1, jh $$2, dnm $$3, kl $$4) {
      kl $$5 = $$4.c(-1, -1, -1);
      jh $$6 = a(jh.c, $$3, $$1, $$2);
      jh $$7 = a(jh.c.a($$5), $$3, $$1, $$2);
      return ema.a($$6, $$7).a((kl)$$0);
   }

   public ul a(ul $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ur());
         $$0.a("palette", new ur());
      } else {
         List<eqk.b> $$1 = Lists.newArrayList();
         eqk.b $$2 = new eqk.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new eqk.b());
         }

         ur $$4 = new ur();
         List<eqk.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            eqk.c $$7 = $$5.get($$6);
            ul $$8 = new ul();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               eqk.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ur $$12 = new ur();

            for (dvv $$13 : $$2) {
               $$12.add(va.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ur $$14 = new ur();

            for (eqk.b $$15 : $$1) {
               ur $$16 = new ur();

               for (dvv $$17 : $$15) {
                  $$16.add(va.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ur $$18 = new ur();

      for (eqk.d $$19 : this.m) {
         ul $$20 = new ul();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return va.e($$0);
   }

   public void a(jr<diq> $$0, ul $$1) {
      this.l.clear();
      this.m.clear();
      ur $$2 = $$1.c("size", 3);
      this.n = new kl($$2.e(0), $$2.e(1), $$2.e(2));
      ur $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ur $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ur $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         ul $$8 = $$6.a($$7);
         ur $$9 = $$8.c("pos", 6);
         ezy $$10 = new ezy($$9.h(0), $$9.h(1), $$9.h(2));
         ur $$11 = $$8.c("blockPos", 3);
         jh $$12 = new jh($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ul $$13 = $$8.p("nbt");
            this.m.add(new eqk.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jr<diq> $$0, ur $$1, ur $$2) {
      eqk.b $$3 = new eqk.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(va.a($$0, $$1.a($$4)), $$4);
      }

      List<eqk.c> $$5 = Lists.newArrayList();
      List<eqk.c> $$6 = Lists.newArrayList();
      List<eqk.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ul $$9 = $$2.a($$8);
         ur $$10 = $$9.c("pos", 3);
         jh $$11 = new jh($$10.e(0), $$10.e(1), $$10.e(2));
         dvv $$12 = $$3.a($$9.h("state"));
         ul $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         eqk.c $$15 = new eqk.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<eqk.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new eqk.a($$16));
   }

   private ur a(int... $$0) {
      ur $$1 = new ur();

      for (int $$2 : $$0) {
         $$1.add(uq.a($$2));
      }

      return $$1;
   }

   private ur a(double... $$0) {
      ur $$1 = new ur();

      for (double $$2 : $$0) {
         $$1.add(um.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<eqk.c> a;
      private final Map<diq, List<eqk.c>> b = Maps.newHashMap();

      a(List<eqk.c> $$0) {
         this.a = $$0;
      }

      public List<eqk.c> a() {
         return this.a;
      }

      public List<eqk.c> a(diq $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dvv> {
      public static final dvv a = dis.a.m();
      private final jw<dvv> b = new jw<>(16);
      private int c;

      public int a(dvv $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dvv a(int $$0) {
         dvv $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dvv> iterator() {
         return this.b.iterator();
      }

      public void a(dvv $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(jh a, dvv b, @Nullable ul c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final ezy a;
      public final jh b;
      public final ul c;

      public d(ezy $$0, jh $$1, ul $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
