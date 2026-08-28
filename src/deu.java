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

public final class deu {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final buq[] f = Stream.of(buq.values()).filter($$0 -> $$0 != buq.h).toArray(buq[]::new);

   private deu() {
   }

   public static deu.d a(int $$0, Iterable<btr> $$1, deu.b $$2, det $$3) {
      dex $$4 = new dex();
      Object2IntOpenHashMap<buq> $$5 = new Object2IntOpenHashMap();

      for (btr $$6 : $$1) {
         if ($$6 instanceof bup $$7 && ($$7.fX() || $$7.Z())) {
            continue;
         }

         buq $$8 = $$6.ao().f();
         if ($$8 != buq.h) {
            jf $$9 = $$6.ds();
            $$2.query(ddp.a($$9), $$6x -> {
               dfw.b $$7 = a($$9, $$6x).b().a($$6.ao());
               if ($$7 != null) {
                  $$4.a($$6.ds(), $$7.b());
               }

               if ($$6 instanceof bup) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new deu.d($$0, $$5, $$4, $$3);
   }

   static dfk a(jf $$0, dwo $$1) {
      return $$1.getNoiseBiome(jz.a($$0.u()), jz.a($$0.v()), jz.a($$0.w())).a();
   }

   public static List<buq> a(deu.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<buq> $$4 = new ArrayList<>(f.length);

      for (buq $$5 : f) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(arj $$0, dwy $$1, deu.d $$2, List<buq> $$3) {
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
      // 01: invokevirtual arj.ah ()Lbog;
      // 04: ldc "spawner"
      // 06: invokeinterface bog.a (Ljava/lang/String;)V 2
      // 0b: aload 3
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: astore 4
      // 13: aload 4
      // 15: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a: ifeq 56
      // 1d: aload 4
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: checkcast buq
      // 27: astore 5
      // 29: aload 2
      // 2a: aload 5
      // 2c: aload 1
      // 2d: invokevirtual dwy.f ()Lddp;
      // 30: invokevirtual deu$d.a (Lbuq;Lddp;)Z
      // 33: ifeq 53
      // 36: aload 5
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 2
      // 3b: dup
      // 3c: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 3f: pop
      // 40: invokedynamic test (Ldeu$d;)Ldeu$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbty;Ljf;Ldwo;)Z, deu$d.a (Lbty;Ljf;Ldwo;)Z, (Lbty;Ljf;Ldwo;)Z ]
      // 45: aload 2
      // 46: dup
      // 47: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4a: pop
      // 4b: invokedynamic run (Ldeu$d;)Ldeu$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbup;Ldwo;)V, deu$d.a (Lbup;Ldwo;)V, (Lbup;Ldwo;)V ]
      // 50: invokestatic deu.a (Lbuq;Larj;Ldwy;Ldeu$c;Ldeu$a;)V
      // 53: goto 13
      // 56: aload 0
      // 57: invokevirtual arj.ah ()Lbog;
      // 5a: invokeinterface bog.c ()V 1
      // 5f: return
   }

   public static void a(buq $$0, arj $$1, dwy $$2, deu.c $$3, deu.a $$4) {
      jf $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.H_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bal
   public static void a(buq $$0, arj $$1, jf $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(buq $$0, arj $$1, dwo $$2, jf $$3, deu.c $$4, deu.a $$5) {
      dfe $$6 = $$1.a();
      dwp $$7 = $$1.l().g();
      int $$8 = $$3.v();
      dus $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         jf.a $$10 = new jf.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dfw.c $$16 = null;
            bvf $$17 = null;
            int $$18 = azf.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cnx $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dfw.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bup $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.ds()), btx.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fS()) {
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

   private static boolean a(arj $$0, dwo $$1, jf.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.W().a(new eyw((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new ddp($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(arj $$0, buq $$1, dfe $$2, dwp $$3, dfw.c $$4, jf.a $$5, double $$6) {
      bty<?> $$7 = $$4.b;
      if ($$7.f() == buq.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bvi.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bvi.a($$7, $$0, btx.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bup a(arj $$0, bty<?> $$1) {
      try {
         btr var3 = $$1.a($$0, btx.a);
         if (var3 instanceof bup) {
            return (bup)var3;
         }

         c.warn("Can't spawn entity of type: {}", lv.f.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(arj $$0, bup $$1, double $$2) {
      return $$2 > (double)($$1.ao().f().f() * $$1.ao().f().f()) && $$1.h($$2) ? false : $$1.a($$0, btx.a) && $$1.a($$0);
   }

   private static Optional<dfw.c> a(arj $$0, dfe $$1, dwp $$2, buq $$3, azn $$4, jf $$5) {
      jo<dfk> $$6 = $$0.t($$5);
      return $$3 == buq.g && $$6.a(awu.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(arj $$0, dfe $$1, dwp $$2, buq $$3, dfw.c $$4, jf $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bqg<dfw.c> a(arj $$0, dfe $$1, dwp $$2, buq $$3, jf $$4, @Nullable jo<dfk> $$5) {
      return a($$4, $$0, $$3, $$1) ? enn.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(jf $$0, arj $$1, buq $$2, dfe $$3) {
      if ($$2 == buq.a && $$1.a_($$0.e()).a(dho.fn)) {
         elg $$4 = $$3.b().e(lw.aT).c(ela.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static jf a(dej $$0, dwy $$1) {
      ddp $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(eao.a.b, $$3, $$4) + 1;
      int $$6 = azf.b($$0.z, $$0.H_(), $$5);
      return new jf($$3, $$6, $$4);
   }

   public static boolean a(ddo $$0, jf $$1, dus $$2, eqt $$3, bty<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(awv.aY) ? false : !$$4.a($$2);
      }
   }

   public static void a(dez $$0, jo<dfk> $$1, ddp $$2, azn $$3) {
      dfw $$4 = $$1.a().b();
      bqg<dfw.c> $$5 = $$4.a(buq.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dfw.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               dfw.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bvf $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     jf $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && bvi.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = azf.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = azf.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bvi.a($$9.b, $$0, btx.b, jf.a($$21, (double)$$19.v(), $$22), $$0.D_())) {
                           continue;
                        }

                        btr $$23;
                        try {
                           $$23 = $$9.b.a($$0.E(), btx.a);
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bup $$26 && $$26.a($$0, btx.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.ds()), btx.b, $$11);
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

   private static jf a(dem $$0, bty<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bvi.b($$1), $$2, $$3);
      jf.a $$5 = new jf.a($$2, $$4, $$3);
      if ($$0.C_().h()) {
         do {
            $$5.c(jk.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jk.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.H_());
      }

      return bvi.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bup var1, dwo var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dwy> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bty<?> var1, jf var2, dwo var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<buq> b;
      private final dex c;
      private final Object2IntMap<buq> d;
      private final det e;
      @Nullable
      private jf f;
      @Nullable
      private bty<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<buq> $$1, dex $$2, det $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bty<?> $$0, jf $$1, dwo $$2) {
         this.f = $$1;
         this.g = $$0;
         dfw.b $$3 = deu.a($$1, $$2).b().a($$0);
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

      private void a(bup $$0, dwo $$1) {
         bty<?> $$2 = $$0.ao();
         jf $$3 = $$0.ds();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dfw.b $$5 = deu.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         buq $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new ddp($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<buq> b() {
         return this.d;
      }

      boolean a(buq $$0) {
         int $$1 = $$0.b() * this.a / deu.e;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(buq $$0, ddp $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
