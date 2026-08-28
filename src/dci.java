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

public final class dci {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final btr[] f = Stream.of(btr.values()).filter($$0 -> $$0 != btr.h).toArray(btr[]::new);

   private dci() {
   }

   public static dci.d a(int $$0, Iterable<bst> $$1, dci.b $$2, dch $$3) {
      dcl $$4 = new dcl();
      Object2IntOpenHashMap<btr> $$5 = new Object2IntOpenHashMap();

      for (bst $$6 : $$1) {
         if ($$6 instanceof btq $$7 && ($$7.fW() || $$7.W())) {
            continue;
         }

         btr $$8 = $$6.ak().f();
         if ($$8 != btr.h) {
            iz $$9 = $$6.dp();
            $$2.query(dbe.a($$9), $$6x -> {
               ddi.b $$7 = a($$9, $$6x).b().a($$6.ak());
               if ($$7 != null) {
                  $$4.a($$6.dp(), $$7.b());
               }

               if ($$6 instanceof btq) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dci.d($$0, $$5, $$4, $$3);
   }

   static dcw a(iz $$0, dtx $$1) {
      return $$1.getNoiseBiome(jt.a($$0.u()), jt.a($$0.v()), jt.a($$0.w())).a();
   }

   public static void a(are $$0, duh $$1, dci.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual are.ag ()Lbnh;
      // 04: ldc "spawner"
      // 06: invokeinterface bnh.a (Ljava/lang/String;)V 2
      // 0b: getstatic dci.f [Lbtr;
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
      // 2c: invokevirtual btr.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual btr.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual btr.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual duh.f ()Ldbe;
      // 53: invokevirtual dci$d.a (Lbtr;Ldbe;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Ldci$d;)Ldci$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbsz;Liz;Ldtx;)Z, dci$d.a (Lbsz;Liz;Ldtx;)Z, (Lbsz;Liz;Ldtx;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Ldci$d;)Ldci$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbtq;Ldtx;)V, dci$d.a (Lbtq;Ldtx;)V, (Lbtq;Ldtx;)V ]
      // 73: invokestatic dci.a (Lbtr;Lare;Lduh;Ldci$c;Ldci$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual are.ag ()Lbnh;
      // 80: invokeinterface bnh.c ()V 1
      // 85: return
   }

   public static void a(btr $$0, are $$1, duh $$2, dci.c $$3, dci.a $$4) {
      iz $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bac
   public static void a(btr $$0, are $$1, iz $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(btr $$0, are $$1, dtx $$2, iz $$3, dci.c $$4, dci.a $$5) {
      dcq $$6 = $$1.a();
      dty $$7 = $$1.l().g();
      int $$8 = $$3.v();
      dsb $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         iz.a $$10 = new iz.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            ddi.c $$16 = null;
            buh $$17 = null;
            int $$18 = ayy.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cmw $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<ddi.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        btq $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dp()), bts.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fQ()) {
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

   private static boolean a(are $$0, dtx $$1, iz.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.V().a(new evq((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new dbe($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(are $$0, btr $$1, dcq $$2, dty $$3, ddi.c $$4, iz.a $$5, double $$6) {
      bsz<?> $$7 = $$4.b;
      if ($$7.f() == btr.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!buk.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !buk.a($$7, $$0, bts.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static btq a(are $$0, bsz<?> $$1) {
      try {
         bst var3 = $$1.a((dbx)$$0);
         if (var3 instanceof btq) {
            return (btq)var3;
         }

         c.warn("Can't spawn entity of type: {}", lp.g.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(are $$0, btq $$1, double $$2) {
      return $$2 > (double)($$1.ak().f().f() * $$1.ak().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bts.a) && $$1.a($$0);
   }

   private static Optional<ddi.c> a(are $$0, dcq $$1, dty $$2, btr $$3, azg $$4, iz $$5) {
      ji<dcw> $$6 = $$0.t($$5);
      return $$3 == btr.g && $$6.a(awn.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(are $$0, dcq $$1, dty $$2, btr $$3, ddi.c $$4, iz $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bph<ddi.c> a(are $$0, dcq $$1, dty $$2, btr $$3, iz $$4, @Nullable ji<dcw> $$5) {
      return a($$4, $$0, $$3, $$1) ? ekp.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(iz $$0, are $$1, btr $$2, dcq $$3) {
      if ($$2 == btr.a && $$1.a_($$0.d()).a(dfa.fn)) {
         eij $$4 = $$3.b().d(lq.aJ).a(eid.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static iz a(dbx $$0, duh $$1) {
      dbe $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dxt.a.b, $$3, $$4) + 1;
      int $$6 = ayy.b($$0.z, $$0.I_(), $$5);
      return new iz($$3, $$6, $$4);
   }

   public static boolean a(dbd $$0, iz $$1, dsb $$2, enu $$3, bsz<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(awo.aX) ? false : !$$4.a($$2);
      }
   }

   public static void a(dcm $$0, ji<dcw> $$1, dbe $$2, azg $$3) {
      ddi $$4 = $$1.a().b();
      bph<ddi.c> $$5 = $$4.a(btr.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<ddi.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               ddi.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               buh $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     iz $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && buk.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = ayy.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = ayy.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !buk.a($$9.b, $$0, bts.b, iz.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        bst $$23;
                        try {
                           $$23 = $$9.b.a((dbx)$$0.E());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof btq $$26 && $$26.a($$0, bts.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dp()), bts.b, $$11);
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

   private static iz a(dca $$0, bsz<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(buk.b($$1), $$2, $$3);
      iz.a $$5 = new iz.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(je.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(je.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.I_());
      }

      return buk.a($$1).a($$0, $$5.i());
   }

   @FunctionalInterface
   public interface a {
      void run(btq var1, dtx var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<duh> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bsz<?> var1, iz var2, dtx var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<btr> b;
      private final dcl c;
      private final Object2IntMap<btr> d;
      private final dch e;
      @Nullable
      private iz f;
      @Nullable
      private bsz<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<btr> $$1, dcl $$2, dch $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bsz<?> $$0, iz $$1, dtx $$2) {
         this.f = $$1;
         this.g = $$0;
         ddi.b $$3 = dci.a($$1, $$2).b().a($$0);
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

      private void a(btq $$0, dtx $$1) {
         bsz<?> $$2 = $$0.ak();
         iz $$3 = $$0.dp();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            ddi.b $$5 = dci.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         btr $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dbe($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<btr> b() {
         return this.d;
      }

      boolean a(btr $$0, dbe $$1) {
         int $$2 = $$0.b() * this.a / dci.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
