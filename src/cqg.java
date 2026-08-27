import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class cqg {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bjj[] f = Stream.of(bjj.values()).filter($$0 -> $$0 != bjj.h).toArray(bjj[]::new);

   private cqg() {
   }

   public static cqg.d a(int $$0, Iterable<biq> $$1, cqg.b $$2, cqf $$3) {
      cqj $$4 = new cqj();
      Object2IntOpenHashMap<bjj> $$5 = new Object2IntOpenHashMap();

      for (biq $$6 : $$1) {
         if ($$6 instanceof bji $$7 && ($$7.fK() || $$7.U())) {
            continue;
         }

         bjj $$8 = $$6.ag().f();
         if ($$8 != bjj.h) {
            gw $$9 = $$6.dl();
            $$2.query(cpc.a($$9), $$6x -> {
               crf.b $$7 = a($$9, $$6x).b().a($$6.ag());
               if ($$7 != null) {
                  $$4.a($$6.dl(), $$7.b());
               }

               if ($$6 instanceof bji) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new cqg.d($$0, $$5, $$4, $$3);
   }

   static cqt a(gw $$0, dhf $$1) {
      return $$1.getNoiseBiome(hs.a($$0.u()), hs.a($$0.v()), hs.a($$0.w())).a();
   }

   public static void a(akr $$0, dhq $$1, cqg.d $$2, boolean $$3, boolean $$4, boolean $$5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual akr.ad ()Lbdp;
      // 04: ldc "spawner"
      // 06: invokeinterface bdp.a (Ljava/lang/String;)V 2
      // 0b: getstatic cqg.f [Lbjj;
      // 0e: astore 6
      // 10: aload 6
      // 12: arraylength
      // 13: istore 7
      // 15: bipush 0
      // 16: istore 8
      // 18: iload 8
      // 1a: iload 7
      // 1c: if_icmpge 7c
      // 1f: aload 6
      // 21: iload 8
      // 23: aaload
      // 24: astore 9
      // 26: iload 3
      // 27: ifne 32
      // 2a: aload 9
      // 2c: invokevirtual bjj.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bjj.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bjj.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dhq.f ()Lcpc;
      // 53: invokevirtual cqg$d.a (Lbjj;Lcpc;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lcqg$d;)Lcqg$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbiu;Lgw;Ldhf;)Z, cqg$d.a (Lbiu;Lgw;Ldhf;)Z, (Lbiu;Lgw;Ldhf;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lcqg$d;)Lcqg$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbji;Ldhf;)V, cqg$d.a (Lbji;Ldhf;)V, (Lbji;Ldhf;)V ]
      // 73: invokestatic cqg.a (Lbjj;Lakr;Ldhq;Lcqg$c;Lcqg$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual akr.ad ()Lbdp;
      // 80: invokeinterface bdp.c ()V 1
      // 85: return
   }

   public static void a(bjj $$0, akr $$1, dhq $$2, cqg.c $$3, cqg.a $$4) {
      gw $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.H_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @asy
   public static void a(bjj $$0, akr $$1, gw $$2) {
      a($$0, $$1, $$1.x($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bjj $$0, akr $$1, dhf $$2, gw $$3, cqg.c $$4, cqg.a $$5) {
      cqn $$6 = $$1.a();
      dhg $$7 = $$1.k().g();
      int $$8 = $$3.v();
      dfj $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         gw.a $$10 = new gw.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            crf.c $$16 = null;
            bjz $$17 = null;
            int $$18 = arx.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cbu $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<crf.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bji $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dl()), bjk.a, $$17, null);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fH()) {
                              return;
                           }

                           if ($$26.d($$19)) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean a(akr $$0, dhf $$1, gw.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.R().a(new ehn((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new cpc($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(akr $$0, bjj $$1, cqn $$2, dhg $$3, crf.c $$4, gw.a $$5, double $$6) {
      biu<?> $$7 = $$4.b;
      if ($$7.f() == bjj.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bka.c $$8 = bka.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bka.a($$7, $$0, bjk.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bji a(akr $$0, biu<?> $$1) {
      try {
         biq var3 = $$1.a((cpv)$$0);
         if (var3 instanceof bji) {
            return (bji)var3;
         }

         c.warn("Can't spawn entity of type: {}", jd.h.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(akr $$0, bji $$1, double $$2) {
      return $$2 > (double)($$1.ag().f().f() * $$1.ag().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bjk.a) && $$1.a($$0);
   }

   private static Optional<crf.c> a(akr $$0, cqn $$1, dhg $$2, bjj $$3, asc $$4, gw $$5) {
      hg<cqt> $$6 = $$0.s($$5);
      return $$3 == bjj.g && $$6.a(aps.al) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(akr $$0, cqn $$1, dhg $$2, bjj $$3, crf.c $$4, gw $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bfm<crf.c> a(akr $$0, cqn $$1, dhg $$2, bjj $$3, gw $$4, @Nullable hg<cqt> $$5) {
      return a($$4, $$0, $$3, $$1) ? dxh.d : $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
   }

   public static boolean a(gw $$0, akr $$1, bjj $$2, cqn $$3) {
      if ($$2 == bjj.a && $$1.a_($$0.d()).a(csw.fn)) {
         dvi $$4 = $$3.b().d(je.az).a(dvc.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static gw a(cpv $$0, dhq $$1) {
      cpc $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dks.a.b, $$3, $$4) + 1;
      int $$6 = arx.b($$0.z, $$0.H_(), $$5);
      return new gw($$3, $$6, $$4);
   }

   public static boolean a(cpb $$0, gw $$1, dfj $$2, eam $$3, biu<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(apt.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bka.c $$0, cpy $$1, gw $$2, @Nullable biu<?> $$3) {
      if ($$0 == bka.c.c) {
         return true;
      } else if ($$3 != null && $$1.B_().a($$2)) {
         dfj $$4 = $$1.a_($$2);
         eam $$5 = $$1.b_($$2);
         gw $$6 = $$2.c();
         gw $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(apy.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(apy.b);
            case a:
            default:
               dfj $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(cqk $$0, hg<cqt> $$1, cpc $$2, asc $$3) {
      crf $$4 = $$1.a().b();
      bfm<crf.c> $$5 = $$4.a(bjj.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<crf.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               crf.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bjz $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     gw $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bka.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = arx.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = arx.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bka.a($$9.b, $$0, bjk.b, gw.a($$21, (double)$$19.v(), $$22), $$0.D_())) {
                           continue;
                        }

                        biq $$23;
                        try {
                           $$23 = $$9.b.a((cpv)$$0.C());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bji $$26 && $$26.a($$0, bjk.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dl()), bjk.b, $$11, null);
                           $$0.a_($$26);
                           $$17 = true;
                        }
                     }

                     $$12 += $$3.a(5) - $$3.a(5);

                     for ($$13 += $$3.a(5) - $$3.a(5); $$12 < $$6 || $$12 >= $$6 + 16 || $$13 < $$7 || $$13 >= $$7 + 16; $$13 = $$15 + $$3.a(5) - $$3.a(5)) {
                        $$12 = $$14 + $$3.a(5) - $$3.a(5);
                     }
                  }
               }
            }
         }
      }
   }

   private static gw a(cpy $$0, biu<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bka.b($$1), $$2, $$3);
      gw.a $$5 = new gw.a($$2, $$4, $$3);
      if ($$0.C_().h()) {
         do {
            $$5.c(hc.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(hc.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.H_());
      }

      if (bka.a($$1) == bka.c.a) {
         gw $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, ebc.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bji var1, dhf var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dhq> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(biu<?> var1, gw var2, dhf var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bjj> b;
      private final cqj c;
      private final Object2IntMap<bjj> d;
      private final cqf e;
      @Nullable
      private gw f;
      @Nullable
      private biu<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bjj> $$1, cqj $$2, cqf $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(biu<?> $$0, gw $$1, dhf $$2) {
         this.f = $$1;
         this.g = $$0;
         crf.b $$3 = cqg.a($$1, $$2).b().a($$0);
         if ($$3 == null) {
            this.h = 0.0;
            return true;
         } else {
            double $$4 = $$3.b();
            this.h = $$4;
            double $$5 = this.c.b($$1, $$4);
            return $$5 <= $$3.a();
         }
      }

      private void a(bji $$0, dhf $$1) {
         biu<?> $$2 = $$0.ag();
         gw $$3 = $$0.dl();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            crf.b $$5 = cqg.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bjj $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new cpc($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bjj> b() {
         return this.d;
      }

      boolean a(bjj $$0, cpc $$1) {
         int $$2 = $$0.b() * this.a / cqg.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
