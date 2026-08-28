import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eqr extends eqs {
   public static final dvj a = dvi.i;
   public static final dvs b = dvi.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<eqr.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<eqr.a> $$0 = new Object2ByteLinkedOpenHashMap<eqr.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eqt, ezq> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dut.a<eqs, eqt> $$0) {
      $$0.a(a);
   }

   @Override
   public eyw a(ddo $$0, jf $$1, eqt $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      jf.a $$5 = new jf.a();

      for (jk $$6 : jk.c.a) {
         $$5.a($$1, $$6);
         eqt $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  jf $$10 = $$5.e();
                  eqt $$11 = $$0.b_($$10);
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

      eyw $$12 = new eyw($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jk $$13 : jk.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eqt $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(ddo $$0, jf $$1, jk $$2) {
      dus $$3 = $$0.a_($$1);
      eqt $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jk.b) {
         return true;
      } else {
         return $$3.b() instanceof dlk ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(dej $$0, jf $$1, dus $$2, eqt $$3) {
      if (!$$3.c()) {
         jf $$4 = $$1.e();
         dus $$5 = $$0.a_($$4);
         eqt $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jk.a, $$4, $$5, $$6)) {
            eqt $$7 = this.a($$0, $$4, $$5);
            eqs $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jk.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jk.a, $$7);
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

   private void a(dej $$0, jf $$1, eqt $$2, dus $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jk, eqt> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jk, eqt> $$6 : $$5.entrySet()) {
            jk $$7 = $$6.getKey();
            eqt $$8 = $$6.getValue();
            jf $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected eqt a(dej $$0, jf $$1, dus $$2) {
      int $$3 = 0;
      int $$4 = 0;
      jf.a $$5 = new jf.a();

      for (jk $$6 : jk.c.a) {
         jf $$7 = $$5.a($$1, $$6);
         dus $$8 = $$0.a_($$7);
         eqt $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dus $$10 = $$0.a_($$5.a($$1, jk.a));
         eqt $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      jf $$12 = $$5.a($$1, jk.b);
      dus $$13 = $$0.a_($$12);
      eqt $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jk.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? equ.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jk $$0, ddo $$1, jf $$2, dus $$3, jf $$4, dus $$5) {
      ezq $$6 = $$5.g($$1, $$4);
      if ($$6 == ezn.b()) {
         return false;
      } else {
         ezq $$7 = $$3.g($$1, $$2);
         if ($$7 == ezn.b()) {
            return false;
         } else if ($$7 == ezn.a() && $$6 == ezn.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<eqr.a> $$9;
            if (!$$3.b().o() && !$$5.b().o()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            eqr.a $$10;
            if ($$9 != null) {
               $$10 = new eqr.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !ezn.b($$7, $$6, $$0);
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

   public abstract eqs d();

   public eqt a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract eqs e();

   public eqt a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(dej var1);

   protected void a(dek $$0, jf $$1, dus $$2, jk $$3, eqt $$4) {
      if ($$2.b() instanceof dmd $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dek var1, jf var2, dus var3);

   protected int a(dem $$0, jf $$1, int $$2, jk $$3, dus $$4, eqr.b $$5) {
      int $$6 = 1000;

      for (jk $$7 : jk.c.a) {
         if ($$7 != $$3) {
            jf $$8 = $$1.a($$7);
            dus $$9 = $$5.a($$8);
            eqt $$10 = $$9.y();
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

   boolean a(ddo $$0, jf $$1, dus $$2, jf $$3, dus $$4) {
      if (!a(jk.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(ddo $$0, eqs $$1, jf $$2, dus $$3, jk $$4, jf $$5, dus $$6, eqt $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(ddo $$0, jf $$1, dus $$2, jk $$3, jf $$4, dus $$5, eqt $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(eqt $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dem var1);

   private int a(dem $$0, jf $$1) {
      int $$2 = 0;

      for (jk $$3 : jk.c.a) {
         jf $$4 = $$1.a($$3);
         eqt $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jk, eqt> b(dej $$0, jf $$1, dus $$2) {
      int $$3 = 1000;
      Map<jk, eqt> $$4 = Maps.newEnumMap(jk.class);
      eqr.b $$5 = null;

      for (jk $$6 : jk.c.a) {
         jf $$7 = $$1.a($$6);
         dus $$8 = $$0.a_($$7);
         eqt $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            eqt $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new eqr.b($$0, $$1);
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

   private static boolean a(dus $$0) {
      dhm $$1 = $$0.b();
      if ($$1 instanceof dmd) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof djs)
               && !$$0.a(awv.ay)
               && !$$0.a(dho.cO)
               && !$$0.a(dho.dS)
               && !$$0.a(dho.nd)
               && !$$0.a(dho.ed)
               && !$$0.a(dho.fx)
               && !$$0.a(dho.kF)
               && !$$0.a(dho.kN);
      }
   }

   private static boolean a(ddo $$0, jf $$1, dus $$2, eqs $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(ddo $$0, jf $$1, dus $$2, eqs $$3) {
      return $$2.b() instanceof dmd $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dem var1);

   protected int a(dej $$0, jf $$1, eqt $$2, eqt $$3) {
      return this.a((dem)$$0);
   }

   @Override
   public void b(dej $$0, jf $$1, dus $$2, eqt $$3) {
      if (!$$3.b()) {
         eqt $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dho.a.n();
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

   protected static int e(eqt $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eqt $$0, ddo $$1, jf $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(eqt $$0, ddo $$1, jf $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eqt $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eqt var1);

   @Override
   public ezq b(eqt $$0, ddo $$1, jf $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ezn.b() : this.g.computeIfAbsent($$0, $$2x -> ezn.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dus a, dus b, jk c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof eqr.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final ddo b;
      private final jf c;
      private final Short2ObjectMap<dus> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final ddo $$1, final jf $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dus a(jf $$0) {
         return this.a($$0, this.c($$0));
      }

      private dus a(jf $$0, short $$1) {
         return (dus)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(jf $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dus $$2 = this.a($$0, $$1);
            jf $$3 = $$0.e();
            dus $$4 = this.b.a_($$3);
            return eqr.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(jf $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
