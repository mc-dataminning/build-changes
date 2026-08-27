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

public final class ctz {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bmn[] f = Stream.of(bmn.values()).filter($$0 -> $$0 != bmn.h).toArray(bmn[]::new);

   private ctz() {
   }

   public static ctz.d a(int $$0, Iterable<blu> $$1, ctz.b $$2, cty $$3) {
      cuc $$4 = new cuc();
      Object2IntOpenHashMap<bmn> $$5 = new Object2IntOpenHashMap();

      for (blu $$6 : $$1) {
         if ($$6 instanceof bmm $$7 && ($$7.fL() || $$7.W())) {
            continue;
         }

         bmn $$8 = $$6.ai().f();
         if ($$8 != bmn.h) {
            hx $$9 = $$6.dm();
            $$2.query(csv.a($$9), $$6x -> {
               cuz.b $$7 = a($$9, $$6x).b().a($$6.ai());
               if ($$7 != null) {
                  $$4.a($$6.dm(), $$7.b());
               }

               if ($$6 instanceof bmm) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new ctz.d($$0, $$5, $$4, $$3);
   }

   static cun a(hx $$0, dlc $$1) {
      return $$1.getNoiseBiome(is.a($$0.u()), is.a($$0.v()), is.a($$0.w())).a();
   }

   public static void a(and $$0, dln $$1, ctz.d $$2, boolean $$3, boolean $$4, boolean $$5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual and.af ()Lbgr;
      // 04: ldc "spawner"
      // 06: invokeinterface bgr.a (Ljava/lang/String;)V 2
      // 0b: getstatic ctz.f [Lbmn;
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
      // 2c: invokevirtual bmn.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bmn.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bmn.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dln.f ()Lcsv;
      // 53: invokevirtual ctz$d.a (Lbmn;Lcsv;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lctz$d;)Lctz$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbly;Lhx;Ldlc;)Z, ctz$d.a (Lbly;Lhx;Ldlc;)Z, (Lbly;Lhx;Ldlc;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lctz$d;)Lctz$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbmm;Ldlc;)V, ctz$d.a (Lbmm;Ldlc;)V, (Lbmm;Ldlc;)V ]
      // 73: invokestatic ctz.a (Lbmn;Land;Ldln;Lctz$c;Lctz$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual and.af ()Lbgr;
      // 80: invokeinterface bgr.c ()V 1
      // 85: return
   }

   public static void a(bmn $$0, and $$1, dln $$2, ctz.c $$3, ctz.a $$4) {
      hx $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.J_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @avs
   public static void a(bmn $$0, and $$1, hx $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bmn $$0, and $$1, dlc $$2, hx $$3, ctz.c $$4, ctz.a $$5) {
      cuh $$6 = $$1.a();
      dld $$7 = $$1.l().g();
      int $$8 = $$3.v();
      djg $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         hx.a $$10 = new hx.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            cuz.c $$16 = null;
            bnd $$17 = null;
            int $$18 = aun.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cfh $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<cuz.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bmm $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dm()), bmo.a, $$17, null);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fI()) {
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

   private static boolean a(and $$0, dlc $$1, hx.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.T().a(new els((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new csv($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(and $$0, bmn $$1, cuh $$2, dld $$3, cuz.c $$4, hx.a $$5, double $$6) {
      bly<?> $$7 = $$4.b;
      if ($$7.f() == bmn.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bne.c $$8 = bne.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bne.a($$7, $$0, bmo.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bmm a(and $$0, bly<?> $$1) {
      try {
         blu var3 = $$1.a((cto)$$0);
         if (var3 instanceof bmm) {
            return (bmm)var3;
         }

         c.warn("Can't spawn entity of type: {}", kd.g.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(and $$0, bmm $$1, double $$2) {
      return $$2 > (double)($$1.ai().f().f() * $$1.ai().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bmo.a) && $$1.a($$0);
   }

   private static Optional<cuz.c> a(and $$0, cuh $$1, dld $$2, bmn $$3, auu $$4, hx $$5) {
      ih<cun> $$6 = $$0.t($$5);
      return $$3 == bmn.g && $$6.a(asf.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(and $$0, cuh $$1, dld $$2, bmn $$3, cuz.c $$4, hx $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bio<cuz.c> a(and $$0, cuh $$1, dld $$2, bmn $$3, hx $$4, @Nullable ih<cun> $$5) {
      return a($$4, $$0, $$3, $$1) ? ebl.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(hx $$0, and $$1, bmn $$2, cuh $$3) {
      if ($$2 == bmn.a && $$1.a_($$0.d()).a(cwr.fn)) {
         dzf $$4 = $$3.b().d(ke.aD).a(dyz.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static hx a(cto $$0, dln $$1) {
      csv $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dop.a.b, $$3, $$4) + 1;
      int $$6 = aun.b($$0.z, $$0.J_(), $$5);
      return new hx($$3, $$6, $$4);
   }

   public static boolean a(csu $$0, hx $$1, djg $$2, eeq $$3, bly<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(asg.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bne.c $$0, ctr $$1, hx $$2, @Nullable bly<?> $$3) {
      if ($$0 == bne.c.c) {
         return true;
      } else if ($$3 != null && $$1.D_().a($$2)) {
         djg $$4 = $$1.a_($$2);
         eeq $$5 = $$1.b_($$2);
         hx $$6 = $$2.c();
         hx $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(asl.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(asl.b);
            case a:
            default:
               djg $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(cud $$0, ih<cun> $$1, csv $$2, auu $$3) {
      cuz $$4 = $$1.a().b();
      bio<cuz.c> $$5 = $$4.a(bmn.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<cuz.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               cuz.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bnd $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     hx $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bne.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = aun.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = aun.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bne.a($$9.b, $$0, bmo.b, hx.a($$21, (double)$$19.v(), $$22), $$0.F_())) {
                           continue;
                        }

                        blu $$23;
                        try {
                           $$23 = $$9.b.a((cto)$$0.E());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bmm $$26 && $$26.a($$0, bmo.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dm()), bmo.b, $$11, null);
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

   private static hx a(ctr $$0, bly<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bne.b($$1), $$2, $$3);
      hx.a $$5 = new hx.a($$2, $$4, $$3);
      if ($$0.E_().h()) {
         do {
            $$5.c(ic.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(ic.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.J_());
      }

      if (bne.a($$1) == bne.c.a) {
         hx $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, efg.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bmm var1, dlc var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dln> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bly<?> var1, hx var2, dlc var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bmn> b;
      private final cuc c;
      private final Object2IntMap<bmn> d;
      private final cty e;
      @Nullable
      private hx f;
      @Nullable
      private bly<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bmn> $$1, cuc $$2, cty $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bly<?> $$0, hx $$1, dlc $$2) {
         this.f = $$1;
         this.g = $$0;
         cuz.b $$3 = ctz.a($$1, $$2).b().a($$0);
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

      private void a(bmm $$0, dlc $$1) {
         bly<?> $$2 = $$0.ai();
         hx $$3 = $$0.dm();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            cuz.b $$5 = ctz.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bmn $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new csv($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bmn> b() {
         return this.d;
      }

      boolean a(bmn $$0, csv $$1) {
         int $$2 = $$0.b() * this.a / ctz.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
