import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class evt extends evu {
   public static final eaf a = eae.l;
   public static final eao b = eae.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<evt.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<evt.a> $$0 = new Object2ByteLinkedOpenHashMap<evt.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<evv, feq> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dzp.a<evu, evv> $$0) {
      $$0.a(a);
   }

   @Override
   public fdw a(dhv $$0, iu $$1, evv $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         $$5.a($$1, $$6);
         evv $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  iu $$10 = $$5.e();
                  evv $$11 = $$0.b_($$10);
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

      fdw $$12 = new fdw($$3, 0.0, $$4);
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

   private boolean g(evv $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dhv $$0, iu $$1, ja $$2) {
      dzo $$3 = $$0.a_($$1);
      evv $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ja.b) {
         return true;
      } else {
         return $$3.b() instanceof dpv ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(aro $$0, iu $$1, dzo $$2, evv $$3) {
      if (!$$3.c()) {
         iu $$4 = $$1.e();
         dzo $$5 = $$0.a_($$4);
         evv $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, ja.a, $$4, $$5, $$6)) {
            evv $$7 = this.a($$0, $$4, $$5);
            evu $$8 = $$7.a();
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

   private void a(aro $$0, iu $$1, evv $$2, dzo $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ja, evv> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ja, evv> $$6 : $$5.entrySet()) {
            ja $$7 = $$6.getKey();
            evv $$8 = $$6.getValue();
            iu $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected evv a(aro $$0, iu $$1, dzo $$2) {
      int $$3 = 0;
      int $$4 = 0;
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         iu $$7 = $$5.a($$1, $$6);
         dzo $$8 = $$0.a_($$7);
         evv $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dzo $$10 = $$0.a_($$5.a($$1, ja.a));
         evv $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      iu $$12 = $$5.a($$1, ja.b);
      dzo $$13 = $$0.a_($$12);
      evv $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(ja.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? evw.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(ja $$0, dhv $$1, iu $$2, dzo $$3, iu $$4, dzo $$5) {
      feq $$6 = $$5.g($$1, $$4);
      if ($$6 == fen.b()) {
         return false;
      } else {
         feq $$7 = $$3.g($$1, $$2);
         if ($$7 == fen.b()) {
            return false;
         } else if ($$7 == fen.a() && $$6 == fen.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<evt.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            evt.a $$10;
            if ($$9 != null) {
               $$10 = new evt.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fen.b($$7, $$6, $$0);
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

   public abstract evu d();

   public evv a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract evu e();

   public evv a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(aro var1);

   protected void a(diq $$0, iu $$1, dzo $$2, ja $$3, evv $$4) {
      if ($$2.b() instanceof dqp $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(diq var1, iu var2, dzo var3);

   protected int a(dis $$0, iu $$1, int $$2, ja $$3, dzo $$4, evt.b $$5) {
      int $$6 = 1000;

      for (ja $$7 : ja.c.a) {
         if ($$7 != $$3) {
            iu $$8 = $$1.a($$7);
            dzo $$9 = $$5.a($$8);
            evv $$10 = $$9.y();
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

   boolean a(dhv $$0, iu $$1, dzo $$2, iu $$3, dzo $$4) {
      if (!a(ja.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dhv $$0, evu $$1, iu $$2, dzo $$3, ja $$4, iu $$5, dzo $$6, evv $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dhv $$0, iu $$1, dzo $$2, ja $$3, iu $$4, dzo $$5, evv $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(evv $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dis var1);

   private int a(dis $$0, iu $$1) {
      int $$2 = 0;

      for (ja $$3 : ja.c.a) {
         iu $$4 = $$1.a($$3);
         evv $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ja, evv> b(aro $$0, iu $$1, dzo $$2) {
      int $$3 = 1000;
      Map<ja, evv> $$4 = Maps.newEnumMap(ja.class);
      evt.b $$5 = null;

      for (ja $$6 : ja.c.a) {
         iu $$7 = $$1.a($$6);
         dzo $$8 = $$0.a_($$7);
         evv $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            evv $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new evt.b($$0, $$1);
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

   private static boolean a(dzo $$0) {
      dlu $$1 = $$0.b();
      if ($$1 instanceof dqp) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dob)
               && !$$0.a(axa.aA)
               && !$$0.a(dlw.cX)
               && !$$0.a(dlw.ef)
               && !$$0.a(dlw.nF)
               && !$$0.a(dlw.eq)
               && !$$0.a(dlw.fS)
               && !$$0.a(dlw.lh)
               && !$$0.a(dlw.lp);
      }
   }

   private static boolean a(dhv $$0, iu $$1, dzo $$2, evu $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dhv $$0, iu $$1, dzo $$2, evu $$3) {
      return $$2.b() instanceof dqp $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dis var1);

   protected int a(dip $$0, iu $$1, evv $$2, evv $$3) {
      return this.a($$0);
   }

   @Override
   public void b(aro $$0, iu $$1, dzo $$2, evv $$3) {
      if (!$$3.b()) {
         evv $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dlw.a.m();
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

   protected static int e(evv $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean d(evv $$0, dhv $$1, iu $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(evv $$0, dhv $$1, iu $$2) {
      return d($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(evv $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(evv var1);

   @Override
   public feq b(evv $$0, dhv $$1, iu $$2) {
      return $$0.e() == 9 && d($$0, $$1, $$2) ? fen.b() : this.g.computeIfAbsent($$0, $$2x -> fen.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dzo a, dzo b, ja c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof evt.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final dhv b;
      private final iu c;
      private final Short2ObjectMap<dzo> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dhv $$1, final iu $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dzo a(iu $$0) {
         return this.a($$0, this.c($$0));
      }

      private dzo a(iu $$0, short $$1) {
         return (dzo)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(iu $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dzo $$2 = this.a($$0, $$1);
            iu $$3 = $$0.e();
            dzo $$4 = this.b.a_($$3);
            return evt.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(iu $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
