import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eex extends eey {
   public static final dkg a = dkf.i;
   public static final dkp b = dkf.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cwy.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cwy.a> $$0 = new Object2ByteLinkedOpenHashMap<cwy.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eez, emv> g = Maps.newIdentityHashMap();

   @Override
   protected void a(djq.a<eey, eez> $$0) {
      $$0.a(a);
   }

   @Override
   public emc a(ctd $$0, hx $$1, eez $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      hx.a $$5 = new hx.a();

      for (ic $$6 : ic.c.a) {
         $$5.a($$1, $$6);
         eez $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  hx $$10 = $$5.d();
                  eez $$11 = $$0.b_($$10);
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

      emc $$12 = new emc($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ic $$13 : ic.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eez $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(ctd $$0, hx $$1, ic $$2) {
      djp $$3 = $$0.a_($$1);
      eez $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ic.b) {
         return true;
      } else {
         return $$3.b() instanceof dav ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(ctx $$0, hx $$1, eez $$2) {
      if (!$$2.c()) {
         djp $$3 = $$0.a_($$1);
         hx $$4 = $$1.d();
         djp $$5 = $$0.a_($$4);
         eez $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ic.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ic.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(ctx $$0, hx $$1, eez $$2, djp $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ic, eez> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ic, eez> $$6 : $$5.entrySet()) {
            ic $$7 = $$6.getKey();
            eez $$8 = $$6.getValue();
            hx $$9 = $$1.a($$7);
            djp $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eez a(ctx $$0, hx $$1, djp $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ic $$5 : ic.c.a) {
         hx $$6 = $$1.a($$5);
         djp $$7 = $$0.a_($$6);
         eez $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         djp $$9 = $$0.a_($$1.d());
         eez $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      hx $$11 = $$1.c();
      djp $$12 = $$0.a_($$11);
      eez $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ic.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? efa.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ic $$0, ctd $$1, hx $$2, djp $$3, hx $$4, djp $$5) {
      Object2ByteLinkedOpenHashMap<cwy.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      cwy.a $$8;
      if ($$7 != null) {
         $$8 = new cwy.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      emv $$11 = $$3.k($$1, $$2);
      emv $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ems.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eey d();

   public eez a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eey e();

   public eez a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(ctx var1);

   protected void a(cty $$0, hx $$1, djp $$2, ic $$3, eez $$4) {
      if ($$2.b() instanceof dbo) {
         ((dbo)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cty var1, hx var2, djp var3);

   private static short a(hx $$0, hx $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cua $$0, hx $$1, int $$2, ic $$3, djp $$4, hx $$5, Short2ObjectMap<Pair<djp, eez>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ic $$9 : ic.c.a) {
         if ($$9 != $$3) {
            hx $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<djp, eez> $$12 = (Pair<djp, eez>)$$6.computeIfAbsent($$11, $$2x -> {
               djp $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            djp $$13 = (djp)$$12.getFirst();
            eez $$14 = (eez)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  hx $$4x = $$10.d();
                  djp $$5x = $$0.a_($$4x);
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

   private boolean a(ctd $$0, eey $$1, hx $$2, djp $$3, hx $$4, djp $$5) {
      if (!this.a(ic.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(ctd $$0, eey $$1, hx $$2, djp $$3, ic $$4, hx $$5, djp $$6, eez $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eez $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cua var1);

   private int a(cua $$0, hx $$1) {
      int $$2 = 0;

      for (ic $$3 : ic.c.a) {
         hx $$4 = $$1.a($$3);
         eez $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ic, eez> b(ctx $$0, hx $$1, djp $$2) {
      int $$3 = 1000;
      Map<ic, eez> $$4 = Maps.newEnumMap(ic.class);
      Short2ObjectMap<Pair<djp, eez>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ic $$7 : ic.c.a) {
         hx $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<djp, eez> $$10 = (Pair<djp, eez>)$$5.computeIfAbsent($$9, $$2x -> {
            djp $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         djp $$11 = (djp)$$10.getFirst();
         eez $$12 = (eez)$$10.getSecond();
         eez $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            hx $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               djp $$5x = $$0.a_($$14);
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

   private boolean a(ctd $$0, hx $$1, djp $$2, eey $$3) {
      cwy $$4 = $$2.b();
      if ($$4 instanceof dbo $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cze || $$2.a(asi.aw) || $$2.a(cxa.cO) || $$2.a(cxa.dS) || $$2.a(cxa.nd)) {
         return false;
      } else {
         return !$$2.a(cxa.ed) && !$$2.a(cxa.fx) && !$$2.a(cxa.kF) && !$$2.a(cxa.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(ctd $$0, hx $$1, djp $$2, ic $$3, hx $$4, djp $$5, eez $$6, eey $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cua var1);

   protected int a(ctx $$0, hx $$1, eez $$2, eez $$3) {
      return this.a((cua)$$0);
   }

   @Override
   public void b(ctx $$0, hx $$1, eez $$2) {
      if (!$$2.b()) {
         eez $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, cxa.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            djp $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eez $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eez $$0, ctd $$1, hx $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eez $$0, ctd $$1, hx $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eez $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eez var1);

   @Override
   public emv b(eez $$0, ctd $$1, hx $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ems.b() : this.g.computeIfAbsent($$0, $$2x -> ems.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
