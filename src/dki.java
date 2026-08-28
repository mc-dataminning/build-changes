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

public final class dki {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 24;
   public static final int a = 8;
   public static final int b = 128;
   public static final int c = azo.d(8.0F / azo.g);
   static final int f = (int)Math.pow(17.0, 2.0);
   private static final bxx[] g = Stream.of(bxx.values()).filter($$0 -> $$0 != bxx.h).toArray(bxx[]::new);

   private dki() {
   }

   public static dki.d a(int $$0, Iterable<bwt> $$1, dki.b $$2, dkh $$3) {
      dkl $$4 = new dkl();
      Object2IntOpenHashMap<bxx> $$5 = new Object2IntOpenHashMap();

      for (bwt $$6 : $$1) {
         if ($$6 instanceof bxw $$7 && ($$7.gd() || $$7.Z())) {
            continue;
         }

         bxx $$8 = $$6.an().f();
         if ($$8 != bxx.h) {
            iv $$9 = $$6.dv();
            $$2.query(djc.a($$9), $$6x -> {
               dlm.b $$7 = a($$9, $$6x).b().a($$6.an());
               if ($$7 != null) {
                  $$4.a($$6.dv(), $$7.b());
               }

               if ($$6 instanceof bxw) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dki.d($$0, $$5, $$4, $$3);
   }

   static dla a(iv $$0, edb $$1) {
      return $$1.getNoiseBiome(jq.a($$0.u()), jq.a($$0.v()), jq.a($$0.w())).a();
   }

   public static List<bxx> a(dki.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<bxx> $$4 = new ArrayList<>(g.length);

      for (bxx $$5 : g) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(ars $$0, edl $$1, dki.d $$2, List<bxx> $$3) {
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
      // 00: invokestatic bra.a ()Lbrb;
      // 03: astore 4
      // 05: aload 4
      // 07: ldc "spawner"
      // 09: invokeinterface brb.a (Ljava/lang/String;)V 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 59
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast bxx
      // 2a: astore 6
      // 2c: aload 2
      // 2d: aload 6
      // 2f: aload 1
      // 30: invokevirtual edl.f ()Ldjc;
      // 33: invokevirtual dki$d.a (Lbxx;Ldjc;)Z
      // 36: ifeq 56
      // 39: aload 6
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: dup
      // 3f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: invokedynamic test (Ldki$d;)Ldki$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbxc;Liv;Ledb;)Z, dki$d.a (Lbxc;Liv;Ledb;)Z, (Lbxc;Liv;Ledb;)Z ]
      // 48: aload 2
      // 49: dup
      // 4a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d: pop
      // 4e: invokedynamic run (Ldki$d;)Ldki$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbxw;Ledb;)V, dki$d.a (Lbxw;Ledb;)V, (Lbxw;Ledb;)V ]
      // 53: invokestatic dki.a (Lbxx;Lars;Ledl;Ldki$c;Ldki$a;)V
      // 56: goto 16
      // 59: aload 4
      // 5b: invokeinterface brb.c ()V 1
      // 60: return
   }

   public static void a(bxx $$0, ars $$1, edl $$2, dki.c $$3, dki.a $$4) {
      iv $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.K_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bax
   public static void a(bxx $$0, ars $$1, iv $$2) {
      a($$0, $$1, $$1.z($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bxx $$0, ars $$1, edb $$2, iv $$3, dki.c $$4, dki.a $$5) {
      dkt $$6 = $$1.b();
      edc $$7 = $$1.m().g();
      int $$8 = $$3.v();
      ebe $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         iv.a $$10 = new iv.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dlm.c $$16 = null;
            bym $$17 = null;
            int $$18 = azo.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               crx $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.h($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<dlm.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.b() + $$1.A.a(1 + $$16.c() - $$16.b());
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.a(), $$10, $$2)) {
                        bxw $$26 = a($$1, $$16.a());
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dv()), bxb.a, $$17);
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

   private static boolean a(ars $$0, edb $$1, iv.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else if ($$0.aa().a(new ffq((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)) {
         return false;
      } else {
         djc $$4 = new djc($$2);
         return Objects.equals($$4, $$1.f()) || $$0.c($$4);
      }
   }

   private static boolean a(ars $$0, bxx $$1, dkt $$2, edc $$3, dlm.c $$4, iv.a $$5, double $$6) {
      bxc<?> $$7 = $$4.a();
      if ($$7.f() == bxx.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!byp.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !byp.a($$7, $$0, bxb.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bxw a(ars $$0, bxc<?> $$1) {
      try {
         bwt var3 = $$1.a($$0, bxb.a);
         if (var3 instanceof bxw) {
            return (bxw)var3;
         }

         d.warn("Can't spawn entity of type: {}", mg.f.b($$1));
      } catch (Exception var4) {
         d.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(ars $$0, bxw $$1, double $$2) {
      return $$2 > (double)($$1.an().f().f() * $$1.an().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bxb.a) && $$1.a((dka)$$0);
   }

   private static Optional<dlm.c> a(ars $$0, dkt $$1, edc $$2, bxx $$3, azx $$4, iv $$5) {
      jf<dla> $$6 = $$0.u($$5);
      return $$3 == bxx.g && $$6.a(axd.ao) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).a($$4);
   }

   private static boolean a(ars $$0, dkt $$1, edc $$2, bxx $$3, dlm.c $$4, iv $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).b($$4);
   }

   private static btb<dlm.c> a(ars $$0, dkt $$1, edc $$2, bxx $$3, iv $$4, @Nullable jf<dla> $$5) {
      return a($$4, $$0, $$3, $$1) ? eui.d : $$2.a($$5 != null ? $$5 : $$0.u($$4), $$1, $$3, $$4);
   }

   public static boolean a(iv $$0, ars $$1, bxx $$2, dkt $$3) {
      if ($$2 == bxx.a && $$1.a_($$0.e()).a(dne.fM)) {
         esb $$4 = $$3.b().f(mh.be).c(erv.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static iv a(djx $$0, edl $$1) {
      djc $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(ehd.a.b, $$3, $$4) + 1;
      int $$6 = azo.b($$0.A, $$0.K_(), $$5);
      return new iv($$3, $$6, $$4);
   }

   public static boolean a(djb $$0, iv $$1, ebe $$2, exo $$3, bxc<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(axe.aZ) ? false : !$$4.a($$2);
      }
   }

   public static void a(dko $$0, jf<dla> $$1, djc $$2, azx $$3) {
      dlm $$4 = $$1.a().b();
      btb<dlm.c> $$5 = $$4.a(bxx.b);
      if (!$$5.c()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<dlm.c> $$8 = $$5.a($$3);
            if (!$$8.isEmpty()) {
               dlm.c $$9 = $$8.get();
               int $$10 = $$9.b() + $$3.a(1 + $$9.c() - $$9.b());
               bym $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     iv $$19 = a($$0, $$9.a(), $$12, $$13);
                     if ($$9.a().c() && byp.a($$9.a(), $$0, $$19)) {
                        float $$20 = $$9.a().l();
                        double $$21 = azo.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = azo.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.a().a($$21, (double)$$19.v(), $$22)) || !byp.a($$9.a(), $$0, bxb.b, iv.a($$21, (double)$$19.v(), $$22), $$0.G_())) {
                           continue;
                        }

                        bwt $$23;
                        try {
                           $$23 = $$9.a().a($$0.a(), bxb.a);
                        } catch (Exception var27) {
                           d.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bxw $$26 && $$26.a($$0, bxb.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dv()), bxb.b, $$11);
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

   private static iv a(dka $$0, bxc<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(byp.b($$1), $$2, $$3);
      iv.a $$5 = new iv.a($$2, $$4, $$3);
      if ($$0.F_().h()) {
         do {
            $$5.c(jb.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jb.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.K_());
      }

      return byp.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bxw var1, edb var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<edl> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bxc<?> var1, iv var2, edb var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bxx> b;
      private final dkl c;
      private final Object2IntMap<bxx> d;
      private final dkh e;
      @Nullable
      private iv f;
      @Nullable
      private bxc<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bxx> $$1, dkl $$2, dkh $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bxc<?> $$0, iv $$1, edb $$2) {
         this.f = $$1;
         this.g = $$0;
         dlm.b $$3 = dki.a($$1, $$2).b().a($$0);
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

      private void a(bxw $$0, edb $$1) {
         bxc<?> $$2 = $$0.an();
         iv $$3 = $$0.dv();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            dlm.b $$5 = dki.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bxx $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new djc($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bxx> b() {
         return this.d;
      }

      boolean a(bxx $$0) {
         int $$1 = $$0.b() * this.a / dki.f;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(bxx $$0, djc $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
