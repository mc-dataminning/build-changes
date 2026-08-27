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

public final class csl {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final blj[] f = Stream.of(blj.values()).filter($$0 -> $$0 != blj.h).toArray(blj[]::new);

   private csl() {
   }

   public static csl.d a(int $$0, Iterable<bkq> $$1, csl.b $$2, csk $$3) {
      cso $$4 = new cso();
      Object2IntOpenHashMap<blj> $$5 = new Object2IntOpenHashMap();

      for (bkq $$6 : $$1) {
         if ($$6 instanceof bli $$7 && ($$7.fM() || $$7.W())) {
            continue;
         }

         blj $$8 = $$6.ai().f();
         if ($$8 != blj.h) {
            ht $$9 = $$6.dn();
            $$2.query(crh.a($$9), $$6x -> {
               ctk.b $$7 = a($$9, $$6x).b().a($$6.ai());
               if ($$7 != null) {
                  $$4.a($$6.dn(), $$7.b());
               }

               if ($$6 instanceof bli) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new csl.d($$0, $$5, $$4, $$3);
   }

   static csy a(ht $$0, dje $$1) {
      return $$1.getNoiseBiome(in.a($$0.u()), in.a($$0.v()), in.a($$0.w())).a();
   }

   public static void a(ame $$0, djp $$1, csl.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual ame.ae ()Lbfo;
      // 04: ldc "spawner"
      // 06: invokeinterface bfo.a (Ljava/lang/String;)V 2
      // 0b: getstatic csl.f [Lblj;
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
      // 2c: invokevirtual blj.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual blj.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual blj.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual djp.f ()Lcrh;
      // 53: invokevirtual csl$d.a (Lblj;Lcrh;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lcsl$d;)Lcsl$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbku;Lht;Ldje;)Z, csl$d.a (Lbku;Lht;Ldje;)Z, (Lbku;Lht;Ldje;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lcsl$d;)Lcsl$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbli;Ldje;)V, csl$d.a (Lbli;Ldje;)V, (Lbli;Ldje;)V ]
      // 73: invokestatic csl.a (Lblj;Lame;Ldjp;Lcsl$c;Lcsl$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual ame.ae ()Lbfo;
      // 80: invokeinterface bfo.c ()V 1
      // 85: return
   }

   public static void a(blj $$0, ame $$1, djp $$2, csl.c $$3, csl.a $$4) {
      ht $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @aup
   public static void a(blj $$0, ame $$1, ht $$2) {
      a($$0, $$1, $$1.x($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(blj $$0, ame $$1, dje $$2, ht $$3, csl.c $$4, csl.a $$5) {
      css $$6 = $$1.a();
      djf $$7 = $$1.k().g();
      int $$8 = $$3.v();
      dhi $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         ht.a $$10 = new ht.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            ctk.c $$16 = null;
            blz $$17 = null;
            int $$18 = atm.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cdu $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<ctk.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bli $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dn()), blk.a, $$17, null);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fJ()) {
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

   private static boolean a(ame $$0, dje $$1, ht.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.S().a(new eju((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new crh($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(ame $$0, blj $$1, css $$2, djf $$3, ctk.c $$4, ht.a $$5, double $$6) {
      bku<?> $$7 = $$4.b;
      if ($$7.f() == blj.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bma.c $$8 = bma.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bma.a($$7, $$0, blk.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bli a(ame $$0, bku<?> $$1) {
      try {
         bkq var3 = $$1.a((csa)$$0);
         if (var3 instanceof bli) {
            return (bli)var3;
         }

         c.warn("Can't spawn entity of type: {}", jy.h.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(ame $$0, bli $$1, double $$2) {
      return $$2 > (double)($$1.ai().f().f() * $$1.ai().f().f()) && $$1.h($$2) ? false : $$1.a($$0, blk.a) && $$1.a($$0);
   }

   private static Optional<ctk.c> a(ame $$0, css $$1, djf $$2, blj $$3, ats $$4, ht $$5) {
      ib<csy> $$6 = $$0.s($$5);
      return $$3 == blj.g && $$6.a(arf.al) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(ame $$0, css $$1, djf $$2, blj $$3, ctk.c $$4, ht $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bhl<ctk.c> a(ame $$0, css $$1, djf $$2, blj $$3, ht $$4, @Nullable ib<csy> $$5) {
      return a($$4, $$0, $$3, $$1) ? dzn.d : $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
   }

   public static boolean a(ht $$0, ame $$1, blj $$2, css $$3) {
      if ($$2 == blj.a && $$1.a_($$0.d()).a(cvc.fn)) {
         dxh $$4 = $$3.b().d(jz.aB).a(dxb.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static ht a(csa $$0, djp $$1) {
      crh $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dmr.a.b, $$3, $$4) + 1;
      int $$6 = atm.b($$0.z, $$0.I_(), $$5);
      return new ht($$3, $$6, $$4);
   }

   public static boolean a(crg $$0, ht $$1, dhi $$2, ecs $$3, bku<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(arg.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bma.c $$0, csd $$1, ht $$2, @Nullable bku<?> $$3) {
      if ($$0 == bma.c.c) {
         return true;
      } else if ($$3 != null && $$1.C_().a($$2)) {
         dhi $$4 = $$1.a_($$2);
         ecs $$5 = $$1.b_($$2);
         ht $$6 = $$2.c();
         ht $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(arl.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(arl.b);
            case a:
            default:
               dhi $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(csp $$0, ib<csy> $$1, crh $$2, ats $$3) {
      ctk $$4 = $$1.a().b();
      bhl<ctk.c> $$5 = $$4.a(blj.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<ctk.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               ctk.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               blz $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     ht $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bma.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = atm.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = atm.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bma.a($$9.b, $$0, blk.b, ht.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        bkq $$23;
                        try {
                           $$23 = $$9.b.a((csa)$$0.D());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bli $$26 && $$26.a($$0, blk.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dn()), blk.b, $$11, null);
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

   private static ht a(csd $$0, bku<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bma.b($$1), $$2, $$3);
      ht.a $$5 = new ht.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(hx.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(hx.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.I_());
      }

      if (bma.a($$1) == bma.c.a) {
         ht $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, edi.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(bli var1, dje var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<djp> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bku<?> var1, ht var2, dje var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<blj> b;
      private final cso c;
      private final Object2IntMap<blj> d;
      private final csk e;
      @Nullable
      private ht f;
      @Nullable
      private bku<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<blj> $$1, cso $$2, csk $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bku<?> $$0, ht $$1, dje $$2) {
         this.f = $$1;
         this.g = $$0;
         ctk.b $$3 = csl.a($$1, $$2).b().a($$0);
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

      private void a(bli $$0, dje $$1) {
         bku<?> $$2 = $$0.ai();
         ht $$3 = $$0.dn();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            ctk.b $$5 = csl.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         blj $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new crh($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<blj> b() {
         return this.d;
      }

      boolean a(blj $$0, crh $$1) {
         int $$2 = $$0.b() * this.a / csl.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
