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

public final class ctj {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bly[] f = Stream.of(bly.values()).filter($$0 -> $$0 != bly.h).toArray(bly[]::new);

   private ctj() {
   }

   public static ctj.d a(int $$0, Iterable<blf> $$1, ctj.b $$2, cti $$3) {
      ctm $$4 = new ctm();
      Object2IntOpenHashMap<bly> $$5 = new Object2IntOpenHashMap();

      for (blf $$6 : $$1) {
         if ($$6 instanceof blx $$7 && ($$7.fL() || $$7.W())) {
            continue;
         }

         bly $$8 = $$6.ai().f();
         if ($$8 != bly.h) {
            hv $$9 = $$6.dm();
            $$2.query(csf.a($$9), $$6x -> {
               cuj.b $$7 = a($$9, $$6x).b().a($$6.ai());
               if ($$7 != null) {
                  $$4.a($$6.dm(), $$7.b());
               }

               if ($$6 instanceof blx) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }

      return new ctj.d($$0, $$5, $$4, $$3);
   }

   static ctx a(hv $$0, dkl $$1) {
      return $$1.getNoiseBiome(iq.a($$0.u()), iq.a($$0.v()), iq.a($$0.w())).a();
   }

   public static void a(amp $$0, dkw $$1, ctj.d $$2, boolean $$3, boolean $$4, boolean $$5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual amp.ae ()Lbgc;
      // 04: ldc "spawner"
      // 06: invokeinterface bgc.a (Ljava/lang/String;)V 2
      // 0b: getstatic ctj.f [Lbly;
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
      // 2c: invokevirtual bly.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bly.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bly.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual dkw.f ()Lcsf;
      // 53: invokevirtual ctj$d.a (Lbly;Lcsf;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lctj$d;)Lctj$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lblj;Lhv;Ldkl;)Z, ctj$d.a (Lblj;Lhv;Ldkl;)Z, (Lblj;Lhv;Ldkl;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lctj$d;)Lctj$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lblx;Ldkl;)V, ctj$d.a (Lblx;Ldkl;)V, (Lblx;Ldkl;)V ]
      // 73: invokestatic ctj.a (Lbly;Lamp;Ldkw;Lctj$c;Lctj$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual amp.ae ()Lbgc;
      // 80: invokeinterface bgc.c ()V 1
      // 85: return
   }

   public static void a(bly $$0, amp $$1, dkw $$2, ctj.c $$3, ctj.a $$4) {
      hv $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.J_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @avd
   public static void a(bly $$0, amp $$1, hv $$2) {
      a($$0, $$1, $$1.x($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bly $$0, amp $$1, dkl $$2, hv $$3, ctj.c $$4, ctj.a $$5) {
      ctr $$6 = $$1.a();
      dkm $$7 = $$1.k().g();
      int $$8 = $$3.v();
      dip $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         hv.a $$10 = new hv.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            cuj.c $$16 = null;
            bmo $$17 = null;
            int $$18 = aty.f($$1.z.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.z.a(6) - $$1.z.a(6);
               $$14 += $$1.z.a(6) - $$1.z.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               cer $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.i($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<cuj.c> $$25 = a($$1, $$6, $$7, $$0, $$1.z, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        blx $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.z.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dm()), blz.a, $$17, null);
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

   private static boolean a(amp $$0, dkl $$1, hv.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else {
         return $$0.S().a(new elb((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)
            ? false
            : Objects.equals(new csf($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(amp $$0, bly $$1, ctr $$2, dkm $$3, cuj.c $$4, hv.a $$5, double $$6) {
      blj<?> $$7 = $$4.b;
      if ($$7.f() == bly.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bmp.c $$8 = bmp.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else {
            return !bmp.a($$7, $$0, blz.a, $$5, $$0.z) ? false : $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static blx a(amp $$0, blj<?> $$1) {
      try {
         blf var3 = $$1.a((csy)$$0);
         if (var3 instanceof blx) {
            return (blx)var3;
         }

         c.warn("Can't spawn entity of type: {}", kb.g.b($$1));
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(amp $$0, blx $$1, double $$2) {
      return $$2 > (double)($$1.ai().f().f() * $$1.ai().f().f()) && $$1.h($$2) ? false : $$1.a($$0, blz.a) && $$1.a($$0);
   }

   private static Optional<cuj.c> a(amp $$0, ctr $$1, dkm $$2, bly $$3, auf $$4, hv $$5) {
      ie<ctx> $$6 = $$0.s($$5);
      return $$3 == bly.g && $$6.a(arq.am) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(amp $$0, ctr $$1, dkm $$2, bly $$3, cuj.c $$4, hv $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static bhz<cuj.c> a(amp $$0, ctr $$1, dkm $$2, bly $$3, hv $$4, @Nullable ie<ctx> $$5) {
      return a($$4, $$0, $$3, $$1) ? eau.d : $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
   }

   public static boolean a(hv $$0, amp $$1, bly $$2, ctr $$3) {
      if ($$2 == bly.a && $$1.a_($$0.d()).a(cwb.fn)) {
         dyo $$4 = $$3.b().d(kc.aC).a(dyi.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static hv a(csy $$0, dkw $$1) {
      csf $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.z.a(16);
      int $$4 = $$2.e() + $$0.z.a(16);
      int $$5 = $$1.a(dny.a.b, $$3, $$4) + 1;
      int $$6 = aty.b($$0.z, $$0.J_(), $$5);
      return new hv($$3, $$6, $$4);
   }

   public static boolean a(cse $$0, hv $$1, dip $$2, edz $$3, blj<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.m()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(arr.aW) ? false : !$$4.a($$2);
      }
   }

   public static boolean a(bmp.c $$0, ctb $$1, hv $$2, @Nullable blj<?> $$3) {
      if ($$0 == bmp.c.c) {
         return true;
      } else if ($$3 != null && $$1.D_().a($$2)) {
         dip $$4 = $$1.a_($$2);
         edz $$5 = $$1.b_($$2);
         hv $$6 = $$2.c();
         hv $$7 = $$2.d();
         switch ($$0) {
            case b:
               return $$5.a(arw.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(arw.b);
            case a:
            default:
               dip $$8 = $$1.a_($$7);
               return !$$8.a($$1, $$7, $$3) ? false : a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
         }
      } else {
         return false;
      }
   }

   public static void a(ctn $$0, ie<ctx> $$1, csf $$2, auf $$3) {
      cuj $$4 = $$1.a().b();
      bhz<cuj.c> $$5 = $$4.a(bly.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<cuj.c> $$8 = $$5.b($$3);
            if (!$$8.isEmpty()) {
               cuj.c $$9 = $$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bmo $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     hv $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bmp.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = aty.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = aty.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bmp.a($$9.b, $$0, blz.b, hv.a($$21, (double)$$19.v(), $$22), $$0.F_())) {
                           continue;
                        }

                        blf $$23;
                        try {
                           $$23 = $$9.b.a((csy)$$0.D());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof blx $$26 && $$26.a($$0, blz.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dm()), blz.b, $$11, null);
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

   private static hv a(ctb $$0, blj<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bmp.b($$1), $$2, $$3);
      hv.a $$5 = new hv.a($$2, $$4, $$3);
      if ($$0.E_().h()) {
         do {
            $$5.c(ia.a);
         } while (!$$0.a_($$5).i());

         do {
            $$5.c(ia.a);
         } while ($$0.a_($$5).i() && $$5.v() > $$0.J_());
      }

      if (bmp.a($$1) == bmp.c.a) {
         hv $$6 = $$5.d();
         if ($$0.a_($$6).a($$0, $$6, eep.a)) {
            return $$6;
         }
      }

      return $$5.i();
   }

   @FunctionalInterface
   public interface a {
      void run(blx var1, dkl var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<dkw> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(blj<?> var1, hv var2, dkl var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bly> b;
      private final ctm c;
      private final Object2IntMap<bly> d;
      private final cti e;
      @Nullable
      private hv f;
      @Nullable
      private blj<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bly> $$1, ctm $$2, cti $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(blj<?> $$0, hv $$1, dkl $$2) {
         this.f = $$1;
         this.g = $$0;
         cuj.b $$3 = ctj.a($$1, $$2).b().a($$0);
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

      private void a(blx $$0, dkl $$1) {
         blj<?> $$2 = $$0.ai();
         hv $$3 = $$0.dm();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            cuj.b $$5 = ctj.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bly $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new csf($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bly> b() {
         return this.d;
      }

      boolean a(bly $$0, csf $$1) {
         int $$2 = $$0.b() * this.a / ctj.e;
         return this.b.getInt($$0) >= $$2 ? false : this.e.a($$0, $$1);
      }
   }
}
