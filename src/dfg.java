import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dfg {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final buy[] f = Stream.of(buy.values()).filter($$0 -> $$0 != buy.h).toArray(buy[]::new);

   private dfg() {
   }

   public static dfg.d a(int $$0, Iterable<btz> $$1, dfg.b $$2, dff $$3) {
      dfj $$4 = new dfj();
      Object2IntOpenHashMap<buy> $$5 = new Object2IntOpenHashMap();

      for (btz $$6 : $$1) {
         if ($$6 instanceof bux $$7 && ($$7.gc() || $$7.Z())) {
            continue;
         }

         buy $$8 = $$6.aq().f();
         if ($$8 != buy.h) {
            jg $$9 = $$6.dx();
            $$2.query(deb.a($$9), $$6x -> {
               dgi.b $$7 = a($$9, $$6x).b().a($$6.aq());
               if ($$7 != null) {
                  $$4.a($$6.dx(), $$7.b());
               }

               if ($$6 instanceof bux) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dfg.d($$0, $$5, $$4, $$3);
   }

   static dfw a(jg $$0, dwz $$1) {
      return $$1.getNoiseBiome(ka.a($$0.u()), ka.a($$0.v()), ka.a($$0.w())).a();
   }

   public static List<buy> a(dfg.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<buy> $$4 = new ArrayList<>(f.length);

      for (buy $$5 : f) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(arm $$0, dxj $$1, dfg.d $$2, List<buy> $$3) {
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
      // 01: invokevirtual arm.ah ()Lbok;
      // 04: ldc "spawner"
      // 06: invokeinterface bok.a (Ljava/lang/String;)V 2
      // 0b: aload 3
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: astore 4
      // 13: aload 4
      // 15: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a: ifeq 56
      // 1d: aload 4
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: checkcast buy
      // 27: astore 5
      // 29: aload 2
      // 2a: aload 5
      // 2c: aload 1
      // 2d: invokevirtual dxj.f ()Ldeb;
      // 30: invokevirtual dfg$d.a (Lbuy;Ldeb;)Z
      // 33: ifeq 53
      // 36: aload 5
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 2
      // 3b: dup
      // 3c: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 3f: pop
      // 40: invokedynamic test (Ldfg$d;)Ldfg$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbug;Ljg;Ldwz;)Z, dfg$d.a (Lbug;Ljg;Ldwz;)Z, (Lbug;Ljg;Ldwz;)Z ]
      // 45: aload 2
      // 46: dup
      // 47: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4a: pop
      // 4b: invokedynamic run (Ldfg$d;)Ldfg$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbux;Ldwz;)V, dfg$d.a (Lbux;Ldwz;)V, (Lbux;Ldwz;)V ]
      // 50: invokestatic dfg.a (Lbuy;Larm;Ldxj;Ldfg$c;Ldfg$a;)V
      // 53: goto 13
      // 56: aload 0
      // 57: invokevirtual arm.ah ()Lbok;
      // 5a: invokeinterface bok.c ()V 1
      // 5f: return
   }

   public static void a(buy $$0, arm $$1, dxj $$2, dfg.c $$3, dfg.a $$4) {
      jg $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bap
   public static void a(buy $$0, arm $$1, jg $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(buy $$0, arm $$1, dwz $$2, jg $$3, dfg.c $$4, dfg.a $$5) {
      dfq $$6 = $$1.a();
      dxa $$7 = $$1.l().g();
      int $$8 = $$3.v();
      dvd $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         jg.a $$10 = new jg.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dgi.c $$16 = null;
            bvo $$17 = null;
            int $$18 = azj.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               coh $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dgi.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.A.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bux $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dx()), buf.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.aj()) {
                              return;
                           }

                           if ($$26.r($$19)) {
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

   private static boolean a(arm $$0, dwz $$1, jg.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.W().a(new ezh((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new deb($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(arm $$0, buy $$1, dfq $$2, dxa $$3, dgi.c $$4, jg.a $$5, double $$6) {
      bug<?> $$7 = $$4.b;
      if ($$7.f() == buy.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bvr.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bvr.a($$7, $$0, buf.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bux a(arm $$0, bug<?> $$1) {
      try {
         btz var3 = $$1.a($$0, buf.a);
         if (var3 instanceof bux) {
            return (bux)var3;
         }

         c.warn("Can't spawn entity of type: {}", lx.f.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(arm $$0, bux $$1, double $$2) {
      return $$2 > (double)($$1.aq().f().f() * $$1.aq().f().f()) && $$1.h($$2) ? false : $$1.a($$0, buf.a) && $$1.a($$0);
   }

   private static Optional<dgi.c> a(arm $$0, dfq $$1, dxa $$2, buy $$3, azr $$4, jg $$5) {
      jp<dfw> $$6 = $$0.t($$5);
      return $$3 == buy.g && $$6.a(awy.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(arm $$0, dfq $$1, dxa $$2, buy $$3, dgi.c $$4, jg $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bqk<dgi.c> a(arm $$0, dfq $$1, dxa $$2, buy $$3, jg $$4, @Nullable jp<dfw> $$5) {
      return a($$4, $$0, $$3, $$1) ? eny.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(jg $$0, arm $$1, buy $$2, dfq $$3) {
      if ($$2 == buy.a && $$1.a_($$0.e()).a(dia.fn)) {
         elr $$4 = $$3.b().e(ly.aS).c(ell.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static jg a(dev $$0, dxj $$1) {
      deb $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(eaz.a.b, $$3, $$4) + 1;
      int $$6 = azj.b($$0.A, $$0.I_(), $$5);
      return new jg($$3, $$6, $$4);
   }

   public static boolean a(dea $$0, jg $$1, dvd $$2, ere $$3, bug<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(awz.aY) ? false : !$$4.a($$2);
      }
   }

   public static void a(dfl $$0, jp<dfw> $$1, deb $$2, azr $$3) {
      dgi $$4 = $$1.a().b();
      bqk<dgi.c> $$5 = $$4.a(buy.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dgi.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               dgi.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bvo $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     jg $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && bvr.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = azj.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = azj.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bvr.a($$9.b, $$0, buf.b, jg.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        btz $$23;
                        try {
                           $$23 = $$9.b.a($$0.E(), buf.a);
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bux $$26 && $$26.a($$0, buf.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dx()), buf.b, $$11);
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

   private static jg a(dey $$0, bug<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bvr.b($$1), $$2, $$3);
      jg.a $$5 = new jg.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(jl.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jl.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.I_());
      }

      return bvr.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bux var1, dwz var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dxj> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bug<?> var1, jg var2, dwz var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<buy> b;
      private final dfj c;
      private final Object2IntMap<buy> d;
      private final dff e;
      @Nullable
      private jg f;
      @Nullable
      private bug<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<buy> $$1, dfj $$2, dff $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bug<?> $$0, jg $$1, dwz $$2) {
         this.f = $$1;
         this.g = $$0;
         dgi.b $$3 = dfg.a($$1, $$2).b().a($$0);
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

      private void a(bux $$0, dwz $$1) {
         bug<?> $$2 = $$0.aq();
         jg $$3 = $$0.dx();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dgi.b $$5 = dfg.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         buy $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new deb($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<buy> b() {
         return this.d;
      }

      boolean a(buy $$0) {
         int $$1 = $$0.b() * this.a / dfg.e;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(buy $$0, deb $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
