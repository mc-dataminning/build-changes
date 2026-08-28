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

public class esl {
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
   private final List<esl.b> l = Lists.newArrayList();
   private final List<esl.e> m = Lists.newArrayList();
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

   public void a(dhh $$0, jh $$1, kl $$2, boolean $$3, @Nullable dkl $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jh $$5 = $$1.a($$2).b(-1, -1, -1);
         List<esl.d> $$6 = Lists.newArrayList();
         List<esl.d> $$7 = Lists.newArrayList();
         List<esl.d> $$8 = Lists.newArrayList();
         jh $$9 = new jh(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jh $$10 = new jh(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (jh $$11 : jh.c($$9, $$10)) {
            jh $$12 = $$11.b($$9);
            dxu $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               duw $$14 = $$0.c_($$11);
               esl.d $$15;
               if ($$14 != null) {
                  $$15 = new esl.d($$12, $$13, $$14.c($$0.K_()));
               } else {
                  $$15 = new esl.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<esl.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new esl.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(esl.d $$0, List<esl.d> $$1, List<esl.d> $$2, List<esl.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dgw.a, jh.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<esl.d> a(List<esl.d> $$0, List<esl.d> $$1, List<esl.d> $$2) {
      Comparator<esl.d> $$3 = Comparator.<esl.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<esl.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dhh $$0, jh $$1, jh $$2) {
      List<bvj> $$3 = $$0.a(bvj.class, fbs.a($$1, $$2), $$0x -> !($$0x instanceof cpw));
      this.m.clear();

      for (bvj $$4 : $$3) {
         fbx $$5 = new fbx($$4.dB() - (double)$$1.u(), $$4.dD() - (double)$$1.v(), $$4.dH() - (double)$$1.w());
         ux $$6 = new ux();
         $$4.e($$6);
         jh $$7;
         if ($$4 instanceof clv) {
            $$7 = ((clv)$$4).p().b($$1);
         } else {
            $$7 = jh.a((ka)$$5);
         }

         this.m.add(new esl.e($$5, $$7, $$6.i()));
      }
   }

   public List<esl.d> a(jh $$0, esh $$1, dkl $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<esl.a> a(jh $$0, drb $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         esh $$2 = new esh().a($$1);
         List<esl.a> $$3 = $$2.a(this.l, $$0).a();
         List<esl.a> $$4 = new ArrayList<>($$3.size());

         for (esl.a $$5 : $$3) {
            esl.d $$6 = $$5.a;
            $$4.add($$5.b(new esl.d(a($$2, $$6.a()).a((kl)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<esl.d> a(jh $$0, esh $$1, dkl $$2, boolean $$3) {
      ObjectArrayList<esl.d> $$4 = new ObjectArrayList();
      eob $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (esl.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            jh $$7 = $$3 ? a($$1, $$6.a).a((kl)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new esl.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jh a(esh $$0, jh $$1, esh $$2, jh $$3) {
      jh $$4 = a($$0, $$1);
      jh $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jh a(esh $$0, jh $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dhy $$0, jh $$1, jh $$2, esh $$3, bam $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<esl.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eob $$7 = $$3.g();
            List<jh> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jh> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jh, ux>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (esl.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               jh $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  etw $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dxu $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     duw $$22 = $$0.c_($$19);
                     bsz.a($$22);
                     $$0.a($$19, dkn.in.m(), 20);
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
                        duw $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof bto) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.K_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dpe) {
                           ((dpe)$$21.b()).a($$0, $$19, $$21, $$20);
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
                  etw $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     jh $$30 = $$27.a($$25[$$29]);
                     etw $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dxu $$32 = $$0.a_($$27);
                     dkl $$33 = $$32.b();
                     if ($$33 instanceof dpe) {
                        ((dpe)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fcg $$34 = new fca($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for (Pair<jh, ux> $$38 : $$10) {
                     jh $$39 = (jh)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for (Pair<jh, ux> $$40 : $$10) {
                  jh $$41 = (jh)$$40.getFirst();
                  if (!$$3.h()) {
                     dxu $$42 = $$0.a_($$41);
                     dxu $$43 = dkl.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     duw $$44 = $$0.c_($$41);
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

   public static void a(dhi $$0, int $$1, fcg $$2, jh $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dhi $$0, int $$1, fcg $$2, int $$3, int $$4, int $$5) {
      jh.a $$6 = new jh.a();
      jh.a $$7 = new jh.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dxu $$11 = $$0.a_($$6);
         dxu $$12 = $$0.a_($$7);
         dxu $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.H_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dxu $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.H_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<esl.d> a(dhy $$0, jh $$1, jh $$2, esh $$3, List<esl.d> $$4) {
      List<esl.d> $$5 = new ArrayList<>();
      List<esl.d> $$6 = new ArrayList<>();

      for (esl.d $$7 : $$4) {
         jh $$8 = a($$3, $$7.a).a((kl)$$1);
         esl.d $$9 = new esl.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<esi> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (esi $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dhy $$0, jh $$1, dpk $$2, drb $$3, jh $$4, @Nullable eob $$5, boolean $$6) {
      for (esl.e $$7 : this.m) {
         jh $$8 = a($$7.b, $$2, $$3, $$4).a((kl)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ux $$9 = $$7.c.i();
            fbx $$10 = a($$7.a, $$2, $$3, $$4);
            fbx $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            vd $$12 = new vd();
            $$12.add(uy.a($$11.d));
            $$12.add(uy.a($$11.e));
            $$12.add(uy.a($$11.f));
            $$9.a("Pos", $$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dM();
               $$5x.b($$11.d, $$11.e, $$11.f, $$6x, $$5x.dO());
               if ($$6 && $$5x instanceof bwh) {
                  ((bwh)$$5x).a($$0, $$0.d_(jh.a((ka)$$11)), bvp.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bvj> a(dhy $$0, ux $$1) {
      try {
         return bvq.a($$1, $$0.a(), bvp.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kl a(drb $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kl(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static jh a(jh $$0, dpk $$1, drb $$2, jh $$3) {
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

   public static fbx a(fbx $$0, dpk $$1, drb $$2, jh $$3) {
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
            return new fbx((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fbx((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fbx((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fbx($$4, $$5, $$6) : $$0;
      }
   }

   public jh a(jh $$0, dpk $$1, drb $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jh a(jh $$0, dpk $$1, drb $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dpk.c ? $$3 : 0;
      int $$6 = $$1 == dpk.b ? $$4 : 0;
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

   public eob b(esh $$0, jh $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eob a(jh $$0, drb $$1, jh $$2, dpk $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eob a(jh $$0, drb $$1, jh $$2, dpk $$3, kl $$4) {
      kl $$5 = $$4.c(-1, -1, -1);
      jh $$6 = a(jh.c, $$3, $$1, $$2);
      jh $$7 = a(jh.c.a($$5), $$3, $$1, $$2);
      return eob.a($$6, $$7).a((kl)$$0);
   }

   public ux a(ux $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new vd());
         $$0.a("palette", new vd());
      } else {
         List<esl.c> $$1 = Lists.newArrayList();
         esl.c $$2 = new esl.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new esl.c());
         }

         vd $$4 = new vd();
         List<esl.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            esl.d $$7 = $$5.get($$6);
            ux $$8 = new ux();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               esl.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            vd $$12 = new vd();

            for (dxu $$13 : $$2) {
               $$12.add(vm.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            vd $$14 = new vd();

            for (esl.c $$15 : $$1) {
               vd $$16 = new vd();

               for (dxu $$17 : $$15) {
                  $$16.add(vm.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      vd $$18 = new vd();

      for (esl.e $$19 : this.m) {
         ux $$20 = new ux();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.n.u(), this.n.v(), this.n.w()));
      return vm.e($$0);
   }

   public void a(jr<dkl> $$0, ux $$1) {
      this.l.clear();
      this.m.clear();
      vd $$2 = $$1.c("size", 3);
      this.n = new kl($$2.e(0), $$2.e(1), $$2.e(2));
      vd $$3 = $$1.c("blocks", 10);
      if ($$1.b("palettes", 9)) {
         vd $$4 = $$1.c("palettes", 9);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            this.a($$0, $$4.b($$5), $$3);
         }
      } else {
         this.a($$0, $$1.c("palette", 10), $$3);
      }

      vd $$6 = $$1.c("entities", 10);

      for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
         ux $$8 = $$6.a($$7);
         vd $$9 = $$8.c("pos", 6);
         fbx $$10 = new fbx($$9.h(0), $$9.h(1), $$9.h(2));
         vd $$11 = $$8.c("blockPos", 3);
         jh $$12 = new jh($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ux $$13 = $$8.p("nbt");
            this.m.add(new esl.e($$10, $$12, $$13));
         }
      }
   }

   private void a(jr<dkl> $$0, vd $$1, vd $$2) {
      esl.c $$3 = new esl.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(vm.a($$0, $$1.a($$4)), $$4);
      }

      List<esl.d> $$5 = Lists.newArrayList();
      List<esl.d> $$6 = Lists.newArrayList();
      List<esl.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ux $$9 = $$2.a($$8);
         vd $$10 = $$9.c("pos", 3);
         jh $$11 = new jh($$10.e(0), $$10.e(1), $$10.e(2));
         dxu $$12 = $$3.a($$9.h("state"));
         ux $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         esl.d $$15 = new esl.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<esl.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new esl.b($$16));
   }

   private vd a(int... $$0) {
      vd $$1 = new vd();

      for (int $$2 : $$0) {
         $$1.add(vc.a($$2));
      }

      return $$1;
   }

   private vd a(double... $$0) {
      vd $$1 = new vd();

      for (double $$2 : $$0) {
         $$1.add(uy.a($$2));
      }

      return $$1;
   }

   public static dvz.a a(ux $$0, dxu $$1) {
      return dvz.a.c.a($$0.l("joint"), () -> dop.o($$1).o().d() ? dvz.a.b : dvz.a.a);
   }

   public static record a(esl.d a, dvz.a b, alz c, alz d, alz e, int f, int g) {

      public static esl.a a(esl.d $$0) {
         ux $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new esl.a(
            $$0,
            esl.a($$1, $$0.b()),
            alz.a($$1.l("name")),
            alz.a($$1.l("pool")),
            alz.a($$1.l("target")),
            $$1.h("placement_priority"),
            $$1.h("selection_priority")
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
            this.d,
            this.e,
            this.f,
            this.g,
            this.a.c
         );
      }

      public esl.a b(esl.d $$0) {
         return new esl.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<esl.d> a;
      private final Map<dkl, List<esl.d>> b = Maps.newHashMap();
      @Nullable
      private List<esl.a> c;

      b(List<esl.d> $$0) {
         this.a = $$0;
      }

      public List<esl.a> a() {
         if (this.c == null) {
            this.c = this.a(dkn.pw).stream().map(esl.a::a).toList();
         }

         return this.c;
      }

      public List<esl.d> b() {
         return this.a;
      }

      public List<esl.d> a(dkl $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<dxu> {
      public static final dxu a = dkn.a.m();
      private final jw<dxu> b = new jw<>(16);
      private int c;

      public int a(dxu $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dxu a(int $$0) {
         dxu $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dxu> iterator() {
         return this.b.iterator();
      }

      public void a(dxu $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(jh a, dxu b, @Nullable ux c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fbx a;
      public final jh b;
      public final ux c;

      public e(fbx $$0, jh $$1, ux $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
