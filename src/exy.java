import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class exy extends exz {
   public static final ech a = ecg.l;
   public static final ecq b = ecg.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<exy.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<exy.a> $$0 = new Object2ByteLinkedOpenHashMap<exy.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eya, fgw> g = Maps.newIdentityHashMap();

   @Override
   protected void a(ebr.a<exz, eya> $$0) {
      $$0.a(a);
   }

   @Override
   public fgc a(djn $$0, iw $$1, eya $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      iw.a $$5 = new iw.a();

      for (jc $$6 : jc.c.a) {
         $$5.a($$1, $$6);
         eya $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  iw $$10 = $$5.e();
                  eya $$11 = $$0.b_($$10);
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

      fgc $$12 = new fgc($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jc $$13 : jc.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eya $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(djn $$0, iw $$1, jc $$2) {
      ebq $$3 = $$0.a_($$1);
      eya $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jc.b) {
         return true;
      } else {
         return $$3.b() instanceof drr ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(asb $$0, iw $$1, ebq $$2, eya $$3) {
      if (!$$3.c()) {
         iw $$4 = $$1.e();
         ebq $$5 = $$0.a_($$4);
         eya $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jc.a, $$4, $$5, $$6)) {
            eya $$7 = this.a($$0, $$4, $$5);
            exz $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jc.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jc.a, $$7);
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

   private void a(asb $$0, iw $$1, eya $$2, ebq $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jc, eya> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jc, eya> $$6 : $$5.entrySet()) {
            jc $$7 = $$6.getKey();
            eya $$8 = $$6.getValue();
            iw $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected eya a(asb $$0, iw $$1, ebq $$2) {
      int $$3 = 0;
      int $$4 = 0;
      iw.a $$5 = new iw.a();

      for (jc $$6 : jc.c.a) {
         iw $$7 = $$5.a($$1, $$6);
         ebq $$8 = $$0.a_($$7);
         eya $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         ebq $$10 = $$0.a_($$5.a($$1, jc.a));
         eya $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      iw $$12 = $$5.a($$1, jc.b);
      ebq $$13 = $$0.a_($$12);
      eya $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jc.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? eyb.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jc $$0, djn $$1, iw $$2, ebq $$3, iw $$4, ebq $$5) {
      fgw $$6 = $$5.g($$1, $$4);
      if ($$6 == fgt.b()) {
         return false;
      } else {
         fgw $$7 = $$3.g($$1, $$2);
         if ($$7 == fgt.b()) {
            return false;
         } else if ($$7 == fgt.a() && $$6 == fgt.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<exy.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            exy.a $$10;
            if ($$9 != null) {
               $$10 = new exy.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fgt.b($$7, $$6, $$0);
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

   public abstract exz d();

   public eya a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract exz e();

   public eya a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(asb var1);

   protected void a(dkk $$0, iw $$1, ebq $$2, jc $$3, eya $$4) {
      if ($$2.b() instanceof dsl $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dkk var1, iw var2, ebq var3);

   protected int a(dkm $$0, iw $$1, int $$2, jc $$3, ebq $$4, exy.b $$5) {
      int $$6 = 1000;

      for (jc $$7 : jc.c.a) {
         if ($$7 != $$3) {
            iw $$8 = $$1.a($$7);
            ebq $$9 = $$5.a($$8);
            eya $$10 = $$9.y();
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

   boolean a(djn $$0, iw $$1, ebq $$2, iw $$3, ebq $$4) {
      if (!a(jc.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(djn $$0, exz $$1, iw $$2, ebq $$3, jc $$4, iw $$5, ebq $$6, eya $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(djn $$0, iw $$1, ebq $$2, jc $$3, iw $$4, ebq $$5, eya $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(eya $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dkm var1);

   private int a(dkm $$0, iw $$1) {
      int $$2 = 0;

      for (jc $$3 : jc.c.a) {
         iw $$4 = $$1.a($$3);
         eya $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jc, eya> b(asb $$0, iw $$1, ebq $$2) {
      int $$3 = 1000;
      Map<jc, eya> $$4 = Maps.newEnumMap(jc.class);
      exy.b $$5 = null;

      for (jc $$6 : jc.c.a) {
         iw $$7 = $$1.a($$6);
         ebq $$8 = $$0.a_($$7);
         eya $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            eya $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new exy.b($$0, $$1);
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

   private static boolean a(ebq $$0) {
      dno $$1 = $$0.b();
      if ($$1 instanceof dsl) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dpv)
               && !$$0.a(axn.aA)
               && !$$0.a(dnq.da)
               && !$$0.a(dnq.ej)
               && !$$0.a(dnq.nJ)
               && !$$0.a(dnq.eu)
               && !$$0.a(dnq.fW)
               && !$$0.a(dnq.ll)
               && !$$0.a(dnq.lt);
      }
   }

   private static boolean a(djn $$0, iw $$1, ebq $$2, exz $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(djn $$0, iw $$1, ebq $$2, exz $$3) {
      return $$2.b() instanceof dsl $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dkm var1);

   protected int a(dkj $$0, iw $$1, eya $$2, eya $$3) {
      return this.a($$0);
   }

   @Override
   public void b(asb $$0, iw $$1, ebq $$2, eya $$3) {
      if (!$$3.b()) {
         eya $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dnq.a.m();
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

   protected static int e(eya $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean d(eya $$0, djn $$1, iw $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(eya $$0, djn $$1, iw $$2) {
      return d($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eya $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eya var1);

   @Override
   public fgw b(eya $$0, djn $$1, iw $$2) {
      return $$0.e() == 9 && d($$0, $$1, $$2) ? fgt.b() : this.g.computeIfAbsent($$0, $$2x -> fgt.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(ebq a, ebq b, jc c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof exy.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final djn b;
      private final iw c;
      private final Short2ObjectMap<ebq> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final djn $$1, final iw $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public ebq a(iw $$0) {
         return this.a($$0, this.c($$0));
      }

      private ebq a(iw $$0, short $$1) {
         return (ebq)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(iw $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            ebq $$2 = this.a($$0, $$1);
            iw $$3 = $$0.e();
            ebq $$4 = this.b.a_($$3);
            return exy.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(iw $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
