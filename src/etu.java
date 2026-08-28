import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class etu extends etv {
   public static final dyh a = dyg.l;
   public static final dyq b = dyg.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<etu.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<etu.a> $$0 = new Object2ByteLinkedOpenHashMap<etu.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<etw, fcr> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dxr.a<etv, etw> $$0) {
      $$0.a(a);
   }

   @Override
   public fbx a(dgf $$0, ji $$1, etw $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         $$5.a($$1, $$6);
         etw $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ji $$10 = $$5.e();
                  etw $$11 = $$0.b_($$10);
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

      fbx $$12 = new fbx($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jn $$13 : jn.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(etw $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dgf $$0, ji $$1, jn $$2) {
      dxq $$3 = $$0.a_($$1);
      etw $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jn.b) {
         return true;
      } else {
         return $$3.b() instanceof dof ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(ard $$0, ji $$1, dxq $$2, etw $$3) {
      if (!$$3.c()) {
         ji $$4 = $$1.e();
         dxq $$5 = $$0.a_($$4);
         etw $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jn.a, $$4, $$5, $$6)) {
            etw $$7 = this.a($$0, $$4, $$5);
            etv $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jn.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jn.a, $$7);
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

   private void a(ard $$0, ji $$1, etw $$2, dxq $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jn, etw> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jn, etw> $$6 : $$5.entrySet()) {
            jn $$7 = $$6.getKey();
            etw $$8 = $$6.getValue();
            ji $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected etw a(ard $$0, ji $$1, dxq $$2) {
      int $$3 = 0;
      int $$4 = 0;
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         ji $$7 = $$5.a($$1, $$6);
         dxq $$8 = $$0.a_($$7);
         etw $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dxq $$10 = $$0.a_($$5.a($$1, jn.a));
         etw $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      ji $$12 = $$5.a($$1, jn.b);
      dxq $$13 = $$0.a_($$12);
      etw $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jn.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? etx.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jn $$0, dgf $$1, ji $$2, dxq $$3, ji $$4, dxq $$5) {
      fcr $$6 = $$5.g($$1, $$4);
      if ($$6 == fco.b()) {
         return false;
      } else {
         fcr $$7 = $$3.g($$1, $$2);
         if ($$7 == fco.b()) {
            return false;
         } else if ($$7 == fco.a() && $$6 == fco.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<etu.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            etu.a $$10;
            if ($$9 != null) {
               $$10 = new etu.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fco.b($$7, $$6, $$0);
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

   public abstract etv d();

   public etw a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract etv e();

   public etw a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(ard var1);

   protected void a(dha $$0, ji $$1, dxq $$2, jn $$3, etw $$4) {
      if ($$2.b() instanceof doz $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dha var1, ji var2, dxq var3);

   protected int a(dhc $$0, ji $$1, int $$2, jn $$3, dxq $$4, etu.b $$5) {
      int $$6 = 1000;

      for (jn $$7 : jn.c.a) {
         if ($$7 != $$3) {
            ji $$8 = $$1.a($$7);
            dxq $$9 = $$5.a($$8);
            etw $$10 = $$9.y();
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

   boolean a(dgf $$0, ji $$1, dxq $$2, ji $$3, dxq $$4) {
      if (!a(jn.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dgf $$0, etv $$1, ji $$2, dxq $$3, jn $$4, ji $$5, dxq $$6, etw $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dgf $$0, ji $$1, dxq $$2, jn $$3, ji $$4, dxq $$5, etw $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(etw $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dhc var1);

   private int a(dhc $$0, ji $$1) {
      int $$2 = 0;

      for (jn $$3 : jn.c.a) {
         ji $$4 = $$1.a($$3);
         etw $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jn, etw> b(ard $$0, ji $$1, dxq $$2) {
      int $$3 = 1000;
      Map<jn, etw> $$4 = Maps.newEnumMap(jn.class);
      etu.b $$5 = null;

      for (jn $$6 : jn.c.a) {
         ji $$7 = $$1.a($$6);
         dxq $$8 = $$0.a_($$7);
         etw $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            etw $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new etu.b($$0, $$1);
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

   private static boolean a(dxq $$0) {
      dke $$1 = $$0.b();
      if ($$1 instanceof doz) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dml)
               && !$$0.a(awp.aA)
               && !$$0.a(dkg.cX)
               && !$$0.a(dkg.ef)
               && !$$0.a(dkg.nF)
               && !$$0.a(dkg.eq)
               && !$$0.a(dkg.fS)
               && !$$0.a(dkg.lh)
               && !$$0.a(dkg.lp);
      }
   }

   private static boolean a(dgf $$0, ji $$1, dxq $$2, etv $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dgf $$0, ji $$1, dxq $$2, etv $$3) {
      return $$2.b() instanceof doz $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dhc var1);

   protected int a(dgz $$0, ji $$1, etw $$2, etw $$3) {
      return this.a($$0);
   }

   @Override
   public void b(ard $$0, ji $$1, dxq $$2, etw $$3) {
      if (!$$3.b()) {
         etw $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dkg.a.m();
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

   protected static int e(etw $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(etw $$0, dgf $$1, ji $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(etw $$0, dgf $$1, ji $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(etw $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(etw var1);

   @Override
   public fcr b(etw $$0, dgf $$1, ji $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? fco.b() : this.g.computeIfAbsent($$0, $$2x -> fco.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dxq a, dxq b, jn c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof etu.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final dgf b;
      private final ji c;
      private final Short2ObjectMap<dxq> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dgf $$1, final ji $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dxq a(ji $$0) {
         return this.a($$0, this.c($$0));
      }

      private dxq a(ji $$0, short $$1) {
         return (dxq)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(ji $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dxq $$2 = this.a($$0, $$1);
            ji $$3 = $$0.e();
            dxq $$4 = this.b.a_($$3);
            return etu.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(ji $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
