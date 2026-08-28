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

public final class der {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bun[] f = Stream.of(bun.values()).filter($$0 -> $$0 != bun.h).toArray(bun[]::new);

   private der() {
   }

   public static der.d a(int $$0, Iterable<bto> $$1, der.b $$2, deq $$3) {
      deu $$4 = new deu();
      Object2IntOpenHashMap<bun> $$5 = new Object2IntOpenHashMap();

      for (bto $$6 : $$1) {
         if ($$6 instanceof bum $$7 && ($$7.fY() || $$7.aa())) {
            continue;
         }

         bun $$8 = $$6.ao().f();
         if ($$8 != bun.h) {
            je $$9 = $$6.ds();
            $$2.query(ddm.a($$9), $$6x -> {
               dft.b $$7 = a($$9, $$6x).b().a($$6.ao());
               if ($$7 != null) {
                  $$4.a($$6.ds(), $$7.b());
               }

               if ($$6 instanceof bum) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new der.d($$0, $$5, $$4, $$3);
   }

   static dfh a(je $$0, dwk $$1) {
      return $$1.getNoiseBiome(jy.a($$0.u()), jy.a($$0.v()), jy.a($$0.w())).a();
   }

   public static List<bun> a(der.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<bun> $$4 = new ArrayList<>(f.length);

      for (bun $$5 : f) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(arh $$0, dwu $$1, der.d $$2, List<bun> $$3) {
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
      // 01: invokevirtual arh.ah ()Lbod;
      // 04: ldc "spawner"
      // 06: invokeinterface bod.a (Ljava/lang/String;)V 2
      // 0b: aload 3
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: astore 4
      // 13: aload 4
      // 15: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a: ifeq 56
      // 1d: aload 4
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: checkcast bun
      // 27: astore 5
      // 29: aload 2
      // 2a: aload 5
      // 2c: aload 1
      // 2d: invokevirtual dwu.f ()Lddm;
      // 30: invokevirtual der$d.a (Lbun;Lddm;)Z
      // 33: ifeq 53
      // 36: aload 5
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 2
      // 3b: dup
      // 3c: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 3f: pop
      // 40: invokedynamic test (Lder$d;)Lder$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbtv;Lje;Ldwk;)Z, der$d.a (Lbtv;Lje;Ldwk;)Z, (Lbtv;Lje;Ldwk;)Z ]
      // 45: aload 2
      // 46: dup
      // 47: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4a: pop
      // 4b: invokedynamic run (Lder$d;)Lder$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbum;Ldwk;)V, der$d.a (Lbum;Ldwk;)V, (Lbum;Ldwk;)V ]
      // 50: invokestatic der.a (Lbun;Larh;Ldwu;Lder$c;Lder$a;)V
      // 53: goto 13
      // 56: aload 0
      // 57: invokevirtual arh.ah ()Lbod;
      // 5a: invokeinterface bod.c ()V 1
      // 5f: return
   }

   public static void a(bun $$0, arh $$1, dwu $$2, der.c $$3, der.a $$4) {
      je $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.G_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @baj
   public static void a(bun $$0, arh $$1, je $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bun $$0, arh $$1, dwk $$2, je $$3, der.c $$4, der.a $$5) {
      dfb $$6 = $$1.a();
      dwl $$7 = $$1.l().g();
      int $$8 = $$3.v();
      duo $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         je.a $$10 = new je.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dft.c $$16 = null;
            bvc $$17 = null;
            int $$18 = azd.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cnu $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dft.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bum $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.ds()), btu.a, $$17);
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

   private static boolean a(arh $$0, dwk $$1, je.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.W().a(new eys((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new ddm($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(arh $$0, bun $$1, dfb $$2, dwl $$3, dft.c $$4, je.a $$5, double $$6) {
      btv<?> $$7 = $$4.b;
      if ($$7.f() == bun.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bvf.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bvf.a($$7, $$0, btu.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bum a(arh $$0, btv<?> $$1) {
      try {
         bto var3 = $$1.a($$0, btu.a);
         if (var3 instanceof bum) {
            return (bum)var3;
         }

         c.warn("Can't spawn entity of type: {}", lu.f.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(arh $$0, bum $$1, double $$2) {
      return $$2 > (double)($$1.ao().f().f() * $$1.ao().f().f()) && $$1.h($$2) ? false : $$1.a($$0, btu.a) && $$1.a($$0);
   }

   private static Optional<dft.c> a(arh $$0, dfb $$1, dwl $$2, bun $$3, azl $$4, je $$5) {
      jn<dfh> $$6 = $$0.t($$5);
      return $$3 == bun.g && $$6.a(aws.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(arh $$0, dfb $$1, dwl $$2, bun $$3, dft.c $$4, je $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bqd<dft.c> a(arh $$0, dfb $$1, dwl $$2, bun $$3, je $$4, @Nullable jn<dfh> $$5) {
      return a($$4, $$0, $$3, $$1) ? enj.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(je $$0, arh $$1, bun $$2, dfb $$3) {
      if ($$2 == bun.a && $$1.a_($$0.e()).a(dhl.fn)) {
         elc $$4 = $$3.b().d(lv.aS).a(ekw.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static je a(deg $$0, dwu $$1) {
      ddm $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(eak.a.b, $$3, $$4) + 1;
      int $$6 = azd.b($$0.z, $$0.G_(), $$5);
      return new je($$3, $$6, $$4);
   }

   public static boolean a(ddl $$0, je $$1, duo $$2, eqp $$3, btv<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(awt.aY) ? false : !$$4.a($$2);
      }
   }

   public static void a(dew $$0, jn<dfh> $$1, ddm $$2, azl $$3) {
      dft $$4 = $$1.a().b();
      bqd<dft.c> $$5 = $$4.a(bun.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dft.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               dft.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bvc $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     je $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && bvf.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = azd.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = azd.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bvf.a($$9.b, $$0, btu.b, je.a($$21, (double)$$19.v(), $$22), $$0.C_())) {
                           continue;
                        }

                        bto $$23;
                        try {
                           $$23 = $$9.b.a($$0.E(), btu.a);
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bum $$26 && $$26.a($$0, btu.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.ds()), btu.b, $$11);
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

   private static je a(dej $$0, btv<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bvf.b($$1), $$2, $$3);
      je.a $$5 = new je.a($$2, $$4, $$3);
      if ($$0.B_().h()) {
         do {
            $$5.c(jj.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jj.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.G_());
      }

      return bvf.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bum var1, dwk var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dwu> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(btv<?> var1, je var2, dwk var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bun> b;
      private final deu c;
      private final Object2IntMap<bun> d;
      private final deq e;
      @Nullable
      private je f;
      @Nullable
      private btv<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bun> $$1, deu $$2, deq $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(btv<?> $$0, je $$1, dwk $$2) {
         this.f = $$1;
         this.g = $$0;
         dft.b $$3 = der.a($$1, $$2).b().a($$0);
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

      private void a(bum $$0, dwk $$1) {
         btv<?> $$2 = $$0.ao();
         je $$3 = $$0.ds();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dft.b $$5 = der.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bun $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new ddm($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bun> b() {
         return this.d;
      }

      boolean a(bun $$0) {
         int $$1 = $$0.b() * this.a / der.e;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(bun $$0, ddm $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
