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

public class esm {
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
   private final List<esm.b> l = Lists.newArrayList();
   private final List<esm.e> m = Lists.newArrayList();
   private kl n = kl.h;
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

   public void a(dhi $$0, jh $$1, kl $$2, boolean $$3, @Nullable dkm $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jh $$5 = $$1.a($$2).b(-1, -1, -1);
         List<esm.d> $$6 = Lists.newArrayList();
         List<esm.d> $$7 = Lists.newArrayList();
         List<esm.d> $$8 = Lists.newArrayList();
         jh $$9 = new jh(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jh $$10 = new jh(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.n = $$2;

         for (jh $$11 : jh.c($$9, $$10)) {
            jh $$12 = $$11.b($$9);
            dxv $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               dux $$14 = $$0.c_($$11);
               esm.d $$15;
               if ($$14 != null) {
                  $$15 = new esm.d($$12, $$13, $$14.c($$0.K_()));
               } else {
                  $$15 = new esm.d($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<esm.d> $$17 = a($$6, $$7, $$8);
         this.l.clear();
         this.l.add(new esm.b($$17));
         if ($$3) {
            this.a($$0, $$9, $$10);
         } else {
            this.m.clear();
         }
      }
   }

   private static void a(esm.d $$0, List<esm.d> $$1, List<esm.d> $$2, List<esm.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dgx.a, jh.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<esm.d> a(List<esm.d> $$0, List<esm.d> $$1, List<esm.d> $$2) {
      Comparator<esm.d> $$3 = Comparator.<esm.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<esm.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dhi $$0, jh $$1, jh $$2) {
      List<bvk> $$3 = $$0.a(bvk.class, fbt.a($$1, $$2), $$0x -> !($$0x instanceof cpx));
      this.m.clear();

      for (bvk $$4 : $$3) {
         fby $$5 = new fby($$4.dB() - (double)$$1.u(), $$4.dD() - (double)$$1.v(), $$4.dH() - (double)$$1.w());
         ux $$6 = new ux();
         $$4.e($$6);
         jh $$7;
         if ($$4 instanceof clw) {
            $$7 = ((clw)$$4).p().b($$1);
         } else {
            $$7 = jh.a((ka)$$5);
         }

         this.m.add(new esm.e($$5, $$7, $$6.i()));
      }
   }

   public List<esm.d> a(jh $$0, esi $$1, dkm $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<esm.a> a(jh $$0, drc $$1) {
      if (this.l.isEmpty()) {
         return new ArrayList<>();
      } else {
         esi $$2 = new esi().a($$1);
         List<esm.a> $$3 = $$2.a(this.l, $$0).a();
         List<esm.a> $$4 = new ArrayList<>($$3.size());

         for (esm.a $$5 : $$3) {
            esm.d $$6 = $$5.a;
            $$4.add($$5.b(new esm.d(a($$2, $$6.a()).a((kl)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<esm.d> a(jh $$0, esi $$1, dkm $$2, boolean $$3) {
      ObjectArrayList<esm.d> $$4 = new ObjectArrayList();
      eoc $$5 = $$1.g();
      if (this.l.isEmpty()) {
         return $$4;
      } else {
         for (esm.d $$6 : $$1.a(this.l, $$0).a($$2)) {
            jh $$7 = $$3 ? a($$1, $$6.a).a((kl)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new esm.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jh a(esi $$0, jh $$1, esi $$2, jh $$3) {
      jh $$4 = a($$0, $$1);
      jh $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jh a(esi $$0, jh $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dhz $$0, jh $$1, jh $$2, esi $$3, bam $$4, int $$5) {
      if (this.l.isEmpty()) {
         return false;
      } else {
         List<esm.d> $$6 = $$3.a(this.l, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.m.isEmpty()) && this.n.u() >= 1 && this.n.v() >= 1 && this.n.w() >= 1) {
            eoc $$7 = $$3.g();
            List<jh> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jh> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jh, ux>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for (esm.d $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               jh $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  etx $$20 = $$3.j() ? $$0.b_($$19) : null;
                  dxv $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     dux $$22 = $$0.c_($$19);
                     bta.a($$22);
                     $$0.a($$19, dko.in.m(), 20);
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
                        dux $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof btp) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.c($$18.c, $$0.K_());
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.y().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof dpf) {
                           ((dpf)$$21.b()).a($$0, $$19, $$21, $$20);
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
                  etx $$28 = $$0.b_($$27);

                  for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                     jh $$30 = $$27.a($$25[$$29]);
                     etx $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     dxv $$32 = $$0.a_($$27);
                     dkm $$33 = $$32.b();
                     if ($$33 instanceof dpf) {
                        ((dpf)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  fch $$34 = new fcb($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
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
                     dxv $$42 = $$0.a_($$41);
                     dxv $$43 = dkm.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     dux $$44 = $$0.c_($$41);
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

   public static void a(dhj $$0, int $$1, fch $$2, jh $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dhj $$0, int $$1, fch $$2, int $$3, int $$4, int $$5) {
      jh.a $$6 = new jh.a();
      jh.a $$7 = new jh.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         dxv $$11 = $$0.a_($$6);
         dxv $$12 = $$0.a_($$7);
         dxv $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.H_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         dxv $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.H_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<esm.d> a(dhz $$0, jh $$1, jh $$2, esi $$3, List<esm.d> $$4) {
      List<esm.d> $$5 = new ArrayList<>();
      List<esm.d> $$6 = new ArrayList<>();

      for (esm.d $$7 : $$4) {
         jh $$8 = a($$3, $$7.a).a((kl)$$1);
         esm.d $$9 = new esm.d($$8, $$7.b, $$7.c != null ? $$7.c.i() : null);
         Iterator<esj> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (esj $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dhz $$0, jh $$1, dpl $$2, drc $$3, jh $$4, @Nullable eoc $$5, boolean $$6) {
      for (esm.e $$7 : this.m) {
         jh $$8 = a($$7.b, $$2, $$3, $$4).a((kl)$$1);
         if ($$5 == null || $$5.b($$8)) {
            ux $$9 = $$7.c.i();
            fby $$10 = a($$7.a, $$2, $$3, $$4);
            fby $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
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
               if ($$6 && $$5x instanceof bwi) {
                  ((bwi)$$5x).a($$0, $$0.d_(jh.a((ka)$$11)), bvq.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bvk> a(dhz $$0, ux $$1) {
      try {
         return bvr.a($$1, $$0.a(), bvq.d);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public kl a(drc $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kl(this.n.w(), this.n.v(), this.n.u());
         default:
            return this.n;
      }
   }

   public static jh a(jh $$0, dpl $$1, drc $$2, jh $$3) {
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

   public static fby a(fby $$0, dpl $$1, drc $$2, jh $$3) {
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
            return new fby((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new fby((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new fby((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new fby($$4, $$5, $$6) : $$0;
      }
   }

   public jh a(jh $$0, dpl $$1, drc $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jh a(jh $$0, dpl $$1, drc $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dpl.c ? $$3 : 0;
      int $$6 = $$1 == dpl.b ? $$4 : 0;
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

   public eoc b(esi $$0, jh $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public eoc a(jh $$0, drc $$1, jh $$2, dpl $$3) {
      return a($$0, $$1, $$2, $$3, this.n);
   }

   @VisibleForTesting
   protected static eoc a(jh $$0, drc $$1, jh $$2, dpl $$3, kl $$4) {
      kl $$5 = $$4.c(-1, -1, -1);
      jh $$6 = a(jh.c, $$3, $$1, $$2);
      jh $$7 = a(jh.c.a($$5), $$3, $$1, $$2);
      return eoc.a($$6, $$7).a((kl)$$0);
   }

   public ux a(ux $$0) {
      if (this.l.isEmpty()) {
         $$0.a("blocks", new vd());
         $$0.a("palette", new vd());
      } else {
         List<esm.c> $$1 = Lists.newArrayList();
         esm.c $$2 = new esm.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.l.size(); $$3++) {
            $$1.add(new esm.c());
         }

         vd $$4 = new vd();
         List<esm.d> $$5 = this.l.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            esm.d $$7 = $$5.get($$6);
            ux $$8 = new ux();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.l.size(); $$10++) {
               esm.c $$11 = $$1.get($$10);
               $$11.a(this.l.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            vd $$12 = new vd();

            for (dxv $$13 : $$2) {
               $$12.add(vm.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            vd $$14 = new vd();

            for (esm.c $$15 : $$1) {
               vd $$16 = new vd();

               for (dxv $$17 : $$15) {
                  $$16.add(vm.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      vd $$18 = new vd();

      for (esm.e $$19 : this.m) {
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

   public void a(jr<dkm> $$0, ux $$1) {
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
         fby $$10 = new fby($$9.h(0), $$9.h(1), $$9.h(2));
         vd $$11 = $$8.c("blockPos", 3);
         jh $$12 = new jh($$11.e(0), $$11.e(1), $$11.e(2));
         if ($$8.e("nbt")) {
            ux $$13 = $$8.p("nbt");
            this.m.add(new esm.e($$10, $$12, $$13));
         }
      }
   }

   private void a(jr<dkm> $$0, vd $$1, vd $$2) {
      esm.c $$3 = new esm.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(vm.a($$0, $$1.a($$4)), $$4);
      }

      List<esm.d> $$5 = Lists.newArrayList();
      List<esm.d> $$6 = Lists.newArrayList();
      List<esm.d> $$7 = Lists.newArrayList();

      for (int $$8 = 0; $$8 < $$2.size(); $$8++) {
         ux $$9 = $$2.a($$8);
         vd $$10 = $$9.c("pos", 3);
         jh $$11 = new jh($$10.e(0), $$10.e(1), $$10.e(2));
         dxv $$12 = $$3.a($$9.h("state"));
         ux $$13;
         if ($$9.e("nbt")) {
            $$13 = $$9.p("nbt");
         } else {
            $$13 = null;
         }

         esm.d $$15 = new esm.d($$11, $$12, $$13);
         a($$15, $$5, $$6, $$7);
      }

      List<esm.d> $$16 = a($$5, $$6, $$7);
      this.l.add(new esm.b($$16));
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

   public static dwa.a a(ux $$0, dxv $$1) {
      return dwa.a.c.a($$0.l("joint"), () -> doq.o($$1).o().d() ? dwa.a.b : dwa.a.a);
   }

   public static record a(esm.d a, dwa.a b, alz c, alz d, alz e, int f, int g) {

      public static esm.a a(esm.d $$0) {
         ux $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new esm.a(
            $$0,
            esm.a($$1, $$0.b()),
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

      public esm.a b(esm.d $$0) {
         return new esm.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<esm.d> a;
      private final Map<dkm, List<esm.d>> b = Maps.newHashMap();
      @Nullable
      private List<esm.a> c;

      b(List<esm.d> $$0) {
         this.a = $$0;
      }

      public List<esm.a> a() {
         if (this.c == null) {
            this.c = this.a(dko.pw).stream().map(esm.a::a).toList();
         }

         return this.c;
      }

      public List<esm.d> b() {
         return this.a;
      }

      public List<esm.d> a(dkm $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<dxv> {
      public static final dxv a = dko.a.m();
      private final jw<dxv> b = new jw<>(16);
      private int c;

      public int a(dxv $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public dxv a(int $$0) {
         dxv $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<dxv> iterator() {
         return this.b.iterator();
      }

      public void a(dxv $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static record d(jh a, dxv b, @Nullable ux c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fby a;
      public final jh b;
      public final ux c;

      public e(fby $$0, jh $$1, ux $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
