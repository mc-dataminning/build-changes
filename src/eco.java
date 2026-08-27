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

public class eco {
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
   private final List<eco.a> l = Lists.newArrayList();
   private final List<eco.d> m = Lists.newArrayList();
   private iz n = iz.g;
   private String o = "?";

   public iz a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(csy $$0, hv $$1, iz $$2, boolean $$3, @Nullable cvz $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         hv $$5 = $$1.a($$2).b(-1, -1, -1);
         List<eco.c> $$6 = Lists.newArrayList();
         List<eco.c> $$7 = Lists.newArrayList();
         List<eco.c> $$8 = Lists.newArrayList();
         hv $$9 = new hv(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         hv $$10 = new hv(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (hv $$11 : hv.a($$9, $$10)) {
            hv $$12 = $$11.b($$9);
            dip $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dgd $$14 = $$0.c_($$11);
               eco.c $$15;
               if ($$14 != null) {
                  $$15 = new eco.c($$12, $$13, $$14.p());
               } else {
                  $$15 = new eco.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<eco.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new eco.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(eco.c $$0, List<eco.c> $$1, List<eco.c> $$2, List<eco.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().p() && $$0.b.r(csn.a, hv.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<eco.c> a(List<eco.c> $$0, List<eco.c> $$1, List<eco.c> $$2) {
      Comparator<eco.c> $$3 = Comparator.<eco.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<eco.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(csy $$0, hv $$1, hv $$2) {
      List<blf> $$3 = $$0.a(blf.class, ekw.a($$1, $$2), $$0x -> !($$0x instanceof cer));
      this.m.clear();

      for (blf $$4 : $$3) {
         elb $$5 = new elb($$4.dr() - (double)$$1.u(), $$4.dt() - (double)$$1.v(), $$4.dx() - (double)$$1.w());
         sj $$6 = new sj();
         $$4.e($$6);
         hv $$7;
         if ($$4 instanceof caz) {
            $$7 = ((caz)$$4).E().b($$1);
         } else {
            $$7 = hv.a($$5);
         }

         this.m.add(new eco.d($$5, $$7, $$6.h()));
      }
   }

   public List<eco.c> a(hv $$0, eck $$1, cvz $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<eco.c> a(hv $$0, eck $$1, cvz $$2, boolean $$3) {
      ObjectArrayList<eco.c> $$4 = new ObjectArrayList();
      dyg $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (eco.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            hv $$7 = $$3 ? a($$1, $$6.a).a((iz)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new eco.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public hv a(eck $$0, hv $$1, eck $$2, hv $$3) {
      hv $$4 = a($$0, $$1);
      hv $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static hv a(eck $$0, hv $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(ctn $$0, hv $$1, hv $$2, eck $$3, auf $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<eco.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            dyg $$7 = $$3.g();
            List<hv> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<hv> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<hv, sj>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (eco.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               hv $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  edz $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dip $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dgd $$22 = $$0.c_($$19);
                     bjc.a_($$22);
                     $$0.a($$19, cwb.hW.o(), 20);
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
                        dgd $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bjs) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dap) {
                           ((dap)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ia[] $$25 = new ia[]{ia.b, ia.c, ia.f, ia.d, ia.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<hv> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  hv $$27 = $$26.next();
                  edz $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     hv $$30 = $$27.a($$25[$$29]);
                     edz $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dip $$32 = $$0.a_($$27);
                     cvz $$33 = $$32.b();
                     if ($$33 instanceof dap) {
                        ((dap)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  elk $$34 = new ele($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<hv, sj> $$38 : $$10) {
                     hv $$39 = (hv)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<hv, sj> $$40 : $$10) {
                  hv $$41 = (hv)$$40.getFirst();
                  if (!$$3.h()) {
                     dip $$42 = $$0.a_($$41);
                     dip $$43 = cvz.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dgd $$44 = $$0.c_($$41);
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

   public static void a(csz $$0, int $$1, elk $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         hv $$9 = new hv($$3 + $$6, $$4 + $$7, $$5 + $$8);
         hv $$10 = $$9.a($$5x);
         dip $$11 = $$0.a_($$9);
         dip $$12 = $$0.a_($$10);
         dip $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dip $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<eco.c> a(ctn $$0, hv $$1, hv $$2, eck $$3, List<eco.c> $$4) {
      List<eco.c> $$5 = new ArrayList<>();
      List<eco.c> $$6 = new ArrayList<>();

      for (eco.c $$7 : $$4) {
         hv $$8 = a($$3, $$7.a).a((iz)$$1);
         eco.c $$9 = new eco.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<ecl> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ecl $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(ctn $$0, hv $$1, dav $$2, dcl $$3, hv $$4, @Nullable dyg $$5, boolean $$6) {
      for (eco.d $$7 : this.m) {
         hv $$8 = a($$7.b, $$2, $$3, $$4).a((iz)$$1);
         if ($$5 == null || $$5.b($$8)) {
            sj $$9 = $$7.c.h();
            elb $$10 = a($$7.a, $$2, $$3, $$4);
            elb $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            sp $$12 = new sp();
            $$12.add(sk.a($$11.c));
            $$12.add(sk.a($$11.d));
            $$12.add(sk.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dC();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.dE());
               if ($$6 && $$6x instanceof blx) {
                  ((blx)$$6x).a($$0, $$0.d_(hv.a($$11)), blz.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }
   }

   private static Optional<blf> a(ctn $$0, sj $$1) {
      try {
         return blj.a($$1, $$0.D());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public iz a(dcl $$0) {
      switch ($$0) {
         case d:
         case b:
            return new iz(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static hv a(hv $$0, dav $$1, dcl $$2, hv $$3) {
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
            return new hv($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new hv($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new hv($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new hv($$4, $$5, $$6) : $$0;
      }
   }

   public static elb a(elb $$0, dav $$1, dcl $$2, hv $$3) {
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
            return new elb((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new elb((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new elb((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new elb($$4, $$5, $$6) : $$0;
      }
   }

   public hv a(hv $$0, dav $$1, dcl $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static hv a(hv $$0, dav $$1, dcl $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dav.c ? $$3 : 0;
      int $$6 = $$1 == dav.b ? $$4 : 0;
      hv $$7 = $$0;
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

   public dyg b(eck $$0, hv $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dyg a(hv $$0, dcl $$1, hv $$2, dav $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static dyg a(hv $$0, dcl $$1, hv $$2, dav $$3, iz $$4) {
      iz $$5 = $$4.c(-1, -1, -1);
      hv $$6 = a(hv.b, $$3, $$1, $$2);
      hv $$7 = a(hv.b.a($$5), $$3, $$1, $$2);
      return dyg.a($$6, $$7).a((iz)$$0);
   }

   public sj a(sj $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new sp());
         $$0.a("palette", new sp());
      } else {
         List<eco.b> $$1 = Lists.newArrayList();
         eco.b $$2 = new eco.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new eco.b());
         }

         sp $$4 = new sp();
         List<eco.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            eco.c $$7 = $$5.get($$6);
            sj $$8 = new sj();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               eco.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            sp $$12 = new sp();

            for (dip $$13 : $$2) {
               $$12.add(sy.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            sp $$14 = new sp();

            for (eco.b $$15 : $$1) {
               sp $$16 = new sp();

               for (dip $$17 : $$15) {
                  $$16.add(sy.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      sp $$18 = new sp();

      for (eco.d $$19 : this.m) {
         sj $$20 = new sj();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return sy.g($$0);
   }

   public void a(ig<cvz> $$0, sj $$1) {
      this.l.clear();
      this.m.clear();
      sp $$2 = $$1.c("size", 3);
      this.n = new iz($$2.e(0), $$2.e(1), $$2.e(2));
      sp $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         sp $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      sp $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         sj $$8 = $$6.a($$7);
         sp $$9 = $$8.c("pos", 6);
         elb $$10 = new elb($$9.h(0), $$9.h(1), $$9.h(2));
         sp $$11 = $$8.c("blockPos", 3);
         hv $$12 = new hv($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            sj $$13 = $$8.p("nbt");
            this.m.add(new eco.d($$10, $$12, $$13));
         }
      }
   }

   private void a(ig<cvz> $$0, sp $$1, sp $$2) {
      eco.b $$3 = new eco.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(sy.a($$0, $$1.a($$4)), $$4);
      }

      List<eco.c> $$5 = Lists.newArrayList();
      List<eco.c> $$6 = Lists.newArrayList();
      List<eco.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         sj $$9 = $$2.a($$8);
         sp $$10 = $$9.c("pos", 3);
         hv $$11 = new hv($$10.e(0), $$10.e(1), $$10.e(2));
         dip $$12 = $$3.a($$9.h("state"));
         sj $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         eco.c $$15 = new eco.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<eco.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new eco.a($$16));
   }

   private sp a(int... $$0) {
      sp $$1 = new sp();

      for (int $$2 : $$0) {
         $$1.add(so.a($$2));
      }

      return $$1;
   }

   private sp a(double... $$0) {
      sp $$1 = new sp();

      for (double $$2 : $$0) {
         $$1.add(sk.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<eco.c> a;
      private final Map<cvz, List<eco.c>> b = Maps.newHashMap();

      a(List<eco.c> $$0) {
         this.a = $$0;
      }

      public List<eco.c> a() {
         return this.a;
      }

      public List<eco.c> a(cvz $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dip> {
      public static final dip a = cwb.a.o();
      private final il<dip> b = new il<>(16);
      private int c;

      public int a(dip $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dip a(int $$0) {
         dip $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dip> iterator() {
         return this.b.iterator();
      }

      public void a(dip $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(hv a, dip b, @Nullable sj c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final elb a;
      public final hv b;
      public final sj c;

      public d(elb $$0, hv $$1, sj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
