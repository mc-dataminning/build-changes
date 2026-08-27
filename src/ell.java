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

public class ell {
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
   private final List<ell.a> l = Lists.newArrayList();
   private final List<ell.d> m = Lists.newArrayList();
   private js n = js.g;
   private String o = "?";

   public js a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(daz $$0, io $$1, js $$2, boolean $$3, @Nullable dea $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         io $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ell.c> $$6 = Lists.newArrayList();
         List<ell.c> $$7 = Lists.newArrayList();
         List<ell.c> $$8 = Lists.newArrayList();
         io $$9 = new io(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         io $$10 = new io(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (io $$11 : io.c($$9, $$10)) {
            io $$12 = $$11.b($$9);
            drd $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               doi $$14 = $$0.c_($$11);
               ell.c $$15;
               if ($$14 != null) {
                  $$15 = new ell.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new ell.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ell.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ell.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ell.c $$0, List<ell.c> $$1, List<ell.c> $$2, List<ell.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(dao.a, io.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ell.c> a(List<ell.c> $$0, List<ell.c> $$1, List<ell.c> $$2) {
      Comparator<ell.c> $$3 = Comparator.<ell.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ell.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(daz $$0, io $$1, io $$2) {
      List<brw> $$3 = $$0.a(brw.class, euh.a($$1, $$2), $$0x -> !($$0x instanceof cly));
      this.m.clear();

      for (brw $$4 : $$3) {
         eum $$5 = new eum($$4.du() - (double)$$1.u(), $$4.dw() - (double)$$1.v(), $$4.dA() - (double)$$1.w());
         ud $$6 = new ud();
         $$4.e($$6);
         io $$7;
         if ($$4 instanceof cid) {
            $$7 = ((cid)$$4).D().b($$1);
         } else {
            $$7 = io.a($$5);
         }

         this.m.add(new ell.d($$5, $$7, $$6.h()));
      }
   }

   public List<ell.c> a(io $$0, elh $$1, dea $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<ell.c> a(io $$0, elh $$1, dea $$2, boolean $$3) {
      ObjectArrayList<ell.c> $$4 = new ObjectArrayList();
      ehd $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ell.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            io $$7 = $$3 ? a($$1, $$6.a).a((js)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ell.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public io a(elh $$0, io $$1, elh $$2, io $$3) {
      io $$4 = a($$0, $$1);
      io $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static io a(elh $$0, io $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dbo $$0, io $$1, io $$2, elh $$3, aym $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ell.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            ehd $$7 = $$3.g();
            List<io> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<io> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<io, ud>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ell.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               io $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  emw $$20 = $$3.j() ? $$0.b_($$19) : null;
                  drd $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     doi $$22 = $$0.c_($$19);
                     bpn.a_($$22);
                     $$0.a($$19, dec.hW.n(), 20);
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
                        doi $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bqe) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dir) {
                           ((dir)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            it[] $$25 = new it[]{it.b, it.c, it.f, it.d, it.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<io> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  io $$27 = $$26.next();
                  emw $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     io $$30 = $$27.a($$25[$$29]);
                     emw $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     drd $$32 = $$0.a_($$27);
                     dea $$33 = $$32.b();
                     if ($$33 instanceof dir) {
                        ((dir)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  euv $$34 = new eup($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<io, ud> $$38 : $$10) {
                     io $$39 = (io)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<io, ud> $$40 : $$10) {
                  io $$41 = (io)$$40.getFirst();
                  if (!$$3.h()) {
                     drd $$42 = $$0.a_($$41);
                     drd $$43 = dea.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     doi $$44 = $$0.c_($$41);
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

   public static void a(dba $$0, int $$1, euv $$2, io $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dba $$0, int $$1, euv $$2, int $$3, int $$4, int $$5) {
      io.a $$6 = new io.a();
      io.a $$7 = new io.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         drd $$11 = $$0.a_($$6);
         drd $$12 = $$0.a_($$7);
         drd $$13 = $$11.a($$7x, $$12, $$0, $$6, $$7);
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         drd $$14 = $$12.a($$7x.g(), $$13, $$0, $$7, $$6);
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<ell.c> a(dbo $$0, io $$1, io $$2, elh $$3, List<ell.c> $$4) {
      List<ell.c> $$5 = new ArrayList<>();
      List<ell.c> $$6 = new ArrayList<>();

      for (ell.c $$7 : $$4) {
         io $$8 = a($$3, $$7.a).a((js)$$1);
         ell.c $$9 = new ell.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<eli> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (eli $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dbo $$0, io $$1, dix $$2, dkn $$3, io $$4, @Nullable ehd $$5, boolean $$6) {
      for (ell.d $$7 : this.m) {
         io $$8 = a($$7.b, $$2, $$3, $$4).a((js)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ud $$9 = $$7.c.h();
            eum $$10 = a($$7.a, $$2, $$3, $$4);
            eum $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            uj $$12 = new uj();
            $$12.add(ue.a($$11.c));
            $$12.add(ue.a($$11.d));
            $$12.add(ue.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dF();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dH());
               if ($$6 && $$5x instanceof bss) {
                  ((bss)$$5x).a($$0, $$0.d_(io.a($$11)), bsu.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<brw> a(dbo $$0, ud $$1) {
      try {
         return bsc.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public js a(dkn $$0) {
      switch ($$0) {
         case d:
         case b:
            return new js(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static io a(io $$0, dix $$1, dkn $$2, io $$3) {
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
            return new io($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new io($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new io($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new io($$4, $$5, $$6) : $$0;
      }
   }

   public static eum a(eum $$0, dix $$1, dkn $$2, io $$3) {
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
            return new eum((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new eum((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new eum((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new eum($$4, $$5, $$6) : $$0;
      }
   }

   public io a(io $$0, dix $$1, dkn $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static io a(io $$0, dix $$1, dkn $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dix.c ? $$3 : 0;
      int $$6 = $$1 == dix.b ? $$4 : 0;
      io $$7 = $$0;
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

   public ehd b(elh $$0, io $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public ehd a(io $$0, dkn $$1, io $$2, dix $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static ehd a(io $$0, dkn $$1, io $$2, dix $$3, js $$4) {
      js $$5 = $$4.c(-1, -1, -1);
      io $$6 = a(io.c, $$3, $$1, $$2);
      io $$7 = a(io.c.a($$5), $$3, $$1, $$2);
      return ehd.a($$6, $$7).a((js)$$0);
   }

   public ud a(ud $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new uj());
         $$0.a("palette", new uj());
      } else {
         List<ell.b> $$1 = Lists.newArrayList();
         ell.b $$2 = new ell.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ell.b());
         }

         uj $$4 = new uj();
         List<ell.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ell.c $$7 = $$5.get($$6);
            ud $$8 = new ud();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ell.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            uj $$12 = new uj();

            for (drd $$13 : $$2) {
               $$12.add(us.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            uj $$14 = new uj();

            for (ell.b $$15 : $$1) {
               uj $$16 = new uj();

               for (drd $$17 : $$15) {
                  $$16.add(us.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      uj $$18 = new uj();

      for (ell.d $$19 : this.m) {
         ud $$20 = new ud();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return us.e($$0);
   }

   public void a(iy<dea> $$0, ud $$1) {
      this.l.clear();
      this.m.clear();
      uj $$2 = $$1.c("size", 3);
      this.n = new js($$2.e(0), $$2.e(1), $$2.e(2));
      uj $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         uj $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      uj $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         ud $$8 = $$6.a($$7);
         uj $$9 = $$8.c("pos", 6);
         eum $$10 = new eum($$9.h(0), $$9.h(1), $$9.h(2));
         uj $$11 = $$8.c("blockPos", 3);
         io $$12 = new io($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ud $$13 = $$8.p("nbt");
            this.m.add(new ell.d($$10, $$12, $$13));
         }
      }
   }

   private void a(iy<dea> $$0, uj $$1, uj $$2) {
      ell.b $$3 = new ell.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(us.a($$0, $$1.a($$4)), $$4);
      }

      List<ell.c> $$5 = Lists.newArrayList();
      List<ell.c> $$6 = Lists.newArrayList();
      List<ell.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ud $$9 = $$2.a($$8);
         uj $$10 = $$9.c("pos", 3);
         io $$11 = new io($$10.e(0), $$10.e(1), $$10.e(2));
         drd $$12 = $$3.a($$9.h("state"));
         ud $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ell.c $$15 = new ell.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ell.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new ell.a($$16));
   }

   private uj a(int... $$0) {
      uj $$1 = new uj();

      for (int $$2 : $$0) {
         $$1.add(ui.a($$2));
      }

      return $$1;
   }

   private uj a(double... $$0) {
      uj $$1 = new uj();

      for (double $$2 : $$0) {
         $$1.add(ue.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<ell.c> a;
      private final Map<dea, List<ell.c>> b = Maps.newHashMap();

      a(List<ell.c> $$0) {
         this.a = $$0;
      }

      public List<ell.c> a() {
         return this.a;
      }

      public List<ell.c> a(dea $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<drd> {
      public static final drd a = dec.a.n();
      private final jd<drd> b = new jd<>(16);
      private int c;

      public int a(drd $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public drd a(int $$0) {
         drd $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<drd> iterator() {
         return this.b.iterator();
      }

      public void a(drd $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(io a, drd b, @Nullable ud c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final eum a;
      public final io b;
      public final ud c;

      public d(eum $$0, io $$1, ud $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
