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

public final class cpx {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bjb[] f = Stream.of(bjb.values()).filter($$0 -> $$0 != bjb.h).toArray(bjb[]::new);

   private cpx() {
   }

   public static cpx.d a(int $$0, Iterable<bii> $$1, cpx.b $$2, cpw $$3) {
      cqa $$4 = new cqa();
      Object2IntOpenHashMap<bjb> $$5 = new Object2IntOpenHashMap();

      for (bii $$6 : $$1) {
         if ($$6 instanceof bja $$7 && ($$7.fH() || $$7.R())) {
            continue;
         }

         bjb $$8 = $$6.ag().f();
         if ($$8 != bjb.h) {
            gu $$9 = $$6.dk();
            $$2.query(cot.a($$9), $$6x -> {
               cqw.b $$7 = a($$9, $$6x).b().a($$6.ag());
               if ($$7 != null) {
                  $$4.a($$6.dk(), $$7.b());
               }

               if ($$6 instanceof bja) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new cpx.d($$0, $$5, $$4, $$3);
   }

   static cqk a(gu $$0, dgw $$1) {
      return $$1.getNoiseBiome(hq.a($$0.u()), hq.a($$0.v()), hq.a($$0.w())).a();
   }

   public static void a(akk $$0, dhh $$1, cpx.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual akk.ad ()Lbdh;
      // 04: ldc "spawner"
      // 06: invokeinterface bdh.a (Ljava/lang/String;)V 2
      // 0b: getstatic cpx.f [Lbjb;
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
      // 2c: invokevirtual bjb.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bjb.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bjb.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dhh.f ()Lcot;
      // 53: invokevirtual cpx$d.a (Lbjb;Lcot;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lcpx$d;)Lcpx$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbim;Lgu;Ldgw;)Z, cpx$d.a (Lbim;Lgu;Ldgw;)Z, (Lbim;Lgu;Ldgw;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lcpx$d;)Lcpx$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbja;Ldgw;)V, cpx$d.a (Lbja;Ldgw;)V, (Lbja;Ldgw;)V ]
      // 73: invokestatic cpx.a (Lbjb;Lakk;Ldhh;Lcpx$c;Lcpx$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual akk.ad ()Lbdh;
      // 80: invokeinterface bdh.c ()V 1
      // 85: return
   }

   public static void a(bjb $$0, akk $$1, dhh $$2, cpx.c $$3, cpx.a $$4) {
      gu $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.C_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @asq
   public static void a(bjb $$0, akk $$1, gu $$2) {
      a($$0, $$1, $$1.x($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bjb $$0, akk $$1, dgw $$2, gu $$3, cpx.c $$4, cpx.a $$5) {
      cqe $$6 = $$1.a();
      dgx $$7 = $$1.k().g();
      int $$8 = $$3.v();
      dfa $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         gu.a $$10 = new gu.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            cqw.c $$16 = null;
            bjs $$17 = null;
            int $$18 = arp.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cbn $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<cqw.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bja $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dk()), bjc.a, $$17, null);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.Z()) {
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

   private static boolean a(akk $$0, dgw $$1, gu.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.R().a(new ehe((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new cot($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(akk $$0, bjb $$1, cqe $$2, dgx $$3, cqw.c $$4, gu.a $$5, double $$6) {
      bim<?> $$7 = $$4.b;
      if ($$7.f() == bjb.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bjt.c $$8 = bjt.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bjt.a($$7, $$0, bjc.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bja a(akk $$0, bim<?> $$1) {
      try {
         bii var3 = $$1.a((cpm)$$0);
         if (var3 instanceof bja) {
            return (bja)var3;
         }

         c.warn("Can't spawn entity of type: {}", jb.h.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(akk $$0, bja $$1, double $$2) {
      return $$2 > (double)($$1.ag().f().f() * $$1.ag().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bjc.a) && $$1.a($$0);
   }

   private static Optional<cqw.c> a(akk $$0, cqe $$1, dgx $$2, bjb $$3, aru $$4, gu $$5) {
      he<cqk> $$6 = $$0.s($$5);
      return $$3 == bjb.g && $$6.a(apk.al) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(akk $$0, cqe $$1, dgx $$2, bjb $$3, cqw.c $$4, gu $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bfe<cqw.c> a(akk $$0, cqe $$1, dgx $$2, bjb $$3, gu $$4, @Nullable he<cqk> $$5) {
      return a($$4, $$0, $$3, $$1) ? dwy.d : $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
   }

   public static boolean a(gu $$0, akk $$1, bjb $$2, cqe $$3) {
      if ($$2 == bjb.a && $$1.a_($$0.d()).a(csn.fn)) {
         duz $$4 = $$3.b().d(jc.az).a(dut.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static gu a(cpm $$0, dhh $$1) {
      cot $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dkj.a.b, $$3, $$4) + 1;
      int $$6 = arp.b($$0.z, $$0.C_(), $$5);
      return new gu($$3, $$6, $$4);
   }

   public static boolean a(cos $$0, gu $$1, dfa $$2, ead $$3, bim<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(apl.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bjt.c $$0, cpp $$1, gu $$2, @Nullable bim<?> $$3) {
      if ($$0 == bjt.c.c) {
         return true;
      } else if ($$3 != null && $$1.w_().a($$2)) {
         dfa $$4 = $$1.a_($$2);
         ead $$5 = $$1.b_($$2);
         gu $$6 = $$2.c();
         gu $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(apq.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(apq.b);
            case a:
            default:
               dfa $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(cqb $$0, he<cqk> $$1, cot $$2, aru $$3) {
      cqw $$4 = $$1.a().b();
      bfe<cqw.c> $$5 = $$4.a(bjb.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<cqw.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               cqw.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bjs $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     gu $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bjt.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = arp.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = arp.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bjt.a($$9.b, $$0, bjc.b, gu.a($$21, (double)$$19.v(), $$22), $$0.y_())) {
                           continue;
                        }

                        bii $$23;
                        try {
                           $$23 = $$9.b.a((cpm)$$0.C());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bja $$26 && $$26.a($$0, bjc.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dk()), bjc.b, $$11, null);
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

   private static gu a(cpp $$0, bim<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bjt.b($$1), $$2, $$3);
      gu.a $$5 = new gu.a($$2, $$4, $$3);
      if ($$0.x_().h()) {
         do {
            $$5.c(ha.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(ha.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.C_());
      }

      if (bjt.a($$1) == bjt.c.a) {
         gu $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, eat.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bja var1, dgw var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dhh> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bim<?> var1, gu var2, dgw var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bjb> b;
      private final cqa c;
      private final Object2IntMap<bjb> d;
      private final cpw e;
      @Nullable
      private gu f;
      @Nullable
      private bim<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bjb> $$1, cqa $$2, cpw $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bim<?> $$0, gu $$1, dgw $$2) {
         this.f = $$1;
         this.g = $$0;
         cqw.b $$3 = cpx.a($$1, $$2).b().a($$0);
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

      private void a(bja $$0, dgw $$1) {
         bim<?> $$2 = $$0.ag();
         gu $$3 = $$0.dk();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            cqw.b $$5 = cpx.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bjb $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new cot($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bjb> b() {
         return this.d;
      }

      boolean a(bjb $$0, cot $$1) {
         int $$2 = $$0.b() * this.a / cpx.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
