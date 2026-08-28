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

public final class djl {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 24;
   public static final int a = 8;
   public static final int b = 128;
   public static final int c = azm.d(8.0F / azm.g);
   static final int f = (int)Math.pow(17.0, 2.0);
   private static final bxh[] g = Stream.of(bxh.values()).filter($$0 -> $$0 != bxh.h).toArray(bxh[]::new);

   private djl() {
   }

   public static djl.d a(int $$0, Iterable<bwf> $$1, djl.b $$2, djk $$3) {
      djo $$4 = new djo();
      Object2IntOpenHashMap<bxh> $$5 = new Object2IntOpenHashMap();

      for (bwf $$6 : $$1) {
         if ($$6 instanceof bxg $$7 && ($$7.ga() || $$7.Z())) {
            continue;
         }

         bxh $$8 = $$6.aq().f();
         if ($$8 != bxh.h) {
            iu $$9 = $$6.dv();
            $$2.query(dih.a($$9), $$6x -> {
               dkp.b $$7 = a($$9, $$6x).b().a($$6.aq());
               if ($$7 != null) {
                  $$4.a($$6.dv(), $$7.b());
               }

               if ($$6 instanceof bxg) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new djl.d($$0, $$5, $$4, $$3);
   }

   static dkd a(iu $$0, ece $$1) {
      return $$1.getNoiseBiome(jp.a($$0.u()), jp.a($$0.v()), jp.a($$0.w())).a();
   }

   public static List<bxh> a(djl.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<bxh> $$4 = new ArrayList<>(g.length);

      for (bxh $$5 : g) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(arq $$0, eco $$1, djl.d $$2, List<bxh> $$3) {
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
      // 00: invokestatic bqn.a ()Lbqo;
      // 03: astore 4
      // 05: aload 4
      // 07: ldc "spawner"
      // 09: invokeinterface bqo.a (Ljava/lang/String;)V 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 59
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast bxh
      // 2a: astore 6
      // 2c: aload 2
      // 2d: aload 6
      // 2f: aload 1
      // 30: invokevirtual eco.f ()Ldih;
      // 33: invokevirtual djl$d.a (Lbxh;Ldih;)Z
      // 36: ifeq 56
      // 39: aload 6
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: dup
      // 3f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: invokedynamic test (Ldjl$d;)Ldjl$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbwo;Liu;Lece;)Z, djl$d.a (Lbwo;Liu;Lece;)Z, (Lbwo;Liu;Lece;)Z ]
      // 48: aload 2
      // 49: dup
      // 4a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d: pop
      // 4e: invokedynamic run (Ldjl$d;)Ldjl$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbxg;Lece;)V, djl$d.a (Lbxg;Lece;)V, (Lbxg;Lece;)V ]
      // 53: invokestatic djl.a (Lbxh;Larq;Leco;Ldjl$c;Ldjl$a;)V
      // 56: goto 16
      // 59: aload 4
      // 5b: invokeinterface bqo.c ()V 1
      // 60: return
   }

   public static void a(bxh $$0, arq $$1, eco $$2, djl.c $$3, djl.a $$4) {
      iu $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.G_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bav
   public static void a(bxh $$0, arq $$1, iu $$2) {
      a($$0, $$1, $$1.z($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bxh $$0, arq $$1, ece $$2, iu $$3, djl.c $$4, djl.a $$5) {
      djw $$6 = $$1.b();
      ecf $$7 = $$1.m().g();
      int $$8 = $$3.v();
      eah $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         iu.a $$10 = new iu.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dkp.c $$16 = null;
            bxw $$17 = null;
            int $$18 = azm.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               crc $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.h($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dkp.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.b() + $$1.A.a(1 + $$16.c() - $$16.b());
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.a(), $$10, $$2)) {
                        bxg $$26 = a($$1, $$16.a());
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dv()), bwn.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.ai()) {
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

   private static boolean a(arq $$0, ece $$1, iu.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else if ($$0.aa().a(new feq((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)) {
         return false;
      } else {
         dih $$4 = new dih($$2);
         return Objects.equals($$4, $$1.f()) || $$0.c($$4);
      }
   }

   private static boolean a(arq $$0, bxh $$1, djw $$2, ecf $$3, dkp.c $$4, iu.a $$5, double $$6) {
      bwo<?> $$7 = $$4.a();
      if ($$7.f() == bxh.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bxz.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bxz.a($$7, $$0, bwn.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bxg a(arq $$0, bwo<?> $$1) {
      try {
         bwf var3 = $$1.a($$0, bwn.a);
         if (var3 instanceof bxg) {
            return (bxg)var3;
         }

         d.warn("Can't spawn entity of type: {}", mf.f.b($$1));
      } catch (Exception var4) {
         d.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(arq $$0, bxg $$1, double $$2) {
      return $$2 > (double)($$1.aq().f().f() * $$1.aq().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bwn.a) && $$1.a((djd)$$0);
   }

   private static Optional<dkp.c> a(arq $$0, djw $$1, ecf $$2, bxh $$3, azv $$4, iu $$5) {
      je<dkd> $$6 = $$0.u($$5);
      return $$3 == bxh.g && $$6.a(axb.ao) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).a($$4);
   }

   private static boolean a(arq $$0, djw $$1, ecf $$2, bxh $$3, dkp.c $$4, iu $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).b($$4);
   }

   private static bso<dkp.c> a(arq $$0, djw $$1, ecf $$2, bxh $$3, iu $$4, @Nullable je<dkd> $$5) {
      return a($$4, $$0, $$3, $$1) ? eti.d : $$2.a($$5 != null ? $$5 : $$0.u($$4), $$1, $$3, $$4);
   }

   public static boolean a(iu $$0, arq $$1, bxh $$2, djw $$3) {
      if ($$2 == bxh.a && $$1.a_($$0.e()).a(dmh.fM)) {
         erb $$4 = $$3.b().f(mg.be).c(eqv.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static iu a(dja $$0, eco $$1) {
      dih $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(egg.a.b, $$3, $$4) + 1;
      int $$6 = azm.b($$0.A, $$0.G_(), $$5);
      return new iu($$3, $$6, $$4);
   }

   public static boolean a(dig $$0, iu $$1, eah $$2, ewo $$3, bwo<?> $$4) {
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

   public static void a(djr $$0, je<dkd> $$1, dih $$2, azv $$3) {
      dkp $$4 = $$1.a().b();
      bso<dkp.c> $$5 = $$4.a(bxh.b);
      if (!$$5.c()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dkp.c> $$8 = $$5.a($$3);
            if (!$$8.isEmpty()) {
               dkp.c $$9 = $$8.get();
               int $$10 = $$9.b() + $$3.a(1 + $$9.c() - $$9.b());
               bxw $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     iu $$19 = a($$0, $$9.a(), $$12, $$13);
                     if ($$9.a().c() && bxz.a($$9.a(), $$0, $$19)) {
                        float $$20 = $$9.a().l();
                        double $$21 = azm.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = azm.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.a().a($$21, (double)$$19.v(), $$22)) || !bxz.a($$9.a(), $$0, bwn.b, iu.a($$21, (double)$$19.v(), $$22), $$0.C_())) {
                           continue;
                        }

                        bwf $$23;
                        try {
                           $$23 = $$9.a().a($$0.a(), bwn.a);
                        } catch (Exception var27) {
                           d.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bxg $$26 && $$26.a($$0, bwn.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dv()), bwn.b, $$11);
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

   private static iu a(djd $$0, bwo<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bxz.b($$1), $$2, $$3);
      iu.a $$5 = new iu.a($$2, $$4, $$3);
      if ($$0.B_().h()) {
         do {
            $$5.c(ja.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(ja.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.G_());
      }

      return bxz.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bxg var1, ece var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<eco> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bwo<?> var1, iu var2, ece var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bxh> b;
      private final djo c;
      private final Object2IntMap<bxh> d;
      private final djk e;
      @Nullable
      private iu f;
      @Nullable
      private bwo<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bxh> $$1, djo $$2, djk $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bwo<?> $$0, iu $$1, ece $$2) {
         this.f = $$1;
         this.g = $$0;
         dkp.b $$3 = djl.a($$1, $$2).b().a($$0);
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

      private void a(bxg $$0, ece $$1) {
         bwo<?> $$2 = $$0.aq();
         iu $$3 = $$0.dv();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dkp.b $$5 = djl.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bxh $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dih($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bxh> b() {
         return this.d;
      }

      boolean a(bxh $$0) {
         int $$1 = $$0.b() * this.a / djl.f;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(bxh $$0, dih $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
