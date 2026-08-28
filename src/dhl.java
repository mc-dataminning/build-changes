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

public final class dhl {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bwe[] f = Stream.of(bwe.values()).filter($$0 -> $$0 != bwe.h).toArray(bwe[]::new);

   private dhl() {
   }

   public static dhl.d a(int $$0, Iterable<bvf> $$1, dhl.b $$2, dhk $$3) {
      dho $$4 = new dho();
      Object2IntOpenHashMap<bwe> $$5 = new Object2IntOpenHashMap();

      for (bvf $$6 : $$1) {
         if ($$6 instanceof bwd $$7 && ($$7.aj() || $$7.W())) {
            continue;
         }

         bwe $$8 = $$6.aq().f();
         if ($$8 != bwe.h) {
            jh $$9 = $$6.dv();
            $$2.query(dgg.a($$9), $$6x -> {
               dio.b $$7 = a($$9, $$6x).b().a($$6.aq());
               if ($$7 != null) {
                  $$4.a($$6.dv(), $$7.b());
               }

               if ($$6 instanceof bwd) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dhl.d($$0, $$5, $$4, $$3);
   }

   static dic a(jh $$0, dzi $$1) {
      return $$1.getNoiseBiome(kb.a($$0.u()), kb.a($$0.v()), kb.a($$0.w())).a();
   }

   public static List<bwe> a(dhl.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<bwe> $$4 = new ArrayList<>(f.length);

      for (bwe $$5 : f) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(ash $$0, dzs $$1, dhl.d $$2, List<bwe> $$3) {
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
      // 00: invokestatic bpn.a ()Lbpo;
      // 03: astore 4
      // 05: aload 4
      // 07: ldc "spawner"
      // 09: invokeinterface bpo.a (Ljava/lang/String;)V 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 59
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast bwe
      // 2a: astore 6
      // 2c: aload 2
      // 2d: aload 6
      // 2f: aload 1
      // 30: invokevirtual dzs.f ()Ldgg;
      // 33: invokevirtual dhl$d.a (Lbwe;Ldgg;)Z
      // 36: ifeq 56
      // 39: aload 6
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: dup
      // 3f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: invokedynamic test (Ldhl$d;)Ldhl$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbvm;Ljh;Ldzi;)Z, dhl$d.a (Lbvm;Ljh;Ldzi;)Z, (Lbvm;Ljh;Ldzi;)Z ]
      // 48: aload 2
      // 49: dup
      // 4a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d: pop
      // 4e: invokedynamic run (Ldhl$d;)Ldhl$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbwd;Ldzi;)V, dhl$d.a (Lbwd;Ldzi;)V, (Lbwd;Ldzi;)V ]
      // 53: invokestatic dhl.a (Lbwe;Lash;Ldzs;Ldhl$c;Ldhl$a;)V
      // 56: goto 16
      // 59: aload 4
      // 5b: invokeinterface bpo.c ()V 1
      // 60: return
   }

   public static void a(bwe $$0, ash $$1, dzs $$2, dhl.c $$3, dhl.a $$4) {
      jh $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.L_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bbl
   public static void a(bwe $$0, ash $$1, jh $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bwe $$0, ash $$1, dzi $$2, jh $$3, dhl.c $$4, dhl.a $$5) {
      dhw $$6 = $$1.b();
      dzj $$7 = $$1.m().g();
      int $$8 = $$3.v();
      dxn $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         jh.a $$10 = new jh.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dio.c $$16 = null;
            bwu $$17 = null;
            int $$18 = bae.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cps $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dio.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.A.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bwd $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dv()), bvl.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.ad()) {
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

   private static boolean a(ash $$0, dzi $$1, jh.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.Y().a(new fbs((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new dgg($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(ash $$0, bwe $$1, dhw $$2, dzj $$3, dio.c $$4, jh.a $$5, double $$6) {
      bvm<?> $$7 = $$4.b;
      if ($$7.f() == bwe.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bwx.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bwx.a($$7, $$0, bvl.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bwd a(ash $$0, bvm<?> $$1) {
      try {
         bvf var3 = $$1.a($$0, bvl.a);
         if (var3 instanceof bwd) {
            return (bwd)var3;
         }

         c.warn("Can't spawn entity of type: {}", ma.f.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(ash $$0, bwd $$1, double $$2) {
      return $$2 > (double)($$1.aq().f().f() * $$1.aq().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bvl.a) && $$1.a((dhd)$$0);
   }

   private static Optional<dio.c> a(ash $$0, dhw $$1, dzj $$2, bwe $$3, bam $$4, jh $$5) {
      jq<dic> $$6 = $$0.t($$5);
      return $$3 == bwe.g && $$6.a(axt.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(ash $$0, dhw $$1, dzj $$2, bwe $$3, dio.c $$4, jh $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static brq<dio.c> a(ash $$0, dhw $$1, dzj $$2, bwe $$3, jh $$4, @Nullable jq<dic> $$5) {
      return a($$4, $$0, $$3, $$1) ? eqj.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(jh $$0, ash $$1, bwe $$2, dhw $$3) {
      if ($$2 == bwe.a && $$1.a_($$0.e()).a(dkg.fB)) {
         eoc $$4 = $$3.b().e(mb.aT).c(enw.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static jh a(dha $$0, dzs $$1) {
      dgg $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(edi.a.b, $$3, $$4) + 1;
      int $$6 = bae.b($$0.A, $$0.L_(), $$5);
      return new jh($$3, $$6, $$4);
   }

   public static boolean a(dgf $$0, jh $$1, dxn $$2, etp $$3, bvm<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(axu.aZ) ? false : !$$4.a($$2);
      }
   }

   public static void a(dhr $$0, jq<dic> $$1, dgg $$2, bam $$3) {
      dio $$4 = $$1.a().b();
      brq<dio.c> $$5 = $$4.a(bwe.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dio.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               dio.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bwu $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     jh $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && bwx.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = bae.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = bae.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bwx.a($$9.b, $$0, bvl.b, jh.a($$21, (double)$$19.v(), $$22), $$0.H_())) {
                           continue;
                        }

                        bvf $$23;
                        try {
                           $$23 = $$9.b.a($$0.a(), bvl.a);
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bwd $$26 && $$26.a($$0, bvl.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dv()), bvl.b, $$11);
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

   private static jh a(dhd $$0, bvm<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bwx.b($$1), $$2, $$3);
      jh.a $$5 = new jh.a($$2, $$4, $$3);
      if ($$0.G_().h()) {
         do {
            $$5.c(jm.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jm.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.L_());
      }

      return bwx.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bwd var1, dzi var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dzs> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bvm<?> var1, jh var2, dzi var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bwe> b;
      private final dho c;
      private final Object2IntMap<bwe> d;
      private final dhk e;
      @Nullable
      private jh f;
      @Nullable
      private bvm<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bwe> $$1, dho $$2, dhk $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bvm<?> $$0, jh $$1, dzi $$2) {
         this.f = $$1;
         this.g = $$0;
         dio.b $$3 = dhl.a($$1, $$2).b().a($$0);
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

      private void a(bwd $$0, dzi $$1) {
         bvm<?> $$2 = $$0.aq();
         jh $$3 = $$0.dv();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dio.b $$5 = dhl.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bwe $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dgg($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bwe> b() {
         return this.d;
      }

      boolean a(bwe $$0) {
         int $$1 = $$0.b() * this.a / dhl.e;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(bwe $$0, dgg $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
