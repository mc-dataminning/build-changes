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

public final class djs {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 24;
   public static final int a = 8;
   public static final int b = 128;
   public static final int c = azm.d(8.0F / azm.g);
   static final int f = (int)Math.pow(17.0, 2.0);
   private static final bxm[] g = Stream.of(bxm.values()).filter($$0 -> $$0 != bxm.h).toArray(bxm[]::new);

   private djs() {
   }

   public static djs.d a(int $$0, Iterable<bwi> $$1, djs.b $$2, djr $$3) {
      djv $$4 = new djv();
      Object2IntOpenHashMap<bxm> $$5 = new Object2IntOpenHashMap();

      for (bwi $$6 : $$1) {
         if ($$6 instanceof bxl $$7 && ($$7.gc() || $$7.Z())) {
            continue;
         }

         bxm $$8 = $$6.an().f();
         if ($$8 != bxm.h) {
            iv $$9 = $$6.du();
            $$2.query(dio.a($$9), $$6x -> {
               dkw.b $$7 = a($$9, $$6x).b().a($$6.an());
               if ($$7 != null) {
                  $$4.a($$6.du(), $$7.b());
               }

               if ($$6 instanceof bxl) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new djs.d($$0, $$5, $$4, $$3);
   }

   static dkk a(iv $$0, ecl $$1) {
      return $$1.getNoiseBiome(jq.a($$0.u()), jq.a($$0.v()), jq.a($$0.w())).a();
   }

   public static List<bxm> a(djs.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<bxm> $$4 = new ArrayList<>(g.length);

      for (bxm $$5 : g) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(arq $$0, ecv $$1, djs.d $$2, List<bxm> $$3) {
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
      // 00: invokestatic bqp.a ()Lbqq;
      // 03: astore 4
      // 05: aload 4
      // 07: ldc "spawner"
      // 09: invokeinterface bqq.a (Ljava/lang/String;)V 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 59
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast bxm
      // 2a: astore 6
      // 2c: aload 2
      // 2d: aload 6
      // 2f: aload 1
      // 30: invokevirtual ecv.f ()Ldio;
      // 33: invokevirtual djs$d.a (Lbxm;Ldio;)Z
      // 36: ifeq 56
      // 39: aload 6
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: dup
      // 3f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: invokedynamic test (Ldjs$d;)Ldjs$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbwr;Liv;Lecl;)Z, djs$d.a (Lbwr;Liv;Lecl;)Z, (Lbwr;Liv;Lecl;)Z ]
      // 48: aload 2
      // 49: dup
      // 4a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d: pop
      // 4e: invokedynamic run (Ldjs$d;)Ldjs$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbxl;Lecl;)V, djs$d.a (Lbxl;Lecl;)V, (Lbxl;Lecl;)V ]
      // 53: invokestatic djs.a (Lbxm;Larq;Lecv;Ldjs$c;Ldjs$a;)V
      // 56: goto 16
      // 59: aload 4
      // 5b: invokeinterface bqq.c ()V 1
      // 60: return
   }

   public static void a(bxm $$0, arq $$1, ecv $$2, djs.c $$3, djs.a $$4) {
      iv $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.G_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bav
   public static void a(bxm $$0, arq $$1, iv $$2) {
      a($$0, $$1, $$1.z($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bxm $$0, arq $$1, ecl $$2, iv $$3, djs.c $$4, djs.a $$5) {
      dkd $$6 = $$1.b();
      ecm $$7 = $$1.m().g();
      int $$8 = $$3.v();
      eao $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         iv.a $$10 = new iv.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dkw.c $$16 = null;
            byb $$17 = null;
            int $$18 = azm.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               crj $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.h($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dkw.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.b() + $$1.A.a(1 + $$16.c() - $$16.b());
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.a(), $$10, $$2)) {
                        bxl $$26 = a($$1, $$16.a());
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.du()), bwq.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fW()) {
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

   private static boolean a(arq $$0, ecl $$1, iv.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else if ($$0.aa().a(new fex((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)) {
         return false;
      } else {
         dio $$4 = new dio($$2);
         return Objects.equals($$4, $$1.f()) || $$0.c($$4);
      }
   }

   private static boolean a(arq $$0, bxm $$1, dkd $$2, ecm $$3, dkw.c $$4, iv.a $$5, double $$6) {
      bwr<?> $$7 = $$4.a();
      if ($$7.f() == bxm.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bye.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bye.a($$7, $$0, bwq.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bxl a(arq $$0, bwr<?> $$1) {
      try {
         bwi var3 = $$1.a($$0, bwq.a);
         if (var3 instanceof bxl) {
            return (bxl)var3;
         }

         d.warn("Can't spawn entity of type: {}", mg.f.b($$1));
      } catch (Exception var4) {
         d.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(arq $$0, bxl $$1, double $$2) {
      return $$2 > (double)($$1.an().f().f() * $$1.an().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bwq.a) && $$1.a((djk)$$0);
   }

   private static Optional<dkw.c> a(arq $$0, dkd $$1, ecm $$2, bxm $$3, azv $$4, iv $$5) {
      jf<dkk> $$6 = $$0.u($$5);
      return $$3 == bxm.g && $$6.a(axb.ao) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).a($$4);
   }

   private static boolean a(arq $$0, dkd $$1, ecm $$2, bxm $$3, dkw.c $$4, iv $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).b($$4);
   }

   private static bsq<dkw.c> a(arq $$0, dkd $$1, ecm $$2, bxm $$3, iv $$4, @Nullable jf<dkk> $$5) {
      return a($$4, $$0, $$3, $$1) ? etp.d : $$2.a($$5 != null ? $$5 : $$0.u($$4), $$1, $$3, $$4);
   }

   public static boolean a(iv $$0, arq $$1, bxm $$2, dkd $$3) {
      if ($$2 == bxm.a && $$1.a_($$0.e()).a(dmo.fM)) {
         eri $$4 = $$3.b().f(mh.be).c(erc.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static iv a(djh $$0, ecv $$1) {
      dio $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(egn.a.b, $$3, $$4) + 1;
      int $$6 = azm.b($$0.A, $$0.G_(), $$5);
      return new iv($$3, $$6, $$4);
   }

   public static boolean a(din $$0, iv $$1, eao $$2, ewv $$3, bwr<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(axc.aZ) ? false : !$$4.a($$2);
      }
   }

   public static void a(djy $$0, jf<dkk> $$1, dio $$2, azv $$3) {
      dkw $$4 = $$1.a().b();
      bsq<dkw.c> $$5 = $$4.a(bxm.b);
      if (!$$5.c()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dkw.c> $$8 = $$5.a($$3);
            if (!$$8.isEmpty()) {
               dkw.c $$9 = $$8.get();
               int $$10 = $$9.b() + $$3.a(1 + $$9.c() - $$9.b());
               byb $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     iv $$19 = a($$0, $$9.a(), $$12, $$13);
                     if ($$9.a().c() && bye.a($$9.a(), $$0, $$19)) {
                        float $$20 = $$9.a().l();
                        double $$21 = azm.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = azm.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.a().a($$21, (double)$$19.v(), $$22)) || !bye.a($$9.a(), $$0, bwq.b, iv.a($$21, (double)$$19.v(), $$22), $$0.C_())) {
                           continue;
                        }

                        bwi $$23;
                        try {
                           $$23 = $$9.a().a($$0.a(), bwq.a);
                        } catch (Exception var27) {
                           d.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bxl $$26 && $$26.a($$0, bwq.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.du()), bwq.b, $$11);
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

   private static iv a(djk $$0, bwr<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bye.b($$1), $$2, $$3);
      iv.a $$5 = new iv.a($$2, $$4, $$3);
      if ($$0.B_().h()) {
         do {
            $$5.c(jb.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jb.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.G_());
      }

      return bye.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bxl var1, ecl var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<ecv> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bwr<?> var1, iv var2, ecl var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bxm> b;
      private final djv c;
      private final Object2IntMap<bxm> d;
      private final djr e;
      @Nullable
      private iv f;
      @Nullable
      private bwr<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bxm> $$1, djv $$2, djr $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bwr<?> $$0, iv $$1, ecl $$2) {
         this.f = $$1;
         this.g = $$0;
         dkw.b $$3 = djs.a($$1, $$2).b().a($$0);
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

      private void a(bxl $$0, ecl $$1) {
         bwr<?> $$2 = $$0.an();
         iv $$3 = $$0.du();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dkw.b $$5 = djs.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bxm $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dio($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bxm> b() {
         return this.d;
      }

      boolean a(bxm $$0) {
         int $$1 = $$0.b() * this.a / djs.f;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(bxm $$0, dio $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
