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

public final class dgt {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bvk[] f = Stream.of(bvk.values()).filter($$0 -> $$0 != bvk.h).toArray(bvk[]::new);

   private dgt() {
   }

   public static dgt.d a(int $$0, Iterable<bul> $$1, dgt.b $$2, dgs $$3) {
      dgw $$4 = new dgw();
      Object2IntOpenHashMap<bvk> $$5 = new Object2IntOpenHashMap();

      for (bul $$6 : $$1) {
         if ($$6 instanceof bvj $$7 && ($$7.fZ() || $$7.aa())) {
            continue;
         }

         bvk $$8 = $$6.aq().f();
         if ($$8 != bvk.h) {
            ji $$9 = $$6.dv();
            $$2.query(dfo.a($$9), $$6x -> {
               dhw.b $$7 = a($$9, $$6x).b().a($$6.aq());
               if ($$7 != null) {
                  $$4.a($$6.dv(), $$7.b());
               }

               if ($$6 instanceof bvj) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dgt.d($$0, $$5, $$4, $$3);
   }

   static dhk a(ji $$0, dys $$1) {
      return $$1.getNoiseBiome(kc.a($$0.u()), kc.a($$0.v()), kc.a($$0.w())).a();
   }

   public static List<bvk> a(dgt.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<bvk> $$4 = new ArrayList<>(f.length);

      for (bvk $$5 : f) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(ard $$0, dzc $$1, dgt.d $$2, List<bvk> $$3) {
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
      // 00: invokestatic bos.a ()Lbot;
      // 03: astore 4
      // 05: aload 4
      // 07: ldc "spawner"
      // 09: invokeinterface bot.a (Ljava/lang/String;)V 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 59
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast bvk
      // 2a: astore 6
      // 2c: aload 2
      // 2d: aload 6
      // 2f: aload 1
      // 30: invokevirtual dzc.f ()Ldfo;
      // 33: invokevirtual dgt$d.a (Lbvk;Ldfo;)Z
      // 36: ifeq 56
      // 39: aload 6
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: dup
      // 3f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: invokedynamic test (Ldgt$d;)Ldgt$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbus;Lji;Ldys;)Z, dgt$d.a (Lbus;Lji;Ldys;)Z, (Lbus;Lji;Ldys;)Z ]
      // 48: aload 2
      // 49: dup
      // 4a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d: pop
      // 4e: invokedynamic run (Ldgt$d;)Ldgt$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbvj;Ldys;)V, dgt$d.a (Lbvj;Ldys;)V, (Lbvj;Ldys;)V ]
      // 53: invokestatic dgt.a (Lbvk;Lard;Ldzc;Ldgt$c;Ldgt$a;)V
      // 56: goto 16
      // 59: aload 4
      // 5b: invokeinterface bot.c ()V 1
      // 60: return
   }

   public static void a(bvk $$0, ard $$1, dzc $$2, dgt.c $$3, dgt.a $$4) {
      ji $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.L_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bag
   public static void a(bvk $$0, ard $$1, ji $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bvk $$0, ard $$1, dys $$2, ji $$3, dgt.c $$4, dgt.a $$5) {
      dhe $$6 = $$1.b();
      dyt $$7 = $$1.m().g();
      int $$8 = $$3.v();
      dwx $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         ji.a $$10 = new ji.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dhw.c $$16 = null;
            bwa $$17 = null;
            int $$18 = ayz.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cox $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dhw.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.A.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bvj $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dv()), bur.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.aj()) {
                              return;
                           }

                           if ($$26.q($$19)) {
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

   private static boolean a(ard $$0, dys $$1, ji.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.Z().a(new fba((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new dfo($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(ard $$0, bvk $$1, dhe $$2, dyt $$3, dhw.c $$4, ji.a $$5, double $$6) {
      bus<?> $$7 = $$4.b;
      if ($$7.f() == bvk.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bwd.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bwd.a($$7, $$0, bur.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bvj a(ard $$0, bus<?> $$1) {
      try {
         bul var3 = $$1.a($$0, bur.a);
         if (var3 instanceof bvj) {
            return (bvj)var3;
         }

         c.warn("Can't spawn entity of type: {}", mb.f.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(ard $$0, bvj $$1, double $$2) {
      return $$2 > (double)($$1.aq().f().f() * $$1.aq().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bur.a) && $$1.a((dgl)$$0);
   }

   private static Optional<dhw.c> a(ard $$0, dhe $$1, dyt $$2, bvk $$3, azh $$4, ji $$5) {
      jr<dhk> $$6 = $$0.t($$5);
      return $$3 == bvk.g && $$6.a(awo.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(ard $$0, dhe $$1, dyt $$2, bvk $$3, dhw.c $$4, ji $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bqw<dhw.c> a(ard $$0, dhe $$1, dyt $$2, bvk $$3, ji $$4, @Nullable jr<dhk> $$5) {
      return a($$4, $$0, $$3, $$1) ? ept.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(ji $$0, ard $$1, bvk $$2, dhe $$3) {
      if ($$2 == bvk.a && $$1.a_($$0.e()).a(djo.fI)) {
         enm $$4 = $$3.b().e(mc.aU).c(eng.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static ji a(dgi $$0, dzc $$1) {
      dfo $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(ecs.a.b, $$3, $$4) + 1;
      int $$6 = ayz.b($$0.A, $$0.L_(), $$5);
      return new ji($$3, $$6, $$4);
   }

   public static boolean a(dfn $$0, ji $$1, dwx $$2, esz $$3, bus<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(awp.aZ) ? false : !$$4.a($$2);
      }
   }

   public static void a(dgz $$0, jr<dhk> $$1, dfo $$2, azh $$3) {
      dhw $$4 = $$1.a().b();
      bqw<dhw.c> $$5 = $$4.a(bvk.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dhw.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               dhw.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bwa $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     ji $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && bwd.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = ayz.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = ayz.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bwd.a($$9.b, $$0, bur.b, ji.a($$21, (double)$$19.v(), $$22), $$0.H_())) {
                           continue;
                        }

                        bul $$23;
                        try {
                           $$23 = $$9.b.a($$0.a(), bur.a);
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bvj $$26 && $$26.a($$0, bur.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dv()), bur.b, $$11);
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

   private static ji a(dgl $$0, bus<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bwd.b($$1), $$2, $$3);
      ji.a $$5 = new ji.a($$2, $$4, $$3);
      if ($$0.G_().h()) {
         do {
            $$5.c(jn.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jn.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.L_());
      }

      return bwd.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bvj var1, dys var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dzc> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bus<?> var1, ji var2, dys var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bvk> b;
      private final dgw c;
      private final Object2IntMap<bvk> d;
      private final dgs e;
      @Nullable
      private ji f;
      @Nullable
      private bus<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bvk> $$1, dgw $$2, dgs $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bus<?> $$0, ji $$1, dys $$2) {
         this.f = $$1;
         this.g = $$0;
         dhw.b $$3 = dgt.a($$1, $$2).b().a($$0);
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

      private void a(bvj $$0, dys $$1) {
         bus<?> $$2 = $$0.aq();
         ji $$3 = $$0.dv();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dhw.b $$5 = dgt.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bvk $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dfo($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bvk> b() {
         return this.d;
      }

      boolean a(bvk $$0) {
         int $$1 = $$0.b() * this.a / dgt.e;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(bvk $$0, dfo $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
