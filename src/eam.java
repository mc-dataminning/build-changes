import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eam extends ean {
   public static final dgc a = dgb.i;
   public static final dgl b = dgb.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csx.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csx.a> $$0 = new Object2ByteLinkedOpenHashMap<csx.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eao, eii> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dfm.a<ean, eao> $$0) {
      $$0.a(a);
   }

   @Override
   public ehp a(cpd $$0, gw $$1, eao $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      gw.a $$5 = new gw.a();

      for (hc $$6 : hc.c.a) {
         $$5.a($$1, $$6);
         eao $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  gw $$10 = $$5.d();
                  eao $$11 = $$0.b_($$10);
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

      ehp $$12 = new ehp($$3, 0.0, $$4);
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

   private boolean g(eao $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cpd $$0, gw $$1, hc $$2) {
      dfl $$3 = $$0.a_($$1);
      eao $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == hc.b) {
         return true;
      } else {
         return $$3.b() instanceof cws ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cpx $$0, gw $$1, eao $$2) {
      if (!$$2.c()) {
         dfl $$3 = $$0.a_($$1);
         gw $$4 = $$1.d();
         dfl $$5 = $$0.a_($$4);
         eao $$6 = this.a($$0, $$4, $$5);
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

   private void a(cpx $$0, gw $$1, eao $$2, dfl $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<hc, eao> $$5 = this.b($$0, $$1, $$3);

         for (Entry<hc, eao> $$6 : $$5.entrySet()) {
            hc $$7 = $$6.getKey();
            eao $$8 = $$6.getValue();
            gw $$9 = $$1.a($$7);
            dfl $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eao a(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (hc $$5 : hc.c.a) {
         gw $$6 = $$1.a($$5);
         dfl $$7 = $$0.a_($$6);
         eao $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dfl $$9 = $$0.a_($$1.d());
         eao $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      gw $$11 = $$1.c();
      dfl $$12 = $$0.a_($$11);
      eao $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(hc.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eap.a.g() : this.a($$14, false);
      }
   }

   private boolean a(hc $$0, cpd $$1, gw $$2, dfl $$3, gw $$4, dfl $$5) {
      Object2ByteLinkedOpenHashMap<csx.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      csx.a $$8;
      if ($$7 != null) {
         $$8 = new csx.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      eii $$11 = $$3.k($$1, $$2);
      eii $$12 = $$5.k($$1, $$4);
      boolean $$13 = !eif.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract ean d();

   public eao a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract ean e();

   public eao a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cpx var1);

   protected void a(cpy $$0, gw $$1, dfl $$2, hc $$3, eao $$4) {
      if ($$2.b() instanceof cxl) {
         ((cxl)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cpy var1, gw var2, dfl var3);

   private static short a(gw $$0, gw $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cqa $$0, gw $$1, int $$2, hc $$3, dfl $$4, gw $$5, Short2ObjectMap<Pair<dfl, eao>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (hc $$9 : hc.c.a) {
         if ($$9 != $$3) {
            gw $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dfl, eao> $$12 = (Pair<dfl, eao>)$$6.computeIfAbsent($$11, $$2x -> {
               dfl $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dfl $$13 = (dfl)$$12.getFirst();
            eao $$14 = (eao)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  gw $$4x = $$10.d();
                  dfl $$5x = $$0.a_($$4x);
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

   private boolean a(cpd $$0, ean $$1, gw $$2, dfl $$3, gw $$4, dfl $$5) {
      if (!this.a(hc.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cpd $$0, ean $$1, gw $$2, dfl $$3, hc $$4, gw $$5, dfl $$6, eao $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eao $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cqa var1);

   private int a(cqa $$0, gw $$1) {
      int $$2 = 0;

      for (hc $$3 : hc.c.a) {
         gw $$4 = $$1.a($$3);
         eao $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<hc, eao> b(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = 1000;
      Map<hc, eao> $$4 = Maps.newEnumMap(hc.class);
      Short2ObjectMap<Pair<dfl, eao>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (hc $$7 : hc.c.a) {
         gw $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dfl, eao> $$10 = (Pair<dfl, eao>)$$5.computeIfAbsent($$9, $$2x -> {
            dfl $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dfl $$11 = (dfl)$$10.getFirst();
         eao $$12 = (eao)$$10.getSecond();
         eao $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            gw $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dfl $$5x = $$0.a_($$14);
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

   private boolean a(cpd $$0, gw $$1, dfl $$2, ean $$3) {
      csx $$4 = $$2.b();
      if ($$4 instanceof cxl $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cuz || $$2.a(apu.aw) || $$2.a(csy.cO) || $$2.a(csy.dS) || $$2.a(csy.nd)) {
         return false;
      } else {
         return !$$2.a(csy.ee) && !$$2.a(csy.fx) && !$$2.a(csy.kF) && !$$2.a(csy.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cpd $$0, gw $$1, dfl $$2, hc $$3, gw $$4, dfl $$5, eao $$6, ean $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cqa var1);

   protected int a(cpx $$0, gw $$1, eao $$2, eao $$3) {
      return this.a((cqa)$$0);
   }

   @Override
   public void b(cpx $$0, gw $$1, eao $$2) {
      if (!$$2.b()) {
         eao $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, csy.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dfl $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eao $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eao $$0, cpd $$1, gw $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eao $$0, cpd $$1, gw $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eao $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eao var1);

   @Override
   public eii b(eao $$0, cpd $$1, gw $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eif.b() : this.g.computeIfAbsent($$0, $$2x -> eif.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
