import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eil extends eim {
   public static final dnq a = dnp.i;
   public static final dnz b = dnp.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<daa.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<daa.a> $$0 = new Object2ByteLinkedOpenHashMap<daa.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ein, eqk> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dna.a<eim, ein> $$0) {
      $$0.a(a);
   }

   @Override
   public epr a(cwf $$0, ib $$1, ein $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ib.a $$5 = new ib.a();

      for (ih $$6 : ih.c.a) {
         $$5.a($$1, $$6);
         ein $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ib $$10 = $$5.d();
                  ein $$11 = $$0.b_($$10);
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

      epr $$12 = new epr($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ih $$13 : ih.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ein $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cwf $$0, ib $$1, ih $$2) {
      dmz $$3 = $$0.a_($$1);
      ein $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ih.b) {
         return true;
      } else {
         return $$3.b() instanceof ddx ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cwz $$0, ib $$1, ein $$2) {
      if (!$$2.c()) {
         dmz $$3 = $$0.a_($$1);
         ib $$4 = $$1.d();
         dmz $$5 = $$0.a_($$4);
         ein $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ih.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ih.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cwz $$0, ib $$1, ein $$2, dmz $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ih, ein> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ih, ein> $$6 : $$5.entrySet()) {
            ih $$7 = $$6.getKey();
            ein $$8 = $$6.getValue();
            ib $$9 = $$1.a($$7);
            dmz $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected ein a(cwz $$0, ib $$1, dmz $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ih $$5 : ih.c.a) {
         ib $$6 = $$1.a($$5);
         dmz $$7 = $$0.a_($$6);
         ein $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dmz $$9 = $$0.a_($$1.d());
         ein $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      ib $$11 = $$1.c();
      dmz $$12 = $$0.a_($$11);
      ein $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ih.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eio.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ih $$0, cwf $$1, ib $$2, dmz $$3, ib $$4, dmz $$5) {
      Object2ByteLinkedOpenHashMap<daa.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      daa.a $$8;
      if ($$7 != null) {
         $$8 = new daa.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      eqk $$11 = $$3.k($$1, $$2);
      eqk $$12 = $$5.k($$1, $$4);
      boolean $$13 = !eqh.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eim d();

   public ein a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eim e();

   public ein a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cwz var1);

   protected void a(cxa $$0, ib $$1, dmz $$2, ih $$3, ein $$4) {
      if ($$2.b() instanceof deq) {
         ((deq)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cxa var1, ib var2, dmz var3);

   private static short a(ib $$0, ib $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cxc $$0, ib $$1, int $$2, ih $$3, dmz $$4, ib $$5, Short2ObjectMap<Pair<dmz, ein>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ih $$9 : ih.c.a) {
         if ($$9 != $$3) {
            ib $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dmz, ein> $$12 = (Pair<dmz, ein>)$$6.computeIfAbsent($$11, $$2x -> {
               dmz $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dmz $$13 = (dmz)$$12.getFirst();
            ein $$14 = (ein)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  ib $$4x = $$10.d();
                  dmz $$5x = $$0.a_($$4x);
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

   private boolean a(cwf $$0, eim $$1, ib $$2, dmz $$3, ib $$4, dmz $$5) {
      if (!this.a(ih.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cwf $$0, eim $$1, ib $$2, dmz $$3, ih $$4, ib $$5, dmz $$6, ein $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(ein $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cxc var1);

   private int a(cxc $$0, ib $$1) {
      int $$2 = 0;

      for (ih $$3 : ih.c.a) {
         ib $$4 = $$1.a($$3);
         ein $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ih, ein> b(cwz $$0, ib $$1, dmz $$2) {
      int $$3 = 1000;
      Map<ih, ein> $$4 = Maps.newEnumMap(ih.class);
      Short2ObjectMap<Pair<dmz, ein>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ih $$7 : ih.c.a) {
         ib $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dmz, ein> $$10 = (Pair<dmz, ein>)$$5.computeIfAbsent($$9, $$2x -> {
            dmz $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dmz $$11 = (dmz)$$10.getFirst();
         ein $$12 = (ein)$$10.getSecond();
         ein $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            ib $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dmz $$5x = $$0.a_($$14);
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

   private boolean a(cwf $$0, ib $$1, dmz $$2, eim $$3) {
      daa $$4 = $$2.b();
      if ($$4 instanceof deq $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dcg || $$2.a(aun.ax) || $$2.a(dac.cO) || $$2.a(dac.dS) || $$2.a(dac.nd)) {
         return false;
      } else {
         return !$$2.a(dac.ed) && !$$2.a(dac.fx) && !$$2.a(dac.kF) && !$$2.a(dac.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cwf $$0, ib $$1, dmz $$2, ih $$3, ib $$4, dmz $$5, ein $$6, eim $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cxc var1);

   protected int a(cwz $$0, ib $$1, ein $$2, ein $$3) {
      return this.a((cxc)$$0);
   }

   @Override
   public void b(cwz $$0, ib $$1, ein $$2) {
      if (!$$2.b()) {
         ein $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dac.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dmz $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(ein $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(ein $$0, cwf $$1, ib $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(ein $$0, cwf $$1, ib $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ein $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ein var1);

   @Override
   public eqk b(ein $$0, cwf $$1, ib $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eqh.b() : this.g.computeIfAbsent($$0, $$2x -> eqh.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
