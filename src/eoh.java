import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eoh extends eoi {
   public static final dtc a = dtb.i;
   public static final dtl b = dtb.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfi.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfi.a> $$0 = new Object2ByteLinkedOpenHashMap<dfi.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eoj, exa> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dsm.a<eoi, eoj> $$0) {
      $$0.a(a);
   }

   @Override
   public ewh a(dbm $$0, ja $$1, eoj $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ja.a $$5 = new ja.a();

      for (jf $$6 : jf.c.a) {
         $$5.a($$1, $$6);
         eoj $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ja $$10 = $$5.d();
                  eoj $$11 = $$0.b_($$10);
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

      ewh $$12 = new ewh($$3, 0.0, $$4);
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

   private boolean g(eoj $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dbm $$0, ja $$1, jf $$2) {
      dsl $$3 = $$0.a_($$1);
      eoj $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jf.b) {
         return true;
      } else {
         return $$3.b() instanceof djg ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dcg $$0, ja $$1, eoj $$2) {
      if (!$$2.c()) {
         dsl $$3 = $$0.a_($$1);
         ja $$4 = $$1.d();
         dsl $$5 = $$0.a_($$4);
         eoj $$6 = this.a($$0, $$4, $$5);
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

   private void a(dcg $$0, ja $$1, eoj $$2, dsl $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jf, eoj> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jf, eoj> $$6 : $$5.entrySet()) {
            jf $$7 = $$6.getKey();
            eoj $$8 = $$6.getValue();
            ja $$9 = $$1.a($$7);
            dsl $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eoj a(dcg $$0, ja $$1, dsl $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (jf $$5 : jf.c.a) {
         ja $$6 = $$1.a($$5);
         dsl $$7 = $$0.a_($$6);
         eoj $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dsl $$9 = $$0.a_($$1.d());
         eoj $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      ja $$11 = $$1.c();
      dsl $$12 = $$0.a_($$11);
      eoj $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(jf.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eok.a.g() : this.a($$14, false);
      }
   }

   private boolean a(jf $$0, dbm $$1, ja $$2, dsl $$3, ja $$4, dsl $$5) {
      Object2ByteLinkedOpenHashMap<dfi.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dfi.a $$8;
      if ($$7 != null) {
         $$8 = new dfi.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      exa $$11 = $$3.k($$1, $$2);
      exa $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ewx.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eoi d();

   public eoj a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eoi e();

   public eoj a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dcg var1);

   protected void a(dch $$0, ja $$1, dsl $$2, jf $$3, eoj $$4) {
      if ($$2.b() instanceof djz) {
         ((djz)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dch var1, ja var2, dsl var3);

   private static short a(ja $$0, ja $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dcj $$0, ja $$1, int $$2, jf $$3, dsl $$4, ja $$5, Short2ObjectMap<Pair<dsl, eoj>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (jf $$9 : jf.c.a) {
         if ($$9 != $$3) {
            ja $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dsl, eoj> $$12 = (Pair<dsl, eoj>)$$6.computeIfAbsent($$11, $$2x -> {
               dsl $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dsl $$13 = (dsl)$$12.getFirst();
            eoj $$14 = (eoj)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  ja $$4x = $$10.d();
                  dsl $$5x = $$0.a_($$4x);
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

   private boolean a(dbm $$0, eoi $$1, ja $$2, dsl $$3, ja $$4, dsl $$5) {
      if (!this.a(jf.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dbm $$0, eoi $$1, ja $$2, dsl $$3, jf $$4, ja $$5, dsl $$6, eoj $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eoj $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dcj var1);

   private int a(dcj $$0, ja $$1) {
      int $$2 = 0;

      for (jf $$3 : jf.c.a) {
         ja $$4 = $$1.a($$3);
         eoj $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jf, eoj> b(dcg $$0, ja $$1, dsl $$2) {
      int $$3 = 1000;
      Map<jf, eoj> $$4 = Maps.newEnumMap(jf.class);
      Short2ObjectMap<Pair<dsl, eoj>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (jf $$7 : jf.c.a) {
         ja $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dsl, eoj> $$10 = (Pair<dsl, eoj>)$$5.computeIfAbsent($$9, $$2x -> {
            dsl $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dsl $$11 = (dsl)$$10.getFirst();
         eoj $$12 = (eoj)$$10.getSecond();
         eoj $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            ja $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dsl $$5x = $$0.a_($$14);
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

   private boolean a(dbm $$0, ja $$1, dsl $$2, eoi $$3) {
      dfi $$4 = $$2.b();
      if ($$4 instanceof djz $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dho || $$2.a(avw.ax) || $$2.a(dfk.cO) || $$2.a(dfk.dS) || $$2.a(dfk.nd)) {
         return false;
      } else {
         return !$$2.a(dfk.ed) && !$$2.a(dfk.fx) && !$$2.a(dfk.kF) && !$$2.a(dfk.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(dbm $$0, ja $$1, dsl $$2, jf $$3, ja $$4, dsl $$5, eoj $$6, eoi $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dcj var1);

   protected int a(dcg $$0, ja $$1, eoj $$2, eoj $$3) {
      return this.a((dcj)$$0);
   }

   @Override
   public void b(dcg $$0, ja $$1, eoj $$2) {
      if (!$$2.b()) {
         eoj $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dfk.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dsl $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eoj $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eoj $$0, dbm $$1, ja $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eoj $$0, dbm $$1, ja $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eoj $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eoj var1);

   @Override
   public exa b(eoj $$0, dbm $$1, ja $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ewx.b() : this.g.computeIfAbsent($$0, $$2x -> ewx.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
