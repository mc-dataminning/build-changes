import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eri extends erj {
   public static final dwa a = dvz.i;
   public static final dwj b = dvz.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<eri.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<eri.a> $$0 = new Object2ByteLinkedOpenHashMap<eri.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<erk, fah> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dvk.a<erj, erk> $$0) {
      $$0.a(a);
   }

   @Override
   public ezn a(deg $$0, jh $$1, erk $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      jh.a $$5 = new jh.a();

      for (jm $$6 : jm.c.a) {
         $$5.a($$1, $$6);
         erk $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  jh $$10 = $$5.e();
                  erk $$11 = $$0.b_($$10);
                  if (this.g($$11)) {
                     $$8 = $$11.d();
                     if ($$8 > 0.0F) {
                        $$9 = $$2.d() - ($$8 - 0.8888889F);
                     }
                  }
               }
            } else if ($$8 > 0.0F) {
               $$9 = $$2.d() - $$8;
            }

            if ($$9 != 0.0F) {
               $$3 += (double)((float)$$6.j() * $$9);
               $$4 += (double)((float)$$6.l() * $$9);
            }
         }
      }

      ezn $$12 = new ezn($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jm $$13 : jm.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(erk $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(deg $$0, jh $$1, jm $$2) {
      dvj $$3 = $$0.a_($$1);
      erk $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jm.b) {
         return true;
      } else {
         return $$3.b() instanceof dmb ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(dfb $$0, jh $$1, dvj $$2, erk $$3) {
      if (!$$3.c()) {
         jh $$4 = $$1.e();
         dvj $$5 = $$0.a_($$4);
         erk $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jm.a, $$4, $$5, $$6)) {
            erk $$7 = this.a($$0, $$4, $$5);
            erj $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jm.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jm.a, $$7);
               if (this.a($$0, $$1) >= 3) {
                  this.a($$0, $$1, $$3, $$2);
               }

               return;
            }
         }

         if ($$3.b() || !this.a($$0, $$1, $$2, $$4, $$5)) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   private void a(dfb $$0, jh $$1, erk $$2, dvj $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jm, erk> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jm, erk> $$6 : $$5.entrySet()) {
            jm $$7 = $$6.getKey();
            erk $$8 = $$6.getValue();
            jh $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected erk a(dfb $$0, jh $$1, dvj $$2) {
      int $$3 = 0;
      int $$4 = 0;
      jh.a $$5 = new jh.a();

      for (jm $$6 : jm.c.a) {
         jh $$7 = $$5.a($$1, $$6);
         dvj $$8 = $$0.a_($$7);
         erk $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dvj $$10 = $$0.a_($$5.a($$1, jm.a));
         erk $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      jh $$12 = $$5.a($$1, jm.b);
      dvj $$13 = $$0.a_($$12);
      erk $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jm.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? erl.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jm $$0, deg $$1, jh $$2, dvj $$3, jh $$4, dvj $$5) {
      fah $$6 = $$5.g($$1, $$4);
      if ($$6 == fae.b()) {
         return false;
      } else {
         fah $$7 = $$3.g($$1, $$2);
         if ($$7 == fae.b()) {
            return false;
         } else if ($$7 == fae.a() && $$6 == fae.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<eri.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            eri.a $$10;
            if ($$9 != null) {
               $$10 = new eri.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fae.b($$7, $$6, $$0);
            if ($$9 != null) {
               if ($$9.size() == 200) {
                  $$9.removeLastByte();
               }

               $$9.putAndMoveToFirst($$10, (byte)($$13 ? 1 : 0));
            }

            return $$13;
         }
      }
   }

   public abstract erj d();

   public erk a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract erj e();

   public erk a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(dfb var1);

   protected void a(dfc $$0, jh $$1, dvj $$2, jm $$3, erk $$4) {
      if ($$2.b() instanceof dmu $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dfc var1, jh var2, dvj var3);

   protected int a(dfe $$0, jh $$1, int $$2, jm $$3, dvj $$4, eri.b $$5) {
      int $$6 = 1000;

      for (jm $$7 : jm.c.a) {
         if ($$7 != $$3) {
            jh $$8 = $$1.a($$7);
            dvj $$9 = $$5.a($$8);
            erk $$10 = $$9.y();
            if (this.a($$0, this.d(), $$1, $$4, $$7, $$8, $$9, $$10)) {
               if ($$5.b($$8)) {
                  return $$2;
               }

               if ($$2 < this.b($$0)) {
                  int $$11 = this.a($$0, $$8, $$2 + 1, $$7.g(), $$9, $$5);
                  if ($$11 < $$6) {
                     $$6 = $$11;
                  }
               }
            }
         }
      }

      return $$6;
   }

   boolean a(deg $$0, jh $$1, dvj $$2, jh $$3, dvj $$4) {
      if (!a(jm.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(deg $$0, erj $$1, jh $$2, dvj $$3, jm $$4, jh $$5, dvj $$6, erk $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(deg $$0, jh $$1, dvj $$2, jm $$3, jh $$4, dvj $$5, erk $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(erk $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dfe var1);

   private int a(dfe $$0, jh $$1) {
      int $$2 = 0;

      for (jm $$3 : jm.c.a) {
         jh $$4 = $$1.a($$3);
         erk $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jm, erk> b(dfb $$0, jh $$1, dvj $$2) {
      int $$3 = 1000;
      Map<jm, erk> $$4 = Maps.newEnumMap(jm.class);
      eri.b $$5 = null;

      for (jm $$6 : jm.c.a) {
         jh $$7 = $$1.a($$6);
         dvj $$8 = $$0.a_($$7);
         erk $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            erk $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new eri.b($$0, $$1);
               }

               int $$11;
               if ($$5.b($$7)) {
                  $$11 = 0;
               } else {
                  $$11 = this.a($$0, $$7, 1, $$6.g(), $$8, $$5);
               }

               if ($$11 < $$3) {
                  $$4.clear();
               }

               if ($$11 <= $$3) {
                  if ($$9.a($$0, $$7, $$10.a(), $$6)) {
                     $$4.put($$6, $$10);
                  }

                  $$3 = $$11;
               }
            }
         }
      }

      return $$4;
   }

   private static boolean a(dvj $$0) {
      die $$1 = $$0.b();
      if ($$1 instanceof dmu) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dkk)
               && !$$0.a(axa.ay)
               && !$$0.a(dig.cO)
               && !$$0.a(dig.dS)
               && !$$0.a(dig.nd)
               && !$$0.a(dig.ed)
               && !$$0.a(dig.fx)
               && !$$0.a(dig.kF)
               && !$$0.a(dig.kN);
      }
   }

   private static boolean a(deg $$0, jh $$1, dvj $$2, erj $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(deg $$0, jh $$1, dvj $$2, erj $$3) {
      return $$2.b() instanceof dmu $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dfe var1);

   protected int a(dfb $$0, jh $$1, erk $$2, erk $$3) {
      return this.a((dfe)$$0);
   }

   @Override
   public void b(dfb $$0, jh $$1, dvj $$2, erk $$3) {
      if (!$$3.b()) {
         erk $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dig.a.m();
            $$0.a($$1, $$2, 3);
         } else if (!$$4.equals($$3)) {
            $$3 = $$4;
            $$2 = $$4.g();
            $$0.a($$1, $$2, 3);
            $$0.a($$1, $$4.a(), $$5);
         }
      }

      this.a($$0, $$1, $$2, $$3);
   }

   protected static int e(erk $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(erk $$0, deg $$1, jh $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(erk $$0, deg $$1, jh $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(erk $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(erk var1);

   @Override
   public fah b(erk $$0, deg $$1, jh $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? fae.b() : this.g.computeIfAbsent($$0, $$2x -> fae.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dvj a, dvj b, jm c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof eri.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         int $$0 = System.identityHashCode(this.a);
         $$0 = 31 * $$0 + System.identityHashCode(this.b);
         return 31 * $$0 + this.c.hashCode();
      }
   }

   protected class b {
      private final deg b;
      private final jh c;
      private final Short2ObjectMap<dvj> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final deg $$1, final jh $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dvj a(jh $$0) {
         return this.a($$0, this.c($$0));
      }

      private dvj a(jh $$0, short $$1) {
         return (dvj)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(jh $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dvj $$2 = this.a($$0, $$1);
            jh $$3 = $$0.e();
            dvj $$4 = this.b.a_($$3);
            return eri.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(jh $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
