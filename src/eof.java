import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eof extends eog {
   public static final dtb a = dta.i;
   public static final dtk b = dta.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfh.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfh.a> $$0 = new Object2ByteLinkedOpenHashMap<dfh.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eoh, ewy> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dsl.a<eog, eoh> $$0) {
      $$0.a(a);
   }

   @Override
   public ewf a(dbl $$0, ja $$1, eoh $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ja.a $$5 = new ja.a();

      for (jf $$6 : jf.c.a) {
         $$5.a($$1, $$6);
         eoh $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ja $$10 = $$5.d();
                  eoh $$11 = $$0.b_($$10);
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

      ewf $$12 = new ewf($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jf $$13 : jf.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eoh $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dbl $$0, ja $$1, jf $$2) {
      dsk $$3 = $$0.a_($$1);
      eoh $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jf.b) {
         return true;
      } else {
         return $$3.b() instanceof djf ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dcf $$0, ja $$1, eoh $$2) {
      if (!$$2.c()) {
         dsk $$3 = $$0.a_($$1);
         ja $$4 = $$1.d();
         dsk $$5 = $$0.a_($$4);
         eoh $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, jf.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, jf.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(dcf $$0, ja $$1, eoh $$2, dsk $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jf, eoh> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jf, eoh> $$6 : $$5.entrySet()) {
            jf $$7 = $$6.getKey();
            eoh $$8 = $$6.getValue();
            ja $$9 = $$1.a($$7);
            dsk $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eoh a(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (jf $$5 : jf.c.a) {
         ja $$6 = $$1.a($$5);
         dsk $$7 = $$0.a_($$6);
         eoh $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dsk $$9 = $$0.a_($$1.d());
         eoh $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      ja $$11 = $$1.c();
      dsk $$12 = $$0.a_($$11);
      eoh $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(jf.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eoi.a.g() : this.a($$14, false);
      }
   }

   private boolean a(jf $$0, dbl $$1, ja $$2, dsk $$3, ja $$4, dsk $$5) {
      Object2ByteLinkedOpenHashMap<dfh.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dfh.a $$8;
      if ($$7 != null) {
         $$8 = new dfh.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ewy $$11 = $$3.k($$1, $$2);
      ewy $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ewv.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eog d();

   public eoh a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eog e();

   public eoh a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dcf var1);

   protected void a(dcg $$0, ja $$1, dsk $$2, jf $$3, eoh $$4) {
      if ($$2.b() instanceof djy) {
         ((djy)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dcg var1, ja var2, dsk var3);

   private static short a(ja $$0, ja $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dci $$0, ja $$1, int $$2, jf $$3, dsk $$4, ja $$5, Short2ObjectMap<Pair<dsk, eoh>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (jf $$9 : jf.c.a) {
         if ($$9 != $$3) {
            ja $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dsk, eoh> $$12 = (Pair<dsk, eoh>)$$6.computeIfAbsent($$11, $$2x -> {
               dsk $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dsk $$13 = (dsk)$$12.getFirst();
            eoh $$14 = (eoh)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  ja $$4x = $$10.d();
                  dsk $$5x = $$0.a_($$4x);
                  return this.a($$0, this.d(), $$10, $$13, $$4x, $$5x);
               });
               if ($$15) {
                  return $$2;
               }

               if ($$2 < this.b($$0)) {
                  int $$16 = this.a($$0, $$10, $$2 + 1, $$9.g(), $$13, $$5, $$6, $$7);
                  if ($$16 < $$8) {
                     $$8 = $$16;
                  }
               }
            }
         }
      }

      return $$8;
   }

   private boolean a(dbl $$0, eog $$1, ja $$2, dsk $$3, ja $$4, dsk $$5) {
      if (!this.a(jf.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dbl $$0, eog $$1, ja $$2, dsk $$3, jf $$4, ja $$5, dsk $$6, eoh $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eoh $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dci var1);

   private int a(dci $$0, ja $$1) {
      int $$2 = 0;

      for (jf $$3 : jf.c.a) {
         ja $$4 = $$1.a($$3);
         eoh $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jf, eoh> b(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = 1000;
      Map<jf, eoh> $$4 = Maps.newEnumMap(jf.class);
      Short2ObjectMap<Pair<dsk, eoh>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (jf $$7 : jf.c.a) {
         ja $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dsk, eoh> $$10 = (Pair<dsk, eoh>)$$5.computeIfAbsent($$9, $$2x -> {
            dsk $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dsk $$11 = (dsk)$$10.getFirst();
         eoh $$12 = (eoh)$$10.getSecond();
         eoh $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            ja $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dsk $$5x = $$0.a_($$14);
               return this.a($$0, this.d(), $$8, $$11, $$14, $$5x);
            });
            int $$16;
            if ($$15) {
               $$16 = 0;
            } else {
               $$16 = this.a($$0, $$8, 1, $$7.g(), $$11, $$1, $$5, $$6);
            }

            if ($$16 < $$3) {
               $$4.clear();
            }

            if ($$16 <= $$3) {
               $$4.put($$7, $$13);
               $$3 = $$16;
            }
         }
      }

      return $$4;
   }

   private boolean a(dbl $$0, ja $$1, dsk $$2, eog $$3) {
      dfh $$4 = $$2.b();
      if ($$4 instanceof djy $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dhn || $$2.a(avw.ax) || $$2.a(dfj.cO) || $$2.a(dfj.dS) || $$2.a(dfj.nd)) {
         return false;
      } else {
         return !$$2.a(dfj.ed) && !$$2.a(dfj.fx) && !$$2.a(dfj.kF) && !$$2.a(dfj.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(dbl $$0, ja $$1, dsk $$2, jf $$3, ja $$4, dsk $$5, eoh $$6, eog $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dci var1);

   protected int a(dcf $$0, ja $$1, eoh $$2, eoh $$3) {
      return this.a((dci)$$0);
   }

   @Override
   public void b(dcf $$0, ja $$1, eoh $$2) {
      if (!$$2.b()) {
         eoh $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dfj.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dsk $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eoh $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eoh $$0, dbl $$1, ja $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eoh $$0, dbl $$1, ja $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eoh $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eoh var1);

   @Override
   public ewy b(eoh $$0, dbl $$1, ja $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ewv.b() : this.g.computeIfAbsent($$0, $$2x -> ewv.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
