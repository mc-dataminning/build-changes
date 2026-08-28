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

public class ewf {
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
   private final List<ewf.b> l = Lists.newArrayList();
   private final List<ewf.e> m = Lists.newArrayList();
   private kb n = kb.i;
   private String o = "?";

   public kb a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(djz $$0, iw $$1, kb $$2, boolean $$3, @Nullable dne $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         iw $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ewf.d> $$6 = Lists.newArrayList();
         List<ewf.d> $$7 = Lists.newArrayList();
         List<ewf.d> $$8 = Lists.newArrayList();
         iw $$9 = new iw(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         iw $$10 = new iw(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (iw $$11 : iw.c($$9, $$10)) {
            iw $$12 = $$11.b($$9);
            ebg $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dye $$14 = $$0.c_($$11);
               ewf.d $$15;
               if ($$14 != null) {
                  $$15 = new ewf.d($$12, $$13, $$14.c($$0.J_()));
               } else {
                  $$15 = new ewf.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ewf.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ewf.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ewf.d $$0, List<ewf.d> $$1, List<ewf.d> $$2, List<ewf.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(djp.a, iw.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ewf.d> a(List<ewf.d> $$0, List<ewf.d> $$1, List<ewf.d> $$2) {
      Comparator<ewf.d> $$3 = Comparator.<ewf.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ewf.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(djz $$0, iw $$1, iw $$2) {
      List<bwv> $$3 = $$0.a(bwv.class, ffn.a($$1, $$2), $$0x -> !($$0x instanceof crz));
      this.m.clear();

      for (bwv $$4 : $$3) {
         ffs $$5 = new ffs($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         ua $$6 = new ua();
         $$4.g($$6);
         iw $$7;
         if ($$4 instanceof cnz) {
            $$7 = ((cnz)$$4).j().b($$1);
         } else {
            $$7 = iw.a((jq)$$5);
         }

         this.m.add(new ewf.e($$5, $$7, $$6.l()));
      }
   }

   public List<ewf.d> a(iw $$0, ewb $$1, dne $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<ewf.a> a(iw $$0, dty $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         ewb $$2 = new ewb().a($$1);
         List<ewf.a> $$3 = $$2.a(this.l, $$0).a();
         List<ewf.a> $$4 = new ArrayList<>($$3.size());

         for (ewf.a $$5 : $$3) {
            ewf.d $$6 = $$5.a;
            $$4.add($$5.b(new ewf.d(a($$2, $$6.a()).a((kb)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<ewf.d> a(iw $$0, ewb $$1, dne $$2, boolean $$3) {
      ObjectArrayList<ewf.d> $$4 = new ObjectArrayList();
      erv $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ewf.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            iw $$7 = $$3 ? a($$1, $$6.a).a((kb)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ewf.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public iw a(ewb $$0, iw $$1, ewb $$2, iw $$3) {
      iw $$4 = a($$0, $$1);
      iw $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static iw a(ewb $$0, iw $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dkq $$0, iw $$1, iw $$2, ewb $$3, azz $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ewf.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            erv $$7 = $$3.g();
            List<iw> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<iw> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<iw, ua>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ewf.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               iw $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  exq $$20 = $$3.j() ? $$0.b_($$19) : null;
                  ebg $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     $$0.a($$19, dng.iy.m(), 820);
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
                        dye $$22 = $$0.c_($$19);
                        if ($$22 != null) {
                           if ($$22 instanceof buz) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$22.c($$18.c, $$0.J_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dsb) {
                           ((dsb)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$23 = true;
            jc[] $$24 = new jc[]{jc.b, jc.c, jc.f, jc.d, jc.e};

            while ($$23 && !$$8.isEmpty()) {
               $$23 = false;
               Iterator<iw> $$25 = $$8.iterator();

               while ($$25.hasNext()) {
                  iw $$26 = $$25.next();
                  exq $$27 = $$0.b_($$26);

                  for (int $$28 = 0; $$28 < $$24.length && !$$27.b(); $$28++) {
                     iw $$29 = $$26.a($$24[$$28]);
                     exq $$30 = $$0.b_($$29);
                     if ($$30.b() && !$$9.contains($$29)) {
                        $$27 = $$30;
                     }
                  }

                  if ($$27.b()) {
                     ebg $$31 = $$0.a_($$26);
                     dne $$32 = $$31.b();
                     if ($$32 instanceof dsb) {
                        ((dsb)$$32).a($$0, $$26, $$31, $$27);
                        $$23 = true;
                        $$25.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fgb $$33 = new ffv($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$34 = $$11;
                  int $$35 = $$12;
                  int $$36 = $$13;

                  for (Pair<iw, ua> $$37 : $$10) {
                     iw $$38 = (iw)$$37.getFirst();
                     $$33.c($$38.u() - $$34, $$38.v() - $$35, $$38.w() - $$36);
                  }

                  a($$0, $$5, $$33, $$34, $$35, $$36);
               }

               for (Pair<iw, ua> $$39 : $$10) {
                  iw $$40 = (iw)$$39.getFirst();
                  if (!$$3.h()) {
                     ebg $$41 = $$0.a_($$40);
                     ebg $$42 = dne.b($$41, $$0, $$40);
                     if ($$41 != $$42) {
                        $$0.a($$40, $$42, $$5 & -2 | 16);
                     }

                     $$0.a($$40, $$42.b());
                  }

                  if ($$39.getSecond() != null) {
                     dye $$43 = $$0.c_($$40);
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

   public static void a(dka $$0, int $$1, fgb $$2, iw $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dka $$0, int $$1, fgb $$2, int $$3, int $$4, int $$5) {
      iw.a $$6 = new iw.a();
      iw.a $$7 = new iw.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         ebg $$11 = $$0.a_($$6);
         ebg $$12 = $$0.a_($$7);
         ebg $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.G_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         ebg $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.G_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<ewf.d> a(dkq $$0, iw $$1, iw $$2, ewb $$3, List<ewf.d> $$4) {
      List<ewf.d> $$5 = new ArrayList<>();
      List<ewf.d> $$6 = new ArrayList<>();

      for (ewf.d $$7 : $$4) {
         iw $$8 = a($$3, $$7.a).a((kb)$$1);
         ewf.d $$9 = new ewf.d($$8, $$7.b, $$7.c != null ? $$7.c.l() : null);
         Iterator<ewc> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ewc $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dkq $$0, iw $$1, dsh $$2, dty $$3, iw $$4, @Nullable erv $$5, boolean $$6) {
      for (ewf.e $$7 : this.m) {
         iw $$8 = a($$7.b, $$2, $$3, $$4).a((kb)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ua $$9 = $$7.c.l();
            ffs $$10 = a($$7.a, $$2, $$3, $$4);
            ffs $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ug $$12 = new ug();
            $$12.add(ub.a($$11.d));
            $$12.add(ub.a($$11.e));
            $$12.add(ub.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dL();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dN());
               if ($$6 && $$5x instanceof bxy) {
                  ((bxy)$$5x).a($$0, $$0.d_(iw.a((jq)$$11)), bxd.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bwv> a(dkq $$0, ua $$1) {
      try {
         return bxe.a($$1, $$0.a(), bxd.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kb a(dty $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kb(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static iw a(iw $$0, dsh $$1, dty $$2, iw $$3) {
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
            return new iw($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new iw($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new iw($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new iw($$4, $$5, $$6) : $$0;
      }
   }

   public static ffs a(ffs $$0, dsh $$1, dty $$2, iw $$3) {
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
            return new ffs((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ffs((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ffs((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ffs($$4, $$5, $$6) : $$0;
      }
   }

   public iw a(iw $$0, dsh $$1, dty $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static iw a(iw $$0, dsh $$1, dty $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dsh.c ? $$3 : 0;
      int $$6 = $$1 == dsh.b ? $$4 : 0;
      iw $$7 = $$0;
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

   public erv b(ewb $$0, iw $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public erv a(iw $$0, dty $$1, iw $$2, dsh $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static erv a(iw $$0, dty $$1, iw $$2, dsh $$3, kb $$4) {
      kb $$5 = $$4.c(-1, -1, -1);
      iw $$6 = a(iw.c, $$3, $$1, $$2);
      iw $$7 = a(iw.c.a($$5), $$3, $$1, $$2);
      return erv.a($$6, $$7).a((kb)$$0);
   }

   public ua a(ua $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ug());
         $$0.a("palette", new ug());
      } else {
         List<ewf.c> $$1 = Lists.newArrayList();
         ewf.c $$2 = new ewf.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ewf.c());
         }

         ug $$4 = new ug();
         List<ewf.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ewf.d $$7 = $$5.get($$6);
            ua $$8 = new ua();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ewf.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ug $$12 = new ug();

            for (ebg $$13 : $$2) {
               $$12.add(up.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ug $$14 = new ug();

            for (ewf.c $$15 : $$1) {
               ug $$16 = new ug();

               for (ebg $$17 : $$15) {
                  $$16.add(up.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ug $$18 = new ug();

      for (ewf.e $$19 : this.m) {
         ua $$20 = new ua();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return up.e($$0);
   }

   public void a(jh<dne> $$0, ua $$1) {
      this.l.clear();
      this.m.clear();
      ug $$2 = $$1.p("size");
      this.n = new kb($$2.a(0, 0), $$2.a(1, 0), $$2.a(2, 0));
      ug $$3 = $$1.p("blocks");
      Optional<ug> $$4 = $$1.o("palettes");
      if ($$4.isPresent()) {
         for (int $$5 = 0; $$5 < $$4.get().size(); $$5++) {
            this.a($$0, $$4.get().f($$5), $$3);
         }
      } else {
         this.a($$0, $$1.p("palette"), $$3);
      }

      $$1.p("entities").j().forEach($$0x -> {
         ug $$1x = $$0x.p("pos");
         ffs $$2x = new ffs($$1x.a(0, 0.0), $$1x.a(1, 0.0), $$1x.a(2, 0.0));
         ug $$3x = $$0x.p("blockPos");
         iw $$4x = new iw($$3x.a(0, 0), $$3x.a(1, 0), $$3x.a(2, 0));
         $$0x.m("nbt").ifPresent($$2xx -> this.m.add(new ewf.e($$2x, $$4x, $$2xx)));
      });
   }

   private void a(jh<dne> $$0, ug $$1, ug $$2) {
      ewf.c $$3 = new ewf.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(up.a($$0, $$1.b($$4)), $$4);
      }

      List<ewf.d> $$5 = Lists.newArrayList();
      List<ewf.d> $$6 = Lists.newArrayList();
      List<ewf.d> $$7 = Lists.newArrayList();
      $$2.j().forEach($$4 -> {
         ug $$5x = $$4.p("pos");
         iw $$6x = new iw($$5x.a(0, 0), $$5x.a(1, 0), $$5x.a(2, 0));
         ebg $$7x = $$3.a($$4.b("state", 0));
         ua $$8x = $$4.m("nbt").orElse(null);
         ewf.d $$9 = new ewf.d($$6x, $$7x, $$8x);
         a($$9, $$5, $$6, $$7);
      });
      List<ewf.d> $$8 = a($$5, $$6, $$7);
      this.l.add(new ewf.b($$8));
   }

   private ug a(int... $$0) {
      ug $$1 = new ug();

      for (int $$2 : $$0) {
         $$1.add(uf.a($$2));
      }

      return $$1;
   }

   private ug a(double... $$0) {
      ug $$1 = new ug();

      for (double $$2 : $$0) {
         $$1.add(ub.a($$2));
      }

      return $$1;
   }

   public static dzi.a a(ua $$0, ebg $$1) {
      return $$0.<dzi.a>a("joint", dzi.a.c).orElseGet(() -> a($$1));
   }

   public static dzi.a a(ebg $$0) {
      return drl.o($$0).o().d() ? dzi.a.b : dzi.a.a;
   }

   public static record a(ewf.d a, dzi.a b, alk c, alj<etn> d, alk e, int f, int g) {

      public static ewf.a a(ewf.d $$0) {
         ua $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new ewf.a(
            $$0,
            ewf.a($$1, $$0.b()),
            $$1.<alk>a("name", alk.a).orElse(dzi.b),
            $$1.<alj<etn>>a("pool", dzi.a).orElse(qp.a),
            $$1.<alk>a("target", alk.a).orElse(dzi.b),
            $$1.b("placement_priority", 0),
            $$1.b("selection_priority", 0)
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
            this.d.a(),
            this.e,
            this.f,
            this.g,
            this.a.c
         );
      }

      public ewf.a b(ewf.d $$0) {
         return new ewf.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<ewf.d> a;
      private final Map<dne, List<ewf.d>> b = Maps.newHashMap();
      @Nullable
      private List<ewf.a> c;

      b(List<ewf.d> $$0) {
         this.a = $$0;
      }

      public List<ewf.a> a() {
         if (this.c == null) {
            this.c = this.a(dng.pH).stream().map(ewf.a::a).toList();
         }

         return this.c;
      }

      public List<ewf.d> b() {
         return this.a;
      }

      public List<ewf.d> a(dne $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<ebg> {
      public static final ebg a = dng.a.m();
      private final jm<ebg> b = new jm<>(16);
      private int c;

      public int a(ebg $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public ebg a(int $$0) {
         ebg $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<ebg> iterator() {
         return this.b.iterator();
      }

      public void a(ebg $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(iw a, ebg b, @Nullable ua c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final ffs a;
      public final iw b;
      public final ua c;

      public e(ffs $$0, iw $$1, ua $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
