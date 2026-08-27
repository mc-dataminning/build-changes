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

public class ejq {
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
   private final List<ejq.a> l = Lists.newArrayList();
   private final List<ejq.d> m = Lists.newArrayList();
   private ji n = ji.g;
   private String o = "?";

   public ji a() {
      return this.n;
   }

   public void a(String $$0) {
      this.o = $$0;
   }

   public String b() {
      return this.o;
   }

   public void a(czg $$0, id $$1, ji $$2, boolean $$3, @Nullable dch $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         id $$5 = $$1.a($$2).b(-1, -1, -1);
         List<ejq.c> $$6 = Lists.newArrayList();
         List<ejq.c> $$7 = Lists.newArrayList();
         List<ejq.c> $$8 = Lists.newArrayList();
         id $$9 = new id(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         id $$10 = new id(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (id $$11 : id.a($$9, $$10)) {
            id $$12 = $$11.b($$9);
            dpi $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dmo $$14 = $$0.c_($$11);
               ejq.c $$15;
               if ($$14 != null) {
                  $$15 = new ejq.c($$12, $$13, $$14.c($$0.H_()));
               } else {
                  $$15 = new ejq.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<ejq.c> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new ejq.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(ejq.c $$0, List<ejq.c> $$1, List<ejq.c> $$2, List<ejq.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().o() && $$0.b.r(cyv.a, id.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<ejq.c> a(List<ejq.c> $$0, List<ejq.c> $$1, List<ejq.c> $$2) {
      Comparator<ejq.c> $$3 = Comparator.<ejq.c>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<ejq.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(czg $$0, id $$1, id $$2) {
      List<bqa> $$3 = $$0.a(bqa.class, ese.a($$1, $$2), $$0x -> !($$0x instanceof cka));
      this.m.clear();

      for (bqa $$4 : $$3) {
         esj $$5 = new esj($$4.dr() - (double)$$1.u(), $$4.dt() - (double)$$1.v(), $$4.dx() - (double)$$1.w());
         to $$6 = new to();
         $$4.e($$6);
         id $$7;
         if ($$4 instanceof cgf) {
            $$7 = ((cgf)$$4).D().b($$1);
         } else {
            $$7 = id.a($$5);
         }

         this.m.add(new ejq.d($$5, $$7, $$6.h()));
      }
   }

   public List<ejq.c> a(id $$0, ejm $$1, dch $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<ejq.c> a(id $$0, ejm $$1, dch $$2, boolean $$3) {
      ObjectArrayList<ejq.c> $$4 = new ObjectArrayList();
      efi $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (ejq.c $$6 : $$1.a(this.l, $$0).a($$2)) {
            id $$7 = $$3 ? a($$1, $$6.a).a((ji)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new ejq.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public id a(ejm $$0, id $$1, ejm $$2, id $$3) {
      id $$4 = a($$0, $$1);
      id $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static id a(ejm $$0, id $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(czv $$0, id $$1, id $$2, ejm $$3, axt $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<ejq.c> $$6 = $$3.a(this.l, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            efi $$7 = $$3.g();
            List<id> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<id> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<id, to>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (ejq.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               id $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  elb $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dpi $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dmo $$22 = $$0.c_($$19);
                     bnw.a_($$22);
                     $$0.a($$19, dcj.hW.n(), 20);
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
                        dmo $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bon) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c, $$0.H_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.u().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dgx) {
                           ((dgx)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            ij[] $$25 = new ij[]{ij.b, ij.c, ij.f, ij.d, ij.e};

            while ($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<id> $$26 = $$8.iterator();

               while ($$26.hasNext()) {
                  id $$27 = $$26.next();
                  elb $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     id $$30 = $$27.a($$25[$$29]);
                     elb $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dpi $$32 = $$0.a_($$27);
                     dch $$33 = $$32.b();
                     if ($$33 instanceof dgx) {
                        ((dgx)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  ess $$34 = new esm($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<id, to> $$38 : $$10) {
                     id $$39 = (id)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<id, to> $$40 : $$10) {
                  id $$41 = (id)$$40.getFirst();
                  if (!$$3.h()) {
                     dpi $$42 = $$0.a_($$41);
                     dpi $$43 = dch.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dmo $$44 = $$0.c_($$41);
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

   public static void a(czh $$0, int $$1, ess $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         id $$9 = new id($$3 + $$6, $$4 + $$7, $$5 + $$8);
         id $$10 = $$9.a($$5x);
         dpi $$11 = $$0.a_($$9);
         dpi $$12 = $$0.a_($$10);
         dpi $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         dpi $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }
      });
   }

   public static List<ejq.c> a(czv $$0, id $$1, id $$2, ejm $$3, List<ejq.c> $$4) {
      List<ejq.c> $$5 = new ArrayList<>();
      List<ejq.c> $$6 = new ArrayList<>();

      for (ejq.c $$7 : $$4) {
         id $$8 = a($$3, $$7.a).a((ji)$$1);
         ejq.c $$9 = new ejq.c($$8, $$7.b, $$7.c != null ? $$7.c.h() : null);
         Iterator<ejn> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (ejn $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(czv $$0, id $$1, dhd $$2, dit $$3, id $$4, @Nullable efi $$5, boolean $$6) {
      for (ejq.d $$7 : this.m) {
         id $$8 = a($$7.b, $$2, $$3, $$4).a((ji)$$1);
         if ($$5 == null || $$5.b($$8)) {
            to $$9 = $$7.c.h();
            esj $$10 = a($$7.a, $$2, $$3, $$4);
            esj $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            tu $$12 = new tu();
            $$12.add(tp.a($$11.c));
            $$12.add(tp.a($$11.d));
            $$12.add(tp.a($$11.e));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dC();
               $$5x.b($$11.c, $$11.d, $$11.e, $$6x, $$5x.dE());
               if ($$6 && $$5x instanceof bqv) {
                  ((bqv)$$5x).a($$0, $$0.d_(id.a($$11)), bqx.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bqa> a(czv $$0, to $$1) {
      try {
         return bqg.a($$1, $$0.E());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public ji a(dit $$0) {
      switch ($$0) {
         case d:
         case b:
            return new ji(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static id a(id $$0, dhd $$1, dit $$2, id $$3) {
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
            return new id($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new id($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new id($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new id($$4, $$5, $$6) : $$0;
      }
   }

   public static esj a(esj $$0, dhd $$1, dit $$2, id $$3) {
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
            return new esj((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new esj((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new esj((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new esj($$4, $$5, $$6) : $$0;
      }
   }

   public id a(id $$0, dhd $$1, dit $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static id a(id $$0, dhd $$1, dit $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dhd.c ? $$3 : 0;
      int $$6 = $$1 == dhd.b ? $$4 : 0;
      id $$7 = $$0;
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

   public efi b(ejm $$0, id $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public efi a(id $$0, dit $$1, id $$2, dhd $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static efi a(id $$0, dit $$1, id $$2, dhd $$3, ji $$4) {
      ji $$5 = $$4.c(-1, -1, -1);
      id $$6 = a(id.c, $$3, $$1, $$2);
      id $$7 = a(id.c.a($$5), $$3, $$1, $$2);
      return efi.a($$6, $$7).a((ji)$$0);
   }

   public to a(to $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new tu());
         $$0.a("palette", new tu());
      } else {
         List<ejq.b> $$1 = Lists.newArrayList();
         ejq.b $$2 = new ejq.b();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new ejq.b());
         }

         tu $$4 = new tu();
         List<ejq.c> $$5 = this.l.get(0).a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ejq.c $$7 = $$5.get($$6);
            to $$8 = new to();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               ejq.b $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).a().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            tu $$12 = new tu();

            for (dpi $$13 : $$2) {
               $$12.add(ud.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            tu $$14 = new tu();

            for (ejq.b $$15 : $$1) {
               tu $$16 = new tu();

               for (dpi $$17 : $$15) {
                  $$16.add(ud.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      tu $$18 = new tu();

      for (ejq.d $$19 : this.m) {
         to $$20 = new to();
         $$20.a("pos", this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return ud.e($$0);
   }

   public void a(io<dch> $$0, to $$1) {
      this.l.clear();
      this.m.clear();
      tu $$2 = $$1.c("size", 3);
      this.n = new ji($$2.e(0), $$2.e(1), $$2.e(2));
      tu $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         tu $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      tu $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         to $$8 = $$6.a($$7);
         tu $$9 = $$8.c("pos", 6);
         esj $$10 = new esj($$9.h(0), $$9.h(1), $$9.h(2));
         tu $$11 = $$8.c("blockPos", 3);
         id $$12 = new id($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            to $$13 = $$8.p("nbt");
            this.m.add(new ejq.d($$10, $$12, $$13));
         }
      }
   }

   private void a(io<dch> $$0, tu $$1, tu $$2) {
      ejq.b $$3 = new ejq.b();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(ud.a($$0, $$1.a($$4)), $$4);
      }

      List<ejq.c> $$5 = Lists.newArrayList();
      List<ejq.c> $$6 = Lists.newArrayList();
      List<ejq.c> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         to $$9 = $$2.a($$8);
         tu $$10 = $$9.c("pos", 3);
         id $$11 = new id($$10.e(0), $$10.e(1), $$10.e(2));
         dpi $$12 = $$3.a($$9.h("state"));
         to $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         ejq.c $$15 = new ejq.c($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<ejq.c> $$16 = a($$5, $$6, $$7);
      this.l.add(new ejq.a($$16));
   }

   private tu a(int... $$0) {
      tu $$1 = new tu();

      for (int $$2 : $$0) {
         $$1.add(tt.a($$2));
      }

      return $$1;
   }

   private tu a(double... $$0) {
      tu $$1 = new tu();

      for (double $$2 : $$0) {
         $$1.add(tp.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<ejq.c> a;
      private final Map<dch, List<ejq.c>> b = Maps.newHashMap();

      a(List<ejq.c> $$0) {
         this.a = $$0;
      }

      public List<ejq.c> a() {
         return this.a;
      }

      public List<ejq.c> a(dch $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<dpi> {
      public static final dpi a = dcj.a.n();
      private final it<dpi> b = new it<>(16);
      private int c;

      public int a(dpi $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dpi a(int $$0) {
         dpi $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dpi> iterator() {
         return this.b.iterator();
      }

      public void a(dpi $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record c(id a, dpi b, @Nullable to c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final esj a;
      public final id b;
      public final to c;

      public d(esj $$0, id $$1, to $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
