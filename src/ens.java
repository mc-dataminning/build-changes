import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ens extends ent {
   public static final dss a = dsr.i;
   public static final dtb b = dsr.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dey.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dey.a> $$0 = new Object2ByteLinkedOpenHashMap<dey.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<enu, ewj> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dsc.a<ent, enu> $$0) {
      $$0.a(a);
   }

   @Override
   public evq a(dbd $$0, iz $$1, enu $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      iz.a $$5 = new iz.a();

      for (je $$6 : je.c.a) {
         $$5.a($$1, $$6);
         enu $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  iz $$10 = $$5.d();
                  enu $$11 = $$0.b_($$10);
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

      evq $$12 = new evq($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (je $$13 : je.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(enu $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dbd $$0, iz $$1, je $$2) {
      dsb $$3 = $$0.a_($$1);
      enu $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == je.b) {
         return true;
      } else {
         return $$3.b() instanceof diw ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dbx $$0, iz $$1, enu $$2) {
      if (!$$2.c()) {
         dsb $$3 = $$0.a_($$1);
         iz $$4 = $$1.d();
         dsb $$5 = $$0.a_($$4);
         enu $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, je.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, je.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(dbx $$0, iz $$1, enu $$2, dsb $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<je, enu> $$5 = this.b($$0, $$1, $$3);

         for (Entry<je, enu> $$6 : $$5.entrySet()) {
            je $$7 = $$6.getKey();
            enu $$8 = $$6.getValue();
            iz $$9 = $$1.a($$7);
            dsb $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected enu a(dbx $$0, iz $$1, dsb $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (je $$5 : je.c.a) {
         iz $$6 = $$1.a($$5);
         dsb $$7 = $$0.a_($$6);
         enu $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dsb $$9 = $$0.a_($$1.d());
         enu $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      iz $$11 = $$1.c();
      dsb $$12 = $$0.a_($$11);
      enu $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(je.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? env.a.g() : this.a($$14, false);
      }
   }

   private boolean a(je $$0, dbd $$1, iz $$2, dsb $$3, iz $$4, dsb $$5) {
      Object2ByteLinkedOpenHashMap<dey.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dey.a $$8;
      if ($$7 != null) {
         $$8 = new dey.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ewj $$11 = $$3.k($$1, $$2);
      ewj $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ewg.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract ent d();

   public enu a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract ent e();

   public enu a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dbx var1);

   protected void a(dby $$0, iz $$1, dsb $$2, je $$3, enu $$4) {
      if ($$2.b() instanceof djp) {
         ((djp)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dby var1, iz var2, dsb var3);

   private static short a(iz $$0, iz $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dca $$0, iz $$1, int $$2, je $$3, dsb $$4, iz $$5, Short2ObjectMap<Pair<dsb, enu>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (je $$9 : je.c.a) {
         if ($$9 != $$3) {
            iz $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dsb, enu> $$12 = (Pair<dsb, enu>)$$6.computeIfAbsent($$11, $$2x -> {
               dsb $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dsb $$13 = (dsb)$$12.getFirst();
            enu $$14 = (enu)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  iz $$4x = $$10.d();
                  dsb $$5x = $$0.a_($$4x);
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

   private boolean a(dbd $$0, ent $$1, iz $$2, dsb $$3, iz $$4, dsb $$5) {
      if (!this.a(je.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dbd $$0, ent $$1, iz $$2, dsb $$3, je $$4, iz $$5, dsb $$6, enu $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(enu $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dca var1);

   private int a(dca $$0, iz $$1) {
      int $$2 = 0;

      for (je $$3 : je.c.a) {
         iz $$4 = $$1.a($$3);
         enu $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<je, enu> b(dbx $$0, iz $$1, dsb $$2) {
      int $$3 = 1000;
      Map<je, enu> $$4 = Maps.newEnumMap(je.class);
      Short2ObjectMap<Pair<dsb, enu>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (je $$7 : je.c.a) {
         iz $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dsb, enu> $$10 = (Pair<dsb, enu>)$$5.computeIfAbsent($$9, $$2x -> {
            dsb $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dsb $$11 = (dsb)$$10.getFirst();
         enu $$12 = (enu)$$10.getSecond();
         enu $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            iz $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dsb $$5x = $$0.a_($$14);
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

   private boolean a(dbd $$0, iz $$1, dsb $$2, ent $$3) {
      dey $$4 = $$2.b();
      if ($$4 instanceof djp $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dhe || $$2.a(awo.ax) || $$2.a(dfa.cO) || $$2.a(dfa.dS) || $$2.a(dfa.nd)) {
         return false;
      } else {
         return !$$2.a(dfa.ed) && !$$2.a(dfa.fx) && !$$2.a(dfa.kF) && !$$2.a(dfa.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(dbd $$0, iz $$1, dsb $$2, je $$3, iz $$4, dsb $$5, enu $$6, ent $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dca var1);

   protected int a(dbx $$0, iz $$1, enu $$2, enu $$3) {
      return this.a((dca)$$0);
   }

   @Override
   public void b(dbx $$0, iz $$1, enu $$2) {
      if (!$$2.b()) {
         enu $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dfa.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dsb $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(enu $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(enu $$0, dbd $$1, iz $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(enu $$0, dbd $$1, iz $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(enu $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(enu var1);

   @Override
   public ewj b(enu $$0, dbd $$1, iz $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ewg.b() : this.g.computeIfAbsent($$0, $$2x -> ewg.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
