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

public final class dao {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bsd[] f = Stream.of(bsd.values()).filter($$0 -> $$0 != bsd.h).toArray(bsd[]::new);

   private dao() {
   }

   public static dao.d a(int $$0, Iterable<brh> $$1, dao.b $$2, dan $$3) {
      dar $$4 = new dar();
      Object2IntOpenHashMap<bsd> $$5 = new Object2IntOpenHashMap();

      for (brh $$6 : $$1) {
         if ($$6 instanceof bsc $$7 && ($$7.fV() || $$7.V())) {
            continue;
         }

         bsd $$8 = $$6.ai().f();
         if ($$8 != bsd.h) {
            in $$9 = $$6.dn();
            $$2.query(czk.a($$9), $$6x -> {
               dbo.b $$7 = a($$9, $$6x).b().a($$6.ai());
               if ($$7 != null) {
                  $$4.a($$6.dn(), $$7.b());
               }

               if ($$6 instanceof bsc) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dao.d($$0, $$5, $$4, $$3);
   }

   static dbc a(in $$0, dsd $$1) {
      return $$1.getNoiseBiome(jh.a($$0.u()), jh.a($$0.v()), jh.a($$0.w())).a();
   }

   public static void a(aqh $$0, dsn $$1, dao.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual aqh.af ()Lbma;
      // 04: ldc "spawner"
      // 06: invokeinterface bma.a (Ljava/lang/String;)V 2
      // 0b: getstatic dao.f [Lbsd;
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
      // 2c: invokevirtual bsd.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bsd.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bsd.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dsn.f ()Lczk;
      // 53: invokevirtual dao$d.a (Lbsd;Lczk;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Ldao$d;)Ldao$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbrn;Lin;Ldsd;)Z, dao$d.a (Lbrn;Lin;Ldsd;)Z, (Lbrn;Lin;Ldsd;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Ldao$d;)Ldao$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbsc;Ldsd;)V, dao$d.a (Lbsc;Ldsd;)V, (Lbsc;Ldsd;)V ]
      // 73: invokestatic dao.a (Lbsd;Laqh;Ldsn;Ldao$c;Ldao$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual aqh.af ()Lbma;
      // 80: invokeinterface bma.c ()V 1
      // 85: return
   }

   public static void a(bsd $$0, aqh $$1, dsn $$2, dao.c $$3, dao.a $$4) {
      in $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @azc
   public static void a(bsd $$0, aqh $$1, in $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bsd $$0, aqh $$1, dsd $$2, in $$3, dao.c $$4, dao.a $$5) {
      daw $$6 = $$1.a();
      dse $$7 = $$1.l().g();
      int $$8 = $$3.v();
      dqh $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         in.a $$10 = new in.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dbo.c $$16 = null;
            bss $$17 = null;
            int $$18 = axz.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               clh $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dbo.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bsc $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dn()), bse.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fP()) {
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

   private static boolean a(aqh $$0, dsd $$1, in.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.U().a(new etp((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new czk($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(aqh $$0, bsd $$1, daw $$2, dse $$3, dbo.c $$4, in.a $$5, double $$6) {
      brn<?> $$7 = $$4.b;
      if ($$7.f() == bsd.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bsv.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bsv.a($$7, $$0, bse.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bsc a(aqh $$0, brn<?> $$1) {
      try {
         brh var3 = $$1.a((dad)$$0);
         if (var3 instanceof bsc) {
            return (bsc)var3;
         }

         c.warn("Can't spawn entity of type: {}", ld.g.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(aqh $$0, bsc $$1, double $$2) {
      return $$2 > (double)($$1.ai().f().f() * $$1.ai().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bse.a) && $$1.a($$0);
   }

   private static Optional<dbo.c> a(aqh $$0, daw $$1, dse $$2, bsd $$3, ayg $$4, in $$5) {
      iw<dbc> $$6 = $$0.t($$5);
      return $$3 == bsd.g && $$6.a(avq.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(aqh $$0, daw $$1, dse $$2, bsd $$3, dbo.c $$4, in $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static boa<dbo.c> a(aqh $$0, daw $$1, dse $$2, bsd $$3, in $$4, @Nullable iw<dbc> $$5) {
      return a($$4, $$0, $$3, $$1) ? eiv.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(in $$0, aqh $$1, bsd $$2, daw $$3) {
      if ($$2 == bsd.a && $$1.a_($$0.d()).a(ddg.fn)) {
         egp $$4 = $$3.b().d(le.aJ).a(egj.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static in a(dad $$0, dsn $$1) {
      czk $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dvz.a.b, $$3, $$4) + 1;
      int $$6 = axz.b($$0.z, $$0.I_(), $$5);
      return new in($$3, $$6, $$4);
   }

   public static boolean a(czj $$0, in $$1, dqh $$2, ema $$3, brn<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(avr.aX) ? false : !$$4.a($$2);
      }
   }

   public static void a(das $$0, iw<dbc> $$1, czk $$2, ayg $$3) {
      dbo $$4 = $$1.a().b();
      boa<dbo.c> $$5 = $$4.a(bsd.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dbo.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               dbo.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bss $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     in $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && bsv.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.k();
                        double $$21 = axz.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = axz.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bsv.a($$9.b, $$0, bse.b, in.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        brh $$23;
                        try {
                           $$23 = $$9.b.a((dad)$$0.E());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bsc $$26 && $$26.a($$0, bse.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dn()), bse.b, $$11);
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

   private static in a(dag $$0, brn<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bsv.b($$1), $$2, $$3);
      in.a $$5 = new in.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(is.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(is.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.I_());
      }

      return bsv.a($$1).a($$0, $$5.i());
   }

   @FunctionalInterface
   public interface a {
      void run(bsc var1, dsd var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dsn> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(brn<?> var1, in var2, dsd var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bsd> b;
      private final dar c;
      private final Object2IntMap<bsd> d;
      private final dan e;
      @Nullable
      private in f;
      @Nullable
      private brn<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bsd> $$1, dar $$2, dan $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(brn<?> $$0, in $$1, dsd $$2) {
         this.f = $$1;
         this.g = $$0;
         dbo.b $$3 = dao.a($$1, $$2).b().a($$0);
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

      private void a(bsc $$0, dsd $$1) {
         brn<?> $$2 = $$0.ai();
         in $$3 = $$0.dn();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dbo.b $$5 = dao.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bsd $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new czk($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bsd> b() {
         return this.d;
      }

      boolean a(bsd $$0, czk $$1) {
         int $$2 = $$0.b() * this.a / dao.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
