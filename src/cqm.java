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

public final class cqm {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bjp[] f = Stream.of(bjp.values()).filter($$0 -> $$0 != bjp.h).toArray(bjp[]::new);

   private cqm() {
   }

   public static cqm.d a(int $$0, Iterable<biw> $$1, cqm.b $$2, cql $$3) {
      cqp $$4 = new cqp();
      Object2IntOpenHashMap<bjp> $$5 = new Object2IntOpenHashMap();

      for (biw $$6 : $$1) {
         if ($$6 instanceof bjo $$7 && ($$7.fL() || $$7.U())) {
            continue;
         }

         bjp $$8 = $$6.ag().f();
         if ($$8 != bjp.h) {
            gw $$9 = $$6.dl();
            $$2.query(cpi.a($$9), $$6x -> {
               crl.b $$7 = a($$9, $$6x).b().a($$6.ag());
               if ($$7 != null) {
                  $$4.a($$6.dl(), $$7.b());
               }

               if ($$6 instanceof bjo) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new cqm.d($$0, $$5, $$4, $$3);
   }

   static cqz a(gw $$0, dgz $$1) {
      return $$1.getNoiseBiome(hp.a($$0.u()), hp.a($$0.v()), hp.a($$0.w())).a();
   }

   public static void a(akt $$0, dhk $$1, cqm.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual akt.ad ()Lbdv;
      // 04: ldc "spawner"
      // 06: invokeinterface bdv.a (Ljava/lang/String;)V 2
      // 0b: getstatic cqm.f [Lbjp;
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
      // 2c: invokevirtual bjp.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bjp.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bjp.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dhk.f ()Lcpi;
      // 53: invokevirtual cqm$d.a (Lbjp;Lcpi;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lcqm$d;)Lcqm$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbja;Lgw;Ldgz;)Z, cqm$d.a (Lbja;Lgw;Ldgz;)Z, (Lbja;Lgw;Ldgz;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lcqm$d;)Lcqm$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbjo;Ldgz;)V, cqm$d.a (Lbjo;Ldgz;)V, (Lbjo;Ldgz;)V ]
      // 73: invokestatic cqm.a (Lbjp;Lakt;Ldhk;Lcqm$c;Lcqm$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual akt.ad ()Lbdv;
      // 80: invokeinterface bdv.c ()V 1
      // 85: return
   }

   public static void a(bjp $$0, akt $$1, dhk $$2, cqm.c $$3, cqm.a $$4) {
      gw $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.H_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @atd
   public static void a(bjp $$0, akt $$1, gw $$2) {
      a($$0, $$1, $$1.x($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bjp $$0, akt $$1, dgz $$2, gw $$3, cqm.c $$4, cqm.a $$5) {
      cqt $$6 = $$1.a();
      dha $$7 = $$1.k().g();
      int $$8 = $$3.v();
      dfd $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         gw.a $$10 = new gw.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            crl.c $$16 = null;
            bkf $$17 = null;
            int $$18 = asb.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cca $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<crl.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bjo $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dl()), bjq.a, $$17, null);
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

   private static boolean a(akt $$0, dgz $$1, gw.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.R().a(new ehh((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new cpi($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(akt $$0, bjp $$1, cqt $$2, dha $$3, crl.c $$4, gw.a $$5, double $$6) {
      bja<?> $$7 = $$4.b;
      if ($$7.f() == bjp.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bkg.c $$8 = bkg.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bkg.a($$7, $$0, bjq.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bjo a(akt $$0, bja<?> $$1) {
      try {
         biw var3 = $$1.a((cqb)$$0);
         if (var3 instanceof bjo) {
            return (bjo)var3;
         }

         c.warn("Can't spawn entity of type: {}", jb.h.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(akt $$0, bjo $$1, double $$2) {
      return $$2 > (double)($$1.ag().f().f() * $$1.ag().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bjq.a) && $$1.a($$0);
   }

   private static Optional<crl.c> a(akt $$0, cqt $$1, dha $$2, bjp $$3, ash $$4, gw $$5) {
      he<cqz> $$6 = $$0.s($$5);
      return $$3 == bjp.g && $$6.a(apu.al) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(akt $$0, cqt $$1, dha $$2, bjp $$3, crl.c $$4, gw $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bfs<crl.c> a(akt $$0, cqt $$1, dha $$2, bjp $$3, gw $$4, @Nullable he<cqz> $$5) {
      return a($$4, $$0, $$3, $$1) ? dxb.d : $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
   }

   public static boolean a(gw $$0, akt $$1, bjp $$2, cqt $$3) {
      if ($$2 == bjp.a && $$1.a_($$0.d()).a(cte.fn)) {
         dvc $$4 = $$3.b().d(jc.aA).a(duw.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static gw a(cqb $$0, dhk $$1) {
      cpi $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dkm.a.b, $$3, $$4) + 1;
      int $$6 = asb.b($$0.z, $$0.H_(), $$5);
      return new gw($$3, $$6, $$4);
   }

   public static boolean a(cph $$0, gw $$1, dfd $$2, eag $$3, bja<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(apv.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bkg.c $$0, cqe $$1, gw $$2, @Nullable bja<?> $$3) {
      if ($$0 == bkg.c.c) {
         return true;
      } else if ($$3 != null && $$1.B_().a($$2)) {
         dfd $$4 = $$1.a_($$2);
         eag $$5 = $$1.b_($$2);
         gw $$6 = $$2.c();
         gw $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(aqa.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(aqa.b);
            case a:
            default:
               dfd $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(cqq $$0, he<cqz> $$1, cpi $$2, ash $$3) {
      crl $$4 = $$1.a().b();
      bfs<crl.c> $$5 = $$4.a(bjp.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<crl.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               crl.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bkf $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     gw $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bkg.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = asb.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = asb.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bkg.a($$9.b, $$0, bjq.b, gw.a($$21, (double)$$19.v(), $$22), $$0.D_())) {
                           continue;
                        }

                        biw $$23;
                        try {
                           $$23 = $$9.b.a((cqb)$$0.C());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bjo $$26 && $$26.a($$0, bjq.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dl()), bjq.b, $$11, null);
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

   private static gw a(cqe $$0, bja<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bkg.b($$1), $$2, $$3);
      gw.a $$5 = new gw.a($$2, $$4, $$3);
      if ($$0.C_().h()) {
         do {
            $$5.c(ha.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(ha.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.H_());
      }

      if (bkg.a($$1) == bkg.c.a) {
         gw $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, eaw.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bjo var1, dgz var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dhk> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bja<?> var1, gw var2, dgz var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bjp> b;
      private final cqp c;
      private final Object2IntMap<bjp> d;
      private final cql e;
      @Nullable
      private gw f;
      @Nullable
      private bja<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bjp> $$1, cqp $$2, cql $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bja<?> $$0, gw $$1, dgz $$2) {
         this.f = $$1;
         this.g = $$0;
         crl.b $$3 = cqm.a($$1, $$2).b().a($$0);
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

      private void a(bjo $$0, dgz $$1) {
         bja<?> $$2 = $$0.ag();
         gw $$3 = $$0.dl();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            crl.b $$5 = cqm.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bjp $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new cpi($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bjp> b() {
         return this.d;
      }

      boolean a(bjp $$0, cpi $$1) {
         int $$2 = $$0.b() * this.a / cqm.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
