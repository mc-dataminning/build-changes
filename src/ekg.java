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

public class ekg {
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
   private final List<ekg.a> l = Lists.newArrayList();
   private final List<ekg.d> m = Lists.newArrayList();
   private jq n = jq.g;
   private String o = "?";

   public jq a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(czu $$0, im $$1, jq $$2, boolean $$3, @Nullable dcv $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         im $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ekg.c> $$6 = Lists.newArrayList();
         List<ekg.c> $$7 = Lists.newArrayList();
         List<ekg.c> $$8 = Lists.newArrayList();
         im $$9 = new im(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         im $$10 = new im(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (im $$11 : im.c($$9, $$10)) {
            im $$12 = $$11.b($$9);
            dpy $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dnd $$14 = $$0.c_($$11);
               ekg.c $$15;
               if ($$14 != null) {
                  $$15 = new ekg.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new ekg.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ekg.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ekg.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ekg.c $$0, List<ekg.c> $$1, List<ekg.c> $$2, List<ekg.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(czj.a, im.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ekg.c> a(List<ekg.c> $$0, List<ekg.c> $$1, List<ekg.c> $$2) {
      Comparator<ekg.c> $$3 = Comparator.<ekg.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ekg.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(czu $$0, im $$1, im $$2) {
      List<bql> $$3 = $$0.a(bql.class, eta.a($$1, $$2), $$0x -> !($$0x instanceof ckl));
      this.m.clear();

      for (bql $$4 : $$3) {
         etf $$5 = new etf($$4.ds() - (double)$$1.u(), $$4.du() - (double)$$1.v(), $$4.dy() - (double)$$1.w());
         ty $$6 = new ty();
         $$4.e($$6);
         im $$7;
         if ($$4 instanceof cgq) {
            $$7 = ((cgq)$$4).D().b($$1);
         } else {
            $$7 = im.a($$5);
         }

         this.m.add(new ekg.d($$5, $$7, $$6.h()));
      }
   }

   public List<ekg.c> a(im $$0, ekc $$1, dcv $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<ekg.c> a(im $$0, ekc $$1, dcv $$2, boolean $$3) {
      ObjectArrayList<ekg.c> $$4 = new ObjectArrayList();
      efy $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ekg.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            im $$7 = $$3 ? a($$1, $$6.a).a((jq)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ekg.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public im a(ekc $$0, im $$1, ekc $$2, im $$3) {
      im $$4 = a($$0, $$1);
      im $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static im a(ekc $$0, im $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(daj $$0, im $$1, im $$2, ekc $$3, ayd $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ekg.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            efy $$7 = $$3.g();
            List<im> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<im> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<im, ty>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ekg.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               im $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  elr $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dpy $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dnd $$22 = $$0.c_($$19);
                     boh.a_($$22);
                     $$0.a($$19, dcx.hW.n(), 20);
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
                        dnd $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof boy) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dhm) {
                           ((dhm)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ir[] $$25 = new ir[]{ir.b, ir.c, ir.f, ir.d, ir.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<im> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  im $$27 = $$26.next();
                  elr $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     im $$30 = $$27.a($$25[$$29]);
                     elr $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dpy $$32 = $$0.a_($$27);
                     dcv $$33 = $$32.b();
                     if ($$33 instanceof dhm) {
                        ((dhm)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  eto $$34 = new eti($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<im, ty> $$38 : $$10) {
                     im $$39 = (im)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<im, ty> $$40 : $$10) {
                  im $$41 = (im)$$40.getFirst();
                  if (!$$3.h()) {
                     dpy $$42 = $$0.a_($$41);
                     dpy $$43 = dcv.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dnd $$44 = $$0.c_($$41);
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

   public static void a(czv $$0, int $$1, eto $$2, im $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(czv $$0, int $$1, eto $$2, int $$3, int $$4, int $$5) {
      im.a $$6 = new im.a();
      im.a $$7 = new im.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dpy $$11 = $$0.a_($$6);
         dpy $$12 = $$0.a_($$7);
         dpy $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dpy $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<ekg.c> a(daj $$0, im $$1, im $$2, ekc $$3, List<ekg.c> $$4) {
      List<ekg.c> $$5 = new ArrayList<>();
      List<ekg.c> $$6 = new ArrayList<>();

      for (ekg.c $$7 : $$4) {
         im $$8 = a($$3, $$7.a).a((jq)$$1);
         ekg.c $$9 = new ekg.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<ekd> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ekd $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(daj $$0, im $$1, dhs $$2, dji $$3, im $$4, @Nullable efy $$5, boolean $$6) {
      for (ekg.d $$7 : this.m) {
         im $$8 = a($$7.b, $$2, $$3, $$4).a((jq)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ty $$9 = $$7.c.h();
            etf $$10 = a($$7.a, $$2, $$3, $$4);
            etf $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            ue $$12 = new ue();
            $$12.add(tz.a($$11.c));
            $$12.add(tz.a($$11.d));
            $$12.add(tz.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dD();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dF());
               if ($$6 && $$5x instanceof brg) {
                  ((brg)$$5x).a($$0, $$0.d_(im.a($$11)), bri.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bql> a(daj $$0, ty $$1) {
      try {
         return bqr.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public jq a(dji $$0) {
      switch ($$0) {
         case d:
         case b:
            return new jq(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static im a(im $$0, dhs $$1, dji $$2, im $$3) {
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
            return new im($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new im($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new im($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new im($$4, $$5, $$6) : $$0;
      }
   }

   public static etf a(etf $$0, dhs $$1, dji $$2, im $$3) {
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
            return new etf((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new etf((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new etf((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new etf($$4, $$5, $$6) : $$0;
      }
   }

   public im a(im $$0, dhs $$1, dji $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static im a(im $$0, dhs $$1, dji $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dhs.c ? $$3 : 0;
      int $$6 = $$1 == dhs.b ? $$4 : 0;
      im $$7 = $$0;
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

   public efy b(ekc $$0, im $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public efy a(im $$0, dji $$1, im $$2, dhs $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static efy a(im $$0, dji $$1, im $$2, dhs $$3, jq $$4) {
      jq $$5 = $$4.c(-1, -1, -1);
      im $$6 = a(im.c, $$3, $$1, $$2);
      im $$7 = a(im.c.a($$5), $$3, $$1, $$2);
      return efy.a($$6, $$7).a((jq)$$0);
   }

   public ty a(ty $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new ue());
         $$0.a("palette", new ue());
      } else {
         List<ekg.b> $$1 = Lists.newArrayList();
         ekg.b $$2 = new ekg.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ekg.b());
         }

         ue $$4 = new ue();
         List<ekg.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ekg.c $$7 = $$5.get($$6);
            ty $$8 = new ty();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ekg.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            ue $$12 = new ue();

            for (dpy $$13 : $$2) {
               $$12.add(un.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            ue $$14 = new ue();

            for (ekg.b $$15 : $$1) {
               ue $$16 = new ue();

               for (dpy $$17 : $$15) {
                  $$16.add(un.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      ue $$18 = new ue();

      for (ekg.d $$19 : this.m) {
         ty $$20 = new ty();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return un.e($$0);
   }

   public void a(iw<dcv> $$0, ty $$1) {
      this.l.clear();
      this.m.clear();
      ue $$2 = $$1.c("size", 3);
      this.n = new jq($$2.e(0), $$2.e(1), $$2.e(2));
      ue $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         ue $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      ue $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         ty $$8 = $$6.a($$7);
         ue $$9 = $$8.c("pos", 6);
         etf $$10 = new etf($$9.h(0), $$9.h(1), $$9.h(2));
         ue $$11 = $$8.c("blockPos", 3);
         im $$12 = new im($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ty $$13 = $$8.p("nbt");
            this.m.add(new ekg.d($$10, $$12, $$13));
         }
      }
   }

   private void a(iw<dcv> $$0, ue $$1, ue $$2) {
      ekg.b $$3 = new ekg.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(un.a($$0, $$1.a($$4)), $$4);
      }

      List<ekg.c> $$5 = Lists.newArrayList();
      List<ekg.c> $$6 = Lists.newArrayList();
      List<ekg.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ty $$9 = $$2.a($$8);
         ue $$10 = $$9.c("pos", 3);
         im $$11 = new im($$10.e(0), $$10.e(1), $$10.e(2));
         dpy $$12 = $$3.a($$9.h("state"));
         ty $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ekg.c $$15 = new ekg.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ekg.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new ekg.a($$16));
   }

   private ue a(int... $$0) {
      ue $$1 = new ue();

      for (int $$2 : $$0) {
         $$1.add(ud.a($$2));
      }

      return $$1;
   }

   private ue a(double... $$0) {
      ue $$1 = new ue();

      for (double $$2 : $$0) {
         $$1.add(tz.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<ekg.c> a;
      private final Map<dcv, List<ekg.c>> b = Maps.newHashMap();

      a(List<ekg.c> $$0) {
         this.a = $$0;
      }

      public List<ekg.c> a() {
         return this.a;
      }

      public List<ekg.c> a(dcv $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dpy> {
      public static final dpy a = dcx.a.n();
      private final jb<dpy> b = new jb<>(16);
      private int c;

      public int a(dpy $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dpy a(int $$0) {
         dpy $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dpy> iterator() {
         return this.b.iterator();
      }

      public void a(dpy $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(im a, dpy b, @Nullable ty c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final etf a;
      public final im b;
      public final ty c;

      public d(etf $$0, im $$1, ty $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
