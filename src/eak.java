import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eak extends eal {
   public static final dga a = dfz.i;
   public static final dgj b = dfz.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csv.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csv.a> $$0 = new Object2ByteLinkedOpenHashMap<csv.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eam, eig> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dfk.a<eal, eam> $$0) {
      $$0.a(a);
   }

   @Override
   public ehn a(cpb $$0, gw $$1, eam $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      gw.a $$5 = new gw.a();

      for (hc $$6 : hc.c.a) {
         $$5.a($$1, $$6);
         eam $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  gw $$10 = $$5.d();
                  eam $$11 = $$0.b_($$10);
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

      ehn $$12 = new ehn($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (hc $$13 : hc.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eam $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cpb $$0, gw $$1, hc $$2) {
      dfj $$3 = $$0.a_($$1);
      eam $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == hc.b) {
         return true;
      } else {
         return $$3.b() instanceof cwq ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cpv $$0, gw $$1, eam $$2) {
      if (!$$2.c()) {
         dfj $$3 = $$0.a_($$1);
         gw $$4 = $$1.d();
         dfj $$5 = $$0.a_($$4);
         eam $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, hc.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, hc.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cpv $$0, gw $$1, eam $$2, dfj $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<hc, eam> $$5 = this.b($$0, $$1, $$3);

         for (Entry<hc, eam> $$6 : $$5.entrySet()) {
            hc $$7 = $$6.getKey();
            eam $$8 = $$6.getValue();
            gw $$9 = $$1.a($$7);
            dfj $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eam a(cpv $$0, gw $$1, dfj $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (hc $$5 : hc.c.a) {
         gw $$6 = $$1.a($$5);
         dfj $$7 = $$0.a_($$6);
         eam $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dfj $$9 = $$0.a_($$1.d());
         eam $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      gw $$11 = $$1.c();
      dfj $$12 = $$0.a_($$11);
      eam $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(hc.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? ean.a.g() : this.a($$14, false);
      }
   }

   private boolean a(hc $$0, cpb $$1, gw $$2, dfj $$3, gw $$4, dfj $$5) {
      Object2ByteLinkedOpenHashMap<csv.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      csv.a $$8;
      if ($$7 != null) {
         $$8 = new csv.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      eig $$11 = $$3.k($$1, $$2);
      eig $$12 = $$5.k($$1, $$4);
      boolean $$13 = !eid.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eal d();

   public eam a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eal e();

   public eam a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cpv var1);

   protected void a(cpw $$0, gw $$1, dfj $$2, hc $$3, eam $$4) {
      if ($$2.b() instanceof cxj) {
         ((cxj)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cpw var1, gw var2, dfj var3);

   private static short a(gw $$0, gw $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cpy $$0, gw $$1, int $$2, hc $$3, dfj $$4, gw $$5, Short2ObjectMap<Pair<dfj, eam>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (hc $$9 : hc.c.a) {
         if ($$9 != $$3) {
            gw $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dfj, eam> $$12 = (Pair<dfj, eam>)$$6.computeIfAbsent($$11, $$2x -> {
               dfj $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dfj $$13 = (dfj)$$12.getFirst();
            eam $$14 = (eam)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  gw $$4x = $$10.d();
                  dfj $$5x = $$0.a_($$4x);
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

   private boolean a(cpb $$0, eal $$1, gw $$2, dfj $$3, gw $$4, dfj $$5) {
      if (!this.a(hc.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cpb $$0, eal $$1, gw $$2, dfj $$3, hc $$4, gw $$5, dfj $$6, eam $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eam $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cpy var1);

   private int a(cpy $$0, gw $$1) {
      int $$2 = 0;

      for (hc $$3 : hc.c.a) {
         gw $$4 = $$1.a($$3);
         eam $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<hc, eam> b(cpv $$0, gw $$1, dfj $$2) {
      int $$3 = 1000;
      Map<hc, eam> $$4 = Maps.newEnumMap(hc.class);
      Short2ObjectMap<Pair<dfj, eam>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (hc $$7 : hc.c.a) {
         gw $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dfj, eam> $$10 = (Pair<dfj, eam>)$$5.computeIfAbsent($$9, $$2x -> {
            dfj $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dfj $$11 = (dfj)$$10.getFirst();
         eam $$12 = (eam)$$10.getSecond();
         eam $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            gw $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dfj $$5x = $$0.a_($$14);
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

   private boolean a(cpb $$0, gw $$1, dfj $$2, eal $$3) {
      csv $$4 = $$2.b();
      if ($$4 instanceof cxj $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cux || $$2.a(apt.aw) || $$2.a(csw.cO) || $$2.a(csw.dS) || $$2.a(csw.nd)) {
         return false;
      } else {
         return !$$2.a(csw.ee) && !$$2.a(csw.fx) && !$$2.a(csw.kF) && !$$2.a(csw.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cpb $$0, gw $$1, dfj $$2, hc $$3, gw $$4, dfj $$5, eam $$6, eal $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cpy var1);

   protected int a(cpv $$0, gw $$1, eam $$2, eam $$3) {
      return this.a((cpy)$$0);
   }

   @Override
   public void b(cpv $$0, gw $$1, eam $$2) {
      if (!$$2.b()) {
         eam $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, csw.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dfj $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eam $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eam $$0, cpb $$1, gw $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eam $$0, cpb $$1, gw $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eam $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eam var1);

   @Override
   public eig b(eam $$0, cpb $$1, gw $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eid.b() : this.g.computeIfAbsent($$0, $$2x -> eid.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
