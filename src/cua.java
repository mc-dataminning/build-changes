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

public final class cua {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bmo[] f = Stream.of(bmo.values()).filter($$0 -> $$0 != bmo.h).toArray(bmo[]::new);

   private cua() {
   }

   public static cua.d a(int $$0, Iterable<blv> $$1, cua.b $$2, ctz $$3) {
      cud $$4 = new cud();
      Object2IntOpenHashMap<bmo> $$5 = new Object2IntOpenHashMap();

      for (blv $$6 : $$1) {
         if ($$6 instanceof bmn $$7 && ($$7.fL() || $$7.W())) {
            continue;
         }

         bmo $$8 = $$6.ai().f();
         if ($$8 != bmo.h) {
            hx $$9 = $$6.dm();
            $$2.query(csw.a($$9), $$6x -> {
               cva.b $$7 = a($$9, $$6x).b().a($$6.ai());
               if ($$7 != null) {
                  $$4.a($$6.dm(), $$7.b());
               }

               if ($$6 instanceof bmn) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new cua.d($$0, $$5, $$4, $$3);
   }

   static cuo a(hx $$0, dld $$1) {
      return $$1.getNoiseBiome(is.a($$0.u()), is.a($$0.v()), is.a($$0.w())).a();
   }

   public static void a(and $$0, dlo $$1, cua.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual and.af ()Lbgs;
      // 04: ldc "spawner"
      // 06: invokeinterface bgs.a (Ljava/lang/String;)V 2
      // 0b: getstatic cua.f [Lbmo;
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
      // 2c: invokevirtual bmo.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bmo.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bmo.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dlo.f ()Lcsw;
      // 53: invokevirtual cua$d.a (Lbmo;Lcsw;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lcua$d;)Lcua$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lblz;Lhx;Ldld;)Z, cua$d.a (Lblz;Lhx;Ldld;)Z, (Lblz;Lhx;Ldld;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lcua$d;)Lcua$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbmn;Ldld;)V, cua$d.a (Lbmn;Ldld;)V, (Lbmn;Ldld;)V ]
      // 73: invokestatic cua.a (Lbmo;Land;Ldlo;Lcua$c;Lcua$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual and.af ()Lbgs;
      // 80: invokeinterface bgs.c ()V 1
      // 85: return
   }

   public static void a(bmo $$0, and $$1, dlo $$2, cua.c $$3, cua.a $$4) {
      hx $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.J_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @avt
   public static void a(bmo $$0, and $$1, hx $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bmo $$0, and $$1, dld $$2, hx $$3, cua.c $$4, cua.a $$5) {
      cui $$6 = $$1.a();
      dle $$7 = $$1.l().g();
      int $$8 = $$3.v();
      djh $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         hx.a $$10 = new hx.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            cva.c $$16 = null;
            bne $$17 = null;
            int $$18 = auo.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cfi $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<cva.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bmn $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dm()), bmp.a, $$17, null);
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

   private static boolean a(and $$0, dld $$1, hx.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.T().a(new elt((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new csw($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(and $$0, bmo $$1, cui $$2, dle $$3, cva.c $$4, hx.a $$5, double $$6) {
      blz<?> $$7 = $$4.b;
      if ($$7.f() == bmo.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bnf.c $$8 = bnf.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bnf.a($$7, $$0, bmp.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bmn a(and $$0, blz<?> $$1) {
      try {
         blv var3 = $$1.a((ctp)$$0);
         if (var3 instanceof bmn) {
            return (bmn)var3;
         }

         c.warn("Can't spawn entity of type: {}", kd.g.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(and $$0, bmn $$1, double $$2) {
      return $$2 > (double)($$1.ai().f().f() * $$1.ai().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bmp.a) && $$1.a($$0);
   }

   private static Optional<cva.c> a(and $$0, cui $$1, dle $$2, bmo $$3, auv $$4, hx $$5) {
      ih<cuo> $$6 = $$0.t($$5);
      return $$3 == bmo.g && $$6.a(asg.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(and $$0, cui $$1, dle $$2, bmo $$3, cva.c $$4, hx $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bip<cva.c> a(and $$0, cui $$1, dle $$2, bmo $$3, hx $$4, @Nullable ih<cuo> $$5) {
      return a($$4, $$0, $$3, $$1) ? ebm.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(hx $$0, and $$1, bmo $$2, cui $$3) {
      if ($$2 == bmo.a && $$1.a_($$0.d()).a(cws.fn)) {
         dzg $$4 = $$3.b().d(ke.aD).a(dza.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static hx a(ctp $$0, dlo $$1) {
      csw $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(doq.a.b, $$3, $$4) + 1;
      int $$6 = auo.b($$0.z, $$0.J_(), $$5);
      return new hx($$3, $$6, $$4);
   }

   public static boolean a(csv $$0, hx $$1, djh $$2, eer $$3, blz<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(ash.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bnf.c $$0, cts $$1, hx $$2, @Nullable blz<?> $$3) {
      if ($$0 == bnf.c.c) {
         return true;
      } else if ($$3 != null && $$1.D_().a($$2)) {
         djh $$4 = $$1.a_($$2);
         eer $$5 = $$1.b_($$2);
         hx $$6 = $$2.c();
         hx $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(asm.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(asm.b);
            case a:
            default:
               djh $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(cue $$0, ih<cuo> $$1, csw $$2, auv $$3) {
      cva $$4 = $$1.a().b();
      bip<cva.c> $$5 = $$4.a(bmo.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<cva.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               cva.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bne $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     hx $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bnf.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = auo.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = auo.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bnf.a($$9.b, $$0, bmp.b, hx.a($$21, (double)$$19.v(), $$22), $$0.F_())) {
                           continue;
                        }

                        blv $$23;
                        try {
                           $$23 = $$9.b.a((ctp)$$0.E());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bmn $$26 && $$26.a($$0, bmp.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dm()), bmp.b, $$11, null);
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

   private static hx a(cts $$0, blz<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bnf.b($$1), $$2, $$3);
      hx.a $$5 = new hx.a($$2, $$4, $$3);
      if ($$0.E_().h()) {
         do {
            $$5.c(ic.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(ic.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.J_());
      }

      if (bnf.a($$1) == bnf.c.a) {
         hx $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, efh.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bmn var1, dld var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dlo> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(blz<?> var1, hx var2, dld var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bmo> b;
      private final cud c;
      private final Object2IntMap<bmo> d;
      private final ctz e;
      @Nullable
      private hx f;
      @Nullable
      private blz<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bmo> $$1, cud $$2, ctz $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(blz<?> $$0, hx $$1, dld $$2) {
         this.f = $$1;
         this.g = $$0;
         cva.b $$3 = cua.a($$1, $$2).b().a($$0);
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

      private void a(bmn $$0, dld $$1) {
         blz<?> $$2 = $$0.ai();
         hx $$3 = $$0.dm();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            cva.b $$5 = cua.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bmo $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new csw($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bmo> b() {
         return this.d;
      }

      boolean a(bmo $$0, csw $$1) {
         int $$2 = $$0.b() * this.a / cua.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
