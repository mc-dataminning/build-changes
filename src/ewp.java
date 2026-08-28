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

public class ewp {
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
   private final List<ewp.b> l = Lists.newArrayList();
   private final List<ewp.e> m = Lists.newArrayList();
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

   public void a(dkj $$0, iw $$1, kb $$2, boolean $$3, @Nullable dno $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         iw $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ewp.d> $$6 = Lists.newArrayList();
         List<ewp.d> $$7 = Lists.newArrayList();
         List<ewp.d> $$8 = Lists.newArrayList();
         iw $$9 = new iw(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         iw $$10 = new iw(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (iw $$11 : iw.c($$9, $$10)) {
            iw $$12 = $$11.b($$9);
            ebq $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dyo $$14 = $$0.c_($$11);
               ewp.d $$15;
               if ($$14 != null) {
                  $$15 = new ewp.d($$12, $$13, $$14.c($$0.J_()));
               } else {
                  $$15 = new ewp.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ewp.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ewp.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ewp.d $$0, List<ewp.d> $$1, List<ewp.d> $$2, List<ewp.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(djz.a, iw.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ewp.d> a(List<ewp.d> $$0, List<ewp.d> $$1, List<ewp.d> $$2) {
      Comparator<ewp.d> $$3 = Comparator.<ewp.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ewp.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dkj $$0, iw $$1, iw $$2) {
      List<bxe> $$3 = $$0.a(bxe.class, ffx.a($$1, $$2), $$0x -> !($$0x instanceof csi));
      this.m.clear();

      for (bxe $$4 : $$3) {
         fgc $$5 = new fgc($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         ua $$6 = new ua();
         $$4.g($$6);
         iw $$7;
         if ($$4 instanceof coi) {
            $$7 = ((coi)$$4).i().b($$1);
         } else {
            $$7 = iw.a((jq)$$5);
         }

         this.m.add(new ewp.e($$5, $$7, $$6.l()));
      }
   }

   public List<ewp.d> a(iw $$0, ewl $$1, dno $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<ewp.a> a(iw $$0, dui $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         ewl $$2 = new ewl().a($$1);
         List<ewp.a> $$3 = $$2.a(this.l, $$0).a();
         List<ewp.a> $$4 = new ArrayList<>($$3.size());

         for (ewp.a $$5 : $$3) {
            ewp.d $$6 = $$5.a;
            $$4.add($$5.b(new ewp.d(a($$2, $$6.a()).a((kb)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<ewp.d> a(iw $$0, ewl $$1, dno $$2, boolean $$3) {
      ObjectArrayList<ewp.d> $$4 = new ObjectArrayList();
      esf $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ewp.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            iw $$7 = $$3 ? a($$1, $$6.a).a((kb)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ewp.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public iw a(ewl $$0, iw $$1, ewl $$2, iw $$3) {
      iw $$4 = a($$0, $$1);
      iw $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static iw a(ewl $$0, iw $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dla $$0, iw $$1, iw $$2, ewl $$3, bai $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ewp.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            esf $$7 = $$3.g();
            List<iw> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<iw> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<iw, ua>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ewp.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               iw $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eya $$20 = $$3.j() ? $$0.b_($$19) : null;
                  ebq $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     $$0.a($$19, dnq.iy.m(), 820);
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
                        dyo $$22 = $$0.c_($$19);
                        if ($$22 != null) {
                           if ($$22 instanceof bvi) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$22.c($$18.c, $$0.J_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dsl) {
                           ((dsl)$$21.b()).a($$0, $$19, $$21, $$20);
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
                  eya $$27 = $$0.b_($$26);

                  for (int $$28 = 0; $$28 < $$24.length && !$$27.b(); $$28++) {
                     iw $$29 = $$26.a($$24[$$28]);
                     eya $$30 = $$0.b_($$29);
                     if ($$30.b() && !$$9.contains($$29)) {
                        $$27 = $$30;
                     }
                  }

                  if ($$27.b()) {
                     ebq $$31 = $$0.a_($$26);
                     dno $$32 = $$31.b();
                     if ($$32 instanceof dsl) {
                        ((dsl)$$32).a($$0, $$26, $$31, $$27);
                        $$23 = true;
                        $$25.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fgl $$33 = new fgf($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
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
                     ebq $$41 = $$0.a_($$40);
                     ebq $$42 = dno.b($$41, $$0, $$40);
                     if ($$41 != $$42) {
                        $$0.a($$40, $$42, $$5 & -2 | 16);
                     }

                     $$0.a($$40, $$42.b());
                  }

                  if ($$39.getSecond() != null) {
                     dyo $$43 = $$0.c_($$40);
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

   public static void a(dkk $$0, int $$1, fgl $$2, iw $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dkk $$0, int $$1, fgl $$2, int $$3, int $$4, int $$5) {
      iw.a $$6 = new iw.a();
      iw.a $$7 = new iw.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         ebq $$11 = $$0.a_($$6);
         ebq $$12 = $$0.a_($$7);
         ebq $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.G_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         ebq $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.G_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<ewp.d> a(dla $$0, iw $$1, iw $$2, ewl $$3, List<ewp.d> $$4) {
      List<ewp.d> $$5 = new ArrayList<>();
      List<ewp.d> $$6 = new ArrayList<>();

      for (ewp.d $$7 : $$4) {
         iw $$8 = a($$3, $$7.a).a((kb)$$1);
         ewp.d $$9 = new ewp.d($$8, $$7.b, $$7.c != null ? $$7.c.l() : null);
         Iterator<ewm> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ewm $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dla $$0, iw $$1, dsr $$2, dui $$3, iw $$4, @Nullable esf $$5, boolean $$6) {
      for (ewp.e $$7 : this.m) {
         iw $$8 = a($$7.b, $$2, $$3, $$4).a((kb)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ua $$9 = $$7.c.l();
            fgc $$10 = a($$7.a, $$2, $$3, $$4);
            fgc $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
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
               if ($$6 && $$5x instanceof byh) {
                  ((byh)$$5x).a($$0, $$0.d_(iw.a((jq)$$11)), bxm.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bxe> a(dla $$0, ua $$1) {
      try {
         return bxn.a($$1, $$0.a(), bxm.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kb a(dui $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kb(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static iw a(iw $$0, dsr $$1, dui $$2, iw $$3) {
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

   public static fgc a(fgc $$0, dsr $$1, dui $$2, iw $$3) {
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
            return new fgc((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fgc((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fgc((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fgc($$4, $$5, $$6) : $$0;
      }
   }

   public iw a(iw $$0, dsr $$1, dui $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static iw a(iw $$0, dsr $$1, dui $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dsr.c ? $$3 : 0;
      int $$6 = $$1 == dsr.b ? $$4 : 0;
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

   public esf b(ewl $$0, iw $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public esf a(iw $$0, dui $$1, iw $$2, dsr $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static esf a(iw $$0, dui $$1, iw $$2, dsr $$3, kb $$4) {
      kb $$5 = $$4.c(-1, -1, -1);
      iw $$6 = a(iw.c, $$3, $$1, $$2);
      iw $$7 = a(iw.c.a($$5), $$3, $$1, $$2);
      return esf.a($$6, $$7).a((kb)$$0);
   }

   public ua a(ua $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ug());
         $$0.a("palette", new ug());
      } else {
         List<ewp.c> $$1 = Lists.newArrayList();
         ewp.c $$2 = new ewp.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ewp.c());
         }

         ug $$4 = new ug();
         List<ewp.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ewp.d $$7 = $$5.get($$6);
            ua $$8 = new ua();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ewp.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ug $$12 = new ug();

            for (ebq $$13 : $$2) {
               $$12.add(up.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ug $$14 = new ug();

            for (ewp.c $$15 : $$1) {
               ug $$16 = new ug();

               for (ebq $$17 : $$15) {
                  $$16.add(up.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ug $$18 = new ug();

      for (ewp.e $$19 : this.m) {
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

   public void a(jh<dno> $$0, ua $$1) {
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
         fgc $$2x = new fgc($$1x.a(0, 0.0), $$1x.a(1, 0.0), $$1x.a(2, 0.0));
         ug $$3x = $$0x.p("blockPos");
         iw $$4x = new iw($$3x.a(0, 0), $$3x.a(1, 0), $$3x.a(2, 0));
         $$0x.m("nbt").ifPresent($$2xx -> this.m.add(new ewp.e($$2x, $$4x, $$2xx)));
      });
   }

   private void a(jh<dno> $$0, ug $$1, ug $$2) {
      ewp.c $$3 = new ewp.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(up.a($$0, $$1.b($$4)), $$4);
      }

      List<ewp.d> $$5 = Lists.newArrayList();
      List<ewp.d> $$6 = Lists.newArrayList();
      List<ewp.d> $$7 = Lists.newArrayList();
      $$2.j().forEach($$4 -> {
         ug $$5x = $$4.p("pos");
         iw $$6x = new iw($$5x.a(0, 0), $$5x.a(1, 0), $$5x.a(2, 0));
         ebq $$7x = $$3.a($$4.b("state", 0));
         ua $$8x = $$4.m("nbt").orElse(null);
         ewp.d $$9 = new ewp.d($$6x, $$7x, $$8x);
         a($$9, $$5, $$6, $$7);
      });
      List<ewp.d> $$8 = a($$5, $$6, $$7);
      this.l.add(new ewp.b($$8));
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

   public static dzs.a a(ua $$0, ebq $$1) {
      return $$0.<dzs.a>a("joint", dzs.a.c).orElseGet(() -> a($$1));
   }

   public static dzs.a a(ebq $$0) {
      return drv.o($$0).o().d() ? dzs.a.b : dzs.a.a;
   }

   public static record a(ewp.d a, dzs.a b, alr c, alq<etx> d, alr e, int f, int g) {

      public static ewp.a a(ewp.d $$0) {
         ua $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new ewp.a(
            $$0,
            ewp.a($$1, $$0.b()),
            $$1.<alr>a("name", alr.a).orElse(dzs.b),
            $$1.<alq<etx>>a("pool", dzs.a).orElse(qp.a),
            $$1.<alr>a("target", alr.a).orElse(dzs.b),
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

      public ewp.a b(ewp.d $$0) {
         return new ewp.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<ewp.d> a;
      private final Map<dno, List<ewp.d>> b = Maps.newHashMap();
      @Nullable
      private List<ewp.a> c;

      b(List<ewp.d> $$0) {
         this.a = $$0;
      }

      public List<ewp.a> a() {
         if (this.c == null) {
            this.c = this.a(dnq.pH).stream().map(ewp.a::a).toList();
         }

         return this.c;
      }

      public List<ewp.d> b() {
         return this.a;
      }

      public List<ewp.d> a(dno $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<ebq> {
      public static final ebq a = dnq.a.m();
      private final jm<ebq> b = new jm<>(16);
      private int c;

      public int a(ebq $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public ebq a(int $$0) {
         ebq $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<ebq> iterator() {
         return this.b.iterator();
      }

      public void a(ebq $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(iw a, ebq b, @Nullable ua c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fgc a;
      public final iw b;
      public final ua c;

      public e(fgc $$0, iw $$1, ua $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
