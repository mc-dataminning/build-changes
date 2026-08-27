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

public final class crk {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bkm[] f = Stream.of(bkm.values()).filter($$0 -> $$0 != bkm.h).toArray(bkm[]::new);

   private crk() {
   }

   public static crk.d a(int $$0, Iterable<bjt> $$1, crk.b $$2, crj $$3) {
      crn $$4 = new crn();
      Object2IntOpenHashMap<bkm> $$5 = new Object2IntOpenHashMap();

      for (bjt $$6 : $$1) {
         if ($$6 instanceof bkl $$7 && ($$7.fL() || $$7.U())) {
            continue;
         }

         bkm $$8 = $$6.ag().f();
         if ($$8 != bkm.h) {
            ht $$9 = $$6.dl();
            $$2.query(cqg.a($$9), $$6x -> {
               csj.b $$7 = a($$9, $$6x).b().a($$6.ag());
               if ($$7 != null) {
                  $$4.a($$6.dl(), $$7.b());
               }

               if ($$6 instanceof bkl) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new crk.d($$0, $$5, $$4, $$3);
   }

   static crx a(ht $$0, dhx $$1) {
      return $$1.getNoiseBiome(in.a($$0.u()), in.a($$0.v()), in.a($$0.w())).a();
   }

   public static void a(alq $$0, dii $$1, crk.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual alq.ad ()Lbes;
      // 04: ldc "spawner"
      // 06: invokeinterface bes.a (Ljava/lang/String;)V 2
      // 0b: getstatic crk.f [Lbkm;
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
      // 2c: invokevirtual bkm.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bkm.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bkm.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dii.f ()Lcqg;
      // 53: invokevirtual crk$d.a (Lbkm;Lcqg;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lcrk$d;)Lcrk$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbjx;Lht;Ldhx;)Z, crk$d.a (Lbjx;Lht;Ldhx;)Z, (Lbjx;Lht;Ldhx;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lcrk$d;)Lcrk$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbkl;Ldhx;)V, crk$d.a (Lbkl;Ldhx;)V, (Lbkl;Ldhx;)V ]
      // 73: invokestatic crk.a (Lbkm;Lalq;Ldii;Lcrk$c;Lcrk$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual alq.ad ()Lbes;
      // 80: invokeinterface bes.c ()V 1
      // 85: return
   }

   public static void a(bkm $$0, alq $$1, dii $$2, crk.c $$3, crk.a $$4) {
      ht $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @aua
   public static void a(bkm $$0, alq $$1, ht $$2) {
      a($$0, $$1, $$1.x($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bkm $$0, alq $$1, dhx $$2, ht $$3, crk.c $$4, crk.a $$5) {
      crr $$6 = $$1.a();
      dhy $$7 = $$1.k().g();
      int $$8 = $$3.v();
      dgb $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         ht.a $$10 = new ht.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            csj.c $$16 = null;
            blc $$17 = null;
            int $$18 = asy.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               ccx $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<csj.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bkl $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dl()), bkn.a, $$17, null);
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

   private static boolean a(alq $$0, dhx $$1, ht.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.R().a(new eif((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new cqg($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(alq $$0, bkm $$1, crr $$2, dhy $$3, csj.c $$4, ht.a $$5, double $$6) {
      bjx<?> $$7 = $$4.b;
      if ($$7.f() == bkm.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bld.c $$8 = bld.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bld.a($$7, $$0, bkn.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bkl a(alq $$0, bjx<?> $$1) {
      try {
         bjt var3 = $$1.a((cqz)$$0);
         if (var3 instanceof bkl) {
            return (bkl)var3;
         }

         c.warn("Can't spawn entity of type: {}", jy.h.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(alq $$0, bkl $$1, double $$2) {
      return $$2 > (double)($$1.ag().f().f() * $$1.ag().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bkn.a) && $$1.a($$0);
   }

   private static Optional<csj.c> a(alq $$0, crr $$1, dhy $$2, bkm $$3, ate $$4, ht $$5) {
      ib<crx> $$6 = $$0.s($$5);
      return $$3 == bkm.g && $$6.a(aqr.al) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(alq $$0, crr $$1, dhy $$2, bkm $$3, csj.c $$4, ht $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bgp<csj.c> a(alq $$0, crr $$1, dhy $$2, bkm $$3, ht $$4, @Nullable ib<crx> $$5) {
      return a($$4, $$0, $$3, $$1) ? dxz.d : $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
   }

   public static boolean a(ht $$0, alq $$1, bkm $$2, crr $$3) {
      if ($$2 == bkm.a && $$1.a_($$0.d()).a(cuc.fn)) {
         dwa $$4 = $$3.b().d(jz.aA).a(dvu.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static ht a(cqz $$0, dii $$1) {
      cqg $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dlk.a.b, $$3, $$4) + 1;
      int $$6 = asy.b($$0.z, $$0.I_(), $$5);
      return new ht($$3, $$6, $$4);
   }

   public static boolean a(cqf $$0, ht $$1, dgb $$2, ebe $$3, bjx<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(aqs.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bld.c $$0, crc $$1, ht $$2, @Nullable bjx<?> $$3) {
      if ($$0 == bld.c.c) {
         return true;
      } else if ($$3 != null && $$1.C_().a($$2)) {
         dgb $$4 = $$1.a_($$2);
         ebe $$5 = $$1.b_($$2);
         ht $$6 = $$2.c();
         ht $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(aqx.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(aqx.b);
            case a:
            default:
               dgb $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(cro $$0, ib<crx> $$1, cqg $$2, ate $$3) {
      csj $$4 = $$1.a().b();
      bgp<csj.c> $$5 = $$4.a(bkm.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<csj.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               csj.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               blc $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     ht $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bld.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = asy.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = asy.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bld.a($$9.b, $$0, bkn.b, ht.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        bjt $$23;
                        try {
                           $$23 = $$9.b.a((cqz)$$0.C());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bkl $$26 && $$26.a($$0, bkn.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dl()), bkn.b, $$11, null);
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

   private static ht a(crc $$0, bjx<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bld.b($$1), $$2, $$3);
      ht.a $$5 = new ht.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(hx.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(hx.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.I_());
      }

      if (bld.a($$1) == bld.c.a) {
         ht $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, ebu.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bkl var1, dhx var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dii> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bjx<?> var1, ht var2, dhx var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bkm> b;
      private final crn c;
      private final Object2IntMap<bkm> d;
      private final crj e;
      @Nullable
      private ht f;
      @Nullable
      private bjx<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bkm> $$1, crn $$2, crj $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bjx<?> $$0, ht $$1, dhx $$2) {
         this.f = $$1;
         this.g = $$0;
         csj.b $$3 = crk.a($$1, $$2).b().a($$0);
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

      private void a(bkl $$0, dhx $$1) {
         bjx<?> $$2 = $$0.ag();
         ht $$3 = $$0.dl();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            csj.b $$5 = crk.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bkm $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new cqg($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bkm> b() {
         return this.d;
      }

      boolean a(bkm $$0, cqg $$1) {
         int $$2 = $$0.b() * this.a / crk.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
