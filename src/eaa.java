import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eaa extends eab {
   public static final dfq a = dfp.i;
   public static final dfz b = dfp.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csl.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csl.a> $$0 = new Object2ByteLinkedOpenHashMap<csl.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eac, ehw> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dfa.a<eab, eac> $$0) {
      $$0.a(a);
   }

   @Override
   public ehd a(cor $$0, gu $$1, eac $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      gu.a $$5 = new gu.a();

      for (ha $$6 : ha.c.a) {
         $$5.a($$1, $$6);
         eac $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  gu $$10 = $$5.d();
                  eac $$11 = $$0.b_($$10);
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

      ehd $$12 = new ehd($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ha $$13 : ha.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eac $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cor $$0, gu $$1, ha $$2) {
      dez $$3 = $$0.a_($$1);
      eac $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ha.b) {
         return true;
      } else {
         return $$3.b() instanceof cwg ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cpl $$0, gu $$1, eac $$2) {
      if (!$$2.c()) {
         dez $$3 = $$0.a_($$1);
         gu $$4 = $$1.d();
         dez $$5 = $$0.a_($$4);
         eac $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ha.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ha.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cpl $$0, gu $$1, eac $$2, dez $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ha, eac> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ha, eac> $$6 : $$5.entrySet()) {
            ha $$7 = $$6.getKey();
            eac $$8 = $$6.getValue();
            gu $$9 = $$1.a($$7);
            dez $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eac a(cpl $$0, gu $$1, dez $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ha $$5 : ha.c.a) {
         gu $$6 = $$1.a($$5);
         dez $$7 = $$0.a_($$6);
         eac $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dez $$9 = $$0.a_($$1.d());
         eac $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      gu $$11 = $$1.c();
      dez $$12 = $$0.a_($$11);
      eac $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ha.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? ead.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ha $$0, cor $$1, gu $$2, dez $$3, gu $$4, dez $$5) {
      Object2ByteLinkedOpenHashMap<csl.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      csl.a $$8;
      if ($$7 != null) {
         $$8 = new csl.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ehw $$11 = $$3.k($$1, $$2);
      ehw $$12 = $$5.k($$1, $$4);
      boolean $$13 = !eht.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eab d();

   public eac a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eab e();

   public eac a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cpl var1);

   protected void a(cpm $$0, gu $$1, dez $$2, ha $$3, eac $$4) {
      if ($$2.b() instanceof cwz) {
         ((cwz)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cpm var1, gu var2, dez var3);

   private static short a(gu $$0, gu $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cpo $$0, gu $$1, int $$2, ha $$3, dez $$4, gu $$5, Short2ObjectMap<Pair<dez, eac>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ha $$9 : ha.c.a) {
         if ($$9 != $$3) {
            gu $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dez, eac> $$12 = (Pair<dez, eac>)$$6.computeIfAbsent($$11, $$2x -> {
               dez $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dez $$13 = (dez)$$12.getFirst();
            eac $$14 = (eac)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  gu $$4x = $$10.d();
                  dez $$5x = $$0.a_($$4x);
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

   private boolean a(cor $$0, eab $$1, gu $$2, dez $$3, gu $$4, dez $$5) {
      if (!this.a(ha.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cor $$0, eab $$1, gu $$2, dez $$3, ha $$4, gu $$5, dez $$6, eac $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eac $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cpo var1);

   private int a(cpo $$0, gu $$1) {
      int $$2 = 0;

      for (ha $$3 : ha.c.a) {
         gu $$4 = $$1.a($$3);
         eac $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ha, eac> b(cpl $$0, gu $$1, dez $$2) {
      int $$3 = 1000;
      Map<ha, eac> $$4 = Maps.newEnumMap(ha.class);
      Short2ObjectMap<Pair<dez, eac>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ha $$7 : ha.c.a) {
         gu $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dez, eac> $$10 = (Pair<dez, eac>)$$5.computeIfAbsent($$9, $$2x -> {
            dez $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dez $$11 = (dez)$$10.getFirst();
         eac $$12 = (eac)$$10.getSecond();
         eac $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            gu $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dez $$5x = $$0.a_($$14);
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

   private boolean a(cor $$0, gu $$1, dez $$2, eab $$3) {
      csl $$4 = $$2.b();
      if ($$4 instanceof cwz $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cun || $$2.a(apl.aw) || $$2.a(csm.cO) || $$2.a(csm.dS) || $$2.a(csm.nd)) {
         return false;
      } else {
         return !$$2.a(csm.ee) && !$$2.a(csm.fx) && !$$2.a(csm.kF) && !$$2.a(csm.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cor $$0, gu $$1, dez $$2, ha $$3, gu $$4, dez $$5, eac $$6, eab $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cpo var1);

   protected int a(cpl $$0, gu $$1, eac $$2, eac $$3) {
      return this.a((cpo)$$0);
   }

   @Override
   public void b(cpl $$0, gu $$1, eac $$2) {
      if (!$$2.b()) {
         eac $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, csm.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dez $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eac $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eac $$0, cor $$1, gu $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eac $$0, cor $$1, gu $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eac $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eac var1);

   @Override
   public ehw b(eac $$0, cor $$1, gu $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eht.b() : this.g.computeIfAbsent($$0, $$2x -> eht.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
