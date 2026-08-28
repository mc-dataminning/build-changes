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

public class epi {
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
   private final List<epi.a> l = Lists.newArrayList();
   private final List<epi.d> m = Lists.newArrayList();
   private kj n = kj.g;
   private String o = "?";

   public kj a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dej $$0, jf $$1, kj $$2, boolean $$3, @Nullable dhm $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jf $$5 = $$1.a($$2).b(-1, -1, -1);
         List<epi.c> $$6 = Lists.newArrayList();
         List<epi.c> $$7 = Lists.newArrayList();
         List<epi.c> $$8 = Lists.newArrayList();
         jf $$9 = new jf(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jf $$10 = new jf(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (jf $$11 : jf.c($$9, $$10)) {
            jf $$12 = $$11.b($$9);
            dus $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               drv $$14 = $$0.c_($$11);
               epi.c $$15;
               if ($$14 != null) {
                  $$15 = new epi.c($$12, $$13, $$14.c($$0.G_()));
               } else {
                  $$15 = new epi.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<epi.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new epi.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(epi.c $$0, List<epi.c> $$1, List<epi.c> $$2, List<epi.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.m(ddy.a, jf.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<epi.c> a(List<epi.c> $$0, List<epi.c> $$1, List<epi.c> $$2) {
      Comparator<epi.c> $$3 = Comparator.<epi.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<epi.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dej $$0, jf $$1, jf $$2) {
      List<btr> $$3 = $$0.a(btr.class, eyr.a($$1, $$2), $$0x -> !($$0x instanceof cnx));
      this.m.clear();

      for (btr $$4 : $$3) {
         eyw $$5 = new eyw($$4.dx() - (double)$$1.u(), $$4.dz() - (double)$$1.v(), $$4.dD() - (double)$$1.w());
         ug $$6 = new ug();
         $$4.e($$6);
         jf $$7;
         if ($$4 instanceof ckc) {
            $$7 = ((ckc)$$4).q().b($$1);
         } else {
            $$7 = jf.a((jy)$$5);
         }

         this.m.add(new epi.d($$5, $$7, $$6.i()));
      }
   }

   public List<epi.c> a(jf $$0, epe $$1, dhm $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<epi.c> a(jf $$0, epe $$1, dhm $$2, boolean $$3) {
      ObjectArrayList<epi.c> $$4 = new ObjectArrayList();
      eky $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (epi.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            jf $$7 = $$3 ? a($$1, $$6.a).a((kj)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new epi.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jf a(epe $$0, jf $$1, epe $$2, jf $$3) {
      jf $$4 = a($$0, $$1);
      jf $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jf a(epe $$0, jf $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dez $$0, jf $$1, jf $$2, epe $$3, azn $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<epi.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eky $$7 = $$3.g();
            List<jf> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jf> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jf, ug>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (epi.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               jf $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eqt $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dus $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     drv $$22 = $$0.c_($$19);
                     brj.a_($$22);
                     $$0.a($$19, dho.hW.n(), 20);
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
                        drv $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bry) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.G_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dmd) {
                           ((dmd)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            jk[] $$25 = new jk[]{jk.b, jk.c, jk.f, jk.d, jk.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<jf> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  jf $$27 = $$26.next();
                  eqt $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     jf $$30 = $$27.a($$25[$$29]);
                     eqt $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dus $$32 = $$0.a_($$27);
                     dhm $$33 = $$32.b();
                     if ($$33 instanceof dmd) {
                        ((dmd)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ezf $$34 = new eyz($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<jf, ug> $$38 : $$10) {
                     jf $$39 = (jf)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<jf, ug> $$40 : $$10) {
                  jf $$41 = (jf)$$40.getFirst();
                  if (!$$3.h()) {
                     dus $$42 = $$0.a_($$41);
                     dus $$43 = dhm.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     drv $$44 = $$0.c_($$41);
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

   public static void a(dek $$0, int $$1, ezf $$2, jf $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dek $$0, int $$1, ezf $$2, int $$3, int $$4, int $$5) {
      jf.a $$6 = new jf.a();
      jf.a $$7 = new jf.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dus $$11 = $$0.a_($$6);
         dus $$12 = $$0.a_($$7);
         dus $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dus $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<epi.c> a(dez $$0, jf $$1, jf $$2, epe $$3, List<epi.c> $$4) {
      List<epi.c> $$5 = new ArrayList<>();
      List<epi.c> $$6 = new ArrayList<>();

      for (epi.c $$7 : $$4) {
         jf $$8 = a($$3, $$7.a).a((kj)$$1);
         epi.c $$9 = new epi.c($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<epf> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (epf $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dez $$0, jf $$1, dmj $$2, doa $$3, jf $$4, @Nullable eky $$5, boolean $$6) {
      for (epi.d $$7 : this.m) {
         jf $$8 = a($$7.b, $$2, $$3, $$4).a((kj)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ug $$9 = $$7.c.i();
            eyw $$10 = a($$7.a, $$2, $$3, $$4);
            eyw $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            um $$12 = new um();
            $$12.add(uh.a($$11.d));
            $$12.add(uh.a($$11.e));
            $$12.add(uh.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dI();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dK());
               if ($$6 && $$5x instanceof bup) {
                  ((bup)$$5x).a($$0, $$0.d_(jf.a((jy)$$11)), btx.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<btr> a(dez $$0, ug $$1) {
      try {
         return bty.a($$1, $$0.E(), btx.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kj a(doa $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kj(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static jf a(jf $$0, dmj $$1, doa $$2, jf $$3) {
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
            return new jf($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new jf($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new jf($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new jf($$4, $$5, $$6) : $$0;
      }
   }

   public static eyw a(eyw $$0, dmj $$1, doa $$2, jf $$3) {
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
            return new eyw((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new eyw((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new eyw((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new eyw($$4, $$5, $$6) : $$0;
      }
   }

   public jf a(jf $$0, dmj $$1, doa $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jf a(jf $$0, dmj $$1, doa $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dmj.c ? $$3 : 0;
      int $$6 = $$1 == dmj.b ? $$4 : 0;
      jf $$7 = $$0;
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

   public eky b(epe $$0, jf $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eky a(jf $$0, doa $$1, jf $$2, dmj $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eky a(jf $$0, doa $$1, jf $$2, dmj $$3, kj $$4) {
      kj $$5 = $$4.c(-1, -1, -1);
      jf $$6 = a(jf.c, $$3, $$1, $$2);
      jf $$7 = a(jf.c.a($$5), $$3, $$1, $$2);
      return eky.a($$6, $$7).a((kj)$$0);
   }

   public ug a(ug $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new um());
         $$0.a("palette", new um());
      } else {
         List<epi.b> $$1 = Lists.newArrayList();
         epi.b $$2 = new epi.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new epi.b());
         }

         um $$4 = new um();
         List<epi.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            epi.c $$7 = $$5.get($$6);
            ug $$8 = new ug();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               epi.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            um $$12 = new um();

            for (dus $$13 : $$2) {
               $$12.add(uv.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            um $$14 = new um();

            for (epi.b $$15 : $$1) {
               um $$16 = new um();

               for (dus $$17 : $$15) {
                  $$16.add(uv.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      um $$18 = new um();

      for (epi.d $$19 : this.m) {
         ug $$20 = new ug();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return uv.e($$0);
   }

   public void a(jp<dhm> $$0, ug $$1) {
      this.l.clear();
      this.m.clear();
      um $$2 = $$1.c("size", 3);
      this.n = new kj($$2.e(0), $$2.e(1), $$2.e(2));
      um $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         um $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      um $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         ug $$8 = $$6.a($$7);
         um $$9 = $$8.c("pos", 6);
         eyw $$10 = new eyw($$9.h(0), $$9.h(1), $$9.h(2));
         um $$11 = $$8.c("blockPos", 3);
         jf $$12 = new jf($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ug $$13 = $$8.p("nbt");
            this.m.add(new epi.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jp<dhm> $$0, um $$1, um $$2) {
      epi.b $$3 = new epi.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uv.a($$0, $$1.a($$4)), $$4);
      }

      List<epi.c> $$5 = Lists.newArrayList();
      List<epi.c> $$6 = Lists.newArrayList();
      List<epi.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ug $$9 = $$2.a($$8);
         um $$10 = $$9.c("pos", 3);
         jf $$11 = new jf($$10.e(0), $$10.e(1), $$10.e(2));
         dus $$12 = $$3.a($$9.h("state"));
         ug $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         epi.c $$15 = new epi.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<epi.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new epi.a($$16));
   }

   private um a(int... $$0) {
      um $$1 = new um();

      for (int $$2 : $$0) {
         $$1.add(ul.a($$2));
      }

      return $$1;
   }

   private um a(double... $$0) {
      um $$1 = new um();

      for (double $$2 : $$0) {
         $$1.add(uh.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<epi.c> a;
      private final Map<dhm, List<epi.c>> b = Maps.newHashMap();

      a(List<epi.c> $$0) {
         this.a = $$0;
      }

      public List<epi.c> a() {
         return this.a;
      }

      public List<epi.c> a(dhm $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dus> {
      public static final dus a = dho.a.n();
      private final ju<dus> b = new ju<>(16);
      private int c;

      public int a(dus $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dus a(int $$0) {
         dus $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dus> iterator() {
         return this.b.iterator();
      }

      public void a(dus $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(jf a, dus b, @Nullable ug c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final eyw a;
      public final jf b;
      public final ug c;

      public d(eyw $$0, jf $$1, ug $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
