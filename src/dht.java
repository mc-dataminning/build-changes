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

public final class dht {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bwj[] f = Stream.of(bwj.values()).filter($$0 -> $$0 != bwj.h).toArray(bwj[]::new);

   private dht() {
   }

   public static dht.d a(int $$0, Iterable<bvk> $$1, dht.b $$2, dhs $$3) {
      dhw $$4 = new dhw();
      Object2IntOpenHashMap<bwj> $$5 = new Object2IntOpenHashMap();

      for (bvk $$6 : $$1) {
         if ($$6 instanceof bwi $$7 && ($$7.aj() || $$7.W())) {
            continue;
         }

         bwj $$8 = $$6.aq().f();
         if ($$8 != bwj.h) {
            jh $$9 = $$6.dw();
            $$2.query(dgo.a($$9), $$6x -> {
               diw.b $$7 = a($$9, $$6x).b().a($$6.aq());
               if ($$7 != null) {
                  $$4.a($$6.dw(), $$7.b());
               }

               if ($$6 instanceof bwi) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new dht.d($$0, $$5, $$4, $$3);
   }

   static dik a(jh $$0, dzq $$1) {
      return $$1.getNoiseBiome(kb.a($$0.u()), kb.a($$0.v()), kb.a($$0.w())).a();
   }

   public static List<bwj> a(dht.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<bwj> $$4 = new ArrayList<>(f.length);

      for (bwj $$5 : f) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(ash $$0, eaa $$1, dht.d $$2, List<bwj> $$3) {
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
      // 00: invokestatic bps.a ()Lbpt;
      // 03: astore 4
      // 05: aload 4
      // 07: ldc "spawner"
      // 09: invokeinterface bpt.a (Ljava/lang/String;)V 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 59
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast bwj
      // 2a: astore 6
      // 2c: aload 2
      // 2d: aload 6
      // 2f: aload 1
      // 30: invokevirtual eaa.f ()Ldgo;
      // 33: invokevirtual dht$d.a (Lbwj;Ldgo;)Z
      // 36: ifeq 56
      // 39: aload 6
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: dup
      // 3f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: invokedynamic test (Ldht$d;)Ldht$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbvr;Ljh;Ldzq;)Z, dht$d.a (Lbvr;Ljh;Ldzq;)Z, (Lbvr;Ljh;Ldzq;)Z ]
      // 48: aload 2
      // 49: dup
      // 4a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d: pop
      // 4e: invokedynamic run (Ldht$d;)Ldht$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbwi;Ldzq;)V, dht$d.a (Lbwi;Ldzq;)V, (Lbwi;Ldzq;)V ]
      // 53: invokestatic dht.a (Lbwj;Lash;Leaa;Ldht$c;Ldht$a;)V
      // 56: goto 16
      // 59: aload 4
      // 5b: invokeinterface bpt.c ()V 1
      // 60: return
   }

   public static void a(bwj $$0, ash $$1, eaa $$2, dht.c $$3, dht.a $$4) {
      jh $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.L_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bbl
   public static void a(bwj $$0, ash $$1, jh $$2) {
      a($$0, $$1, $$1.y($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bwj $$0, ash $$1, dzq $$2, jh $$3, dht.c $$4, dht.a $$5) {
      die $$6 = $$1.b();
      dzr $$7 = $$1.m().g();
      int $$8 = $$3.v();
      dxv $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         jh.a $$10 = new jh.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            diw.c $$16 = null;
            bwz $$17 = null;
            int $$18 = bae.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cpx $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<diw.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.A.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bwi $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dw()), bvq.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.ad()) {
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

   private static boolean a(ash $$0, dzq $$1, jh.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.Y().a(new fby((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new dgo($$2), $$1.f()) || $$0.g($$2);
      }
   }

   private static boolean a(ash $$0, bwj $$1, die $$2, dzr $$3, diw.c $$4, jh.a $$5, double $$6) {
      bvr<?> $$7 = $$4.b;
      if ($$7.f() == bwj.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!bxc.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !bxc.a($$7, $$0, bvq.a, $$5, $$0.A) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
      }
   }

   @Nullable
   private static bwi a(ash $$0, bvr<?> $$1) {
      try {
         bvk var3 = $$1.a($$0, bvq.a);
         if (var3 instanceof bwi) {
            return (bwi)var3;
         }

         c.warn("Can't spawn entity of type: {}", ma.f.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(ash $$0, bwi $$1, double $$2) {
      return $$2 > (double)($$1.aq().f().f() * $$1.aq().f().f()) && $$1.h($$2) ? false : $$1.a($$0, bvq.a) && $$1.a((dhl)$$0);
   }

   private static Optional<diw.c> a(ash $$0, die $$1, dzr $$2, bwj $$3, bam $$4, jh $$5) {
      jq<dik> $$6 = $$0.t($$5);
      return $$3 == bwj.g && $$6.a(axt.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(ash $$0, die $$1, dzr $$2, bwj $$3, diw.c $$4, jh $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static brv<diw.c> a(ash $$0, die $$1, dzr $$2, bwj $$3, jh $$4, @Nullable jq<dik> $$5) {
      return a($$4, $$0, $$3, $$1) ? eqr.d : $$2.a($$5 != null ? $$5 : $$0.t($$4), $$1, $$3, $$4);
   }

   public static boolean a(jh $$0, ash $$1, bwj $$2, die $$3) {
      if ($$2 == bwj.a && $$1.a_($$0.e()).a(dko.fB)) {
         eok $$4 = $$3.b().e(mb.aU).c(eoe.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static jh a(dhi $$0, eaa $$1) {
      dgo $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(edq.a.b, $$3, $$4) + 1;
      int $$6 = bae.b($$0.A, $$0.L_(), $$5);
      return new jh($$3, $$6, $$4);
   }

   public static boolean a(dgn $$0, jh $$1, dxv $$2, etx $$3, bvr<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(axu.aZ) ? false : !$$4.a($$2);
      }
   }

   public static void a(dhz $$0, jq<dik> $$1, dgo $$2, bam $$3) {
      diw $$4 = $$1.a().b();
      brv<diw.c> $$5 = $$4.a(bwj.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<diw.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               diw.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bwz $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     jh $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && bxc.a($$9.b, $$0, $$19)) {
                        float $$20 = $$9.b.l();
                        double $$21 = bae.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = bae.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bxc.a($$9.b, $$0, bvq.b, jh.a($$21, (double)$$19.v(), $$22), $$0.H_())) {
                           continue;
                        }

                        bvk $$23;
                        try {
                           $$23 = $$9.b.a($$0.a(), bvq.a);
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bwi $$26 && $$26.a($$0, bvq.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dw()), bvq.b, $$11);
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

   private static jh a(dhl $$0, bvr<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bxc.b($$1), $$2, $$3);
      jh.a $$5 = new jh.a($$2, $$4, $$3);
      if ($$0.G_().h()) {
         do {
            $$5.c(jm.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jm.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.L_());
      }

      return bxc.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(bwi var1, dzq var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<eaa> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bvr<?> var1, jh var2, dzq var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bwj> b;
      private final dhw c;
      private final Object2IntMap<bwj> d;
      private final dhs e;
      @Nullable
      private jh f;
      @Nullable
      private bvr<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bwj> $$1, dhw $$2, dhs $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bvr<?> $$0, jh $$1, dzq $$2) {
         this.f = $$1;
         this.g = $$0;
         diw.b $$3 = dht.a($$1, $$2).b().a($$0);
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

      private void a(bwi $$0, dzq $$1) {
         bvr<?> $$2 = $$0.aq();
         jh $$3 = $$0.dw();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            diw.b $$5 = dht.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bwj $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dgo($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bwj> b() {
         return this.d;
      }

      boolean a(bwj $$0) {
         int $$1 = $$0.b() * this.a / dht.e;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(bwj $$0, dgo $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
