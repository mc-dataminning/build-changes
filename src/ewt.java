import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ewt extends ewu {
   public static final ebf a = ebe.l;
   public static final ebo b = ebe.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<ewt.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<ewt.a> $$0 = new Object2ByteLinkedOpenHashMap<ewt.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ewv, ffr> g = Maps.newIdentityHashMap();

   @Override
   protected void a(eap.a<ewu, ewv> $$0) {
      $$0.a(a);
   }

   @Override
   public fex a(din $$0, iv $$1, ewv $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      iv.a $$5 = new iv.a();

      for (jb $$6 : jb.c.a) {
         $$5.a($$1, $$6);
         ewv $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  iv $$10 = $$5.e();
                  ewv $$11 = $$0.b_($$10);
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

      fex $$12 = new fex($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jb $$13 : jb.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ewv $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(din $$0, iv $$1, jb $$2) {
      eao $$3 = $$0.a_($$1);
      ewv $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jb.b) {
         return true;
      } else {
         return $$3.b() instanceof dqp ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(arq $$0, iv $$1, eao $$2, ewv $$3) {
      if (!$$3.c()) {
         iv $$4 = $$1.e();
         eao $$5 = $$0.a_($$4);
         ewv $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jb.a, $$4, $$5, $$6)) {
            ewv $$7 = this.a($$0, $$4, $$5);
            ewu $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jb.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jb.a, $$7);
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

   private void a(arq $$0, iv $$1, ewv $$2, eao $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jb, ewv> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jb, ewv> $$6 : $$5.entrySet()) {
            jb $$7 = $$6.getKey();
            ewv $$8 = $$6.getValue();
            iv $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected ewv a(arq $$0, iv $$1, eao $$2) {
      int $$3 = 0;
      int $$4 = 0;
      iv.a $$5 = new iv.a();

      for (jb $$6 : jb.c.a) {
         iv $$7 = $$5.a($$1, $$6);
         eao $$8 = $$0.a_($$7);
         ewv $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         eao $$10 = $$0.a_($$5.a($$1, jb.a));
         ewv $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      iv $$12 = $$5.a($$1, jb.b);
      eao $$13 = $$0.a_($$12);
      ewv $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jb.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? eww.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jb $$0, din $$1, iv $$2, eao $$3, iv $$4, eao $$5) {
      ffr $$6 = $$5.g($$1, $$4);
      if ($$6 == ffo.b()) {
         return false;
      } else {
         ffr $$7 = $$3.g($$1, $$2);
         if ($$7 == ffo.b()) {
            return false;
         } else if ($$7 == ffo.a() && $$6 == ffo.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<ewt.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            ewt.a $$10;
            if ($$9 != null) {
               $$10 = new ewt.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !ffo.b($$7, $$6, $$0);
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

   public abstract ewu d();

   public ewv a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract ewu e();

   public ewv a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(arq var1);

   protected void a(dji $$0, iv $$1, eao $$2, jb $$3, ewv $$4) {
      if ($$2.b() instanceof drj $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dji var1, iv var2, eao var3);

   protected int a(djk $$0, iv $$1, int $$2, jb $$3, eao $$4, ewt.b $$5) {
      int $$6 = 1000;

      for (jb $$7 : jb.c.a) {
         if ($$7 != $$3) {
            iv $$8 = $$1.a($$7);
            eao $$9 = $$5.a($$8);
            ewv $$10 = $$9.y();
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

   boolean a(din $$0, iv $$1, eao $$2, iv $$3, eao $$4) {
      if (!a(jb.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(din $$0, ewu $$1, iv $$2, eao $$3, jb $$4, iv $$5, eao $$6, ewv $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(din $$0, iv $$1, eao $$2, jb $$3, iv $$4, eao $$5, ewv $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(ewv $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(djk var1);

   private int a(djk $$0, iv $$1) {
      int $$2 = 0;

      for (jb $$3 : jb.c.a) {
         iv $$4 = $$1.a($$3);
         ewv $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jb, ewv> b(arq $$0, iv $$1, eao $$2) {
      int $$3 = 1000;
      Map<jb, ewv> $$4 = Maps.newEnumMap(jb.class);
      ewt.b $$5 = null;

      for (jb $$6 : jb.c.a) {
         iv $$7 = $$1.a($$6);
         eao $$8 = $$0.a_($$7);
         ewv $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            ewv $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new ewt.b($$0, $$1);
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

   private static boolean a(eao $$0) {
      dmm $$1 = $$0.b();
      if ($$1 instanceof drj) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dot)
               && !$$0.a(axc.aA)
               && !$$0.a(dmo.da)
               && !$$0.a(dmo.ej)
               && !$$0.a(dmo.nJ)
               && !$$0.a(dmo.eu)
               && !$$0.a(dmo.fW)
               && !$$0.a(dmo.ll)
               && !$$0.a(dmo.lt);
      }
   }

   private static boolean a(din $$0, iv $$1, eao $$2, ewu $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(din $$0, iv $$1, eao $$2, ewu $$3) {
      return $$2.b() instanceof drj $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(djk var1);

   protected int a(djh $$0, iv $$1, ewv $$2, ewv $$3) {
      return this.a($$0);
   }

   @Override
   public void b(arq $$0, iv $$1, eao $$2, ewv $$3) {
      if (!$$3.b()) {
         ewv $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dmo.a.m();
            $$0.a($$1, $$2, 3);
         } else if ($$4 != $$3) {
            $$3 = $$4;
            $$2 = $$4.g();
            $$0.a($$1, $$2, 3);
            $$0.a($$1, $$4.a(), $$5);
         }
      }

      this.a($$0, $$1, $$2, $$3);
   }

   protected static int e(ewv $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean d(ewv $$0, din $$1, iv $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(ewv $$0, din $$1, iv $$2) {
      return d($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ewv $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ewv var1);

   @Override
   public ffr b(ewv $$0, din $$1, iv $$2) {
      return $$0.e() == 9 && d($$0, $$1, $$2) ? ffo.b() : this.g.computeIfAbsent($$0, $$2x -> ffo.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(eao a, eao b, jb c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof ewt.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final din b;
      private final iv c;
      private final Short2ObjectMap<eao> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final din $$1, final iv $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public eao a(iv $$0) {
         return this.a($$0, this.c($$0));
      }

      private eao a(iv $$0, short $$1) {
         return (eao)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(iv $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            eao $$2 = this.a($$0, $$1);
            iv $$3 = $$0.e();
            eao $$4 = this.b.a_($$3);
            return ewt.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(iv $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
