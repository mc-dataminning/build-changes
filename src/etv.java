import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class etv extends etw {
   public static final dym a = dyl.i;
   public static final dyu b = dyl.aN;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<etv.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<etv.a> $$0 = new Object2ByteLinkedOpenHashMap<etv.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<etx, fcs> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dxw.a<etw, etx> $$0) {
      $$0.a(a);
   }

   @Override
   public fby a(dgn $$0, jh $$1, etx $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      jh.a $$5 = new jh.a();

      for (jm $$6 : jm.c.a) {
         $$5.a($$1, $$6);
         etx $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  jh $$10 = $$5.e();
                  etx $$11 = $$0.b_($$10);
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

      fby $$12 = new fby($$3, 0.0, $$4);
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

   private boolean g(etx $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dgn $$0, jh $$1, jm $$2) {
      dxv $$3 = $$0.a_($$1);
      etx $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jm.b) {
         return true;
      } else {
         return $$3.b() instanceof dom ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(ash $$0, jh $$1, dxv $$2, etx $$3) {
      if (!$$3.c()) {
         jh $$4 = $$1.e();
         dxv $$5 = $$0.a_($$4);
         etx $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jm.a, $$4, $$5, $$6)) {
            etx $$7 = this.a($$0, $$4, $$5);
            etw $$8 = $$7.a();
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

   private void a(ash $$0, jh $$1, etx $$2, dxv $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jm, etx> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jm, etx> $$6 : $$5.entrySet()) {
            jm $$7 = $$6.getKey();
            etx $$8 = $$6.getValue();
            jh $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected etx a(ash $$0, jh $$1, dxv $$2) {
      int $$3 = 0;
      int $$4 = 0;
      jh.a $$5 = new jh.a();

      for (jm $$6 : jm.c.a) {
         jh $$7 = $$5.a($$1, $$6);
         dxv $$8 = $$0.a_($$7);
         etx $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dxv $$10 = $$0.a_($$5.a($$1, jm.a));
         etx $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      jh $$12 = $$5.a($$1, jm.b);
      dxv $$13 = $$0.a_($$12);
      etx $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jm.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? ety.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jm $$0, dgn $$1, jh $$2, dxv $$3, jh $$4, dxv $$5) {
      fcs $$6 = $$5.g($$1, $$4);
      if ($$6 == fcp.b()) {
         return false;
      } else {
         fcs $$7 = $$3.g($$1, $$2);
         if ($$7 == fcp.b()) {
            return false;
         } else if ($$7 == fcp.a() && $$6 == fcp.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<etv.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            etv.a $$10;
            if ($$9 != null) {
               $$10 = new etv.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fcp.b($$7, $$6, $$0);
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

   public abstract etw d();

   public etx a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract etw e();

   public etx a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(ash var1);

   protected void a(dhj $$0, jh $$1, dxv $$2, jm $$3, etx $$4) {
      if ($$2.b() instanceof dpf $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dhj var1, jh var2, dxv var3);

   protected int a(dhl $$0, jh $$1, int $$2, jm $$3, dxv $$4, etv.b $$5) {
      int $$6 = 1000;

      for (jm $$7 : jm.c.a) {
         if ($$7 != $$3) {
            jh $$8 = $$1.a($$7);
            dxv $$9 = $$5.a($$8);
            etx $$10 = $$9.y();
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

   boolean a(dgn $$0, jh $$1, dxv $$2, jh $$3, dxv $$4) {
      if (!a(jm.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dgn $$0, etw $$1, jh $$2, dxv $$3, jm $$4, jh $$5, dxv $$6, etx $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dgn $$0, jh $$1, dxv $$2, jm $$3, jh $$4, dxv $$5, etx $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(etx $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dhl var1);

   private int a(dhl $$0, jh $$1) {
      int $$2 = 0;

      for (jm $$3 : jm.c.a) {
         jh $$4 = $$1.a($$3);
         etx $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jm, etx> b(ash $$0, jh $$1, dxv $$2) {
      int $$3 = 1000;
      Map<jm, etx> $$4 = Maps.newEnumMap(jm.class);
      etv.b $$5 = null;

      for (jm $$6 : jm.c.a) {
         jh $$7 = $$1.a($$6);
         dxv $$8 = $$0.a_($$7);
         etx $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            etx $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new etv.b($$0, $$1);
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

   private static boolean a(dxv $$0) {
      dkm $$1 = $$0.b();
      if ($$1 instanceof dpf) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dmu)
               && !$$0.a(axu.aA)
               && !$$0.a(dko.cX)
               && !$$0.a(dko.ef)
               && !$$0.a(dko.ny)
               && !$$0.a(dko.eq)
               && !$$0.a(dko.fL)
               && !$$0.a(dko.la)
               && !$$0.a(dko.li);
      }
   }

   private static boolean a(dgn $$0, jh $$1, dxv $$2, etw $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dgn $$0, jh $$1, dxv $$2, etw $$3) {
      return $$2.b() instanceof dpf $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dhl var1);

   protected int a(dhi $$0, jh $$1, etx $$2, etx $$3) {
      return this.a($$0);
   }

   @Override
   public void b(ash $$0, jh $$1, dxv $$2, etx $$3) {
      if (!$$3.b()) {
         etx $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dko.a.m();
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

   protected static int e(etx $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(etx $$0, dgn $$1, jh $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(etx $$0, dgn $$1, jh $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(etx $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(etx var1);

   @Override
   public fcs b(etx $$0, dgn $$1, jh $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? fcp.b() : this.g.computeIfAbsent($$0, $$2x -> fcp.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dxv a, dxv b, jm c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof etv.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final dgn b;
      private final jh c;
      private final Short2ObjectMap<dxv> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dgn $$1, final jh $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dxv a(jh $$0) {
         return this.a($$0, this.c($$0));
      }

      private dxv a(jh $$0, short $$1) {
         return (dxv)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(jh $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dxv $$2 = this.a($$0, $$1);
            jh $$3 = $$0.e();
            dxv $$4 = this.b.a_($$3);
            return etv.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(jh $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
