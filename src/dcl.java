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

public final class dcl {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bsr[] f = Stream.of(bsr.values()).filter($$0 -> $$0 != bsr.h).toArray(bsr[]::new);

   private dcl() {
   }

   public static dcl.d a(int $$0, Iterable<brv> $$1, dcl.b $$2, dck $$3) {
      dco $$4 = new dco();
      Object2IntOpenHashMap<bsr> $$5 = new Object2IntOpenHashMap();

      for (brv $$6 : $$1) {
         if ($$6 instanceof bsq $$7 && ($$7.ge() || $$7.V())) {
            continue;
         }

         bsr $$8 = $$6.ak().f();
         if ($$8 != bsr.h) {
            ir $$9 = $$6.du();
            $$2.query(dbh.a($$9), $$6x -> {
               ddl.b $$7 = a($$9, $$6x).b().a($$6.ak());
               if ($$7 != null) {
                  $$4.a($$6.du(), $$7.b());
               }

               if ($$6 instanceof bsq) {
                  $$3.a($$6x.g(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dcl.d($$0, $$5, $$4, $$3);
   }

   static dcz a(ir $$0, duy $$1) {
      return $$1.getNoiseBiome(jl.a($$0.u()), jl.a($$0.v()), jl.a($$0.w())).a();
   }

   public static void a(aqt $$0, dvi $$1, dcl.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual aqt.ag ()Lbmo;
      // 04: ldc "spawner"
      // 06: invokeinterface bmo.a (Ljava/lang/String;)V 2
      // 0b: getstatic dcl.f [Lbsr;
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
      // 2c: invokevirtual bsr.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bsr.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bsr.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dvi.g ()Ldbh;
      // 53: invokevirtual dcl$d.a (Lbsr;Ldbh;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Ldcl$d;)Ldcl$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbsb;Lir;Lduy;)Z, dcl$d.a (Lbsb;Lir;Lduy;)Z, (Lbsb;Lir;Lduy;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Ldcl$d;)Ldcl$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbsq;Lduy;)V, dcl$d.a (Lbsq;Lduy;)V, (Lbsq;Lduy;)V ]
      // 73: invokestatic dcl.a (Lbsr;Laqt;Ldvi;Ldcl$c;Ldcl$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual aqt.ag ()Lbmo;
      // 80: invokeinterface bmo.c ()V 1
      // 85: return
   }

   public static void a(bsr $$0, aqt $$1, dvi $$2, dcl.c $$3, dcl.a $$4) {
      ir $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.J_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @azp
   public static void a(bsr $$0, aqt $$1, ir $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bsr $$0, aqt $$1, duy $$2, ir $$3, dcl.c $$4, dcl.a $$5) {
      dct $$6 = $$1.a();
      duz $$7 = $$1.l().g();
      int $$8 = $$3.v();
      dtc $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         ir.a $$10 = new ir.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            ddl.c $$16 = null;
            btg $$17 = null;
            int $$18 = aym.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cly $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<ddl.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.A.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bsq $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.du()), bss.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.ad()) {
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

   private static boolean a(aqt $$0, duy $$1, ir.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.V().a(new ewu((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new dbh($$2), $$1.g()) || $$0.g($$2);
      }
   }

   private static boolean a(aqt $$0, bsr $$1, dct $$2, duz $$3, ddl.c $$4, ir.a $$5, double $$6) {
      bsb<?> $$7 = $$4.b;
      if ($$7.f() == bsr.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!btj.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !btj.a($$7, $$0, bss.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bsq a(aqt $$0, bsb<?> $$1) {
      try {
         brv var3 = $$1.a((dca)$$0);
         if (var3 instanceof bsq) {
            return (bsq)var3;
         }

         c.warn("Can't spawn entity of type: {}", lh.g.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(aqt $$0, bsq $$1, double $$2) {
      return $$2 > (double)($$1.ak().f().f() * $$1.ak().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bss.a) && $$1.a($$0);
   }

   private static Optional<ddl.c> a(aqt $$0, dct $$1, duz $$2, bsr $$3, ayt $$4, ir $$5) {
      ja<dcz> $$6 = $$0.t($$5);
      return $$3 == bsr.g && $$6.a(awd.aq) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(aqt $$0, dct $$1, duz $$2, bsr $$3, ddl.c $$4, ir $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static boo<ddl.c> a(aqt $$0, dct $$1, duz $$2, bsr $$3, ir $$4, @Nullable ja<dcz> $$5) {
      return a($$4, $$0, $$3, $$1) ? elz.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(ir $$0, aqt $$1, bsr $$2, dct $$3) {
      if ($$2 == bsr.a && $$1.a_($$0.d()).a(dfe.gf)) {
         ejt $$4 = $$3.b().d(li.aJ).a(ejn.p);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static ir a(dca $$0, dvi $$1) {
      dbh $$2 = $$1.g();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(dyu.a.b, $$3, $$4) + 1;
      int $$6 = aym.b($$0.A, $$0.J_(), $$5);
      return new ir($$3, $$6, $$4);
   }

   public static boolean a(dbg $$0, ir $$1, dtc $$2, epe $$3, bsb<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(awe.aZ) ? false : !$$4.a($$2);
      }
   }

   public static void a(dcp $$0, ja<dcz> $$1, dbh $$2, ayt $$3) {
      ddl $$4 = $$1.a().b();
      boo<ddl.c> $$5 = $$4.a(bsr.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<ddl.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               ddl.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               btg $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     ir $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && btj.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.k();
                        double $$21 = aym.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = aym.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !btj.a($$9.b, $$0, bss.b, ir.a($$21, (double)$$19.v(), $$22), $$0.F_())) {
                           continue;
                        }

                        brv $$23;
                        try {
                           $$23 = $$9.b.a((dca)$$0.E());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bsq $$26 && $$26.a($$0, bss.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.du()), bss.b, $$11);
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

   private static ir a(dcd $$0, bsb<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(btj.b($$1), $$2, $$3);
      ir.a $$5 = new ir.a($$2, $$4, $$3);
      if ($$0.E_().h()) {
         do {
            $$5.d(iw.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.d(iw.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.J_());
      }

      return btj.a($$1).a($$0, $$5.i());
   }

   @FunctionalInterface
   public interface a {
      void run(bsq var1, duy var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dvi> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bsb<?> var1, ir var2, duy var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bsr> b;
      private final dco c;
      private final Object2IntMap<bsr> d;
      private final dck e;
      @Nullable
      private ir f;
      @Nullable
      private bsb<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bsr> $$1, dco $$2, dck $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bsb<?> $$0, ir $$1, duy $$2) {
         this.f = $$1;
         this.g = $$0;
         ddl.b $$3 = dcl.a($$1, $$2).b().a($$0);
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

      private void a(bsq $$0, duy $$1) {
         bsb<?> $$2 = $$0.ak();
         ir $$3 = $$0.du();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            ddl.b $$5 = dcl.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bsr $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dbh($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bsr> b() {
         return this.d;
      }

      boolean a(bsr $$0, dbh $$1) {
         int $$2 = $$0.b() * this.a / dcl.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
