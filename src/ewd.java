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

public class ewd {
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
   private final List<ewd.b> l = Lists.newArrayList();
   private final List<ewd.e> m = Lists.newArrayList();
   private ka n = ka.i;
   private String o = "?";

   public ka a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(djx $$0, iv $$1, ka $$2, boolean $$3, @Nullable dnc $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         iv $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ewd.d> $$6 = Lists.newArrayList();
         List<ewd.d> $$7 = Lists.newArrayList();
         List<ewd.d> $$8 = Lists.newArrayList();
         iv $$9 = new iv(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         iv $$10 = new iv(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (iv $$11 : iv.c($$9, $$10)) {
            iv $$12 = $$11.b($$9);
            ebe $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dyc $$14 = $$0.c_($$11);
               ewd.d $$15;
               if ($$14 != null) {
                  $$15 = new ewd.d($$12, $$13, $$14.c($$0.J_()));
               } else {
                  $$15 = new ewd.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ewd.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ewd.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ewd.d $$0, List<ewd.d> $$1, List<ewd.d> $$2, List<ewd.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(djn.a, iv.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ewd.d> a(List<ewd.d> $$0, List<ewd.d> $$1, List<ewd.d> $$2) {
      Comparator<ewd.d> $$3 = Comparator.<ewd.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ewd.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(djx $$0, iv $$1, iv $$2) {
      List<bwt> $$3 = $$0.a(bwt.class, ffl.a($$1, $$2), $$0x -> !($$0x instanceof crx));
      this.m.clear();

      for (bwt $$4 : $$3) {
         ffq $$5 = new ffq($$4.dA() - (double)$$1.u(), $$4.dC() - (double)$$1.v(), $$4.dG() - (double)$$1.w());
         tz $$6 = new tz();
         $$4.g($$6);
         iv $$7;
         if ($$4 instanceof cnx) {
            $$7 = ((cnx)$$4).j().b($$1);
         } else {
            $$7 = iv.a((jp)$$5);
         }

         this.m.add(new ewd.e($$5, $$7, $$6.l()));
      }
   }

   public List<ewd.d> a(iv $$0, evz $$1, dnc $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<ewd.a> a(iv $$0, dtw $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         evz $$2 = new evz().a($$1);
         List<ewd.a> $$3 = $$2.a(this.l, $$0).a();
         List<ewd.a> $$4 = new ArrayList<>($$3.size());

         for (ewd.a $$5 : $$3) {
            ewd.d $$6 = $$5.a;
            $$4.add($$5.b(new ewd.d(a($$2, $$6.a()).a((ka)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<ewd.d> a(iv $$0, evz $$1, dnc $$2, boolean $$3) {
      ObjectArrayList<ewd.d> $$4 = new ObjectArrayList();
      ert $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ewd.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            iv $$7 = $$3 ? a($$1, $$6.a).a((ka)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ewd.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public iv a(evz $$0, iv $$1, evz $$2, iv $$3) {
      iv $$4 = a($$0, $$1);
      iv $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static iv a(evz $$0, iv $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dko $$0, iv $$1, iv $$2, evz $$3, azx $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ewd.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            ert $$7 = $$3.g();
            List<iv> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<iv> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<iv, tz>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ewd.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               iv $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  exo $$20 = $$3.j() ? $$0.b_($$19) : null;
                  ebe $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     $$0.a($$19, dne.iy.m(), 820);
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
                        dyc $$22 = $$0.c_($$19);
                        if ($$22 != null) {
                           if ($$22 instanceof bux) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$22.c($$18.c, $$0.J_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof drz) {
                           ((drz)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$23 = true;
            jb[] $$24 = new jb[]{jb.b, jb.c, jb.f, jb.d, jb.e};

            while ($$23 && !$$8.isEmpty()) {
               $$23 = false;
               Iterator<iv> $$25 = $$8.iterator();

               while ($$25.hasNext()) {
                  iv $$26 = $$25.next();
                  exo $$27 = $$0.b_($$26);

                  for (int $$28 = 0; $$28 < $$24.length && !$$27.b(); $$28++) {
                     iv $$29 = $$26.a($$24[$$28]);
                     exo $$30 = $$0.b_($$29);
                     if ($$30.b() && !$$9.contains($$29)) {
                        $$27 = $$30;
                     }
                  }

                  if ($$27.b()) {
                     ebe $$31 = $$0.a_($$26);
                     dnc $$32 = $$31.b();
                     if ($$32 instanceof drz) {
                        ((drz)$$32).a($$0, $$26, $$31, $$27);
                        $$23 = true;
                        $$25.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ffz $$33 = new fft($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$34 = $$11;
                  int $$35 = $$12;
                  int $$36 = $$13;

                  for (Pair<iv, tz> $$37 : $$10) {
                     iv $$38 = (iv)$$37.getFirst();
                     $$33.c($$38.u() - $$34, $$38.v() - $$35, $$38.w() - $$36);
                  }

                  a($$0, $$5, $$33, $$34, $$35, $$36);
               }

               for (Pair<iv, tz> $$39 : $$10) {
                  iv $$40 = (iv)$$39.getFirst();
                  if (!$$3.h()) {
                     ebe $$41 = $$0.a_($$40);
                     ebe $$42 = dnc.b($$41, $$0, $$40);
                     if ($$41 != $$42) {
                        $$0.a($$40, $$42, $$5 & -2 | 16);
                     }

                     $$0.a($$40, $$42.b());
                  }

                  if ($$39.getSecond() != null) {
                     dyc $$43 = $$0.c_($$40);
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

   public static void a(djy $$0, int $$1, ffz $$2, iv $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(djy $$0, int $$1, ffz $$2, int $$3, int $$4, int $$5) {
      iv.a $$6 = new iv.a();
      iv.a $$7 = new iv.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         ebe $$11 = $$0.a_($$6);
         ebe $$12 = $$0.a_($$7);
         ebe $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.G_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         ebe $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.G_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<ewd.d> a(dko $$0, iv $$1, iv $$2, evz $$3, List<ewd.d> $$4) {
      List<ewd.d> $$5 = new ArrayList<>();
      List<ewd.d> $$6 = new ArrayList<>();

      for (ewd.d $$7 : $$4) {
         iv $$8 = a($$3, $$7.a).a((ka)$$1);
         ewd.d $$9 = new ewd.d($$8, $$7.b, $$7.c != null ? $$7.c.l() : null);
         Iterator<ewa> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ewa $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dko $$0, iv $$1, dsf $$2, dtw $$3, iv $$4, @Nullable ert $$5, boolean $$6) {
      for (ewd.e $$7 : this.m) {
         iv $$8 = a($$7.b, $$2, $$3, $$4).a((ka)$$1);
         if ($$5 == null || $$5.b($$8)) {
            tz $$9 = $$7.c.l();
            ffq $$10 = a($$7.a, $$2, $$3, $$4);
            ffq $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            uf $$12 = new uf();
            $$12.add(ua.a($$11.d));
            $$12.add(ua.a($$11.e));
            $$12.add(ua.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dL();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dN());
               if ($$6 && $$5x instanceof bxw) {
                  ((bxw)$$5x).a($$0, $$0.d_(iv.a((jp)$$11)), bxb.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bwt> a(dko $$0, tz $$1) {
      try {
         return bxc.a($$1, $$0.a(), bxb.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public ka a(dtw $$0) {
      switch ($$0) {
         case d:
         case b:
            return new ka(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static iv a(iv $$0, dsf $$1, dtw $$2, iv $$3) {
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
            return new iv($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new iv($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new iv($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new iv($$4, $$5, $$6) : $$0;
      }
   }

   public static ffq a(ffq $$0, dsf $$1, dtw $$2, iv $$3) {
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
            return new ffq((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new ffq((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new ffq((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new ffq($$4, $$5, $$6) : $$0;
      }
   }

   public iv a(iv $$0, dsf $$1, dtw $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static iv a(iv $$0, dsf $$1, dtw $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dsf.c ? $$3 : 0;
      int $$6 = $$1 == dsf.b ? $$4 : 0;
      iv $$7 = $$0;
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

   public ert b(evz $$0, iv $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public ert a(iv $$0, dtw $$1, iv $$2, dsf $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static ert a(iv $$0, dtw $$1, iv $$2, dsf $$3, ka $$4) {
      ka $$5 = $$4.c(-1, -1, -1);
      iv $$6 = a(iv.c, $$3, $$1, $$2);
      iv $$7 = a(iv.c.a($$5), $$3, $$1, $$2);
      return ert.a($$6, $$7).a((ka)$$0);
   }

   public tz a(tz $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new uf());
         $$0.a("palette", new uf());
      } else {
         List<ewd.c> $$1 = Lists.newArrayList();
         ewd.c $$2 = new ewd.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ewd.c());
         }

         uf $$4 = new uf();
         List<ewd.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ewd.d $$7 = $$5.get($$6);
            tz $$8 = new tz();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ewd.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            uf $$12 = new uf();

            for (ebe $$13 : $$2) {
               $$12.add(uo.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            uf $$14 = new uf();

            for (ewd.c $$15 : $$1) {
               uf $$16 = new uf();

               for (ebe $$17 : $$15) {
                  $$16.add(uo.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      uf $$18 = new uf();

      for (ewd.e $$19 : this.m) {
         tz $$20 = new tz();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return uo.e($$0);
   }

   public void a(jg<dnc> $$0, tz $$1) {
      this.l.clear();
      this.m.clear();
      uf $$2 = $$1.p("size");
      this.n = new ka($$2.a(0, 0), $$2.a(1, 0), $$2.a(2, 0));
      uf $$3 = $$1.p("blocks");
      Optional<uf> $$4 = $$1.o("palettes");
      if ($$4.isPresent()) {
         for (int $$5 = 0; $$5 < $$4.get().size(); $$5++) {
            this.a($$0, $$4.get().f($$5), $$3);
         }
      } else {
         this.a($$0, $$1.p("palette"), $$3);
      }

      $$1.p("entities").j().forEach($$0x -> {
         uf $$1x = $$0x.p("pos");
         ffq $$2x = new ffq($$1x.a(0, 0.0), $$1x.a(1, 0.0), $$1x.a(2, 0.0));
         uf $$3x = $$0x.p("blockPos");
         iv $$4x = new iv($$3x.a(0, 0), $$3x.a(1, 0), $$3x.a(2, 0));
         $$0x.m("nbt").ifPresent($$2xx -> this.m.add(new ewd.e($$2x, $$4x, $$2xx)));
      });
   }

   private void a(jg<dnc> $$0, uf $$1, uf $$2) {
      ewd.c $$3 = new ewd.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(uo.a($$0, $$1.b($$4)), $$4);
      }

      List<ewd.d> $$5 = Lists.newArrayList();
      List<ewd.d> $$6 = Lists.newArrayList();
      List<ewd.d> $$7 = Lists.newArrayList();
      $$2.j().forEach($$4 -> {
         uf $$5x = $$4.p("pos");
         iv $$6x = new iv($$5x.a(0, 0), $$5x.a(1, 0), $$5x.a(2, 0));
         ebe $$7x = $$3.a($$4.b("state", 0));
         tz $$8x = $$4.m("nbt").orElse(null);
         ewd.d $$9 = new ewd.d($$6x, $$7x, $$8x);
         a($$9, $$5, $$6, $$7);
      });
      List<ewd.d> $$8 = a($$5, $$6, $$7);
      this.l.add(new ewd.b($$8));
   }

   private uf a(int... $$0) {
      uf $$1 = new uf();

      for (int $$2 : $$0) {
         $$1.add(ue.a($$2));
      }

      return $$1;
   }

   private uf a(double... $$0) {
      uf $$1 = new uf();

      for (double $$2 : $$0) {
         $$1.add(ua.a($$2));
      }

      return $$1;
   }

   public static dzg.a a(tz $$0, ebe $$1) {
      return $$0.<dzg.a>a("joint", dzg.a.c).orElseGet(() -> a($$1));
   }

   public static dzg.a a(ebe $$0) {
      return drj.o($$0).o().d() ? dzg.a.b : dzg.a.a;
   }

   public static record a(ewd.d a, dzg.a b, ali c, alh<etl> d, ali e, int f, int g) {

      public static ewd.a a(ewd.d $$0) {
         tz $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new ewd.a(
            $$0,
            ewd.a($$1, $$0.b()),
            $$1.<ali>a("name", ali.a).orElse(dzg.b),
            $$1.<alh<etl>>a("pool", dzg.a).orElse(qo.a),
            $$1.<ali>a("target", ali.a).orElse(dzg.b),
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

      public ewd.a b(ewd.d $$0) {
         return new ewd.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<ewd.d> a;
      private final Map<dnc, List<ewd.d>> b = Maps.newHashMap();
      @Nullable
      private List<ewd.a> c;

      b(List<ewd.d> $$0) {
         this.a = $$0;
      }

      public List<ewd.a> a() {
         if (this.c == null) {
            this.c = this.a(dne.pH).stream().map(ewd.a::a).toList();
         }

         return this.c;
      }

      public List<ewd.d> b() {
         return this.a;
      }

      public List<ewd.d> a(dnc $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<ebe> {
      public static final ebe a = dne.a.m();
      private final jl<ebe> b = new jl<>(16);
      private int c;

      public int a(ebe $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public ebe a(int $$0) {
         ebe $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<ebe> iterator() {
         return this.b.iterator();
      }

      public void a(ebe $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(iv a, ebe b, @Nullable tz c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final ffq a;
      public final iv b;
      public final tz c;

      public e(ffq $$0, iv $$1, tz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
