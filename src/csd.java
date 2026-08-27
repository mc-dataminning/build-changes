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

public final class csd {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final blb[] f = Stream.of(blb.values()).filter($$0 -> $$0 != blb.h).toArray(blb[]::new);

   private csd() {
   }

   public static csd.d a(int $$0, Iterable<bki> $$1, csd.b $$2, csc $$3) {
      csg $$4 = new csg();
      Object2IntOpenHashMap<blb> $$5 = new Object2IntOpenHashMap();

      for (bki $$6 : $$1) {
         if ($$6 instanceof bla $$7 && ($$7.fL() || $$7.U())) {
            continue;
         }

         blb $$8 = $$6.ag().f();
         if ($$8 != blb.h) {
            ht $$9 = $$6.dl();
            $$2.query(cqz.a($$9), $$6x -> {
               ctc.b $$7 = a($$9, $$6x).b().a($$6.ag());
               if ($$7 != null) {
                  $$4.a($$6.dl(), $$7.b());
               }

               if ($$6 instanceof bla) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new csd.d($$0, $$5, $$4, $$3);
   }

   static csq a(ht $$0, dis $$1) {
      return $$1.getNoiseBiome(in.a($$0.u()), in.a($$0.v()), in.a($$0.w())).a();
   }

   public static void a(ama $$0, djd $$1, csd.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual ama.ad ()Lbfh;
      // 04: ldc "spawner"
      // 06: invokeinterface bfh.a (Ljava/lang/String;)V 2
      // 0b: getstatic csd.f [Lblb;
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
      // 2c: invokevirtual blb.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual blb.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual blb.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual djd.f ()Lcqz;
      // 53: invokevirtual csd$d.a (Lblb;Lcqz;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lcsd$d;)Lcsd$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbkm;Lht;Ldis;)Z, csd$d.a (Lbkm;Lht;Ldis;)Z, (Lbkm;Lht;Ldis;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lcsd$d;)Lcsd$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbla;Ldis;)V, csd$d.a (Lbla;Ldis;)V, (Lbla;Ldis;)V ]
      // 73: invokestatic csd.a (Lblb;Lama;Ldjd;Lcsd$c;Lcsd$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual ama.ad ()Lbfh;
      // 80: invokeinterface bfh.c ()V 1
      // 85: return
   }

   public static void a(blb $$0, ama $$1, djd $$2, csd.c $$3, csd.a $$4) {
      ht $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @auk
   public static void a(blb $$0, ama $$1, ht $$2) {
      a($$0, $$1, $$1.x($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(blb $$0, ama $$1, dis $$2, ht $$3, csd.c $$4, csd.a $$5) {
      csk $$6 = $$1.a();
      dit $$7 = $$1.k().g();
      int $$8 = $$3.v();
      dgw $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         ht.a $$10 = new ht.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            ctc.c $$16 = null;
            blr $$17 = null;
            int $$18 = ati.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cdm $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<ctc.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bla $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dl()), blc.a, $$17, null);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fI()) {
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

   private static boolean a(ama $$0, dis $$1, ht.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.R().a(new eji((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new cqz($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(ama $$0, blb $$1, csk $$2, dit $$3, ctc.c $$4, ht.a $$5, double $$6) {
      bkm<?> $$7 = $$4.b;
      if ($$7.f() == blb.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bls.c $$8 = bls.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bls.a($$7, $$0, blc.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bla a(ama $$0, bkm<?> $$1) {
      try {
         bki var3 = $$1.a((crs)$$0);
         if (var3 instanceof bla) {
            return (bla)var3;
         }

         c.warn("Can't spawn entity of type: {}", jy.h.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(ama $$0, bla $$1, double $$2) {
      return $$2 > (double)($$1.ag().f().f() * $$1.ag().f().f()) && $$1.h($$2) ? false : $$1.a($$0, blc.a) && $$1.a($$0);
   }

   private static Optional<ctc.c> a(ama $$0, csk $$1, dit $$2, blb $$3, ato $$4, ht $$5) {
      ib<csq> $$6 = $$0.s($$5);
      return $$3 == blb.g && $$6.a(arb.al) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(ama $$0, csk $$1, dit $$2, blb $$3, ctc.c $$4, ht $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bhe<ctc.c> a(ama $$0, csk $$1, dit $$2, blb $$3, ht $$4, @Nullable ib<csq> $$5) {
      return a($$4, $$0, $$3, $$1) ? dzb.d : $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
   }

   public static boolean a(ht $$0, ama $$1, blb $$2, csk $$3) {
      if ($$2 == blb.a && $$1.a_($$0.d()).a(cuv.fn)) {
         dwv $$4 = $$3.b().d(jz.aB).a(dwp.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static ht a(crs $$0, djd $$1) {
      cqz $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dmf.a.b, $$3, $$4) + 1;
      int $$6 = ati.b($$0.z, $$0.I_(), $$5);
      return new ht($$3, $$6, $$4);
   }

   public static boolean a(cqy $$0, ht $$1, dgw $$2, ecg $$3, bkm<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(arc.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bls.c $$0, crv $$1, ht $$2, @Nullable bkm<?> $$3) {
      if ($$0 == bls.c.c) {
         return true;
      } else if ($$3 != null && $$1.C_().a($$2)) {
         dgw $$4 = $$1.a_($$2);
         ecg $$5 = $$1.b_($$2);
         ht $$6 = $$2.c();
         ht $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(arh.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(arh.b);
            case a:
            default:
               dgw $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(csh $$0, ib<csq> $$1, cqz $$2, ato $$3) {
      ctc $$4 = $$1.a().b();
      bhe<ctc.c> $$5 = $$4.a(blb.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<ctc.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               ctc.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               blr $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     ht $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bls.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = ati.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = ati.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bls.a($$9.b, $$0, blc.b, ht.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        bki $$23;
                        try {
                           $$23 = $$9.b.a((crs)$$0.C());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bla $$26 && $$26.a($$0, blc.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dl()), blc.b, $$11, null);
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

   private static ht a(crv $$0, bkm<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bls.b($$1), $$2, $$3);
      ht.a $$5 = new ht.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(hx.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(hx.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.I_());
      }

      if (bls.a($$1) == bls.c.a) {
         ht $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, ecw.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bla var1, dis var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<djd> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bkm<?> var1, ht var2, dis var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<blb> b;
      private final csg c;
      private final Object2IntMap<blb> d;
      private final csc e;
      @Nullable
      private ht f;
      @Nullable
      private bkm<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<blb> $$1, csg $$2, csc $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bkm<?> $$0, ht $$1, dis $$2) {
         this.f = $$1;
         this.g = $$0;
         ctc.b $$3 = csd.a($$1, $$2).b().a($$0);
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

      private void a(bla $$0, dis $$1) {
         bkm<?> $$2 = $$0.ag();
         ht $$3 = $$0.dl();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            ctc.b $$5 = csd.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         blb $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new cqz($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<blb> b() {
         return this.d;
      }

      boolean a(blb $$0, cqz $$1) {
         int $$2 = $$0.b() * this.a / csd.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
