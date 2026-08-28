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

public class eoq {
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
   private final List<eoq.a> l = Lists.newArrayList();
   private final List<eoq.d> m = Lists.newArrayList();
   private ki n = ki.g;
   private String o = "?";

   public ki a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(dds $$0, je $$1, ki $$2, boolean $$3, @Nullable dgv $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         je $$5 = $$1.a($$2).b(-1, -1, -1);
         List<eoq.c> $$6 = Lists.newArrayList();
         List<eoq.c> $$7 = Lists.newArrayList();
         List<eoq.c> $$8 = Lists.newArrayList();
         je $$9 = new je(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         je $$10 = new je(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (je $$11 : je.c($$9, $$10)) {
            je $$12 = $$11.b($$9);
            dua $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dre $$14 = $$0.c_($$11);
               eoq.c $$15;
               if ($$14 != null) {
                  $$15 = new eoq.c($$12, $$13, $$14.c($$0.F_()));
               } else {
                  $$15 = new eoq.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<eoq.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new eoq.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(eoq.c $$0, List<eoq.c> $$1, List<eoq.c> $$2, List<eoq.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.m(ddh.a, je.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<eoq.c> a(List<eoq.c> $$0, List<eoq.c> $$1, List<eoq.c> $$2) {
      Comparator<eoq.c> $$3 = Comparator.<eoq.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<eoq.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dds $$0, je $$1, je $$2) {
      List<btj> $$3 = $$0.a(btj.class, exz.a($$1, $$2), $$0x -> !($$0x instanceof cnp));
      this.m.clear();

      for (btj $$4 : $$3) {
         eye $$5 = new eye($$4.dx() - (double)$$1.u(), $$4.dz() - (double)$$1.v(), $$4.dD() - (double)$$1.w());
         uf $$6 = new uf();
         $$4.e($$6);
         je $$7;
         if ($$4 instanceof cju) {
            $$7 = ((cju)$$4).q().b($$1);
         } else {
            $$7 = je.a((jx)$$5);
         }

         this.m.add(new eoq.d($$5, $$7, $$6.i()));
      }
   }

   public List<eoq.c> a(je $$0, eom $$1, dgv $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<eoq.c> a(je $$0, eom $$1, dgv $$2, boolean $$3) {
      ObjectArrayList<eoq.c> $$4 = new ObjectArrayList();
      ekg $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (eoq.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            je $$7 = $$3 ? a($$1, $$6.a).a((ki)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new eoq.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public je a(eom $$0, je $$1, eom $$2, je $$3) {
      je $$4 = a($$0, $$1);
      je $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static je a(eom $$0, je $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dei $$0, je $$1, je $$2, eom $$3, azk $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<eoq.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            ekg $$7 = $$3.g();
            List<je> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<je> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<je, uf>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (eoq.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               je $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  eqb $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dua $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dre $$22 = $$0.c_($$19);
                     brb.a_($$22);
                     $$0.a($$19, dgx.hW.o(), 20);
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
                        dre $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof brq) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.F_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dlm) {
                           ((dlm)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            jj[] $$25 = new jj[]{jj.b, jj.c, jj.f, jj.d, jj.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<je> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  je $$27 = $$26.next();
                  eqb $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     je $$30 = $$27.a($$25[$$29]);
                     eqb $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dua $$32 = $$0.a_($$27);
                     dgv $$33 = $$32.b();
                     if ($$33 instanceof dlm) {
                        ((dlm)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  eyn $$34 = new eyh($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<je, uf> $$38 : $$10) {
                     je $$39 = (je)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<je, uf> $$40 : $$10) {
                  je $$41 = (je)$$40.getFirst();
                  if (!$$3.h()) {
                     dua $$42 = $$0.a_($$41);
                     dua $$43 = dgv.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dre $$44 = $$0.c_($$41);
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

   public static void a(ddt $$0, int $$1, eyn $$2, je $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(ddt $$0, int $$1, eyn $$2, int $$3, int $$4, int $$5) {
      je.a $$6 = new je.a();
      je.a $$7 = new je.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dua $$11 = $$0.a_($$6);
         dua $$12 = $$0.a_($$7);
         dua $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dua $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<eoq.c> a(dei $$0, je $$1, je $$2, eom $$3, List<eoq.c> $$4) {
      List<eoq.c> $$5 = new ArrayList<>();
      List<eoq.c> $$6 = new ArrayList<>();

      for (eoq.c $$7 : $$4) {
         je $$8 = a($$3, $$7.a).a((ki)$$1);
         eoq.c $$9 = new eoq.c($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<eon> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (eon $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dei $$0, je $$1, dls $$2, dnj $$3, je $$4, @Nullable ekg $$5, boolean $$6) {
      for (eoq.d $$7 : this.m) {
         je $$8 = a($$7.b, $$2, $$3, $$4).a((ki)$$1);
         if ($$5 == null || $$5.b($$8)) {
            uf $$9 = $$7.c.i();
            eye $$10 = a($$7.a, $$2, $$3, $$4);
            eye $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ul $$12 = new ul();
            $$12.add(ug.a($$11.d));
            $$12.add(ug.a($$11.e));
            $$12.add(ug.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dI();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dK());
               if ($$6 && $$5x instanceof buh) {
                  ((buh)$$5x).a($$0, $$0.d_(je.a((jx)$$11)), btp.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<btj> a(dei $$0, uf $$1) {
      try {
         return btq.a($$1, $$0.E(), btp.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public ki a(dnj $$0) {
      switch ($$0) {
         case d:
         case b:
            return new ki(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static je a(je $$0, dls $$1, dnj $$2, je $$3) {
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
            return new je($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new je($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new je($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new je($$4, $$5, $$6) : $$0;
      }
   }

   public static eye a(eye $$0, dls $$1, dnj $$2, je $$3) {
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
            return new eye((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new eye((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new eye((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new eye($$4, $$5, $$6) : $$0;
      }
   }

   public je a(je $$0, dls $$1, dnj $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static je a(je $$0, dls $$1, dnj $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dls.c ? $$3 : 0;
      int $$6 = $$1 == dls.b ? $$4 : 0;
      je $$7 = $$0;
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

   public ekg b(eom $$0, je $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public ekg a(je $$0, dnj $$1, je $$2, dls $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static ekg a(je $$0, dnj $$1, je $$2, dls $$3, ki $$4) {
      ki $$5 = $$4.c(-1, -1, -1);
      je $$6 = a(je.c, $$3, $$1, $$2);
      je $$7 = a(je.c.a($$5), $$3, $$1, $$2);
      return ekg.a($$6, $$7).a((ki)$$0);
   }

   public uf a(uf $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ul());
         $$0.a("palette", new ul());
      } else {
         List<eoq.b> $$1 = Lists.newArrayList();
         eoq.b $$2 = new eoq.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new eoq.b());
         }

         ul $$4 = new ul();
         List<eoq.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            eoq.c $$7 = $$5.get($$6);
            uf $$8 = new uf();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               eoq.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ul $$12 = new ul();

            for (dua $$13 : $$2) {
               $$12.add(uu.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ul $$14 = new ul();

            for (eoq.b $$15 : $$1) {
               ul $$16 = new ul();

               for (dua $$17 : $$15) {
                  $$16.add(uu.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ul $$18 = new ul();

      for (eoq.d $$19 : this.m) {
         uf $$20 = new uf();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return uu.e($$0);
   }

   public void a(jo<dgv> $$0, uf $$1) {
      this.l.clear();
      this.m.clear();
      ul $$2 = $$1.c("size", 3);
      this.n = new ki($$2.e(0), $$2.e(1), $$2.e(2));
      ul $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ul $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ul $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         uf $$8 = $$6.a($$7);
         ul $$9 = $$8.c("pos", 6);
         eye $$10 = new eye($$9.h(0), $$9.h(1), $$9.h(2));
         ul $$11 = $$8.c("blockPos", 3);
         je $$12 = new je($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            uf $$13 = $$8.p("nbt");
            this.m.add(new eoq.d($$10, $$12, $$13));
         }
      }
   }

   private void a(jo<dgv> $$0, ul $$1, ul $$2) {
      eoq.b $$3 = new eoq.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uu.a($$0, $$1.a($$4)), $$4);
      }

      List<eoq.c> $$5 = Lists.newArrayList();
      List<eoq.c> $$6 = Lists.newArrayList();
      List<eoq.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         uf $$9 = $$2.a($$8);
         ul $$10 = $$9.c("pos", 3);
         je $$11 = new je($$10.e(0), $$10.e(1), $$10.e(2));
         dua $$12 = $$3.a($$9.h("state"));
         uf $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         eoq.c $$15 = new eoq.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<eoq.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new eoq.a($$16));
   }

   private ul a(int... $$0) {
      ul $$1 = new ul();

      for (int $$2 : $$0) {
         $$1.add(uk.a($$2));
      }

      return $$1;
   }

   private ul a(double... $$0) {
      ul $$1 = new ul();

      for (double $$2 : $$0) {
         $$1.add(ug.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<eoq.c> a;
      private final Map<dgv, List<eoq.c>> b = Maps.newHashMap();

      a(List<eoq.c> $$0) {
         this.a = $$0;
      }

      public List<eoq.c> a() {
         return this.a;
      }

      public List<eoq.c> a(dgv $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dua> {
      public static final dua a = dgx.a.o();
      private final jt<dua> b = new jt<>(16);
      private int c;

      public int a(dua $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dua a(int $$0) {
         dua $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dua> iterator() {
         return this.b.iterator();
      }

      public void a(dua $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(je a, dua b, @Nullable uf c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final eye a;
      public final je b;
      public final uf c;

      public d(eye $$0, je $$1, uf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
