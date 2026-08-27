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

public final class czi {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bqr[] f = Stream.of(bqr.values()).filter($$0 -> $$0 != bqr.h).toArray(bqr[]::new);

   private czi() {
   }

   public static czi.d a(int $$0, Iterable<bpv> $$1, czi.b $$2, czh $$3) {
      czl $$4 = new czl();
      Object2IntOpenHashMap<bqr> $$5 = new Object2IntOpenHashMap();

      for (bpv $$6 : $$1) {
         if ($$6 instanceof bqq $$7 && ($$7.fU() || $$7.V())) {
            continue;
         }

         bqr $$8 = $$6.ai().f();
         if ($$8 != bqr.h) {
            ib $$9 = $$6.dm();
            $$2.query(cye.a($$9), $$6x -> {
               dai.b $$7 = a($$9, $$6x).b().a($$6.ai());
               if ($$7 != null) {
                  $$4.a($$6.dm(), $$7.b());
               }

               if ($$6 instanceof bqq) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new czi.d($$0, $$5, $$4, $$3);
   }

   static czw a(ib $$0, dqv $$1) {
      return $$1.getNoiseBiome(iw.a($$0.u()), iw.a($$0.v()), iw.a($$0.w())).a();
   }

   public static void a(aps $$0, drf $$1, czi.d $$2, boolean $$3, boolean $$4, boolean $$5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1018)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:902)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:895)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:241)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.DoStatement.toJava(DoStatement.java:148)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual aps.af ()Lbko;
      // 04: ldc "spawner"
      // 06: invokeinterface bko.a (Ljava/lang/String;)V 2
      // 0b: getstatic czi.f [Lbqr;
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
      // 2c: invokevirtual bqr.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bqr.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bqr.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual drf.f ()Lcye;
      // 53: invokevirtual czi$d.a (Lbqr;Lcye;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lczi$d;)Lczi$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbqb;Lib;Ldqv;)Z, czi$d.a (Lbqb;Lib;Ldqv;)Z, (Lbqb;Lib;Ldqv;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lczi$d;)Lczi$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbqq;Ldqv;)V, czi$d.a (Lbqq;Ldqv;)V, (Lbqq;Ldqv;)V ]
      // 73: invokestatic czi.a (Lbqr;Laps;Ldrf;Lczi$c;Lczi$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual aps.af ()Lbko;
      // 80: invokeinterface bko.c ()V 1
      // 85: return
   }

   public static void a(bqr $$0, aps $$1, drf $$2, czi.c $$3, czi.a $$4) {
      ib $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @ayn
   public static void a(bqr $$0, aps $$1, ib $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bqr $$0, aps $$1, dqv $$2, ib $$3, czi.c $$4, czi.a $$5) {
      czq $$6 = $$1.a();
      dqw $$7 = $$1.l().g();
      int $$8 = $$3.v();
      doz $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         ib.a $$10 = new ib.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dai.c $$16 = null;
            brg $$17 = null;
            int $$18 = axk.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cjt $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dai.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bqq $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dm()), bqs.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fO()) {
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

   private static boolean a(aps $$0, dqv $$1, ib.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.U().a(new esa((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new cye($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(aps $$0, bqr $$1, czq $$2, dqw $$3, dai.c $$4, ib.a $$5, double $$6) {
      bqb<?> $$7 = $$4.b;
      if ($$7.f() == bqr.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!brj.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !brj.a($$7, $$0, bqs.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bqq a(aps $$0, bqb<?> $$1) {
      try {
         bpv var3 = $$1.a((cyx)$$0);
         if (var3 instanceof bqq) {
            return (bqq)var3;
         }

         c.warn("Can't spawn entity of type: {}", kr.g.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(aps $$0, bqq $$1, double $$2) {
      return $$2 > (double)($$1.ai().f().f() * $$1.ai().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bqs.a) && $$1.a($$0);
   }

   private static Optional<dai.c> a(aps $$0, czq $$1, dqw $$2, bqr $$3, axr $$4, ib $$5) {
      il<czw> $$6 = $$0.t($$5);
      return $$3 == bqr.g && $$6.a(avb.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(aps $$0, czq $$1, dqw $$2, bqr $$3, dai.c $$4, ib $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bmo<dai.c> a(aps $$0, czq $$1, dqw $$2, bqr $$3, ib $$4, @Nullable il<czw> $$5) {
      return a($$4, $$0, $$3, $$1) ? ehn.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(ib $$0, aps $$1, bqr $$2, czq $$3) {
      if ($$2 == bqr.a && $$1.a_($$0.d()).a(dca.fn)) {
         efh $$4 = $$3.b().d(ks.aF).a(efb.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static ib a(cyx $$0, drf $$1) {
      cye $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dur.a.b, $$3, $$4) + 1;
      int $$6 = axk.b($$0.z, $$0.I_(), $$5);
      return new ib($$3, $$6, $$4);
   }

   public static boolean a(cyd $$0, ib $$1, doz $$2, eks $$3, bqb<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(avc.aX) ? false : !$$4.a($$2);
      }
   }

   public static void a(czm $$0, il<czw> $$1, cye $$2, axr $$3) {
      dai $$4 = $$1.a().b();
      bmo<dai.c> $$5 = $$4.a(bqr.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dai.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               dai.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               brg $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     ib $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && brj.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.k();
                        double $$21 = axk.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = axk.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !brj.a($$9.b, $$0, bqs.b, ib.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        bpv $$23;
                        try {
                           $$23 = $$9.b.a((cyx)$$0.E());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bqq $$26 && $$26.a($$0, bqs.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dm()), bqs.b, $$11);
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

   private static ib a(cza $$0, bqb<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(brj.b($$1), $$2, $$3);
      ib.a $$5 = new ib.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(ih.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(ih.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.I_());
      }

      return brj.a($$1).a($$0, $$5.i());
   }

   @FunctionalInterface
   public interface a {
      void run(bqq var1, dqv var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<drf> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bqb<?> var1, ib var2, dqv var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bqr> b;
      private final czl c;
      private final Object2IntMap<bqr> d;
      private final czh e;
      @Nullable
      private ib f;
      @Nullable
      private bqb<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bqr> $$1, czl $$2, czh $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bqb<?> $$0, ib $$1, dqv $$2) {
         this.f = $$1;
         this.g = $$0;
         dai.b $$3 = czi.a($$1, $$2).b().a($$0);
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

      private void a(bqq $$0, dqv $$1) {
         bqb<?> $$2 = $$0.ai();
         ib $$3 = $$0.dm();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dai.b $$5 = czi.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bqr $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new cye($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bqr> b() {
         return this.d;
      }

      boolean a(bqr $$0, cye $$1) {
         int $$2 = $$0.b() * this.a / czi.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
