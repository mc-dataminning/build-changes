import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ewm extends ewn {
   public static final eay a = eax.l;
   public static final ebh b = eax.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<ewm.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<ewm.a> $$0 = new Object2ByteLinkedOpenHashMap<ewm.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ewo, ffk> g = Maps.newIdentityHashMap();

   @Override
   protected void a(eai.a<ewn, ewo> $$0) {
      $$0.a(a);
   }

   @Override
   public feq a(dig $$0, iu $$1, ewo $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         $$5.a($$1, $$6);
         ewo $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  iu $$10 = $$5.e();
                  ewo $$11 = $$0.b_($$10);
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

      feq $$12 = new feq($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ja $$13 : ja.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ewo $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dig $$0, iu $$1, ja $$2) {
      eah $$3 = $$0.a_($$1);
      ewo $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ja.b) {
         return true;
      } else {
         return $$3.b() instanceof dqi ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(arq $$0, iu $$1, eah $$2, ewo $$3) {
      if (!$$3.c()) {
         iu $$4 = $$1.e();
         eah $$5 = $$0.a_($$4);
         ewo $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, ja.a, $$4, $$5, $$6)) {
            ewo $$7 = this.a($$0, $$4, $$5);
            ewn $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, ja.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, ja.a, $$7);
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

   private void a(arq $$0, iu $$1, ewo $$2, eah $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ja, ewo> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ja, ewo> $$6 : $$5.entrySet()) {
            ja $$7 = $$6.getKey();
            ewo $$8 = $$6.getValue();
            iu $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected ewo a(arq $$0, iu $$1, eah $$2) {
      int $$3 = 0;
      int $$4 = 0;
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         iu $$7 = $$5.a($$1, $$6);
         eah $$8 = $$0.a_($$7);
         ewo $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         eah $$10 = $$0.a_($$5.a($$1, ja.a));
         ewo $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      iu $$12 = $$5.a($$1, ja.b);
      eah $$13 = $$0.a_($$12);
      ewo $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(ja.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? ewp.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(ja $$0, dig $$1, iu $$2, eah $$3, iu $$4, eah $$5) {
      ffk $$6 = $$5.g($$1, $$4);
      if ($$6 == ffh.b()) {
         return false;
      } else {
         ffk $$7 = $$3.g($$1, $$2);
         if ($$7 == ffh.b()) {
            return false;
         } else if ($$7 == ffh.a() && $$6 == ffh.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<ewm.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            ewm.a $$10;
            if ($$9 != null) {
               $$10 = new ewm.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !ffh.b($$7, $$6, $$0);
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

   public abstract ewn d();

   public ewo a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract ewn e();

   public ewo a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(arq var1);

   protected void a(djb $$0, iu $$1, eah $$2, ja $$3, ewo $$4) {
      if ($$2.b() instanceof drc $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(djb var1, iu var2, eah var3);

   protected int a(djd $$0, iu $$1, int $$2, ja $$3, eah $$4, ewm.b $$5) {
      int $$6 = 1000;

      for (ja $$7 : ja.c.a) {
         if ($$7 != $$3) {
            iu $$8 = $$1.a($$7);
            eah $$9 = $$5.a($$8);
            ewo $$10 = $$9.y();
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

   boolean a(dig $$0, iu $$1, eah $$2, iu $$3, eah $$4) {
      if (!a(ja.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dig $$0, ewn $$1, iu $$2, eah $$3, ja $$4, iu $$5, eah $$6, ewo $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dig $$0, iu $$1, eah $$2, ja $$3, iu $$4, eah $$5, ewo $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(ewo $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(djd var1);

   private int a(djd $$0, iu $$1) {
      int $$2 = 0;

      for (ja $$3 : ja.c.a) {
         iu $$4 = $$1.a($$3);
         ewo $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ja, ewo> b(arq $$0, iu $$1, eah $$2) {
      int $$3 = 1000;
      Map<ja, ewo> $$4 = Maps.newEnumMap(ja.class);
      ewm.b $$5 = null;

      for (ja $$6 : ja.c.a) {
         iu $$7 = $$1.a($$6);
         eah $$8 = $$0.a_($$7);
         ewo $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            ewo $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new ewm.b($$0, $$1);
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

   private static boolean a(eah $$0) {
      dmf $$1 = $$0.b();
      if ($$1 instanceof drc) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dom)
               && !$$0.a(axc.aA)
               && !$$0.a(dmh.da)
               && !$$0.a(dmh.ej)
               && !$$0.a(dmh.nJ)
               && !$$0.a(dmh.eu)
               && !$$0.a(dmh.fW)
               && !$$0.a(dmh.ll)
               && !$$0.a(dmh.lt);
      }
   }

   private static boolean a(dig $$0, iu $$1, eah $$2, ewn $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dig $$0, iu $$1, eah $$2, ewn $$3) {
      return $$2.b() instanceof drc $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(djd var1);

   protected int a(dja $$0, iu $$1, ewo $$2, ewo $$3) {
      return this.a($$0);
   }

   @Override
   public void b(arq $$0, iu $$1, eah $$2, ewo $$3) {
      if (!$$3.b()) {
         ewo $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dmh.a.m();
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

   protected static int e(ewo $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean d(ewo $$0, dig $$1, iu $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(ewo $$0, dig $$1, iu $$2) {
      return d($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ewo $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ewo var1);

   @Override
   public ffk b(ewo $$0, dig $$1, iu $$2) {
      return $$0.e() == 9 && d($$0, $$1, $$2) ? ffh.b() : this.g.computeIfAbsent($$0, $$2x -> ffh.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(eah a, eah b, ja c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof ewm.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final dig b;
      private final iu c;
      private final Short2ObjectMap<eah> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dig $$1, final iu $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public eah a(iu $$0) {
         return this.a($$0, this.c($$0));
      }

      private eah a(iu $$0, short $$1) {
         return (eah)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(iu $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            eah $$2 = this.a($$0, $$1);
            iu $$3 = $$0.e();
            eah $$4 = this.b.a_($$3);
            return ewm.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(iu $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
