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

public final class dku {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 24;
   public static final int a = 8;
   public static final int b = 128;
   public static final int c = azz.d(8.0F / azz.g);
   static final int f = (int)Math.pow(17.0, 2.0);
   private static final byi[] g = Stream.of(byi.values()).filter($$0 -> $$0 != byi.h).toArray(byi[]::new);

   private dku() {
   }

   public static dku.d a(int $$0, Iterable<bxe> $$1, dku.b $$2, dkt $$3) {
      dkx $$4 = new dkx();
      Object2IntOpenHashMap<byi> $$5 = new Object2IntOpenHashMap();

      for (bxe $$6 : $$1) {
         if ($$6 instanceof byh $$7 && ($$7.gd() || $$7.Y())) {
            continue;
         }

         byi $$8 = $$6.an().f();
         if ($$8 != byi.h) {
            iw $$9 = $$6.dv();
            $$2.query(djo.a($$9), $$6x -> {
               dly.b $$7 = a($$9, $$6x).b().a($$6.an());
               if ($$7 != null) {
                  $$4.a($$6.dv(), $$7.b());
               }

               if ($$6 instanceof byh) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dku.d($$0, $$5, $$4, $$3);
   }

   static dlm a(iw $$0, edn $$1) {
      return $$1.getNoiseBiome(jr.a($$0.u()), jr.a($$0.v()), jr.a($$0.w())).a();
   }

   public static List<byi> a(dku.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<byi> $$4 = new ArrayList<>(g.length);

      for (byi $$5 : g) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(asb $$0, edx $$1, dku.d $$2, List<byi> $$3) {
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
      // 00: invokestatic brl.a ()Lbrm;
      // 03: astore 4
      // 05: aload 4
      // 07: ldc "spawner"
      // 09: invokeinterface brm.a (Ljava/lang/String;)V 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 59
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast byi
      // 2a: astore 6
      // 2c: aload 2
      // 2d: aload 6
      // 2f: aload 1
      // 30: invokevirtual edx.f ()Ldjo;
      // 33: invokevirtual dku$d.a (Lbyi;Ldjo;)Z
      // 36: ifeq 56
      // 39: aload 6
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: dup
      // 3f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: invokedynamic test (Ldku$d;)Ldku$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbxn;Liw;Ledn;)Z, dku$d.a (Lbxn;Liw;Ledn;)Z, (Lbxn;Liw;Ledn;)Z ]
      // 48: aload 2
      // 49: dup
      // 4a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d: pop
      // 4e: invokedynamic run (Ldku$d;)Ldku$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbyh;Ledn;)V, dku$d.a (Lbyh;Ledn;)V, (Lbyh;Ledn;)V ]
      // 53: invokestatic dku.a (Lbyi;Lasb;Ledx;Ldku$c;Ldku$a;)V
      // 56: goto 16
      // 59: aload 4
      // 5b: invokeinterface brm.c ()V 1
      // 60: return
   }

   public static void a(byi $$0, asb $$1, edx $$2, dku.c $$3, dku.a $$4) {
      iw $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.K_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bbi
   public static void a(byi $$0, asb $$1, iw $$2) {
      a($$0, $$1, $$1.z($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(byi $$0, asb $$1, edn $$2, iw $$3, dku.c $$4, dku.a $$5) {
      dlf $$6 = $$1.b();
      edo $$7 = $$1.m().g();
      int $$8 = $$3.v();
      ebq $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         iw.a $$10 = new iw.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dly.c $$16 = null;
            byx $$17 = null;
            int $$18 = azz.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               csi $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.h($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dly.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.b() + $$1.A.a(1 + $$16.c() - $$16.b());
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.a(), $$10, $$2)) {
                        byh $$26 = a($$1, $$16.a());
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dv()), bxm.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fX()) {
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

   private static boolean a(asb $$0, edn $$1, iw.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else if ($$0.aa().a(new fgc((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)) {
         return false;
      } else {
         djo $$4 = new djo($$2);
         return Objects.equals($$4, $$1.f()) || $$0.c($$4);
      }
   }

   private static boolean a(asb $$0, byi $$1, dlf $$2, edo $$3, dly.c $$4, iw.a $$5, double $$6) {
      bxn<?> $$7 = $$4.a();
      if ($$7.f() == byi.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bza.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bza.a($$7, $$0, bxm.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static byh a(asb $$0, bxn<?> $$1) {
      try {
         bxe var3 = $$1.a($$0, bxm.a);
         if (var3 instanceof byh) {
            return (byh)var3;
         }

         d.warn("Can't spawn entity of type: {}", mh.f.b($$1));
      } catch (Exception var4) {
         d.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(asb $$0, byh $$1, double $$2) {
      return $$2 > (double)($$1.an().f().f() * $$1.an().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bxm.a) && $$1.a((dkm)$$0);
   }

   private static Optional<dly.c> a(asb $$0, dlf $$1, edo $$2, byi $$3, bai $$4, iw $$5) {
      jg<dlm> $$6 = $$0.u($$5);
      return $$3 == byi.g && $$6.a(axm.ao) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).a($$4);
   }

   private static boolean a(asb $$0, dlf $$1, edo $$2, byi $$3, dly.c $$4, iw $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).b($$4);
   }

   private static btm<dly.c> a(asb $$0, dlf $$1, edo $$2, byi $$3, iw $$4, @Nullable jg<dlm> $$5) {
      return a($$4, $$0, $$3, $$1) ? euu.d : $$2.a($$5 != null ? $$5 : $$0.u($$4), $$1, $$3, $$4);
   }

   public static boolean a(iw $$0, asb $$1, byi $$2, dlf $$3) {
      if ($$2 == byi.a && $$1.a_($$0.e()).a(dnq.fM)) {
         esn $$4 = $$3.b().f(mi.be).c(esh.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static iw a(dkj $$0, edx $$1) {
      djo $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(ehp.a.b, $$3, $$4) + 1;
      int $$6 = azz.b($$0.A, $$0.K_(), $$5);
      return new iw($$3, $$6, $$4);
   }

   public static boolean a(djn $$0, iw $$1, ebq $$2, eya $$3, bxn<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(axn.aZ) ? false : !$$4.a($$2);
      }
   }

   public static void a(dla $$0, jg<dlm> $$1, djo $$2, bai $$3) {
      dly $$4 = $$1.a().b();
      btm<dly.c> $$5 = $$4.a(byi.b);
      if (!$$5.c()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dly.c> $$8 = $$5.a($$3);
            if (!$$8.isEmpty()) {
               dly.c $$9 = $$8.get();
               int $$10 = $$9.b() + $$3.a(1 + $$9.c() - $$9.b());
               byx $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     iw $$19 = a($$0, $$9.a(), $$12, $$13);
                     if ($$9.a().c() && bza.a($$9.a(), $$0, $$19)) {
                        float $$20 = $$9.a().l();
                        double $$21 = azz.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = azz.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.a().a($$21, (double)$$19.v(), $$22)) || !bza.a($$9.a(), $$0, bxm.b, iw.a($$21, (double)$$19.v(), $$22), $$0.G_())) {
                           continue;
                        }

                        bxe $$23;
                        try {
                           $$23 = $$9.a().a($$0.a(), bxm.a);
                        } catch (Exception var27) {
                           d.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof byh $$26 && $$26.a($$0, bxm.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dv()), bxm.b, $$11);
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

   private static iw a(dkm $$0, bxn<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bza.b($$1), $$2, $$3);
      iw.a $$5 = new iw.a($$2, $$4, $$3);
      if ($$0.F_().h()) {
         do {
            $$5.c(jc.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jc.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.K_());
      }

      return bza.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(byh var1, edn var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<edx> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bxn<?> var1, iw var2, edn var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<byi> b;
      private final dkx c;
      private final Object2IntMap<byi> d;
      private final dkt e;
      @Nullable
      private iw f;
      @Nullable
      private bxn<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<byi> $$1, dkx $$2, dkt $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bxn<?> $$0, iw $$1, edn $$2) {
         this.f = $$1;
         this.g = $$0;
         dly.b $$3 = dku.a($$1, $$2).b().a($$0);
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

      private void a(byh $$0, edn $$1) {
         bxn<?> $$2 = $$0.an();
         iw $$3 = $$0.dv();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dly.b $$5 = dku.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         byi $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new djo($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<byi> b() {
         return this.d;
      }

      boolean a(byi $$0) {
         int $$1 = $$0.b() * this.a / dku.f;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(byi $$0, djo $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
