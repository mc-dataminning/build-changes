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

public final class dco {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final btb[] f = Stream.of(btb.values()).filter($$0 -> $$0 != btb.h).toArray(btb[]::new);

   private dco() {
   }

   public static dco.d a(int $$0, Iterable<bsd> $$1, dco.b $$2, dcn $$3) {
      dcr $$4 = new dcr();
      Object2IntOpenHashMap<btb> $$5 = new Object2IntOpenHashMap();

      for (bsd $$6 : $$1) {
         if ($$6 instanceof bta $$7 && ($$7.fS() || $$7.W())) {
            continue;
         }

         btb $$8 = $$6.ak().f();
         if ($$8 != btb.h) {
            ja $$9 = $$6.dp();
            $$2.query(dbk.a($$9), $$6x -> {
               ddp.b $$7 = a($$9, $$6x).b().a($$6.ak());
               if ($$7 != null) {
                  $$4.a($$6.dp(), $$7.b());
               }

               if ($$6 instanceof bta) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dco.d($$0, $$5, $$4, $$3);
   }

   static ddd a(ja $$0, dud $$1) {
      return $$1.getNoiseBiome(ju.a($$0.u()), ju.a($$0.v()), ju.a($$0.w())).a();
   }

   public static void a(aqk $$0, dun $$1, dco.d $$2, boolean $$3, boolean $$4, boolean $$5) {
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
      // 01: invokevirtual aqk.ag ()Lbmr;
      // 04: ldc "spawner"
      // 06: invokeinterface bmr.a (Ljava/lang/String;)V 2
      // 0b: getstatic dco.f [Lbtb;
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
      // 2c: invokevirtual btb.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual btb.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual btb.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dun.f ()Ldbk;
      // 53: invokevirtual dco$d.a (Lbtb;Ldbk;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Ldco$d;)Ldco$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbsj;Lja;Ldud;)Z, dco$d.a (Lbsj;Lja;Ldud;)Z, (Lbsj;Lja;Ldud;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Ldco$d;)Ldco$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbta;Ldud;)V, dco$d.a (Lbta;Ldud;)V, (Lbta;Ldud;)V ]
      // 73: invokestatic dco.a (Lbtb;Laqk;Ldun;Ldco$c;Ldco$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual aqk.ag ()Lbmr;
      // 80: invokeinterface bmr.c ()V 1
      // 85: return
   }

   public static void a(btb $$0, aqk $$1, dun $$2, dco.c $$3, dco.a $$4) {
      ja $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.I_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @azi
   public static void a(btb $$0, aqk $$1, ja $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(btb $$0, aqk $$1, dud $$2, ja $$3, dco.c $$4, dco.a $$5) {
      dcx $$6 = $$1.a();
      due $$7 = $$1.l().g();
      int $$8 = $$3.v();
      dsh $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         ja.a $$10 = new ja.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            ddp.c $$16 = null;
            btr $$17 = null;
            int $$18 = aye.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cmh $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<ddp.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bta $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dp()), btc.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fM()) {
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

   private static boolean a(aqk $$0, dud $$1, ja.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.V().a(new evz((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new dbk($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(aqk $$0, btb $$1, dcx $$2, due $$3, ddp.c $$4, ja.a $$5, double $$6) {
      bsj<?> $$7 = $$4.b;
      if ($$7.f() == btb.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!btu.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !btu.a($$7, $$0, btc.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bta a(aqk $$0, bsj<?> $$1) {
      try {
         bsd var3 = $$1.a((dcd)$$0);
         if (var3 instanceof bta) {
            return (bta)var3;
         }

         c.warn("Can't spawn entity of type: {}", lq.f.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(aqk $$0, bta $$1, double $$2) {
      return $$2 > (double)($$1.ak().f().f() * $$1.ak().f().f()) && $$1.h($$2) ? false : $$1.a($$0, btc.a) && $$1.a($$0);
   }

   private static Optional<ddp.c> a(aqk $$0, dcx $$1, due $$2, btb $$3, aym $$4, ja $$5) {
      jj<ddd> $$6 = $$0.t($$5);
      return $$3 == btb.g && $$6.a(avt.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(aqk $$0, dcx $$1, due $$2, btb $$3, ddp.c $$4, ja $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bor<ddp.c> a(aqk $$0, dcx $$1, due $$2, btb $$3, ja $$4, @Nullable jj<ddd> $$5) {
      return a($$4, $$0, $$3, $$1) ? ekw.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(ja $$0, aqk $$1, btb $$2, dcx $$3) {
      if ($$2 == btb.a && $$1.a_($$0.d()).a(dfh.fn)) {
         eiq $$4 = $$3.b().d(lr.aQ).a(eik.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static ja a(dcd $$0, dun $$1) {
      dbk $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dxz.a.b, $$3, $$4) + 1;
      int $$6 = aye.b($$0.z, $$0.I_(), $$5);
      return new ja($$3, $$6, $$4);
   }

   public static boolean a(dbj $$0, ja $$1, dsh $$2, eob $$3, bsj<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(avu.aX) ? false : !$$4.a($$2);
      }
   }

   public static void a(dcs $$0, jj<ddd> $$1, dbk $$2, aym $$3) {
      ddp $$4 = $$1.a().b();
      bor<ddp.c> $$5 = $$4.a(btb.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<ddp.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               ddp.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               btr $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     ja $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && btu.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = aye.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = aye.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !btu.a($$9.b, $$0, btc.b, ja.a($$21, (double)$$19.v(), $$22), $$0.E_())) {
                           continue;
                        }

                        bsd $$23;
                        try {
                           $$23 = $$9.b.a((dcd)$$0.E());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bta $$26 && $$26.a($$0, btc.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dp()), btc.b, $$11);
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

   private static ja a(dcg $$0, bsj<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(btu.b($$1), $$2, $$3);
      ja.a $$5 = new ja.a($$2, $$4, $$3);
      if ($$0.D_().h()) {
         do {
            $$5.c(jf.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(jf.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.I_());
      }

      return btu.a($$1).a($$0, $$5.i());
   }

   @FunctionalInterface
   public interface a {
      void run(bta var1, dud var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dun> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bsj<?> var1, ja var2, dud var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<btb> b;
      private final dcr c;
      private final Object2IntMap<btb> d;
      private final dcn e;
      @Nullable
      private ja f;
      @Nullable
      private bsj<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<btb> $$1, dcr $$2, dcn $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bsj<?> $$0, ja $$1, dud $$2) {
         this.f = $$1;
         this.g = $$0;
         ddp.b $$3 = dco.a($$1, $$2).b().a($$0);
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

      private void a(bta $$0, dud $$1) {
         bsj<?> $$2 = $$0.ak();
         ja $$3 = $$0.dp();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            ddp.b $$5 = dco.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         btb $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dbk($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<btb> b() {
         return this.d;
      }

      boolean a(btb $$0, dbk $$1) {
         int $$2 = $$0.b() * this.a / dco.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
